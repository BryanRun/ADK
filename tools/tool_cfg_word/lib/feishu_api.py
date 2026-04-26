"""飞书开放平台 Sheets API 封装。

依赖环境变量: FEISHU_APP_ID, FEISHU_APP_SECRET
"""

import os
import time
from typing import Optional

import requests

from lib.term_color import red

BASE = "https://open.feishu.cn/open-apis"
_token_cache = {"token": None, "expires": 0}

# Rate limiter: sheets API 5 QPS
_last_call = 0
def _rate_limit():
    global _last_call
    now = time.time()
    gap = now - _last_call
    if gap < 0.25:
        time.sleep(0.25 - gap)
    _last_call = time.time()


def get_token():
    """Get tenant_access_token, cached until expiry."""
    now = time.time()
    if _token_cache["token"] and now < _token_cache["expires"]:
        return _token_cache["token"]

    app_id = os.environ.get("FEISHU_APP_ID", "")
    app_secret = os.environ.get("FEISHU_APP_SECRET", "")
    if not app_id or not app_secret:
        print(red("  ✘ 环境变量 FEISHU_APP_ID / FEISHU_APP_SECRET 未设置"))
        return None

    r = requests.post(f"{BASE}/auth/v3/tenant_access_token/internal", json={
        "app_id": app_id, "app_secret": app_secret
    })
    data = r.json()
    if data.get("code") != 0:
        print(red(f"  ✘ 获取飞书 Token 失败: {data.get('msg')}"))
        return None

    tk = data["tenant_access_token"]
    _token_cache["token"] = tk
    _token_cache["expires"] = now + data.get("expire", 7200) - 60
    return tk


def _headers(token):
    return {"Authorization": f"Bearer {token}", "Content-Type": "application/json"}


def read_sheet(token, spreadsheet, sheet_id):
    """Read all values from a sheet. Returns list of rows (list of values)."""
    _rate_limit()
    r = requests.get(
        f"{BASE}/sheets/v2/spreadsheets/{spreadsheet}/values/{sheet_id}",
        headers=_headers(token),
        params={"valueRenderOption": "ToString"},
    )
    data = r.json()
    if data.get("code") != 0:
        print(red(f"  ✘ 读取飞书 Sheet 失败: {data.get('msg')}"))
        return None
    return data.get("data", {}).get("valueRange", {}).get("values", [])


def wiki_node_to_spreadsheet_token(token, wiki_node_token):
    """Resolve a Wiki node URL token to the underlying spreadsheet (sheet) obj_token.

    GET /wiki/v2/spaces/get_node?token=<wiki_node_token>
    """
    _rate_limit()
    r = requests.get(
        f"{BASE}/wiki/v2/spaces/get_node",
        headers=_headers(token),
        params={"token": wiki_node_token},
    )
    data = r.json()
    if data.get("code") != 0:
        print(red(f"  ✘ Wiki 节点解析失败: {data.get('msg')}"))
        return None
    node = data.get("data", {}).get("node") or {}
    obj_token = node.get("obj_token") or ""
    if not obj_token:
        print(red("  ✘ Wiki 节点响应中无 obj_token"))
        return None
    return obj_token


def get_sheet_info(token, spreadsheet):
    """Get sheet metadata (list of sheets with id, title, grid_properties)."""
    _rate_limit()
    r = requests.get(
        f"{BASE}/sheets/v3/spreadsheets/{spreadsheet}/sheets/query",
        headers=_headers(token),
    )
    data = r.json()
    if data.get("code") != 0:
        print(red(f"  ✘ 获取飞书 Sheet 信息失败: {data.get('msg')}"))
        return None
    return data.get("data", {}).get("sheets", [])


def get_sheet_grid_column_count(token, spreadsheet, sheet_id: str) -> Optional[int]:
    """读取子表 grid_properties.column_count；无法获取时返回 None。"""
    sheets = get_sheet_info(token, spreadsheet)
    if not sheets:
        return None
    want = str(sheet_id).strip()
    for sh in sheets:
        sid = str(sh.get("sheet_id") or sh.get("id") or "").strip()
        if sid != want:
            continue
        gp = sh.get("grid_properties") or {}
        n = gp.get("column_count")
        if n is not None:
            return max(1, int(n))
        return None
    return None


def _hint_feishu_error(msg) -> None:
    """根据常见错误补充一行可操作提示。"""
    if msg is None:
        return
    raw = str(msg)
    low = raw.lower()
    if "locked" in low or "锁定" in raw:
        print(
            red(
                "  提示: 表格或目标单元格处于锁定/只读（或受保护范围限制）。"
                "请在飞书中关闭工作表保护、取消锁定区域，并确认应用对文档有编辑权限。"
            )
        )
    if "exceeds grid" in low or "grid limits" in low or "col range is invalid" in low:
        print(
            red(
                "  提示: 行列范围超出当前子表网格。若刚删过列，请刷新或扩大子表列数后再同步。"
            )
        )


def write_sheet(token, spreadsheet, range_str, values):
    """Write values to a sheet range.
    range_str example: 'sheet_id!A2:F100'
    values: list of rows, each row is a list of cell values.
    """
    _rate_limit()
    r = requests.put(
        f"{BASE}/sheets/v2/spreadsheets/{spreadsheet}/values",
        headers=_headers(token),
        json={
            "valueRange": {
                "range": range_str,
                "values": values,
            }
        },
    )
    data = r.json()
    if data.get("code") != 0:
        m = data.get("msg")
        print(red(f"  ✘ 写入飞书 Sheet 失败: {m}"))
        _hint_feishu_error(m)
        return False
    return True


def _col_to_letter_zero_based(col_idx: int) -> str:
    """0-based column index → Excel 列字母 (0→A, 25→Z, 26→AA)."""
    n = col_idx + 1
    letters = ""
    while n:
        n, rem = divmod(n - 1, 26)
        letters = chr(65 + rem) + letters
    return letters


def column_index_to_letter(col_idx_zero_based: int) -> str:
    """0-based 列下标 → A、B、…（供日志展示）。"""
    return _col_to_letter_zero_based(col_idx_zero_based)


def clear_rows(token, spreadsheet, sheet_id, start_row, end_row):
    """Clear content in specified row range (1-indexed)."""
    range_str = f"{sheet_id}!A{start_row}:Z{end_row}"
    empty_rows = [[""] * 26 for _ in range(end_row - start_row + 1)]
    return write_sheet(token, spreadsheet, range_str, empty_rows)


# 清底时同步恢复默认字体色（飞书 style 与 backColor 并列，#RRGGBB）
_DEFAULT_FORE_COLOR = "#000000"


def batch_set_bg_color(token, spreadsheet, sheet_id, row_ranges, color):
    """Set background color for given row ranges.
    color: hex string like '#FFFF00' for yellow, or None to clear (白底).
    row_ranges: list of (start_row, end_row, start_col, end_col) — 0-indexed.

    使用 PUT .../styles_batch_update。清底（color is None）时同时设置 foreColor 为默认黑色，
    避免仅清背景而文字仍保留上次彩色格式。
    """
    if not row_ranges:
        return True

    if color:
        hx = color.lstrip("#").lower()
        back_hex = f"#{hx}" if len(hx) == 6 else "#ffff00"
    else:
        back_hex = "#ffffff"

    for sr, er, sc, ec in row_ranges:
        _rate_limit()
        start_col_letter = _col_to_letter_zero_based(sc)
        end_col_letter = _col_to_letter_zero_based(ec)
        range_str = f"{sheet_id}!{start_col_letter}{sr+1}:{end_col_letter}{er+1}"

        style = {"backColor": back_hex}
        if not color:
            style["foreColor"] = _DEFAULT_FORE_COLOR

        body = {
            "data": [
                {
                    "ranges": [range_str],
                    "style": style,
                }
            ]
        }
        resp = requests.put(
            f"{BASE}/sheets/v2/spreadsheets/{spreadsheet}/styles_batch_update",
            headers=_headers(token),
            json=body,
        )
        data = resp.json()
        if data.get("code") != 0:
            m = data.get("msg")
            print(red(f"  ✘ 设置背景色失败 ({range_str}): {m}"))
            _hint_feishu_error(m)
            return False
    return True


def _contiguous_col_runs(cols):
    """cols: sorted unique column indices → [(start_col, end_col), ...]"""
    if not cols:
        return []
    runs = []
    s = e = cols[0]
    for x in cols[1:]:
        if x == e + 1:
            e = x
        else:
            runs.append((s, e))
            s = e = x
    runs.append((s, e))
    return runs


def batch_set_cell_bg_colors(token, spreadsheet, sheet_id, cells, color):
    """Set background color for individual cells.
    cells: list of (row, col) — 0-indexed sheet row/col (row 0 = 表头行).
    color: hex string like '#FFFF00'.
    """
    if not cells:
        return True

    row_groups = {}
    for r, c in cells:
        row_groups.setdefault(r, []).append(c)

    ranges = []
    for r, cols in row_groups.items():
        cols = sorted(set(cols))
        for sc, ec in _contiguous_col_runs(cols):
            ranges.append((r, r, sc, ec))

    ok = batch_set_bg_color(token, spreadsheet, sheet_id, ranges, color)
    if not ok:
        print(red("  ✘ 变更高亮（黄色背景）未完全成功，请检查飞书 API 返回或权限"))
    return ok


_app_name_cache = {"name": None}


def get_app_name(token) -> str:
    """获取当前飞书应用名称，结果缓存。"""
    if _app_name_cache["name"] is not None:
        return _app_name_cache["name"]
    _rate_limit()
    r = requests.get(
        f"{BASE}/application/v6/applications/me",
        headers=_headers(token),
        params={"lang": "zh_cn"},
    )
    data = r.json()
    if data.get("code") != 0:
        print(red(f"  ✘ 获取应用名称失败: {data.get('msg')}"))
        _app_name_cache["name"] = ""
        return ""
    name = data.get("data", {}).get("app", {}).get("app_name", "")
    _app_name_cache["name"] = name
    return name


def create_version(token, file_token, name, obj_type="sheet"):
    """为云文档创建命名版本快照。"""
    _rate_limit()
    r = requests.post(
        f"{BASE}/drive/v1/files/{file_token}/versions",
        headers=_headers(token),
        json={"name": name, "obj_type": obj_type},
    )
    data = r.json()
    if data.get("code") != 0:
        print(red(f"  ✘ 创建版本快照失败: {data.get('msg')}"))
        return False
    version = data.get("data", {}).get("version", "")
    print(f"  版本快照已创建: 「{name}」 (version={version})")
    return True
