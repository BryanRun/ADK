"""工具子进程路径：程序包目录（只读）与用户工作区（配置 + 数据）。"""

from __future__ import annotations

import os
import shutil
from dataclasses import dataclass
from pathlib import Path


@dataclass(frozen=True)
class ToolPaths:
    """bundle_dir：包内代码与模板；workspace_dir：用户 input/output 等可变数据。"""

    bundle_dir: Path
    workspace_dir: Path

    def config_file(self, name: str = "config.json") -> Path:
        cfg_root = os.environ.get("AUTODRIVEKIT_USER_CONFIG_DIR", "").strip()
        if cfg_root:
            return Path(cfg_root) / self.bundle_dir.name / name
        return self.bundle_dir / name

    def workspace_sub(self, *parts: str) -> Path:
        return self.workspace_dir.joinpath(*parts)


def resolve_tool_paths(script_file: str) -> ToolPaths:
    bundle = Path(script_file).resolve().parent
    slug = bundle.name
    data_home = os.environ.get("AUTODRIVEKIT_USER_DATA_DIR", "").strip()
    if data_home:
        workspace = Path(data_home) / slug
    else:
        workspace = bundle
    return ToolPaths(bundle_dir=bundle, workspace_dir=workspace)


def ensure_workspace_file_seeded(tp: ToolPaths, name: str) -> Path:
    """将包内数据文件复制到用户 workspace 根目录（如 name_mapping.json）。"""
    tp.workspace_dir.mkdir(parents=True, exist_ok=True)
    dest = tp.workspace_dir / name
    if dest.is_file():
        return dest
    src = tp.bundle_dir / name
    if src.is_file():
        shutil.copy2(src, dest)
    return dest


def ensure_tool_config_seeded(tp: ToolPaths, name: str = "config.json") -> Path:
    """在用户配置目录生成默认 config（从包内同名文件复制，仅当目标不存在）。"""
    dest = tp.config_file(name)
    dest.parent.mkdir(parents=True, exist_ok=True)
    if dest.is_file():
        return dest
    src = tp.bundle_dir / name
    if src.is_file():
        shutil.copy2(src, dest)
    return dest
