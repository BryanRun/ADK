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

#ifndef APPFW_CM_PSIS_PROPERTY_CFG_H
#define APPFW_CM_PSIS_PROPERTY_CFG_H

#include <stdint.h>
#include <string.h>

#include <unordered_map>

#include "car_property_value.h"
#include "cfg_cal.h"

namespace AutoLink {
namespace Frameworks {
namespace CM {

typedef struct PsisUsrConfig {
    uint32_t dataLen;  // unit: byte
    const char * moduleName;
} PsisUsrConfig_;

typedef struct PsisCarConfig {
    Did0xf011* PsisDid0xf011Ptr;
} PsisCarConfig_;

const std::unordered_map<std::string, PsisUsrConfig> gPsisUsrPropCfgMap = {
    { "USR_LANGUAGE_SETTING", { 4, "clusterapp_usr" }},
    { "USR_DAYNIGHT_MODE", { 4, "clusterapp_usr" }},
    { "USR_EXTERNAL_APP_ACTIVE_CODE", { 32, "clusterapp_usr" }},
    { "USR_BATTERY_LEVEL_UNIT", { 4, "clusterapp_usr" }},
    { "USR_TIME_FORMAT", { 4, "clusterapp_usr" }},
    { "USR_HUD_BSD_SWITCH", { 4, "clusterapp_usr" }},
    { "USR_HUD_SWITCH", { 4, "clusterapp_usr" }},
    { "USR_HUD_HEIADJ", { 4, "clusterapp_usr" }},
    { "USR_HUD_ILLADJ", { 4, "clusterapp_usr" }},
    { "USR_HUD_MODSWT", { 4, "clusterapp_usr" }},
    { "USR_HUD_SNOWMODESWTSTS", { 4, "clusterapp_usr" }},
    { "USR_HUD_CRTLANGUAGE", { 4, "clusterapp_usr" }},
    { "USR_HMI_PAGEINDEX", { 4, "clusterapp_usr" }},
    { "USR_DISTANCE_SPEED_UNIT_SWITCH", { 4, "clusterapp_usr" }},
    { "USR_WARN_VOLUME_LEVEL", { 4, "clusterapp_usr" }},
    { "USR_DISPLAY_BRIGHTNESS_LEVEL", { 64, "clusterapp_usr" }},
    { "USR_ADAS_SWITCH", { 4, "clusterapp_usr" }},
    { "USR_SEC_THI_FASTEN_SWITCH", { 4, "clusterapp_usr" }},
    { "USR_STARTUP_SOUND_SWITCH", { 4, "clusterapp_usr" }},
    { "USR_ADAS_SWITCH_AVAIL", { 4, "clusterapp_usr" }},
    { "USR_ADAS_SWITCH_TMP", { 4, "clusterapp_usr" }},
    { "USR_3DCHIME_TURN_STS", { 4, "clusterapp_usr" }},
    { "USR_3DCHIME_PARKING_STS", { 4, "clusterapp_usr" }},
    { "USR_3DCHIME_BLIND_STS", { 4, "clusterapp_usr" }},
    { "USR_SLIDING_DOOR_CHIME_SWITCH", { 4, "clusterapp_usr" }},
    { "USR_DMS_FACEID_REGISTERED_BITS", { 4, "clusterapp_usr" }},
    { "USR_VEHICLE_LOCK_SOUND", { 4, "clusterapp_usr" }},
    { "USR_ESE_SWITCH", { 4, "clusterapp_usr" }},
    { "USR_ESE_VOLUME_LEVEL", { 4, "clusterapp_usr" }},
    { "USR_ESE_MODE", { 4, "clusterapp_usr" }},
    { "USR_AVAS_STATUS", { 4, "clusterapp_usr" }},
};

std::unordered_map<std::string, CarPropertyValue> gPsisCarPropCfgMap;

void InitCarCfgMap( const PsisCarConfig& carCfg )
{
    gPsisCarPropCfgMap = {
        {"CAR_CFG_HUD_TYPE", { (carCfg.PsisDid0xf011Ptr)->HUD_TYPE }},
        {"CAR_CFG_AEB", { (carCfg.PsisDid0xf011Ptr)->AEB }},
        {"CAR_CFG_FCW", { (carCfg.PsisDid0xf011Ptr)->FCW }},
        {"CAR_CFG_ACC", { (carCfg.PsisDid0xf011Ptr)->ACC }},
        {"CAR_CFG_ICA", { (carCfg.PsisDid0xf011Ptr)->ICA }},
        {"CAR_CFG_TSR", { (carCfg.PsisDid0xf011Ptr)->TSR }},
        {"CAR_CFG_ISA", { (carCfg.PsisDid0xf011Ptr)->ISA }},
        {"CAR_CFG_LDW", { (carCfg.PsisDid0xf011Ptr)->LDW }},
        {"CAR_CFG_LCA", { (carCfg.PsisDid0xf011Ptr)->LCA }},
        {"CAR_CFG_DOW", { (carCfg.PsisDid0xf011Ptr)->DOW }},
        {"CAR_CFG_FCTA", { (carCfg.PsisDid0xf011Ptr)->FCTA }},
        {"CAR_CFG_RCTA", { (carCfg.PsisDid0xf011Ptr)->RCTA }},
        {"CAR_CFG_TLA", { (carCfg.PsisDid0xf011Ptr)->TLA }},
        {"CAR_CFG_HWA", { (carCfg.PsisDid0xf011Ptr)->HWA }},
        {"CAR_CFG_STEERING_WHEEL_HEATING", { (carCfg.PsisDid0xf011Ptr)->STEERING_WHEEL_HEATING }},
        {"CAR_CFG_FACE_RECOGNITION", { (carCfg.PsisDid0xf011Ptr)->FACE_RECOGNITION }},
        {"CAR_CFG_DMS", { (carCfg.PsisDid0xf011Ptr)->DMS }},
        {"CAR_CFG_APA", { (carCfg.PsisDid0xf011Ptr)->APA }},
        {"CAR_CFG_WPC", { (carCfg.PsisDid0xf011Ptr)->WPC }},
        {"CAR_CFG_UVGI", { (carCfg.PsisDid0xf011Ptr)->UVGI }},
        {"CAR_CFG_FRAGRANCE_FUNTION", { (carCfg.PsisDid0xf011Ptr)->FRAGRANCE_FUNTION }},
        {"CAR_CFG_DRIVER_SEAT", { (carCfg.PsisDid0xf011Ptr)->DRIVER_SEAT }},
        {"CAR_CFG_DRIVER_SEAT_LUMBAR_SUPPORT", { (carCfg.PsisDid0xf011Ptr)->DRIVER_SEAT_LUMBAR_SUPPORT }},
        {"CAR_CFG_DRIVER_SEAT_HEATING", { (carCfg.PsisDid0xf011Ptr)->DRIVER_SEAT_HEATING }},
        {"CAR_CFG_PASSENGER_SEAT_MEMORY", { (carCfg.PsisDid0xf011Ptr)->PASSENGER_SEAT_MEMORY }},
        {"CAR_CFG_PASSENGER_SEAT_HEATING", { (carCfg.PsisDid0xf011Ptr)->PASSENGER_SEAT_HEATING }},
        {"CAR_CFG_SECOND_ROW_SEATBELT_UNFASTENED_WARNING", { (carCfg.PsisDid0xf011Ptr)->SECOND_ROW_SEATBELT_UNFASTENED_WARNING }},
        {"CAR_CFG_REMOTE_CONTROL_PARKING", { (carCfg.PsisDid0xf011Ptr)->REMOTE_CONTROL_PARKING }},
        {"CAR_CFG_REMOTE_KEY", { (carCfg.PsisDid0xf011Ptr)->REMOTE_KEY }},
        {"CAR_CFG_HI_CAR", { (carCfg.PsisDid0xf011Ptr)->HI_CAR }},
        {"CAR_CFG_CAR_PLAY", { (carCfg.PsisDid0xf011Ptr)->CAR_PLAY }},
        {"CAR_CFG_CAR_BIT", { (carCfg.PsisDid0xf011Ptr)->CAR_BIT }},
        {"CAR_CFG_FCTB", { (carCfg.PsisDid0xf011Ptr)->FCTB }},
        {"CAR_CFG_RCTB", { (carCfg.PsisDid0xf011Ptr)->RCTB }},
        {"CAR_CFG_RCW", { (carCfg.PsisDid0xf011Ptr)->RCW }},
        {"CAR_CFG_ISLC", { (carCfg.PsisDid0xf011Ptr)->ISLC }},
        {"CAR_CFG_WELCOME_CEREMONY_LIGHTING_FUNCTION", { (carCfg.PsisDid0xf011Ptr)->WELCOME_CEREMONY_LIGHTING_FUNCTION }},
        {"CAR_CFG_INTELLIGENT_HEADLIGHT_CONTROL", { (carCfg.PsisDid0xf011Ptr)->INTELLIGENT_HEADLIGHT_CONTROL }},
        {"CAR_CFG_DYNAMIC_TAILLIGHT_ANIMATION", { (carCfg.PsisDid0xf011Ptr)->DYNAMIC_TAILLIGHT_ANIMATION }},
        {"CAR_CFG_INTERIOR_AMBIENT_LIGHT", { (carCfg.PsisDid0xf011Ptr)->INTERIOR_AMBIENT_LIGHT }},
        {"CAR_CFG_EXTERNAL_REARVIEW_MIRROR_ELECTRIC_HEATING", { (carCfg.PsisDid0xf011Ptr)->EXTERNAL_REARVIEW_MIRROR_ELECTRIC_HEATING }},
        {"CAR_CFG_REARVIEW_MIRROR_FOLDS_AUTOMATICALLY", { (carCfg.PsisDid0xf011Ptr)->REARVIEW_MIRROR_FOLDS_AUTOMATICALLY }},
        {"CAR_CFG_CUSHION_ADJUSTMENT", { (carCfg.PsisDid0xf011Ptr)->CUSHION_ADJUSTMENT }},
        {"CAR_CFG_CC", { (carCfg.PsisDid0xf011Ptr)->CC }},
        {"CAR_CFG_SECOND_ROW_SEAT_HEATING", { (carCfg.PsisDid0xf011Ptr)->SECOND_ROW_SEAT_HEATING }},
        {"CAR_CFG_ELECTRIC_TAIL", { (carCfg.PsisDid0xf011Ptr)->ELECTRIC_TAIL }},
        {"CAR_CFG_POWER_LIFTGATE", { (carCfg.PsisDid0xf011Ptr)->POWER_LIFTGATE }},
        {"CAR_CFG_NUMBER_OF_SPEAKERS", { (carCfg.PsisDid0xf011Ptr)->NUMBER_OF_SPEAKERS }},
        {"CAR_CFG_RAGE_MODE", { (carCfg.PsisDid0xf011Ptr)->RAGE_MODE }},
        {"CAR_CFG_TRACK_MODE", { (carCfg.PsisDid0xf011Ptr)->TRACK_MODE }},
        {"CAR_CFG_AUXILIARY_INSTRUMENT_PANEL_AMBIENT_LIGHT", { (carCfg.PsisDid0xf011Ptr)->AUXILIARY_INSTRUMENT_PANEL_AMBIENT_LIGHT }},
        {"CAR_CFG_DEFAULT_LANGUAGE", { (carCfg.PsisDid0xf011Ptr)->DEFAULT_LANGUAGE }},
        {"CAR_CFG_DRIVER_SEAT_VENTILATION", { (carCfg.PsisDid0xf011Ptr)->DRIVER_SEAT_VENTILATION }},
        {"CAR_CFG_PASSENGER_SEAT_VENTILATION", { (carCfg.PsisDid0xf011Ptr)->PASSENGER_SEAT_VENTILATION }},
        {"CAR_CFG_VITAL_SIGNS_MONITORING", { (carCfg.PsisDid0xf011Ptr)->VITAL_SIGNS_MONITORING }},
        {"CAR_CFG_INTELLIGENT_HIGH_BEAM", { (carCfg.PsisDid0xf011Ptr)->INTELLIGENT_HIGH_BEAM }},
        {"CAR_CFG_PM2_5_MONITORING_DISPLAY", { (carCfg.PsisDid0xf011Ptr)->PM2_5_MONITORING_DISPLAY }},
        {"CAR_CFG_DRIVER_SEAT_MASSAGE_FUNCTION", { (carCfg.PsisDid0xf011Ptr)->DRIVER_SEAT_MASSAGE_FUNCTION }},
        {"CAR_CFG_PASSENGER_SEAT_MASSAGE_FUNCTION", { (carCfg.PsisDid0xf011Ptr)->PASSENGER_SEAT_MASSAGE_FUNCTION }},
        {"CAR_CFG_RADIO", { (carCfg.PsisDid0xf011Ptr)->RADIO }},
        {"CAR_CFG_CAR_PAINT_COLOR", { (carCfg.PsisDid0xf011Ptr)->CAR_PAINT_COLOR }},
        {"CAR_CFG_EXHAUST_OUTLET", { (carCfg.PsisDid0xf011Ptr)->EXHAUST_OUTLET }},
        {"CAR_CFG_CHARGING_PORT", { (carCfg.PsisDid0xf011Ptr)->CHARGING_PORT }},
        {"CAR_CFG_REARVIEW_MIRROR_HEAT", { (carCfg.PsisDid0xf011Ptr)->REARVIEW_MIRROR_HEAT }},
        {"CAR_CFG_CENTRAL_CONTROL_SCREEN", { (carCfg.PsisDid0xf011Ptr)->CENTRAL_CONTROL_SCREEN }},
        {"CAR_CFG_CAR_MOUNTED_CHIP", { (carCfg.PsisDid0xf011Ptr)->CAR_MOUNTED_CHIP }},
        {"CAR_CFG_ABAT_VENT", { (carCfg.PsisDid0xf011Ptr)->ABAT_VENT }},
        {"CAR_CFG_ZERO_GRAVITY_PASSENGER_SEAT", { (carCfg.PsisDid0xf011Ptr)->ZERO_GRAVITY_PASSENGER_SEAT }},
        {"CAR_CFG_LEG_REST_PASSENGER_SEAT", { (carCfg.PsisDid0xf011Ptr)->LEG_REST_PASSENGER_SEAT }},
        {"CAR_CFG_MASSAGE_DRIVER_SEAT", { (carCfg.PsisDid0xf011Ptr)->MASSAGE_DRIVER_SEAT }},
        {"CAR_CFG_MASSAGE_PASSENGER_SEAT", { (carCfg.PsisDid0xf011Ptr)->MASSAGE_PASSENGER_SEAT }},
        {"CAR_CFG_FRONT_SEAT_VIBRATION_UNIT", { (carCfg.PsisDid0xf011Ptr)->FRONT_SEAT_VIBRATION_UNIT }},
        {"CAR_CFG_LEG_INFRARED_HEAT_PASSENGER_SEAT", { (carCfg.PsisDid0xf011Ptr)->LEG_INFRARED_HEAT_PASSENGER_SEAT }},
        {"CAR_CFG_EXTERNAL_REARVIEW_MIRROR_MEMORY", { (carCfg.PsisDid0xf011Ptr)->EXTERNAL_REARVIEW_MIRROR_MEMORY }},
        {"CAR_CFG_ENGINE_TYPE", { (carCfg.PsisDid0xf011Ptr)->ENGINE_TYPE }},
        {"CAR_CFG_EXTEND_RANGE_FUEL_TANK", { (carCfg.PsisDid0xf011Ptr)->EXTEND_RANGE_FUEL_TANK }},
        {"CAR_CFG_STEERING_WHEEL", { (carCfg.PsisDid0xf011Ptr)->STEERING_WHEEL }},
        {"CAR_CFG_MODEL_CODE", { (carCfg.PsisDid0xf011Ptr)->MODEL_CODE }},
        {"CAR_CFG_AVP", { (carCfg.PsisDid0xf011Ptr)->AVP }},
        {"CAR_CFG_NOA", { (carCfg.PsisDid0xf011Ptr)->NOA }},
        {"CAR_CFG_POWERTRAIN_SYS", { (carCfg.PsisDid0xf011Ptr)->POWERTRAIN_SYS }},
        {"CAR_CFG_DRIVE_TYPE", { (carCfg.PsisDid0xf011Ptr)->DRIVE_TYPE }},
        {"CAR_CFG_BRAKE_MODEL", { (carCfg.PsisDid0xf011Ptr)->BRAKE_MODEL }},
        {"CAR_CFG_CALIPER", { (carCfg.PsisDid0xf011Ptr)->CALIPER }},
        {"CAR_CFG_TIRE_SIZE", { (carCfg.PsisDid0xf011Ptr)->TIRE_SIZE }},
        {"CAR_CFG_CURB_WEIGHT", { (carCfg.PsisDid0xf011Ptr)->CURB_WEIGHT }},
    };
}

}  // namespace CM
}  // namespace Frameworks
}  // namespace AutoLink

#endif