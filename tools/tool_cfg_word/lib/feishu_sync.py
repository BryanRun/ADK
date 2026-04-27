"""飞书中间表格同步逻辑。

流程:
1. 读取当前飞书 sheet 数据
2. **结构校验**（与主流程 ``validate`` 步骤相同规则）：不通过则**不写飞书**，直接失败
3. 从 ConfigItem 列表构建新数据行
4. 对比新旧数据，记录差异单元格
5. 清除非首行背景色（有变更时）
6. 写入新数据
7. 对差异单元格设置黄色背景
"""

from lib.feishu_api import (
    read_sheet,
    write_sheet,
    batch_set_bg_color,
    batch_set_cell_bg_colors,
    get_sheet_grid_column_count,
    column_index_to_letter,
)
from lib.term_color import red, yellow

NUM_COLS = 6  # 飞书表共 6 列（含 VALUE_DESCIPTION）
# 同步仅写入 A~E，不覆盖 F 列（VALUE_DESCIPTION 由人工/其他流程维护）
SYNC_WRITE_COLS = 5
COL_LETTERS = "ABCDEF"
SYNC_RANGE_END_LETTER = "E"  # A2:E{n}
# 清背景时覆盖 A~Z：避免飞书在 F 列以外仍保留旧着色，导致「未全部变白」
CLEAR_COL_END_INDEX = 25  # 0-based, column Z


def _normalize_cell(val):
    """Normalize cell value for comparison."""
    if val is None:
        return ""
    s = str(val).strip()
    # Normalize numeric strings: "0" and "0.0" should match 0
    try:
        n = float(s)
        if n == int(n):
            return str(int(n))
        return s
    except (ValueError, TypeError):
        return s


def sync_to_feishu(token, spreadsheet, sheet_id, project_name, items, project_config):
    """Sync ConfigItem list to Feishu intermediate spreadsheet.
    写入前必须通过 ``validate_config_word_items``，与流水线中 [validate] 步骤一致。
    Returns True on success."""

    # 1. Read current Feishu data
    old_rows = read_sheet(token, spreadsheet, sheet_id)
    if old_rows is None:
        return False

    # 2. 与 validate 相同规则：未通过则不同步，避免把不符合预期的数据写入中间表
    from lib.config_validate import validate_config_word_items

    ok, errs = validate_config_word_items(project_name, project_config or {}, items)
    if not ok:
        print(red("  ✘ 同步已中止：配置字未通过结构校验（规则与 [validate] 一致）:"))
        for e in errs:
            print(red(f"    - {e}"))
        return False

    old_data = old_rows[1:] if len(old_rows) > 1 else []  # skip header

    # 3. Build new data rows from items（仅 A~E；F 列不参与对比与写入）
    new_rows = []
    for item in items:
        full = item.to_feishu_row()
        new_rows.append(full[:SYNC_WRITE_COLS])

    # 4. Compare old vs new（只比较 A~E，忽略 VALUE_DESCIPTION）
    max_rows = max(len(old_data), len(new_rows))
    changed_cells = []  # (row_0indexed, col_0indexed) — row is absolute (0=header)

    for r in range(max_rows):
        old_row = old_data[r] if r < len(old_data) else [None] * NUM_COLS
        new_row = new_rows[r] if r < len(new_rows) else [""] * SYNC_WRITE_COLS

        for c in range(SYNC_WRITE_COLS):
            old_val = _normalize_cell(old_row[c] if c < len(old_row) else None)
            new_val = _normalize_cell(new_row[c] if c < len(new_row) else "")
            if old_val != new_val:
                changed_cells.append((r + 1, c))  # +1 because row 0 is header

    n_changed = len(changed_cells)
    n_rows_changed = len(set(r for r, c in changed_cells))
    print(f"  对比结果: {len(new_rows)} 行新数据, {len(old_data)} 行旧数据")
    if n_changed == 0:
        print(yellow("  无变化，跳过更新"))
        return True
    print(f"  检测到 {n_changed} 个单元格变化 (涉及 {n_rows_changed} 行)")

    # 5. Clear background on existing data rows only — new rows don't exist in the grid yet
    clear_end = len(old_data) + 1  # +1 for header offset; only existing rows
    last_sheet_row = clear_end  # 1-based last row number to touch
    grid_n = get_sheet_grid_column_count(token, spreadsheet, sheet_id)
    if grid_n is not None:
        clear_col_end = min(CLEAR_COL_END_INDEX, grid_n - 1)
    else:
        clear_col_end = NUM_COLS - 1
    clear_col_end = max(clear_col_end, SYNC_WRITE_COLS - 1)
    col_end_letter = column_index_to_letter(clear_col_end)
    print(
        f"  清除背景色 (行 2 ~ {last_sheet_row}，列 A~{col_end_letter}，置白底)..."
    )
    if not batch_set_bg_color(
        token,
        spreadsheet,
        sheet_id,
        [(1, clear_end - 1, 0, clear_col_end)],
        None,
    ):
        print(red("  ✘ 清除背景色失败，已中止同步"))
        return False

    # 6. 仅写入 A~E（不更新 F 列 VALUE_DESCIPTION）
    write_end_row = len(new_rows) + 1  # 1-indexed row number of last data row
    range_str = f"{sheet_id}!A2:{SYNC_RANGE_END_LETTER}{write_end_row}"
    print(f"  写入数据 ({len(new_rows)} 行，列 A~{SYNC_RANGE_END_LETTER}，不更新 VALUE_DESCIPTION)...")
    if not write_sheet(token, spreadsheet, range_str, new_rows):
        return False

    # 若新数据行数变少，仅清空多余行的 A~E，不碰 F 列
    if len(old_data) > len(new_rows):
        excess_start = len(new_rows) + 2  # 1-indexed
        excess_end = len(old_data) + 1
        excess_range = f"{sheet_id}!A{excess_start}:{SYNC_RANGE_END_LETTER}{excess_end}"
        empty = [[""] * SYNC_WRITE_COLS for _ in range(len(old_data) - len(new_rows))]
        write_sheet(token, spreadsheet, excess_range, empty)

    # 7. Highlight changed cells in yellow（须在写入之后执行，避免被覆盖）
    if changed_cells:
        print(f"  高亮变更单元格 ({n_changed} 个)...")
        if not batch_set_cell_bg_colors(
            token, spreadsheet, sheet_id, changed_cells, "#FFFF00"
        ):
            print(yellow("  ⚠ 数据已写入，但部分单元格未能标黄，请检查日志"))
            return False

    print("  同步完成 ✓")
    return True
