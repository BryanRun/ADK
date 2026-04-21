"""飞书配置解析：把「文档链接 + 子表名称」解析为 API 所需的 token / sheet_id。"""

import re
from typing import Any, Dict, Optional, Tuple
from urllib.parse import urlparse

from lib.feishu_api import get_sheet_info
from lib.term_color import red

# 浏览器地址里 /sheets/ 后的多维表格 token
_SHEETS_PATH_TOKEN = re.compile(r"/sheets/([A-Za-z0-9]+)")
# 知识库/wiki 链接里 /wiki/ 后的节点 token（需再通过 API 换为 spreadsheet token）
_WIKI_PATH_TOKEN = re.compile(r"/wiki/([A-Za-z0-9]+)")


def parse_spreadsheet_token(ref: Optional[str]) -> str:
    """从配置值得到 spreadsheet_token。

    支持：
    - 纯 token 字符串（与旧版 `feishu_spreadsheet` 相同）
    - 完整浏览器地址，例如
      https://xxx.feishu.cn/sheets/NC9GsxyTJhLqU5tPHkOcTnKInFR
      https://xxx.feishu.cn/sheets/NC9G...?sheet=581ac7
    """
    if not ref or not str(ref).strip():
        return ""
    s = str(ref).strip()
    if s.startswith("http://") or s.startswith("https://"):
        parsed = urlparse(s)
        m = _SHEETS_PATH_TOKEN.search(parsed.path)
        if m:
            return m.group(1)
        raise ValueError(
            "无法从链接中解析 spreadsheet token，请使用「多维表格」以 /sheets/<token> 开头的链接，或直接填写 token。"
        )
    return s


def resolve_spreadsheet_token_from_url(api_token: str, ref: str) -> Optional[str]:
    """从任意支持的链接解析出 spreadsheet_token（/sheets/ 直接取 token；/wiki/ 调 API）。"""
    if not ref or not str(ref).strip():
        return None
    s = str(ref).strip()
    if not (s.startswith("http://") or s.startswith("https://")):
        return s
    parsed = urlparse(s)
    m = _SHEETS_PATH_TOKEN.search(parsed.path)
    if m:
        return m.group(1)
    m = _WIKI_PATH_TOKEN.search(parsed.path)
    if m:
        from lib.feishu_api import wiki_node_to_spreadsheet_token

        wiki_tok = m.group(1)
        return wiki_node_to_spreadsheet_token(api_token, wiki_tok)
    raise ValueError(
        "无法从链接解析 spreadsheet：请使用 /sheets/<token> 或 /wiki/<node_token> 格式的飞书地址"
    )


def resolve_property_sync_sheet(
    api_token: str,
    property_sync_cfg: Dict[str, Any],
    verbose: bool = True,
) -> Tuple[Optional[str], Optional[str]]:
    """解析 property_sync 配置，返回 (spreadsheet_token, sheet_id)。

    配置项：
    - spreadsheet: 飞书多维表格链接（/sheets/ 或 /wiki/）或裸 token
    - sheet_name: 子表标题（与界面一致）
    - sheet_id: （可选）旧版，直接指定 sheet_id
    """
    ref = (property_sync_cfg.get("spreadsheet") or "").strip()
    if not ref:
        if verbose:
            print(red("  ✘ property_sync.spreadsheet 未配置"))
        return None, None

    try:
        if ref.startswith("http://") or ref.startswith("https://"):
            spreadsheet_token = resolve_spreadsheet_token_from_url(api_token, ref)
        else:
            spreadsheet_token = ref
    except ValueError as e:
        if verbose:
            print(red(f"  ✘ {e}"))
        return None, None

    if not spreadsheet_token:
        return None, None

    legacy_id = (property_sync_cfg.get("sheet_id") or "").strip()
    name = (property_sync_cfg.get("sheet_name") or "").strip()

    if name:
        sid = find_sheet_id_by_title(api_token, spreadsheet_token, name)
        if not sid:
            return None, None
        if verbose:
            print(f"  property 表: 「{name}」 → sheet_id={sid}")
        return spreadsheet_token, sid

    if legacy_id:
        if verbose:
            print(f"  property 表: sheet_id={legacy_id}（legacy）")
        return spreadsheet_token, legacy_id

    if verbose:
        print(red("  ✘ property_sync 请配置 sheet_name 或 sheet_id"))
    return None, None


def get_spreadsheet_ref_from_config(cfg: Dict[str, Any]) -> str:
    """优先 `feishu_document`，否则 `feishu_spreadsheet`（兼容旧配置）。"""
    doc = cfg.get("feishu_document") or cfg.get("feishu_spreadsheet") or ""
    return str(doc).strip()


def find_sheet_id_by_title(
    api_token: str, spreadsheet_token: str, title: str
) -> Optional[str]:
    """在文档中按标签页标题精确匹配，返回 sheet_id。"""
    sheets = get_sheet_info(api_token, spreadsheet_token)
    if not sheets:
        return None

    title_norm = title.strip()
    for sh in sheets:
        t = sh.get("title") or sh.get("sheet_title") or ""
        if str(t).strip() == title_norm:
            return sh.get("sheet_id") or sh.get("id")

    print(red(f"  ✘ 未找到名为「{title_norm}」的子表。当前文档中的子表有："))
    for sh in sheets[:30]:
        t = sh.get("title") or sh.get("sheet_title") or "(无标题)"
        sid = sh.get("sheet_id") or sh.get("id") or "?"
        print(red(f"    - 「{t}」  (sheet_id={sid})"))
    if len(sheets) > 30:
        print(red(f"    ... 共 {len(sheets)} 个子表"))
    return None


def resolve_sheet_id(
    api_token: str,
    spreadsheet_token: str,
    project_config: Dict[str, Any],
) -> Tuple[Optional[str], str]:
    """根据项目配置得到 sheet_id，并返回简短说明（用于日志）。

    优先级：
    1. `feishu_sheet_name` 非空 → 按子表标题在文档中查找 sheet_id
    2. `feishu_sheet_id` 非空 → 直接使用（旧版）
    """
    name = (project_config.get("feishu_sheet_name") or "").strip()
    legacy_id = (project_config.get("feishu_sheet_id") or "").strip()

    if name:
        sid = find_sheet_id_by_title(api_token, spreadsheet_token, name)
        if not sid:
            return None, ""
        return sid, f"子表「{name}」"

    if legacy_id:
        return legacy_id, f"子表 ID（legacy）{legacy_id}"

    return None, ""


def resolve_feishu_sheet_for_project(
    cfg: Dict[str, Any], project_config: Dict[str, Any], verbose: bool = True
) -> Tuple[Optional[str], Optional[str], Optional[str]]:
    """解析配置，返回 (api_token, spreadsheet_token, sheet_id)。

    顶层需配置 `feishu_document` 或 `feishu_spreadsheet`；
    项目内需配置 `feishu_sheet_name` 或 `feishu_sheet_id`。
    """
    from lib.feishu_api import get_token

    ref = get_spreadsheet_ref_from_config(cfg)
    if not ref:
        if verbose:
            print(
                red(
                    "  ✘ 请在 config.json 顶层配置 feishu_document（推荐，填浏览器地址）"
                    " 或 feishu_spreadsheet（填 token）"
                )
            )
        return None, None, None
    try:
        spreadsheet_token = parse_spreadsheet_token(ref)
    except ValueError as e:
        if verbose:
            print(red(f"  ✘ {e}"))
        return None, None, None

    api_token = get_token()
    if not api_token:
        return None, None, None

    sheet_id, label = resolve_sheet_id(api_token, spreadsheet_token, project_config)
    if not sheet_id:
        if verbose:
            print(
                red(
                    "  ✘ 请在本项目下配置 feishu_sheet_name（与飞书子表标签页标题完全一致）"
                    " 或 feishu_sheet_id（旧版）"
                )
            )
        return None, None, None
    if verbose:
        print(f"  飞书: {label} → sheet_id={sheet_id}")
    return api_token, spreadsheet_token, sheet_id


def list_document_sheets(api_token: str, spreadsheet_token: str) -> bool:
    """打印文档内所有子表的标题与 sheet_id，便于配置 feishu_sheet_name。"""
    sheets = get_sheet_info(api_token, spreadsheet_token)
    if not sheets:
        return False
    print(f"\n共 {len(sheets)} 个子表（`feishu_sheet_name` 须与下表「标题」完全一致）：\n")
    for sh in sheets:
        t = sh.get("title") or sh.get("sheet_title") or "(无标题)"
        sid = sh.get("sheet_id") or sh.get("id") or "?"
        print(f"  「{t}」\n      sheet_id: {sid}\n")
    return True
