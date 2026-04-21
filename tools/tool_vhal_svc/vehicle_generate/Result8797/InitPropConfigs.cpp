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
            {.config ={
                .prop = static_cast<int32_t>(VendorVehicleProperty::PLGM_TRSWTSTSINDCN_391),
                .access = VehiclePropertyAccess::READ,
                .changeMode = VehiclePropertyChangeMode::ON_CHANGE,
                .areaConfigs = {{.areaId = 0x0000}},
            },
            .initialValue = {.int32Values = {0}}},
            {.config ={
                .prop = static_cast<int32_t>(VendorVehicleProperty::S_IDCP_STAMPH_ST_1A0),
                .access = VehiclePropertyAccess::WRITE,
                .changeMode = VehiclePropertyChangeMode::ON_CHANGE,
                .areaConfigs = {{.areaId = 0x0000}},
            },
            .initialValue = {.int32Values = {0}}},
            {.config ={
                .prop = static_cast<int32_t>(VendorVehicleProperty::S_IDCP_STAMPL_ST_1A0),
                .access = VehiclePropertyAccess::WRITE,
                .changeMode = VehiclePropertyChangeMode::ON_CHANGE,
                .areaConfigs = {{.areaId = 0x0000}},
            },
            .initialValue = {.int32Values = {0}}},
            {.config ={
                .prop = static_cast<int32_t>(VendorVehicleProperty::S_IDCP_FRWDWCTL_REQ_330),
                .access = VehiclePropertyAccess::WRITE,
                .changeMode = VehiclePropertyChangeMode::ON_CHANGE,
                .areaConfigs = {{.areaId = 0x0000}},
            },
            .initialValue = {.int32Values = {0}}},
            {.config ={
                .prop = static_cast<int32_t>(VendorVehicleProperty::S_IDCP_RRWDWCTL_REQ_330),
                .access = VehiclePropertyAccess::WRITE,
                .changeMode = VehiclePropertyChangeMode::ON_CHANGE,
                .areaConfigs = {{.areaId = 0x0000}},
            },
            .initialValue = {.int32Values = {0}}},
            {.config ={
                .prop = static_cast<int32_t>(VendorVehicleProperty::IDCU_ALM_RED_28),
                .access = VehiclePropertyAccess::WRITE,
                .changeMode = VehiclePropertyChangeMode::ON_CHANGE,
                .areaConfigs = {{.areaId = 0x0000}},
            },
            .initialValue = {.int32Values = {0}}},
            {.config ={
                .prop = static_cast<int32_t>(VendorVehicleProperty::IDCU_ALM_GREEN_28),
                .access = VehiclePropertyAccess::WRITE,
                .changeMode = VehiclePropertyChangeMode::ON_CHANGE,
                .areaConfigs = {{.areaId = 0x0000}},
            },
            .initialValue = {.int32Values = {0}}},
            {.config ={
                .prop = static_cast<int32_t>(VendorVehicleProperty::IDCU_ALM_BLUE_28),
                .access = VehiclePropertyAccess::WRITE,
                .changeMode = VehiclePropertyChangeMode::ON_CHANGE,
                .areaConfigs = {{.areaId = 0x0000}},
            },
            .initialValue = {.int32Values = {0}}},
            {.config ={
                .prop = static_cast<int32_t>(VendorVehicleProperty::IDCU_ALM_TARGETTRANSITIONTIME_28),
                .access = VehiclePropertyAccess::WRITE,
                .changeMode = VehiclePropertyChangeMode::ON_CHANGE,
                .areaConfigs = {{.areaId = 0x0000}},
            },
            .initialValue = {.int32Values = {0}}},
            {.config ={
                .prop = static_cast<int32_t>(VendorVehicleProperty::IDCU_ALM_FUNCTION_28),
                .access = VehiclePropertyAccess::WRITE,
                .changeMode = VehiclePropertyChangeMode::ON_CHANGE,
                .areaConfigs = {{.areaId = 0x0000}},
            },
            .initialValue = {.int32Values = {0}}},
            {.config ={
                .prop = static_cast<int32_t>(VendorVehicleProperty::IDCU_ALM_MODE_28),
                .access = VehiclePropertyAccess::WRITE,
                .changeMode = VehiclePropertyChangeMode::ON_CHANGE,
                .areaConfigs = {{.areaId = 0x0000}},
            },
            .initialValue = {.int32Values = {0}}},
            {.config ={
                .prop = static_cast<int32_t>(VendorVehicleProperty::IDCU_ALM_TRIGGER_28),
                .access = VehiclePropertyAccess::WRITE,
                .changeMode = VehiclePropertyChangeMode::ON_CHANGE,
                .areaConfigs = {{.areaId = 0x0000}},
            },
            .initialValue = {.int32Values = {0}}},
            {.config ={
                .prop = static_cast<int32_t>(VendorVehicleProperty::IDCU_ALM_INTENSITY_28),
                .access = VehiclePropertyAccess::WRITE,
                .changeMode = VehiclePropertyChangeMode::ON_CHANGE,
                .areaConfigs = {{.areaId = 0x0000}},
            },
            .initialValue = {.int32Values = {0}}},

        };
        ALOGD("PropertyConfigManager init propConfis: %lu done", m_propConfigs.size());
    };
}
} // namespace autolink