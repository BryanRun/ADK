"""adk --help 页眉展示用元数据（简介 / 作者 / 版权 / 版本等）。可按项目实际情况修改本文件常量。"""

from __future__ import annotations

from autodrivekit import __version__

PLATFORM_VERSION = __version__

# 简介：突出「统一工具平台」与简称 ADK（页眉展示，不依赖 pyproject description）
PLATFORM_SUMMARY = (
    "AutoDriveKit（简称 ADK）是统一工具平台：单一 CLI 入口 adk，"
    "聚合车辆相关代码生成、配置同步等独立工具包（property、cfg-word、vhal-svc 等）；"
    "支持 adk update 经飞书 Drive 拉取 manifest 与制品包进行在线更新。"
)

PLATFORM_NAME = "AutoDriveKit"

PLATFORM_AUTHOR = "HUALEI"

# 页眉「版权」行：英文、偏正式表述（可按法务要求再改）
PLATFORM_COPYRIGHT = (
    "Copyright © AUTOLINK. All rights reserved. "
    "AutoDriveKit (ADK), its documentation, and bundled tool packages are proprietary to AUTOLINK "
    "unless a separate license applies."
)
