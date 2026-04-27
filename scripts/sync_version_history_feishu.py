#!/usr/bin/env python3
"""同步本地 Markdown 使用手册的「版本历史」到对应飞书文档。

通过 docx/v1 block API 局部更新飞书文档中的版本历史表格，
在表格第一行（表头后）插入新版本条目，不影响文档其余内容。

依赖环境变量：FEISHU_APP_ID、FEISHU_APP_SECRET

用法:
    PYTHONPATH=. python3 scripts/sync_version_history_feishu.py [--dry-run]
"""

from __future__ import annotations

import argparse
import re
import sys
import time
from dataclasses import dataclass
from pathlib import Path
from typing import Optional

import requests

ROOT = Path(__file__).resolve().parent.parent
sys.path.insert(0, str(ROOT))

from autodrivekit.feishu_auth import BASE, get_tenant_access_token
from autodrivekit.feishu_drive import _wiki_get_node

MANUALS = [
    ("docs/ADK平台使用手册.md", "XpMxwP6iZi0T1fkW4P7cRFp7nXe"),
    ("docs/vhal-svc使用手册.md", "JhuNwjCc8iLMVhkxjPecJdYVnte"),
    ("docs/cfg-word使用手册.md", "Ep7hweak8ivB06kH1kyclNpinVf"),
    ("docs/property使用手册.md", "TRyNwma3hiZsmXkGOiLcNqmgn9d"),
]

_last_call = 0.0


def _rate_limit():
    global _last_call
    now = time.time()
    gap = now - _last_call
    if gap < 0.4:
        time.sleep(0.4 - gap)
    _last_call = time.time()


def _headers(token: str) -> dict:
    return {"Authorization": f"Bearer {token}", "Content-Type": "application/json"}


# ---------------------------------------------------------------------------
# Markdown parsing
# ---------------------------------------------------------------------------

@dataclass
class VersionEntry:
    version: str
    date: str
    summary: str


def _parse_latest_version(md_path: Path) -> Optional[VersionEntry]:
    text = md_path.read_text(encoding="utf-8")
    lines = text.splitlines()

    in_table = False
    header_seen = False
    for line in lines:
        if re.match(r"^##\s+\d+\.\s*版本历史", line):
            in_table = True
            continue
        if not in_table:
            continue
        stripped = line.strip()
        if stripped.startswith("| 版本"):
            header_seen = True
            continue
        if stripped.startswith("|---"):
            continue
        if header_seen and stripped.startswith("|"):
            parts = stripped.split("|")
            parts = [p.strip() for p in parts if p.strip()]
            if len(parts) < 3:
                continue
            version = parts[0].replace("**", "").strip()
            date = parts[1].strip()
            summary = "|".join(parts[2:]).strip()
            return VersionEntry(version=version, date=date, summary=summary)
    return None


def _strip_md_formatting(text: str) -> str:
    text = text.replace("<br>", "\n")
    text = text.replace("**", "")
    text = text.replace("`", "")
    return text.strip()


# ---------------------------------------------------------------------------
# Feishu docx API helpers
# ---------------------------------------------------------------------------

def _api_get(token: str, url: str, params: dict | None = None) -> dict | None:
    _rate_limit()
    r = requests.get(url, headers=_headers(token), params=params, timeout=60)
    if r.status_code != 200:
        print(f"  ✘ GET {url} → HTTP {r.status_code}")
        return None
    data = r.json()
    if data.get("code") != 0:
        print(f"  ✘ GET {url} → code={data.get('code')} msg={data.get('msg')}")
        return None
    return data.get("data", {})


def _api_patch(token: str, url: str, body: dict) -> dict | None:
    _rate_limit()
    r = requests.patch(url, headers=_headers(token), json=body, timeout=60)
    if r.status_code != 200:
        print(f"  ✘ PATCH {url} → HTTP {r.status_code}")
        return None
    data = r.json()
    if data.get("code") != 0:
        print(f"  ✘ PATCH {url} → code={data.get('code')} msg={data.get('msg')}")
        return None
    return data.get("data", {})


def _api_post(token: str, url: str, body: dict) -> dict | None:
    _rate_limit()
    r = requests.post(url, headers=_headers(token), json=body, timeout=60)
    if r.status_code != 200:
        print(f"  ✘ POST {url} → HTTP {r.status_code}")
        return None
    data = r.json()
    if data.get("code") != 0:
        print(f"  ✘ POST {url} → code={data.get('code')} msg={data.get('msg')}")
        return None
    return data.get("data", {})


def _resolve_document_id(token: str, node_token: str) -> Optional[str]:
    node = _wiki_get_node(token, node_token)
    if not node:
        print(f"  ✘ 无法解析 wiki 节点 {node_token}")
        return None
    obj_type = str(node.get("obj_type", ""))
    if obj_type != "docx":
        print(f"  ✘ 节点类型为 {obj_type}，非 docx")
        return None
    return str(node.get("obj_token", ""))


def _list_all_blocks(token: str, document_id: str) -> list[dict]:
    blocks: list[dict] = []
    page_token = None
    while True:
        params: dict = {"page_size": 500, "document_revision_id": -1}
        if page_token:
            params["page_token"] = page_token
        data = _api_get(token, f"{BASE}/docx/v1/documents/{document_id}/blocks", params)
        if not data:
            break
        items = data.get("items", [])
        blocks.extend(items)
        if not data.get("has_more"):
            break
        page_token = data.get("page_token")
    return blocks


def _get_block(token: str, document_id: str, block_id: str) -> dict | None:
    data = _api_get(token, f"{BASE}/docx/v1/documents/{document_id}/blocks/{block_id}")
    if not data:
        return None
    return data.get("block", {})


def _get_block_children(token: str, document_id: str, block_id: str) -> list[dict]:
    children: list[dict] = []
    page_token = None
    while True:
        params: dict = {"page_size": 500, "document_revision_id": -1}
        if page_token:
            params["page_token"] = page_token
        data = _api_get(
            token, f"{BASE}/docx/v1/documents/{document_id}/blocks/{block_id}/children", params
        )
        if not data:
            break
        items = data.get("items", [])
        children.extend(items)
        if not data.get("has_more"):
            break
        page_token = data.get("page_token")
    return children


def _extract_block_text(block: dict) -> str:
    """Extract plain text from a block's text elements."""
    bt = block.get("block_type", 0)
    if 3 <= bt <= 11:
        key = f"heading{bt - 2}"
        text_obj = block.get(key, {})
    else:
        text_obj = block.get("text", {})
    elements = text_obj.get("elements", [])
    parts = []
    for el in elements:
        tr = el.get("text_run", {})
        parts.append(tr.get("content", ""))
    return "".join(parts)


# ---------------------------------------------------------------------------
# Table manipulation
# ---------------------------------------------------------------------------

def _find_version_table(blocks: list[dict]) -> Optional[str]:
    """Find the table block_id right after the '版本历史' heading."""
    found_heading = False
    for block in blocks:
        bt = block.get("block_type", 0)
        if 3 <= bt <= 11:
            txt = _extract_block_text(block)
            if "版本历史" in txt:
                found_heading = True
                continue
        if found_heading and bt == 31:
            return block.get("block_id", "")
    return None


def _get_table_cell_text(token: str, document_id: str, cell_block_id: str) -> str:
    """Read the text content of a table cell."""
    children = _get_block_children(token, document_id, cell_block_id)
    parts = []
    for child in children:
        parts.append(_extract_block_text(child))
    return "".join(parts)


def _insert_table_row(token: str, document_id: str, table_block_id: str, row_index: int) -> bool:
    url = f"{BASE}/docx/v1/documents/{document_id}/blocks/{table_block_id}"
    result = _api_patch(token, url, {"insert_table_row": {"row_index": row_index}})
    return result is not None


def _create_text_in_cell(
    token: str, document_id: str, cell_block_id: str, elements: list[dict]
) -> bool:
    url = f"{BASE}/docx/v1/documents/{document_id}/blocks/{cell_block_id}/children"
    body = {
        "children": [
            {
                "block_type": 2,
                "text": {"elements": elements},
            }
        ],
    }
    result = _api_post(token, url, body)
    return result is not None


def _update_text_in_block(
    token: str, document_id: str, block_id: str, elements: list[dict]
) -> bool:
    url = f"{BASE}/docx/v1/documents/{document_id}/blocks/{block_id}"
    body = {"update_text_elements": {"elements": elements}}
    result = _api_patch(token, url, body)
    return result is not None


def _fill_cell(
    token: str, document_id: str, cell_block_id: str, elements: list[dict]
) -> bool:
    children = _get_block_children(token, document_id, cell_block_id)
    if children:
        child_id = children[0].get("block_id", "")
        return _update_text_in_block(token, document_id, child_id, elements)
    else:
        return _create_text_in_cell(token, document_id, cell_block_id, elements)


# ---------------------------------------------------------------------------
# Orchestration
# ---------------------------------------------------------------------------

def sync_one(token: str, md_path: Path, node_token: str, *, dry_run: bool = False) -> None:
    entry = _parse_latest_version(md_path)
    if not entry:
        print(f"  跳过: {md_path.name} 中未找到版本条目")
        return
    print(f"  本地最新版本: {entry.version} ({entry.date})")

    document_id = _resolve_document_id(token, node_token)
    if not document_id:
        return

    blocks = _list_all_blocks(token, document_id)
    if not blocks:
        print("  ✘ 无法获取文档 block 列表")
        return

    table_block_id = _find_version_table(blocks)
    if not table_block_id:
        print("  ✘ 未找到版本历史表格")
        return

    table_block = _get_block(token, document_id, table_block_id)
    if not table_block:
        print("  ✘ 无法获取表格 block 详情")
        return

    table_prop = table_block.get("table", {}).get("property", {})
    col_size = table_prop.get("column_size", 3)
    children_ids = table_block.get("children", [])

    if len(children_ids) > col_size:
        first_data_cell = children_ids[col_size]
        existing_text = _get_table_cell_text(token, document_id, first_data_cell)
        if entry.version in existing_text:
            print(f"  跳过: 版本 {entry.version} 已存在于飞书文档")
            return

    summary_text = _strip_md_formatting(entry.summary)

    if dry_run:
        print(f"  [dry-run] 将插入: {entry.version} | {entry.date} | {summary_text[:60]}...")
        return

    print(f"  插入新行...")
    if not _insert_table_row(token, document_id, table_block_id, row_index=1):
        print("  ✘ 插入表格行失败")
        return

    table_block = _get_block(token, document_id, table_block_id)
    if not table_block:
        print("  ✘ 刷新表格 block 失败")
        return
    children_ids = table_block.get("children", [])
    new_cells = children_ids[col_size : col_size + col_size]

    if len(new_cells) < 3:
        print(f"  ✘ 新行单元格数量不足 ({len(new_cells)})")
        return

    print(f"  填充版本号...")
    _fill_cell(token, document_id, new_cells[0], [
        {"text_run": {"content": entry.version, "text_element_style": {"bold": True}}}
    ])

    print(f"  填充日期...")
    _fill_cell(token, document_id, new_cells[1], [
        {"text_run": {"content": entry.date}}
    ])

    print(f"  填充变更摘要...")
    _fill_cell(token, document_id, new_cells[2], [
        {"text_run": {"content": summary_text}}
    ])

    print(f"  ✓ 已插入版本 {entry.version}")


def main() -> None:
    ap = argparse.ArgumentParser(description=__doc__)
    ap.add_argument("--dry-run", action="store_true", help="仅预览，不实际写入飞书")
    args = ap.parse_args()

    token = get_tenant_access_token()
    if not token:
        sys.exit("请设置 FEISHU_APP_ID 与 FEISHU_APP_SECRET")

    for md_rel, node_token in MANUALS:
        md_path = ROOT / md_rel
        name = md_path.stem
        print(f"\n{'='*60}")
        print(f"文档: {name}")
        print(f"{'='*60}")
        if not md_path.is_file():
            print(f"  跳过: {md_path} 不存在")
            continue
        sync_one(token, md_path, node_token, dry_run=args.dry_run)

    print("\n完成。")


if __name__ == "__main__":
    main()
