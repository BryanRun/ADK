# ADK（AutoDriveKit）通用工具平台 使用手册

> **ADK** 是面向车辆软件开发的**统一工具平台**，通过单一命令行入口 `adk`，将分散的代码生成、配置同步、表格管理、版本管理等重复性工作整合为**一条龙自动化流水线**，大幅降低人工操作成本与出错风险。

---

## 1. 平台简介与价值

### 1.1 平台是什么

**AutoDriveKit**（简称 **ADK**）为车辆相关代码生成、配置同步等场景提供**单一命令行入口 `adk`**。每个能力以**独立工具包**形式组织，通过注册清单 **`adk-tool.json`** 实现**即插即用**式扩展——新工具放入目录、填写清单，即可被平台自动发现并调用，**无需修改平台代码**。

### 1.2 解决什么问题

| 痛点（之前） | 方案（ADK） |
|-------------|------------|
| 各工具**入口分散**，脚本多、用法各异，新人上手成本高 | **统一入口** `adk <工具>` + 交互式菜单，一套用法覆盖所有工具 |
| 飞书拉表、文件重命名、工具运行、拷贝产物……**手动操作环节多、易出错** | **一条龙流水线**：一条命令自动完成从数据拉取到代码部署的全流程 |
| 每个工具**独立维护**，配置格式不统一，协作评审困难 | **统一注册与入口约定**，新工具遵循同一套规范，便于团队协作 |
| 工具扩展需改动平台源码，**迭代成本高** | **即插即用的工具生态**：新建目录 + 清单注册即完成接入，零侵入 |
| 不常记命令的同事操作困难，**使用门槛高** | **Rich 交互菜单**：无参数时进入可视化向导，逐步引导操作 |
| 线上版本更新后本地无法及时感知，**信息滞后** | `adk update` **在线自动更新** + `adk doctor` **环境体检**，确保工具链始终最新 |

### 1.3 核心能力一览

| 能力 | 说明 |
|------|------|
| 工具发现 | 启动时扫描 `tools/*/adk-tool.json`，自动注册所有工具包 |
| 参数透传 | `adk <id>` 之后的参数原样交给工具包，与直接运行工具等价 |
| 交互菜单 | 仅输入 `adk` 即进入可视化工具选择与参数向导 |
| 一条龙执行 | `adk <工具包> <项目>` 一条命令完成 scan → fetch → parse → generate → validate → deploy → sync → snapshot |
| 在线更新 | `adk update` 从飞书拉取最新版本并自动安装部署 |
| 环境体检 | `adk doctor` 检测配置、依赖、环境变量一致性并给出修复建议 |
| 工具生态 | 新建目录 + 填写清单即可接入新工具，无需改动平台源码 |

---

## 2. 快速开始

### 2.1 环境要求

- **Python 3.10+**
- 建议使用 `python3 -m pip`

### 2.2 首次安装

首次使用需要从仓库源码安装。在仓库根目录执行：

```bash
python3 -m pip install -e .
```

安装完成后，`adk` 命令被创建在 `~/.local/bin/`（需确认该目录在 `PATH` 中），此时指向仓库源码。

### 2.3 后续升级

首次安装后，后续版本升级**无需再操作仓库**，直接通过 `adk update` 在线更新：

```bash
adk update                 # 检测并安装最新版本
adk update --check-only    # 仅检查是否有新版本，不下载
```

首次执行 `adk update` 时，工具会自动完成以下衔接：

1. 从飞书下载最新版本到 `~/.local/opt/adk/releases/<版本>/`
2. 将 `adk` 入口从原来的 pip 脚本**自动切换**为指向 managed install 的符号链接
3. 后续每次 `adk update` 只需切换版本符号链接，升级即时生效

> 首次使用 `adk update` 前需完成 [飞书配置](#4-飞书配置首次使用必读)。

### 2.4 验证

```bash
adk -v          # 查看版本
adk -h          # 查看帮助
adk doctor      # 体检环境配置
```

---

## 3. 使用指南

### 3.1 命令形式

```text
adk [通用选项] <工具包> <项目> [动作]...
```

- `<工具包>` 为注册的工具名（如 `property`、`cfg-word`、`vhal-svc`）
- `<项目>` 为 `config.json` 中配置的项目名（如 `BAIC`、`n50`、`n5x`）
- `[动作]` 为工具包支持的步骤（如 `scan`、`fetch`、`generate`、`deploy`）；省略时执行默认完整流水线

### 3.2 常用命令

| 命令 | 作用 |
|------|------|
| `adk` | 进入交互式菜单（推荐新手使用） |
| `adk -h` | 查看平台帮助（含所有已注册工具） |
| `adk -v` | 查看平台版本 |
| `adk update` | 在线更新到最新版本 |
| `adk update --check-only` | 仅检查是否有新版本，不下载 |
| `adk doctor` | 环境体检与修复建议 |
| `adk <工具包> --help` | 查看指定工具的帮助 |

### 3.3 交互式菜单

仅输入 `adk`（不带任何参数）即进入交互式菜单：

- **步骤 1**：选择工具包
- **步骤 2**：选择项目（如有多个项目配置）
- **步骤 3**：确认参数或直接回车执行默认流水线

退出方式：输入 `q` / `quit` / `exit` 或 `0`。

### 3.4 一条龙命令（推荐）

```bash
adk property <项目>        # 执行 property 完整流水线（scan → fetch → generate → deploy → snapshot）
adk cfg-word <项目>        # 执行 cfg-word 完整流水线（parse → sync → validate → property-sync → generate → deploy）
adk vhal-svc <项目>        # 执行 vhal-svc 完整流水线（fetch → generate → deploy → compile）
```

---

## 4. 飞书配置（首次使用必读）

以下工具通过**飞书开放平台**读写在线表格，需配置**自建应用凭证**（一次配置，所有工具共用）：

| 工具包 | 依赖飞书的场景 |
|--------|---------------|
| **property** | `fetch`：拉取飞书电子表格 |
| **cfg-word** | `sync`：读写配置字中间表 |
| **vhal-svc** | `fetch`：导出 VHAL 矩阵表 |

> 仅做本地生成（如 `generate`）**无需**配置飞书；执行 `fetch` / `sync` 等在线操作时**必须**完成以下配置。

### 4.1 创建飞书自建应用

1. 登录 [飞书开放平台](https://open.feishu.cn/) → **开发者后台**
2. **创建企业自建应用**，记录 **App ID** 和 **App Secret**
3. 在**权限管理**中申请各工具所需的 API 权限（如电子表格、云文档等），**创建版本并申请发布**

### 4.2 配置环境变量

| 变量名 | 说明 |
|--------|------|
| **`FEISHU_APP_ID`** | 自建应用的 App ID |
| **`FEISHU_APP_SECRET`** | 自建应用的 App Secret |

**Linux / macOS**：

```bash
export FEISHU_APP_ID='cli_你的AppID'
export FEISHU_APP_SECRET='你的AppSecret'
```

长期生效请写入 `~/.bashrc` 或 `~/.zshrc`。

**Windows（PowerShell）**：

```powershell
$env:FEISHU_APP_ID="cli_你的AppID"
$env:FEISHU_APP_SECRET="你的AppSecret"
```

**校验**：执行 `echo "$FEISHU_APP_ID"` 确认输出正确，再运行 `adk property <项目> fetch` 测试连通性。

### 4.3 为应用授权表格访问

飞书应用还需对**每个**目标表格具备协作者权限：

1. 在飞书中打开目标表格
2. 点击 **「分享」** 或 **「添加文档应用」**
3. 搜索并添加你的自建应用
4. 分配权限：只读场景选**可阅读**；需回写选**可编辑**

> **建议**：由表格负责人统一添加应用，并记录已授权范围，避免新人只配环境变量仍报 403。

---

## 5. 工具包一览与使用手册

### 5.1 工具包总表

| 工具包 | 解决的核心痛点 | 一句话能力 | 完整流水线 |
|--------|---------------|-----------|-----------|
| **property** | 飞书表格拉取、代码生成、部署到 Git 全程手动 | 一条命令完成从在线表格到 Git 仓库的全自动代码生成 | scan → fetch → generate → deploy → snapshot |
| **cfg-word** | 配置字映射表维护分散、校验困难、多表联动靠人工 | 自动解析 Excel、飞书同步、BYTE/BIT 校验、生成 cfg_cal.h 并部署 | parse → sync → validate → property-sync → generate → deploy |
| **vhal-svc** | VHAL 矩阵表驱动的生成-部署-编译流程繁琐易断 | 基于飞书矩阵表自动生成 VehicleService 侧产物并部署编译 | fetch → generate → deploy → compile |

#### property — 车辆属性代码生成

面向车载 SOC 平台 CarPropertyManager 模块，从飞书在线属性定义表自动下载 Excel，通过 Jinja2 模板引擎生成 C/C++ 头文件（进程级 Property Config、PSIS 配置等），并一键部署到目标 Git 仓库。支持**在线差异扫描**（scan）、**多项目管理**、**多变体输出**（如 n50/n51/n80）、**自动版本识别**和**飞书版本快照**。

#### cfg-word — 整车配置字映射表管理

面向整车配置字（Vehicle Config）的全生命周期管理。从本地 Excel 配置字源表出发，自动完成结构化解析、飞书中间表差分同步（变更高亮）、BYTE/BIT 校验（bit 之和、字节覆盖完整性）、Property 表增量更新、`cfg_cal.h` 代码生成与 Git 仓库部署。支持**多种表格版式解析器**（ACIC、ICC、Coding DID）、**中文→英文宏名映射**管理和**缺失字节自动补全**。

#### vhal-svc — VHAL 矩阵表生成与部署

面向 VHAL（Vehicle HAL）矩阵表驱动的 VehicleService 侧代码生成。内嵌 VehicleGenerateTool 生成引擎，从飞书在线矩阵表自动下载数据，调用生成脚本产出源文件，按规则部署到目标 Git 仓库，并可选执行编译。四步**强依赖链**自动管理，失败精准定位，支持**一源多目标部署**。

### 5.2 各工具包使用手册

> 以下为各工具包的详细使用手册，对应飞书文档中的子页面：

| 工具包 | 使用手册 |
|--------|----------|
| **property** | [property 使用手册](property使用手册.md) |
| **cfg-word** | [cfg-word 使用手册](cfg-word使用手册.md) |
| **vhal-svc** | [vhal-svc 使用手册](vhal-svc使用手册.md) |

---

## 6. 在线更新与体检

### 6.1 在线更新（`adk update`）

执行 `adk update` 即可从飞书拉取最新版本并自动部署到本地，无需手动下载安装包。

```bash
adk update                 # 检测并安装最新版本
adk update --check-only    # 仅检查是否有新版本，不下载
adk update --dry-run       # 演练更新流程，验证 manifest 配置完备性，不下载
```

| 选项 | 短选项 | 说明 |
|------|--------|------|
| `--check-only` | `-c` | 仅从飞书读取 manifest 比对版本号，不下载制品包 |
| `--dry-run` | `-n` | 在 `--check-only` 基础上额外验证 manifest 配置是否完备（如制品包 token 是否存在），但仍不下载安装，适合演练更新流程 |

> 首次使用前需完成 [飞书配置](#4-飞书配置首次使用必读)。

### 6.2 环境体检（`adk doctor`）

```bash
adk doctor
```

自动检测平台配置、工具配置一致性、环境变量与依赖状态，并给出修复建议。**建议在版本升级后或遇到异常时执行**。

---

## 7. 最佳实践预览

本节展示 ADK 在实际业务中的典型使用场景，帮助快速建立感性认知。

### 7.1 交互式操作流水线

`<!-- 截图：best-practice-interactive.png — adk 交互选项执行 "n50 配置字" 操作流水线 -->`

### 7.2 一条龙命令行操作

`<!-- 截图：best-practice-oneliner-cfgword.png — adk 专业选项执行 "n50 配置字" 操作流水线 -->`

`<!-- 截图：best-practice-oneliner-property.png — adk 专业选项执行 "BAIC property 更新" 操作流水线 -->`

### 7.3 自动化产物示例

`<!-- 截图：best-practice-feishu-table.png — 自动化更新后的飞书表格（高亮更新的单元格） -->`

---

## 8. 版本历史

| 版本 | 日期 | 变更摘要 |
|------|------|----------|
| **1.2.6** | 2026/4/26 | 1. **cfg-word** 升至 v1.2.0：parse 阶段缺少映射时自动从飞书拉取；修复 Excel 换行符导致配置项名称与映射表不匹配；修复飞书同步清背景色行范围超出网格限制；property-sync changeHistory 子表名匹配改为忽略大小写、日期列改为日期格式写入、变更单元格高亮；获取应用名失败降级为提示 |
| **1.2.5** | 2026/4/26 | 1. **cfg-word** 升至 v1.1.0：新增 snapshot 流水线步骤（sync 后自动创建飞书版本快照）；property-sync 的"通知周期"和"默认值"列改为数字类型写入；property-sync 变更后自动在 changeHistory 子表追加记录<br>2. 修复 `__version__` 硬编码导致 `adk update` 后版本号不更新，改为自动从 `pyproject.toml` 读取 |
| **1.2.3** | 2026/4/24 | 1. `adk -h` help 页面修复：`--help` 文案改为中文、交互面板引用修正、补充 `doctor` 命令说明<br>2. **property** 升至 v1.2.1：修复 `fetch_project` 函数定义缺失导致 scan 后 fetch 报错<br>3. `adk update` 后自动将入口指向 managed install，无需手动创建符号链接 |
| **1.2.2** | 2026/4/22 | 1. sha256 校验改为源码文件树级别，兼容飞书 wiki 文件节点对上传文件的 gzip/tar/xlsx 改写 |
| **1.2.1** | 2026/4/22 | 1. 修复飞书 CDN 对下载文件额外包裹 gzip 导致 `adk update` sha256 校验失败<br>2. 发布产物目录从外部目录改为仓库内 `release/`<br>3. 打包时自动清理 `release/` 下的旧版本产物 |
| **1.2.0** | 2026/4/22 | 1. **property** 新增 `scan` 在线差异扫描命令（飞书与本地逐单元格对比、增/删/改颜色高亮）<br>2. **property** `snapshot` 独立为单独命令，流水线扩展为 scan → fetch → generate → deploy → snapshot 五步<br>3. 修复飞书 CDN 返回 gzip 压缩 manifest 时的解码异常 |
| **1.1.0** | 2026/4/16 | 1. 新增 `adk update` 版本检测与在线自动更新能力<br>2. 用户配置文件与程序文件解耦，升级不影响用户配置<br>3. 新增 `adk doctor` 环境体检命令<br>4. 新增快速打包、发版能力 |
| **1.0.0** | 2026/4/15 | 1. 优化平台交互体验<br>2. 新增 **vhal-svc** 工具包（VHAL 矩阵表驱动的生成-部署-编译流水线） |
| **0.3.0** | 2026/4/9 | 1. 平台与 **property** / **cfg-word** 工具包能力基线<br>2. 统一 CLI 入口与交互式菜单框架 |
| **0.2.0** | 2026/4/7 | 1. 完成平台框架搭建（工具发现、参数透传、注册清单机制） |
| **0.1.0** | 2026/4/1 | 1. 实现 **property** 工具包（飞书表格下载、Excel 解析、C/C++ 代码生成、Git 仓库部署） |

---

## 9. 常见问题

| 现象 | 解决方法 |
|------|----------|
| `adk: command not found` | 在仓库根执行 `pip install -e .`，确认 `PATH` 含脚本目录 |
| 飞书 API 报 `403` | 检查应用权限是否已审批、目标表格是否已添加应用为协作者（见 [§4.3](#43-为应用授权表格访问)） |
| 环境变量已配但提示未设置 | 确认在**同一终端**中运行（IDE 内置终端需重启） |
| 启动报错指向 `adk-tool.json` | 检查该文件 JSON 格式、`id` 唯一性、`entry` 文件是否存在 |
| `adk update` 报 manifest 类型错误 | manifest 须为飞书知识库「文件」节点（非文档页） |
| 交互菜单中想退出 | 输入 `q` / `0` / `exit`；注意参数行中**回车**表示执行默认操作 |
| 工具行为与预期不符 | 执行 `adk <工具> --help` 查看帮助；仍有问题请填写反馈表 |

---

## 10. 反馈

使用中遇到问题或有改进建议，欢迎在 **[ADK 使用跟踪与反馈表](https://t83dfrspj4.feishu.cn/wiki/HNZewVPZQiJCVFkpD2wc5SsAnYf)** 中填写。

---

## 附录：命令速查

### 平台通用

| 命令 | 说明 |
|------|------|
| `adk` | 进入交互式菜单，逐步引导选择工具、项目和参数 |
| `adk -h` | 查看平台帮助，列出所有已注册工具包 |
| `adk -v` | 查看平台版本号 |
| `adk update` | 从飞书拉取最新版本并自动部署到本地 |
| `adk update --check-only` | 仅检查是否有新版本，不下载安装 |
| `adk doctor` | 环境体检，检测配置、依赖、环境变量一致性并给出修复建议 |

### property 工具包

| 命令 | 说明 |
|------|------|
| `adk property --help` | 查看 property 工具帮助 |
| `adk property list` | 查看所有项目配置及状态 |
| `adk property <项目>` | 对指定项目执行完整流水线（scan → fetch → generate → deploy → snapshot） |
| `adk property <项目> scan` | 在线差异扫描：与飞书表格逐单元格对比，增/删/改颜色高亮 |
| `adk property <项目> fetch` | 从飞书下载电子表格到本地 input/ 目录 |
| `adk property <项目> generate` | 解析 Excel 并生成 C/C++ 头文件 |
| `adk property <项目> deploy` | 将生成文件增量拷贝到目标 Git 仓库 |
| `adk property <项目> snapshot` | 在飞书表格中创建版本快照 |

### cfg-word 工具包

| 命令 | 说明 |
|------|------|
| `adk cfg-word --help` | 查看 cfg-word 工具帮助 |
| `adk cfg-word list` | 查看所有项目配置 |
| `adk cfg-word feishu-sheets` | 列出飞书文档下所有子表标题与 sheet_id |
| `adk cfg-word <项目>` | 对指定项目执行完整流水线（parse → sync → validate → property-sync → generate → deploy） |
| `adk cfg-word <项目> parse` | 读取本地 Excel，解析为结构化配置条目 |
| `adk cfg-word <项目> sync` | 差分同步到飞书中间表，变更单元格自动高亮 |
| `adk cfg-word <项目> validate` | BYTE/BIT 校验：bit 之和、字节覆盖完整性检查 |
| `adk cfg-word <项目> property-sync` | 增量更新飞书 psis.car_cfg 子表 |
| `adk cfg-word <项目> generate` | 生成 cfg_cal.h 头文件 |
| `adk cfg-word <项目> deploy` | 将 cfg_cal.h 拷贝到目标 Git 仓库 |
| `adk cfg-word <项目> init-mapping` | 从飞书中间表初始化名称映射 |

### vhal-svc 工具包

| 命令 | 说明 |
|------|------|
| `adk vhal-svc --help` | 查看 vhal-svc 工具帮助 |
| `adk vhal-svc list` | 查看所有项目配置摘要 |
| `adk vhal-svc <项目>` | 对指定项目执行完整流水线（fetch → generate → deploy → compile） |
| `adk vhal-svc <项目> fetch` | 从飞书下载 VHAL 矩阵表到本地 |
| `adk vhal-svc <项目> generate` | 调用 VehicleGenerateTool 生成源文件 |
| `adk vhal-svc <项目> deploy` | 按规则将生成文件拷贝到目标 Git 仓库 |
| `adk vhal-svc <项目> compile` | 执行编译命令 |

---

**文档版本**：对齐平台 **1.2.6**
