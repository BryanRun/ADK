"""飞书 Property 表 psis.car_cfg 增量同步。

流程：读表 → 按 PSIS属性名（J 列）建索引 → 跳过 reserved → 对比 → 清背景色 → 写入 → 高亮变更 → 追加 changeHistory。
"""

from collections import defaultdict
from datetime import date
from typing import Any, Dict, List, Tuple

from lib.feishu_api import (
    batch_set_bg_color,
    batch_set_cell_bg_colors,
    get_app_name,
    get_sheet_info,
    read_sheet,
    write_sheet,
)
from lib.term_color import red, yellow

NUM_COLS = 11  # A..K
KEY_COL = 9    # J: PSIS属性名
COL_END = "K"


def _normalize_cell(val) -> str:
    if val is None:
        return ""
    s = str(val).strip()
    try:
        n = float(s)
        if n == int(n):
            return str(int(n))
        return s
    except (ValueError, TypeError):
        return s


def _pad_row(row: list, n: int) -> list:
    row = list(row or [])
    while len(row) < n:
        row.append("")
    return row[:n]


def _load_macro_names_from_mid_table(token, mid_spreadsheet, mid_sheet_id):
    """从中间表格读取 D 列宏名，返回按行序的非 reserved 宏名列表。"""
    mid_rows = read_sheet(token, mid_spreadsheet, mid_sheet_id)
    if not mid_rows or len(mid_rows) < 2:
        return None
    macro_names = []
    for row in mid_rows[1:]:
        d_val = str(row[3]).strip() if len(row) > 3 else ""
        if not d_val or d_val == "RESERVED_" or d_val.upper().startswith("RESERVED"):
            continue
        macro_names.append(d_val)
    return macro_names if macro_names else None


def sync_psis_car_cfg(token, spreadsheet, sheet_id, items, sheet_name="",
                      *, mid_token=None, mid_spreadsheet=None, mid_sheet_id=None) -> bool:
    """将非 reserved 的 ConfigItem 全量同步到飞书 psis.car_cfg。
    按 items 顺序写入，与中间表格行序一致；孤立行自动删除。
    若提供中间表格参数，宏名从中间表 D 列获取，确保与中间表一致。"""
    if mid_token and mid_spreadsheet and mid_sheet_id:
        mid_macros = _load_macro_names_from_mid_table(mid_token, mid_spreadsheet, mid_sheet_id)
        if mid_macros:
            non_reserved = [it for it in items if not it.is_reserved and (it.english_name or "").strip()]
            if len(mid_macros) == len(non_reserved):
                for it, macro in zip(non_reserved, mid_macros):
                    it.english_name = macro
                print(f"  宏名已从中间表格 D 列同步 ({len(mid_macros)} 项)")
            else:
                print(yellow(f"  ⚠ 中间表格非 reserved 行数 ({len(mid_macros)}) 与 items ({len(non_reserved)}) 不一致，回退使用 items 宏名"))

    rows = read_sheet(token, spreadsheet, sheet_id)
    if rows is None:
        return False
    if not rows:
        print(red("  ✘ Property 表为空，至少需要表头行"))
        return False

    if len(rows[0]) < KEY_COL + 1:
        print(red("  ✘ Property 表列数不足（需要至少 J 列 PSIS属性名）"))
        return False

    old_data = rows[1:]
    old_by_key: Dict[str, List] = {}
    for row in old_data:
        prow = _pad_row(row, NUM_COLS)
        k = str(prow[KEY_COL]).strip()
        if k:
            old_by_key[k] = prow

    raw_work = [
        it for it in items
        if not it.is_reserved and (it.english_name or "").strip()
    ]
    by_en: Dict[str, Any] = {}
    for it in raw_work:
        by_en[(it.english_name or "").strip()] = it
    work_items = list(by_en.values())
    if not work_items:
        print(yellow("  无需要同步的 Property 行（全部为 reserved 或无英文名）"))
        return True

    new_rows = [it.to_property_row() for it in work_items]
    new_keys = set((it.english_name or "").strip() for it in work_items)

    deleted_names = [k for k in old_by_key if k not in new_keys]
    updated_names = []
    appended_names = []
    changed_cells: List[Tuple[int, int]] = []

    for r0, new_row in enumerate(new_rows):
        sheet_row_0 = r0 + 1
        key = str(new_row[KEY_COL]).strip()
        if key in old_by_key:
            old = old_by_key[key]
            has_diff = False
            for c in range(NUM_COLS):
                if _normalize_cell(old[c]) != _normalize_cell(new_row[c]):
                    changed_cells.append((sheet_row_0, c))
                    has_diff = True
            if has_diff:
                updated_names.append(key)
        else:
            for c in range(NUM_COLS):
                changed_cells.append((sheet_row_0, c))
            appended_names.append(key)

    if not updated_names and not appended_names and not deleted_names:
        print(yellow("  Property 表无变更"))
        return True

    print(f"  Property 同步: 更新 {len(updated_names)} 行, 追加 {len(appended_names)} 行, 删除 {len(deleted_names)} 行")

    last_row_0 = max(len(old_data), len(new_rows))
    if last_row_0 < 1:
        last_row_0 = 1

    print(f"  清除背景色 (行 2 ~ {last_row_0 + 1})...")
    batch_set_bg_color(
        token, spreadsheet, sheet_id, [(1, last_row_0, 0, NUM_COLS - 1)], None
    )

    write_end_row = len(new_rows) + 1
    rng = f"{sheet_id}!A2:{COL_END}{write_end_row}"
    print(f"  写入数据 ({len(new_rows)} 行)...")
    if not write_sheet(token, spreadsheet, rng, new_rows):
        return False

    if len(old_data) > len(new_rows):
        excess_start = len(new_rows) + 2
        excess_end = len(old_data) + 1
        excess_range = f"{sheet_id}!A{excess_start}:{COL_END}{excess_end}"
        empty = [[""] * NUM_COLS for _ in range(len(old_data) - len(new_rows))]
        write_sheet(token, spreadsheet, excess_range, empty)

    if changed_cells:
        print(f"  高亮变更单元格 ({len(changed_cells)} 个)...")
        batch_set_cell_bg_colors(token, spreadsheet, sheet_id, changed_cells, "#FFFF00")

    print("  Property 表同步完成 ✓")

    if not _append_change_history(
        token, spreadsheet, sheet_name, updated_names, appended_names, deleted_names
    ):
        return False

    return True


def _set_cell_date_format(token, spreadsheet, sheet_id, row_1based):
    """将 B 列单元格格式设为日期。"""
    import requests
    from lib.feishu_api import BASE, _headers, _rate_limit

    range_str = f"{sheet_id}!B{row_1based}:B{row_1based}"
    _rate_limit()
    requests.put(
        f"{BASE}/sheets/v2/spreadsheets/{spreadsheet}/styles_batch_update",
        headers=_headers(token),
        json={"data": [{"ranges": [range_str], "style": {"formatter": "yyyy/MM/dd"}}]},
    )


def _set_cell_wrap(token, spreadsheet, sheet_id, row_1based, col_letter):
    """将指定单元格设为自动换行。"""
    import requests
    from lib.feishu_api import BASE, _headers, _rate_limit

    range_str = f"{sheet_id}!{col_letter}{row_1based}:{col_letter}{row_1based}"
    _rate_limit()
    requests.put(
        f"{BASE}/sheets/v2/spreadsheets/{spreadsheet}/styles_batch_update",
        headers=_headers(token),
        json={"data": [{"ranges": [range_str], "style": {"textDecoration": {"wrapStrategy": 1}}}]},
    )


def _append_change_history(
    token, spreadsheet, sheet_name, updated_names, appended_names, deleted_names=None
) -> bool:
    """在同一 spreadsheet 的 changeHistory 子表追加一条变更记录。"""
    sheets = get_sheet_info(token, spreadsheet)
    if not sheets:
        print(red("  ✘ 无法获取子表列表，changeHistory 写入失败"))
        return False
    history_sheet_id = None
    for sh in sheets:
        t = sh.get("title") or sh.get("sheet_title") or ""
        if str(t).strip().lower() == "changehistory":
            history_sheet_id = sh.get("sheet_id") or sh.get("id")
            break
    if not history_sheet_id:
        print(red("  ✘ 未找到 changeHistory 子表"))
        return False

    rows = read_sheet(token, spreadsheet, history_sheet_id)
    if rows is None:
        print(red("  ✘ 读取 changeHistory 失败"))
        return False

    insert_row_1 = 1
    for i, row in enumerate(rows):
        b_val = str(row[1]).strip() if len(row) > 1 else ""
        if b_val:
            insert_row_1 = i + 2
            continue
        break
    else:
        insert_row_1 = len(rows) + 1

    parts = []
    if updated_names:
        parts.append(f"更新 {', '.join(updated_names)}")
    if appended_names:
        parts.append(f"追加 {', '.join(appended_names)}")
    if deleted_names:
        parts.append(f"删除 {', '.join(deleted_names)}")
    label = sheet_name or "psis.car_cfg"
    summary = f"{label}: {'; '.join(parts)}"

    app_name = get_app_name(token) or "HUALEI AI FLOW"
    today = date.today()
    date_serial = (today - date(1899, 12, 30)).days

    rng = f"{history_sheet_id}!B{insert_row_1}:D{insert_row_1}"
    row_data = [date_serial, app_name, summary]
    if not write_sheet(token, spreadsheet, rng, [row_data]):
        print(red("  ✘ changeHistory 写入失败"))
        return False

    _set_cell_date_format(token, spreadsheet, history_sheet_id, insert_row_1)
    _set_cell_wrap(token, spreadsheet, history_sheet_id, insert_row_1, "D")
    changed = [(insert_row_1 - 1, c) for c in range(1, 4)]  # B~D, 0-indexed row/col
    batch_set_cell_bg_colors(token, spreadsheet, history_sheet_id, changed, "#FFFF00")
    print(f"  changeHistory 已追加: {today} | {summary}")
    return True

