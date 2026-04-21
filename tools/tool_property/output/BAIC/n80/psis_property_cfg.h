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
        {"CAR_CFG_VEHICLE_VARIANT", { (carCfg.PsisDid0xf011Ptr)->VEHICLE_VARIANT }},
        {"CAR_CFG_LANGUAGE", { (carCfg.PsisDid0xf011Ptr)->LANGUAGE }},
        {"CAR_CFG_REVERSE_VIEW_CONFIG", { (carCfg.PsisDid0xf011Ptr)->REVERSE_VIEW_CONFIG }},
        {"CAR_CFG_RADAR_CONFIG", { (carCfg.PsisDid0xf011Ptr)->RADAR_CONFIG }},
        {"CAR_CFG_TRANSPARENT_CHASSIS", { (carCfg.PsisDid0xf011Ptr)->TRANSPARENT_CHASSIS }},
        {"CAR_CFG_AUTOMATIC_PARKING_ASSIST", { (carCfg.PsisDid0xf011Ptr)->AUTOMATIC_PARKING_ASSIST }},
        {"CAR_CFG_RESERVED_1", { (carCfg.PsisDid0xf011Ptr)->RESERVED_1 }},
        {"CAR_CFG_ACC", { (carCfg.PsisDid0xf011Ptr)->ACC }},
        {"CAR_CFG_TJA_ICA", { (carCfg.PsisDid0xf011Ptr)->TJA_ICA }},
        {"CAR_CFG_SLKA", { (carCfg.PsisDid0xf011Ptr)->SLKA }},
        {"CAR_CFG_ASL", { (carCfg.PsisDid0xf011Ptr)->ASL }},
        {"CAR_CFG_FCW", { (carCfg.PsisDid0xf011Ptr)->FCW }},
        {"CAR_CFG_AEB", { (carCfg.PsisDid0xf011Ptr)->AEB }},
        {"CAR_CFG_LKA", { (carCfg.PsisDid0xf011Ptr)->LKA }},
        {"CAR_CFG_ELK", { (carCfg.PsisDid0xf011Ptr)->ELK }},
        {"CAR_CFG_SLA", { (carCfg.PsisDid0xf011Ptr)->SLA }},
        {"CAR_CFG_TSI_TSR", { (carCfg.PsisDid0xf011Ptr)->TSI_TSR }},
        {"CAR_CFG_TLA", { (carCfg.PsisDid0xf011Ptr)->TLA }},
        {"CAR_CFG_HMA", { (carCfg.PsisDid0xf011Ptr)->HMA }},
        {"CAR_CFG_MOD", { (carCfg.PsisDid0xf011Ptr)->MOD }},
        {"CAR_CFG_ISA", { (carCfg.PsisDid0xf011Ptr)->ISA }},
        {"CAR_CFG_RESERVED_2", { (carCfg.PsisDid0xf011Ptr)->RESERVED_2 }},
        {"CAR_CFG_RESERVED_3", { (carCfg.PsisDid0xf011Ptr)->RESERVED_3 }},
        {"CAR_CFG_BSD_LCA", { (carCfg.PsisDid0xf011Ptr)->BSD_LCA }},
        {"CAR_CFG_DOW", { (carCfg.PsisDid0xf011Ptr)->DOW }},
        {"CAR_CFG_RCTA", { (carCfg.PsisDid0xf011Ptr)->RCTA }},
        {"CAR_CFG_RCTB", { (carCfg.PsisDid0xf011Ptr)->RCTB }},
        {"CAR_CFG_RCW", { (carCfg.PsisDid0xf011Ptr)->RCW }},
        {"CAR_CFG_SUSPENSION_STIFFNESS_ADJUST", { (carCfg.PsisDid0xf011Ptr)->SUSPENSION_STIFFNESS_ADJUST }},
        {"CAR_CFG_RESERVED_4", { (carCfg.PsisDid0xf011Ptr)->RESERVED_4 }},
        {"CAR_CFG_AIR_CONDITIONING_ZONES", { (carCfg.PsisDid0xf011Ptr)->AIR_CONDITIONING_ZONES }},
        {"CAR_CFG_PRE_VENTILATION", { (carCfg.PsisDid0xf011Ptr)->PRE_VENTILATION }},
        {"CAR_CFG_TEMPORARY_LEAVE_MODE", { (carCfg.PsisDid0xf011Ptr)->TEMPORARY_LEAVE_MODE }},
        {"CAR_CFG_INSTANT_COOL", { (carCfg.PsisDid0xf011Ptr)->INSTANT_COOL }},
        {"CAR_CFG_INSTANT_HEAT", { (carCfg.PsisDid0xf011Ptr)->INSTANT_HEAT }},
        {"CAR_CFG_OUTSIDE_TEMP_DISPLAY", { (carCfg.PsisDid0xf011Ptr)->OUTSIDE_TEMP_DISPLAY }},
        {"CAR_CFG_AIR_CONDITIONING_MODE", { (carCfg.PsisDid0xf011Ptr)->AIR_CONDITIONING_MODE }},
        {"CAR_CFG_ICC_AUDIO_EFFECT_TYPE", { (carCfg.PsisDid0xf011Ptr)->ICC_AUDIO_EFFECT_TYPE }},
        {"CAR_CFG_VIRTUAL_AVATAR", { (carCfg.PsisDid0xf011Ptr)->VIRTUAL_AVATAR }},
        {"CAR_CFG_DISPLAY_SCREEN_SIZE", { (carCfg.PsisDid0xf011Ptr)->DISPLAY_SCREEN_SIZE }},
        {"CAR_CFG_VOICE_ZONES", { (carCfg.PsisDid0xf011Ptr)->VOICE_ZONES }},
        {"CAR_CFG_TBOX", { (carCfg.PsisDid0xf011Ptr)->TBOX }},
        {"CAR_CFG_DVR", { (carCfg.PsisDid0xf011Ptr)->DVR }},
        {"CAR_CFG_DMS_CAMERA", { (carCfg.PsisDid0xf011Ptr)->DMS_CAMERA }},
        {"CAR_CFG_BLUETOOTH_KEY_AUTO_LOGIN", { (carCfg.PsisDid0xf011Ptr)->BLUETOOTH_KEY_AUTO_LOGIN }},
        {"CAR_CFG_NFC_CARD", { (carCfg.PsisDid0xf011Ptr)->NFC_CARD }},
        {"CAR_CFG_APP_MARKET", { (carCfg.PsisDid0xf011Ptr)->APP_MARKET }},
        {"CAR_CFG_EXTERNAL_SPEAKER", { (carCfg.PsisDid0xf011Ptr)->EXTERNAL_SPEAKER }},
        {"CAR_CFG_ONLINE_AUDIO", { (carCfg.PsisDid0xf011Ptr)->ONLINE_AUDIO }},
        {"CAR_CFG_BABY_SLEEP_MODE", { (carCfg.PsisDid0xf011Ptr)->BABY_SLEEP_MODE }},
        {"CAR_CFG_FRONT_SEAT_REST_MODE", { (carCfg.PsisDid0xf011Ptr)->FRONT_SEAT_REST_MODE }},
        {"CAR_CFG_MEDITATION_MODE", { (carCfg.PsisDid0xf011Ptr)->MEDITATION_MODE }},
        {"CAR_CFG_COMMUTE_MODE", { (carCfg.PsisDid0xf011Ptr)->COMMUTE_MODE }},
        {"CAR_CFG_REFRESH_MODE", { (carCfg.PsisDid0xf011Ptr)->REFRESH_MODE }},
        {"CAR_CFG_VENTILATION_MODE", { (carCfg.PsisDid0xf011Ptr)->VENTILATION_MODE }},
        {"CAR_CFG_CAMPING_MODE", { (carCfg.PsisDid0xf011Ptr)->CAMPING_MODE }},
        {"CAR_CFG_MILEAGE_SURPRISE_MODE", { (carCfg.PsisDid0xf011Ptr)->MILEAGE_SURPRISE_MODE }},
        {"CAR_CFG_DEFAULT_RADIO_STANDARD", { (carCfg.PsisDid0xf011Ptr)->DEFAULT_RADIO_STANDARD }},
        {"CAR_CFG_SPEAKER_COUNT", { (carCfg.PsisDid0xf011Ptr)->SPEAKER_COUNT }},
        {"CAR_CFG_AMPLIFIER_TYPE", { (carCfg.PsisDid0xf011Ptr)->AMPLIFIER_TYPE }},
        {"CAR_CFG_INTELLIGENT_SCENE_MODE", { (carCfg.PsisDid0xf011Ptr)->INTELLIGENT_SCENE_MODE }},
        {"CAR_CFG_ONE_TOUCH_WINDOW_CONTROL", { (carCfg.PsisDid0xf011Ptr)->ONE_TOUCH_WINDOW_CONTROL }},
        {"CAR_CFG_WELCOME_LIGHTING", { (carCfg.PsisDid0xf011Ptr)->WELCOME_LIGHTING }},
        {"CAR_CFG_MIRROR_FOLDING", { (carCfg.PsisDid0xf011Ptr)->MIRROR_FOLDING }},
        {"CAR_CFG_MIRROR_MEMORY", { (carCfg.PsisDid0xf011Ptr)->MIRROR_MEMORY }},
        {"CAR_CFG_ELECTRIC_SUNSHADE", { (carCfg.PsisDid0xf011Ptr)->ELECTRIC_SUNSHADE }},
        {"CAR_CFG_POWER_TAILGATE", { (carCfg.PsisDid0xf011Ptr)->POWER_TAILGATE }},
        {"CAR_CFG_FRONT_WINDSHIELD_HEATING", { (carCfg.PsisDid0xf011Ptr)->FRONT_WINDSHIELD_HEATING }},
        {"CAR_CFG_DRIVER_SEAT_MEMORY", { (carCfg.PsisDid0xf011Ptr)->DRIVER_SEAT_MEMORY }},
        {"CAR_CFG_PASSENGER_SEAT_MEMORY", { (carCfg.PsisDid0xf011Ptr)->PASSENGER_SEAT_MEMORY }},
        {"CAR_CFG_SECOND_ROW_LEFT_SEAT_MEMORY", { (carCfg.PsisDid0xf011Ptr)->SECOND_ROW_LEFT_SEAT_MEMORY }},
        {"CAR_CFG_SECOND_ROW_RIGHT_SEAT_MEMORY", { (carCfg.PsisDid0xf011Ptr)->SECOND_ROW_RIGHT_SEAT_MEMORY }},
        {"CAR_CFG_THIRD_ROW_SEAT_SLIDING_ELECTRIC", { (carCfg.PsisDid0xf011Ptr)->THIRD_ROW_SEAT_SLIDING_ELECTRIC }},
        {"CAR_CFG_RESERVED_5", { (carCfg.PsisDid0xf011Ptr)->RESERVED_5 }},
        {"CAR_CFG_RESERVED_6", { (carCfg.PsisDid0xf011Ptr)->RESERVED_6 }},
        {"CAR_CFG_RESERVED_7", { (carCfg.PsisDid0xf011Ptr)->RESERVED_7 }},
        {"CAR_CFG_SMART_ENTRY_SWITCH", { (carCfg.PsisDid0xf011Ptr)->SMART_ENTRY_SWITCH }},
        {"CAR_CFG_POWER_TAILGATE_SMART_ENTRY_SWITCH", { (carCfg.PsisDid0xf011Ptr)->POWER_TAILGATE_SMART_ENTRY_SWITCH }},
        {"CAR_CFG_AUTO_HEADLIGHT", { (carCfg.PsisDid0xf011Ptr)->AUTO_HEADLIGHT }},
        {"CAR_CFG_OUTSIDE_MIRROR_HEATING", { (carCfg.PsisDid0xf011Ptr)->OUTSIDE_MIRROR_HEATING }},
        {"CAR_CFG_AMBIENT_LIGHTING", { (carCfg.PsisDid0xf011Ptr)->AMBIENT_LIGHTING }},
        {"CAR_CFG_STEERING_WHEEL_HEATING", { (carCfg.PsisDid0xf011Ptr)->STEERING_WHEEL_HEATING }},
        {"CAR_CFG_VEHICLE_REFRIGERATOR", { (carCfg.PsisDid0xf011Ptr)->VEHICLE_REFRIGERATOR }},
        {"CAR_CFG_BATTERY_SENSOR_TYPE", { (carCfg.PsisDid0xf011Ptr)->BATTERY_SENSOR_TYPE }},
        {"CAR_CFG_DRIVE_MODE", { (carCfg.PsisDid0xf011Ptr)->DRIVE_MODE }},
        {"CAR_CFG_CRUISE_CONTROL", { (carCfg.PsisDid0xf011Ptr)->CRUISE_CONTROL }},
        {"CAR_CFG_TPMS_TYPE", { (carCfg.PsisDid0xf011Ptr)->TPMS_TYPE }},
        {"CAR_CFG_TIRE_SIZE", { (carCfg.PsisDid0xf011Ptr)->TIRE_SIZE }},
        {"CAR_CFG_MANDATORY_OVERSPEED_WARNING", { (carCfg.PsisDid0xf011Ptr)->MANDATORY_OVERSPEED_WARNING }},
        {"CAR_CFG_RAIN_SENSING_WIPERS", { (carCfg.PsisDid0xf011Ptr)->RAIN_SENSING_WIPERS }},
        {"CAR_CFG_RESERVED_8", { (carCfg.PsisDid0xf011Ptr)->RESERVED_8 }},
        {"CAR_CFG_ONE_PEDAL_MODE", { (carCfg.PsisDid0xf011Ptr)->ONE_PEDAL_MODE }},
        {"CAR_CFG_ECO_DRIVE_MODE", { (carCfg.PsisDid0xf011Ptr)->ECO_DRIVE_MODE }},
        {"CAR_CFG_SPORT_DRIVE_MODE", { (carCfg.PsisDid0xf011Ptr)->SPORT_DRIVE_MODE }},
        {"CAR_CFG_COMFORT_DRIVE_MODE", { (carCfg.PsisDid0xf011Ptr)->COMFORT_DRIVE_MODE }},
        {"CAR_CFG_EXTREME_ECO_MODE", { (carCfg.PsisDid0xf011Ptr)->EXTREME_ECO_MODE }},
        {"CAR_CFG_SLIPPERY_ROAD_MODE", { (carCfg.PsisDid0xf011Ptr)->SLIPPERY_ROAD_MODE }},
        {"CAR_CFG_ADAPTIVE_DRIVE_MODE", { (carCfg.PsisDid0xf011Ptr)->ADAPTIVE_DRIVE_MODE }},
        {"CAR_CFG_PERSONALIZED_DRIVE_MODE", { (carCfg.PsisDid0xf011Ptr)->PERSONALIZED_DRIVE_MODE }},
        {"CAR_CFG_CARPLAY", { (carCfg.PsisDid0xf011Ptr)->CARPLAY }},
        {"CAR_CFG_ANDROID_AUTO", { (carCfg.PsisDid0xf011Ptr)->ANDROID_AUTO }},
        {"CAR_CFG_YILIAN", { (carCfg.PsisDid0xf011Ptr)->YILIAN }},
        {"CAR_CFG_CARLINK", { (carCfg.PsisDid0xf011Ptr)->CARLINK }},
        {"CAR_CFG_HICAR", { (carCfg.PsisDid0xf011Ptr)->HICAR }},
        {"CAR_CFG_AQS", { (carCfg.PsisDid0xf011Ptr)->AQS }},
        {"CAR_CFG_IN_CABIN_PM2_5_DISPLAY", { (carCfg.PsisDid0xf011Ptr)->IN_CABIN_PM2_5_DISPLAY }},
        {"CAR_CFG_WATER_ION", { (carCfg.PsisDid0xf011Ptr)->WATER_ION }},
        {"CAR_CFG_DRIVER_SEAT_HEATING", { (carCfg.PsisDid0xf011Ptr)->DRIVER_SEAT_HEATING }},
        {"CAR_CFG_PASSENGER_SEAT_HEATING", { (carCfg.PsisDid0xf011Ptr)->PASSENGER_SEAT_HEATING }},
        {"CAR_CFG_SECOND_ROW_LEFT_SEAT_HEATING", { (carCfg.PsisDid0xf011Ptr)->SECOND_ROW_LEFT_SEAT_HEATING }},
        {"CAR_CFG_SECOND_ROW_RIGHT_SEAT_HEATING", { (carCfg.PsisDid0xf011Ptr)->SECOND_ROW_RIGHT_SEAT_HEATING }},
        {"CAR_CFG_THIRD_ROW_LEFT_SEAT_HEATING", { (carCfg.PsisDid0xf011Ptr)->THIRD_ROW_LEFT_SEAT_HEATING }},
        {"CAR_CFG_THIRD_ROW_RIGHT_SEAT_HEATING", { (carCfg.PsisDid0xf011Ptr)->THIRD_ROW_RIGHT_SEAT_HEATING }},
        {"CAR_CFG_RESERVED_9", { (carCfg.PsisDid0xf011Ptr)->RESERVED_9 }},
        {"CAR_CFG_RESERVED_10", { (carCfg.PsisDid0xf011Ptr)->RESERVED_10 }},
        {"CAR_CFG_DRIVER_SEAT_VENTILATION", { (carCfg.PsisDid0xf011Ptr)->DRIVER_SEAT_VENTILATION }},
        {"CAR_CFG_PASSENGER_SEAT_VENTILATION", { (carCfg.PsisDid0xf011Ptr)->PASSENGER_SEAT_VENTILATION }},
        {"CAR_CFG_SECOND_ROW_LEFT_SEAT_VENTILATION", { (carCfg.PsisDid0xf011Ptr)->SECOND_ROW_LEFT_SEAT_VENTILATION }},
        {"CAR_CFG_SECOND_ROW_RIGHT_SEAT_VENTILATION", { (carCfg.PsisDid0xf011Ptr)->SECOND_ROW_RIGHT_SEAT_VENTILATION }},
        {"CAR_CFG_THIRD_ROW_LEFT_SEAT_VENTILATION", { (carCfg.PsisDid0xf011Ptr)->THIRD_ROW_LEFT_SEAT_VENTILATION }},
        {"CAR_CFG_THIRD_ROW_RIGHT_SEAT_VENTILATION", { (carCfg.PsisDid0xf011Ptr)->THIRD_ROW_RIGHT_SEAT_VENTILATION }},
        {"CAR_CFG_RESERVED_11", { (carCfg.PsisDid0xf011Ptr)->RESERVED_11 }},
        {"CAR_CFG_RESERVED_12", { (carCfg.PsisDid0xf011Ptr)->RESERVED_12 }},
        {"CAR_CFG_DRIVER_SEAT_MASSAGE", { (carCfg.PsisDid0xf011Ptr)->DRIVER_SEAT_MASSAGE }},
        {"CAR_CFG_PASSENGER_SEAT_MASSAGE", { (carCfg.PsisDid0xf011Ptr)->PASSENGER_SEAT_MASSAGE }},
        {"CAR_CFG_SECOND_ROW_LEFT_SEAT_MASSAGE", { (carCfg.PsisDid0xf011Ptr)->SECOND_ROW_LEFT_SEAT_MASSAGE }},
        {"CAR_CFG_SECOND_ROW_RIGHT_SEAT_MASSAGE", { (carCfg.PsisDid0xf011Ptr)->SECOND_ROW_RIGHT_SEAT_MASSAGE }},
        {"CAR_CFG_FRONT_SEAT_MASSAGE_POINTS", { (carCfg.PsisDid0xf011Ptr)->FRONT_SEAT_MASSAGE_POINTS }},
        {"CAR_CFG_SECOND_ROW_SEAT_MASSAGE_POINTS", { (carCfg.PsisDid0xf011Ptr)->SECOND_ROW_SEAT_MASSAGE_POINTS }},
        {"CAR_CFG_CENTRAL_SCREEN_MANUFACTURER", { (carCfg.PsisDid0xf011Ptr)->CENTRAL_SCREEN_MANUFACTURER }},
        {"CAR_CFG_CEILING_SCREEN_SIZE", { (carCfg.PsisDid0xf011Ptr)->CEILING_SCREEN_SIZE }},
        {"CAR_CFG_SENTRY_MODE", { (carCfg.PsisDid0xf011Ptr)->SENTRY_MODE }},
        {"CAR_CFG_FACIAL_RECOGNITION", { (carCfg.PsisDid0xf011Ptr)->FACIAL_RECOGNITION }},
        {"CAR_CFG_RESERVED_13", { (carCfg.PsisDid0xf011Ptr)->RESERVED_13 }},
        {"CAR_CFG_RESERVED_14", { (carCfg.PsisDid0xf011Ptr)->RESERVED_14 }},
        {"CAR_CFG_FRONT_WIRELESS_CHARGING", { (carCfg.PsisDid0xf011Ptr)->FRONT_WIRELESS_CHARGING }},
        {"CAR_CFG_SECOND_ROW_WIRELESS_CHARGING", { (carCfg.PsisDid0xf011Ptr)->SECOND_ROW_WIRELESS_CHARGING }},
        {"CAR_CFG_FRONT_HEADREST_SPEAKERS", { (carCfg.PsisDid0xf011Ptr)->FRONT_HEADREST_SPEAKERS }},
        {"CAR_CFG_SECOND_ROW_LEFT_HEADREST_SPEAKER", { (carCfg.PsisDid0xf011Ptr)->SECOND_ROW_LEFT_HEADREST_SPEAKER }},
        {"CAR_CFG_SECOND_ROW_RIGHT_HEADREST_SPEAKER", { (carCfg.PsisDid0xf011Ptr)->SECOND_ROW_RIGHT_HEADREST_SPEAKER }},
        {"CAR_CFG_SECOND_ROW_LEFT_ZERO_GRAVITY_SEAT", { (carCfg.PsisDid0xf011Ptr)->SECOND_ROW_LEFT_ZERO_GRAVITY_SEAT }},
        {"CAR_CFG_SECOND_ROW_RIGHT_ZERO_GRAVITY_SEAT", { (carCfg.PsisDid0xf011Ptr)->SECOND_ROW_RIGHT_ZERO_GRAVITY_SEAT }},
        {"CAR_CFG_RESERVED_15", { (carCfg.PsisDid0xf011Ptr)->RESERVED_15 }},
        {"CAR_CFG_RESERVED_16", { (carCfg.PsisDid0xf011Ptr)->RESERVED_16 }},
        {"CAR_CFG_RESERVED_17", { (carCfg.PsisDid0xf011Ptr)->RESERVED_17 }},
        {"CAR_CFG_RESERVED_18", { (carCfg.PsisDid0xf011Ptr)->RESERVED_18 }},
        {"CAR_CFG_RESERVED_19", { (carCfg.PsisDid0xf011Ptr)->RESERVED_19 }},
        {"CAR_CFG_RESERVED_20", { (carCfg.PsisDid0xf011Ptr)->RESERVED_20 }},
        {"CAR_CFG_RESERVED_21", { (carCfg.PsisDid0xf011Ptr)->RESERVED_21 }},
        {"CAR_CFG_RESERVED_22", { (carCfg.PsisDid0xf011Ptr)->RESERVED_22 }},
        {"CAR_CFG_RESERVED_23", { (carCfg.PsisDid0xf011Ptr)->RESERVED_23 }},
        {"CAR_CFG_RESERVED_24", { (carCfg.PsisDid0xf011Ptr)->RESERVED_24 }},
        {"CAR_CFG_RESERVED_25", { (carCfg.PsisDid0xf011Ptr)->RESERVED_25 }},
        {"CAR_CFG_RESERVED_26", { (carCfg.PsisDid0xf011Ptr)->RESERVED_26 }},
        {"CAR_CFG_RESERVED_27", { (carCfg.PsisDid0xf011Ptr)->RESERVED_27 }},
        {"CAR_CFG_RESERVED_28", { (carCfg.PsisDid0xf011Ptr)->RESERVED_28 }},
        {"CAR_CFG_ENGLISH_CHINESE_OPTION", { (carCfg.PsisDid0xf011Ptr)->ENGLISH_CHINESE_OPTION }},
        {"CAR_CFG_AIRBAG_DISABLING", { (carCfg.PsisDid0xf011Ptr)->AIRBAG_DISABLING }},
        {"CAR_CFG_RESERVED_29", { (carCfg.PsisDid0xf011Ptr)->RESERVED_29 }},
        {"CAR_CFG_RESERVED_30", { (carCfg.PsisDid0xf011Ptr)->RESERVED_30 }},
        {"CAR_CFG_RESERVED_31", { (carCfg.PsisDid0xf011Ptr)->RESERVED_31 }},
        {"CAR_CFG_RESERVED_32", { (carCfg.PsisDid0xf011Ptr)->RESERVED_32 }},
        {"CAR_CFG_RESERVED_33", { (carCfg.PsisDid0xf011Ptr)->RESERVED_33 }},
        {"CAR_CFG_RESERVED_34", { (carCfg.PsisDid0xf011Ptr)->RESERVED_34 }},
    };
}

}  // namespace CM
}  // namespace Frameworks
}  // namespace AutoLink

#endif