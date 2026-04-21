"""终端 ANSI 颜色（步骤成功绿 / 失败红）。尊重 NO_COLOR 与非 TTY。"""

import os
import sys


def _enabled() -> bool:
    if os.environ.get("NO_COLOR", "").strip():
        return False
    return sys.stdout.isatty()


def _wrap(code: str, text: str) -> str:
    if not _enabled() or not text:
        return text
    return f"\033[{code}m{text}\033[0m"


def red(text: str) -> str:
    return _wrap("91", text)


def green(text: str) -> str:
    return _wrap("92", text)


def yellow(text: str) -> str:
    return _wrap("93", text)


def bold(text: str) -> str:
    return _wrap("1", text)
