# 车辆配置头文件生成工具

此工具用于根据Excel配置文件生成C++头文件。

## 功能概述
该 Python 脚本会自动查找 `table` 文件夹中的所有 Excel 文件，支持用户选择要处理的文件和特定的工作表（sheet）。脚本会读取所选Excel文件中指定工作表的车辆配置信息，生成对应的C++头文件。脚本会在 `output` 目录下创建与所选工作表名称相同的文件夹，并在该文件夹中生成 `cfg_cal.h` 头文件。

脚本使用 `config.json` 配置文件来定义不同工作表的排序方式，配置文件必须存在且格式正确。

Excel文件来源示例：https://t83dfrspj4.feishu.cn/sheets/NC9GsxyTJhLqU5tPHkOcTnKInFR

## 配置文件说明

### 配置文件结构
脚本使用 `config.json` 文件来定义不同工作表的排序方式，配置文件必须存在于脚本所在目录。配置文件的基本结构如下：

```json
{
  "reverse_sheets": ["n50"],
  "normal_sheets": ["n80"]
}
```

### 配置字段说明
- `reverse_sheets`：需要使用倒序排序（bit7~bit0）的工作表名称列表
- `normal_sheets`：需要使用正序排序（bit0~bit7）的工作表名称列表

### 注意事项
- 配置文件必须存在且格式正确，否则程序会直接退出
- 工作表名称不区分大小写
- 如果工作表名称同时出现在两个列表中，`reverse_sheets` 的优先级更高
- 配置文件的优先级高于命令行参数

## 如何使用
1. 确保你已经安装了 Python 3.x、openpyxl。
2. 将 Excel 配置文件放置在 `table` 文件夹中。
3. 确保 `config.json` 配置文件存在于脚本所在目录，并正确配置了工作表的排序方式。
4. 打开终端或命令提示符，进入脚本所在的目录。
5. 运行脚本：
   ```bash
   # 默认使用倒序排列(bit7~bit0)
   python vehicleConfigGen++.py

   # 使用正序排列(bit0~bit7)（作为默认值）
   python vehicleConfigGen++.py --bit-order normal

   # 使用倒序排列(bit7~bit0)（显式指定）
   python vehicleConfigGen++.py --bit-order reverse
   ```
6. 脚本会列出 `table` 文件夹中的所有 Excel 文件，输入对应序号选择要处理的文件。
7. 脚本会列出所选文件中的所有工作表，输入对应序号选择要处理的工作表。
8. 脚本会根据以下规则确定工作表的排序方式：
   - 如果工作表名称在配置文件中被指定，则使用配置文件中的设置
   - 如果工作表名称在配置文件中未被指定，则使用命令行参数或默认值
9. 脚本会在 `output` 目录下为所选工作表创建对应名称的文件夹，并生成 `cfg_cal.h` 头文件。

## 命令行参数
- `--bit-order`：指定默认的byte内变量排序方式
  - `reverse`：倒序（默认），byte中比特位排序为bit7、bit6、...、bit0
  - `normal`：正序，byte中比特位排序为bit0、bit1、...、bit7
- **注意**：配置文件的优先级高于此参数

## 正序和倒序说明

### 倒序 (bit7~bit0)
- byte中的变量按照Excel中从上到下的顺序，对应byte中的高位到低位
- 生成的代码中，先声明的变量对应byte中的高位

### 正序 (bit0~bit7)
- byte中的变量按照Excel中从上到下的顺序，对应byte中的低位到高位
- 生成的代码中，先声明的变量对应byte中的低位

## 示例

假设Excel表格中有以下配置（同一byte内）：

| BYTE | BIT | TYPE | CONFIG_ITEM_NAME |
|------|-----|------|------------------|
| 0    | 3   | uint8_t | VAR_A |
| 0    | 2   | uint8_t | VAR_B |
| 0    | 3   | uint8_t | VAR_C |

### 倒序生成结果
```c
struct Did0xf011
{
    uint8_t VAR_C : 3; // Byte 0  (对应bit5~bit3)
    uint8_t VAR_B : 2; // Byte 0  (对应bit2~bit1)
    uint8_t VAR_A : 3; // Byte 0  (对应bit0~bit0)
    // ...
};
```

### 正序生成结果
```c
struct Did0xf011
{
    uint8_t VAR_A : 3; // Byte 0  (对应bit0~bit2)
    uint8_t VAR_B : 2; // Byte 0  (对应bit3~bit4)
    uint8_t VAR_C : 3; // Byte 0  (对应bit5~bit7)
    // ...
};
```

## 目录结构
```plaintext
.
├── table/                      # 存放输入的 Excel 配置文件
│   ├── vehicleConfigWordList.xlsx
│   └── vehicle_config_word_list_20251216.xlsx
├── output/                     # 输出文件目录（自动创建）
│   ├── n50/                    # N50项目的输出文件夹
│   │   └── cfg_cal.h           # N50项目生成的头文件
│   ├── n80/                    # N80项目的输出文件夹
│   │   └── cfg_cal.h           # N80项目生成的头文件
│   └── Sheet2/                 # 其他工作表对应的输出文件夹
│       └── cfg_cal.h           # 其他工作表生成的头文件
├── vehicleConfigGen++.py       # 生成头文件的 Python 脚本
├── config.json                 # 配置文件，定义工作表的排序方式
└── README.md                   # 本说明文件