"""AutoDriveKit — 统一工具入口，委派至 property、cfg-word 等子工具（实现目录见包内 _paths）。"""


def _read_version() -> str:
    try:
        from pathlib import Path
        import re
        toml = Path(__file__).resolve().parent.parent / "pyproject.toml"
        m = re.search(r'version\s*=\s*"([^"]+)"', toml.read_text(encoding="utf-8"))
        if m:
            return m.group(1)
    except Exception:
        pass
    try:
        from importlib.metadata import version
        return version("autodrivekit")
    except Exception:
        pass
    return "0.0.0"


__version__ = _read_version()
