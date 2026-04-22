"""飞书云空间文件下载（Drive v1）；manifest 支持知识库节点 token 解析为云空间文件后再下载。"""

from __future__ import annotations

import gzip
import json
from pathlib import Path
from typing import Any

import requests

from autodrivekit.feishu_auth import BASE


def _headers(token: str) -> dict[str, str]:
    return {"Authorization": f"Bearer {token}"}


def _wiki_resolve_file_obj_token(
    tenant_token: str, node_token: str, *, timeout: int = 60
) -> tuple[str | None, str | None]:
    """若 ``node_token`` 为知识库节点且 ``obj_type`` 为 ``file``，返回 ``(obj_token, None)``；
    若节点存在但非文件类型，返回 ``(None, obj_type)``；若无法解析节点，返回 ``(None, None)``。"""
    node = _wiki_get_node(tenant_token, node_token, timeout=timeout)
    if not node:
        return None, None
    obj_type = str(node.get("obj_type") or "").strip()
    obj_token = str(node.get("obj_token") or "").strip()
    if obj_type == "file" and obj_token:
        return obj_token, None
    return None, obj_type or "unknown"


def _wiki_get_node(tenant_token: str, node_token: str, *, timeout: int = 60) -> dict[str, Any] | None:
    """调用 wiki v2 获取知识空间节点；失败返回 None。"""
    r = requests.get(
        f"{BASE}/wiki/v2/spaces/get_node",
        headers=_headers(tenant_token),
        params={"token": node_token.strip()},
        timeout=timeout,
    )
    if r.status_code != 200:
        return None
    try:
        body: Any = r.json()
    except (ValueError, json.JSONDecodeError):
        return None
    if not isinstance(body, dict) or body.get("code") != 0:
        return None
    data = body.get("data")
    if not isinstance(data, dict):
        return None
    node = data.get("node")
    return node if isinstance(node, dict) else None


def _parse_downloaded_json(content: bytes) -> Any:
    # 飞书 CDN 有时返回 gzip 压缩内容但 requests 未自动解压，需手动处理
    if content[:2] == b"\x1f\x8b":
        content = gzip.decompress(content)
    try:
        obj: Any = json.loads(content.decode("utf-8"))
    except json.JSONDecodeError as e:
        raise RuntimeError(f"manifest 不是合法 JSON: {e}") from e
    if isinstance(obj, dict) and obj.get("code") not in (0, None):
        raise RuntimeError(
            f"飞书接口错误 code={obj.get('code')} msg={obj.get('msg')}"
        )
    return obj


def download_file_to_path(
    token: str,
    file_token: str,
    dest: Path,
    *,
    timeout: int = 3600,
    _resolved_wiki: bool = False,
) -> None:
    """将云空间文件下载到本地路径（流式写入）。

    与 ``download_json_file`` 一致：``file_token`` 可为 Drive 的 file_token，或知识库节点 token
    （节点 ``obj_type`` 须为 ``file``，如安装包 zip/tar.gz）。
    """
    dest.parent.mkdir(parents=True, exist_ok=True)
    url = f"{BASE}/drive/v1/files/{file_token}/download"
    with requests.get(
        url,
        headers=_headers(token),
        stream=True,
        timeout=timeout,
        allow_redirects=True,
    ) as r:
        ctype = (r.headers.get("Content-Type") or "").lower()
        if r.status_code == 404 and not _resolved_wiki:
            r.close()
            obj_token, bad_type = _wiki_resolve_file_obj_token(
                token, file_token, timeout=min(timeout, 120)
            )
            if obj_token:
                return download_file_to_path(
                    token, obj_token, dest, timeout=timeout, _resolved_wiki=True
                )
            if bad_type is not None:
                raise RuntimeError(
                    f"知识库节点 obj_type={bad_type!r}，无法按云空间文件下载制品；"
                    "请将安装包存为知识库或云空间中的「文件」节点，或使用 Drive file_token。"
                )
            raise RuntimeError(
                f"下载失败 HTTP 404: {r.text[:500]}。"
                "若 token 为知识库链接中的节点，请为应用开通 wiki 读权限并授权节点。"
            )
        if r.status_code != 200:
            raise RuntimeError(f"下载失败 HTTP {r.status_code}: {r.text[:500]}")
        if "application/json" in ctype:
            try:
                err = r.json()
            except Exception:
                err = {"raw": r.text[:500]}
            code = err.get("code")
            msg = err.get("msg", err)
            raise RuntimeError(f"下载失败（接口返回 JSON）code={code} msg={msg}")
        tmp = dest.with_suffix(dest.suffix + ".part")
        try:
            with open(tmp, "wb") as f:
                for chunk in r.iter_content(chunk_size=1024 * 1024):
                    if chunk:
                        f.write(chunk)
            tmp.replace(dest)
        finally:
            if tmp.is_file() and not dest.is_file():
                try:
                    tmp.unlink(missing_ok=True)
                except OSError:
                    pass


def download_json_file(
    token: str,
    file_token: str,
    *,
    timeout: int = 120,
    _resolved_wiki: bool = False,
) -> Any:
    """下载 JSON 文本并解析（用于发布 manifest）。

    优先按 Drive ``file_token`` 下载；若 HTTP 404，则将该 token 视为**知识库节点 token**，
    调用 ``wiki/v2/spaces/get_node``；当节点 ``obj_type`` 为 ``file`` 时，用 ``obj_token`` 再试 Drive。
    其它节点类型（如 docx）无法通过本接口按文件流拉取 JSON，须改为云空间中的 ``.json`` 文件或
    知识库内「文件」类节点。
    """
    url = f"{BASE}/drive/v1/files/{file_token}/download"
    r = requests.get(
        url,
        headers=_headers(token),
        timeout=timeout,
        allow_redirects=True,
    )
    if r.status_code == 200:
        return _parse_downloaded_json(r.content)

    if r.status_code == 404 and not _resolved_wiki:
        obj_token, bad_type = _wiki_resolve_file_obj_token(token, file_token, timeout=timeout)
        if obj_token:
            return download_json_file(
                token, obj_token, timeout=timeout, _resolved_wiki=True
            )
        if bad_type is not None:
            raise RuntimeError(
                f"知识库节点 obj_type={bad_type!r}，无法按云空间文件下载 manifest JSON；"
                "请将 manifest 存为云空间或知识库中的「文件」（.json），或使用 Drive 的 file_token。"
            )
        raise RuntimeError(
            f"读取 manifest 失败 HTTP 404: {r.text[:500]}。"
            "若 token 来自飞书知识库链接，请为自建应用开通 wiki 可读权限，"
            "并将应用添加为该知识库/节点的协作者后重试。"
        )

    raise RuntimeError(f"读取 manifest 失败 HTTP {r.status_code}: {r.text[:500]}")


def get_explorer_root_folder_token(tenant_token: str, *, timeout: int = 60) -> str:
    """获取云空间「根文件夹」token，用作 ``upload_all`` 的 ``parent_node``。"""
    r = requests.get(
        f"{BASE}/drive/explorer/v2/root_folder/meta",
        headers=_headers(tenant_token),
        timeout=timeout,
    )
    if r.status_code != 200:
        raise RuntimeError(f"获取云空间根目录失败 HTTP {r.status_code}: {r.text[:500]}")
    try:
        body: Any = r.json()
    except json.JSONDecodeError as e:
        raise RuntimeError(f"获取云空间根目录响应非 JSON: {e}") from e
    if not isinstance(body, dict) or body.get("code") != 0:
        raise RuntimeError(
            f"获取云空间根目录失败 code={body.get('code')} msg={body.get('msg')}"
        )
    data = body.get("data")
    if not isinstance(data, dict):
        raise RuntimeError("获取云空间根目录失败：响应无 data")
    tok = str(data.get("token") or "").strip()
    if not tok:
        raise RuntimeError("获取云空间根目录失败：无 token")
    return tok


def upload_local_file_to_explorer(
    tenant_token: str,
    parent_folder_token: str,
    local_path: Path,
    *,
    file_name: str | None = None,
    timeout: int = 600,
) -> str:
    """将本地文件上传到云空间指定文件夹，返回 ``file_token``（仅 ``upload_all``，单文件 ≤20MB）。"""
    local_path = Path(local_path).resolve()
    if not local_path.is_file():
        raise FileNotFoundError(str(local_path))
    name = file_name or local_path.name
    size = local_path.stat().st_size
    if size == 0:
        raise ValueError("禁止上传空文件")
    if size > 20 * 1024 * 1024:
        raise ValueError(
            f"文件 {size} 字节超过 upload_all 单文件 20MB 限制，请改用分片上传或缩小包体"
        )
    url = f"{BASE}/drive/v1/files/upload_all"
    with open(local_path, "rb") as fp:
        files = {
            "file_name": (None, name),
            "parent_type": (None, "explorer"),
            "parent_node": (None, parent_folder_token.strip()),
            "size": (None, str(size)),
            "file": (name, fp, "application/octet-stream"),
        }
        r = requests.post(
            url,
            headers=_headers(tenant_token),
            files=files,
            timeout=timeout,
        )
    if r.status_code != 200:
        raise RuntimeError(f"上传失败 HTTP {r.status_code}: {r.text[:800]}")
    try:
        body: Any = r.json()
    except json.JSONDecodeError as e:
        raise RuntimeError(f"上传响应非 JSON: {e}") from e
    if not isinstance(body, dict) or body.get("code") != 0:
        raise RuntimeError(
            f"上传失败 code={body.get('code')} msg={body.get('msg')} body={str(body)[:800]}"
        )
    data = body.get("data")
    if not isinstance(data, dict):
        raise RuntimeError("上传响应无 data.file_token")
    ft = str(data.get("file_token") or "").strip()
    if not ft:
        raise RuntimeError("上传响应无 file_token")
    return ft
