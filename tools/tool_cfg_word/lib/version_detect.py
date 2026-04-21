"""从文件名中提取版本号/日期，自动选取最新版本的 Excel 文件。

支持的文件名格式:
  - *_YYYYMMDD.xlsx / .xlsm        (如 N5系..._20260313.xlsm)
  - *_YYYY-MM-DD.xlsx               (如 config_2025-04-05.xlsx)
  - *_YYYY_MM_DD.xlsx               (如 config_2025_04_05.xlsx)
  - *-VXXX-YYYYMMDD.xlsx            (如 ...-V3.8-20260313.xlsm)
  - 纯 YYMMDD 后缀                  (如 config_250405.xlsx)
"""

import os
import re

_DATE_PATTERNS = [
    re.compile(r'(\d{4})(\d{2})(\d{2})'),      # YYYYMMDD
    re.compile(r'(\d{4})[-_](\d{2})[-_](\d{2})'),  # YYYY-MM-DD / YYYY_MM_DD
]

_SHORT_DATE = re.compile(r'(\d{2})(\d{2})(\d{2})')  # YYMMDD

EXCEL_EXTS = {'.xlsx', '.xlsm', '.xls'}


def extract_date(filename):
    """Extract (year, month, day) tuple from filename, or None."""
    base = os.path.splitext(os.path.basename(filename))[0]
    for pat in _DATE_PATTERNS:
        m = pat.search(base)
        if m:
            y, mo, d = int(m.group(1)), int(m.group(2)), int(m.group(3))
            if 2020 <= y <= 2099 and 1 <= mo <= 12 and 1 <= d <= 31:
                return (y, mo, d)
    m = _SHORT_DATE.search(base)
    if m:
        y, mo, d = int(m.group(1)) + 2000, int(m.group(2)), int(m.group(3))
        if 2020 <= y <= 2099 and 1 <= mo <= 12 and 1 <= d <= 31:
            return (y, mo, d)
    return None


def find_excel_files(directory):
    """List all Excel files in directory (non-recursive)."""
    if not os.path.isdir(directory):
        return []
    result = []
    for f in os.listdir(directory):
        if f.startswith("~$"):
            continue
        ext = os.path.splitext(f)[1].lower()
        if ext in EXCEL_EXTS:
            result.append(os.path.join(directory, f))
    return sorted(result)


def find_latest_file(directory):
    """Find the Excel file with the most recent date in its filename.
    Falls back to lexicographic sort if no dates found."""
    files = find_excel_files(directory)
    if not files:
        return None
    if len(files) == 1:
        return files[0]

    dated = []
    for f in files:
        d = extract_date(f)
        if d:
            dated.append((d, f))

    if dated:
        dated.sort(key=lambda x: x[0], reverse=True)
        return dated[0][1]

    return files[-1]
