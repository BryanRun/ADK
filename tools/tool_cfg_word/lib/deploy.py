"""Git 仓库部署：校验仓库、切换分支、拷贝生成文件。"""

import os
import shutil
import subprocess

from lib.term_color import red


def _run_git(repo_path, *args):
    """Execute git command in given repo. Returns (success, stdout, stderr)."""
    cmd = ["git", "-C", repo_path] + list(args)
    result = subprocess.run(cmd, capture_output=True, text=True)
    return result.returncode == 0, result.stdout.strip(), result.stderr.strip()


def deploy_project(project_name, output_dir, deploy_cfg):
    """Deploy generated files from output_dir to target git repository.

    deploy_cfg keys:
        repo: path to git repository (supports ~)
        branch: target branch name
        target: relative path within repo to copy files to
    """
    repo_path = os.path.expanduser(deploy_cfg["repo"])
    branch = deploy_cfg.get("branch", "")
    target_rel = deploy_cfg.get("target", "")

    if not repo_path or not target_rel:
        print(red(f"  ✘ deploy 配置不完整 (repo={repo_path}, target={target_rel})"))
        return False

    print(f"  部署目标: {repo_path}")
    if branch:
        print(f"  目标分支: {branch}")
    print(f"  目标路径: {target_rel}")

    # Validate repo exists
    if not os.path.isdir(repo_path):
        print(red(f"  ✘ 仓库路径不存在: {repo_path}"))
        return False

    ok, _, _ = _run_git(repo_path, "rev-parse", "--git-dir")
    if not ok:
        print(red(f"  ✘ 不是有效的 git 仓库: {repo_path}"))
        return False

    # Check and switch branch if needed
    if branch:
        ok, current_branch, _ = _run_git(repo_path, "rev-parse", "--abbrev-ref", "HEAD")
        if not ok:
            print(red("  ✘ 无法获取当前分支"))
            return False

        if current_branch != branch:
            print(f"  当前分支: {current_branch} → 需要切换到 {branch}")

            ok, status_out, _ = _run_git(repo_path, "status", "--porcelain")
            if not ok:
                print(red("  ✘ 无法获取仓库状态"))
                return False
            if status_out:
                print(red("  ✘ 仓库有未提交的修改，无法切换分支:"))
                for line in status_out.split("\n")[:10]:
                    print(red(f"    {line}"))
                return False

            ok, _, err = _run_git(repo_path, "checkout", branch)
            if not ok:
                print(red(f"  ✘ 切换分支失败: {err}"))
                return False
            print(f"  已切换到分支: {branch}")
        else:
            print(f"  当前分支: {current_branch} (已在目标分支)")

    # Copy files
    if not os.path.isdir(output_dir):
        print(red(f"  ✘ 输出目录不存在: {output_dir}"))
        return False

    src_files = [f for f in os.listdir(output_dir) if os.path.isfile(os.path.join(output_dir, f))]
    if not src_files:
        print(red(f"  ✘ 输出目录中无文件: {output_dir}"))
        return False

    dst_dir = os.path.join(repo_path, target_rel)
    os.makedirs(dst_dir, exist_ok=True)

    copied = 0
    for fname in src_files:
        src = os.path.join(output_dir, fname)
        dst = os.path.join(dst_dir, fname)
        shutil.copy2(src, dst)
        copied += 1
        print(f"    {fname} → {target_rel}/{fname}")

    print(f"  部署完成: {copied} 个文件已拷贝 (git 提交请手动执行)")
    return True
