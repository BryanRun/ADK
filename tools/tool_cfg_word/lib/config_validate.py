"""整车配置字结构校验（通用 + 按项目总字节数）。"""

from collections import defaultdict
from typing import Any, List, Tuple

# 缺失 BYTE 逐条列出时的上限，超出则合并为一条摘要（避免 t1v 等大批量缺失刷屏）
_MAX_MISSING_BYTE_LINES = 48


def validate_config_word_items(
    project_name: str, project_config: dict, items: List[Any]
) -> Tuple[bool, List[str]]:
    """校验 items 是否满足配置字规则。

    通用规则：对每个出现的 BYTE 值，该行集合内 BIT（bit_count）之和须为 8。

    项目规则（**必配** ``vehicle_config_byte_count`` = N）：表示本项目中表 DID 共 N 个字节，则
    - 每条目的 BYTE 须在 ``0 .. N-1`` 内；
    - **BYTE 0 ~ N-1 均须在解析结果中至少出现一次**（飞书中间表须显式覆盖全部字节）。

    未配置 ``vehicle_config_byte_count`` 时校验失败并提示补全。

    返回 (是否通过, 错误信息列表)。
    """
    errors: List[str] = []

    if not items:
        errors.append("配置项列表为空")
        return False, errors

    by_byte: dict[int, int] = defaultdict(int)
    for it in items:
        b = int(it.byte)
        by_byte[b] += int(it.bit_count)

    for b in sorted(by_byte.keys()):
        s = by_byte[b]
        if s != 8:
            errors.append(f"BYTE {b}：各条目的 BIT 位数之和为 {s}，应为 8")

    n_raw = project_config.get("vehicle_config_byte_count")
    if n_raw is None:
        errors.append(
            "请在 config.json 的该项目下配置 vehicle_config_byte_count（总字节数 N），"
            "并要求 BYTE 0~N-1 均在表中显式出现。"
        )
        return False, errors

    try:
        n = int(n_raw)
    except (TypeError, ValueError):
        errors.append(
            f"配置项 vehicle_config_byte_count 无效: {project_config.get('vehicle_config_byte_count')!r}"
        )
        return len(errors) == 0, errors

    if n < 1:
        errors.append(f"vehicle_config_byte_count 须为正整数，当前为 {n}")
        return len(errors) == 0, errors

    out_of_range = sorted(
        {int(it.byte) for it in items if not (0 <= int(it.byte) < n)}
    )
    for b in out_of_range:
        errors.append(
            f"BYTE {b} 超出本项目配置字范围（有效 0~{n - 1}，共 {n} 个字节）"
        )

    present = set(by_byte.keys())
    missing = [b for b in range(n) if b not in present]
    if missing:
        if len(missing) <= _MAX_MISSING_BYTE_LINES:
            for b in missing:
                errors.append(
                    f"BYTE {b} 在表中未出现（要求 BYTE 0~{n - 1} 共 {n} 个字节均须在表中显式出现）"
                )
        else:
            head = ", ".join(str(x) for x in missing[:_MAX_MISSING_BYTE_LINES])
            errors.append(
                f"表中未出现的字节共 {len(missing)} 个（要求 BYTE 0~{n - 1} 共 {n} 个字节均须在表中显式出现）。"
                f"缺失 BYTE（前 {_MAX_MISSING_BYTE_LINES} 个）: {head} …"
            )

    return len(errors) == 0, errors
