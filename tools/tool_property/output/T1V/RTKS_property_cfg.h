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

#ifndef APPFW_CM_CAR_PROPERTY_CFG_H
#define APPFW_CM_CAR_PROPERTY_CFG_H

#include "impl/common/car_property_def.h"

namespace AutoLink {
namespace Frameworks {
namespace CM {

const char* CAR_PROPERTY_CFG_GEN_TIME = "GEN_2026_04_14_195605";

const bool ProcessHost = 0;

const uint32_t ConfigNum = 21;

const CarPropertyConfig gCarProperyConfigArray[ConfigNum] = {
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_INT32, "120", "psis", "usr_cfg", "USR_WARN_SPEED" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_INT32, "1", "psis", "usr_cfg", "USR_SOUND_EFFECT" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_INT32, "3", "psis", "usr_cfg", "USR_FATIGUE_DRIVING_TIME" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_INT32, "1", "psis", "usr_cfg", "USR_VOLUME_LEVEL" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_INT32, "0", "psis", "usr_cfg", "USR_TIME_FORMAT" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_INT32, "0", "psis", "usr_cfg", "USR_TIRE_PRESSURE_UNIT" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_INT32, "0", "psis", "usr_cfg", "USR_DAYNIGHT_MODE" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_INT32, "0", "psis", "usr_cfg", "USR_CLTC_OR_WLTC" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_INT32, "2", "psis", "usr_cfg", "USR_HMI_PAGEINDEX" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_INT32, "0", "psis", "usr_cfg", "USR_VPA_GENDER" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_INT32, "0", "psis", "usr_cfg", "USR_BATTERY_LEVEL_UNIT" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_INT32, "1", "psis", "usr_cfg", "USR_AVAS_SWITCH" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_INT32, "1", "psis", "usr_cfg", "USR_AVAS_STATUS" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_BYTES, "0", "psis", "usr_cfg", "USR_DISPLAY_BRIGHTNESS_LEVEL" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_BYTES, "0", "psis", "usr_cfg", "USR_EXTERNAL_APP_ACTIVE_CODE" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_BYTES, "0", "psis", "usr_cfg", "DIAG_USR_SECURITY_CODE" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_BYTES, "0", "psis", "usr_cfg", "DIAG_USR_SECURITY_KEY" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_BYTES, "0", "psis", "usr_cfg", "DIAG_USR_DTC_RECORD_STATUS" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_INT32, "0", "psis", "usr_cfg", "USR_DRIVE_POWER_UNIT" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_INT32, "12", "psis", "usr_cfg", "USR_ANIMATION_VOLUME" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_INT32, "0", "psis", "usr_cfg", "ENG_DIAG_ELECTRONIC_FENCE" },
};

} // namespace CM
} // namespace Frameworks
} // namespace AutoLink

#endif