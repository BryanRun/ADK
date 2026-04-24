# tool_property 工具包（`adk property`）

**平台 CLI：`property`** — 车辆属性（CarProperty）生成与导入。平台总说明见 [AutoDriveKit README](../../README.md)。

**调用方式**：在仓库根已 `pip install -e .` 时优先使用 `adk property …`，参数与在本目录执行 `python3 main.py …` 完全一致（`adk property --help` 等同 `python3 main.py --help`）。**一条龙**示例：`adk property BAIC`（对项目 `BAIC` 跑默认完整流水线 scan+fetch+generate+deploy+snapshot）。仅输入 **`adk`** 进入交互菜单并选择 **property** 时，会先进入 **步骤 2 · 选择项目**（来自本目录 **`config.json`** 的 **`projects`**），再填写参数。平台 **`adk -h`** 含页眉（简介/版本/作者/版权）、**通用选项**（`-h`/`-v`/`update`/`doctor`）、**工具包**、**交互选项**、**专业选项（一条龙）** 等分区（**`adk -v`** / **`adk --version`** 为平台版本号）。

CarPropertyManager 代码自动生成工具（v1.2.0） — 从飞书在线表格自动下载、生成 C/C++ 头文件，并可一键部署到目标 Git 仓库。

工具包路径：`…/0_AutoDriveKit/tools/tool_property`（推荐通过 `adk property` 调用，参数与 `python main.py` 相同）

特殊说明：本工具借助AI能力开发和优化，但工具使用并不依赖AI。

## 1. 背景与痛点

在车载 SOC 平台开发中，CarPropertyManager 模块的配置代码（C/C++ 头文件）需要根据 Excel 属性定义表生成。原有流程存在以下痛点：

- **手动操作繁琐**：每次 Excel 表格更新后，需要手动运行原始工具（mcutools 内的 carpropertymanager 模块），操作步骤多、易出错
- **前置一公里**：需要手动从飞书下载在线表格，手动重命名、手动拷贝到工具目录、手动保存版本快照
- **输出管理混乱**：生成的文件散落在工具内部多个目录，缺少按项目分类的组织结构
- **版本识别困难**：同一项目可能存在多个版本的 Excel 表格，需要人工判断哪个是最新版
- **部署手动拷贝**：生成的代码需要手动拷贝到目标 Git 仓库的指定目录，路径深、容易拷错
- **多项目无法并行**：原工具不支持多项目配置，无法一次性处理多个项目
- **跨环境协作差**：不同开发者在不同机器上使用时，缺少统一的配置和引导机制

## 2. 工具能力总览

PropertyGenerator 从 mcutools 中提取并重构了 carpropertymanager 的代码生成核心逻辑，提供以下能力：

| 能力 | 说明 |
|------|------|
| 飞书表格自动下载 | `fetch`（或 `-f`）操作自动从飞书下载在线电子表格，支持 `/sheets/` 和 `/wiki/` 两种 URL 格式 |
| 在线差异扫描 | `scan` 操作从飞书在线读取最新数据并与本地 Excel 逐单元格对比，增/删/改颜色高亮展示差异；含版本一致性校验（本地 Excel 日期 vs 飞书最新快照日期），本地缺少 Excel 或日期不一致时提示用户确认；作为流水线前置门控，无差异自动跳过后续步骤，有差异暂停等用户确认 |
| 版本快照 | `snapshot`（或 `-s`）独立操作，在飞书表格中创建命名版本快照，与本地文件一一对应 |
| Excel 解析 | 读取 `.xlsx` 属性定义表，提取属性配置、进程订阅关系、变更记录 |
| C/C++ 代码生成 | 基于 Jinja2 模板引擎，生成进程级 Property Config、PSIS 配置、PropertyObject 配置等头文件 |
| 多项目管理 | 通过 `config.json` 配置多个项目，支持批量处理或按项目名指定处理 |
| 自动版本识别 | 从 Excel 文件名中提取日期（支持 YYYYMMDD / YYYY_MM_DD / YYYY-MM-DD / YYMMDD），自动选取最新版本 |
| 多变体输出 | 支持同一 Excel 生成多套文件（如 n50/n51/n80），通过配置灵活控制变体目录命名和副本创建 |
| 信号名校验 | 生成阶段自动校验每条信号名的合法性，跳过含路径、特殊字符等无效数据并输出警告 |
| 一键部署 | 生成后自动将文件增量拷贝到目标 Git 仓库的指定分支和目录，含完整安全校验 |
| 端到端一条龙 | `python main.py` 无参数即完成全流程：下载表格 → 生成代码 → 部署到仓库 |
| 跨环境适配 | 路径支持 `~` 展开，首次使用时自动检测配置并给出引导提示 |

## 流水线图（PlantUML）

下列 **`@startuml` … `@enduml`** 块为 **PlantUML** 源码：可用 [PlantUML 在线服务](https://www.plantuml.com/plantuml/uml/) 或 IDE 的 PlantUML 插件渲染为图片。

```plantuml
@startuml tool_property_pipeline
skinparam shadowing false
skinparam activity {
  BackgroundColor #F5F5F5
  BorderColor #333333
  FontSize 13
}
title property — 单项目默认一条龙（无动作参数时）

start

partition "默认五步" #E3F0FA {
  :scan\n(版本一致性校验 → 在线对比 → 差异报告);
  if (本地无 Excel 或日期不一致？) then (是)
    :提示用户确认 (y/n);
    if (用户拒绝？) then (是)
      stop
    endif
  endif
  if (有差异？) then (否)
    :无差异，跳过后续步骤;
    stop
  else (是)
    :用户确认是否继续 (y/n);
    if (用户拒绝？) then (是)
      stop
    endif
  endif
  :fetch\n(飞书表格 → input/ 下 xlsx);
  if (fetch 失败？) then (是)
    :跳过 generate / deploy / snapshot;
    stop
  endif
  :generate\n(解析 Excel → output/ 头文件);
  if (generate 失败？) then (是)
    :跳过 deploy / snapshot;
    stop
  endif
  :deploy\n(校验仓库与分支 → 增量拷贝到 Git);
  if (deploy 失败？) then (是)
    :跳过 snapshot;
    stop
  endif
  :snapshot\n(创建飞书版本快照);
}

note bottom
  与 CLI 一致：可单独或组合执行 scan / fetch / generate / deploy / snapshot；
  指定动作后仅跑所选步骤（仍遵循下列失败语义）。
  **失败语义**：每步依赖其上游所有已选步骤全部成功；
  任一步失败或被用户跳过，其下游步骤均自动跳过（以项目为粒度）。
end note

stop

@enduml
```

## 3. 目录结构

```text
tool_property/
├── input/                  # 输入：按项目分类存放 Excel 表格（保留所有历史版本）
│   ├── BAIC/
│   │   ├── car_property_list_bq_8775_20260405.xlsx
│   │   └── car_property_list_bq_8775_20260406.xlsx
│   └── T1V/
│       └── car_property_list_chery_8775_20260406.xlsx
├── output/                 # 输出：按项目分类
│   ├── BAIC/               # 多变体项目：含 n50/n51/n80 子目录
│   │   ├── n50/
│   │   ├── n51/
│   │   └── n80/
│   └── T1V/                # 通用项目：头文件直接放在项目目录下
│       ├── HMI_property_cfg.h
│       └── ...
├── templates/soc/          # Jinja2 代码模板
├── lib/                    # 基础库（excelop、codegen）
├── model/                  # 核心生成逻辑（property_model.py）
├── config.json             # 项目配置（含部署配置）
├── main.py                 # CLI 入口
├── requirements.txt        # Python 依赖
└── README.md
```

## 4. 快速开始

### 4.1 安装依赖

```bash
pip install -r requirements.txt
```

依赖清单：`openpyxl`（Excel 读写）、`jinja2`（模板引擎）、`requests`（飞书 API 调用）。

### 4.2 配置项目

编辑 `config.json`。**不同环境首次使用必须先完成此配置**，工具会自动检测并引导。

**通用项目配置**（单变体，生成文件直接放在 `output/项目名/` 下）：

```json
{
    "projects": {
        "T1V": {
            "description": "捷途 Jetour T1V CarProperty 配置",
            "spreadsheet_token": "https://xxx.feishu.cn/wiki/FKBewbQJiioQZ4kRZbKcSo1enfd",
            "deploy": {
                "repo": "~/Jetour_T1V_8775/qnx/vendor/autolink/frameworks/cm",
                "branch": "al_chery-t1v_dev",
                "targets": {
                    "t1v": "carpropertymanager/impl/common/generated/t1v"
                }
            }
        }
    }
}
```

**多变体项目配置**（含变体映射 + 部署，以 BAIC 为例）：

```json
{
    "projects": {
        "BAIC": {
            "description": "北汽 BQ_8775 CarProperty 配置",
            "spreadsheet_token": "https://xxx.feishu.cn/sheets/DN95s3UyDhNOOutinLrcyxAKnEf",
            "variant_names": {
                "n50": "base",
                "n51": "base",
                "n80": "n80"
            },
            "deploy": {
                "repo": "~/BAIC_8775/n50_al_dev/qnx/vendor/autolink/frameworks/cm",
                "branch": "al_dev",
                "targets": {
                    "n50": "carpropertymanager/impl/common/generated/n50",
                    "n51": "carpropertymanager/impl/common/generated/n51",
                    "n80": "carpropertymanager/impl/common/generated/n80"
                }
            }
        }
    }
}
```

### 4.3 获取 Excel 表格

**方式一：自动下载（推荐）**

配置好 `spreadsheet_token` 和飞书环境变量后，使用 `fetch`（或 `-f`）自动从飞书下载：

```bash
export FEISHU_APP_ID='your_app_id'
export FEISHU_APP_SECRET='your_app_secret'

python main.py fetch              # 下载所有项目的表格
python main.py -f                 # 同上
python main.py fetch BAIC         # 仅下载 BAIC 的表格
```

`spreadsheet_token` 直接填入飞书表格的 URL 即可，支持两种格式：

| URL 格式 | 说明 |
|----------|------|
| `https://xxx.feishu.cn/sheets/<token>` | 普通电子表格，直接使用 |
| `https://xxx.feishu.cn/wiki/<token>` | 知识库中的表格，工具自动解析为实际的 spreadsheet token |

**文件命名规则**：工具通过飞书 API 获取表格的**原始标题**，以 `{原始标题}_{YYYYMMDD}.xlsx` 格式保存。例如飞书表格标题为 `car_property_list_bq_8775`，则下载后的文件名为 `car_property_list_bq_8775_20260406.xlsx`。

**版本快照**：使用 `snapshot`（或 `-s`）独立创建飞书版本快照。快照名格式如 `car_property_list_bq_8775_20260406`，与本地文件一一对应。查看方式：打开飞书电子表格 → 右上角「`···`」→「查看已存版本」。在完整流水线中，snapshot 位于最后一步，前面步骤全部成功后才会执行。

**历史版本保留**：input/ 目录中的文件不会被删除，每次下载都会新增一个带日期的文件（同日重复下载会覆盖当日版本）。

**下载策略**：工具优先使用 Drive Export API 导出完整 xlsx；若该 API 权限不足，自动降级为 Sheets API 逐 sheet 读取数据并用 openpyxl 重建 xlsx 文件，无需额外配置。

**飞书应用权限要求**：

| 要求 | 说明 |
|------|------|
| 应用权限范围 | `sheets:spreadsheet`（Sheets API 读取必需），`drive:drive`（Drive Export API 可选） |
| 文件级授权 | 将飞书应用添加为每个表格的协作者（可编辑权限），用于版本快照创建和数据读取 |

> 若应用仅有 `sheets:spreadsheet` 权限，fetch 仍可正常工作（通过 Sheets API 降级方案）；`drive:drive` 可提供更快的原生导出体验。

**方式二：手动放入**

将 Excel 文件放入 `input/<项目名>/` 目录。文件名中需包含日期，支持以下格式：

| 格式 | 示例 |
|------|------|
| YYYYMMDD | `car_property_list_bq_8775_20260405.xlsx` |
| YYYY_MM_DD | `CarProperty_2025_04_05.xlsx` |
| YYYY-MM-DD | `CarProperty_2025-04-05.xlsx` |
| YYMMDD | `CarProperty_250405.xlsx` |

同一项目下有多个表格时，自动选取**日期最新的**进行处理。

### 4.4 运行

`scan`、`fetch`、`generate`、`deploy`、`snapshot` 是五个同级操作，可自由组合。每个操作都支持**长名**和**短 flag** 两种写法（scan 仅支持长名）。不指定任何操作时，默认执行完整流水线。

```bash
# 端到端一条龙（默认行为：scan + fetch + generate + deploy + snapshot）
python main.py                        # 全部项目
python main.py BAIC                   # 仅 BAIC

# 单独执行某一步
python main.py scan                   # 仅扫描差异
python main.py fetch                  # 仅下载（等同于 -f）
python main.py generate               # 仅生成（等同于 -g）
python main.py deploy                 # 仅部署（等同于 -d）
python main.py snapshot               # 仅创建版本快照（等同于 -s）

# 组合执行
python main.py fetch generate BAIC    # 仅 BAIC：下载 + 生成
python main.py -fg BAIC               # 同上（短 flag 可合并）
python main.py -g -d T1V              # 仅 T1V：生成 + 部署
python main.py scan fetch BAIC        # 仅 BAIC：扫描 + 下载

# 查看信息
python main.py list                   # 查看所有项目配置及状态（等同于 -l）
python main.py -v                     # 查看版本号
python main.py -h                     # 查看帮助
```

## 5. 配置字段参考

| 字段 | 必需 | 说明 |
|------|------|------|
| `description` | 是 | 项目描述，用于 CLI 输出展示 |
| `spreadsheet_token` | 否 | 飞书表格 URL（支持 `/sheets/` 和 `/wiki/` 格式），fetch 操作使用 |
| `excel_pattern` | 否 | 降级文件名前缀；仅在 fetch 无法通过飞书 API 获取表格原始标题时使用，正常情况下文件名自动取自飞书表格标题 |
| `variant_names` | 否 | 多变体映射（输出目录名 → 内部源名），详见第 6 节 |
| `deploy.repo` | 否 | 目标 Git 仓库本地路径，支持 `~` 表示用户主目录 |
| `deploy.branch` | 否 | 部署的目标分支名 |
| `deploy.targets` | 否 | 输出标签 → 仓库内相对路径的映射；多变体项目中标签对应变体子目录名，通用项目中标签仅用于显示 |

## 6. 通用逻辑与特殊逻辑

工具架构将通用逻辑和项目特殊逻辑严格分离。

### 6.1 通用逻辑（所有项目）

生成引擎处理 Excel → 产出头文件 → **扁平放入** `output/项目名/` 下，无子目录层级。这是默认行为，不需要额外配置。

以 T1V 为例：

```text
output/T1V/
├── HMI_property_cfg.h
├── CM_property_cfg.h
├── psis_property_cfg.h
├── property_object_cfg.h
└── ...  (共 17 个文件)
```

部署时，`deploy.targets` 中的每个条目直接从 `output/T1V/` 拷贝文件到目标路径。

### 6.2 特殊逻辑（按需配置 variant_names）

当 Excel 中存在多个变体（如 `psis.car_cfg.n80` sheet），生成引擎会产出多套文件。通过 `variant_names` 控制输出目录的命名：

```json
"variant_names": {
    "n50": "base",
    "n51": "base",
    "n80": "n80"
}
```

- **key** = 最终输出目录名（`n50`、`n51`、`n80`）
- **value** = 生成引擎的内部源名（`base` 为基础变体，其他名称来自 Excel sheet 后缀）
- 多个 key 指向同一 source 时，第一个重命名，其余自动创建完整副本

以 BAIC 为例，最终输出：

```text
output/BAIC/
├── n50/   (17 个文件，来自 base 变体)
├── n51/   (17 个文件，n50 的完整副本)
└── n80/   (17 个文件，来自 n80 变体)
```

不配置 `variant_names` 的项目，输出始终是扁平结构（无子目录）。

## 7. 部署功能

使用 `deploy`（或 `-d`）操作，将 output/ 中的文件增量拷贝到目标 Git 仓库。

### 7.1 部署流程

1. **校验仓库** — 检查 `deploy.repo` 路径是否存在且为有效 Git 仓库
2. **切换分支** — 如当前不在 `deploy.branch`，尝试 checkout；若仓库有未提交修改则终止
3. **增量拷贝** — 按 `deploy.targets` 映射，将输出文件拷贝到仓库对应目录（同名文件覆盖，其他文件不动）
4. **手动提交** — 工具**不执行** `git commit` 或 `git push`，请自行完成

### 7.2 安全机制

- 仓库路径不存在 → 终止 + 提示检查 config
- 非有效 Git 仓库 → 终止
- 有未提交修改 → 终止 + 列出修改文件
- 分支切换失败 → 终止 + 报错信息
- 路径支持 `~`（自动展开为当前用户主目录），确保不同环境只需修改 config.json

### 7.3 通用项目与多变体项目的部署差异

| 项目类型 | deploy.targets 的 key 含义 | 拷贝源 |
|----------|---------------------------|--------|
| 通用项目（无 variant_names） | 仅用于显示标签 | `output/项目名/` 下的所有文件 |
| 多变体项目（有 variant_names） | 对应变体子目录名 | `output/项目名/<key>/` 下的文件 |

### 7.4 部署示例

**BAIC（多变体）**：

```bash
python main.py generate deploy BAIC    # 或 python main.py -gd BAIC
```

```text
n50/ → carpropertymanager/impl/common/generated/n50   (17 个文件)
n51/ → carpropertymanager/impl/common/generated/n51   (17 个文件)
n80/ → carpropertymanager/impl/common/generated/n80   (17 个文件)
共 51 个文件已拷贝 (git 提交请手动执行)
```

**T1V（通用）**：

```bash
python main.py generate deploy T1V    # 或 python main.py -gd T1V
```

```text
t1v/ → carpropertymanager/impl/common/generated/t1v   (17 个文件)
共 17 个文件已拷贝 (git 提交请手动执行)
```

## 8. 生成的文件说明

| 文件 | 说明 |
|------|------|
| `{进程名}_property_cfg.h` | 各进程（HMI、CM、DMS 等）的 Property Config 头文件 |
| `psis_property_cfg.h` | PSIS 域（car_cfg + usr_cfg）的汇总配置 |
| `property_object_cfg.h` | PropertyObject 数据统计与缓冲区配置 |

多变体项目中，每个变体的文件列表相同，但内容根据变体对应的 `psis.car_cfg` sheet 数据有所不同。

## 9. Excel 表格格式要求

工具读取 `.xlsx` 文件，要求包含以下 Sheet：

| Sheet 名 | 用途 |
|-----------|------|
| `ChangeHistory` | 变更记录（日期 + 说明），用于生成文件头部的版本信息 |
| `statistic` | 进程与 PPS 对象的订阅矩阵，定义哪个进程订阅哪些属性组 |
| `{domain}.{group}` | 属性定义，如 `psis.car_cfg`、`psis.usr_cfg`、`custom.mcu` 等 |
| `psis.car_cfg.{variant}` | 变体 Sheet（如 `psis.car_cfg.n80`），定义特定变体的差异化配置 |

自动忽略的 Sheet：`ChangeMode`、`ValueType`、`Domain`、`Readme`

### 9.1 信号名格式要求

属性定义 Sheet 中，每行第 1 列为信号名（Signal Name）。工具在生成阶段会对每个信号名进行合法性校验：

- **合法格式**：以字母或下划线开头，仅包含字母、数字和下划线（正则：`^[A-Za-z_][A-Za-z0-9_]*$`）
- **不合法的值**将被**自动跳过**，并在控制台输出黄色警告，指明所在 Sheet 和行号

```text
⚠ 跳过无效信号名 [ivi.rx] 行11: "D:\download\BAIC-55947\AL\slog2\dlog\data0\binlog-bsp-192.16..."
```

常见的无效信号名场景：误粘贴了文件路径、URL、中文描述等非法内容。发现此类警告时，应检查并修正飞书源表格中对应单元格的数据。

## 10. 完整工作流

```text
┌──────────────────────────────────────────────────┐
│  1. 配置 config.json（首次/新环境）                │
│     - 项目名、描述、spreadsheet_token              │
│     - 变体映射（可选）                             │
│     - 部署目标（可选）                             │
└───────────────────┬──────────────────────────────┘
                    ▼
┌──────────────────────────────────────────────────┐
│  2. python main.py [项目名]                       │
│     默认执行完整流水线：                            │
│     [scan] 版本一致性校验 → 在线对比差异            │
│       ├── 本地无 Excel / 日期不一致 → 提示确认     │
│       ├── 无差异 → 提示无需更新，跳过后续步骤       │
│       └── 有差异 → 展示报告，等用户确认             │
│     [fetch] 从飞书下载表格到 input/                 │
│     [generate] 解析 Excel → 生成头文件              │
│     [deploy] 校验仓库 → 切分支 → 增量拷贝           │
│     [snapshot] 创建飞书版本快照                     │
│                                                    │
│     失败语义：每步依赖其上游已选步骤全部成功；       │
│     任一步失败或被用户跳过 → 下游步骤自动跳过。      │
│                                                    │
│     也可单独执行某一步或自由组合：                    │
│       python main.py scan [项目名]                 │
│       python main.py fetch [项目名]                │
│       python main.py generate deploy [项目名]      │
│       python main.py -fg [项目名]                  │
│       python main.py snapshot [项目名]             │
└───────────────────┬──────────────────────────────┘
                    ▼
┌──────────────────────────────────────────────────┐
│  3. 手动 git commit & push（部署后）               │
└──────────────────────────────────────────────────┘

一条龙模式: python main.py  → scan + fetch + generate + deploy + snapshot
```

## 11. fetch 操作技术细节

### 11.1 URL 解析

`spreadsheet_token` 支持三种输入格式，工具自动识别并处理：

| 输入 | 处理方式 |
|------|---------|
| `https://xxx.feishu.cn/sheets/ABC123` | 直接提取 `ABC123` 作为 spreadsheet token |
| `https://xxx.feishu.cn/wiki/XYZ789` | 提取 `XYZ789` 作为 wiki node token，通过 Wiki API 解析为实际的 spreadsheet token |
| `ABC123`（裸 token） | 直接使用 |

### 11.2 下载流程

```text
获取表格原始标题 → 导出下载 → 保存到 input/
```

1. **获取标题**：通过 Sheets API 读取表格的原始标题，用于文件命名
2. **导出下载**：优先使用 Drive Export API 异步导出 xlsx；若权限不足，自动降级为 Sheets API 逐 sheet 读取 + openpyxl 重建
3. **保存文件**：以 `{原始标题}_{YYYYMMDD}.xlsx` 格式保存到 `input/<项目名>/`

### 11.3 降级方案说明

Drive Export API 需要 `drive:drive` 权限范围，部分应用可能未配置此权限。此时工具自动降级为 Sheets API 方案：

- 通过 `sheets:spreadsheet` 权限逐 sheet 读取所有单元格数据
- 使用 openpyxl 在本地重建 xlsx 文件
- 保留所有 sheet 名称和单元格值，但不保留原始格式（如字体、颜色、边框等）
- 对于代码生成场景，重建的 xlsx 与原生导出的 xlsx 功能等价

### 11.4 安全保证

fetch 和 scan 命令对飞书在线表格的操作**严格只读**：

- 导出下载：仅读取并导出，不修改表格内容
- scan 扫描：仅通过 Sheets API 读取数据到内存对比，不修改表格内容
- 整个 fetch / scan 流程中**没有任何写入或修改表格内容的 API 调用**

snapshot 命令仅创建归档快照，不修改表格数据内容。

## 12. scan 操作技术细节

### 12.1 版本一致性校验

scan 在读取飞书数据前，先校验本地基准是否与飞书最新状态对应：

| 场景 | 行为 |
|------|------|
| 本地 `input/<项目>/` 无 Excel | 显示警告并提示用户确认 `(y/n)`；确认后以飞书当前内容作为全新增展示 |
| 本地 Excel 日期与飞书最新版本快照日期不一致 | 显示日期对比并提示用户确认 `(y/n)`；提醒对比结果可能不准确 |
| 本地 Excel 日期与飞书快照日期一致 | 直接进入对比 |

用户在校验提示中选择 `n` 则终止该项目的 scan。

### 12.2 对比逻辑

1. 通过 Sheets API 读取飞书在线表格所有 sheet 和单元格到内存
2. 用 openpyxl 读取本地最新 Excel 的相同数据
3. 逐单元格对比，**规范化处理**：浮点数等于整数时转为整数（如 `1.0` → `1`），文本两端空白自动去除
4. 按 sheet 汇总差异，以颜色高亮输出：新增（绿）、删除（红）、修改（黄）

### 12.3 流水线门控

当 scan 与后续步骤（fetch/generate/deploy/snapshot）组合执行时，scan 作为前置门控：

- **无差异** → 打印「与本地版本一致，跳过后续步骤」，该项目后续步骤全部跳过
- **有差异** → 暂停并提示用户 `是否继续执行后续步骤？(y/n)`；选 `n` 则跳过后续步骤
- **scan 出错** → 后续步骤跳过

单独执行 `scan`（不组合其它步骤）时，仅展示差异报告，不触发门控交互。

## 13. 流水线失败语义

流水线中各步骤以项目为粒度，遵循**上游依赖**规则：每步执行前检查已选的所有上游步骤是否全部成功，任一上游失败则该步骤自动跳过。

```text
scan ─► fetch ─► generate ─► deploy ─► snapshot
  │       │         │           │
  │       │         │           └─ 依赖 scan + fetch + generate + deploy
  │       │         └───────────── 依赖 scan + fetch
  │       └─────────────────────── 依赖 scan
  └─────────────────────────────── 无上游依赖
```

- 仅检查**已选步骤**：如用户只执行 `generate deploy`（未选 scan/fetch），则 generate 无需等待 scan/fetch
- 跳过步骤会以黄色 `⚠ [步骤名] 已跳过（上游步骤未成功）` 提示
- 执行结束后输出汇总统计：`扫描: 2/3  下载: 2/3  生成: 2/3  …`（绿色表示全部成功，红色表示有失败）

## 14. 环境变量

**首次使用飞书能力前**，除下表环境变量外，还须在飞书开放平台创建自建应用、申请 API 权限，并在**每一个**被 `fetch` 访问的在线表格上将应用添加为协作者（只读拉表也建议至少「可阅读」，导出类接口遇错时可升为「可编辑」）。完整分步说明见仓库根目录 [**AutoDriveKit README**](../../README.md) 中的 **「飞书自建应用与环境变量（首次使用必读）」**。

| 变量 | 用途 |
|------|------|
| `FEISHU_APP_ID` | 飞书应用的 App ID（fetch 操作必需） |
| `FEISHU_APP_SECRET` | 飞书应用的 App Secret（fetch 操作必需） |

建议将环境变量写入 `~/.bashrc` 或 `~/.zshrc`，避免每次手动 export：

```bash
export FEISHU_APP_ID='cli_a5xxxxx'
export FEISHU_APP_SECRET='xxxxxxx'
```

## 15. 工具来源

本工具从 `mcutools/workspace/Project/CarPropertyManager` 中提取核心生成逻辑，独立为轻量化命令行工具。保留了原有的 Excel 解析、属性规则构建、Jinja2 模板生成等核心能力，并在此基础上新增：

- 飞书表格自动下载（fetch 操作 + 双策略降级）
- 飞书在线差异扫描（scan 操作 — 逐单元格对比 + 增/删/改颜色高亮）
- 独立版本快照管理（snapshot 操作 — 置于流水线末尾，前置步骤全部成功后执行）
- 飞书 Wiki URL 自动解析
- 多项目配置管理（config.json）
- 自动版本识别（文件名日期提取）
- 输入/输出目录分离
- 通用逻辑与特殊逻辑分离（扁平输出 vs 多变体目录）
- 一键部署到 Git 仓库（含完整安全校验，支持通用和多变体两种项目）
- 端到端一条龙（无参数默认执行 scan + fetch + generate + deploy + snapshot）
- 信号名合法性校验（自动跳过无效数据并警告）
- 首次使用引导提示
- 跨环境 `~` 路径适配

## 16. 仓库位置与安装

本工具随 **AutoDriveKit** 单仓分发，路径为 `0_AutoDriveKit/tools/tool_property/`。在平台根目录执行 `python3 -m pip install -e .` 后即可使用 `adk property`；依赖以平台 `pyproject.toml` 为准，本目录 `requirements.txt` 可作参考。
