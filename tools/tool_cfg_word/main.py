#!/usr/bin/env python3
"""cfg-word — 整车配置字映射表的生成、更新维护与部署

实现目录：tools/tool_cfg_word/（对外 CLI：adk cfg-word）

兼责：在 carpropertylist 在线表格中维护 psis.car_cfg 子表（property-sync）。

流水线: 本地 Excel 解析 → 飞书中间表格同步 → 版本快照 → 校验 → 飞书 psis.car_cfg（弱依赖）→ C 头文件生成 → Git 仓库部署
"""

import argparse
import json
import os
import sys

from lib.term_color import green, red, yellow

SCRIPT_DIR = os.path.dirname(os.path.abspath(__file__))
VERSION = "1.3.0"
CONFIG_FILE = "config.json"
NAME_MAPPING_FILE = "name_mapping.json"

try:
    from autodrivekit.tool_runtime_paths import (
        ensure_tool_config_seeded,
        ensure_workspace_file_seeded,
        resolve_tool_paths,
    )

    _PATHS = resolve_tool_paths(__file__)
    ensure_tool_config_seeded(_PATHS, "config.json")
    ensure_workspace_file_seeded(_PATHS, "name_mapping.json")
    _WORKSPACE_ROOT = str(_PATHS.workspace_dir)
    _BUNDLE_ROOT = str(_PATHS.bundle_dir)
except ImportError:
    _PATHS = None
    _WORKSPACE_ROOT = SCRIPT_DIR
    _BUNDLE_ROOT = SCRIPT_DIR

# ---------------------------------------------------------------------------
# Config helpers
# ---------------------------------------------------------------------------

def load_config():
    if _PATHS:
        path = str(_PATHS.config_file(CONFIG_FILE))
    else:
        path = os.path.join(SCRIPT_DIR, CONFIG_FILE)
    try:
        with open(path, "r", encoding="utf-8") as f:
            return json.load(f)
    except Exception as e:
        print(red(f"✘ 无法读取配置文件 {path}: {e}"))
        sys.exit(1)


def resolve_projects(names, all_projects):
    """Return list of project names to process. None on error."""
    if not names:
        return list(all_projects.keys())
    for n in names:
        if n not in all_projects:
            print(red(f"✘ 未知项目 '{n}'，可用项目: {', '.join(all_projects.keys())}"))
            return None
    return names

# ---------------------------------------------------------------------------
# Pipeline steps (imported lazily to keep startup fast)
# ---------------------------------------------------------------------------

def step_parse(project_name, project_config, cfg):
    """Parse local Excel → structured ConfigItem list."""
    from lib.parsers import get_parser
    from lib.version_detect import find_latest_file
    from lib.name_mapping import load_mapping, apply_mapping

    input_cfg = project_config["input"]
    input_dir = os.path.join(_WORKSPACE_ROOT, input_cfg["dir"])
    sheet_name = input_cfg["sheet"]
    parser_name = input_cfg["parser"]

    if not input_dir or not sheet_name or not parser_name:
        print(red(f"  ✘ 项目 {project_name} 的 input 配置不完整，跳过"))
        return None

    excel_path = find_latest_file(input_dir)
    if not excel_path:
        if not os.path.isdir(input_dir):
            print(red(f"  ✘ 输入目录不存在: {input_dir}"))
            print(yellow(f"    请创建该目录并放入配置字 Excel 文件（.xlsx / .xlsm / .xls）"))
        else:
            print(red(f"  ✘ 输入目录中无 Excel 文件: {input_dir}"))
            print(yellow(f"    请将配置字 Excel 文件（.xlsx / .xlsm / .xls）放入上述目录"))
        return None

    print(f"  输入文件: {os.path.basename(excel_path)}")
    print(f"  工作表:   {sheet_name}")

    parser = get_parser(parser_name)
    if parser is None:
        print(red(f"  ✘ 未知解析器 '{parser_name}'"))
        return None

    items = parser(excel_path, sheet_name)
    print(f"  解析到 {len(items)} 个配置项")

    n_bytes = project_config.get("vehicle_config_byte_count")
    if n_bytes is not None:
        try:
            n_bytes = int(n_bytes)
        except (TypeError, ValueError):
            n_bytes = None
        if n_bytes is not None and n_bytes >= 1:
            from lib.gap_fill import fill_missing_bytes_with_full_reserved

            before = len(items)
            items = fill_missing_bytes_with_full_reserved(items, n_bytes)
            added = len(items) - before
            if added:
                print(
                    f"  缺失字节补全（整字节 8bit reserved）: +{added} 行 → 共 {len(items)} 个配置项"
                )

    mapping = load_mapping(project_name)
    items, missing = apply_mapping(items, mapping)
    if missing:
        from lib.feishu_config import resolve_feishu_sheet_for_project
        from lib.name_mapping import init_mapping_from_feishu

        resolved = resolve_feishu_sheet_for_project(cfg, project_config, verbose=False)
        if resolved[0] is not None:
            _tok, spreadsheet, sheet_id = resolved
            print(yellow(f"  ⚠ {len(missing)} 个配置项缺少映射，尝试从飞书自动拉取..."))
            init_mapping_from_feishu(project_name, spreadsheet, sheet_id)
            mapping = load_mapping(project_name)
            items, missing = apply_mapping(items, mapping)

        if missing:
            print(red(f"  ✘ 以下配置项缺少英文宏名映射，请补充 {NAME_MAPPING_FILE}:"))
            for m in missing:
                print(red(f"    - \"{m}\""))
            return None

    return items


def step_sync(project_name, project_config, cfg, items):
    """Sync parsed items to Feishu intermediate spreadsheet."""
    from lib.feishu_config import resolve_feishu_sheet_for_project
    from lib.feishu_sync import sync_to_feishu

    resolved = resolve_feishu_sheet_for_project(cfg, project_config, verbose=True)
    if resolved[0] is None:
        return False
    token, spreadsheet, sheet_id = resolved
    return sync_to_feishu(
        token, spreadsheet, sheet_id, project_name, items, project_config
    )


def step_generate(project_name, project_config, cfg, items):
    """Generate cfg_cal.h from parsed items."""
    from lib.codegen import generate_cfg_cal_h

    bit_order = project_config.get("bit_order", "reverse")
    output_dir = os.path.join(_WORKSPACE_ROOT, "output", project_name)
    os.makedirs(output_dir, exist_ok=True)
    output_file = os.path.join(output_dir, "cfg_cal.h")

    generate_cfg_cal_h(items, output_file, project_name, bit_order)
    print(f"  生成完成: {output_file}")
    return True


def step_deploy(project_name, project_config, cfg):
    """Deploy generated files to target git repo."""
    from lib.deploy import deploy_project

    deploy_cfg = project_config.get("deploy", {})
    if not deploy_cfg.get("repo") or not deploy_cfg.get("target"):
        print(red(f"  ✘ 项目 {project_name} 的 deploy 配置不完整，跳过"))
        return False

    output_dir = os.path.join(_WORKSPACE_ROOT, "output", project_name)
    return deploy_project(project_name, output_dir, deploy_cfg)


def step_validate(project_name, project_config, cfg, items):
    """校验 BYTE/BIT 结构（通用规则 + 项目可选总字节数）。"""
    from lib.config_validate import validate_config_word_items

    ok, errs = validate_config_word_items(project_name, project_config, items)
    if not ok:
        print(red("  ✘ 配置字校验未通过:"))
        for e in errs:
            print(red(f"    - {e}"))
        return False
    return True


def step_snapshot(project_name, project_config, cfg):
    """为飞书中间表格创建命名版本快照。"""
    from datetime import datetime

    from lib.feishu_config import resolve_feishu_sheet_for_project
    from lib.feishu_api import create_version

    resolved = resolve_feishu_sheet_for_project(cfg, project_config, verbose=False)
    if resolved[0] is None:
        return False
    token, spreadsheet, _sheet_id = resolved
    name = f"{project_name} {datetime.now().strftime('%Y-%m-%d %H:%M')}"
    return create_version(token, spreadsheet, name)


def step_property_sync(project_name, project_config, cfg, items):
    """增量同步解析结果到飞书 Property 表 psis.car_cfg（独立在线表格，见 property_sync）。"""
    from lib.feishu_api import get_token
    from lib.feishu_config import resolve_feishu_sheet_for_project, resolve_property_sync_sheet
    from lib.property_sync import sync_psis_car_cfg

    ps = project_config.get("property_sync")
    if not ps or not isinstance(ps, dict):
        print(yellow("  未配置 property_sync，跳过"))
        return True
    if not (str(ps.get("spreadsheet") or "")).strip():
        print(yellow("  未配置 property_sync.spreadsheet，跳过"))
        return True

    token = get_token()
    if not token:
        return False
    spreadsheet, sheet_id = resolve_property_sync_sheet(token, ps, verbose=True)
    if not spreadsheet or not sheet_id:
        return False
    sheet_name = (ps.get("sheet_name") or "").strip()

    mid_spreadsheet = None
    mid_sheet_id = None
    mid_resolved = resolve_feishu_sheet_for_project(cfg, project_config, verbose=False)
    if mid_resolved[0] is not None:
        mid_spreadsheet = mid_resolved[1]
        mid_sheet_id = mid_resolved[2]

    return sync_psis_car_cfg(
        token, spreadsheet, sheet_id, items, sheet_name,
        mid_token=token, mid_spreadsheet=mid_spreadsheet, mid_sheet_id=mid_sheet_id,
    )

# ---------------------------------------------------------------------------
# Commands
# ---------------------------------------------------------------------------

ACTIONS = {
    "parse",
    "sync",
    "snapshot",
    "validate",
    "property-sync",
    "generate",
    "gen",
    "deploy",
    "list",
    "init-mapping",
    "feishu-sheets",
}
SHORT_FLAGS = {
    "p": "parse",
    "s": "sync",
    "S": "snapshot",
    "V": "validate",
    "P": "property-sync",
    "g": "generate",
    "d": "deploy",
    "l": "list",
}


def cmd_run(project_names, actions, all_projects, cfg):
    """强依赖（失败则中止本项目后续步骤）: parse → sync → snapshot → validate → generate → deploy。
    弱依赖: property-sync（失败仅告警，继续后续步骤）。"""
    targets = resolve_projects(project_names, all_projects)
    if targets is None:
        return

    do_parse = "parse" in actions
    do_sync = "sync" in actions
    do_snapshot = "snapshot" in actions
    do_validate = "validate" in actions
    do_property_sync = "property-sync" in actions
    do_gen = "generate" in actions or "gen" in actions
    do_deploy = "deploy" in actions

    need_items = (
        do_parse
        or do_sync
        or do_validate
        or do_gen
        or do_property_sync
    )

    for pname in targets:
        pcfg = all_projects[pname]
        print(f"\n{'='*60}")
        print(f"项目: {pname} — {pcfg.get('description', '')}")
        print(f"{'='*60}")

        items = None
        if need_items:
            print("\n[parse] 解析本地 Excel...")
            items = step_parse(pname, pcfg, cfg)
            if items is None:
                print(red("  ✘ [parse] 失败（强依赖），已中止本项目后续步骤"))
                continue
            print(green("  ✓ [parse] 成功"))

        if do_sync and items is not None:
            print("\n[sync] 同步飞书中间表格...")
            if not step_sync(pname, pcfg, cfg, items):
                print(red("  ✘ [sync] 失败（强依赖），已中止本项目后续步骤"))
                continue
            print(green("  ✓ [sync] 成功"))

        if do_snapshot:
            print("\n[snapshot] 创建飞书版本快照...")
            if not step_snapshot(pname, pcfg, cfg):
                print(red("  ✘ [snapshot] 失败（强依赖），已中止本项目后续步骤"))
                continue
            print(green("  ✓ [snapshot] 成功"))

        if do_validate and items is not None:
            print("\n[validate] 配置字结构校验...")
            if not step_validate(pname, pcfg, cfg, items):
                print(red("  ✘ [validate] 失败（强依赖），已中止本项目后续步骤"))
                continue
            print(green("  ✓ [validate] 成功"))

        if do_property_sync and items is not None:
            print("\n[property-sync] 同步飞书 psis.car_cfg（弱依赖）...")
            if not step_property_sync(pname, pcfg, cfg, items):
                print(
                    yellow(
                        "  ⚠ [property-sync] 失败（非强依赖），继续执行 generate/deploy"
                    )
                )
            else:
                print(green("  ✓ [property-sync] 成功"))

        if do_gen and items is not None:
            print("\n[generate] 生成代码...")
            if not step_generate(pname, pcfg, cfg, items):
                print(red("  ✘ [generate] 失败（强依赖），已中止本项目后续步骤"))
                continue
            print(green("  ✓ [generate] 成功"))

        if do_deploy:
            print("\n[deploy] 部署到目标仓库...")
            if not step_deploy(pname, pcfg, cfg):
                print(red("  ✘ [deploy] 失败（强依赖）"))
            else:
                print(green("  ✓ [deploy] 成功"))

    print()


def cmd_list(all_projects):
    from lib.version_detect import find_latest_file

    print(f"\n已配置项目 ({len(all_projects)} 个):\n")
    for name, pcfg in all_projects.items():
        desc = pcfg.get("description", "")
        input_dir = os.path.join(_WORKSPACE_ROOT, pcfg.get("input", {}).get("dir", ""))
        latest = find_latest_file(input_dir) if input_dir else None
        if latest:
            latest_disp = os.path.basename(latest)
        elif not os.path.isdir(input_dir):
            latest_disp = red(f"(目录不存在: {input_dir})")
        else:
            latest_disp = red("(目录中无 Excel 文件)")
        parser = pcfg.get("input", {}).get("parser", "")
        parser_disp = parser if parser else red("(未配置)")
        fs_name = pcfg.get("feishu_sheet_name", "")
        sheet_id = pcfg.get("feishu_sheet_id", "")
        feishu_sheet_disp = (
            f"「{fs_name}」" if fs_name else (sheet_id if sheet_id else red("(未配置)"))
        )
        bit_order = pcfg.get("bit_order", "reverse")
        byte_count = pcfg.get("vehicle_config_byte_count")
        byte_disp = str(byte_count) if byte_count else red("(未配置)")
        deploy = pcfg.get("deploy", {})
        repo = deploy.get("repo", "")
        repo_disp = repo if repo else red("(未配置)")
        ps = pcfg.get("property_sync") or {}
        ps_disp = (
            ps.get("sheet_name") or ps.get("sheet_id") or red("(未配置)")
            if ps.get("spreadsheet")
            else red("(未配置)")
        )

        print(f"  {name}")
        print(f"    描述:       {desc}")
        print(f"    最新输入:   {latest_disp}")
        print(f"    解析器:     {parser_disp}")
        print(f"    飞书子表:   {feishu_sheet_disp}")
        print(f"    Bit顺序:   {bit_order}")
        print(f"    字节总数:   {byte_disp}")
        print(f"    Property表: {ps_disp}")
        print(f"    部署仓库:   {repo_disp}")
        print()


def cmd_init_mapping(project_names, all_projects, cfg):
    from lib.feishu_config import resolve_feishu_sheet_for_project
    from lib.name_mapping import init_mapping_from_feishu

    targets = resolve_projects(project_names, all_projects)
    if targets is None:
        return

    for pname in targets:
        pcfg = all_projects[pname]
        print(f"\n初始化 {pname} 的名称映射...")
        resolved = resolve_feishu_sheet_for_project(cfg, pcfg, verbose=True)
        if resolved[0] is None:
            continue
        _tok, spreadsheet, sheet_id = resolved
        init_mapping_from_feishu(pname, spreadsheet, sheet_id)


def cmd_feishu_sheets(cfg):
    """列出 feishu_document 中全部子表标题与 sheet_id，便于填写 feishu_sheet_name。"""
    from lib.feishu_api import get_token
    from lib.feishu_config import (
        get_spreadsheet_ref_from_config,
        list_document_sheets,
        parse_spreadsheet_token,
    )

    ref = get_spreadsheet_ref_from_config(cfg)
    if not ref:
        print(red("✘ 请在 config.json 顶层配置 feishu_document 或 feishu_spreadsheet"))
        return
    try:
        spreadsheet_token = parse_spreadsheet_token(ref)
    except ValueError as e:
        print(red(f"✘ {e}"))
        return
    print(f"文档 token: {spreadsheet_token}")
    token = get_token()
    if not token:
        return
    list_document_sheets(token, spreadsheet_token)

# ---------------------------------------------------------------------------
# Main
# ---------------------------------------------------------------------------

def main():
    os.chdir(_WORKSPACE_ROOT)

    parser = argparse.ArgumentParser(
        description="cfg-word — 整车配置字映射表；parse → sync → snapshot → validate → property-sync → generate → deploy",
        epilog="示例: python main.py n50 / python main.py sync n50 / python main.py -sP n50",
    )
    parser.add_argument(
        "args",
        nargs="*",
        help="动作 (parse/sync/snapshot/validate/property-sync/generate/deploy/list/init-mapping/feishu-sheets) 和/或项目名",
    )
    parser.add_argument("-p", action="store_true", help="parse: 解析本地 Excel")
    parser.add_argument("-s", action="store_true", help="sync: 同步飞书中间表格")
    parser.add_argument("-S", action="store_true", help="snapshot: 为飞书中间表格创建版本快照")
    parser.add_argument(
        "-V",
        action="store_true",
        help="validate: 校验 BYTE/BIT（含项目可选总字节数）",
    )
    parser.add_argument(
        "-P",
        action="store_true",
        help="property-sync: 同步飞书 psis.car_cfg（独立表格，见 property_sync）",
    )
    parser.add_argument("-g", action="store_true", help="generate: 生成代码")
    parser.add_argument("-d", action="store_true", help="deploy: 部署到仓库")
    parser.add_argument("-l", action="store_true", help="list: 查看项目配置")
    parser.add_argument("-v", "--version", action="store_true", help="显示版本号")
    args = parser.parse_args()

    if args.version:
        print(f"cfg-word v{VERSION}")
        return

    cfg = load_config()
    all_projects = cfg.get("projects", {})

    actions = set()
    project_names = []

    for a in args.args:
        if a in ACTIONS:
            if a == "gen":
                actions.add("generate")
            else:
                actions.add(a)
        elif a.startswith("-"):
            for ch in a[1:]:
                if ch in SHORT_FLAGS:
                    actions.add(SHORT_FLAGS[ch])
        else:
            project_names.append(a)

    if args.p: actions.add("parse")
    if args.s: actions.add("sync")
    if args.S: actions.add("snapshot")
    if args.V: actions.add("validate")
    if args.P: actions.add("property-sync")
    if args.g: actions.add("generate")
    if args.d: actions.add("deploy")
    if args.l: actions.add("list")

    if "list" in actions:
        cmd_list(all_projects)
        return

    if "init-mapping" in actions:
        cmd_init_mapping(project_names, all_projects, cfg)
        return

    if "feishu-sheets" in actions:
        cmd_feishu_sheets(cfg)
        return

    if not actions:
        actions = {
            "parse",
            "sync",
            "snapshot",
            "validate",
            "property-sync",
            "generate",
            "deploy",
        }

    cmd_run(project_names, actions, all_projects, cfg)


if __name__ == "__main__":
    main()
