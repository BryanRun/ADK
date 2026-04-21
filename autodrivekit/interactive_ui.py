"""交互式菜单的视觉分隔：与 Typer/Rich 帮助风格一致的 Panel、Rule。"""

from __future__ import annotations

from rich.console import Console
from rich.panel import Panel
from rich.rule import Rule
from rich.text import Text

_console = Console(highlight=False)


def rule(title: str) -> None:
    """横向分隔线（带标题），区分交互阶段。"""
    _console.print()
    _console.print(Rule(Text.from_markup(f"[bold bright_cyan]{title}[/]"), style="bright_cyan"))
    _console.print()


def panel(title: str, body: str, *, subtitle: str | None = None) -> None:
    """带边框的内容块，类似 adk -h 中「通用选项 / 工具包」分区效果。"""
    text = body.rstrip()
    if subtitle:
        text = f"[dim]{subtitle}[/]\n\n{text}"
    _console.print(
        Panel(
            Text.from_markup(text),
            title=Text.from_markup(f"[bold]{title}[/]"),
            border_style="cyan",
            padding=(0, 1),
        )
    )
    _console.print()
