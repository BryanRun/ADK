"""飞书 tenant_access_token（与工具内 feishu_api 行为一致，独立无 UI 依赖）。"""

from __future__ import annotations

import os
import time
from typing import Optional

import requests

BASE = "https://open.feishu.cn/open-apis"
_cache: dict[str, object] = {"token": None, "expires": 0.0}


def get_tenant_access_token() -> Optional[str]:
    now = time.time()
    tok = _cache.get("token")
    exp = float(_cache.get("expires") or 0.0)
    if tok and now < exp:
        return str(tok)

    app_id = os.environ.get("FEISHU_APP_ID", "").strip()
    app_secret = os.environ.get("FEISHU_APP_SECRET", "").strip()
    if not app_id or not app_secret:
        return None

    r = requests.post(
        f"{BASE}/auth/v3/tenant_access_token/internal",
        json={"app_id": app_id, "app_secret": app_secret},
        timeout=60,
    )
    data = r.json()
    if data.get("code") != 0:
        return None

    tk = data.get("tenant_access_token")
    if not tk:
        return None
    _cache["token"] = tk
    _cache["expires"] = now + float(data.get("expire", 7200)) - 60.0
    return str(tk)
