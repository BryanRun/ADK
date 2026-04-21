#!/usr/bin/env python3
"""从解压目录直接启动 ADK（无需 pip install）：将本仓库根加入 PYTHONPATH 后进入 CLI。

托管安装时可将本脚本所在目录加入 PATH，或 `ln -sf "$(pwd)/adk_launch.py" ~/.local/bin/adk`。
"""

from __future__ import annotations

import os
import sys
from pathlib import Path

_ROOT = Path(__file__).resolve().parent
if str(_ROOT) not in sys.path:
    sys.path.insert(0, str(_ROOT))
os.chdir(_ROOT)

from autodrivekit.cli import main

if __name__ == "__main__":
    main()
