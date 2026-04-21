import os
import re
import copy
import json
import datetime
import shutil

from enum import Enum

from lib.excelop import *
from lib.codegen import *

_RE_VALID_SIGNAL_NAME = re.compile(r'^[A-Za-z_][A-Za-z0-9_]*$')

PROP_EXCEL_SHEET_ROW_TITLE = 0

PROP_EXCEL_SHEET_HISTORY_DATE = 1
PROP_EXCEL_SHEET_HISTORY_COMMENT = 3

PROP_EXCEL_SHEET_COL_NAME = 0
PROP_EXCEL_SHEET_COL_OP = 1
PROP_EXCEL_SHEET_COL_NOTIFY = 2
PROP_EXCEL_SHEET_COL_INTERVAL = 3
PROP_EXCEL_SHEET_COL_VAL_TYPE = 4
PROP_EXCEL_SHEET_COL_VAL_DEFAULT = 5

# ext for psis usr
PROP_EXCEL_SHEET_COL_VAL_LEN = 7
PROP_EXCEL_SHEET_COL_MODULE_NAME = 9

# ext for psis diag
PROP_EXCEL_SHEET_COL_DID_STRUCT = 8
PROP_EXCEL_SHEET_COL_DID_PROP_NAME = 9
PROP_EXCEL_SHEET_COL_DID_INCLUDE = 10

# ext for SCCCOM
PROP_EXCEL_SHEET_COL_SCC_CMD = 7

# ext for PROCESS
PROP_EXCEL_SHEET_STATIC_COL_FULL_NAME = 0
PROP_EXCEL_SHEET_STATIC_COL_SHORT_NAME = 1
PROP_EXCEL_SHEET_STATIC_COL_HOST = 3

class OpType(Enum):
    OpTypeInvalid = 0
    CAR_PROPERTY_R = 1
    CAR_PROPERTY_RW = 2

class NtyType(Enum):
    NtyTypeInvalid = 0
    CAR_PROPERTY_NOTIFY_EVENT = 1
    CAR_PROPERTY_NOTIFY_ONCHANGED = 2
    CAR_PROPERTY_NOTIFY_CONTINUOUS_ONCHANGED = 3

class ValType(Enum):
    ValTypeInvalid = 0
    CAR_PROPERTY_INT32 = 1
    CAR_PROPERTY_UINT32 = 2
    CAR_PROPERTY_INT64 = 3
    CAR_PROPERTY_UINT64 = 4
    CAR_PROPERTY_FLOAT = 5
    CAR_PROPERTY_STRING = 6
    CAR_PROPERTY_BYTES = 7
    CAR_PROPERTY_ARRAY = 8
    CAR_PROPERTY_MAP = 9

class PropertyInfo:
    def __init__(self, op, nty, intv, val_type, val_default, domain, group, name,
                 val_len, did_struct, did_prop_name, did_include, module_name, mcu_tx_cmd_id ) -> None:

        # struct CarPropertyConfig
        self.prop_op = op
        self.prop_nty = nty
        self.prop_intv = intv
        self.prop_val_type = val_type
        self.prop_val_default = val_default
        self.prop_domain = domain
        self.prop_group = group
        self.prop_name = name

        # for PSIS prop
        self.prop_val_len = val_len
        self.prop_did_struct = did_struct
        self.prop_did_prop_name = did_prop_name
        self.prop_did_include = did_include
        self.prop_module_name = module_name

        # for SCCCOM prop
        self.prop_mcu_tx_cmd_id = mcu_tx_cmd_id

class PPSObject:
    def __init__(self, pps_name) -> None:
        self.prop_list = []
        self.name = pps_name
        self.prop_cnt = 0
        return

    def prop_append(self, prop_info: PropertyInfo):
        self.prop_list.append(prop_info)
        self.prop_cnt = self.prop_cnt + 1
        return


class Process:
    def __init__(self, full_name, short_name, is_host) -> None:
        self.pps_obj_list = []
        self.f_name = full_name
        self.s_name = short_name
        self.b_host = is_host
        return

    def pps_append(self, pps_info: PPSObject):
        self.pps_obj_list.append(pps_info)
        return

class PropertyRules:
    def __init__(self) -> None:
        self.props = []
        self.prop_num = 0
        self.prop_host = False
        self.latest_change_date = ''
        self.latest_change_comment = ''
        self.gen_time = ''
        self.did_structs = []
        self.did_includes = []
        self.prop_groups = {}
        self.prop_group_keys = []

    def prop_append(self, prop_info: PropertyInfo):
        self.props.append(prop_info)

        obj_name = f'{prop_info.prop_domain}_{prop_info.prop_group}'

        if obj_name in self.prop_groups:
            self.prop_groups[obj_name] = self.prop_groups[obj_name] + 1
        else:
            self.prop_groups[obj_name] = 1
            self.prop_group_keys.append(obj_name)

        if prop_info.prop_did_struct != '':
            while prop_info.prop_did_struct not in self.did_structs:
                self.did_structs.append(prop_info.prop_did_struct)

        if prop_info.prop_did_include != '':
            while prop_info.prop_did_include not in self.did_includes:
                self.did_includes.append(prop_info.prop_did_include)

        self.prop_num = self.prop_num + 1
        return

    def prop_latest(self, date, comment:str):
        if hasattr(date, 'strftime'):
            self.latest_change_date = date.strftime('%Y/%m/%d')
        elif isinstance(date, (int, float)):
            from datetime import timedelta
            dt = datetime.datetime(1899, 12, 30) + timedelta(days=int(date))
            self.latest_change_date = dt.strftime('%Y/%m/%d')
        else:
            self.latest_change_date = str(date)
        self.latest_change_comment = comment.replace("\n","\n      ")
        return

    def prop_gen_time(self, time_s: str):
        self.gen_time = time_s
        return

class PropertyGenerator:
    BUILD_DIR = '.build'

    def __init__(self, template_path=None, output_dir='output') -> None:
        self.proc_list = []
        self.pps_list = []
        self.latest_change_date = ''
        self.latest_change_comment = ''
        self.project = []
        self._template_path = template_path
        self._output_dir = output_dir

    def _make_codegen(self):
        return CodeGenerator('CarPropertyManager',
                             template_path=self._template_path,
                             output_base=self.BUILD_DIR)

    def _build_path(self, *parts):
        return os.path.join(self.BUILD_DIR, 'CarPropertyManager', *parts)

    def _move_to_output(self, build_file, proj, output_name):
        variant_name = proj.lstrip('_') if proj else 'base'
        variant_dir = os.path.join(self._output_dir, variant_name)
        os.makedirs(variant_dir, exist_ok=True)
        shutil.move(build_file, os.path.join(variant_dir, output_name))

    def prop_process(self, path: str):

        cur_time = datetime.datetime.now()
        formatted_time_str = cur_time.strftime('GEN_%Y_%m_%d_%H%M%S')

        self.proc_list.clear()
        self.pps_list.clear()
        self.project.clear()
        self.latest_change_date = ''
        self.latest_change_comment = ''
        self.project.append('')

        excel = ExcelOperation(path)

        sheet_name_list = excel.get_sheet_name_list()

        ignore_sheet = ['ChangeMode', 'ValueType', 'Domain', 'Readme']

        for one_sheet_name in sheet_name_list:
            if ignore_sheet.count(one_sheet_name) == 0:
                list_row_signal = PROP_EXCEL_SHEET_ROW_TITLE + 1

                if 'ChangeHistory' == one_sheet_name:
                    while excel[one_sheet_name][list_row_signal][PROP_EXCEL_SHEET_HISTORY_DATE].get_value():
                        list_row_signal = list_row_signal + 1

                    self.latest_change_date = excel[one_sheet_name][list_row_signal-1][PROP_EXCEL_SHEET_HISTORY_DATE].get_value()
                    self.latest_change_comment = excel[one_sheet_name][list_row_signal-1][PROP_EXCEL_SHEET_HISTORY_COMMENT].get_value()

                    continue

                if 'statistic' == one_sheet_name:

                    list_row_process = 1

                    while True:
                        list_col_pps = 5

                        full_name_tmp = excel[one_sheet_name][list_row_process][PROP_EXCEL_SHEET_STATIC_COL_FULL_NAME].get_value()
                        short_name_tmp = excel[one_sheet_name][list_row_process][PROP_EXCEL_SHEET_STATIC_COL_SHORT_NAME].get_value()
                        if not full_name_tmp:
                            break

                        short_host = excel[one_sheet_name][list_row_process][PROP_EXCEL_SHEET_STATIC_COL_HOST].get_value()

                        new_process = Process(full_name_tmp, short_name_tmp, short_host)

                        while True:

                            pps_name = excel[one_sheet_name][0][list_col_pps].get_value()
                            if not pps_name:
                                break

                            pps_enable = excel[one_sheet_name][list_row_process][list_col_pps].get_value()
                            if pps_enable == 1:
                                new_pps_proc = PPSObject(pps_name)
                                new_process.pps_append(new_pps_proc)

                            list_col_pps = list_col_pps + 1

                        self.proc_list.append(new_process)
                        list_row_process = list_row_process + 1

                    continue

                # property sheet == PPSObject
                new_pps = PPSObject(one_sheet_name)

                prop_keys = one_sheet_name.split('.')
                prop_domain = prop_keys[0]
                prop_group = prop_keys[1]

                while True:
                    prop_name_tmp = excel[one_sheet_name][list_row_signal][PROP_EXCEL_SHEET_COL_NAME].get_value()
                    if not prop_name_tmp:
                        break

                    prop_name = str(prop_name_tmp).rstrip().strip()

                    if not _RE_VALID_SIGNAL_NAME.match(prop_name):
                        print(f'\033[33m  ⚠ 跳过无效信号名 [{one_sheet_name}] 行{list_row_signal + 1}: '
                              f'"{prop_name[:60]}{"..." if len(prop_name) > 60 else ""}"\033[0m')
                        list_row_signal += 1
                        continue

                    prop_op =  self.get_op_type(excel[one_sheet_name][list_row_signal][PROP_EXCEL_SHEET_COL_OP].get_value())
                    prop_nty = self.get_nty_type(excel[one_sheet_name][list_row_signal][PROP_EXCEL_SHEET_COL_NOTIFY].get_value())

                    prop_intv = excel[one_sheet_name][list_row_signal][PROP_EXCEL_SHEET_COL_INTERVAL].get_value()
                    if not prop_intv:
                        prop_intv = 0

                    prop_val_type = self.get_val_type(excel[one_sheet_name][list_row_signal][PROP_EXCEL_SHEET_COL_VAL_TYPE].get_value())

                    prop_val_default = excel[one_sheet_name][list_row_signal][PROP_EXCEL_SHEET_COL_VAL_DEFAULT].get_value()
                    if not prop_val_default:
                        prop_val_default = 0

                    prop_val_len = 0
                    prop_module_name = ''
                    if 'psis.usr_cfg' == one_sheet_name:
                        prop_val_len = excel[one_sheet_name][list_row_signal][PROP_EXCEL_SHEET_COL_VAL_LEN].get_value()
                        prop_module_name = excel[one_sheet_name][list_row_signal][PROP_EXCEL_SHEET_COL_MODULE_NAME].get_value()

                    mcu_tx_cmd_id = 0
                    if 'custom.mcu' == one_sheet_name and prop_op == OpType.CAR_PROPERTY_RW.name:
                        mcu_tx_cmd_id = excel[one_sheet_name][list_row_signal][PROP_EXCEL_SHEET_COL_SCC_CMD].get_value()

                    prop_did_struct = ''
                    prop_did_prop_name = ''
                    prop_did_include = ''
                    if 'psis.car_cfg' in one_sheet_name :
                        match = re.search(r'psis\.car_cfg\.(.*)', one_sheet_name)
                        if match:
                            if ('_'+match.group(1)) not in self.project:
                                self.project.append('_'+match.group(1))
                        prop_did_struct = excel[one_sheet_name][list_row_signal][
                            PROP_EXCEL_SHEET_COL_DID_STRUCT].get_value()
                        prop_did_prop_name = excel[one_sheet_name][list_row_signal][
                            PROP_EXCEL_SHEET_COL_DID_PROP_NAME].get_value()
                        prop_did_include = excel[one_sheet_name][list_row_signal][
                            PROP_EXCEL_SHEET_COL_DID_INCLUDE].get_value()

                    new_prop = PropertyInfo(prop_op, prop_nty, prop_intv, prop_val_type, prop_val_default,
                                            prop_domain, prop_group, prop_name,
                                            prop_val_len, prop_did_struct, prop_did_prop_name, prop_did_include,
                                            prop_module_name, mcu_tx_cmd_id)

                    new_pps.prop_append(new_prop)
                    list_row_signal = list_row_signal + 1

                if new_pps.prop_cnt > 0:
                    self.pps_list.append(new_pps)

        excel.close()

        # clean build & output
        build_path = os.path.join(self.BUILD_DIR, 'CarPropertyManager')
        if os.path.exists(build_path):
            shutil.rmtree(build_path)
        if os.path.exists(self._output_dir):
            shutil.rmtree(self._output_dir)
        os.makedirs(self._output_dir, exist_ok=True)

        # collect process -> car_property_cfg
        for proj in self.project:
            car_name = ''
            result = '_'.join(proj.split('_')[1:])
            if result:
                car_name = '.'+result
            for proc in self.proc_list:
                rules_proc = PropertyRules()
                rules_proc.prop_host = proc.b_host

                for proc_pps in proc.pps_obj_list:
                    if proc_pps.name == 'psis.car_cfg':
                        for one_pps in self.pps_list:
                            if one_pps.name == 'psis.car_cfg'+car_name:
                                for prop in one_pps.prop_list:
                                    rules_proc.prop_append(prop)
                                break
                    else:
                        for one_pps in self.pps_list:
                            if one_pps.name == proc_pps.name:
                                for prop in one_pps.prop_list:
                                    rules_proc.prop_append(prop)
                                break

                rules_proc.prop_latest( self.latest_change_date, self.latest_change_comment)
                rules_proc.prop_gen_time(formatted_time_str)

                codegen = self._make_codegen()
                codegen.rules_save(rules_proc)
                codegen.generator('soc/car_property_cfg.h', desc='Property config code generate')

                self._move_to_output(
                    self._build_path('soc', 'car_property_cfg.h'),
                    proj,
                    f'{proc.s_name}_property_cfg.h'
                )

        # psis -> psis_property_cfg
        # -----------------------------------------------------------------------------------------
        psis_node = ['psis.car_cfg', 'psis.usr_cfg']
        for projtemp in self.project:
            result = '_'.join(projtemp.split('_')[1:])
            if result:
                psis_node.append('psis.car_cfg'+'.'+result)

        for proj in self.project:
            rules_psis = PropertyRules()
            psis_name = ''
            result = '_'.join(proj.split('_')[1:])
            if result:
                psis_name = '.'+result
            for one_pps in self.pps_list:
                if (one_pps.name == 'psis.car_cfg'+psis_name or one_pps.name == 'psis.usr_cfg') and psis_node.count(one_pps.name) > 0:
                    for prop in one_pps.prop_list:
                        rules_psis.prop_append(prop)

            rules_psis.prop_latest( self.latest_change_date, self.latest_change_comment)
            rules_psis.prop_gen_time(formatted_time_str)

            codegen = self._make_codegen()
            codegen.rules_save(rules_psis)
            codegen.generator('soc/psis_property_cfg.h', desc='PSIS config code generate')

            self._move_to_output(
                self._build_path('soc', 'psis_property_cfg.h'),
                proj,
                'psis_property_cfg.h'
            )

        # buffer len -> property_object_cfg
        # -----------------------------------------------------------------------------------------
        for proj in self.project:
            obj_name = ''
            result = '_'.join(proj.split('_')[1:])
            if result:
                obj_name = '.'+result
            rules_len = PropertyRules()
            for one_pps in self.pps_list:
                if one_pps.name.startswith('psis.car_cfg'):
                    if one_pps.name == 'psis.car_cfg'+obj_name:
                        for prop in one_pps.prop_list:
                            rules_len.prop_append(prop)
                else:
                    for prop in one_pps.prop_list:
                        rules_len.prop_append(prop)

            rules_len.prop_latest( self.latest_change_date, self.latest_change_comment)
            rules_len.prop_gen_time(formatted_time_str)

            codegen = self._make_codegen()
            codegen.rules_save(rules_len)
            codegen.generator('soc/property_object_cfg.h', desc='object config code generate')

            self._move_to_output(
                self._build_path('soc', 'property_object_cfg.h'),
                proj,
                'property_object_cfg.h'
            )

        # SCCCOM -> scccom_tx_config (暂不生成)
        # -----------------------------------------------------------------------------------------
        # scc_node = ['custom.mcu']
        # for proj in self.project:
        #     rules_scc = PropertyRules()
        #     for one_pps in self.pps_list:
        #         if scc_node.count(one_pps.name) > 0:
        #             for prop in one_pps.prop_list:
        #                 rules_scc.prop_append(prop)
        #
        #     rules_scc.prop_latest( self.latest_change_date, self.latest_change_comment)
        #     rules_scc.prop_gen_time(formatted_time_str)
        #
        #     codegen = self._make_codegen()
        #     codegen.rules_save(rules_scc)
        #     codegen.generator('soc/scccom_tx_config.h', desc='scc tx config code generate')
        #
        #     self._move_to_output(
        #         self._build_path('soc', 'scccom_tx_config.h'),
        #         proj,
        #         'scccom_tx_config.h'
        #     )

        # convert line endings
        PropertyGenerator.convert_directory_to_unix(self._output_dir)

        # clean build intermediate
        build_path = os.path.join(self.BUILD_DIR, 'CarPropertyManager')
        if os.path.exists(build_path):
            shutil.rmtree(build_path)
        return

    @staticmethod
    def convert_file_to_unix(file_path):
        try:
            with open(file_path, 'rb') as f:
                content = f.read()

            content = content.replace(b'\r\n', b'\n')

            with open(file_path, 'wb') as f:
                f.write(content)

            print(f"已转换: {file_path}")
        except Exception as e:
            print(f"转换失败 {file_path}: {e}")

    @staticmethod
    def convert_directory_to_unix(directory_path):
        for root, dirs, files in os.walk(directory_path):
            for file in files:
                file_path = os.path.join(root, file)
                PropertyGenerator.convert_file_to_unix(file_path)

    def get_op_type(self,op_name) -> str:
        op_type_map = {
            ('read'): OpType.CAR_PROPERTY_R.name,
            ('read&write'): OpType.CAR_PROPERTY_RW.name,
            None: OpType.CAR_PROPERTY_R.name
        }

        key = (op_name)
        return op_type_map.get(key, op_type_map[None])

    def get_nty_type(self,nty_name) -> str:
        nty_type_map = {
            ('OnEvent'): NtyType.CAR_PROPERTY_NOTIFY_EVENT.name,
            ('OnChange'): NtyType.CAR_PROPERTY_NOTIFY_ONCHANGED.name,
            ('ContinuousOnChange'): NtyType.CAR_PROPERTY_NOTIFY_CONTINUOUS_ONCHANGED.name,
            None: NtyType.CAR_PROPERTY_NOTIFY_ONCHANGED.name
        }

        key = (nty_name)
        return nty_type_map.get(key, nty_type_map[None])

    def get_val_type(self,type_name) -> str:
        val_type_map = {
            ('int32'): ValType.CAR_PROPERTY_INT32.name,
            ('uint32'): ValType.CAR_PROPERTY_UINT32.name,
            ('int64'): ValType.CAR_PROPERTY_INT64.name,
            ('uint64'): ValType.CAR_PROPERTY_UINT64.name,
            ('float'): ValType.CAR_PROPERTY_FLOAT.name,
            ('string'): ValType.CAR_PROPERTY_STRING.name,
            ('bytes'): ValType.CAR_PROPERTY_BYTES.name,
            ('array'): ValType.CAR_PROPERTY_ARRAY.name,
            ('map'): ValType.CAR_PROPERTY_MAP.name,
            None: ValType.CAR_PROPERTY_INT32.name
        }

        key = (type_name)
        return val_type_map.get(key, val_type_map[None])
