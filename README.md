# AutoDriveKit

**AutoDriveKit**（简称 **ADK**）是**统一工具平台**：为车辆相关代码生成与配置同步提供**单一 CLI 入口** `adk`。平台侧重**可扩展的工具生态**：每个工具以**独立工具包**形式放在固定目录下，通过清单注册后即可被 `adk` 识别，实现「即插即用」。

**各工具的安装方式、命令参数、配置项与流水线细节**不在本文重复展开，请直接打开下表中的 **工具包 README**。

## 命名与定位

| CLI（工具包 `id`） | 定位 | 工具包目录 | 工具包 README（详细说明） |
|--------------------|------|------------|---------------------------|
| **`property`** | 车辆属性（CarProperty）的**生成与导入**：飞书表格拉取、Excel 解析、头文件生成、部署到 Git | `tool_property/` | [**README.md**](tools/tool_property/README.md) |
| **`cfg-word`** | **整车配置字映射表**的生成、**更新维护**与**部署**；并负责在 **carpropertylist 在线表格**中维护 **psis.car_cfg** 子表（与 `property-sync` 等步骤配合） | `tool_cfg_word/` | [**README.md**](tools/tool_cfg_word/README.md) |
| **`vhal-svc`**（暂定） | **VHAL**：**fetch → generate → deploy → compile** 为**强依赖链**（任一步失败则后续跳过）；飞书 fetch、VehicleGenerateTool 生成、按 **deploy.files** 部署 | `tool_vhal_svc/` | [**README.md**](tools/tool_vhal_svc/README.md) |

说明：CLI 名（`property`、`cfg-word` 等）与工具包目录 **`tool_*`** 一一对应；**`vhal-svc`** 为暂定名，后续可统一重命名。

## 目录结构（节选）

```text
0_AutoDriveKit/
├── pyproject.toml          # 平台包与依赖
├── requirements.txt
├── README.md
├── scripts/                # 发布与飞书校验：pack_adk_release.sh、publish_release_feishu.py、wiki_release_upload.py
├── autodrivekit/           # 平台 CLI、注册表、引导安装
│   ├── platform_info.py    # adk -h 页眉：简介 / 版本 / 作者 / Copyright 等（可改）
│   ├── adk_rich_help.py    # Rich 帮助排版（分区、工具包 id 配色等）
│   ├── _cli_impl.py        # Typer 根命令、交互菜单
│   └── ...
└── tools/                  # 【工具生态根目录】每个子目录为一个工具包
    ├── tool_property/
    │   ├── adk-tool.json   # 平台注册清单（必填）
    │   ├── main.py         # 默认入口（可由清单指定其它文件）
    │   └── ...
    ├── tool_cfg_word/
    │   ├── adk-tool.json
    │   ├── main.py
    │   └── ...
    └── tool_vhal_svc/      # VHAL + VehicleService（可扩展）
        ├── adk-tool.json
        ├── main.py
        └── ...
```

## 环境要求

- Python **3.10+**
- 建议使用 `python3 -m pip`（避免系统 `pip` 指向 Python 2）

## 安装

在**本仓库根目录**（含 `pyproject.toml`）执行：

```bash
python3 -m pip install -U pip setuptools wheel
python3 -m pip install -e .
```

依赖由平台 `pyproject.toml` 统一声明（含 Typer 与各工具常用库）。也可：

```bash
python3 -m pip install -r requirements.txt
```

未执行安装时，若直接运行 `python3 -m autodrivekit` 或已安装的 `adk`，平台会检测 **Typer** 是否可用；若缺失，会**打印原因与推荐命令**，并询问是否对当前仓库根目录执行 **`pip install -e .`**；选 `yes` 后将尝试自动安装并在成功后**用当前参数重新启动**同一命令。

> **说明**：若在 shell 中输入 `adk` 提示「命令未找到」，说明尚未安装入口脚本或未加入 `PATH`，请先按上文完成 `pip install -e .`；该情况由操作系统处理，应用层无法在运行前拦截。

## 用户配置 / 数据目录（4A）与在线更新

通过 **`adk` 入口**调用子工具时，平台会注入环境变量 **`AUTODRIVEKIT_USER_CONFIG_DIR`**（默认 `~/.config/adk`）与 **`AUTODRIVEKIT_USER_DATA_DIR`**（默认 `~/.local/share/adk`）：各工具的 `config.json` 落在前者下以工具目录名命名的子目录，**`input/`、`output/`** 等可变数据落在后者下同名子目录；若用户侧文件不存在，会**从包内默认文件复制一份**（直接运行各工具目录内 `python main.py` 且未设置上述变量时，行为与旧版一致，仍在工具包目录内读写）。

**`adk update`**：使用飞书 **Drive** 下载发布物（需自建应用 **`FEISHU_APP_ID` / `FEISHU_APP_SECRET`**）。可选参数：**`-n` / `--dry-run`**、**`-c` / `--check-only`**；完整说明见 **`adk update -h`**。

**manifest 与制品（两个知识库「文件」节点）**：

| 用途 | 常量 | 知识库链接 |
|------|------|------------|
| 默认 manifest（JSON） | **`DEFAULT_MANIFEST_FILE_TOKEN`**（= **`DEFAULT_FEISHU_WIKI_MANIFEST_NODE_TOKEN`**） | [manifest 文件节点](https://t83dfrspj4.feishu.cn/wiki/FSSpwYBwIioeN3ksc72cvCU4ncg) |
| 安装包（`manifest` 内 **`archive_file_token`**） | **`DEFAULT_FEISHU_WIKI_ARCHIVE_NODE_TOKEN`** | [安装包节点](https://t83dfrspj4.feishu.cn/wiki/MaGVwCGz9iUQ6ekJb5MckijYnAb) |

下载时先走 Drive；**HTTP 404** 时再 **`wiki/v2/spaces/get_node`**，仅当节点 **`obj_type` 为 `file`** 时用 **`obj_token`** 继续走 Drive。覆盖默认 manifest 来源：在 **`~/.config/adk/adk.json`** 的 **`feishu_update.manifest_file_token`** 填写，或设置 **`ADK_FEISHU_MANIFEST_FILE_TOKEN`**（一般与上表 manifest 节点 token 一致，即 **`FSSpwYBwIioeN3ksc72cvCU4ncg`**）。

**manifest JSON 字段**：

- **`version`**：语义化版本号（高于当前 `autodrivekit.__version__` 时才安装）  
- **`archive_file_token`**：制品；可为 **Drive `file_token`** 或 **知识库「文件」节点 token**（默认与上表安装包节点 **`MaGVwCGz9iUQ6ekJb5MckijYnAb`** 一致）。**`download_file_to_path`** 与 manifest 下载逻辑一致，支持 wiki 节点解析后再下载。  
- **`filename`**：本地保存名（如 `autodrivekit-1.1.0.tar.gz`）  
- **`sha256`**（可选但强烈建议）：小写十六进制；与制品字节一致  

**约束**：同一 wiki 节点 token **不能**同时作为「manifest JSON」与「安装包」两种不同内容的来源；当前默认已拆成**两个节点**。

**说明**：manifest 节点在飞书中须为 **「文件」**（`obj_type=file`）且内容为合法 JSON，`adk update` 才能通过 API 拉取。若误用 **飞书文档（docx）** 页作为节点，请改为 **文件** 节点或 Drive `file_token`。

自建应用需 **Drive 下载**、**wiki 节点可读** 等权限，并将应用添加为知识库/文件协作者。  

安装目录为 **`~/.local/opt/adk/releases/<版本>/`**，并通过符号链接 **`~/.local/opt/adk/current`** 做**原子切换**。更新完成后，**配置迁移在下次执行任意非 `update` 的 `adk` 命令时执行**（B 方案）。未走 `pip install` 时，可在发布树根目录使用仓库内 **`adk_launch.py`** 启动 CLI，并将该路径加入 `PATH`。

### 发布脚本（维护者）

在仓库根目录：

1. **`./scripts/pack_adk_release.sh`** — 按 `pyproject.toml` 版本号生成 **`../adk-releases/autodrivekit-<ver>.tar.gz`** 及 **`.sha256`**（已排除 `.git`、`egg-info`、虚拟环境等）。
2. **`PYTHONPATH=. python3 scripts/publish_release_feishu.py`** — 根据本地 tar 计算 **`sha256`**，在 **`../adk-releases/manifest-<ver>.json`** 写入正式 manifest（**`archive_file_token`** = **`DEFAULT_FEISHU_WIKI_ARCHIVE_NODE_TOKEN`**）。可选将 manifest JSON **上传**到云空间根目录并打印 **`file_token`**（用于改走 Drive manifest；默认仍以 wiki manifest 节点为准）。
3. **`PYTHONPATH=. python3 scripts/wiki_release_upload.py`** — 校验两个 wiki 文件节点并打印在飞书网页 **「上传新版本」** 时应选择的本地文件路径与链接（开放接口无法完整替代该 UI 操作，见脚本说明）。

## 飞书自建应用与环境变量（首次使用必读）

下列工具会通过**飞书开放平台**调用在线表格、导出或写入能力，**同一套自建应用凭证**即可共用（在 shell 中配置一次即可被 **`property` / `cfg-word` / `vhal-svc`** 等读取）：

| 工具包 | 典型依赖飞书的场景 |
|--------|-------------------|
| **`property`** | `fetch`：拉取飞书电子表格、Wiki 挂载表等（详见 [tool_property/README.md](tools/tool_property/README.md)） |
| **`cfg-word`** | `sync` / `init-mapping` / `property-sync` 等：读写字段、中间表、与 carpropertylist 侧表格协作（详见 [tool_cfg_word/README.md](tools/tool_cfg_word/README.md)） |
| **`vhal-svc`** | `fetch`：按配置导出矩阵表 xlsx（详见 [tool_vhal_svc/README.md](tools/tool_vhal_svc/README.md)） |

仅做本地生成、不涉及飞书 API 的步骤（如部分 `generate`）**可以不配**飞书；一旦执行 **fetch / sync** 等与线上一致的动作，**必须**同时满足：**（1）应用凭证已配置**、**（2）应用对目标表格/文档具备足够协作者权限**。

### 1. 在飞书开放平台创建并配置自建应用

1. 使用企业管理员或有权限的账号登录 [飞书开放平台](https://open.feishu.cn/) → **开发者后台**。  
2. **创建企业自建应用**，填写应用名称与描述（便于在表格「添加协作者」时搜索）。  
3. 在应用后台打开 **「凭证与基础信息」**，记录：  
   - **App ID**（形如 `cli_xxxxxxxx`）  
   - **App Secret**（仅创建时完整展示，请妥善保存；泄露后应立即重置）  
4. 打开 **「权限管理」**，按各工具 README 中列出的接口申请所需 **API 权限**（如电子表格、云文档、导出任务、知识库节点等）；若使用 **`adk update`** 从云空间下载 **manifest** 与制品包，还需为应用开通 **查看、下载及预览云空间中的文件** 等与 Drive 下载接口一致的权限；若 manifest token 为**知识库节点**，还需开通 **查看知识库 / 查看知识空间节点信息** 等与 [获取知识空间节点信息](https://open.feishu.cn/document/server-docs/docs/wiki-v2/space-node/get_node) 一致的 wiki 读权限。保存后**创建版本并申请发布**（企业内自建应用通常由管理员审批通过后方可生效）。  
   - 权限清单以各工具文档为准，避免漏开导致 `403` / `99991663` 等错误。

### 2. 将 App ID 与 App Secret 配置到本机环境

工具通过**环境变量**读取凭证（**不会**写入 `config.json`，避免将密钥提交进 Git）：

| 变量名 | 说明 |
|--------|------|
| **`FEISHU_APP_ID`** | 自建应用的 App ID |
| **`FEISHU_APP_SECRET`** | 自建应用的 App Secret |

**Linux / macOS（当前终端会话）**：

```bash
export FEISHU_APP_ID='cli_你的AppID'
export FEISHU_APP_SECRET='你的AppSecret'
```

**长期生效**：将上述两行写入 `~/.bashrc`、`~/.zshrc` 或你团队统一的 shell 配置文件中，执行 `source ~/.bashrc`（或重新打开终端）后生效。

**Windows（CMD）**：

```bat
set FEISHU_APP_ID=cli_你的AppID
set FEISHU_APP_SECRET=你的AppSecret
```

**Windows（PowerShell）**：

```powershell
$env:FEISHU_APP_ID="cli_你的AppID"
$env:FEISHU_APP_SECRET="你的AppSecret"
```

**校验**：配置完成后，在同一终端执行 `echo "$FEISHU_APP_ID"`（Windows 用 `echo %FEISHU_APP_ID%`）应能打印出 App ID；再运行依赖飞书的命令（如 `adk property fetch <项目>`）。若仍提示未设置，说明 `adk` 所在进程未继承到变量（常见于 IDE 内置终端未重启、或从图形界面启动的任务未加载 profile）。

> **说明**：本仓库工具**未内置**从 `.env` 自动加载；若希望使用 `.env`，需自行用 `direnv`、`dotenv` 或在启动脚本中 `source`。

### 3. 在飞书在线表格 / 文档上为自建应用授权（协作者权限）

仅有 **App ID + Secret** 只能换取 **`tenant_access_token`**；应用还必须对**每一个**需要读写的在线表格、多维表格（Base）或挂载在知识库中的表格**显式具备访问权限**，否则接口会报无权限或资源不可见。

请按业务实际，对 **`config.json` 中配置的飞书链接** 所指向的每一个文档操作：

1. 在飞书客户端或网页版**打开该在线表格**（或打开包含该表格的知识库节点、云文档中的嵌入表，以实际资源类型为准）。  
2. 打开 **「分享」** 或右上角 **「⋯」更多** → **「权限设置」/「协作者管理」**（不同客户端文案可能为「添加协作者」「管理协作者」等）。  
3. 在添加对象中选择 **「文档应用」** 或 **「群机器人 / 应用」**（以当前飞书版本界面为准），搜索你在开放平台创建的**自建应用名称**。  
4. 为该应用分配权限级别：  
   - **仅拉表、导出、读单元格**（如 `property fetch` 的只读链路）：至少保证应用对文档为**可阅读**；若仍出现导出失败或部分 API 报错，可升级为 **「可编辑」**。  
   - **需要回写飞书**（如 `cfg-word` 的 `sync`、`property-sync`、改子表等）：必须为 **「可编辑」** 或 **「可管理」**（以团队安全策略为准；**可管理**含更多管理类能力，仅在确有需要时授予）。  
5. 若表格在**知识库（Wiki）**下，除表格自身协作者外，有时还需保证应用对**所在知识库空间**或**父级节点**具备访问权限；具体以飞书当前权限模型为准，报错时可优先检查 Wiki 节点是否已对应用可见。

**建议**：由表格负责人或项目接口人统一执行「添加应用」，并在项目文档中记录**已授权的应用名称**与**授权范围**，避免新人只配环境变量仍报 403。

### 4. 与各工具文档的关系

- 根目录本节只说明**平台级共性**（凭证环境变量 + 表格授权思路）。  
- **权限位列表、Wiki URL 写法、`config.json` 字段**等仍以各工具 README 为准：  
  [tool_property/README.md](tools/tool_property/README.md) · [tool_cfg_word/README.md](tools/tool_cfg_word/README.md) · [tool_vhal_svc/README.md](tools/tool_vhal_svc/README.md)。

## 使用

### 统一入口

```bash
adk                  # 无参数：交互式菜单（工具包列表来自 tools/*/adk-tool.json）
adk -v               # 平台版本（小写 -v，与 -h 同为短选项）
adk --version        # 同上（长选项）
adk -h               # 平台帮助：页眉 + 下列分区（无单独 Usage 行与长段 epilog）
```

**`adk -h` 结构（Rich）**：

1. **页眉（醒目块）**：**简介**（突出 **ADK** 与统一工具平台）、**版本**、**作者**、**Copyright**（英文版权行；文案默认在 **`autodrivekit/platform_info.py`**，可按项目修改）。
2. **通用选项**：`-h` / `--help`、`-v` / `--version`，以及与二者同区的 **`update`**（飞书 manifest + 制品在线更新；见 **`adk update -h`**）。
3. **工具包**：`adk-tool.json` 注册的 **id 与简介**（即 `adk <id>` 中的 `<id>`），**不是**示例命令行。帮助里工具包 **id** 使用 **品红色（bold magenta）** 显示，与下方「专业选项」中的示例命令（默认 **青色**）区分。
4. **交互选项**：单独醒目一行说明 **仅输入 `adk`（不要跟子命令或其它参数）** 即进入 **Rich 交互菜单**；附简短向导说明。
5. **专业选项（一条龙）**：**`adk <工具包> <项目>`** 形式示例（**`<项目>`** 为占位符）；其下表格列出**当前本机**从各工具 **`config.json`** 的 **`projects`** 解析到的**可选项目名**（与交互菜单一致，优先用户配置目录）。

本帮助**不**单独打印 Typer 的 `Usage:` 长行，也**无**文末大段 epilog；命令行形式见下节 **ARGS**。可选：设置 **`NO_COLOR=1`**（或 `TERM=dumb`）以减弱终端彩色输出。

实现要点：**`autodrivekit/adk_rich_help.py`**（分区与样式）、**`platform_info.py`**（页眉字段）。

**交互式菜单（仅输入 `adk`）**：界面用 **Rich** 的 **Panel / Rule** 分区。**步骤 1** 选择工具包；若该工具在 `adk-tool.json` 中配置了 **`interactive_project_pick`**（如 **property**、**cfg-word**、**vhal-svc**），则 **步骤 2 选择项目**，**步骤 3** 为说明与参数（**`choices`** / **`examples`**）；未配置时 **步骤 2** 即为说明与参数。**退出**：步骤 1 与项目选择步骤可输入 **`0` / `q` / `quit` / `exit` / 直接回车**；参数行输入 **`q` / `quit` / `exit`**（参数行**回车**仍表示「默认执行」，与退出区分）。

### ARGS 是什么

命令行一般形式为 **`adk [通用选项] <子命令> [ARGS]...`**。其中 **`<子命令>`** 多为 **`adk-tool.json` 注册的 `id`**（即工具包名）；**`update`** 为平台内置子命令（非工具包）。**`[ARGS]`** 写在子命令之后时，对工具包按顺序**原样透传**给该工具入口（默认 `main.py`），与在该工具目录执行 `python3 main.py …` 等价；对 **`update`** 则为其 Typer 选项（见 **`adk update -h`**）。具体参数由各子命令自行定义。

### 一条龙（直接跑某工具包流水线）

不写交互菜单时，可用 **`adk <工具包> <参数…>`** 直接执行，例如（默认跑该工具文档中的**完整流水线**，具体步骤因工具而异）：

```bash
adk cfg-word n50           # cfg-word：对项目 n50 跑默认全流程
adk property BAIC          # property：对项目 BAIC 跑 fetch+generate+deploy（默认）
```

单步或自定义组合仍写在 **`ARGS`** 中，与各工具 `main.py` 一致：

```bash
adk property --help          # 与各工具 python3 main.py --help 相同
adk property -l
adk cfg-word --help
adk cfg-word sync n50
```

平台对工具包入口**不拦截** `--help` / `-h`，会透传给工具，因此可直接使用 **`adk <工具包> --help`**。若将来遇到与 Typer 冲突的极少数选项，仍可使用 **`adk <工具包> -- <参数…>`** 强制透传。

> **说明**：**cfg-word** 工具自身另有 **`-V`**（大写）表示 **validate**，与平台 **`adk -v`**（版本）不同；请写在 **`adk cfg-word …`** 之后，例如 `adk cfg-word -V n50`。

### 未安装 `adk` 脚本时

```bash
python3 -m autodrivekit
python3 -m autodrivekit property -l
```

## 各工具包 README 索引

平台本文仅说明 **安装、`adk` 用法与生态约定**；**每个工具包的完整说明**以对应目录下的 **`README.md`** 为准（参数、示例、`config.json`、流水线步骤等）。

| 工具包 | 路径 | 说明 |
|--------|------|------|
| **property** | [**tools/tool_property/README.md**](tools/tool_property/README.md) | CarProperty：fetch / generate / deploy、`config.json`、多变体、部署与安全校验等 |
| **cfg-word** | [**tools/tool_cfg_word/README.md**](tools/tool_cfg_word/README.md) | 配置字：parse → sync → validate → property-sync → generate → deploy、飞书与 `vehicle_config_byte_count` 等 |
| **vhal-svc** | [**tools/tool_vhal_svc/README.md**](tools/tool_vhal_svc/README.md) | 飞书拉表、生成、deploy.files 拷贝至 hal/vehicleservice |

在仓库内跳转：上述链接均为相对路径（以本文件所在目录为根）。若使用 Git 托管前端浏览，也可从本页顶部的「命名与定位」表直接点入各工具 **README** 列。

## 工具生态：如何新增或扩展工具

以下约定用于让第三方或后续同事**以统一方式**接入平台，并保持可维护性。

### 1. 放置位置与包名

- 在 **`tools/`** 下新建**一个目录**即为一个**工具包**，目录名建议 **`tool_<领域短名>`**（小写、下划线），例如 `tool_property`、`tool_cfg_word`；新建工具可用 `tool_vehicle_gen` 等，**勿与已有目录重名**。
- 工具包内可包含任意子模块、配置、模板；**自包含**：运行时所需资源原则上放在该目录下（或通过配置指向外部路径）。

### 2. 注册清单 `adk-tool.json`（必填）

在与 `main.py` 同级（工具包根目录）放置 **`adk-tool.json`**，UTF-8 编码。字段说明：

| 字段 | 必填 | 说明 |
|------|------|------|
| **`id`** | 是 | 对应 **`adk <id>`** 的工具包名（`adk -h` 中「**工具包**」分区列出的名称）。建议使用 **小写字母、数字、连字符**（如 `property`、`cfg-word`）。**全平台唯一**。 |
| **`title`** | 是 | 简短说明，用于 `adk -h` 与交互菜单展示。 |
| **`entry`** | 否 | 入口脚本相对工具包根的路径，默认 **`main.py`**。 |
| **`order`** | 否 | 整数，**越小越靠前**（帮助与菜单排序）；缺省为 `100`。 |
| **`hint`** | 否 | 多行字符串（JSON 内用 `\\n` 换行），用于**仅输入 `adk` 时的交互菜单**：选工具包后向用户解释**无参含义**与下一步建议。 |
| **`choices`** | 否 | **参数选择**：JSON 数组，元素为对象 **`arg`**（命令片段，通用、可用 `<项目>` 占位）与 **`desc`**（**必填**：说明该命令能实现的能力与边界）。兼容旧版：元素也可为纯字符串（无 `desc` 时界面提示见 `--help`）。 |
| **`examples`** | 否 | **参数示例**：同上；`arg` 可含真实项目名；**`desc` 必填**，说明该示例对应场景与效果。 |

**书写约定（本仓库默认 · 风格乙 · 全词）：**

| 风格 | 做法 | 注意 |
|------|------|------|
| **甲 · 短选项** | 示例里用 `-l`、`-fg` 等 | 与全词二选一为主，避免混排重复 |
| **乙 · 全词**（默认） | `choices` 列全部可用动作（通用）；`examples` 再给带项目名的抄录示例 | **`choices` 不含具体项目名**；**`examples` 可含** |
| **丙 · 按场景分层** | 数组顺序：只读 → 单步 → 组合 | 仍需在 `choices` 中覆盖全部动作 |

当前各工具在 **`choices` + `examples`** 中分工：通用命令见 **`choices`**，带项目示例见 **`examples`**；与短选项对应关系见各工具 `python3 main.py --help`。

平台启动时会扫描 **`tools/*/adk-tool.json`**，校验 **`id` 唯一**且 **`entry` 文件存在**；否则**启动失败**并提示路径，避免静默遗漏。

### 3. 入口脚本约定

- 入口须为 **可执行 Python 文件**，建议使用 `if __name__ == "__main__":` + `main()`。
- 入口内请使用 **`__file__` 推导工具包根目录**（`SCRIPT_DIR`），**不要**依赖「当前工作目录」，以便 `adk` 从任意 cwd 调用时行为一致。
- **参数**：沿用本仓库现有工具习惯，使用 `argparse` 等解析 **`sys.argv`** 即可；平台将**原样透传**`adk <工具包>` 之后的参数（等价于 `python3 main.py …`）。

### 4. 依赖

- **通用依赖**（如 Typer、requests、openpyxl）建议由平台 **`pyproject.toml`** 统一维护，避免各工具重复声明冲突版本。
- 若某工具需要**独有依赖**，在评审后可加入平台 `dependencies` 或该工具包内 `requirements.txt` 并在 README 中说明安装方式。

### 5. 接入后自检

1. 在工具包目录执行：`python3 main.py --help`（或各工具约定的自检方式）。
2. 在仓库根执行：`python3 -m pip install -e .`，再执行：`adk <id> …` 与交互菜单是否出现新工具。

### 6. 可选：外部工具包

若工具仓库独立维护，可将目录 **克隆或软链** 到 `tools/<name>/` 并放入符合规范的 `adk-tool.json` 与入口，无需改平台代码。

---

## 版本

- **平台版本**：`adk -v` / `adk --version` 与 **`pyproject.toml`** 的 **`[project] version`**、`autodrivekit/__init__.py` 的 **`__version__`** 须保持一致。
- **各工具**：保留自身版本（如子工具 `--version` 输出）。

### 版本历史（平台）

> **维护约定**：**每次发版 bump 平台版本时**，须在本表 **顶部追加一行**（新版本在上），并同步更新 **`pyproject.toml`**、**`autodrivekit/__init__.py`** 与 [**docs/ADK平台说明.md**](docs/ADK平台说明.md) **§8.2 版本历史**表（两处版本历史 **须一致**，不得只改一处）；日期与摘要以实际 Release 或内部发版说明为准。

| 版本 | 日期 | 变更摘要 |
|------|------|----------|
| **1.1.0** | 2026/4/16 | **平台（minor）**：`adk update`（飞书 manifest + 制品；Drive 与知识库 **file** 节点、`wiki get_node` 解析）；`~/.local/opt/adk` staging/`current`；用户配置与数据外置（4A）；`adk.json` 默认 manifest 与 **`config_migrate`** 双 wiki 节点常量；发布脚本 **`scripts/pack_adk_release.sh`** / **`publish_release_feishu.py`** / **`wiki_release_upload.py`**；**`feishu_drive`** 上传云空间根、制品下载支持 wiki 节点。**vhal-svc**：Android/MCU 域；用户数据目录预创建。 |
| **1.0.0** | 2026/4/15 | 1. 优化平台交互；2. 新增 **vhal-svc** 工具包能力。 |
| **0.3.0** | 2026/4/9 | 平台与 **property** / **cfg-word** 等工具包当前能力基线。 |
| **0.2.0** | 2026/4/7 | 完成 **adk** 平台框架搭建。 |
| **0.1.0** | 2026/4/1 | 实现 **property** 工具包能力。 |
