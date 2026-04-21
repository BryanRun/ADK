"""扫描 tools/ 下符合规范的子工具并解析 adk-tool.json。"""

from __future__ import annotations

import json
from dataclasses import dataclass
from pathlib import Path

from autodrivekit._paths import TOOLS_ROOT

MANIFEST_NAME = "adk-tool.json"


@dataclass(frozen=True)
class ParamItem:
    """交互菜单中的一条参数：命令行片段 + 能力说明。"""

    arg: str
    desc: str


@dataclass(frozen=True)
class ProjectPickConfig:
    """交互菜单中「先选项目」：从工具目录下 JSON 读取项目键列表。"""

    config_file: str
    projects_key: str = "projects"


@dataclass(frozen=True)
class ToolInfo:
    """单个已注册工具。"""

    id: str
    title: str
    entry: str
    path: Path
    hint: str | None = None
    choices: tuple[ParamItem, ...] = ()
    examples: tuple[ParamItem, ...] = ()
    # 选完工具后先列出 config 中的项目名供选择；无则跳过该步
    project_pick: ProjectPickConfig | None = None
    # 步骤「说明与参数」顶部高亮块（Rich markup），用于标注默认/推荐流水线
    default_pipeline_banner: str | None = None

    @property
    def main_py(self) -> Path:
        return self.path / self.entry


def _parse_param_items(
    raw: object,
    field: str,
    manifest: Path,
) -> tuple[ParamItem, ...]:
    """解析 choices / examples：支持 `{ \"arg\", \"desc\" }` 或兼容旧版纯字符串。"""
    if raw is None:
        return ()
    if not isinstance(raw, list):
        raise ValueError(f"无效 manifest（{field} 须为数组）: {manifest}")

    out: list[ParamItem] = []
    for item in raw:
        if isinstance(item, str):
            s = item.strip()
            if not s:
                continue
            out.append(ParamItem(arg=s, desc=""))
        elif isinstance(item, dict):
            arg = (item.get("arg") or item.get("line") or "").strip()
            desc = (
                item.get("desc")
                or item.get("about")
                or item.get("description")
                or ""
            )
            desc = str(desc).strip()
            if not arg:
                raise ValueError(f"无效 manifest（{field} 项缺少 arg）: {manifest}")
            out.append(ParamItem(arg=arg, desc=desc))
        else:
            raise ValueError(f"无效 manifest（{field} 项须为字符串或对象）: {manifest}")
    return tuple(out)


def discover_tools() -> list[ToolInfo]:
    """发现 ``tools/<包名>/adk-tool.json`` 定义的全部工具。"""
    if not TOOLS_ROOT.is_dir():
        return []

    raw: list[tuple[int, ToolInfo]] = []
    for d in sorted(TOOLS_ROOT.iterdir()):
        if not d.is_dir():
            continue
        manifest = d / MANIFEST_NAME
        if not manifest.is_file():
            continue
        data = json.loads(manifest.read_text(encoding="utf-8"))
        tid = data.get("id")
        if not tid or not isinstance(tid, str):
            raise ValueError(f"无效 manifest（缺少 id）: {manifest}")
        entry = data.get("entry") or "main.py"
        title = data.get("title") or tid
        order = data.get("order")
        if order is None:
            order_num = 100
        else:
            try:
                order_num = int(order)
            except (TypeError, ValueError):
                order_num = 100

        hint_raw = data.get("hint")
        if hint_raw is None or (isinstance(hint_raw, str) and not hint_raw.strip()):
            hint_val: str | None = None
        else:
            hint_val = str(hint_raw).strip()

        choices_val = _parse_param_items(data.get("choices"), "choices", manifest)
        examples_val = _parse_param_items(data.get("examples"), "examples", manifest)

        pp_raw = data.get("interactive_project_pick")
        pick_val: ProjectPickConfig | None = None
        if isinstance(pp_raw, dict):
            cf = (pp_raw.get("config") or "config.json").strip()
            pk = (pp_raw.get("projects_key") or "projects").strip()
            if cf:
                pick_val = ProjectPickConfig(config_file=cf, projects_key=pk)

        banner_raw = data.get("default_pipeline_banner")
        banner_val: str | None = None
        if isinstance(banner_raw, str) and banner_raw.strip():
            banner_val = banner_raw.strip()

        raw.append(
            (
                order_num,
                ToolInfo(
                    id=tid.strip(),
                    title=str(title).strip(),
                    entry=str(entry).strip(),
                    path=d.resolve(),
                    hint=hint_val,
                    choices=choices_val,
                    examples=examples_val,
                    project_pick=pick_val,
                    default_pipeline_banner=banner_val,
                ),
            )
        )

    raw.sort(key=lambda x: (x[0], x[1].id))
    tools = [t for _, t in raw]

    ids = [t.id for t in tools]
    if len(ids) != len(set(ids)):
        raise ValueError(f"工具 id 重复: {ids}")

    return tools


def get_tool_by_id(tool_id: str) -> ToolInfo | None:
    for t in discover_tools():
        if t.id == tool_id:
            return t
    return None
