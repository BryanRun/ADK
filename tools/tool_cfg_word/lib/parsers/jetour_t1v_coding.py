"""捷途 T1V「03.3.Coding DID」表解析器。

仅处理 DID **0xF011**（整车配置信息）块：从首次出现 0xF011 的行起向下扫描。

列索引（0-based）: 6=Byte, 7=Bit, 8=英文名, 9=中文名

说明：表中 0xF011 可能定义极长字节区间（如 313~899）。与 `cfg_cal.h` 中常见 **24 字节**
整车配置字对齐时，默认只保留 **Byte 0~MAX_VEHICLE_BYTE**（含）。若需全量解析，
将下方常量改为 `None`。
"""

# 与 Did 0xF011 常见 24 字节（0~23）对齐；设为 None 表示不截断
MAX_VEHICLE_BYTE = 23

import re
import openpyxl
from lib.parsers import ConfigItem, register_parser

_NOT_USED = re.compile(r"not\s*used", re.I)


def _cell_str(val):
    return str(val).strip() if val is not None else ""


def _clean_name(s):
    if not s:
        return ""
    return _cell_str(s).replace("\r\n", "\n").replace("\n", "")


def _is_reserved_cn_en(cn, en):
    c, e = _clean_name(cn), _clean_name(en)
    if not c and not e:
        return True
    if _NOT_USED.search(c) or _NOT_USED.search(e):
        return True
    if c in ("预留",) or e.lower() in ("reserved",):
        return True
    return False


def _bit_width(bit_cell):
    if bit_cell is None:
        return None
    if isinstance(bit_cell, bool):
        return 1
    if isinstance(bit_cell, (int, float)):
        return 1
    s = str(bit_cell).strip()
    if s.upper() == "ALL":
        return 8
    if "~" in s:
        a, b = [x.strip() for x in s.split("~", 1)]
        return int(b) - int(float(a)) + 1
    try:
        float(s)
        return 1
    except ValueError:
        return 8


def _byte_list(byte_cell, prev_byte):
    """Return list of byte indices for this row; may be empty."""
    if byte_cell is None:
        return [prev_byte] if prev_byte is not None else []
    if isinstance(byte_cell, bool):
        return [int(byte_cell)]
    if isinstance(byte_cell, (int, float)):
        return [int(byte_cell)]
    s = str(byte_cell).strip()
    if "~" in s and not s.lower().startswith("0x"):
        a, b = [x.strip() for x in s.split("~", 1)]
        lo, hi = int(float(a)), int(float(b))
        return list(range(lo, hi + 1))
    try:
        return [int(float(s))]
    except ValueError:
        return []


def _split_width_across_bytes(byte_list, total_width, bit_cell_str):
    """Emit (byte, bit_count) pairs. ALL over multi-byte => 8 bits per byte."""
    if not byte_list:
        return []
    if len(byte_list) == 1:
        w = min(total_width, 8)
        return [(byte_list[0], w)]
    # multi-byte row
    if bit_cell_str and str(bit_cell_str).strip().upper() == "ALL":
        return [(b, 8) for b in byte_list]
    # e.g. 9~10 with 0~7 might mean 16 bits => 8+8
    per = total_width // len(byte_list)
    if per * len(byte_list) == total_width and per <= 8:
        return [(b, per) for b in byte_list]
    # fallback: first byte takes up to 8, rest
    out = []
    rem = total_width
    for b in byte_list:
        take = min(8, rem)
        out.append((b, take))
        rem -= take
        if rem <= 0:
            break
    return out


@register_parser("jetour_t1v_coding")
def parse(excel_path, sheet_name):
    wb = openpyxl.load_workbook(excel_path, read_only=True, data_only=True)
    if sheet_name not in wb.sheetnames:
        wb.close()
        raise ValueError(f"Sheet '{sheet_name}' not found in {excel_path}")

    ws = wb[sheet_name]
    rows = list(ws.iter_rows(values_only=True))
    wb.close()

    start = None
    for i, row in enumerate(rows):
        if row and len(row) > 1 and _cell_str(row[1]) == "0xF011":
            start = i
            break
    if start is None:
        raise ValueError("jetour_t1v_coding: 未找到 DID 0xF011 行")

    items = []
    prev_byte = None
    bit_cell_str = ""

    for row in rows[start + 1 :]:
        if not row or len(row) < 10:
            continue
        bcell = row[6] if len(row) > 6 else None
        bit_cell = row[7] if len(row) > 7 else None
        en = row[8] if len(row) > 8 else None
        cn = row[9] if len(row) > 9 else None
        extra_desc = _cell_str(row[10]) if len(row) > 10 else ""

        blist = _byte_list(bcell, prev_byte)
        if not blist:
            continue

        prev_byte = blist[-1]
        w = _bit_width(bit_cell)
        if w is None or w <= 0:
            continue

        bit_cell_str = str(bit_cell).strip() if bit_cell is not None else ""
        pairs = _split_width_across_bytes(blist, w, bit_cell_str)

        cn_s = _clean_name(cn)
        en_s = _clean_name(en)
        display_name = cn_s or en_s
        reserved = _is_reserved_cn_en(cn, en)

        cn_raw = _cell_str(cn)
        en_raw = _cell_str(en)
        raw_line = "/".join(x for x in (cn_raw, en_raw) if x)

        for bnum, bc in pairs:
            if MAX_VEHICLE_BYTE is not None and bnum > MAX_VEHICLE_BYTE:
                continue
            items.append(
                ConfigItem(
                    byte=bnum,
                    bit_count=min(bc, 8),
                    type="uint8_t",
                    chinese_name=display_name if not reserved else "",
                    description=extra_desc,
                    is_reserved=reserved,
                    raw_chinese_name=raw_line,
                )
            )

    if not items:
        raise ValueError("jetour_t1v_coding: 0xF011 块未解析到任何配置项")

    return items
