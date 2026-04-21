"""``adk doctor``：体检平台安装、用户配置、工具配置一致性、环境变量与依赖；输出诊断与建议。"""

from __future__ import annotations

import json
import os
import platform
import sys
from dataclasses import dataclass, field
from pathlib import Path
from typing import Any

from rich.console import Console
from rich.panel import Panel
from rich.table import Table
from rich import box

from autodrivekit import __version__ as PLATFORM_VERSION
from autodrivekit._paths import TOOLS_ROOT
from autodrivekit.registry import discover_tools
from autodrivekit.user_layout import (
    is_managed_install,
    managed_current_link,
    platform_settings_path,
    user_config_dir,
    user_data_dir,
)


_LEVELS = {"ok": "green", "info": "cyan", "warn": "yellow", "err": "red"}
_MARKERS = {"ok": "✓", "info": "i", "warn": "!", "err": "✗"}


@dataclass
class Report:
    hints: list[tuple[str, str]] = field(default_factory=list)

    def add(self, level: str, msg: str) -> None:
        self.hints.append((level, msg))


def _status(level: str, text: str) -> str:
    color = _LEVELS.get(level, "white")
    marker = _MARKERS.get(level, "·")
    return f"[{color}]{marker} {text}[/{color}]"


def _load_json(path: Path) -> dict[str, Any] | None:
    if not path.is_file():
        return None
    try:
        data = json.loads(path.read_text(encoding="utf-8"))
    except (OSError, json.JSONDecodeError):
        return None
    return data if isinstance(data, dict) else None


def _project_keys(data: dict[str, Any] | None, key: str = "projects") -> set[str]:
    if not data:
        return set()
    proj = data.get(key)
    if not isinstance(proj, dict):
        return set()
    return set(proj.keys())


def _platform_section(console: Console, rep: Report) -> None:
    t = Table(show_header=False, box=box.SIMPLE, pad_edge=False, padding=(0, 1))
    t.add_column(style="bold", no_wrap=True)
    t.add_column()
    t.add_row("版本", PLATFORM_VERSION)
    managed = is_managed_install()
    install_kind = "托管 (managed)" if managed else "可编辑 / 源码 (editable)"
    t.add_row("安装类型", install_kind)
    if managed:
        try:
            t.add_row("current 指向", str(managed_current_link().resolve()))
        except OSError:
            t.add_row("current 指向", "[red](无法解析)[/red]")
    t.add_row("Python", f"{platform.python_version()} @ {sys.executable}")
    t.add_row("系统", f"{platform.system()} {platform.release()}")
    console.print(Panel(t, title="平台", title_align="left", border_style="cyan"))


def _user_dirs_section(console: Console, rep: Report) -> None:
    cfg = user_config_dir()
    data = user_data_dir()
    settings = platform_settings_path()

    t = Table(show_header=False, box=box.SIMPLE, pad_edge=False, padding=(0, 1))
    t.add_column(style="bold", no_wrap=True)
    t.add_column()
    t.add_column()

    t.add_row(
        "配置目录",
        str(cfg),
        _status("ok" if cfg.is_dir() else "warn", "存在" if cfg.is_dir() else "缺失"),
    )
    t.add_row(
        "数据目录",
        str(data),
        _status("ok" if data.is_dir() else "warn", "存在" if data.is_dir() else "缺失"),
    )

    if settings.is_file():
        sdata = _load_json(settings)
        ver = (sdata or {}).get("schema_version", "?")
        t.add_row("adk.json", str(settings), _status("ok", f"schema v{ver}"))
    else:
        t.add_row("adk.json", str(settings), _status("warn", "缺失（下次启动 `adk` 自动生成）"))
        rep.add("info", "首次启动会自动创建 ~/.config/adk/adk.json。")

    console.print(Panel(t, title="用户目录", title_align="left", border_style="cyan"))


def _env_section(console: Console, rep: Report) -> None:
    names = [
        ("AUTODRIVEKIT_USER_CONFIG_DIR", "父 / 子进程共用的用户配置根"),
        ("AUTODRIVEKIT_USER_DATA_DIR", "父 / 子进程共用的用户数据根"),
        ("XDG_CONFIG_HOME", "若设置，覆盖 ~/.config 的选择"),
        ("XDG_DATA_HOME", "若设置，覆盖 ~/.local/share 的选择"),
        ("FEISHU_APP_ID", "adk update / manifest 上传依赖"),
        ("FEISHU_APP_SECRET", "adk update / manifest 上传依赖"),
        ("ADK_FEISHU_MANIFEST_FILE_TOKEN", "覆盖 manifest 节点 token"),
    ]
    t = Table(show_header=False, box=box.SIMPLE, pad_edge=False, padding=(0, 1))
    t.add_column(style="bold", no_wrap=True)
    t.add_column()
    t.add_column()

    cfg_dir = str(user_config_dir())
    data_dir = str(user_data_dir())
    for n, desc in names:
        v = os.environ.get(n, "").strip()
        if v:
            t.add_row(n, v, _status("ok", "已设置"))
            if n == "AUTODRIVEKIT_USER_CONFIG_DIR" and Path(v) != Path(cfg_dir):
                rep.add(
                    "warn",
                    f"AUTODRIVEKIT_USER_CONFIG_DIR={v} 与 user_config_dir()={cfg_dir} 不一致；"
                    "交互菜单与工具子进程可能读不同配置。",
                )
            if n == "AUTODRIVEKIT_USER_DATA_DIR" and Path(v) != Path(data_dir):
                rep.add(
                    "warn",
                    f"AUTODRIVEKIT_USER_DATA_DIR={v} 与 user_data_dir()={data_dir} 不一致。",
                )
        else:
            lv = "warn" if n in {"FEISHU_APP_ID", "FEISHU_APP_SECRET"} else "info"
            t.add_row(n, "[dim](未设置)[/dim]", _status(lv, desc))
            if n in {"FEISHU_APP_ID", "FEISHU_APP_SECRET"}:
                rep.add("warn", f"{n} 未设置；`adk update` 无法获取 manifest。")

    console.print(Panel(t, title="环境变量", title_align="left", border_style="cyan"))


def _tools_section(console: Console, rep: Report) -> None:
    tools = discover_tools()
    if not tools:
        console.print(
            Panel(
                f"未在 {TOOLS_ROOT} 下发现任何 adk-tool.json",
                title="工具",
                title_align="left",
                border_style="yellow",
            )
        )
        rep.add("warn", f"TOOLS_ROOT={TOOLS_ROOT} 下未发现工具；检查发版完整性。")
        return

    t = Table(show_header=True, box=box.SIMPLE, pad_edge=False, padding=(0, 1))
    t.add_column("工具", style="bold magenta", no_wrap=True)
    t.add_column("bundle config", overflow="fold")
    t.add_column("user config", overflow="fold")
    t.add_column("项目(bundle/user)", no_wrap=True)
    t.add_column("状态")

    cfg_root = user_config_dir()

    for tool in tools:
        bundle_cfg = tool.path / "config.json"
        user_cfg = cfg_root / tool.path.name / "config.json"
        key = tool.project_pick.projects_key if tool.project_pick else "projects"

        bundle_data = _load_json(bundle_cfg) if bundle_cfg.is_file() else None
        user_data = _load_json(user_cfg) if user_cfg.is_file() else None
        bundle_keys = _project_keys(bundle_data, key)
        user_keys = _project_keys(user_data, key)

        if bundle_cfg.is_file():
            try:
                bundle_cell = str(bundle_cfg.relative_to(TOOLS_ROOT.parent))
            except ValueError:
                bundle_cell = str(bundle_cfg)
        else:
            bundle_cell = f"[yellow]缺失[/yellow] {bundle_cfg}"

        if user_cfg.is_file():
            user_cell = str(user_cfg)
        else:
            user_cell = f"[yellow]缺失[/yellow] {user_cfg}"
            rep.add(
                "info",
                f"{tool.id}: 用户配置缺失；首次运行 `adk` 会从 bundle 复制。",
            )

        proj_cell = f"{len(bundle_keys)} / {len(user_keys)}"

        only_bundle = bundle_keys - user_keys
        only_user = user_keys - bundle_keys
        if not tool.project_pick:
            status = _status("info", "未启用项目选择")
        elif not user_cfg.is_file():
            status = _status("warn", "待 seed")
        elif only_bundle or only_user:
            bits = []
            if only_bundle:
                bits.append(f"bundle 独有: {','.join(sorted(only_bundle))}")
            if only_user:
                bits.append(f"user 独有: {','.join(sorted(only_user))}")
            status = _status("warn", " | ".join(bits))
            rep.add(
                "warn",
                f"{tool.id}: bundle 与用户配置的项目列表不一致（"
                + "；".join(bits)
                + "）。交互菜单以用户配置为准；若项目应共享，请在用户配置中维护。",
            )
        else:
            status = _status("ok", "一致")

        t.add_row(tool.id, bundle_cell, user_cell, proj_cell, status)

    console.print(
        Panel(t, title=f"工具 ({len(tools)})", title_align="left", border_style="cyan")
    )


def _deps_section(console: Console, rep: Report) -> None:
    deps = ["typer", "rich", "requests", "openpyxl", "jinja2"]
    t = Table(show_header=False, box=box.SIMPLE, pad_edge=False, padding=(0, 1))
    t.add_column(style="bold", no_wrap=True)
    t.add_column()
    t.add_column()
    for name in deps:
        try:
            mod = __import__(name)
            ver = getattr(mod, "__version__", "?")
            t.add_row(name, str(ver), _status("ok", "已安装"))
        except ImportError:
            t.add_row(name, "[dim]-[/dim]", _status("err", "未安装"))
            rep.add("err", f"依赖 {name} 未安装；请执行 `pip install -e .`。")
    console.print(Panel(t, title="依赖", title_align="left", border_style="cyan"))


def _hints_section(console: Console, rep: Report) -> None:
    if not rep.hints:
        console.print(
            Panel(
                "[green]✓ 未发现需处理的问题。[/green]",
                title="建议",
                title_align="left",
                border_style="green",
            )
        )
        return
    lines = []
    for level, msg in rep.hints:
        color = _LEVELS.get(level, "white")
        marker = _MARKERS.get(level, "·")
        lines.append(f"[{color}]{marker}[/{color}] {msg}")
    if any(lv == "err" for lv, _ in rep.hints):
        border = "red"
    elif any(lv == "warn" for lv, _ in rep.hints):
        border = "yellow"
    else:
        border = "cyan"
    console.print(
        Panel("\n".join(lines), title="建议", title_align="left", border_style=border)
    )


def run_doctor() -> None:
    console = Console()
    console.rule("[bold]AutoDriveKit 体检 (adk doctor)[/bold]")
    rep = Report()
    _platform_section(console, rep)
    _user_dirs_section(console, rep)
    _env_section(console, rep)
    _tools_section(console, rep)
    _deps_section(console, rep)
    _hints_section(console, rep)
    console.rule()
