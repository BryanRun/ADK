"""通过飞书 Drive 拉取 manifest 与制品包，解压到 staging 并原子切换 current。"""

from __future__ import annotations

import fcntl
import os
import shutil
import tarfile
import time
import zipfile
from pathlib import Path
from typing import Any

import typer

from autodrivekit import __version__ as LOCAL_VERSION
from autodrivekit.archive_hash import sha256_tar_tree
from autodrivekit.config_migrate import manifest_file_token_from_settings
from autodrivekit.feishu_auth import get_tenant_access_token
from autodrivekit.feishu_drive import download_file_to_path, download_json_file
from autodrivekit.user_layout import (
    managed_adk_base,
    managed_current_link,
    managed_releases_dir,
    managed_staging_dir,
)


class UpdateError(RuntimeError):
    pass


def _parse_version_tuple(s: str) -> tuple[int, ...]:
    out: list[int] = []
    for part in str(s).strip().split("."):
        if not part:
            continue
        acc = ""
        for ch in part:
            if ch.isdigit():
                acc += ch
            else:
                break
        if not acc:
            out.append(0)
        else:
            try:
                out.append(int(acc))
            except ValueError:
                out.append(0)
    return tuple(out) if out else (0,)


def _version_less(a: str, b: str) -> bool:
    return _parse_version_tuple(a) < _parse_version_tuple(b)


def _acquire_update_lock() -> Any:
    managed_adk_base().mkdir(parents=True, exist_ok=True)
    lock_path = managed_adk_base() / ".update.lock"
    fp = open(lock_path, "a+", encoding="utf-8")
    try:
        fcntl.flock(fp.fileno(), fcntl.LOCK_EX | fcntl.LOCK_NB)
    except BlockingIOError as e:
        fp.close()
        raise UpdateError("另一更新进程正在进行，请稍后重试。") from e
    return fp


def _release_update_lock(fp: Any) -> None:
    try:
        fcntl.flock(fp.fileno(), fcntl.LOCK_UN)
    except OSError:
        pass
    try:
        fp.close()
    except OSError:
        pass


def _find_extract_root(extracted: Path) -> Path:
    if (extracted / "pyproject.toml").is_file():
        return extracted
    subs = [c for c in extracted.iterdir() if c.is_dir() and not c.name.startswith(".")]
    if len(subs) == 1 and (subs[0] / "pyproject.toml").is_file():
        return subs[0]
    raise UpdateError(
        "解压后未找到 pyproject.toml：请确认发布包根目录即为 AutoDriveKit 仓库根，"
        "或仅包含一层顶层目录。"
    )


def _extract_archive(archive: Path, dest_dir: Path) -> Path:
    dest_dir.mkdir(parents=True, exist_ok=True)
    name = archive.name.lower()
    if name.endswith(".zip"):
        with zipfile.ZipFile(archive, "r") as zf:
            zf.extractall(dest_dir)
    elif name.endswith(".tar.gz") or name.endswith(".tgz"):
        with tarfile.open(archive, "r:gz") as tf:
            tf.extractall(dest_dir)
    elif name.endswith(".tar"):
        with tarfile.open(archive, "r") as tf:
            tf.extractall(dest_dir)
    else:
        raise UpdateError(f"不支持的压缩格式: {archive.name}")
    return _find_extract_root(dest_dir)


def _atomic_switch_current(new_release: Path) -> None:
    base = managed_adk_base()
    base.mkdir(parents=True, exist_ok=True)
    cur = managed_current_link()
    tmp = base / ".current_switch_tmp"
    if tmp.exists() or tmp.is_symlink():
        if tmp.is_symlink() or tmp.is_file():
            tmp.unlink()
        else:
            shutil.rmtree(tmp, ignore_errors=True)
    os.symlink(new_release.resolve(), tmp, target_is_directory=True)
    os.replace(tmp, cur)


def run_update(*, dry_run: bool, check_only: bool) -> None:
    token = get_tenant_access_token()
    if not token:
        raise UpdateError(
            "无法获取 tenant_access_token：请设置环境变量 FEISHU_APP_ID 与 FEISHU_APP_SECRET。"
        )

    manifest_token = manifest_file_token_from_settings()
    if not manifest_token:
        raise UpdateError(
            "manifest file_token 为空：请在 ~/.config/adk/adk.json 的 "
            "feishu_update.manifest_file_token 中填写，或设置 "
            "ADK_FEISHU_MANIFEST_FILE_TOKEN（通常使用平台内置默认即可）。"
        )

    try:
        manifest = download_json_file(token, manifest_token)
    except Exception as e:
        raise UpdateError(f"读取 manifest 失败: {e}") from e

    if not isinstance(manifest, dict):
        raise UpdateError("manifest 必须是 JSON 对象")

    remote_ver = str(manifest.get("version") or "").strip()
    if not remote_ver:
        raise UpdateError("manifest 缺少 version 字段")

    typer.echo(f"  当前版本: {LOCAL_VERSION}")
    typer.echo(f"  远端版本: {remote_ver}")

    if _version_less(remote_ver, LOCAL_VERSION):
        typer.echo("  本地版本已高于发布 manifest 中的版本，跳过。", err=True)
        return
    if not _version_less(LOCAL_VERSION, remote_ver):
        typer.echo("  已与远端版本一致，无需更新。")
        return

    if check_only:
        typer.echo(f"  发现新版本 {remote_ver}（--check-only：不下载）。")
        return

    archive_token = str(manifest.get("archive_file_token") or "").strip()
    if not archive_token:
        raise UpdateError("manifest 缺少 archive_file_token 字段")

    expect_sha = str(manifest.get("sha256") or "").strip().lower()
    archive_name = str(manifest.get("filename") or "release.bin").strip()

    if dry_run:
        typer.echo("  [dry-run] 已确认将更新；跳过下载、解压与切换。")
        return

    lock_fp = _acquire_update_lock()
    try:
        staging_root = managed_staging_dir() / f"work-{os.getpid()}-{int(time.time())}"
        if staging_root.exists():
            shutil.rmtree(staging_root, ignore_errors=True)
        staging_root.mkdir(parents=True, exist_ok=True)
        archive_path = staging_root / archive_name

        typer.echo(f"  正在从飞书下载制品 ({archive_token[:8]}…) …")

        download_file_to_path(token, archive_token, archive_path)

        if expect_sha:
            actual_sha = sha256_tar_tree(archive_path).lower()
            if actual_sha != expect_sha:
                raise UpdateError("sha256 校验失败：文件可能损坏或被篡改。")

        extract_dir = staging_root / "extracted"
        root = _extract_archive(archive_path, extract_dir)

        safe_ver = remote_ver.replace(os.sep, "_").replace("/", "_")
        rel = managed_releases_dir() / safe_ver
        if rel.exists():
            shutil.rmtree(rel, ignore_errors=True)
        shutil.move(str(root), str(rel))

        _atomic_switch_current(rel)
        typer.echo(f"  已安装到 {rel}，并已切换 {managed_current_link()} 指向该版本。")
        typer.echo(
            "  请将 PATH 优先包含解压树中的启动入口（见仓库根 adk_launch.py），"
            "或在新根目录执行 pip install -e .；配置迁移将在下次运行 adk（非 update）时执行。"
        )
    finally:
        _release_update_lock(lock_fp)
