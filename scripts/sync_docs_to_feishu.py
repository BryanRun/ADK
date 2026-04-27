#!/usr/bin/env python3
"""将本地文档变更同步到对应飞书 wiki 文档（块级更新，不清空原文）。

两类操作：
1. 文本搜索替换 — 在所有 text/heading/code 块中查找旧文本并替换
2. 版本历史插入 — 在版本历史表格中插入缺失的版本条目

用法:
    PYTHONPATH=. python3 scripts/sync_docs_to_feishu.py [--dry-run]
"""

from __future__ import annotations

import argparse
import sys
import time
from pathlib import Path
from typing import Optional

import requests

ROOT = Path(__file__).resolve().parent.parent
sys.path.insert(0, str(ROOT))

from autodrivekit.feishu_auth import BASE, get_tenant_access_token
from autodrivekit.feishu_drive import _wiki_get_node

_last_call = 0.0


def _rate_limit():
    global _last_call
    now = time.time()
    if (gap := now - _last_call) < 0.4:
        time.sleep(0.4 - gap)
    _last_call = time.time()


def _headers(token: str) -> dict:
    return {"Authorization": f"Bearer {token}", "Content-Type": "application/json"}


def _api(method: str, token: str, url: str, body: dict | None = None,
         params: dict | None = None) -> dict | None:
    _rate_limit()
    fn = {"GET": requests.get, "PATCH": requests.patch, "POST": requests.post}[method]
    kwargs: dict = {"headers": _headers(token), "timeout": 60}
    if body:
        kwargs["json"] = body
    if params:
        kwargs["params"] = params
    r = fn(url, **kwargs)
    if r.status_code != 200:
        print(f"  ✘ {method} {url.split('/')[-1]} → HTTP {r.status_code}")
        return None
    data = r.json()
    if data.get("code") != 0:
        print(f"  ✘ {method} → code={data.get('code')} msg={data.get('msg')}")
        return None
    return data.get("data", {})


# ---------------------------------------------------------------------------
# Feishu docx block helpers
# ---------------------------------------------------------------------------

def _resolve_doc_id(token: str, node_token: str) -> Optional[str]:
    node = _wiki_get_node(token, node_token)
    if not node:
        print(f"  ✘ 无法解析 wiki 节点 {node_token}")
        return None
    if str(node.get("obj_type")) != "docx":
        print(f"  ✘ 节点类型为 {node.get('obj_type')}，非 docx")
        return None
    return str(node.get("obj_token", ""))


def _list_blocks(token: str, doc_id: str) -> list[dict]:
    blocks: list[dict] = []
    pt = None
    while True:
        p: dict = {"page_size": 500, "document_revision_id": -1}
        if pt:
            p["page_token"] = pt
        data = _api("GET", token, f"{BASE}/docx/v1/documents/{doc_id}/blocks", params=p)
        if not data:
            break
        blocks.extend(data.get("items", []))
        if not data.get("has_more"):
            break
        pt = data.get("page_token")
    return blocks


def _get_block(token: str, doc_id: str, bid: str) -> dict | None:
    data = _api("GET", token, f"{BASE}/docx/v1/documents/{doc_id}/blocks/{bid}")
    return data.get("block", {}) if data else None


def _get_children(token: str, doc_id: str, bid: str) -> list[dict]:
    children: list[dict] = []
    pt = None
    while True:
        p: dict = {"page_size": 500, "document_revision_id": -1}
        if pt:
            p["page_token"] = pt
        data = _api("GET", token,
                     f"{BASE}/docx/v1/documents/{doc_id}/blocks/{bid}/children", params=p)
        if not data:
            break
        children.extend(data.get("items", []))
        if not data.get("has_more"):
            break
        pt = data.get("page_token")
    return children


# ---------------------------------------------------------------------------
# Text element helpers
# ---------------------------------------------------------------------------

def _get_elements(block: dict) -> list[dict]:
    bt = block.get("block_type", 0)
    if bt == 2:
        return block.get("text", {}).get("elements", [])
    if 3 <= bt <= 11:
        return block.get(f"heading{bt - 2}", {}).get("elements", [])
    if bt == 14:
        return block.get("code", {}).get("elements", [])
    return []


def _full_text(block: dict) -> str:
    return "".join(
        el.get("text_run", {}).get("content", "") for el in _get_elements(block)
    )


def _clean_el(el: dict) -> dict:
    if "text_run" in el:
        tr = el["text_run"]
        out: dict = {"text_run": {"content": tr.get("content", "")}}
        if tr.get("text_element_style"):
            out["text_run"]["text_element_style"] = tr["text_element_style"]
        return out
    return el


def _apply_replacements(elements: list[dict],
                        replacements: list[tuple[str, str]]) -> tuple[list[dict], bool]:
    changed = False
    out = []
    for el in elements:
        nel = dict(el)
        if "text_run" in nel:
            c = nel["text_run"]["content"]
            for old, new in replacements:
                if old in c:
                    c = c.replace(old, new)
                    changed = True
            nel = dict(el)
            nel["text_run"] = dict(el["text_run"])
            nel["text_run"]["content"] = c
        out.append(_clean_el(nel))
    return out, changed


def _update_elements(token: str, doc_id: str, bid: str, elements: list[dict]) -> bool:
    body = {"update_text_elements": {"elements": elements}}
    return _api("PATCH", token,
                f"{BASE}/docx/v1/documents/{doc_id}/blocks/{bid}", body) is not None


# ---------------------------------------------------------------------------
# Text replacement
# ---------------------------------------------------------------------------

def replace_text(token: str, doc_id: str,
                 replacements: list[tuple[str, str]], *, dry_run: bool) -> int:
    blocks = _list_blocks(token, doc_id)
    count = 0
    for block in blocks:
        elements = _get_elements(block)
        if not elements:
            continue
        ft = _full_text(block)
        if not any(old in ft for old, _ in replacements):
            continue
        new_els, changed = _apply_replacements(elements, replacements)
        if not changed:
            continue
        bid = block["block_id"]
        preview = ft[:60].replace("\n", "\\n")
        if dry_run:
            new_ft = "".join(e.get("text_run", {}).get("content", "") for e in new_els)
            new_preview = new_ft[:60].replace("\n", "\\n")
            print(f"  [dry-run] block {bid}:")
            print(f"    旧: {preview}...")
            print(f"    新: {new_preview}...")
        else:
            if _update_elements(token, doc_id, bid, new_els):
                print(f"  ✓ block {bid}: {preview}...")
                count += 1
            else:
                print(f"  ✘ 失败 block {bid}")
    return count


# ---------------------------------------------------------------------------
# Version history table
# ---------------------------------------------------------------------------

def _find_version_table(blocks: list[dict]) -> Optional[str]:
    found = False
    for b in blocks:
        bt = b.get("block_type", 0)
        if 3 <= bt <= 11 and "版本历史" in _full_text(b):
            found = True
            continue
        if found and bt == 31:
            return b.get("block_id", "")
    return None


def _table_versions(token: str, doc_id: str, tid: str) -> list[str]:
    tb = _get_block(token, doc_id, tid)
    if not tb:
        return []
    cs = tb.get("table", {}).get("property", {}).get("column_size", 3)
    children = tb.get("children", [])
    versions = []
    for i in range(cs, len(children), cs):
        cch = _get_children(token, doc_id, children[i])
        for child in cch:
            t = _full_text(child).strip()
            if t:
                versions.append(t)
                break
    return versions


def _fill_cell(token: str, doc_id: str, cell_id: str, elements: list[dict]) -> bool:
    children = _get_children(token, doc_id, cell_id)
    if children:
        return _update_elements(token, doc_id, children[0]["block_id"], elements)
    body = {"children": [{"block_type": 2, "text": {"elements": elements}}]}
    return _api("POST", token,
                f"{BASE}/docx/v1/documents/{doc_id}/blocks/{cell_id}/children",
                body) is not None


def insert_versions(token: str, doc_id: str,
                    entries: list[tuple[str, str, str]], *, dry_run: bool) -> None:
    blocks = _list_blocks(token, doc_id)
    tid = _find_version_table(blocks)
    if not tid:
        print("  ✘ 未找到版本历史表格")
        return
    existing = _table_versions(token, doc_id, tid)
    print(f"  飞书已有版本: {existing[:5]}")

    for ver, date, summary in entries:
        if ver in existing:
            print(f"  跳过: {ver} 已存在")
            continue
        if dry_run:
            print(f"  [dry-run] 插入 {ver} | {date} | {summary[:50]}...")
            continue

        print(f"  插入 {ver}...")
        r = _api("PATCH", token,
                 f"{BASE}/docx/v1/documents/{doc_id}/blocks/{tid}",
                 {"insert_table_row": {"row_index": 1}})
        if not r:
            print(f"  ✘ 插入行失败")
            continue

        tb = _get_block(token, doc_id, tid)
        if not tb:
            continue
        cs = tb.get("table", {}).get("property", {}).get("column_size", 3)
        cells = tb.get("children", [])[cs: cs + cs]
        if len(cells) < 3:
            print(f"  ✘ 单元格不足")
            continue

        _fill_cell(token, doc_id, cells[0], [
            {"text_run": {"content": ver, "text_element_style": {"bold": True}}}
        ])
        _fill_cell(token, doc_id, cells[1], [
            {"text_run": {"content": date}}
        ])
        _fill_cell(token, doc_id, cells[2], [
            {"text_run": {"content": summary}}
        ])
        print(f"  ✓ 已插入 {ver}")


# ===================================================================
# 文档定义
# ===================================================================

CFGWORD_NODE = "Ep7hweak8ivB06kH1kyclNpinVf"
ADK_NODE = "XpMxwP6iZi0T1fkW4P7cRFp7nXe"

CFGWORD_REPLACEMENTS: list[tuple[str, str]] = [
    ("Property 表增量更新、",
     "Property 表全量覆盖写入、"),
    ("自动增量更新 psis.car_cfg 子表，并在 changeHistory 记录变更",
     "自动全量覆盖写入 psis.car_cfg 子表（行序与中间表一致），并在 changeHistory 记录变更"),
    ("自动校验 bit 之和、字节覆盖范围、缺失字节检测",
     "自动校验 bit 之和、字节覆盖范围、缺失字节检测、英文宏名唯一性"),
    ("增量更新飞书 psis.car_cfg 子表（弱依赖，失败不阻断）",
     "全量覆盖写入飞书 psis.car_cfg 子表，行序与中间表一致，自动清理孤立行（弱依赖，失败不阻断）"),
    ("飞书 psis.car_cfg 增量更新",
     "飞书 psis.car_cfg 全量覆盖写入"),
    ("BYTE 内 bit 之和为 8；字节覆盖 0~N-1 完整性",
     "BYTE 内 bit 之和为 8；字节覆盖 0~N-1 完整性；英文宏名唯一性"),
    ("增量更新飞书 psis.car_cfg 子表；有变更时自动在 changeHistory 子表追加记录",
     "全量覆盖写入飞书 psis.car_cfg 子表（行序与中间表一致，自动清理孤立行）；有变更时自动在 changeHistory 子表追加记录"),
]

ADK_REPLACEMENTS: list[tuple[str, str]] = [
    ("parse → sync → validate → property-sync → generate → deploy",
     "parse → sync → snapshot → validate → property-sync → generate → deploy"),
    ("增量更新飞书 psis.car_cfg 子表",
     "全量覆盖写入飞书 psis.car_cfg 子表"),
    ("字节覆盖完整性）",
     "字节覆盖完整性、宏名唯一性）"),
    ("Property 表增量更新、",
     "Property 表全量覆盖写入（行序与中间表一致、自动清理孤立行）、"),
    ("中文→英文宏名映射",
     "解析器直接提取英文宏名并标准化"),
]

# 版本条目（从旧到新；插入时 oldest-first 使 newest 留在表格最上方）
CFGWORD_VERSIONS: list[tuple[str, str, str]] = [
    ("1.2.0", "2026/4/26",
     "1. parse 阶段缺少映射时自动从飞书拉取，无需手动 init-mapping\n"
     "2. 修复 Excel 换行符导致配置项名称与映射表不匹配（中英文间换行→空格归一化）\n"
     "3. 修复飞书同步清背景色时行范围超出网格限制\n"
     "4. property-sync changeHistory 子表名匹配改为忽略大小写\n"
     "5. property-sync changeHistory 日期列改为日期格式写入、变更单元格自动高亮\n"
     "6. 获取飞书应用名失败降级为提示，不阻断 property-sync"),
    ("1.3.0", "2026/4/27",
     "1. t1v 解析器重构：去除 MAX_VEHICLE_BYTE 截断，全量解析 Excel 配置项\n"
     "2. 解析器直接从 Excel EN 列提取英文宏名并标准化（大写、下划线替换、数字开头加 N_ 前缀、"
     "VEHICLE_TYPE 自动追加 _MODE）\n"
     "3. 支持 - 分隔的字节和位范围（如 79-87、0-7）\n"
     "4. E 列改为 col 9 + col 13（值描述）换行拼接，值描述改为从 col 13 获取\n"
     "5. property-sync 改为全量覆盖写入，行序与中间表格一致，自动清理孤立行\n"
     "6. property-sync 宏名从中间表格 D 列获取，确保两表宏名一致\n"
     "7. validate 新增英文宏名唯一性校验\n"
     "8. 飞书设置背景色改为分批请求（每批 100 个 range），避免大量单元格时超时\n"
     "9. changeHistory D 列自动换行"),
]

ADK_VERSIONS: list[tuple[str, str, str]] = [
    ("1.2.6", "2026/4/26",
     "1. cfg-word 升至 v1.2.0：parse 阶段缺少映射时自动从飞书拉取\n"
     "2. 修复 Excel 换行符导致配置项名称与映射表不匹配\n"
     "3. 修复飞书同步清背景色行范围超出网格限制\n"
     "4. property-sync changeHistory 子表名匹配忽略大小写、日期列改为日期格式写入、变更单元格高亮\n"
     "5. 获取飞书应用名失败降级为提示"),
    ("1.2.7", "2026/4/27",
     "1. cfg-word 升至 v1.3.0：t1v 解析器重构——去除 MAX_VEHICLE_BYTE 截断、"
     "解析器直接提取英文宏名并标准化（大写/下划线/数字前缀）、支持 - 分隔的字节和位范围、"
     "值描述改为 col 13、E 列改为 col 9 + col 13 拼接\n"
     "2. property-sync 改为全量覆盖写入（行序与中间表一致、自动清理孤立行）；"
     "宏名从中间表 D 列获取确保两表一致\n"
     "3. validate 新增宏名唯一性校验\n"
     "4. 飞书设置背景色改为分批请求避免超时"),
]


def main() -> None:
    ap = argparse.ArgumentParser(description=__doc__)
    ap.add_argument("--dry-run", action="store_true", help="仅预览，不实际写入飞书")
    args = ap.parse_args()

    token = get_tenant_access_token()
    if not token:
        sys.exit("请设置 FEISHU_APP_ID 与 FEISHU_APP_SECRET")

    for name, node, repls, vers in [
        ("cfg-word使用手册", CFGWORD_NODE, CFGWORD_REPLACEMENTS, CFGWORD_VERSIONS),
        ("ADK平台使用手册", ADK_NODE, ADK_REPLACEMENTS, ADK_VERSIONS),
    ]:
        print(f"\n{'=' * 60}")
        print(f"文档: {name}")
        print(f"{'=' * 60}")

        doc_id = _resolve_doc_id(token, node)
        if not doc_id:
            continue

        print("\n[文本替换]")
        n = replace_text(token, doc_id, repls, dry_run=args.dry_run)
        print(f"  共 {'预览' if args.dry_run else '更新'} {n} 个块")

        print("\n[版本历史]")
        insert_versions(token, doc_id, vers, dry_run=args.dry_run)

    print("\n完成。")


if __name__ == "__main__":
    main()
