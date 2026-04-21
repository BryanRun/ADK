vehicle_generate_tool_QA_Special
1. initialValue在表中定义的是十进制
2. PropID Value在单独sheet中

vehicle_generate_tool_QA
生成Signal_New.h文件时，对应表中相同PropID，不同PropName的，定义两宏，比如：
TRCMDSUBITEMREQ                                              =0x3254,
TRCMDSUBITEMREQ_UI                                           =0x3254,

生成InitVehiclePropValue_New文件时，对应PropID相同，PropName不同，一个上行，一个下行的信号，生成的代码中用上行信号PropName
// PRO_TRCMDSUBITEMREQ
propVal818.set_propid(PRO_TRCMDSUBITEMREQ);
m_Properties.insert(std::map<int32_t, VehicleProperty>::value_type(PRO_TRCMDSUBITEMREQ, vehicleProp818));

生成InitVehiclePropConfig_New文件时，对应PropID相同，PropName不同，一个上行，一个下行的信号，生成的代码中用信号名是第一次出现的，用哪个都行
// PRO_TRCMDSUBITEMREQ_UI
propConfig1155.set_propid(PRO_TRCMDSUBITEMREQ_UI);
propConfig1155.set_access(Access::READ_WRITE);

对于Android侧相同PropID，不同PropName的信号,会影响types.hal和config代码生成
对于types.hal保留property
！！！！！！！！！！！！！对于config将两个合为一个信号变成可读写，按上行信号名来定义！！！！！！
types.hal中会生成两个property
TRCTOQMDSCALNGREQ_UI = (
    0x3257
    | VehiclePropertyGroup:VENDOR
    | VehiclePropertyType:INT32
    | VehicleArea:GLOBAL),
TRCTOQMDSCALNGSTS = (
    0x3257
    | VehiclePropertyGroup:VENDOR
    | VehiclePropertyType:INT32
    | VehicleArea:GLOBAL),

PropConfig中会生成两个propconfig
{
    .prop = static_cast<int32_t>(VendorVehicleProperty::TRCTOQMDSCALNGREQ_UI),
    .access = VehiclePropertyAccess::WRITE,
    .changeMode = VehiclePropertyChangeMode::ON_CHANGE,
},
{
    .prop = static_cast<int32_t>(VendorVehicleProperty::TRCTOQMDSCALNGSTS),
    .access = VehiclePropertyAccess::READ,
    .changeMode = VehiclePropertyChangeMode::ON_CHANGE,
}

检测可读可写时，
bool PropertyConfigManager::checkReadPermission(int32_t prop)
{
    for (auto config : m_propConfigs) {
        if (config.prop == prop) {
            // return config.access & VehiclePropertyAccess::READ;
            if (config.access == VehiclePropertyAccess::READ || config.access == VehiclePropertyAccess::READ_WRITE) {
                return true;
            }
        }
    }
    return false;
}