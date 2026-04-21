"""平台根目录与工具根路径（autodrivekit 包位于 0_AutoDriveKit/autodrivekit/）。"""

from pathlib import Path

# 0_AutoDriveKit/
ROOT = Path(__file__).resolve().parent.parent

# 即插即用工具目录：每个子目录可含 adk-tool.json + 入口脚本
TOOLS_ROOT = ROOT / "tools"
