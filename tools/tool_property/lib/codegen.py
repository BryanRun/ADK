"""
jinja2 module -> template files + .json = object file
"""
import os
import jinja2
import json
import datetime
from typing import Callable
from lib import utils
__version__ = '1.0.0'


class JsonEncoder(json.JSONEncoder):
    """json序列化编码器"""
    def default(self, obj):
        return obj.__dict__    

class JsonDecoder:
    """json反序列化解码器——闭包"""
    def __init__(self, cls_obj) -> None:
        self._cls_obj = cls_obj

    def __call__(self, d):
        if not d: return None
        return self._to_object(d)

    def _to_object(self, d):
        """遇到字典类型后递归处理"""
        args = {}
        for key, value in d.items():
            if isinstance(value, dict):
                args[key] = self._to_object(value)
            elif isinstance(value, list):
                args[key] = [self._to_object(item) if isinstance(item, dict) else item for item in value]
            else:
                args[key] = value
        instance = self._cls_obj.__new__(self._cls_obj)
        instance.__dict__.update(args)
        return instance

class CodeGenerator:
    """代码生成器

    attr:
        _module_name: 模块名称，用于映射规则文件、模板文件和输出文件的路径
        _rules: 规则字典内容，可以是常规字典类型，或者自定义类的实例，取决于rules_load调用时传参cls_rules_obj是否为空
        _rules_name: 规则名称，即存放规则信息的文件名称不带后缀，默认等于_module_name
    """
    CG_E_OK = 0
    CG_E_GEN_FAIL = 1
    CG_E_RULE_IS_NONE = 2
    CG_E_RULE_VERSION_MISMATCH = 3
    CG_E_JSON_DECODE_FAIL = 4
    CG_E_TEMPLATE_FILE_NOT_EXIST = 5

    codegen_sts = int

    def __init__(self, module_name, template_path:str=None, output_base:str=None, progress_bar:Callable[[str, int], None]=None) -> None:
        self._module_name = module_name
        self._template_path = template_path
        self._output_base = output_base or os.path.join("output", "components")
        self._rules = None
        self._rules_name = self._module_name
        self._progress_bar = progress_bar

    def path_rules(self) -> str:
        return os.path.join(self._output_base, self._module_name, "rules")

    def path_template(self) -> str:
        if self._template_path is None:
            return os.path.join(utils.project_path("project"), "configure", self._module_name, "templates")
        else:
            return self._template_path

    def path_output(self) -> str:
        return os.path.join(self._output_base, self._module_name)
    
    def rules_default_name(self) -> str: return self._module_name

    def rules_load(self, rule_name : str = None, cls_rules_obj : any = None) -> list:
        """规则信息加载
        
        Args:
            rule_name: 规则名称，不为空则覆盖_rules_name
            cls_rules_obj: 自定义类名称，用于反序列化，根据加载的配置文件，改变该类的成员属性
        
        Returns:
            列表
            [codegen_sts, rules]
            codegen_sts:
            CG_E_OK: 成功
            CG_E_RULE_VERSION_MISMATCH: 版本不匹配
            rules: 字典、或者json反序列化后改造出的类的实例化对象
        """
        status = CodeGenerator.CG_E_OK
        self._rules = None if cls_rules_obj else {}
        if rule_name:
            rules_file = os.path.join(self.path_rules(), rule_name + '.json')
            self._rules_name = rule_name
        else:
            rules_file = os.path.join(self.path_rules(), self._module_name + '.json')
        if os.path.isfile(rules_file):
            with open(rules_file, 'r', encoding = 'utf-8') as f:
                if cls_rules_obj:
                    try:
                        data = json.load(f)
                    except json.decoder.JSONDecodeError:
                        return [CodeGenerator.CG_E_JSON_DECODE_FAIL, self._rules]

                    if hasattr(cls_rules_obj, '_version'):
                        if 'version' in data and data['version'] == cls_rules_obj._version:
                            self._rules = JsonDecoder(cls_rules_obj)(data['rules'])
                        else:
                            status = CodeGenerator.CG_E_RULE_VERSION_MISMATCH
                    else:
                        self._rules = JsonDecoder(cls_rules_obj)(data['rules'])
                else:
                    self._rules = json.load(f)['rules']
        return [status, self._rules]

    def rules_save(self, rules : any = None, rules_name : str = None) -> None:
        """规则信息保存rules_name对应的规则文件中
        
        Args:
            rules: 规则信息，不为空则覆盖成员_rules
            rules_name: 规则名称，不为空则覆盖_rules_name
        """
        out = {}
        if hasattr(rules, '_version'):
            out['version'] = rules._version
        if rules:
            self._rules = rules
        out['rules'] = self._rules

        if rules_name:
            self._rules_name = rules_name
        if self._rules_name:
            path = os.path.join(self.path_rules(), self._rules_name + '.json')
        else:
            path = os.path.join(self.path_rules(), self._module_name + '.json')

        os.makedirs(os.path.dirname(path), exist_ok = True)
        with open(path, 'w', encoding = 'utf-8') as f:
            f.write(json.dumps(out, cls=JsonEncoder, indent = 4, ensure_ascii = False))

    def generator_by_path(self, abs_path : str = '') -> codegen_sts:
        if not self._rules: return CodeGenerator.CG_E_RULE_IS_NONE
        if not os.path.exists(os.path.join(self.path_template(), abs_path)): return CodeGenerator.CG_E_TEMPLATE_FILE_NOT_EXIST
        all_files:list[str] = []
        for root, _, files in os.walk(os.path.join(self.path_template(), abs_path)):
            path = root[len(self.path_template()) + 1:]
            for file_name in files:
                all_files.append(os.path.join(path, file_name))
        total_file_num = len(all_files)
        for no, file_path in enumerate(all_files):
            if self._progress_bar:
                self._progress_bar(file_path, no * 100//total_file_num)
            self.generator(file_path)
        if self._progress_bar:
            self._progress_bar("", 100)

    def generator(self, template_name : str, desc : str = '') -> codegen_sts:
        """代码生成
        Args:
            template_name: 模板名称，同规则名称一样，不带后缀。基于默认路径和模板名称查找实际的模板文件
        Returns:
            状态码
            CG_E_OK: 成功
            CG_E_RULE_IS_NONE: 规则信息为空
        """
        if not self._rules: return CodeGenerator.CG_E_RULE_IS_NONE
        if not os.path.exists(os.path.join(self.path_template(), template_name)): return CodeGenerator.CG_E_TEMPLATE_FILE_NOT_EXIST
        env = jinja2.Environment(loader = jinja2.FileSystemLoader(os.path.join(self.path_template())))
        template_name = template_name.replace('\\', '/')
        template = env.get_template(template_name)
        rules = json.loads(json.dumps(self._rules, cls=JsonEncoder, indent = 4, ensure_ascii = False))

        content_out = template.render(rules,
                                _description = desc,
                                _file_name = template_name,
                                _date_time = datetime.datetime.now().strftime("%Y-%m-%d %H:%M:%S"),
                                _year = datetime.datetime.now().strftime("%Y") + '\n',
                                _version = rules._version if hasattr(rules, '_version') else 'undefined')

        out_file = os.path.join(self.path_output(), template_name)
        os.makedirs(os.path.dirname(out_file), exist_ok = True)
        with open(out_file, 'w', encoding = 'utf-8') as f:
            f.writelines(content_out)

        return CodeGenerator.CG_E_OK
