/******************************************************************************
/                              Copyright
/------------------------------------------------------------------------------
*******************************************************************************/
#include "VehiclePropertyConfigManager.h"
#include "VehicleDefine.h"
#include "types.h"
#include "Loging.h"

namespace vehicleservice
{
    void VehiclePropertyConfigManager::initVehiclePropConfig()
    {
        ViClientPropConfigs configs_QNX;
        ViClientPropConfigs configs_Android;
        ViClientPropConfigs configs_ALL;

        %(g_initPropConfig_list)s
        m_PropConfigs.insert(std::map<int, ViClientPropConfigs>::value_type(toInt(EViMessageId::OS_QNX),configs_QNX));
        m_PropConfigs.insert(std::map<int, ViClientPropConfigs>::value_type(toInt(EViMessageId::OS_ANDROID),configs_Android));
        m_PropConfigs.insert(std::map<int, ViClientPropConfigs>::value_type(toInt(EViMessageId::OS_ALL),configs_ALL));
        LogDebug("Vehicle PropConfig(%(version)s) init successfully\\n");
    }
}