"""每用户目录布局：配置（XDG）、数据目录、托管安装根（~/.local/opt/adk）。"""

from __future__ import annotations

import os
from pathlib import Path


def _expand(path: str) -> Path:
    return Path(os.path.expanduser(path)).resolve()


def user_config_dir() -> Path:
    base = os.environ.get("XDG_CONFIG_HOME")
    if base:
        return (Path(base) / "adk").resolve()
    return _expand("~/.config/adk")


def user_data_dir() -> Path:
    base = os.environ.get("XDG_DATA_HOME")
    if base:
        return (Path(base) / "adk").resolve()
    return _expand("~/.local/share/adk")


def managed_adk_base() -> Path:
    """托管安装根：releases / staging / current。"""
    return _expand("~/.local/opt/adk")


def managed_releases_dir() -> Path:
    return managed_adk_base() / "releases"


def managed_staging_dir() -> Path:
    return managed_adk_base() / "staging"


def managed_current_link() -> Path:
    return managed_adk_base() / "current"


def platform_settings_path() -> Path:
    return user_config_dir() / "adk.json"


def is_managed_install(*, package_file: Path | None = None) -> bool:
    """当前 autodrivekit 包是否位于托管目录 current 下（解析为真实路径）。"""
    try:
        import autodrivekit

        root = Path(
            package_file
            if package_file is not None
            else getattr(autodrivekit, "__file__", "")
        ).resolve()
    except Exception:
        return False
    try:
        cur = managed_current_link().resolve()
    except OSError:
        return False
    try:
        return cur in root.parents or root == cur
    except Exception:
        return False
