"""Typer 实现的 CLI（仅在 Typer 可用时由 cli.main 导入）。"""

from __future__ import annotations

import json
import os
import shlex
import subprocess
import sys
from pathlib import Path
from typing import NoReturn

import click
import typer
from rich.markup import escape as rich_escape
from typer import rich_utils as _typer_rich_utils
from typer.core import HAS_RICH, TyperGroup

# Rich 帮助：「通用选项」面板标题（页眉 / 工具包 / 交互 / 专业选项由 adk_rich_help 绘制）
_typer_rich_utils.OPTIONS_PANEL_TITLE = "通用选项"
from typer.rich_utils import OPTIONS_PANEL_TITLE as ADK_GENERAL_OPTIONS_PANEL_TITLE

from autodrivekit import __version__ as PLATFORM_VERSION
from autodrivekit._paths import TOOLS_ROOT
from autodrivekit.user_layout import user_config_dir, user_data_dir
from autodrivekit.interactive_ui import panel, rule
from autodrivekit.registry import ParamItem, ProjectPickConfig, ToolInfo, discover_tools

# 步骤 1：与 0 / 回车 等价的退出口令（不区分大小写）
_EXIT_MENU: frozenset[str] = frozenset({"", "0", "q", "quit", "exit", "bye"})

# 步骤 2：参数行专用退出（回车表示默认参数，不作为退出）
_EXIT_PARAM: frozenset[str] = frozenset({"q", "quit", "exit", "bye"})


def _menu_wants_exit(raw: str) -> bool:
    return raw.strip().lower() in _EXIT_MENU


def _param_wants_exit(raw: str) -> bool:
    return raw.strip().lower() in _EXIT_PARAM


class ADKRootGroup(TyperGroup):
    """根帮助：页眉 + 通用选项（含 update）/ 工具包 / 交互 / 专业选项（Rich）。"""

    def format_help(self, ctx: click.Context, formatter: click.HelpFormatter) -> None:
        if not HAS_RICH or self.rich_markup_mode is None:
            return super().format_help(ctx, formatter)
        from autodrivekit.adk_rich_help import adk_root_rich_format_help

        return adk_root_rich_format_help(
            obj=self,
            ctx=ctx,
            markup_mode=self.rich_markup_mode,
        )


app = typer.Typer(
    name="adk",
    cls=ADKRootGroup,
    help=None,
    epilog=None,
    add_completion=False,
    # Usage 行：adk [通用选项] [工具包] [ARGS]...
    options_metavar="[通用选项]",
    subcommand_metavar="[工具包] [ARGS]...",
    context_settings={"help_option_names": ["-h", "--help"]},
)

_TOOLS: list[ToolInfo] = discover_tools()
for _t in _TOOLS:
    if not _t.main_py.is_file():
        raise FileNotFoundError(
            f"工具入口不存在: {_t.main_py}（manifest: {_t.path / 'adk-tool.json'}）"
        )


@app.command("update", rich_help_panel=ADK_GENERAL_OPTIONS_PANEL_TITLE)
def update_command(
    dry_run: bool = typer.Option(
        False,
        "--dry-run",
        "-n",
        help="确认有更新后跳过下载与安装（用于演练）。",
    ),
    check_only: bool = typer.Option(
        False,
        "--check-only",
        "-c",
        help="仅比对 manifest 中的版本，不下载安装。",
    ),
) -> None:
    """从飞书 Drive 读取 manifest 并下载制品，解压到 ~/.local/opt/adk 后原子切换 current。"""
    from autodrivekit.updater import UpdateError, run_update

    try:
        run_update(dry_run=dry_run, check_only=check_only)
    except UpdateError as e:
        typer.echo(str(e), err=True)
        raise typer.Exit(1)


def _run_tool(main_py: str, passthrough: list[str]) -> NoReturn:
    env = os.environ.copy()
    env["AUTODRIVEKIT_USER_CONFIG_DIR"] = str(user_config_dir())
    env["AUTODRIVEKIT_USER_DATA_DIR"] = str(user_data_dir())
    cmd = [sys.executable, main_py, *passthrough]
    raise SystemExit(subprocess.call(cmd, env=env))


def _append_param_block(
    parts: list[str],
    title: str,
    subtitle: str,
    rows: tuple[ParamItem, ...],
) -> None:
    parts.append(f"[bold]{title}[/]{subtitle}")
    parts.append("")
    for row in rows:
        parts.append(f"  [bold cyan]{rich_escape(row.arg)}[/]")
        if row.desc:
            parts.append(f"      [dim]{rich_escape(row.desc)}[/]")
        else:
            parts.append(
                "      [dim]（未配置 desc，请见 python main.py --help）[/]"
            )
    parts.append("")


def _load_project_keys(main_py: Path, cfg: ProjectPickConfig) -> list[str]:
    """读取工具 config 中项目键列表（排序）；优先用户配置目录（与工具子进程一致）。"""
    from autodrivekit.tool_runtime_paths import resolve_tool_paths

    p = resolve_tool_paths(str(main_py)).config_file(cfg.config_file)
    if not p.is_file():
        return []
    try:
        data = json.loads(p.read_text(encoding="utf-8"))
    except (OSError, json.JSONDecodeError):
        return []
    proj = data.get(cfg.projects_key)
    if not isinstance(proj, dict):
        return []
    return sorted(proj.keys())


def _merge_picked_project_args(
    line: str, picked: str, project_names: frozenset[str]
) -> list[str]:
    """已选项目时：空行=只跑该项目（默认全流程）；未带项目名的命令行末尾自动补项目。"""
    s = line.strip()
    if not s:
        return [picked]
    parts = shlex.split(s)
    if parts and parts[0] in ("list", "feishu-sheets"):
        return parts
    if project_names and not project_names.intersection(parts):
        return parts + [picked]
    return parts


def _interactive_pick_project(names: list[str], tool_id: str) -> str | None:
    """步骤 2：列出项目名，返回所选键；None 表示退出。"""
    lines = [f"{i}) [bold]{rich_escape(n)}[/]" for i, n in enumerate(names, 1)]
    lines.append("0) 退出")
    panel(
        "步骤 2 · 选择项目",
        "\n".join(lines),
        subtitle=f"当前工具：[bold]{rich_escape(tool_id)}[/] · 可输入序号或项目键（如 n50）",
    )
    while True:
        raw = input("  请输入项目 (序号/键名，0/q/回车=退出): ").strip()
        if _menu_wants_exit(raw) or raw == "0":
            return None
        if raw in names:
            return raw
        try:
            idx = int(raw)
            if 1 <= idx <= len(names):
                return names[idx - 1]
        except ValueError:
            pass
        typer.echo("  无效输入，请重试。", err=True)


def _format_tool_guide_body(
    t: ToolInfo, *, picked_project: str | None = None
) -> str:
    """生成「说明与参数」Panel：可选顶部高亮 + hint + 命令表 + 回车说明。"""
    parts: list[str] = []
    if t.default_pipeline_banner:
        parts.append(t.default_pipeline_banner)
        parts.append("")

    if t.hint:
        for para in t.hint.split("\n"):
            parts.append(para)
    else:
        parts.append(
            "接下来输入的内容会原样交给本工具内的 [bold]main.py[/]；"
            "与在该工具目录执行 [dim]python main.py …[/dim] 相同。"
        )
    parts.append("")

    if t.choices:
        _append_param_block(
            parts,
            "可用命令（参数片段）",
            "（传给 main.py；已选项目时多数命令可省略末尾项目名）",
            t.choices,
        )

    if t.examples:
        _append_param_block(
            parts,
            "命令示例",
            "（整行可复制；含项目名；短选项见各工具 --help）",
            t.examples,
        )

    if not t.choices and not t.examples:
        parts.append("（本工具未配置 choices/examples，可输入 h 查看全部参数）")
        parts.append("")

    if picked_project:
        parts.append(
            f"· [bold green]直接回车[/]：[bold yellow]推荐[/] — 对已选项目 "
            f"[bold cyan]{rich_escape(picked_project)}[/] 执行 [bold]完整流水线[/] "
            f"（[dim]python main.py {rich_escape(picked_project)}[/]）"
        )
    else:
        parts.append(
            "· [bold green]直接回车[/]：[bold yellow]推荐[/] — 多数情况下等同 "
            "「无参运行 main.py」，即该工具文档中的 [bold]默认全流程[/]"
        )
    parts.append(
        "· 输入 [bold]h[/] / [bold]?[/] / [bold]help[/]：显示该工具完整参数（与 main.py --help 相同）"
    )
    parts.append(
        "· 输入 [bold]q[/] / [bold]quit[/] / [bold]exit[/]：退出本平台（参数行 [bold]回车[/] 不退出）"
    )
    return "\n".join(parts)


def _prompt_args_interactive(
    main_py: str,
    *,
    picked_project: str | None = None,
    project_names: frozenset[str] | None = None,
) -> list[str] | None:
    """循环读取参数；h 看帮助；q/exit 返回 None。已选项目时合并默认项目名。"""
    names = project_names or frozenset()
    while True:
        line = input("  参数（回车=默认流水线，h=帮助，q=退出）: ")
        stripped = line.strip()
        if _param_wants_exit(stripped):
            return None
        low = stripped.lower()
        if low in ("h", "?", "help", "--help", "-h"):
            rule("完整参数说明（与 python main.py --help 相同）")
            subprocess.run([sys.executable, main_py, "--help"], check=False)
            rule("请继续输入本次要执行的参数（q=退出）")
            continue
        if picked_project is not None:
            return _merge_picked_project_args(stripped, picked_project, names)
        return shlex.split(stripped) if stripped else []


def _interactive_menu(tools: list[ToolInfo]) -> None:
    if not tools:
        typer.echo(f"  未在 {TOOLS_ROOT} 下发现任何带 adk-tool.json 的工具包。", err=True)
        raise typer.Exit(1)

    menu_lines: list[str] = []
    for i, t in enumerate(tools, start=1):
        menu_lines.append(f"{i}) [bold]{t.id}[/]  —  {t.title}")
    menu_lines.append("0) 退出")
    panel(
        "步骤 1 · 选择工具包",
        "\n".join(menu_lines),
        subtitle="选好后进入步骤 2（若该工具配置了项目列表，则先选项目再填参数）。随时可输入 0 / q / quit / exit / 直接回车 退出。",
    )

    choice = input("  请输入序号 (0/q/回车=退出): ").strip()
    if _menu_wants_exit(choice):
        rule("已退出")
        typer.echo("  再见。")
        raise typer.Exit(0)
    try:
        idx = int(choice)
    except ValueError:
        typer.echo("  无效选项。", err=True)
        raise typer.Exit(1)
    if not 1 <= idx <= len(tools):
        typer.echo("  无效选项。", err=True)
        raise typer.Exit(1)

    selected = tools[idx - 1]
    rule(f"已选择 · {selected.id}")

    picked_project: str | None = None
    project_keys: frozenset[str] = frozenset()
    step_param = 2

    if selected.project_pick:
        keys = _load_project_keys(selected.main_py, selected.project_pick)
        project_keys = frozenset(keys)
        if keys:
            picked_project = _interactive_pick_project(keys, selected.id)
            if picked_project is None:
                rule("已退出")
                typer.echo("  再见。")
                raise typer.Exit(0)
            rule(f"已选择项目 · {picked_project}")
            step_param = 3

    panel(
        f"步骤 {step_param} · 说明与参数",
        _format_tool_guide_body(selected, picked_project=picked_project),
        subtitle=f"工具包：{selected.path.name}",
    )

    args = _prompt_args_interactive(
        str(selected.main_py),
        picked_project=picked_project,
        project_names=project_keys if picked_project else None,
    )
    if args is None:
        rule("已退出")
        typer.echo("  再见。")
        raise typer.Exit(0)

    rule("开始执行")
    typer.echo()
    _run_tool(str(selected.main_py), args)


@app.callback(invoke_without_command=True)
def main_callback(
    ctx: typer.Context,
    version: bool = typer.Option(
        False,
        "--version",
        "-v",
        help="显示平台版本号（与 autodrivekit.__version__ 一致）。",
    ),
) -> None:
    if version:
        typer.echo(f"AutoDriveKit {PLATFORM_VERSION}")
        raise typer.Exit(0)
    if ctx.invoked_subcommand is not None:
        return
    _interactive_menu(_TOOLS)


def _make_tool_command(main_path: str):
    def cmd(ctx: typer.Context) -> NoReturn:
        _run_tool(main_path, list(ctx.args))

    return cmd


for _t in _TOOLS:
    # 关闭 Typer 对子命令的 --help/-h 拦截，使「adk <id> --help」透传给工具 main.py，
    # 从而显示各工具 argparse 的完整说明（与 python main.py --help 一致）。
    _short_help = _t.title
    app.command(
        _t.id,
        help=_t.title,
        short_help=_short_help,
        add_help_option=False,
        # 与 Usage「[工具包] [ARGS]…」一致；工具包无 Typer 级 [OPTIONS]
        options_metavar="[ARGS]...",
        context_settings={"allow_extra_args": True, "ignore_unknown_options": True},
    )(_make_tool_command(str(_t.main_py.resolve())))


def run() -> None:
    app()


if __name__ == "__main__":
    run()
