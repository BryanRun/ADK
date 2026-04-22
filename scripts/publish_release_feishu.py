#!/usr/bin/env python3
"""根据本地 tar.gz 生成正式 manifest JSON，并可选上传到飞书云空间。

依赖环境变量（与 adk 其它飞书能力一致）：
  FEISHU_APP_ID、FEISHU_APP_SECRET

约定（与平台代码一致）：
  ``archive_file_token`` 固定为知识库**安装包**节点 ``DEFAULT_FEISHU_WIKI_ARCHIVE_NODE_TOKEN``
  （``https://t83dfrspj4.feishu.cn/wiki/MaGVwCGz9iUQ6ekJb5MckijYnAb``）。
  默认 manifest 节点为 ``DEFAULT_FEISHU_WIKI_MANIFEST_NODE_TOKEN``
  （``https://t83dfrspj4.feishu.cn/wiki/FSSpwYBwIioeN3ksc72cvCU4ncg``）；将生成的 JSON 用
  ``scripts/wiki_release_upload.py`` 校验后，在飞书网页对该节点执行「上传新版本」。

可选：
  ADK_RELEASE_PARENT_FOLDER_TOKEN — 上传 manifest JSON 时的目标文件夹；不设则用云空间根目录。

输出：
  release/manifest-<version>.json

默认将 manifest JSON 上传到云空间并打印 file_token（便于写入 adk.json 覆盖默认 wiki manifest）。
"""

from __future__ import annotations

import argparse
import hashlib
import json
import os
import re
import sys
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent
sys.path.insert(0, str(ROOT))

from autodrivekit.config_migrate import DEFAULT_FEISHU_WIKI_ARCHIVE_NODE_TOKEN
from autodrivekit.feishu_auth import get_tenant_access_token
from autodrivekit.feishu_drive import (
    get_explorer_root_folder_token,
    upload_local_file_to_explorer,
)


def _sha256_file(p: Path) -> str:
    h = hashlib.sha256()
    with open(p, "rb") as f:
        for chunk in iter(lambda: f.read(1024 * 1024), b""):
            h.update(chunk)
    return h.hexdigest().lower()


def _version_from_archive(name: str) -> str:
    m = re.match(r"autodrivekit-(.+)\.tar\.gz$", name)
    if not m:
        sys.exit(f"无法从文件名解析版本: {name}（期望 autodrivekit-<ver>.tar.gz）")
    return m.group(1)


def main() -> None:
    ap = argparse.ArgumentParser(description=__doc__)
    ap.add_argument(
        "--release-dir",
        type=Path,
        default=ROOT / "release",
        help="发布目录（默认：仓库根目录下的 release/）",
    )
    ap.add_argument(
        "--archive",
        type=Path,
        default=None,
        help="用于计算 sha256 的 tar.gz（默认：发布目录下最新的 autodrivekit-*.tar.gz）",
    )
    ap.add_argument(
        "--skip-manifest-upload",
        action="store_true",
        help="不把 manifest JSON 上传到飞书",
    )
    args = ap.parse_args()

    rel = args.release_dir.resolve()
    rel.mkdir(parents=True, exist_ok=True)

    arch = args.archive
    if arch is None:
        cands = sorted(
            rel.glob("autodrivekit-*.tar.gz"),
            key=lambda p: p.stat().st_mtime,
            reverse=True,
        )
        if not cands:
            sys.exit(
                f"未找到 {rel}/autodrivekit-*.tar.gz，请先执行 ./scripts/pack_adk_release.sh"
            )
        arch = cands[0]
    arch = arch.resolve()
    if not arch.is_file():
        sys.exit(f"文件不存在: {arch}")

    ver = _version_from_archive(arch.name)
    sha = _sha256_file(arch)

    manifest = {
        "version": ver,
        "archive_file_token": DEFAULT_FEISHU_WIKI_ARCHIVE_NODE_TOKEN,
        "filename": arch.name,
        "sha256": sha,
    }
    out = rel / f"manifest-{ver}.json"
    out.write_text(
        json.dumps(manifest, ensure_ascii=False, indent=2) + "\n",
        encoding="utf-8",
    )
    print(f"  已写入正式 manifest: {out}")
    print(
        f"  archive_file_token 已固定为知识库安装包节点: {DEFAULT_FEISHU_WIKI_ARCHIVE_NODE_TOKEN}\n"
        "  请确认该节点挂载的云文件与上述 filename / sha256 一致；manifest 请上传到 manifest 节点\n"
        "  （见 scripts/wiki_release_upload.py 与 README）。"
    )

    if not args.skip_manifest_upload:
        tt = get_tenant_access_token()
        if not tt:
            sys.exit("无法获取 tenant_access_token：请设置 FEISHU_APP_ID 与 FEISHU_APP_SECRET")
        parent = os.environ.get("ADK_RELEASE_PARENT_FOLDER_TOKEN", "").strip()
        if not parent:
            parent = get_explorer_root_folder_token(tt)
            print(f"  未设置 ADK_RELEASE_PARENT_FOLDER_TOKEN，使用云空间根目录 …{parent[-12:]}")
        print(f"  上传 manifest 文件 {out.name} …")
        manifest_token = upload_local_file_to_explorer(
            tt, parent, out, file_name=out.name
        )
        print(f"  云端 manifest 文件 file_token: {manifest_token}")
        print(
            "  可将该 token 写入 ~/.config/adk/adk.json → feishu_update.manifest_file_token，\n"
            "  或设置 ADK_FEISHU_MANIFEST_FILE_TOKEN（与 archive 所用 wiki 节点 token 可为同一值，\n"
            "  见 README 中「manifest 与制品同一节点」的约束说明）。"
        )


if __name__ == "__main__":
    main()
