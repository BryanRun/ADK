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

#ifndef APPFW_CM_CAR_PROPERTY_CFG_H
#define APPFW_CM_CAR_PROPERTY_CFG_H

#include "impl/common/car_property_def.h"

namespace AutoLink {
namespace Frameworks {
namespace CM {

const char* CAR_PROPERTY_CFG_GEN_TIME = "GEN_2026_04_15_143954";

const bool ProcessHost = 0;

const uint32_t ConfigNum = 31;

const CarPropertyConfig gCarProperyConfigArray[ConfigNum] = {
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_INT32, "0", "psis", "usr_cfg", "USR_LANGUAGE_SETTING" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_INT32, "0", "psis", "usr_cfg", "USR_DAYNIGHT_MODE" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_BYTES, "0", "psis", "usr_cfg", "USR_EXTERNAL_APP_ACTIVE_CODE" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_INT32, "0", "psis", "usr_cfg", "USR_BATTERY_LEVEL_UNIT" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_INT32, "0", "psis", "usr_cfg", "USR_TIME_FORMAT" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_INT32, "1", "psis", "usr_cfg", "USR_HUD_BSD_SWITCH" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_INT32, "1", "psis", "usr_cfg", "USR_HUD_SWITCH" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_INT32, "5", "psis", "usr_cfg", "USR_HUD_HEIADJ" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_INT32, "5", "psis", "usr_cfg", "USR_HUD_ILLADJ" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_INT32, "1", "psis", "usr_cfg", "USR_HUD_MODSWT" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_INT32, "1", "psis", "usr_cfg", "USR_HUD_SNOWMODESWTSTS" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_INT32, "0", "psis", "usr_cfg", "USR_HUD_CRTLANGUAGE" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_INT32, "2", "psis", "usr_cfg", "USR_HMI_PAGEINDEX" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_INT32, "0", "psis", "usr_cfg", "USR_DISTANCE_SPEED_UNIT_SWITCH" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_INT32, "1", "psis", "usr_cfg", "USR_WARN_VOLUME_LEVEL" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_BYTES, "0", "psis", "usr_cfg", "USR_DISPLAY_BRIGHTNESS_LEVEL" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_INT32, "0", "psis", "usr_cfg", "USR_ADAS_SWITCH" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_INT32, "1", "psis", "usr_cfg", "USR_SEC_THI_FASTEN_SWITCH" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_INT32, "1", "psis", "usr_cfg", "USR_STARTUP_SOUND_SWITCH" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_INT32, "1", "psis", "usr_cfg", "USR_ADAS_SWITCH_AVAIL" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_INT32, "0", "psis", "usr_cfg", "USR_ADAS_SWITCH_TMP" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_INT32, "0", "psis", "usr_cfg", "USR_3DCHIME_TURN_STS" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_INT32, "0", "psis", "usr_cfg", "USR_3DCHIME_PARKING_STS" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_INT32, "0", "psis", "usr_cfg", "USR_3DCHIME_BLIND_STS" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_INT32, "1", "psis", "usr_cfg", "USR_SLIDING_DOOR_CHIME_SWITCH" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_INT32, "0", "psis", "usr_cfg", "USR_DMS_FACEID_REGISTERED_BITS" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_INT32, "1", "psis", "usr_cfg", "USR_VEHICLE_LOCK_SOUND" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_INT32, "0", "psis", "usr_cfg", "USR_ESE_SWITCH" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_INT32, "22", "psis", "usr_cfg", "USR_ESE_VOLUME_LEVEL" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_INT32, "0", "psis", "usr_cfg", "USR_ESE_MODE" },
    { CAR_PROPERTY_RW, CAR_PROPERTY_NOTIFY_ONCHANGED, 0, CAR_PROPERTY_INT32, "0", "psis", "usr_cfg", "USR_AVAS_STATUS" },
};

} // namespace CM
} // namespace Frameworks
} // namespace AutoLink

#endif