#!/usr/bin/env python3
"""vhal-svc — 基于 VHAL 表，面向 vehicleservice 模块的抓取、生成、部署与编译

实现目录：tools/tool_vhal_svc/（对外 CLI：adk vhal-svc）

暂定名 vhal-svc：VHAL + VehicleService。后续若统一命名规范可再调整 id。

fetch → generate → deploy → compile 为**强依赖链**：任一步失败则本项目后续步骤跳过且整次运行记为失败。
"""

from __future__ import annotations

import argparse
import glob
import json
import os
import re
import shutil
import subprocess
import sys

SCRIPT_DIR = os.path.dirname(os.path.abspath(__file__))
sys.path.insert(0, SCRIPT_DIR)
from lib.term_color import green, red, yellow

try:
    from autodrivekit.tool_runtime_paths import ensure_tool_config_seeded, resolve_tool_paths

    _PATHS = resolve_tool_paths(__file__)
    ensure_tool_config_seeded(_PATHS, "config.json")
    _WORKSPACE_ROOT = str(_PATHS.workspace_dir)
    _BUNDLE_ROOT = str(_PATHS.bundle_dir)
except ImportError:
    _PATHS = None
    _WORKSPACE_ROOT = SCRIPT_DIR
    _BUNDLE_ROOT = SCRIPT_DIR

# 内嵌 VehicleGenerateTool（QA）脚本与 template/ 的工作目录
VEHICLE_GEN_ROOT = os.path.join(_BUNDLE_ROOT, "vehicle_generate")
VERSION = "0.3.4"
CONFIG_FILE = "config.json"

ACTIONS = {
    "fetch",
    "generate",
    "gen",
    "deploy",
    "compile",
    "list",
}
SHORT_FLAGS = {
    "f": "fetch",
    "g": "generate",
    "d": "deploy",
    "c": "compile",
    "l": "list",
}


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
    if not names:
        return list(all_projects.keys())
    for n in names:
        if n not in all_projects:
            print(red(f"✘ 未知项目 '{n}'，可用项目: {', '.join(all_projects.keys())}"))
            return None
    return names


_GEN_VERBOSE_ENVS = frozenset({"1", "true", "yes", "on"})


def _generate_verbose() -> bool:
    return os.environ.get("VHAL_SVC_GEN_VERBOSE", "").strip().lower() in _GEN_VERBOSE_ENVS


def _report_generate_subprocess(proc: subprocess.CompletedProcess) -> None:
    """默认抑制 VehicleGenerateTool 冗长 stdout；失败时给出尾部摘要；详请见 VHAL_SVC_GEN_VERBOSE。"""
    out = (proc.stdout or "").rstrip()
    err = (proc.stderr or "").rstrip()
    lines = out.splitlines() if out else []
    verbose = _generate_verbose()

    if proc.returncode != 0:
        print(red(f"  ✘ 生成脚本退出码 {proc.returncode}"))
        if err:
            print(red("  --- stderr ---"), file=sys.stderr)
            print(err, file=sys.stderr)
        if lines:
            tail = lines if verbose else lines[-80:]
            label = "stdout" if verbose else f"stdout（末尾 {len(tail)}/{len(lines)} 行）"
            print(red(f"  --- {label} ---"))
            print("\n".join(tail))
        return

    if verbose:
        if out:
            print(out)
        if err:
            print(err, file=sys.stderr)
        return

    if err.strip():
        print(yellow("  [generate] stderr:"), file=sys.stderr)
        print(err, file=sys.stderr)

    if not lines:
        return

    bad_pat = re.compile(r"error|错误|✘|traceback|\[error\]", re.IGNORECASE)
    bad_lines = [ln for ln in lines if bad_pat.search(ln)]
    if bad_lines:
        print(yellow("  [generate] 输出中含 error/错误 等关键字（请核对）："))
        for ln in bad_lines[:20]:
            print(f"    {ln}")
        if len(bad_lines) > 20:
            print(yellow(f"    … 共 {len(bad_lines)} 行"))

    n_created = sum(
        1 for ln in lines if "has been created" in ln or "file has been created" in ln.lower()
    )
    hint = f"（已抑制 {len(lines)} 行脚本输出"
    if n_created:
        hint += f"，检测到约 {n_created} 条「已创建文件」日志"
    hint += "；设置环境变量 VHAL_SVC_GEN_VERBOSE=1 可打印全文）"
    print(f"  [generate] VehicleGenerateTool 执行成功{hint}")


def find_latest_xlsx(input_dir: str) -> str | None:
    """input 目录下按修改时间最新的 .xlsx（供 fetch 后文件名与线上一致、generate 用 auto）。"""
    paths = [
        p
        for p in glob.glob(os.path.join(input_dir, "*.xlsx"))
        if not os.path.basename(p).startswith("~$")
    ]
    if not paths:
        return None
    return max(paths, key=os.path.getmtime)


def run_git(repo_path: str, *args: str) -> tuple[bool, str, str]:
    cmd = ["git", "-C", repo_path] + list(args)
    result = subprocess.run(cmd, capture_output=True, text=True)
    return result.returncode == 0, result.stdout.strip(), result.stderr.strip()


def step_fetch(
    project_name, project_config, cfg, *, access_token: str | None
) -> bool:
    """从飞书拉取 VHAL 矩阵 xlsx 到 input/（与 tool_property 相同凭证与导出链）。"""
    input_cfg = project_config.get("input") or {}
    input_dir = os.path.join(_WORKSPACE_ROOT, input_cfg.get("dir", "input/" + project_name))
    os.makedirs(input_dir, exist_ok=True)

    feishu = project_config.get("feishu") or {}
    url = (feishu.get("spreadsheet") or feishu.get("spreadsheet_token") or "").strip()

    if not url:
        print(yellow("  [fetch] 跳过：未配置 feishu.spreadsheet（飞书表格/知识库链接）"))
        print(green("  ✓ [fetch] 完成（跳过）"))
        return True

    if not access_token:
        print(red("  ✘ fetch 需要环境变量 FEISHU_APP_ID 与 FEISHU_APP_SECRET"))
        return False

    from lib.feishu_fetch import fetch_spreadsheet_to_bytes_named

    content, matrix_name, err = fetch_spreadsheet_to_bytes_named(
        url, access_token=access_token
    )
    if not content:
        print(red(f"  ✘ {err}"))
        return False

    dest = os.path.join(input_dir, matrix_name)
    with open(dest, "wb") as f:
        f.write(content)
    print(f"  [fetch] 已保存: {dest}  ({len(content) / 1024:.0f} KB)")
    print(green("  ✓ [fetch] 成功"))
    return True


def step_generate(project_name, project_config, cfg) -> bool:
    """根据配置调用 VehicleGenerateTool（QA）或占位。"""
    gen = project_config.get("generate") or {}
    out_dir = os.path.join(_WORKSPACE_ROOT, gen.get("output_dir", "output/" + project_name))
    vg = project_config.get("vehicle_generate")

    if not vg or not isinstance(vg, dict):
        os.makedirs(out_dir, exist_ok=True)
        print(f"  [generate] 未配置 vehicle_generate：占位；已确保输出目录存在 {out_dir}")
        print(
            "  [generate] 在 config.json 的 projects.<键>.vehicle_generate 中填写 "
            "matrix_file、map_sheet（及可选 project_code、script）以运行内嵌 VehicleGenerateTool（QA）"
        )
        print(green("  ✓ [generate] 完成（占位）"))
        return True

    input_cfg = project_config.get("input") or {}
    input_dir = os.path.join(_WORKSPACE_ROOT, input_cfg.get("dir", "input/" + project_name))
    script_name = (vg.get("script") or "vehicle_generate_tool_QA.py").strip()
    matrix_file = (vg.get("matrix_file") or "").strip()
    map_sheet = (vg.get("map_sheet") or "").strip()
    project_code = (vg.get("project_code") or project_name).strip()

    if not map_sheet:
        print(red("  ✘ vehicle_generate 需配置 map_sheet"))
        return False

    if matrix_file.lower() in ("", "auto", "latest"):
        xlsx_abs = find_latest_xlsx(input_dir)
        if not xlsx_abs:
            print(
                red(
                    f"  ✘ {input_dir} 下无 .xlsx；请先 fetch，或设置 vehicle_generate.matrix_file 为具体文件名"
                )
            )
            return False
        print(f"  [generate] 使用最新矩阵: {os.path.basename(xlsx_abs)}")
    else:
        xlsx_abs = os.path.join(input_dir, matrix_file)
        if not os.path.isfile(xlsx_abs):
            print(red(f"  ✘ 矩阵文件不存在: {xlsx_abs}"))
            return False

    script_path = os.path.join(VEHICLE_GEN_ROOT, script_name)
    if not os.path.isfile(script_path):
        print(red(f"  ✘ 生成脚本不存在: {script_path}"))
        return False

    try:
        rel_xlsx = os.path.relpath(xlsx_abs, VEHICLE_GEN_ROOT)
    except ValueError:
        print(red("  ✘ 无法计算矩阵文件相对 vehicle_generate/ 的路径（路径是否跨卷？）"))
        return False

    cmd = [sys.executable, script_name, rel_xlsx, project_code, map_sheet]
    print(
        f"  [generate] {script_name}  |  "
        f"矩阵={os.path.basename(xlsx_abs)}  code={project_code}  map={map_sheet}"
    )
    if _generate_verbose():
        print(f"  [generate] cwd={VEHICLE_GEN_ROOT}  cmd={' '.join(cmd)}")
    proc = subprocess.run(
        cmd,
        cwd=VEHICLE_GEN_ROOT,
        capture_output=True,
        text=True,
        encoding="utf-8",
        errors="replace",
    )
    _report_generate_subprocess(proc)
    if proc.returncode != 0:
        return False

    result_dir = os.path.join(VEHICLE_GEN_ROOT, "Result" + project_code)
    copy_out = gen.get("copy_result_dir", True)
    if copy_out and os.path.isdir(result_dir):
        parent = os.path.dirname(out_dir)
        if parent:
            os.makedirs(parent, exist_ok=True)
        if os.path.isdir(out_dir):
            shutil.rmtree(out_dir)
        shutil.copytree(result_dir, out_dir)
        print(f"  [generate] 已同步生成结果 → {out_dir}")
        print(green("  ✓ [generate] 成功"))
    elif os.path.isdir(result_dir):
        print(f"  [generate] 产物目录（未同步至 output）: {result_dir}")
        print(green("  ✓ [generate] 成功"))
    else:
        print(yellow(f"  [generate] 警告：未找到预期产物目录 {result_dir}"))
        print(green("  ✓ [generate] 成功（脚本已退出 0）"))
    return True


def step_deploy(project_name, project_config, cfg) -> bool:
    """将 output 中指定文件拷贝到 Git 仓库内相对路径（切换分支后复制，不自动 commit）。"""
    dep = project_config.get("deploy") or {}
    repo = os.path.expanduser((dep.get("repo") or "").strip())
    branch = (dep.get("branch") or "").strip()
    file_entries = dep.get("files")

    if not repo:
        print(yellow("  [deploy] 跳过：未配置 deploy.repo"))
        print(green("  ✓ [deploy] 完成（跳过）"))
        return True

    if not branch:
        print(red("  ✘ deploy 需配置 deploy.branch"))
        return False

    if not file_entries or not isinstance(file_entries, list):
        legacy = (dep.get("target") or "").strip()
        if legacy:
            print(
                yellow(
                    "  [deploy] 跳过：当前为旧版 target 单目录配置；请改用 deploy.files 列表"
                )
            )
        else:
            print(yellow("  [deploy] 跳过：未配置 deploy.files"))
        print(green("  ✓ [deploy] 完成（跳过）"))
        return True

    gen = project_config.get("generate") or {}
    out_dir = os.path.join(_WORKSPACE_ROOT, gen.get("output_dir", "output/" + project_name))

    if not os.path.isdir(repo):
        print(red(f"  ✘ 仓库路径不存在: {repo}"))
        return False

    ok, _, _ = run_git(repo, "rev-parse", "--git-dir")
    if not ok:
        print(red(f"  ✘ 不是有效的 git 仓库: {repo}"))
        return False

    ok, current_branch, _ = run_git(repo, "rev-parse", "--abbrev-ref", "HEAD")
    if not ok:
        print(red("  ✘ 无法获取当前分支"))
        return False

    if current_branch != branch:
        print(f"  当前分支: {current_branch} → 切换到 {branch}")
        ok, status_out, _ = run_git(repo, "status", "--porcelain")
        if not ok:
            print(red("  ✘ 无法获取仓库状态"))
            return False
        if status_out:
            print(red("  ✘ 仓库有未提交修改，无法切换分支"))
            return False
        ok, _, err = run_git(repo, "checkout", branch)
        if not ok:
            print(red(f"  ✘ 切换分支失败: {err}"))
            return False
        print(f"  已切换到: {branch}")
    else:
        print(f"  分支: {branch}")

    total = 0
    for item in file_entries:
        if not isinstance(item, dict):
            continue
        src_name = (item.get("source") or item.get("name") or "").strip()
        dest_rel = (item.get("dest") or item.get("path") or "").strip()
        if not src_name or not dest_rel:
            print(yellow(f"  ⚠ 跳过无效 deploy.files 项: {item}"))
            continue
        src_path = os.path.join(out_dir, src_name)
        if not os.path.isfile(src_path):
            print(red(f"  ✘ 源文件不存在: {src_path}"))
            return False
        dst_dir = os.path.join(repo, dest_rel.replace("/", os.sep))
        os.makedirs(dst_dir, exist_ok=True)
        dst_path = os.path.join(dst_dir, src_name)
        shutil.copy2(src_path, dst_path)
        total += 1
        print(f"  {src_name} → {dest_rel}/")

    if total == 0:
        print(yellow("  ⚠ 未拷贝任何文件（检查 deploy.files）"))
        return False

    print(f"  共拷贝 {total} 个文件（请在本机 git 提交）")
    print(green("  ✓ [deploy] 成功"))
    return True


def step_compile(project_name, project_config, cfg) -> bool:
    """TODO: 在指定工作目录执行编译命令（如 Android mmm、CMake 等）。"""
    comp = project_config.get("compile") or {}
    cwd = (comp.get("cwd") or "").strip()
    args = comp.get("args")
    if not args or not isinstance(args, list) or len(args) == 0:
        print("  [compile] 占位：未配置 compile.args，跳过真实编译")
        print("  [compile] TODO: 在 config.json 中填写 compile.cwd 与 compile.args（argv 列表）")
        print(green("  ✓ [compile] 完成（跳过）"))
        return True
    print(f"  [compile] 将执行: {args}  cwd={cwd or _BUNDLE_ROOT}")
    try:
        rc = subprocess.run(
            args,
            cwd=cwd if cwd else _BUNDLE_ROOT,
            check=False,
        ).returncode
        if rc != 0:
            print(red(f"  ✘ 编译退出码 {rc}"))
            return False
    except FileNotFoundError as e:
        print(red(f"  ✘ 无法启动编译命令: {e}"))
        return False
    print(green("  ✓ [compile] 成功"))
    return True


def cmd_list(all_projects):
    print(f"\n已配置项目 ({len(all_projects)} 个):\n")
    for name, pcfg in all_projects.items():
        desc = pcfg.get("description", "")
        print(f"  {name}")
        if desc:
            print(f"    描述: {desc}")
        inc = pcfg.get("input", {}).get("dir", "")
        if inc:
            print(f"    输入目录: {inc}")
        fs = pcfg.get("feishu") or {}
        ss = (fs.get("spreadsheet") or fs.get("spreadsheet_token") or "").strip()
        if ss:
            print(f"    飞书: {ss[:56]}…" if len(ss) > 56 else f"    飞书: {ss}")
        else:
            print("    飞书: 未配置（fetch 跳过）")
        vg = pcfg.get("vehicle_generate")
        if isinstance(vg, dict) and vg.get("map_sheet"):
            mf = (vg.get("matrix_file") or "auto").strip()
            if mf.lower() in ("auto", "latest", ""):
                mf_disp = "自动(目录内最新 .xlsx)"
            else:
                mf_disp = mf
            print(
                f"    生成: {vg.get('script', 'vehicle_generate_tool_QA.py')} "
                f"· 矩阵 {mf_disp} · map {vg.get('map_sheet', '?')} "
                f"· code {vg.get('project_code', '?')}"
            )
        dep = pcfg.get("deploy") or {}
        if (dep.get("repo") or "").strip() and dep.get("files"):
            print(f"    部署: {dep['repo']}  [{dep.get('branch', '')}]  → {len(dep['files'])} 个文件规则")
        elif (dep.get("repo") or "").strip():
            print("    部署: 已配 repo，缺少 deploy.files")
        else:
            print("    部署: 未配置")
        print()


def cmd_run(project_names, actions, all_projects, cfg) -> bool:
    targets = resolve_projects(project_names, all_projects)
    if targets is None:
        return False

    do_fetch = "fetch" in actions
    do_gen = "generate" in actions or "gen" in actions
    do_deploy = "deploy" in actions
    do_compile = "compile" in actions

    access_token: str | None = None
    if do_fetch:
        from lib.feishu_fetch import get_tenant_access_token

        need_token = False
        for pname in targets:
            fs = (all_projects[pname].get("feishu") or {})
            u = (fs.get("spreadsheet") or fs.get("spreadsheet_token") or "").strip()
            if u:
                need_token = True
                break
        if need_token:
            access_token = get_tenant_access_token()
            if not access_token:
                print(
                    red(
                        "✘ fetch 需要飞书应用凭证：请设置环境变量 FEISHU_APP_ID 与 "
                        "FEISHU_APP_SECRET（与 adk property fetch 相同）"
                    )
                )
                return False

    ok = True
    for pname in targets:
        pcfg = all_projects[pname]
        print(f"\n{'='*60}")
        print(f"项目: {pname} — {pcfg.get('description', '')}")
        print(f"{'='*60}")

        # 强依赖：仅当前序步骤均成功时才执行后续；失败则跳过并记失败
        chain_ok = True

        if do_fetch:
            print("\n[fetch] …")
            if not step_fetch(pname, pcfg, cfg, access_token=access_token):
                chain_ok = False
                ok = False

        if do_gen:
            print("\n[generate] …")
            if not chain_ok:
                print(
                    yellow("  ⚠ 已跳过（强依赖：上游 fetch 未成功）")
                )
                ok = False
            elif not step_generate(pname, pcfg, cfg):
                chain_ok = False
                ok = False

        if do_deploy:
            print("\n[deploy] …")
            if not chain_ok:
                print(yellow("  ⚠ 已跳过（强依赖：上游步骤未全部成功）"))
                ok = False
            elif not step_deploy(pname, pcfg, cfg):
                chain_ok = False
                ok = False

        if do_compile:
            print("\n[compile] …")
            if not chain_ok:
                print(yellow("  ⚠ 已跳过（强依赖：上游步骤未全部成功）"))
                ok = False
            elif not step_compile(pname, pcfg, cfg):
                ok = False

    print()
    return ok


def main():
    # 与 property 一致：用户数据目录在首次运行前可能尚不存在（adk 注入 AUTODRIVEKIT_USER_DATA_DIR 时）
    if _PATHS:
        os.makedirs(_WORKSPACE_ROOT, exist_ok=True)
    os.chdir(_WORKSPACE_ROOT)

    parser = argparse.ArgumentParser(
        description="vhal-svc — VHAL 流水线（强依赖）：fetch → generate → deploy → compile",
        epilog="示例: python main.py  /  python main.py -l  /  python main.py fetch n5x  /  python main.py -fgdc n5x",
    )
    parser.add_argument(
        "args",
        nargs="*",
        help="动作 (fetch/generate/deploy/compile/list) 和/或项目名",
    )
    parser.add_argument("-f", action="store_true", help="fetch: 抓取 VHAL 表")
    parser.add_argument("-g", action="store_true", help="generate: 生成 vehicleservice 产物")
    parser.add_argument("-d", action="store_true", help="deploy: 部署到目标仓库")
    parser.add_argument("-c", action="store_true", help="compile: 执行编译任务")
    parser.add_argument("-l", action="store_true", help="list: 列出已配置项目")
    parser.add_argument("-v", "--version", action="store_true", help="显示版本号")
    ns = parser.parse_args()

    if ns.version:
        print(f"vhal-svc v{VERSION}")
        return

    cfg = load_config()
    all_projects = cfg.get("projects") or {}
    if not all_projects:
        print(red("✘ config.json 中 projects 为空，请至少配置一个项目"))
        sys.exit(1)

    actions = set()
    project_names = []
    for a in ns.args:
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

    if ns.f:
        actions.add("fetch")
    if ns.g:
        actions.add("generate")
    if ns.d:
        actions.add("deploy")
    if ns.c:
        actions.add("compile")
    if ns.l:
        actions.add("list")

    if "list" in actions:
        cmd_list(all_projects)
        return

    if not actions:
        actions = {"fetch", "generate", "deploy", "compile"}

    if not cmd_run(project_names, actions, all_projects, cfg):
        sys.exit(1)


if __name__ == "__main__":
    main()
