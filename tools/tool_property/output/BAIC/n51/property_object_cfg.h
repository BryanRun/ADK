/*    Copyright(C) 2024 Autolink Information Technology Co.Ltd. All rights reserved.   */
/*                                                                                     */
/*                         The file is automatically generated.                        */
/*                      !!!!!! Manual changes are prohibited !!!!!                     */
/*                                                                                     */
/* latest change:                                                                      */
/*
      2026/04/10

      【custom.mcu】更新 TOTDTE_VALUE 备注
*/

#ifndef APPFW_CM_PROPERTY_OBJECT_CFG_H
#define APPFW_CM_PROPERTY_OBJECT_CFG_H

#include <stdint.h>
#include <string.h>

#include <unordered_map>


namespace AutoLink {
namespace Frameworks {
namespace CM {

typedef struct PropertyObjectConfig {
    uint32_t dataCounter;  // 数据条数统计
} PropertyObjectConfig_;

const std::unordered_map<std::string, PropertyObjectConfig> gPropObjectCfgMap = {
    { "adas_rx", { 42 }},
    { "custom_drivinginfo", { 63 }},
    { "custom_warning", { 26 }},
    { "custom_telltale", { 97 }},
    { "custom_hmi", { 9 }},
    { "custom_mcu", { 31 }},
    { "custom_power", { 13 }},
    { "custom_hardkey", { 1 }},
    { "psis_car_cfg", { 86 }},
    { "vehicle_rx", { 253 }},
    { "vehicle_n8_rx", { 201 }},
    { "psis_usr_cfg", { 31 }},
    { "ivi_rx", { 67 }},
    { "ivi_tx", { 48 }},
    { "vehicle_tx", { 9 }},
    { "custom_dms", { 5 }},
};

}  // namespace CM
}  // namespace Frameworks
}  // namespace AutoLink

#endif