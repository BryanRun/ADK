/*    Copyright(C) 2024 Autolink Information Technology Co.Ltd. All rights reserved.   */
/*                                                                                     */
/*                         The file is automatically generated.                        */
/*                      !!!!!! Manual changes are prohibited !!!!!                     */
/*                                                                                     */
/* latest change:                                                                      */
/*
      2026/04/14

      vehicle.rx 根据最新DBC修改105行及125行的信号名称为：ParkLamp_264h_264，FltLamp_264h_264
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
    { "psis_car_cfg", { 229 }},
    { "psis_usr_cfg", { 21 }},
    { "adas_rx", { 51 }},
    { "ivi_rx", { 31 }},
    { "ivi_tx", { 22 }},
    { "vehicle_rx", { 218 }},
    { "vehicle_tx", { 1 }},
    { "custom_warning", { 20 }},
    { "custom_telltale", { 72 }},
    { "custom_hmi", { 7 }},
    { "custom_power", { 7 }},
    { "custom_mcu", { 25 }},
    { "custom_drivinginfo", { 32 }},
    { "custom_dms", { 4 }},
    { "custom_hardkey", { 5 }},
};

}  // namespace CM
}  // namespace Frameworks
}  // namespace AutoLink

#endif