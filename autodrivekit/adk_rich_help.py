"""adk 根命令 Rich 帮助：页眉元数据、「通用选项」（含 -h/-v 与 update）、「工具包」「交互选项」「专业选项（一条龙）」等分区。"""

from __future__ import annotations

import json
from collections import defaultdict
from pathlib import Path
from typing import Any

import click
from rich import box
from rich.console import Console, Group, RenderableType
from rich.panel import Panel
from rich.table import Table
from rich.text import Text
from typer.rich_utils import (
    ALIGN_COMMANDS_PANEL,
    ALIGN_OPTIONS_PANEL,
    ARGUMENTS_PANEL_TITLE,
    COMMANDS_PANEL_TITLE,
    DEPRECATED_STRING,
    OPTIONS_PANEL_TITLE,
    RANGE_STRING,
    REQUIRED_SHORT_STRING,
    STYLE_COMMANDS_PANEL_BORDER,
    STYLE_COMMANDS_TABLE_BORDER_STYLE,
    STYLE_COMMANDS_TABLE_BOX,
    STYLE_COMMANDS_TABLE_FIRST_COLUMN,
    STYLE_COMMANDS_TABLE_LEADING,
    STYLE_COMMANDS_TABLE_PAD_EDGE,
    STYLE_COMMANDS_TABLE_PADDING,
    STYLE_COMMANDS_TABLE_ROW_STYLES,
    STYLE_COMMANDS_TABLE_SHOW_LINES,
    STYLE_DEPRECATED,
    STYLE_DEPRECATED_COMMAND,
    STYLE_METAVAR,
    STYLE_OPTIONS_PANEL_BORDER,
    STYLE_OPTIONS_TABLE_BORDER_STYLE,
    STYLE_OPTIONS_TABLE_BOX,
    STYLE_OPTIONS_TABLE_LEADING,
    STYLE_OPTIONS_TABLE_PAD_EDGE,
    STYLE_OPTIONS_TABLE_PADDING,
    STYLE_OPTIONS_TABLE_ROW_STYLES,
    STYLE_OPTIONS_TABLE_SHOW_LINES,
    STYLE_REQUIRED_SHORT,
    MarkupModeStrict,
    _RICH_HELP_PANEL_NAME,
    _get_parameter_help,
    _get_rich_console,
    _make_command_help,
    _print_commands_panel,
    _print_options_panel,
    highlighter,
    metavar_highlighter,
    negative_highlighter,
)

# 「工具包」注册名一列：与通用选项 / 专业选项中的命令（默认 cyan）区分
TOOL_PACKAGE_FIRST_COLUMN_STYLE = "bold magenta"

TOOL_PANEL_TITLE = "工具包"
INTERACTIVE_PANEL_TITLE = "交互选项"
PRO_OPTIONS_PANEL_TITLE = "专业选项（一条龙）"


def _option_style_rows_for_params(
    *,
    ctx: click.Context,
    markup_mode: MarkupModeStrict,
    params: list[click.Option] | list[click.Argument],
) -> list[list[RenderableType]]:
    """与 Typer `_print_options_panel` 相同的行数据（每行若干 Rich 单元格）。"""
    from rich.text import Text as RichText

    options_rows: list[list[RenderableType]] = []
    required_rows: list[str | RichText] = []
    for param in params:
        opt_long_strs: list[str] = []
        opt_short_strs: list[str] = []
        secondary_opt_long_strs: list[str] = []
        secondary_opt_short_strs: list[str] = []
        for opt_str in param.opts:
            if "--" in opt_str:
                opt_long_strs.append(opt_str)
            else:
                opt_short_strs.append(opt_str)
        for opt_str in param.secondary_opts:
            if "--" in opt_str:
                secondary_opt_long_strs.append(opt_str)
            else:
                secondary_opt_short_strs.append(opt_str)

        metavar = RichText(style=STYLE_METAVAR, overflow="fold")
        metavar_str = param.make_metavar(ctx=ctx)
        if (
            isinstance(param, click.Argument)
            and param.name
            and metavar_str == param.name.upper()
        ):
            metavar_str = param.type.name.upper()

        if metavar_str != "BOOLEAN":
            metavar.append(metavar_str)

        if (
            isinstance(param.type, click.types._NumberRangeBase)
            and isinstance(param, click.Option)
            and not (param.count and param.type.min == 0 and param.type.max is None)
        ):
            range_str = param.type._describe_range()
            if range_str:
                metavar.append(RANGE_STRING.format(range_str))

        required: str | RichText = ""
        if param.required:
            required = RichText(REQUIRED_SHORT_STRING, style=STYLE_REQUIRED_SHORT)

        required_rows.append(required)
        options_rows.append(
            [
                highlighter(",".join(opt_long_strs)),
                highlighter(",".join(opt_short_strs)),
                negative_highlighter(",".join(secondary_opt_long_strs)),
                negative_highlighter(",".join(secondary_opt_short_strs)),
                metavar_highlighter(metavar),
                _get_parameter_help(
                    param=param,
                    ctx=ctx,
                    markup_mode=markup_mode,
                ),
            ]
        )
    if any(required_rows):
        return [[req, *row] for req, row in zip(required_rows, options_rows, strict=True)]
    return options_rows


def _new_options_style_table() -> Table:
    t_styles: dict[str, Any] = {
        "show_lines": STYLE_OPTIONS_TABLE_SHOW_LINES,
        "leading": STYLE_OPTIONS_TABLE_LEADING,
        "box": STYLE_OPTIONS_TABLE_BOX,
        "border_style": STYLE_OPTIONS_TABLE_BORDER_STYLE,
        "row_styles": STYLE_OPTIONS_TABLE_ROW_STYLES,
        "pad_edge": STYLE_OPTIONS_TABLE_PAD_EDGE,
        "padding": STYLE_OPTIONS_TABLE_PADDING,
    }
    box_style = getattr(box, t_styles.pop("box"), None)
    return Table(
        highlight=True,
        show_header=False,
        expand=True,
        box=box_style,
        **t_styles,
    )


def _options_params_to_table(
    *,
    ctx: click.Context,
    markup_mode: MarkupModeStrict,
    params: list[click.Option] | list[click.Argument],
) -> Table | None:
    """与 Typer `_print_options_panel` 相同的选项表。"""
    rows = _option_style_rows_for_params(ctx=ctx, markup_mode=markup_mode, params=params)
    if not rows:
        return None
    options_table = _new_options_style_table()
    for row in rows:
        options_table.add_row(*row)
    return options_table


def _append_option_rows_to_table(
    table: Table,
    *,
    ctx: click.Context,
    markup_mode: MarkupModeStrict,
    params: list[click.Option] | list[click.Argument],
) -> None:
    for row in _option_style_rows_for_params(ctx=ctx, markup_mode=markup_mode, params=params):
        table.add_row(*row)


def _commands_to_table(
    *,
    commands: list[click.Command],
    markup_mode: MarkupModeStrict,
    cmd_len: int,
) -> Table | None:
    """与 Typer `_print_commands_panel` 相同的子命令表（无外层 Panel）。"""
    t_styles: dict[str, Any] = {
        "show_lines": STYLE_COMMANDS_TABLE_SHOW_LINES,
        "leading": STYLE_COMMANDS_TABLE_LEADING,
        "box": STYLE_COMMANDS_TABLE_BOX,
        "border_style": STYLE_COMMANDS_TABLE_BORDER_STYLE,
        "row_styles": STYLE_COMMANDS_TABLE_ROW_STYLES,
        "pad_edge": STYLE_COMMANDS_TABLE_PAD_EDGE,
        "padding": STYLE_COMMANDS_TABLE_PADDING,
    }
    box_style = getattr(box, t_styles.pop("box"), None)
    commands_table = Table(
        highlight=False,
        show_header=False,
        expand=True,
        box=box_style,
        **t_styles,
    )
    commands_table.add_column(
        style=STYLE_COMMANDS_TABLE_FIRST_COLUMN,
        no_wrap=True,
        width=cmd_len,
    )
    commands_table.add_column("Description", justify="left", no_wrap=False, ratio=10)
    rows: list[list[RenderableType | None]] = []
    deprecated_rows: list[RenderableType | None] = []
    for command in commands:
        helptext = command.short_help or command.help or ""
        command_name = command.name or ""
        if command.deprecated:
            command_name_text = Text(f"{command_name}", style=STYLE_DEPRECATED_COMMAND)
            deprecated_rows.append(Text(DEPRECATED_STRING, style=STYLE_DEPRECATED))
        else:
            command_name_text = Text(command_name)
            deprecated_rows.append(None)
        rows.append(
            [
                command_name_text,
                _make_command_help(help_text=helptext, markup_mode=markup_mode),
            ]
        )
    rows_with_deprecated = rows
    if any(deprecated_rows):
        rows_with_deprecated = []
        for row, deprecated_text in zip(rows, deprecated_rows, strict=True):
            rows_with_deprecated.append([*row, deprecated_text])
    for row in rows_with_deprecated:
        commands_table.add_row(*row)
    if not commands_table.row_count:
        return None
    return commands_table


def _print_merged_general_options_panel(
    *,
    ctx: click.Context,
    console: Console,
    markup_mode: MarkupModeStrict,
    options: list[click.Option],
    commands: list[click.Command],
    max_cmd_len: int,
) -> None:
    """根级 -h/-v 与 `update` 及其子选项同一套多列表格对齐（Typer 选项表样式）。"""
    opt_table = _options_params_to_table(ctx=ctx, markup_mode=markup_mode, params=options)
    update_cmd = next((c for c in commands if c.name == "update"), None)
    other_cmds = [c for c in commands if c.name != "update"]

    if opt_table is not None and update_cmd is not None:
        opt_table.add_section()
        sub_ctx = click.Context(update_cmd, parent=ctx, info_name=update_cmd.name or "update")
        helptext = (update_cmd.short_help or update_cmd.help or "").strip()
        opt_table.add_row(
            highlighter("update"),
            Text(""),
            Text(""),
            Text(""),
            Text(""),
            _make_command_help(help_text=helptext or "（无说明）", markup_mode=markup_mode),
        )
        uopts = [
            p
            for p in update_cmd.get_params(sub_ctx)
            if isinstance(p, click.Option)
            and not getattr(p, "hidden", False)
            and getattr(p, "name", None) != "help"
        ]
        _append_option_rows_to_table(
            opt_table, ctx=sub_ctx, markup_mode=markup_mode, params=uopts
        )

    cmd_len = max(
        max_cmd_len,
        max((len(c.name or "") for c in other_cmds), default=0),
        8,
    )
    cmd_table = (
        _commands_to_table(commands=other_cmds, markup_mode=markup_mode, cmd_len=cmd_len)
        if other_cmds
        else None
    )
    parts: list[RenderableType] = [p for p in (opt_table, cmd_table) if p is not None]
    if not parts:
        return
    body: RenderableType = parts[0] if len(parts) == 1 else Group(*parts)
    console.print(
        Panel(
            body,
            border_style=STYLE_OPTIONS_PANEL_BORDER,
            title=OPTIONS_PANEL_TITLE,
            title_align=ALIGN_OPTIONS_PANEL,
        )
    )


def _print_tool_packages_panel(
    *,
    name: str,
    commands: list[click.Command],
    markup_mode: MarkupModeStrict,
    console: Console,
    cmd_len: int,
) -> None:
    """与 Typer _print_commands_panel 相同布局，但工具包 id 使用 TOOL_PACKAGE_FIRST_COLUMN_STYLE。"""
    t_styles: dict[str, Any] = {
        "show_lines": STYLE_COMMANDS_TABLE_SHOW_LINES,
        "leading": STYLE_COMMANDS_TABLE_LEADING,
        "box": STYLE_COMMANDS_TABLE_BOX,
        "border_style": STYLE_COMMANDS_TABLE_BORDER_STYLE,
        "row_styles": STYLE_COMMANDS_TABLE_ROW_STYLES,
        "pad_edge": STYLE_COMMANDS_TABLE_PAD_EDGE,
        "padding": STYLE_COMMANDS_TABLE_PADDING,
    }
    box_style = getattr(box, t_styles.pop("box"), None)

    commands_table = Table(
        highlight=False,
        show_header=False,
        expand=True,
        box=box_style,
        **t_styles,
    )
    commands_table.add_column(
        style=TOOL_PACKAGE_FIRST_COLUMN_STYLE,
        no_wrap=True,
        width=cmd_len,
    )
    commands_table.add_column("Description", justify="left", no_wrap=False, ratio=10)

    rows: list[list[RenderableType | None]] = []
    deprecated_rows: list[RenderableType | None] = []
    for command in commands:
        helptext = command.short_help or command.help or ""
        command_name = command.name or ""
        if command.deprecated:
            command_name_text = Text(f"{command_name}", style=STYLE_DEPRECATED_COMMAND)
            deprecated_rows.append(Text(DEPRECATED_STRING, style=STYLE_DEPRECATED))
        else:
            command_name_text = Text(command_name, style=TOOL_PACKAGE_FIRST_COLUMN_STYLE)
            deprecated_rows.append(None)
        rows.append(
            [
                command_name_text,
                _make_command_help(
                    help_text=helptext,
                    markup_mode=markup_mode,
                ),
            ]
        )
    rows_with_deprecated = rows
    if any(deprecated_rows):
        rows_with_deprecated = []
        for row, deprecated_text in zip(rows, deprecated_rows, strict=True):
            rows_with_deprecated.append([*row, deprecated_text])
    for row in rows_with_deprecated:
        commands_table.add_row(*row)
    if commands_table.row_count:
        console.print(
            Panel(
                commands_table,
                border_style=STYLE_COMMANDS_PANEL_BORDER,
                title=name,
                title_align=ALIGN_COMMANDS_PANEL,
            )
        )


def _print_platform_banner(*, console: object, markup_mode: MarkupModeStrict) -> None:
    """页眉：简介、版本、作者、版权（醒目独立块，置于帮助最前）。"""
    from autodrivekit import platform_info as pi

    tbl = Table(show_header=False, box=box.ROUNDED, expand=True, pad_edge=True, padding=(0, 1))
    tbl.add_column("", style="bold cyan", width=10, no_wrap=True)
    tbl.add_column("", ratio=1)
    tbl.add_row("简介", pi.PLATFORM_SUMMARY)
    tbl.add_row("版本", pi.PLATFORM_VERSION)
    tbl.add_row("作者", pi.PLATFORM_AUTHOR)
    tbl.add_row("Copyright", pi.PLATFORM_COPYRIGHT)

    title = Text.from_markup(f"[bold white on cyan] {pi.PLATFORM_NAME} [/]")
    console.print(
        Panel(
            tbl,
            title=title,
            border_style="cyan",
            title_align="center",
            padding=(1, 2),
        )
    )
    console.print()


def _read_tool_project_keys_for_help(tool: Any) -> list[str]:
    """与交互菜单一致：优先用户 config 目录下的 config.json，否则包内默认文件。"""
    pp = getattr(tool, "project_pick", None)
    config_file = pp.config_file if pp else "config.json"
    projects_key = pp.projects_key if pp else "projects"
    from autodrivekit.tool_runtime_paths import resolve_tool_paths

    main_py = Path(tool.main_py)
    cfg_path = resolve_tool_paths(str(main_py)).config_file(config_file)
    if not cfg_path.is_file():
        cfg_path = Path(tool.path) / config_file
    if not cfg_path.is_file():
        return []
    try:
        data = json.loads(cfg_path.read_text(encoding="utf-8"))
    except (OSError, json.JSONDecodeError):
        return []
    proj = data.get(projects_key)
    if not isinstance(proj, dict):
        return []
    return sorted(proj.keys())


def _print_interactive_panel(*, console: object, markup_mode: MarkupModeStrict) -> None:
    """交互式 CLI：独立一行醒目入口命令，其余说明从简。"""
    cmd_line = Text.from_markup(
        "[bold white on blue]  adk  [/]  [bold bright_yellow]← 交互式 CLI 唯一入口[/]  "
        "[dim]（仅输入此行，末尾不要跟子命令或其它参数）[/]"
    )
    rest = Text.from_markup(
        "进入 Rich 向导后依次选择工具包、项目（若 [dim]adk-tool.json[/] 配置了 "
        "[dim]interactive_project_pick[/]）及参数。非交互用法见上方「通用选项」「工具包」及下方「专业选项」。"
    )
    console.print(
        Panel(
            Group(cmd_line, Text(""), rest),
            border_style=STYLE_COMMANDS_PANEL_BORDER,
            title=INTERACTIVE_PANEL_TITLE,
            title_align=ALIGN_COMMANDS_PANEL,
        )
    )


def _print_one_dragon_panel(
    *, console: object, markup_mode: MarkupModeStrict
) -> None:
    """不经过子命令注册：「工具包 + <项目>」占位示例；下方列出从 config 读到的项目名可选项。"""
    from autodrivekit.registry import discover_tools

    tools = discover_tools()
    example_rows: list[tuple[str, str]] = []
    legend_lines: list[tuple[str, str]] = []
    for tool in tools:
        keys = _read_tool_project_keys_for_help(tool)
        legend_lines.append(
            (
                tool.id,
                "、".join(keys)
                if keys
                else "（未读到 projects，请配置 config 或使用仅输入 adk 的交互菜单）",
            )
        )
        example_rows.append(
            (
                f"adk {tool.id} <项目>",
                f"{tool.id}：将 <项目> 替换为下列「可选项目名」中的任一键，执行该工具文档中的默认全流程"
                f"（与同目录 python3 main.py <项目> 一致）。",
            )
        )

    cmd_w = max((len(r[0]) for r in example_rows), default=24)
    cmd_w = min(max(cmd_w, 24), 40)

    t = Table(
        highlight=False,
        show_header=False,
        expand=True,
        box=None,
        pad_edge=STYLE_COMMANDS_TABLE_PAD_EDGE,
        padding=STYLE_COMMANDS_TABLE_PADDING,
    )
    t.add_column(style=STYLE_COMMANDS_TABLE_FIRST_COLUMN, no_wrap=True, width=cmd_w)
    t.add_column("说明", justify="left", no_wrap=False, ratio=10)

    for cmd, desc in example_rows:
        t.add_row(
            Text(cmd, style=STYLE_COMMANDS_TABLE_FIRST_COLUMN),
            _make_command_help(help_text=desc, markup_mode=markup_mode),
        )

    leg = Table(
        highlight=False,
        show_header=True,
        expand=True,
        box=None,
        pad_edge=STYLE_COMMANDS_TABLE_PAD_EDGE,
        padding=STYLE_COMMANDS_TABLE_PADDING,
    )
    leg.add_column("工具包 id", style="bold magenta", no_wrap=True, width=14)
    leg.add_column("可选项目名（来自 config.json 的 projects）", justify="left", ratio=10)
    for tid, names in legend_lines:
        leg.add_row(Text(tid, style="bold magenta"), Text(names))

    hint = Text.from_markup(
        "[dim]上表 <项目> 为占位符；下列为当前本机已解析到的项目键（若为空请先配置或复制默认 config）。[/]"
    )
    body = Group(t, Text(""), hint, Text(""), leg)

    console.print(
        Panel(
            body,
            border_style=STYLE_COMMANDS_PANEL_BORDER,
            title=PRO_OPTIONS_PANEL_TITLE,
            title_align=ALIGN_COMMANDS_PANEL,
        )
    )


def adk_root_rich_format_help(
    *,
    obj: click.Command | click.Group,
    ctx: click.Context,
    markup_mode: MarkupModeStrict,
) -> None:
    """页眉元数据 + 通用选项（含 update）/ 工具包 / 交互 / 专业选项（一条龙）；不含 Usage 行与冗长 epilog。"""
    console = _get_rich_console()

    _print_platform_banner(console=console, markup_mode=markup_mode)

    panel_to_commands: defaultdict[str, list[click.Command]] = defaultdict(list)
    general_commands: list[click.Command] = []
    max_cmd_len = 0
    if isinstance(obj, click.Group):
        for command_name in obj.list_commands(ctx):
            command = obj.get_command(ctx, command_name)
            if command and not command.hidden:
                panel_name = (
                    getattr(command, _RICH_HELP_PANEL_NAME, None)
                    or COMMANDS_PANEL_TITLE
                )
                panel_to_commands[panel_name].append(command)
        max_cmd_len = max(
            (
                len(command.name or "")
                for commands in panel_to_commands.values()
                for command in commands
            ),
            default=0,
        )
        general_commands = panel_to_commands.pop(OPTIONS_PANEL_TITLE, [])

    panel_to_arguments: defaultdict[str, list[click.Argument]] = defaultdict(list)
    panel_to_options: defaultdict[str, list[click.Option]] = defaultdict(list)
    for param in obj.get_params(ctx):
        if getattr(param, "hidden", False):
            continue
        if isinstance(param, click.Argument):
            panel_name = (
                getattr(param, _RICH_HELP_PANEL_NAME, None) or ARGUMENTS_PANEL_TITLE
            )
            panel_to_arguments[panel_name].append(param)
        elif isinstance(param, click.Option):
            panel_name = (
                getattr(param, _RICH_HELP_PANEL_NAME, None) or OPTIONS_PANEL_TITLE
            )
            panel_to_options[panel_name].append(param)

    default_arguments = panel_to_arguments.get(ARGUMENTS_PANEL_TITLE, [])
    _print_options_panel(
        name=ARGUMENTS_PANEL_TITLE,
        params=default_arguments,
        ctx=ctx,
        markup_mode=markup_mode,
        console=console,
    )
    for panel_name, arguments in panel_to_arguments.items():
        if panel_name == ARGUMENTS_PANEL_TITLE:
            continue
        _print_options_panel(
            name=panel_name,
            params=arguments,
            ctx=ctx,
            markup_mode=markup_mode,
            console=console,
        )

    default_options = panel_to_options.get(OPTIONS_PANEL_TITLE, [])
    if isinstance(obj, click.Group) and general_commands and default_options:
        _print_merged_general_options_panel(
            ctx=ctx,
            console=console,
            markup_mode=markup_mode,
            options=default_options,
            commands=general_commands,
            max_cmd_len=max_cmd_len,
        )
    elif default_options:
        _print_options_panel(
            name=OPTIONS_PANEL_TITLE,
            params=default_options,
            ctx=ctx,
            markup_mode=markup_mode,
            console=console,
        )
    elif isinstance(obj, click.Group) and general_commands:
        _print_commands_panel(
            name=OPTIONS_PANEL_TITLE,
            commands=general_commands,
            markup_mode=markup_mode,
            console=console,
            cmd_len=max(max_cmd_len, max(len(c.name or "") for c in general_commands), 8),
        )
    for panel_name, options in panel_to_options.items():
        if panel_name == OPTIONS_PANEL_TITLE:
            continue
        _print_options_panel(
            name=panel_name,
            params=options,
            ctx=ctx,
            markup_mode=markup_mode,
            console=console,
        )

    if isinstance(obj, click.Group):
        default_commands = panel_to_commands.get(COMMANDS_PANEL_TITLE, [])
        _print_tool_packages_panel(
            name=TOOL_PANEL_TITLE,
            commands=default_commands,
            markup_mode=markup_mode,
            console=console,
            cmd_len=max_cmd_len,
        )
        for panel_name, commands in panel_to_commands.items():
            if panel_name == COMMANDS_PANEL_TITLE:
                continue
            _print_commands_panel(
                name=panel_name,
                commands=commands,
                markup_mode=markup_mode,
                console=console,
                cmd_len=max_cmd_len,
            )

        _print_interactive_panel(console=console, markup_mode=markup_mode)
        _print_one_dragon_panel(console=console, markup_mode=markup_mode)

    if obj.epilog:
        from rich.align import Align
        from rich.padding import Padding
        from typer.rich_utils import _make_rich_text

        lines = obj.epilog.split("\n\n")
        epilogue = "\n".join([x.replace("\n", " ").strip() for x in lines])
        epilogue_text = _make_rich_text(text=epilogue, markup_mode=markup_mode)
        console.print(Padding(Align(epilogue_text, pad=False), 1))
