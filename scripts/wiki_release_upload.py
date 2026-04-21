#!/usr/bin/env python3
"""校验知识库 manifest / 安装包两个「文件」节点，并输出飞书网页「上传新版本」操作指引。

飞书开放平台对「知识库中已有文件节点上传新版本」无与网页完全等价的单接口封装；
常见做法是用户在 wiki 文件预览页使用 **上传新版本**。本脚本通过 ``wiki/v2/spaces/get_node``
确认节点存在且 ``obj_type`` 为 ``file``，并打印本地待上传路径与 wiki 链接。

环境变量：``FEISHU_APP_ID``、``FEISHU_APP_SECRET``（与 ``adk`` 其它飞书能力一致）。
"""

from __future__ import annotations

import argparse
import json
import sys
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent
sys.path.insert(0, str(ROOT))

from autodrivekit.config_migrate import (
    DEFAULT_FEISHU_WIKI_ARCHIVE_NODE_TOKEN,
    DEFAULT_FEISHU_WIKI_MANIFEST_NODE_TOKEN,
)
from autodrivekit.feishu_auth import get_tenant_access_token
from autodrivekit.feishu_drive import _wiki_get_node


def _wiki_base() -> str:
    return "https://t83dfrspj4.feishu.cn/wiki"


def _check_manifest_node(tt: str, node_token: str) -> None:
    node = _wiki_get_node(tt, node_token, timeout=60)
    if not node:
        print(f"✘ manifest 节点: 无法解析 {node_token}（权限、token 或 wiki API）")
        raise SystemExit(2)
    ot = str(node.get("obj_type") or "").strip()
    if ot != "file":
        print(
            f"⚠ manifest 节点: obj_type={ot!r}。"
            "``adk update`` 通过 API 拉取 manifest 时仅支持「文件」类节点挂载的 JSON；"
            "若为飞书文档（docx），请将 manifest 存为同知识库下的「文件」节点并更新代码中 "
            "`DEFAULT_FEISHU_WIKI_MANIFEST_NODE_TOKEN`，或使用 `ADK_FEISHU_MANIFEST_FILE_TOKEN` 指向 Drive 上的 manifest 文件。"
        )
    else:
        print(
            f"✓ manifest 节点: node_token={node_token} obj_type=file obj_token=…{str(node.get('obj_token') or '')[-12:]}"
        )


def _check_archive_node(tt: str, node_token: str) -> None:
    node = _wiki_get_node(tt, node_token, timeout=60)
    if not node:
        print(f"✘ 安装包节点: 无法解析 {node_token}（权限、token 或 wiki API）")
        raise SystemExit(2)
    ot = str(node.get("obj_type") or "").strip()
    if ot != "file":
        print(
            f"✘ 安装包节点: obj_type={ot!r}，须为「文件」类型才可绑定 tar.gz / zip"
        )
        raise SystemExit(2)
    print(
        f"✓ 安装包节点: node_token={node_token} obj_type=file obj_token=…{str(node.get('obj_token') or '')[-12:]}"
    )


def main() -> None:
    ap = argparse.ArgumentParser(description=__doc__)
    ap.add_argument(
        "--release-dir",
        type=Path,
        default=ROOT.parent / "adk-releases",
        help="发布目录",
    )
    ap.add_argument(
        "--version",
        default=None,
        help="版本号（如 1.1.0）；默认从发布目录 manifest-*.json 推断",
    )
    args = ap.parse_args()
    rel = args.release_dir.resolve()

    tt = get_tenant_access_token()
    if not tt:
        raise SystemExit("请设置 FEISHU_APP_ID 与 FEISHU_APP_SECRET")

    ver = args.version
    if not ver:
        manifests = sorted(rel.glob("manifest-*.json"))
        if not manifests:
            raise SystemExit(f"未找到 {rel}/manifest-*.json，请传 --version")
        name = manifests[-1].stem
        if not name.startswith("manifest-"):
            raise SystemExit("manifest 文件名异常")
        ver = name[len("manifest-") :]

    manifest_path = rel / f"manifest-{ver}.json"
    archive_path = rel / f"autodrivekit-{ver}.tar.gz"
    if not manifest_path.is_file():
        raise SystemExit(f"缺少 {manifest_path}")
    if not archive_path.is_file():
        raise SystemExit(f"缺少 {archive_path}")

    _check_manifest_node(tt, DEFAULT_FEISHU_WIKI_MANIFEST_NODE_TOKEN)
    _check_archive_node(tt, DEFAULT_FEISHU_WIKI_ARCHIVE_NODE_TOKEN)

    print()
    print("请在飞书网页中打开下列链接，在文件预览界面使用「上传新版本」（或等价入口），选择对应本地文件：")
    print()
    print(f"  [1] manifest JSON")
    print(f"      链接: {_wiki_base()}/{DEFAULT_FEISHU_WIKI_MANIFEST_NODE_TOKEN}")
    print(f"      本地文件: {manifest_path}")
    try:
        body = json.loads(manifest_path.read_text(encoding="utf-8"))
        print(f"      其中 archive_file_token = {body.get('archive_file_token')!r}")
    except (OSError, json.JSONDecodeError):
        pass
    print()
    print(f"  [2] 安装包 tar.gz")
    print(f"      链接: {_wiki_base()}/{DEFAULT_FEISHU_WIKI_ARCHIVE_NODE_TOKEN}")
    print(f"      本地文件: {archive_path}")
    print()
    print("完成后可执行: adk update --check-only")


if __name__ == "__main__":
    main()
