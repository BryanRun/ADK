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


def sync_psis_car_cfg(token, spreadsheet, sheet_id, items, sheet_name="") -> bool:
    """将非 reserved 的 ConfigItem 增量同步到飞书 psis.car_cfg。以 english_name 为键（J 列）。"""
    rows = read_sheet(token, spreadsheet, sheet_id)
    if rows is None:
        return False
    if not rows:
        print(red("  ✘ Property 表为空，至少需要表头行"))
        return False

    if len(rows[0]) < KEY_COL + 1:
        print(red("  ✘ Property 表列数不足（需要至少 J 列 PSIS属性名）"))
        return False

    data_rows = rows[1:]
    # PSIS属性名 -> 所有数据行在 rows 中的 0-based 行下标
    key_to_sheet_rows: Dict[str, List[int]] = defaultdict(list)
    for i, row in enumerate(data_rows):
        sheet_row_0 = i + 1
        prow = _pad_row(row, NUM_COLS)
        k = str(prow[KEY_COL]).strip()
        if k:
            key_to_sheet_rows[k].append(sheet_row_0)

    raw_work = [
        it for it in items
        if not it.is_reserved and (it.english_name or "").strip()
    ]
    # 同一英文名只保留最后一条（与 codegen 宏唯一一致）
    by_en: Dict[str, Any] = {}
    for it in raw_work:
        by_en[(it.english_name or "").strip()] = it
    work_items = list(by_en.values())
    if not work_items:
        print(yellow("  无需要同步的 Property 行（全部为 reserved 或无英文名）"))
        return True

    in_place: List[Tuple[int, List]] = []
    appends: List[List] = []
    changed_cells: List[Tuple[int, int]] = []

    for it in work_items:
        key = (it.english_name or "").strip()
        new_row = it.to_property_row()

        if key in key_to_sheet_rows:
            for sheet_row_0 in key_to_sheet_rows[key]:
                old = _pad_row(rows[sheet_row_0], NUM_COLS)
                diffs = []
                for c in range(NUM_COLS):
                    if _normalize_cell(old[c]) != _normalize_cell(new_row[c]):
                        diffs.append((sheet_row_0, c))
                if diffs:
                    changed_cells.extend(diffs)
                    in_place.append((sheet_row_0, new_row))
        else:
            appends.append(new_row)

    n_append = len(appends)
    append_start_0 = len(rows)

    for i in range(n_append):
        r0 = append_start_0 + i
        for c in range(NUM_COLS):
            changed_cells.append((r0, c))

    if not in_place and not appends:
        print(yellow("  Property 表无变更"))
        return True

    updated_names = [row[KEY_COL] for _, row in in_place]
    appended_names = [row[KEY_COL] for row in appends]

    print(f"  Property 同步: 更新 {len(in_place)} 行, 追加 {n_append} 行")

    last_data_row_0 = len(rows) - 1 + n_append
    if last_data_row_0 < 1:
        last_data_row_0 = 1

    print(f"  清除背景色 (行 2 ~ {last_data_row_0 + 1})...")
    batch_set_bg_color(
        token, spreadsheet, sheet_id, [(1, last_data_row_0, 0, NUM_COLS - 1)], None
    )

    for sheet_row_0, new_row in in_place:
        r1 = sheet_row_0 + 1
        rng = f"{sheet_id}!A{r1}:{COL_END}{r1}"
        if not write_sheet(token, spreadsheet, rng, [new_row]):
            return False

    if appends:
        a0 = len(rows) + 1
        a1 = len(rows) + len(appends)
        rng = f"{sheet_id}!A{a0}:{COL_END}{a1}"
        if not write_sheet(token, spreadsheet, rng, appends):
            return False

    if changed_cells:
        print(f"  高亮变更单元格 ({len(changed_cells)} 个)...")
        batch_set_cell_bg_colors(token, spreadsheet, sheet_id, changed_cells, "#FFFF00")

    print("  Property 表同步完成 ✓")

    if not _append_change_history(
        token, spreadsheet, sheet_name, updated_names, appended_names
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


def _append_change_history(
    token, spreadsheet, sheet_name, updated_names, appended_names
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
    changed = [(insert_row_1 - 1, c) for c in range(1, 4)]  # B~D, 0-indexed row/col
    batch_set_cell_bg_colors(token, spreadsheet, history_sheet_id, changed, "#FFFF00")
    print(f"  changeHistory 已追加: {today} | {summary}")
    return True

