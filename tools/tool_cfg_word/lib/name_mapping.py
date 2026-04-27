"""名称映射管理：中文配置项名称 → 英文宏名。

name_mapping.json 格式:
{
  "n50": {
    "HUD抬头显示": "HUD_TYPE",
    "AEB自动紧急制动系统": "AEB",
    ...
  },
  "n80": { ... }
}
"""

import json
import os
import shutil
from pathlib import Path

from lib.term_color import red


def mapping_file_path() -> str:
    """name_mapping.json：与 cfg-word 工作区一致（可由 ADK 注入 AUTODRIVEKIT_USER_DATA_DIR）。"""
    bundle = Path(__file__).resolve().parents[1]
    data = os.environ.get("AUTODRIVEKIT_USER_DATA_DIR", "").strip()
    if data:
        p = Path(data) / bundle.name / "name_mapping.json"
        p.parent.mkdir(parents=True, exist_ok=True)
        src = bundle / "name_mapping.json"
        if not p.is_file() and src.is_file():
            shutil.copy2(src, p)
        return str(p)
    return str(bundle / "name_mapping.json")


def _load_all():
    mf = mapping_file_path()
    if not os.path.exists(mf):
        return {}
    with open(mf, "r", encoding="utf-8") as f:
        return json.load(f)


def _save_all(data):
    mf = mapping_file_path()
    Path(mf).parent.mkdir(parents=True, exist_ok=True)
    with open(mf, "w", encoding="utf-8") as f:
        json.dump(data, f, ensure_ascii=False, indent=4)


def load_mapping(project_name):
    """Load the name mapping dict for a project. Returns {chinese: english}."""
    all_data = _load_all()
    return all_data.get(project_name, {})


def apply_mapping(items, mapping):
    """Apply english name mapping to ConfigItem list.
    Returns (items, missing_names).
    - items: updated in-place with english_name filled
    - missing_names: list of chinese_name that have no mapping (non-reserved only)
    - 预留行英文宏：RESERVED_1、RESERVED_2、…（与 codegen 一致），不再统一写成 RESERVED_
    """
    missing = []
    reserved_counter = 1

    for item in items:
        if item.is_reserved or not item.chinese_name:
            item.english_name = f"RESERVED_{reserved_counter}"
            reserved_counter += 1
        elif item.english_name:
            pass
        else:
            eng = mapping.get(item.chinese_name)
            if eng:
                item.english_name = eng
            else:
                missing.append(item.chinese_name)
                item.english_name = ""

    return items, missing


def init_mapping_from_feishu(project_name, spreadsheet, sheet_id):
    """Initialize name_mapping from current Feishu intermediate table data."""
    from lib.feishu_api import get_token, read_sheet

    token = get_token()
    if not token:
        return

    rows = read_sheet(token, spreadsheet, sheet_id)
    if not rows:
        print(red("  ✘ 无法读取飞书 Sheet 数据"))
        return

    all_data = _load_all()
    project_mapping = all_data.get(project_name, {})

    count_new = 0
    for row in rows[1:]:  # skip header
        if len(row) < 5:
            continue
        eng_name = str(row[3]) if row[3] else ""
        chn_name = str(row[4]) if row[4] else ""

        if not eng_name or not chn_name:
            continue
        if eng_name.startswith("RESERVED"):
            continue

        chn_name = " ".join(chn_name.replace("\r\n", " ").replace("\n", " ").split())
        eng_name = eng_name.strip()

        if chn_name and chn_name not in project_mapping:
            project_mapping[chn_name] = eng_name
            count_new += 1

    all_data[project_name] = project_mapping
    _save_all(all_data)
    total = len(project_mapping)
    print(f"  完成: {project_name} 共 {total} 条映射 (新增 {count_new} 条)")
    print(f"  保存至: {mapping_file_path()}")
