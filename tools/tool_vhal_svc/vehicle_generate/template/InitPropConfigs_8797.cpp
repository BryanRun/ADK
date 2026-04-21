/******************************************************************************
/                              Copyright
/------------------------------------------------------------------------------
*******************************************************************************/

/**
 * @file InitPropConfigs.cpp
 * @brief Declaration PropertyConfigManager::initPropConfigs
 */

#include <vhal_v2_0/VehicleHalClient.h>

using android::hardware::automotive::vehicle::V2_0::VehicleProperty;
using android::hardware::automotive::vehicle::V2_0::VehiclePropertyAccess;
using android::hardware::automotive::vehicle::V2_0::VehiclePropertyChangeMode;

namespace autolink {

void vehicle::V2_0::impl::VehicleHalClient::initPropConfigs() {
    {
        m_propConfigs = {
            {.config ={
                .prop = static_cast<int32_t>(VehicleProperty::VHAL_HEARTBEAT),
                .access = VehiclePropertyAccess::READ,
                .changeMode = VehiclePropertyChangeMode::ON_CHANGE,
                .areaConfigs = {{.areaId = 0x0000}},
            },
            .initialValue = {.int32Values = {0}}},
%(g_android_propConfig_list)s
        };
        ALOGD("PropertyConfigManager init propConfis: %%lu done", m_propConfigs.size());
    };
}
} // namespace autolink