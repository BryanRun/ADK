"""首次运行或缺少 Typer 时的提示与可选一键安装（可编辑安装平台根目录）。"""

from __future__ import annotations

import os
import subprocess
import sys

from autodrivekit._paths import ROOT


def ensure_typer_available() -> bool:
    try:
        import typer  # noqa: F401
    except ImportError:
        return False
    return True


def print_missing_typer_message() -> None:
    sys.stderr.write("\n")
    sys.stderr.write("  [AutoDriveKit] 无法加载 CLI 依赖：未安装 Typer（或当前 Python 环境未安装平台包）。\n")
    sys.stderr.write("\n")
    sys.stderr.write("  请先安装 AutoDriveKit 平台（在包含 pyproject.toml 的目录执行）：\n")
    sys.stderr.write(f"    {sys.executable} -m pip install -U pip setuptools wheel\n")
    sys.stderr.write(f"    {sys.executable} -m pip install -e \"{ROOT}\"\n")
    sys.stderr.write("\n")
    sys.stderr.write("  若仅想安装依赖而不装入口脚本，可使用：\n")
    sys.stderr.write(f"    {sys.executable} -m pip install -r \"{ROOT / 'requirements.txt'}\"\n")
    sys.stderr.write("\n")


def prompt_install_editable() -> bool:
    try:
        line = input("  是否使用当前解释器对上述目录执行可编辑安装（pip install -e）？[y/N] ")
    except EOFError:
        return False
    return line.strip().lower() in ("y", "yes")


def run_pip_install_editable() -> int:
    cmd = [
        sys.executable,
        "-m",
        "pip",
        "install",
        "-e",
        str(ROOT),
    ]
    sys.stderr.write(f"  执行: {' '.join(cmd)}\n\n")
    return subprocess.call(cmd)


def reexec_autodrivekit_cli() -> None:
    """安装成功后用同参重新进入 ``python -m autodrivekit``。"""
    os.execv(
        sys.executable,
        [sys.executable, "-m", "autodrivekit", *sys.argv[1:]],
    )
