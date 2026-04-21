"""解析器注册表和 ConfigItem 数据模型。

每个解析器模块需实现 parse(excel_path, sheet_name) -> list[ConfigItem]。
"""

from dataclasses import dataclass, field
from typing import List, Optional, Callable

from lib.term_color import yellow


@dataclass
class ConfigItem:
    """一个配置字条目（中间表格的一行）。"""
    byte: int
    bit_count: int
    type: str               # e.g. "uint8_t"
    chinese_name: str        # 中文配置项名称（解析用，可能已清洗）
    english_name: str = ""   # 英文宏名（由 name_mapping 填充）
    description: str = ""    # VALUE_DESCRIPTION（可选）
    is_reserved: bool = False
    # 飞书「配置项名称」列展示用：保留 Excel 原文（含 reserved 后缀等），不填则回退 chinese_name
    raw_chinese_name: str = ""

    def to_feishu_row(self):
        """Convert to the 6-column row format used by the Feishu intermediate table.

        - 英文宏列：预留行统一写 ``RESERVED_``（与中间表人工习惯一致）；内存中的
          ``english_name`` 仍可保留 ``RESERVED_n`` 等供生成与 Property 使用。
        - 配置项名称列：优先 ``raw_chinese_name``（Excel 原文，含 ``\\nreserved`` 等），
          避免把 reserved 后缀从飞书展示中去掉。
        """
        en = (self.english_name or "").strip()
        if self.is_reserved or (en and en.upper().startswith("RESERVED")):
            eng_for_feishu = "RESERVED_"
        else:
            eng_for_feishu = en

        raw = (self.raw_chinese_name or "").replace("\r\n", "\n")
        fallback = (self.chinese_name or "").replace("\r\n", "\n")
        if raw.strip():
            ch_display = raw.strip()
        elif fallback.strip():
            ch_display = fallback.strip()
        else:
            # 纯预留行且 Excel 空单元格时，仍在中表展示 reserved，避免被同步成空白
            ch_display = (
                "reserved"
                if (self.is_reserved or (en and en.upper().startswith("RESERVED")))
                else ""
            )

        return [
            self.byte,
            self.bit_count,
            self.type,
            eng_for_feishu,
            ch_display,
            self.description,
        ]

    def property_meaning_for_psis(self) -> str:
        """飞书 psis.car_cfg「属性意义」列：中文名 + 值描述/枚举（完整描述文本）。"""
        c = (self.chinese_name or "").strip()
        d = (self.description or "").strip()
        if c and d:
            return f"{c}\n{d}"
        return c or d

    def to_property_row(self) -> List:
        """飞书 Property 表 psis.car_cfg 一行（11 列 A~K）。"""
        en = (self.english_name or "").strip()
        return [
            f"CAR_CFG_{en}",
            "read",
            "OnChange",
            "0",
            "int32",
            "0",
            self.property_meaning_for_psis(),
            "None",
            "Did0xf011",
            en,
            "cfg_cal.h",
        ]


# Parser registry
_PARSERS: dict[str, Callable] = {}


def register_parser(name: str):
    """Decorator to register a parser function."""
    def wrapper(func):
        _PARSERS[name] = func
        return func
    return wrapper


def get_parser(name: str) -> Optional[Callable]:
    """Look up a parser by name, auto-importing known modules."""
    if name not in _PARSERS:
        _try_import(name)
    return _PARSERS.get(name)


def _try_import(name: str):
    """Attempt to import a parser module by name."""
    known_modules = {
        "n5x_acic": "lib.parsers.n5x_acic",
        "n5_baic_acic": "lib.parsers.n5x_acic",
        "baic_n80_icc": "lib.parsers.baic_n80_icc",
        "jetour_t1v_coding": "lib.parsers.jetour_t1v_coding",
    }
    mod_name = known_modules.get(name)
    if mod_name:
        try:
            __import__(mod_name)
        except ImportError as e:
            print(yellow(f"  ⚠ 无法加载解析器模块 {mod_name}: {e}"))
