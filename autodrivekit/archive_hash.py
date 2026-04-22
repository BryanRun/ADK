"""对 tar.gz 内源码文件按路径排序后计算文件树级 sha256。

飞书 wiki 文件节点会重写上传文件的 gzip 元信息、tar 条目顺序，
以及 xlsx 等压缩格式的内部结构，导致二进制文件哈希不可预测。
因此仅对源码类文件（.py / .json / .toml / .cfg / .txt / .md / .sh 等）
做文件树校验，排除 xlsx 等会被飞书改写的二进制文件。
"""

from __future__ import annotations

import hashlib
import tarfile
from pathlib import Path

# 参与校验的源码类扩展名（小写）
_SOURCE_EXTS = frozenset({
    ".py", ".json", ".toml", ".cfg", ".txt", ".md", ".sh",
    ".yml", ".yaml", ".ini", ".j2", ".jinja", ".jinja2",
    ".h", ".c", ".cpp", ".hpp",
})


def sha256_tar_tree(archive_path: Path) -> str:
    """计算 tar.gz 内源码文件树的 sha256 摘要。

    逻辑：提取所有源码类普通文件 → 统一路径（小写、去前导 ``./``）→
    按路径排序 → 依次将 ``路径 + 内容 sha256`` 喂入总 hasher → 返回十六进制摘要。
    """
    entries: list[tuple[str, bytes]] = []
    with tarfile.open(archive_path, "r:gz") as tf:
        for member in tf.getmembers():
            if not member.isfile():
                continue
            # 统一路径
            name = member.name.replace("\\", "/")
            if name.startswith("./"):
                name = name[2:]
            # 只校验源码类文件
            ext = ("." + name.rsplit(".", 1)[-1]).lower() if "." in name else ""
            if ext not in _SOURCE_EXTS:
                continue
            f = tf.extractfile(member)
            if f is None:
                continue
            content_hash = hashlib.sha256(f.read()).digest()
            # 路径统一小写以规避飞书大小写重写
            entries.append((name.lower(), content_hash))

    entries.sort(key=lambda e: e[0])

    h = hashlib.sha256()
    for name, content_hash in entries:
        h.update(name.encode("utf-8"))
        h.update(content_hash)
    return h.hexdigest()
