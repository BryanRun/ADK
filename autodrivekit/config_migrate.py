"""启动时配置迁移（B 方案：不在 adk update 末尾迁移，而在下次启动 adk 时执行）。"""

from __future__ import annotations

import json
import os
import shutil
import sys
import time
from pathlib import Path
from typing import Any

from autodrivekit._paths import TOOLS_ROOT
from autodrivekit.registry import MANIFEST_NAME
from autodrivekit.user_layout import platform_settings_path, user_config_dir

PLATFORM_SCHEMA_VERSION = 1
TOOL_CONFIG_SCHEMA_VERSION = 1

# 知识库 manifest 节点（默认 manifest 来源；须为「文件」且内容为 JSON，见 README）：
# https://t83dfrspj4.feishu.cn/wiki/FSSpwYBwIioeN3ksc72cvCU4ncg
DEFAULT_FEISHU_WIKI_MANIFEST_NODE_TOKEN = "FSSpwYBwIioeN3ksc72cvCU4ncg"
# 知识库「安装包」文件节点（manifest 内 archive_file_token 与之对齐）：
# https://t83dfrspj4.feishu.cn/wiki/MaGVwCGz9iUQ6ekJb5MckijYnAb
DEFAULT_FEISHU_WIKI_ARCHIVE_NODE_TOKEN = "MaGVwCGz9iUQ6ekJb5MckijYnAb"
# 兼容旧名：曾用单节点；现等价于制品节点。
DEFAULT_FEISHU_WIKI_RELEASE_NODE_TOKEN = DEFAULT_FEISHU_WIKI_ARCHIVE_NODE_TOKEN
DEFAULT_MANIFEST_FILE_TOKEN = DEFAULT_FEISHU_WIKI_MANIFEST_NODE_TOKEN


def _default_platform_settings() -> dict[str, Any]:
    return {
        "schema_version": PLATFORM_SCHEMA_VERSION,
        "feishu_update": {
            "manifest_file_token": DEFAULT_MANIFEST_FILE_TOKEN,
        },
    }


def _load_or_create_platform_file() -> dict[str, Any]:
    user_config_dir().mkdir(parents=True, exist_ok=True)
    p = platform_settings_path()
    if not p.is_file():
        data = _default_platform_settings()
        p.write_text(
            json.dumps(data, ensure_ascii=False, indent=2) + "\n",
            encoding="utf-8",
        )
        return data
    try:
        return json.loads(p.read_text(encoding="utf-8"))
    except (OSError, json.JSONDecodeError):
        bak = p.with_suffix(f".corrupt.{int(time.time())}.json")
        try:
            shutil.copy2(p, bak)
        except OSError:
            pass
        data = _default_platform_settings()
        p.write_text(
            json.dumps(data, ensure_ascii=False, indent=2) + "\n",
            encoding="utf-8",
        )
        return data


def _migrate_platform_schema(data: dict[str, Any]) -> dict[str, Any]:
    v = int(data.get("schema_version", 0) or 0)
    if v < 1:
        data.setdefault("feishu_update", {})
        if not isinstance(data["feishu_update"], dict):
            data["feishu_update"] = {}
        data["feishu_update"].setdefault("manifest_file_token", "")
        data["schema_version"] = 1
        v = 1
    # 未来 v->v+1 在此链接 elif
    return data


def _migrate_tool_config_file(path: Path) -> None:
    if not path.is_file():
        return
    try:
        data = json.loads(path.read_text(encoding="utf-8"))
    except (OSError, json.JSONDecodeError):
        return
    if not isinstance(data, dict):
        return
    v = int(data.get("adk_schema_version", 0) or 0)
    if v >= TOOL_CONFIG_SCHEMA_VERSION:
        return
    bak = path.with_suffix(f".bak.{int(time.time())}.json")
    try:
        shutil.copy2(path, bak)
    except OSError:
        pass
    if v < 1:
        data["adk_schema_version"] = TOOL_CONFIG_SCHEMA_VERSION
    path.write_text(
        json.dumps(data, ensure_ascii=False, indent=4) + "\n",
        encoding="utf-8",
    )


def _seed_tool_configs_from_bundle() -> None:
    """首次启动时：把 ``tools/<tool>/config.json`` 复制到用户配置目录，仅当目标不存在。

    之前仅在工具子进程 (``ensure_tool_config_seeded``) 触发；导致用户尚未运行过某工具前，
    在 ``~/.config/adk/<tool>/`` 下手动建的 config 不会被交互菜单读到。
    """
    if not TOOLS_ROOT.is_dir():
        return
    cfg_root = user_config_dir()
    for d in sorted(TOOLS_ROOT.iterdir()):
        if not d.is_dir():
            continue
        if not (d / MANIFEST_NAME).is_file():
            continue
        src_cfg = d / "config.json"
        if not src_cfg.is_file():
            continue
        dest = cfg_root / d.name / "config.json"
        if dest.is_file():
            continue
        try:
            dest.parent.mkdir(parents=True, exist_ok=True)
            shutil.copy2(src_cfg, dest)
        except OSError:
            pass


def _iter_tool_config_paths() -> list[Path]:
    out: list[Path] = []
    if not TOOLS_ROOT.is_dir():
        return out
    cfg_root = user_config_dir()
    for d in sorted(TOOLS_ROOT.iterdir()):
        if not d.is_dir():
            continue
        if not (d / MANIFEST_NAME).is_file():
            continue
        p = cfg_root / d.name / "config.json"
        out.append(p)
    return out


def run_startup_migrations(argv: list[str] | None = None) -> None:
    """在 CLI 启动早期调用；`adk update` 子命令跳过（由新版本在下次启动时迁移）。"""
    a = argv if argv is not None else sys.argv
    if len(a) >= 2 and a[1] == "update":
        return

    data = _load_or_create_platform_file()
    new_data = _migrate_platform_schema(dict(data))
    if json.dumps(new_data, sort_keys=True) != json.dumps(data, sort_keys=True):
        platform_settings_path().write_text(
            json.dumps(new_data, ensure_ascii=False, indent=2) + "\n",
            encoding="utf-8",
        )

    _seed_tool_configs_from_bundle()

    for cfg in _iter_tool_config_paths():
        _migrate_tool_config_file(cfg)


def manifest_file_token_from_settings() -> str:
    """供 updater 读取：环境变量 ``ADK_FEISHU_MANIFEST_FILE_TOKEN`` > adk.json 非空值 > 平台内置默认。

    与发布约定一致时，``ADK_FEISHU_MANIFEST_FILE_TOKEN`` 一般为 manifest 文件节点
    （``DEFAULT_FEISHU_WIKI_MANIFEST_NODE_TOKEN``）；与 manifest JSON 内 ``archive_file_token``
    （制品节点 ``DEFAULT_FEISHU_WIKI_ARCHIVE_NODE_TOKEN``）为两个不同 wiki 节点。
    """
    env = os.environ.get("ADK_FEISHU_MANIFEST_FILE_TOKEN", "").strip()
    if env:
        return env
    data = _load_or_create_platform_file()
    fu = data.get("feishu_update")
    if isinstance(fu, dict):
        u = str(fu.get("manifest_file_token") or "").strip()
        if u:
            return u
    return DEFAULT_MANIFEST_FILE_TOKEN.strip()
