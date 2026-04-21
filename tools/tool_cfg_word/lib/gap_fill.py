"""输入源未出现的字节：补整字节（8 bit）reserved 行，供飞书中间表与后续校验一致。"""

from collections import defaultdict
from typing import List

from lib.parsers import ConfigItem


def fill_missing_bytes_with_full_reserved(items: List[ConfigItem], byte_count: int) -> List[ConfigItem]:
    """对 ``0 .. byte_count-1`` 中**完全没有行**的字节，补一条 ``uint8_t`` 全字节预留。

    若某字节在输入源已有任意行（即使 BIT 未凑满 8），**不**插入本函数生成的行，
    该类问题由结构校验报告。

    同一字节多行顺序保持解析顺序；输出按字节序号 0→N-1 排列。
    """
    if byte_count < 1:
        return items

    by_byte: dict[int, List[ConfigItem]] = defaultdict(list)
    orphan: List[ConfigItem] = []
    for it in items:
        b = int(it.byte)
        if 0 <= b < byte_count:
            by_byte[b].append(it)
        else:
            orphan.append(it)

    out: List[ConfigItem] = []
    for b in range(byte_count):
        if b in by_byte:
            out.extend(by_byte[b])
        else:
            out.append(
                ConfigItem(
                    byte=b,
                    bit_count=8,
                    type="uint8_t",
                    chinese_name="",
                    english_name="",
                    description="",
                    is_reserved=True,
                    raw_chinese_name="reserved",
                )
            )
    out.extend(orphan)
    return out
