/******************************************************************************
/                              Copyright
/------------------------------------------------------------------------------
*******************************************************************************/
/**
 * @file GetPropValueID.cpp
 * @brief Declaration getPropValueID
 */
#include "vhal_v2_0/VehicleHalDef.h"
#include "Signal.h"
#include <vendor/autolink/vehiclehal/2.0/types.h>

using vendor::autolink::vehiclehal::V2_0::VendorVehicleProperty;

namespace autolink {

    enum VendorVehicleProperty getPropValueID(int32_t propId)
    {
        EViPropId_T1V pid = static_cast<EViPropId_T1V>(propId);
        switch(pid) {
            case EViPropId_T1V::ACU_3_CRASHOUTPUTSTS_21:
            {
                return VendorVehicleProperty::ACU_3_CRASHOUTPUTSTS_21;
            }
            case EViPropId_T1V::BMS_PACKVOLTAGE_102:
            {
                return VendorVehicleProperty::BMS_PACKVOLTAGE_102;
            }
            case EViPropId_T1V::BMS_CHRGDCCNCTRDETD_102:
            {
                return VendorVehicleProperty::BMS_CHRGDCCNCTRDETD_102;
            }
            case EViPropId_T1V::BMS_DCCHGMODE_102:
            {
                return VendorVehicleProperty::BMS_DCCHGMODE_102;
            }
            case EViPropId_T1V::BMS_CHRGDCCHRGNFLTSTOPREAS_102:
            {
                return VendorVehicleProperty::BMS_CHRGDCCHRGNFLTSTOPREAS_102;
            }
            case EViPropId_T1V::BMS_ISOLATIONFAULT_102:
            {
                return VendorVehicleProperty::BMS_ISOLATIONFAULT_102;
            }
            case EViPropId_T1V::BMS_SOCDIS_102:
            {
                return VendorVehicleProperty::BMS_SOCDIS_102;
            }
            case EViPropId_T1V::EMS_ENGINESPEED_ACTUAL_103:
            {
                return VendorVehicleProperty::EMS_ENGINESPEED_ACTUAL_103;
            }
            case EViPropId_T1V::EPSFAILSTS_122:
            {
                return VendorVehicleProperty::EPSFAILSTS_122;
            }
            case EViPropId_T1V::EPSSTEERINGANGLECALIBRATIONSTS_122:
            {
                return VendorVehicleProperty::EPSSTEERINGANGLECALIBRATIONSTS_122;
            }
            case EViPropId_T1V::EPS_EOTLEARNING_STS_122:
            {
                return VendorVehicleProperty::EPS_EOTLEARNING_STS_122;
            }
            case EViPropId_T1V::MFSL_OK_SW_201:
            {
                return VendorVehicleProperty::MFSL_OK_SW_201;
            }
            case EViPropId_T1V::MFSL_AVM_SW_201:
            {
                return VendorVehicleProperty::MFSL_AVM_SW_201;
            }
            case EViPropId_T1V::MFSL_CUSTOMIZE_201:
            {
                return VendorVehicleProperty::MFSL_CUSTOMIZE_201;
            }
            case EViPropId_T1V::MFSR_UP_SW_205:
            {
                return VendorVehicleProperty::MFSR_UP_SW_205;
            }
            case EViPropId_T1V::MFSR_DW_SW_205:
            {
                return VendorVehicleProperty::MFSR_DW_SW_205;
            }
            case EViPropId_T1V::MFSR_LEFT_SW_205:
            {
                return VendorVehicleProperty::MFSR_LEFT_SW_205;
            }
            case EViPropId_T1V::MFSR_RIGHT_SW_205:
            {
                return VendorVehicleProperty::MFSR_RIGHT_SW_205;
            }
            case EViPropId_T1V::MFSR_OK_SW_205:
            {
                return VendorVehicleProperty::MFSR_OK_SW_205;
            }
            case EViPropId_T1V::MFSR_MENU_SW_205:
            {
                return VendorVehicleProperty::MFSR_MENU_SW_205;
            }
            case EViPropId_T1V::MFSR_VOICE_SW_205:
            {
                return VendorVehicleProperty::MFSR_VOICE_SW_205;
            }
            case EViPropId_T1V::MFSR_CUSTOMIZE_205:
            {
                return VendorVehicleProperty::MFSR_CUSTOMIZE_205;
            }
            case EViPropId_T1V::LHTURNLIGHTSTS_23B:
            {
                return VendorVehicleProperty::LHTURNLIGHTSTS_23B;
            }
            case EViPropId_T1V::RHTURNLIGHTSTS_23B:
            {
                return VendorVehicleProperty::RHTURNLIGHTSTS_23B;
            }
            case EViPropId_T1V::LHFDOORSTS_23B:
            {
                return VendorVehicleProperty::LHFDOORSTS_23B;
            }
            case EViPropId_T1V::LHFDOORLOCKSTS_23B:
            {
                return VendorVehicleProperty::LHFDOORLOCKSTS_23B;
            }
            case EViPropId_T1V::LHFSEATBELTSW_23B:
            {
                return VendorVehicleProperty::LHFSEATBELTSW_23B;
            }
            case EViPropId_T1V::ONEBOX_7_TAB_HIGHTEMP_23C:
            {
                return VendorVehicleProperty::ONEBOX_7_TAB_HIGHTEMP_23C;
            }
            case EViPropId_T1V::ONEBOX_7_TAB_ACTIVE_23C:
            {
                return VendorVehicleProperty::ONEBOX_7_TAB_ACTIVE_23C;
            }
            case EViPropId_T1V::ONEBOX_7_ICCO_TGTVEL_23C:
            {
                return VendorVehicleProperty::ONEBOX_7_ICCO_TGTVEL_23C;
            }
            case EViPropId_T1V::FLTLAMP_264H_264:
            {
                return VendorVehicleProperty::FLTLAMP_264H_264;
            }
            case EViPropId_T1V::PARKLAMP_264H_264:
            {
                return VendorVehicleProperty::PARKLAMP_264H_264;
            }
            case EViPropId_T1V::ACTRST_264H_264:
            {
                return VendorVehicleProperty::ACTRST_264H_264;
            }
            case EViPropId_T1V::RWUST_264H_264:
            {
                return VendorVehicleProperty::RWUST_264H_264;
            }
            case EViPropId_T1V::TEXTDISP_264H_264:
            {
                return VendorVehicleProperty::TEXTDISP_264H_264;
            }
            case EViPropId_T1V::FRZCU_HOODSTS_27E:
            {
                return VendorVehicleProperty::FRZCU_HOODSTS_27E;
            }
            case EViPropId_T1V::FRZCU_9_POWERMODE_27E:
            {
                return VendorVehicleProperty::FRZCU_9_POWERMODE_27E;
            }
            case EViPropId_T1V::FRZCU_PELOCKINKEYWARNING_27E:
            {
                return VendorVehicleProperty::FRZCU_PELOCKINKEYWARNING_27E;
            }
            case EViPropId_T1V::FRZCU_OTAPWRDWNREQFB_27E:
            {
                return VendorVehicleProperty::FRZCU_OTAPWRDWNREQFB_27E;
            }
            case EViPropId_T1V::FRZCU_KEYLESSWARNING_27E:
            {
                return VendorVehicleProperty::FRZCU_KEYLESSWARNING_27E;
            }
            case EViPropId_T1V::FRZCU_POWEROFFWARNING_27E:
            {
                return VendorVehicleProperty::FRZCU_POWEROFFWARNING_27E;
            }
            case EViPropId_T1V::FRZCU_OTAPWRONREQFB_27E:
            {
                return VendorVehicleProperty::FRZCU_OTAPWRONREQFB_27E;
            }
            case EViPropId_T1V::RHFDOORSTS_2AB:
            {
                return VendorVehicleProperty::RHFDOORSTS_2AB;
            }
            case EViPropId_T1V::FRZCU_1_PARKLIGHTSTS_2AB:
            {
                return VendorVehicleProperty::FRZCU_1_PARKLIGHTSTS_2AB;
            }
            case EViPropId_T1V::RHRDOORSTS_2AB:
            {
                return VendorVehicleProperty::RHRDOORSTS_2AB;
            }
            case EViPropId_T1V::LHRDOORSTS_2BB:
            {
                return VendorVehicleProperty::LHRDOORSTS_2BB;
            }
            case EViPropId_T1V::ISGF_ERRLVL_309:
            {
                return VendorVehicleProperty::ISGF_ERRLVL_309;
            }
            case EViPropId_T1V::FRZCU_FRSITPOSNSTS_313:
            {
                return VendorVehicleProperty::FRZCU_FRSITPOSNSTS_313;
            }
            case EViPropId_T1V::CHRGHOODSTS_313:
            {
                return VendorVehicleProperty::CHRGHOODSTS_313;
            }
            case EViPropId_T1V::ADS_2_AEBSTATUS_314:
            {
                return VendorVehicleProperty::ADS_2_AEBSTATUS_314;
            }
            case EViPropId_T1V::FCM_2_IHCFUNCTIONSTS_314:
            {
                return VendorVehicleProperty::FCM_2_IHCFUNCTIONSTS_314;
            }
            case EViPropId_T1V::ATCM_AVH_SW_315:
            {
                return VendorVehicleProperty::ATCM_AVH_SW_315;
            }
            case EViPropId_T1V::ADS_3_ICATEXTINFO_31A:
            {
                return VendorVehicleProperty::ADS_3_ICATEXTINFO_31A;
            }
            case EViPropId_T1V::ADS_3_ICASTATUS_31A:
            {
                return VendorVehicleProperty::ADS_3_ICASTATUS_31A;
            }
            case EViPropId_T1V::ADS_3_ACCSTS_31A:
            {
                return VendorVehicleProperty::ADS_3_ACCSTS_31A;
            }
            case EViPropId_T1V::ADS_3_LKSSTS_31A:
            {
                return VendorVehicleProperty::ADS_3_LKSSTS_31A;
            }
            case EViPropId_T1V::ADS_3_ELKSTS_31A:
            {
                return VendorVehicleProperty::ADS_3_ELKSTS_31A;
            }
            case EViPropId_T1V::BMS_CHG_STS_32BH_32B:
            {
                return VendorVehicleProperty::BMS_CHG_STS_32BH_32B;
            }
            case EViPropId_T1V::ADS_4_FCWMODE_333:
            {
                return VendorVehicleProperty::ADS_4_FCWMODE_333;
            }
            case EViPropId_T1V::ADS_4_SETSPD_333:
            {
                return VendorVehicleProperty::ADS_4_SETSPD_333;
            }
            case EViPropId_T1V::ADS_4_ACCTEXTMESSAGE_333:
            {
                return VendorVehicleProperty::ADS_4_ACCTEXTMESSAGE_333;
            }
            case EViPropId_T1V::ADS_5_ISLIOVERSPEEDWARN_335:
            {
                return VendorVehicleProperty::ADS_5_ISLIOVERSPEEDWARN_335;
            }
            case EViPropId_T1V::ADS_5_ISLISPEEDLIMITSIGN_335:
            {
                return VendorVehicleProperty::ADS_5_ISLISPEEDLIMITSIGN_335;
            }
            case EViPropId_T1V::ADS_5_ISLIWARNINGMOD_335:
            {
                return VendorVehicleProperty::ADS_5_ISLIWARNINGMOD_335;
            }
            case EViPropId_T1V::REARDEFROSTSTS_35B:
            {
                return VendorVehicleProperty::REARDEFROSTSTS_35B;
            }
            case EViPropId_T1V::TMS_BATTERYLOOPERRORLEVEL_3DF:
            {
                return VendorVehicleProperty::TMS_BATTERYLOOPERRORLEVEL_3DF;
            }
            case EViPropId_T1V::TMS_MOTORLOOPERRORLEVEL_3DF:
            {
                return VendorVehicleProperty::TMS_MOTORLOOPERRORLEVEL_3DF;
            }
            case EViPropId_T1V::SAM_1_STEERINGANGLE_3FC:
            {
                return VendorVehicleProperty::SAM_1_STEERINGANGLE_3FC;
            }
            case EViPropId_T1V::RMCU_1_SPEED_3FC:
            {
                return VendorVehicleProperty::RMCU_1_SPEED_3FC;
            }
            case EViPropId_T1V::SAM_1_STEERINGANGLEVD_3FC:
            {
                return VendorVehicleProperty::SAM_1_STEERINGANGLEVD_3FC;
            }
            case EViPropId_T1V::CSA_2_WIPRFRNTCMD_3FC:
            {
                return VendorVehicleProperty::CSA_2_WIPRFRNTCMD_3FC;
            }
            case EViPropId_T1V::FLZCU_CARMODE_3FE:
            {
                return VendorVehicleProperty::FLZCU_CARMODE_3FE;
            }
            case EViPropId_T1V::FLZCU_NAPAREA2FB_3FE:
            {
                return VendorVehicleProperty::FLZCU_NAPAREA2FB_3FE;
            }
            case EViPropId_T1V::FLZCU_LOGOCHARGINGSTS_3FE:
            {
                return VendorVehicleProperty::FLZCU_LOGOCHARGINGSTS_3FE;
            }
            case EViPropId_T1V::FLZCU_RLWINTHERMALSTATUS_3FE:
            {
                return VendorVehicleProperty::FLZCU_RLWINTHERMALSTATUS_3FE;
            }
            case EViPropId_T1V::FLZCU_FLWINTHERMALSTATUS_3FE:
            {
                return VendorVehicleProperty::FLZCU_FLWINTHERMALSTATUS_3FE;
            }
            case EViPropId_T1V::FLZCU_FLSITPOSNSTS_3FE:
            {
                return VendorVehicleProperty::FLZCU_FLSITPOSNSTS_3FE;
            }
            case EViPropId_T1V::FLZCU_STEEROVERHEATWARN_3FE:
            {
                return VendorVehicleProperty::FLZCU_STEEROVERHEATWARN_3FE;
            }
            case EViPropId_T1V::CSUNSHADEPERCENTSTS_400:
            {
                return VendorVehicleProperty::CSUNSHADEPERCENTSTS_400;
            }
            case EViPropId_T1V::CSUNSHADESTS_400:
            {
                return VendorVehicleProperty::CSUNSHADESTS_400;
            }
            case EViPropId_T1V::FRZCU_ONEKEYHVOFFSWTST_400:
            {
                return VendorVehicleProperty::FRZCU_ONEKEYHVOFFSWTST_400;
            }
            case EViPropId_T1V::FRZCU_CSUNSHADETHERMALSTS_400:
            {
                return VendorVehicleProperty::FRZCU_CSUNSHADETHERMALSTS_400;
            }
            case EViPropId_T1V::FRZCU_RRWINTHERMALSTS_400:
            {
                return VendorVehicleProperty::FRZCU_RRWINTHERMALSTS_400;
            }
            case EViPropId_T1V::FRZCU_FRWINTHERMALSTS_400:
            {
                return VendorVehicleProperty::FRZCU_FRWINTHERMALSTS_400;
            }
            case EViPropId_T1V::FRZCU_QUEENSEATENTERSTS_400:
            {
                return VendorVehicleProperty::FRZCU_QUEENSEATENTERSTS_400;
            }
            case EViPropId_T1V::FRZCU_PASGERSEATMOVFAILCAUSE_400:
            {
                return VendorVehicleProperty::FRZCU_PASGERSEATMOVFAILCAUSE_400;
            }
            case EViPropId_T1V::FRZCU_QUEENSEATSTS_400:
            {
                return VendorVehicleProperty::FRZCU_QUEENSEATSTS_400;
            }
            case EViPropId_T1V::FRZCU_QUEENSEATMOVFAILCAUSE_400:
            {
                return VendorVehicleProperty::FRZCU_QUEENSEATMOVFAILCAUSE_400;
            }
            case EViPropId_T1V::CSUNSHADEPOSN_400:
            {
                return VendorVehicleProperty::CSUNSHADEPOSN_400;
            }
            case EViPropId_T1V::PEPS_SMARTSYSTEMWARNING1_1_404:
            {
                return VendorVehicleProperty::PEPS_SMARTSYSTEMWARNING1_1_404;
            }
            case EViPropId_T1V::PEPS_SMARTSYSTEMWARNING2_2_404:
            {
                return VendorVehicleProperty::PEPS_SMARTSYSTEMWARNING2_2_404;
            }
            case EViPropId_T1V::PEPS_SMARTSYSTEMWARNING3_1_404:
            {
                return VendorVehicleProperty::PEPS_SMARTSYSTEMWARNING3_1_404;
            }
            case EViPropId_T1V::PEPS_SMARTSYSTEMWARNING3_2_404:
            {
                return VendorVehicleProperty::PEPS_SMARTSYSTEMWARNING3_2_404;
            }
            case EViPropId_T1V::PEPS_SMARTSYSTEMWARNING4_2_404:
            {
                return VendorVehicleProperty::PEPS_SMARTSYSTEMWARNING4_2_404;
            }
            case EViPropId_T1V::PEPS_SMARTSYSTEMWARNING4_3_404:
            {
                return VendorVehicleProperty::PEPS_SMARTSYSTEMWARNING4_3_404;
            }
            case EViPropId_T1V::PEPS_SYSTEMWARNING_404:
            {
                return VendorVehicleProperty::PEPS_SYSTEMWARNING_404;
            }
            case EViPropId_T1V::REARVIEWFOLDSTS_406:
            {
                return VendorVehicleProperty::REARVIEWFOLDSTS_406;
            }
            case EViPropId_T1V::FLZCU_ALRMSTS_406:
            {
                return VendorVehicleProperty::FLZCU_ALRMSTS_406;
            }
            case EViPropId_T1V::FLZCU_STEERINGMODE_406:
            {
                return VendorVehicleProperty::FLZCU_STEERINGMODE_406;
            }
            case EViPropId_T1V::FLZCU_OBDDIAGOCCUPY_406:
            {
                return VendorVehicleProperty::FLZCU_OBDDIAGOCCUPY_406;
            }
            case EViPropId_T1V::HCU_POWERMODEFED_40A:
            {
                return VendorVehicleProperty::HCU_POWERMODEFED_40A;
            }
            case EViPropId_T1V::HCU_POWERTRAINFAULT_40A:
            {
                return VendorVehicleProperty::HCU_POWERTRAINFAULT_40A;
            }
            case EViPropId_T1V::VCC_1_OTASTS_40B:
            {
                return VendorVehicleProperty::VCC_1_OTASTS_40B;
            }
            case EViPropId_T1V::EBS_U_BATT_413:
            {
                return VendorVehicleProperty::EBS_U_BATT_413;
            }
            case EViPropId_T1V::HCU_2_G_LOWBATTERYINFO_414:
            {
                return VendorVehicleProperty::HCU_2_G_LOWBATTERYINFO_414;
            }
            case EViPropId_T1V::VCU_TOWINGMODE_421:
            {
                return VendorVehicleProperty::VCU_TOWINGMODE_421;
            }
            case EViPropId_T1V::VCU_ENGYCONSUPER50KM_421:
            {
                return VendorVehicleProperty::VCU_ENGYCONSUPER50KM_421;
            }
            case EViPropId_T1V::VCU_BOOKCHRGSETFAILRES_421:
            {
                return VendorVehicleProperty::VCU_BOOKCHRGSETFAILRES_421;
            }
            case EViPropId_T1V::VCU_BOOKCHRGFAILRES_421:
            {
                return VendorVehicleProperty::VCU_BOOKCHRGFAILRES_421;
            }
            case EViPropId_T1V::VCU_BOOKCHRGSTSFB_421:
            {
                return VendorVehicleProperty::VCU_BOOKCHRGSTSFB_421;
            }
            case EViPropId_T1V::DRIVERSEATMSGSTR_LVLSTS_425:
            {
                return VendorVehicleProperty::DRIVERSEATMSGSTR_LVLSTS_425;
            }
            case EViPropId_T1V::DRIVERSEATMSG_MODESTS_425:
            {
                return VendorVehicleProperty::DRIVERSEATMSG_MODESTS_425;
            }
            case EViPropId_T1V::TBOX_PETMODESWITCH_427:
            {
                return VendorVehicleProperty::TBOX_PETMODESWITCH_427;
            }
            case EViPropId_T1V::TBOX_SENTINELMODESW_427:
            {
                return VendorVehicleProperty::TBOX_SENTINELMODESW_427;
            }
            case EViPropId_T1V::LEFTSEATMSGSTR_LVLSTS_429:
            {
                return VendorVehicleProperty::LEFTSEATMSGSTR_LVLSTS_429;
            }
            case EViPropId_T1V::LEFTSEATMSG_MODESTS_429:
            {
                return VendorVehicleProperty::LEFTSEATMSG_MODESTS_429;
            }
            case EViPropId_T1V::PASSSEATMSGSTR_LVLSTS_42D:
            {
                return VendorVehicleProperty::PASSSEATMSGSTR_LVLSTS_42D;
            }
            case EViPropId_T1V::PASSSEATMSG_MODESTS_42D:
            {
                return VendorVehicleProperty::PASSSEATMSG_MODESTS_42D;
            }
            case EViPropId_T1V::WORKINGSTS_42EH_42E:
            {
                return VendorVehicleProperty::WORKINGSTS_42EH_42E;
            }
            case EViPropId_T1V::PHONEFORGOTTENONOFFSTS_42EH_42E:
            {
                return VendorVehicleProperty::PHONEFORGOTTENONOFFSTS_42EH_42E;
            }
            case EViPropId_T1V::FLZCU_CARSEARHSETSW_42F:
            {
                return VendorVehicleProperty::FLZCU_CARSEARHSETSW_42F;
            }
            case EViPropId_T1V::FLZCU_AUTOFOLDSTS_42F:
            {
                return VendorVehicleProperty::FLZCU_AUTOFOLDSTS_42F;
            }
            case EViPropId_T1V::FLZCU_AUTOLOCKSTS_42F:
            {
                return VendorVehicleProperty::FLZCU_AUTOLOCKSTS_42F;
            }
            case EViPropId_T1V::FLZCU_AUTOREADLIGHTSTS_42F:
            {
                return VendorVehicleProperty::FLZCU_AUTOREADLIGHTSTS_42F;
            }
            case EViPropId_T1V::FLZCU_STEERNEEDMEMORY_42F:
            {
                return VendorVehicleProperty::FLZCU_STEERNEEDMEMORY_42F;
            }
            case EViPropId_T1V::FLZCU_LOWBEAMFAULTS_42F:
            {
                return VendorVehicleProperty::FLZCU_LOWBEAMFAULTS_42F;
            }
            case EViPropId_T1V::FLZCU_REARNEEDMEMORY_42F:
            {
                return VendorVehicleProperty::FLZCU_REARNEEDMEMORY_42F;
            }
            case EViPropId_T1V::FLZCU_BRKLIGHTFAULTS_42F:
            {
                return VendorVehicleProperty::FLZCU_BRKLIGHTFAULTS_42F;
            }
            case EViPropId_T1V::FLZCU_RVSEXTMIRRFBSTS_42F:
            {
                return VendorVehicleProperty::FLZCU_RVSEXTMIRRFBSTS_42F;
            }
            case EViPropId_T1V::FLZCU_LIGHTMAINSWITCHSTS_42F:
            {
                return VendorVehicleProperty::FLZCU_LIGHTMAINSWITCHSTS_42F;
            }
            case EViPropId_T1V::FLZCU_BEAMDELAYSTS_42F:
            {
                return VendorVehicleProperty::FLZCU_BEAMDELAYSTS_42F;
            }
            case EViPropId_T1V::FLZCU_LOWBEAMHIGHSTS_42F:
            {
                return VendorVehicleProperty::FLZCU_LOWBEAMHIGHSTS_42F;
            }
            case EViPropId_T1V::FLZCU_WIPESENSITIVITYSTS_42F:
            {
                return VendorVehicleProperty::FLZCU_WIPESENSITIVITYSTS_42F;
            }
            case EViPropId_T1V::FLZCU_ALARMWARNSETSW_42F:
            {
                return VendorVehicleProperty::FLZCU_ALARMWARNSETSW_42F;
            }
            case EViPropId_T1V::FLZCU_CLEANMODESTATUS_42F:
            {
                return VendorVehicleProperty::FLZCU_CLEANMODESTATUS_42F;
            }
            case EViPropId_T1V::FLZCU_REARFOGLIGHTSTS_42F:
            {
                return VendorVehicleProperty::FLZCU_REARFOGLIGHTSTS_42F;
            }
            case EViPropId_T1V::FLZCU_REARFOGLIGHTFAULTS_42F:
            {
                return VendorVehicleProperty::FLZCU_REARFOGLIGHTFAULTS_42F;
            }
            case EViPropId_T1V::FLZCU_HIGHBEAMFAULTS_42F:
            {
                return VendorVehicleProperty::FLZCU_HIGHBEAMFAULTS_42F;
            }
            case EViPropId_T1V::FLZCU_HIGHBEAMSTS_42F:
            {
                return VendorVehicleProperty::FLZCU_HIGHBEAMSTS_42F;
            }
            case EViPropId_T1V::FLZCU_LOWBEAMSTS_42F:
            {
                return VendorVehicleProperty::FLZCU_LOWBEAMSTS_42F;
            }
            case EViPropId_T1V::FLZCU_PARKUNLOCKENABLEFB_42F:
            {
                return VendorVehicleProperty::FLZCU_PARKUNLOCKENABLEFB_42F;
            }
            case EViPropId_T1V::FLZCU_EASYENTRYEXITFB_42F:
            {
                return VendorVehicleProperty::FLZCU_EASYENTRYEXITFB_42F;
            }
            case EViPropId_T1V::FLZCU_DAYTIMELIGHT_42F:
            {
                return VendorVehicleProperty::FLZCU_DAYTIMELIGHT_42F;
            }
            case EViPropId_T1V::FLZCU_PARKLIGHTFAULTS_42F:
            {
                return VendorVehicleProperty::FLZCU_PARKLIGHTFAULTS_42F;
            }
            case EViPropId_T1V::FLZCU_LOCKCARWINCLOSEFB_42F:
            {
                return VendorVehicleProperty::FLZCU_LOCKCARWINCLOSEFB_42F;
            }
            case EViPropId_T1V::FLZCU_BRKLIGHTSTS_42F:
            {
                return VendorVehicleProperty::FLZCU_BRKLIGHTSTS_42F;
            }
            case EViPropId_T1V::FLZCU_STEERWHEELHEATINGFB_42F:
            {
                return VendorVehicleProperty::FLZCU_STEERWHEELHEATINGFB_42F;
            }
            case EViPropId_T1V::FLZCU_FRONTFOGLIGHTSTS_42F:
            {
                return VendorVehicleProperty::FLZCU_FRONTFOGLIGHTSTS_42F;
            }
            case EViPropId_T1V::FLZCU_NAPAREAFB_42F:
            {
                return VendorVehicleProperty::FLZCU_NAPAREAFB_42F;
            }
            case EViPropId_T1V::FLZCU_NAPFAILCAUSE_42F:
            {
                return VendorVehicleProperty::FLZCU_NAPFAILCAUSE_42F;
            }
            case EViPropId_T1V::FLZCU_NAPSTATUSFB_42F:
            {
                return VendorVehicleProperty::FLZCU_NAPSTATUSFB_42F;
            }
            case EViPropId_T1V::LOCKCARSUNROOFSHADECLOSEFB_42F:
            {
                return VendorVehicleProperty::LOCKCARSUNROOFSHADECLOSEFB_42F;
            }
            case EViPropId_T1V::FLZCU_NAPCLOSEPROMPT_42F:
            {
                return VendorVehicleProperty::FLZCU_NAPCLOSEPROMPT_42F;
            }
            case EViPropId_T1V::FLZCU_REMOTEUNLOCKFB_42F:
            {
                return VendorVehicleProperty::FLZCU_REMOTEUNLOCKFB_42F;
            }
            case EViPropId_T1V::FLZCU_RLWINSTS_42F:
            {
                return VendorVehicleProperty::FLZCU_RLWINSTS_42F;
            }
            case EViPropId_T1V::FLZCU_FLWINSTS_42F:
            {
                return VendorVehicleProperty::FLZCU_FLWINSTS_42F;
            }
            case EViPropId_T1V::FLZCU_DAYTIMELIGHTFAULTS_42F:
            {
                return VendorVehicleProperty::FLZCU_DAYTIMELIGHTFAULTS_42F;
            }
            case EViPropId_T1V::FLZCU_FRONTFOGLIGHTFAULTS_42F:
            {
                return VendorVehicleProperty::FLZCU_FRONTFOGLIGHTFAULTS_42F;
            }
            case EViPropId_T1V::FLZCU_UIROPENSTAS_42F:
            {
                return VendorVehicleProperty::FLZCU_UIROPENSTAS_42F;
            }
            case EViPropId_T1V::FLZCU_WALOPENSTAS_42F:
            {
                return VendorVehicleProperty::FLZCU_WALOPENSTAS_42F;
            }
            case EViPropId_T1V::FLZCU_WELCOMEOPENSTAS_42F:
            {
                return VendorVehicleProperty::FLZCU_WELCOMEOPENSTAS_42F;
            }
            case EViPropId_T1V::LHFSEATBELTSW_430H_430:
            {
                return VendorVehicleProperty::LHFSEATBELTSW_430H_430;
            }
            case EViPropId_T1V::SEATHEATLEVELSFL_430H_430:
            {
                return VendorVehicleProperty::SEATHEATLEVELSFL_430H_430;
            }
            case EViPropId_T1V::SEATVENTLEVELSFL_430H_430:
            {
                return VendorVehicleProperty::SEATVENTLEVELSFL_430H_430;
            }
            case EViPropId_T1V::FLZCU_REARWIPERMAINTENANCESTS_430:
            {
                return VendorVehicleProperty::FLZCU_REARWIPERMAINTENANCESTS_430;
            }
            case EViPropId_T1V::FLZCU_FRONTWIPERMAINTENANCESTS_430:
            {
                return VendorVehicleProperty::FLZCU_FRONTWIPERMAINTENANCESTS_430;
            }
            case EViPropId_T1V::REARDOORSTA_431H_431:
            {
                return VendorVehicleProperty::REARDOORSTA_431H_431;
            }
            case EViPropId_T1V::REARDOORMOVEDIRECTION_431H_431:
            {
                return VendorVehicleProperty::REARDOORMOVEDIRECTION_431H_431;
            }
            case EViPropId_T1V::REARDOOROPENDEGREE_431H_431:
            {
                return VendorVehicleProperty::REARDOOROPENDEGREE_431H_431;
            }
            case EViPropId_T1V::PLG_LATCHSTS_436:
            {
                return VendorVehicleProperty::PLG_LATCHSTS_436;
            }
            case EViPropId_T1V::RIGHTSEATMSGSTR_LVLSTS_43F:
            {
                return VendorVehicleProperty::RIGHTSEATMSGSTR_LVLSTS_43F;
            }
            case EViPropId_T1V::RIGHTSEATMSG_MODESTS_43F:
            {
                return VendorVehicleProperty::RIGHTSEATMSG_MODESTS_43F;
            }
            case EViPropId_T1V::RLCR_1_SYSST_447:
            {
                return VendorVehicleProperty::RLCR_1_SYSST_447;
            }
            case EViPropId_T1V::RLCR_1_BSDWARN_447:
            {
                return VendorVehicleProperty::RLCR_1_BSDWARN_447;
            }
            case EViPropId_T1V::TMS_FIRST_BLOWINGSTS_448:
            {
                return VendorVehicleProperty::TMS_FIRST_BLOWINGSTS_448;
            }
            case EViPropId_T1V::TMS_BT_REDUCE_WIND_SPEEDSTS_448:
            {
                return VendorVehicleProperty::TMS_BT_REDUCE_WIND_SPEEDSTS_448;
            }
            case EViPropId_T1V::TMS_COOLANTFILLSTS_448:
            {
                return VendorVehicleProperty::TMS_COOLANTFILLSTS_448;
            }
            case EViPropId_T1V::TMS_PARKINGAIRCONDITIONINGSTATUS_448:
            {
                return VendorVehicleProperty::TMS_PARKINGAIRCONDITIONINGSTATUS_448;
            }
            case EViPropId_T1V::TMS_CROSSCOUNTRY_COOLINGSTS_448:
            {
                return VendorVehicleProperty::TMS_CROSSCOUNTRY_COOLINGSTS_448;
            }
            case EViPropId_T1V::TMS_TIMEDVENTILATIONSTS_448:
            {
                return VendorVehicleProperty::TMS_TIMEDVENTILATIONSTS_448;
            }
            case EViPropId_T1V::IMMO_CHALL_ICC_456:
            {
                return VendorVehicleProperty::IMMO_CHALL_ICC_456;
            }
            case EViPropId_T1V::OBC_CC_CONNECTSTS_477:
            {
                return VendorVehicleProperty::OBC_CC_CONNECTSTS_477;
            }
            case EViPropId_T1V::OBC_INNERDISCHGREQ_477:
            {
                return VendorVehicleProperty::OBC_INNERDISCHGREQ_477;
            }
            case EViPropId_T1V::CCP_1_FRONTAUTOACSWITCHREQ_47B:
            {
                return VendorVehicleProperty::CCP_1_FRONTAUTOACSWITCHREQ_47B;
            }
            case EViPropId_T1V::CCP_1_FLTEMPSWITCHREQ_47B:
            {
                return VendorVehicleProperty::CCP_1_FLTEMPSWITCHREQ_47B;
            }
            case EViPropId_T1V::CCP_1_FBLOWSPDCTRLSWITCHREQ_47B:
            {
                return VendorVehicleProperty::CCP_1_FBLOWSPDCTRLSWITCHREQ_47B;
            }
            case EViPropId_T1V::TBOX_BKCHRGSTARTTIMEEHOUR_47C:
            {
                return VendorVehicleProperty::TBOX_BKCHRGSTARTTIMEEHOUR_47C;
            }
            case EViPropId_T1V::TBOX_BKCHRGSTARTTIMEMIN_47C:
            {
                return VendorVehicleProperty::TBOX_BKCHRGSTARTTIMEMIN_47C;
            }
            case EViPropId_T1V::TBOX_BKCHRGDURATION_47C:
            {
                return VendorVehicleProperty::TBOX_BKCHRGDURATION_47C;
            }
            case EViPropId_T1V::TBOX_KEEPWARMSTRTHOUR_47C:
            {
                return VendorVehicleProperty::TBOX_KEEPWARMSTRTHOUR_47C;
            }
            case EViPropId_T1V::TBOX_KEEPWARMSTRTMIN_47C:
            {
                return VendorVehicleProperty::TBOX_KEEPWARMSTRTMIN_47C;
            }
            case EViPropId_T1V::IMMO_TEACH_VCC_47D:
            {
                return VendorVehicleProperty::IMMO_TEACH_VCC_47D;
            }
            case EViPropId_T1V::TBOX_PETMODESETTEMPERATURE_480:
            {
                return VendorVehicleProperty::TBOX_PETMODESETTEMPERATURE_480;
            }
            case EViPropId_T1V::ESPSWITCHSTATUS_48A:
            {
                return VendorVehicleProperty::ESPSWITCHSTATUS_48A;
            }
            case EViPropId_T1V::VEHICLESPEEDVSOSIGVALIDDATA_48A:
            {
                return VendorVehicleProperty::VEHICLESPEEDVSOSIGVALIDDATA_48A;
            }
            case EViPropId_T1V::VEHICLESPEEDVSOSIG_48A:
            {
                return VendorVehicleProperty::VEHICLESPEEDVSOSIG_48A;
            }
            case EViPropId_T1V::ABSFAILSTS_48A:
            {
                return VendorVehicleProperty::ABSFAILSTS_48A;
            }
            case EViPropId_T1V::EBDFAILSTS_48A:
            {
                return VendorVehicleProperty::EBDFAILSTS_48A;
            }
            case EViPropId_T1V::TCSFAILSTS_48A:
            {
                return VendorVehicleProperty::TCSFAILSTS_48A;
            }
            case EViPropId_T1V::VDCFAILSTS_48A:
            {
                return VendorVehicleProperty::VDCFAILSTS_48A;
            }
            case EViPropId_T1V::TCSACTIVE_48A:
            {
                return VendorVehicleProperty::TCSACTIVE_48A;
            }
            case EViPropId_T1V::VDCACTIVE_48A:
            {
                return VendorVehicleProperty::VDCACTIVE_48A;
            }
            case EViPropId_T1V::LC_LISHOWMODSTS_491:
            {
                return VendorVehicleProperty::LC_LISHOWMODSTS_491;
            }
            case EViPropId_T1V::EXTERNALTEMPERATURE_F_494:
            {
                return VendorVehicleProperty::EXTERNALTEMPERATURE_F_494;
            }
            case EViPropId_T1V::EXTERNALTEMPERATURE_C_494:
            {
                return VendorVehicleProperty::EXTERNALTEMPERATURE_C_494;
            }
            case EViPropId_T1V::BLOWSPEEDLEVELDISPLAYSTS_494:
            {
                return VendorVehicleProperty::BLOWSPEEDLEVELDISPLAYSTS_494;
            }
            case EViPropId_T1V::CCP_2_DEFROSTMODESWITCHREQ_497:
            {
                return VendorVehicleProperty::CCP_2_DEFROSTMODESWITCHREQ_497;
            }
            case EViPropId_T1V::FUELTANKLIDSTS_499:
            {
                return VendorVehicleProperty::FUELTANKLIDSTS_499;
            }
            case EViPropId_T1V::ACU_1_AIRBAGFAILSTS_49C:
            {
                return VendorVehicleProperty::ACU_1_AIRBAGFAILSTS_49C;
            }
            case EViPropId_T1V::ACU_1_THDROWLBELTWARNING_49C:
            {
                return VendorVehicleProperty::ACU_1_THDROWLBELTWARNING_49C;
            }
            case EViPropId_T1V::ACU_1_THDROWRBELTWARNING_49C:
            {
                return VendorVehicleProperty::ACU_1_THDROWRBELTWARNING_49C;
            }
            case EViPropId_T1V::ACU_1_PSNGRSEATBELTWARNING_49C:
            {
                return VendorVehicleProperty::ACU_1_PSNGRSEATBELTWARNING_49C;
            }
            case EViPropId_T1V::ACU_1_SECROWLBELTWARNING_49C:
            {
                return VendorVehicleProperty::ACU_1_SECROWLBELTWARNING_49C;
            }
            case EViPropId_T1V::ACU_1_SECROWMBELTWARNING_49C:
            {
                return VendorVehicleProperty::ACU_1_SECROWMBELTWARNING_49C;
            }
            case EViPropId_T1V::ACU_1_SECROWRBELTWARNING_49C:
            {
                return VendorVehicleProperty::ACU_1_SECROWRBELTWARNING_49C;
            }
            case EViPropId_T1V::FLZCU_9_POWERMODE_49D:
            {
                return VendorVehicleProperty::FLZCU_9_POWERMODE_49D;
            }
            case EViPropId_T1V::OBC_ELECTRONICLOCKSTS_49E:
            {
                return VendorVehicleProperty::OBC_ELECTRONICLOCKSTS_49E;
            }
            case EViPropId_T1V::OBC_WORKINGMODE_49E:
            {
                return VendorVehicleProperty::OBC_WORKINGMODE_49E;
            }
            case EViPropId_T1V::OBC_INNERDISCHGCURR_49E:
            {
                return VendorVehicleProperty::OBC_INNERDISCHGCURR_49E;
            }
            case EViPropId_T1V::OBC_INNERDISCHGVOLT_49E:
            {
                return VendorVehicleProperty::OBC_INNERDISCHGVOLT_49E;
            }
            case EViPropId_T1V::OBC_OUTDISCHGCURR_49E:
            {
                return VendorVehicleProperty::OBC_OUTDISCHGCURR_49E;
            }
            case EViPropId_T1V::OBC_OUTDISCHGVOLT_49E:
            {
                return VendorVehicleProperty::OBC_OUTDISCHGVOLT_49E;
            }
            case EViPropId_T1V::FRONTDEFORESTDISPLAYSTS_4A4:
            {
                return VendorVehicleProperty::FRONTDEFORESTDISPLAYSTS_4A4;
            }
            case EViPropId_T1V::TMS_AUTODISPLAYSTS_4A4:
            {
                return VendorVehicleProperty::TMS_AUTODISPLAYSTS_4A4;
            }
            case EViPropId_T1V::TMS_REFINSUFDISPSTS_4A4:
            {
                return VendorVehicleProperty::TMS_REFINSUFDISPSTS_4A4;
            }
            case EViPropId_T1V::WORKINGSTS_4A4:
            {
                return VendorVehicleProperty::WORKINGSTS_4A4;
            }
            case EViPropId_T1V::TMS_ACMODECUSTOMSTS_4A4:
            {
                return VendorVehicleProperty::TMS_ACMODECUSTOMSTS_4A4;
            }
            case EViPropId_T1V::TMS_ACREQUESTDISPLAYSTS_4A4:
            {
                return VendorVehicleProperty::TMS_ACREQUESTDISPLAYSTS_4A4;
            }
            case EViPropId_T1V::TMS_ACFASTCOOL_4A4:
            {
                return VendorVehicleProperty::TMS_ACFASTCOOL_4A4;
            }
            case EViPropId_T1V::TMS_ACFASTHEAT_4A4:
            {
                return VendorVehicleProperty::TMS_ACFASTHEAT_4A4;
            }
            case EViPropId_T1V::TMS_AUTOAIRCLEANSTS_4A4:
            {
                return VendorVehicleProperty::TMS_AUTOAIRCLEANSTS_4A4;
            }
            case EViPropId_T1V::TMS_SETTEMPERATURE_L_C_4A4:
            {
                return VendorVehicleProperty::TMS_SETTEMPERATURE_L_C_4A4;
            }
            case EViPropId_T1V::TMS_SETTEMPERATURE_R_C_4A4:
            {
                return VendorVehicleProperty::TMS_SETTEMPERATURE_R_C_4A4;
            }
            case EViPropId_T1V::TMS_MODEADJUSTDISPLAYSTS_4A4:
            {
                return VendorVehicleProperty::TMS_MODEADJUSTDISPLAYSTS_4A4;
            }
            case EViPropId_T1V::TMS_CIRCULATIONMODEDISPLAYSTS_4A4:
            {
                return VendorVehicleProperty::TMS_CIRCULATIONMODEDISPLAYSTS_4A4;
            }
            case EViPropId_T1V::TMS_INCARTEMP_4A4:
            {
                return VendorVehicleProperty::TMS_INCARTEMP_4A4;
            }
            case EViPropId_T1V::BLOWDELAYOFFSTS_4A4:
            {
                return VendorVehicleProperty::BLOWDELAYOFFSTS_4A4;
            }
            case EViPropId_T1V::SRF_OPERATESTS_4A5:
            {
                return VendorVehicleProperty::SRF_OPERATESTS_4A5;
            }
            case EViPropId_T1V::SRF_POSITIONSTS_4A5:
            {
                return VendorVehicleProperty::SRF_POSITIONSTS_4A5;
            }
            case EViPropId_T1V::SRF_SUNSHADE_OPERATESTS_4A5:
            {
                return VendorVehicleProperty::SRF_SUNSHADE_OPERATESTS_4A5;
            }
            case EViPropId_T1V::SRF_SUNSHADE_POSITIONSTS_4A8:
            {
                return VendorVehicleProperty::SRF_SUNSHADE_POSITIONSTS_4A8;
            }
            case EViPropId_T1V::AVHWARNINGMESSAGE_4A9:
            {
                return VendorVehicleProperty::AVHWARNINGMESSAGE_4A9;
            }
            case EViPropId_T1V::CDPACTIVE_4A9:
            {
                return VendorVehicleProperty::CDPACTIVE_4A9;
            }
            case EViPropId_T1V::HDCFAILSTS_4A9:
            {
                return VendorVehicleProperty::HDCFAILSTS_4A9;
            }
            case EViPropId_T1V::HDCCTRLSTS_4A9:
            {
                return VendorVehicleProperty::HDCCTRLSTS_4A9;
            }
            case EViPropId_T1V::ONEBOX_2_G_AVHSTS_4A9:
            {
                return VendorVehicleProperty::ONEBOX_2_G_AVHSTS_4A9;
            }
            case EViPropId_T1V::ONEBOX_2_G_AVHFAILSTS_4A9:
            {
                return VendorVehicleProperty::ONEBOX_2_G_AVHFAILSTS_4A9;
            }
            case EViPropId_T1V::FWAWARNINGSTS_4A9:
            {
                return VendorVehicleProperty::FWAWARNINGSTS_4A9;
            }
            case EViPropId_T1V::BRAKEFLUIDSTS_4A9:
            {
                return VendorVehicleProperty::BRAKEFLUIDSTS_4A9;
            }
            case EViPropId_T1V::TDL_SWITCHSTS_4AC:
            {
                return VendorVehicleProperty::TDL_SWITCHSTS_4AC;
            }
            case EViPropId_T1V::TDL_COLOURMODESTS_4AC:
            {
                return VendorVehicleProperty::TDL_COLOURMODESTS_4AC;
            }
            case EViPropId_T1V::TDL_RHYTHMSWSTS_4AC:
            {
                return VendorVehicleProperty::TDL_RHYTHMSWSTS_4AC;
            }
            case EViPropId_T1V::TDL_APILUMINANCESTS_4AC:
            {
                return VendorVehicleProperty::TDL_APILUMINANCESTS_4AC;
            }
            case EViPropId_T1V::TDL_FLOWLIGHTSWSTS_4AC:
            {
                return VendorVehicleProperty::TDL_FLOWLIGHTSWSTS_4AC;
            }
            case EViPropId_T1V::TDL_FLOWLIGHTMODESTS_4AC:
            {
                return VendorVehicleProperty::TDL_FLOWLIGHTMODESTS_4AC;
            }
            case EViPropId_T1V::TDL_RHYTHMMODESTS_4AC:
            {
                return VendorVehicleProperty::TDL_RHYTHMMODESTS_4AC;
            }
            case EViPropId_T1V::TDL_DOWWARNINGSTS_4AC:
            {
                return VendorVehicleProperty::TDL_DOWWARNINGSTS_4AC;
            }
            case EViPropId_T1V::TDL_ASSOCIATEDDRIVINGMODESTS_4AC:
            {
                return VendorVehicleProperty::TDL_ASSOCIATEDDRIVINGMODESTS_4AC;
            }
            case EViPropId_T1V::TDL_256COLOURSTS_4AC:
            {
                return VendorVehicleProperty::TDL_256COLOURSTS_4AC;
            }
            case EViPropId_T1V::CST_STATUS_4AD:
            {
                return VendorVehicleProperty::CST_STATUS_4AD;
            }
            case EViPropId_T1V::BRAKEPEDALFEELSTS_4AD:
            {
                return VendorVehicleProperty::BRAKEPEDALFEELSTS_4AD;
            }
            case EViPropId_T1V::SOC_4B0:
            {
                return VendorVehicleProperty::SOC_4B0;
            }
            case EViPropId_T1V::ENGINESPEED_4B2:
            {
                return VendorVehicleProperty::ENGINESPEED_4B2;
            }
            case EViPropId_T1V::ENGINESPEEDVALIDDATA_4B2:
            {
                return VendorVehicleProperty::ENGINESPEEDVALIDDATA_4B2;
            }
            case EViPropId_T1V::EMS_1_G_ENGINESTS_4B2:
            {
                return VendorVehicleProperty::EMS_1_G_ENGINESTS_4B2;
            }
            case EViPropId_T1V::VCU_1_G_PTREADY_4B4:
            {
                return VendorVehicleProperty::VCU_1_G_PTREADY_4B4;
            }
            case EViPropId_T1V::VCU_1_G_BOOKCHRGSETRESPONSE_4B4:
            {
                return VendorVehicleProperty::VCU_1_G_BOOKCHRGSETRESPONSE_4B4;
            }
            case EViPropId_T1V::VCU_1_G_PRNDGEARACT_4B4:
            {
                return VendorVehicleProperty::VCU_1_G_PRNDGEARACT_4B4;
            }
            case EViPropId_T1V::PPMID_1_PPMICOUNTER_4B8:
            {
                return VendorVehicleProperty::PPMID_1_PPMICOUNTER_4B8;
            }
            case EViPropId_T1V::PPMID_1_PPMIST_4B8:
            {
                return VendorVehicleProperty::PPMID_1_PPMIST_4B8;
            }
            case EViPropId_T1V::VCU_2_G_POWERLIMIT_4B9:
            {
                return VendorVehicleProperty::VCU_2_G_POWERLIMIT_4B9;
            }
            case EViPropId_T1V::VCU_2_G_BRAKEPEDALSTSVALIDDATA_4B9:
            {
                return VendorVehicleProperty::VCU_2_G_BRAKEPEDALSTSVALIDDATA_4B9;
            }
            case EViPropId_T1V::VCU_2_G_EXHIBITIONMOD_4B9:
            {
                return VendorVehicleProperty::VCU_2_G_EXHIBITIONMOD_4B9;
            }
            case EViPropId_T1V::VCU_2_G_BRAKEPEDALSTS_4B9:
            {
                return VendorVehicleProperty::VCU_2_G_BRAKEPEDALSTS_4B9;
            }
            case EViPropId_T1V::VCU_2_G_HVREADY_4B9:
            {
                return VendorVehicleProperty::VCU_2_G_HVREADY_4B9;
            }
            case EViPropId_T1V::FLZCU_RECOVERFB_4BB:
            {
                return VendorVehicleProperty::FLZCU_RECOVERFB_4BB;
            }
            case EViPropId_T1V::FLZCU_MEMORYFB_4BB:
            {
                return VendorVehicleProperty::FLZCU_MEMORYFB_4BB;
            }
            case EViPropId_T1V::FLZCU_SEATNEEDMEMORY_4BB:
            {
                return VendorVehicleProperty::FLZCU_SEATNEEDMEMORY_4BB;
            }
            case EViPropId_T1V::FLZCU_CURRSEATMEMORYPOS_4BB:
            {
                return VendorVehicleProperty::FLZCU_CURRSEATMEMORYPOS_4BB;
            }
            case EViPropId_T1V::VCU_3_G_ACTWHEELTORQUEFA_4BC:
            {
                return VendorVehicleProperty::VCU_3_G_ACTWHEELTORQUEFA_4BC;
            }
            case EViPropId_T1V::VCU_3_G_ACTWHEELTORQUERA_4BC:
            {
                return VendorVehicleProperty::VCU_3_G_ACTWHEELTORQUERA_4BC;
            }
            case EViPropId_T1V::BMS_HVBATTCELLVOLTMAX_NUM_4C8:
            {
                return VendorVehicleProperty::BMS_HVBATTCELLVOLTMAX_NUM_4C8;
            }
            case EViPropId_T1V::BMS_HVBATTCELLVOLTMAX_4C8:
            {
                return VendorVehicleProperty::BMS_HVBATTCELLVOLTMAX_4C8;
            }
            case EViPropId_T1V::BMS_HVBATTCELLVOLTMIN_NUM_4C8:
            {
                return VendorVehicleProperty::BMS_HVBATTCELLVOLTMIN_NUM_4C8;
            }
            case EViPropId_T1V::BMS_HVBATTCELLVOLTMIN_4C8:
            {
                return VendorVehicleProperty::BMS_HVBATTCELLVOLTMIN_4C8;
            }
            case EViPropId_T1V::BMS_CHG_STS_4C8:
            {
                return VendorVehicleProperty::BMS_CHG_STS_4C8;
            }
            case EViPropId_T1V::VCU_CLTC_RANGEAVAL_4CD:
            {
                return VendorVehicleProperty::VCU_CLTC_RANGEAVAL_4CD;
            }
            case EViPropId_T1V::VCU_WLTC_RANGEAVAL_4CD:
            {
                return VendorVehicleProperty::VCU_WLTC_RANGEAVAL_4CD;
            }
            case EViPropId_T1V::TBOX_BOOKCHRGSETREQ_4CF:
            {
                return VendorVehicleProperty::TBOX_BOOKCHRGSETREQ_4CF;
            }
            case EViPropId_T1V::TBOX_KEEPWARMSET_4CF:
            {
                return VendorVehicleProperty::TBOX_KEEPWARMSET_4CF;
            }
            case EViPropId_T1V::TBOX_BOOKCHRGSTS_4CF:
            {
                return VendorVehicleProperty::TBOX_BOOKCHRGSTS_4CF;
            }
            case EViPropId_T1V::FRZCU_RRWINSTS_4D2:
            {
                return VendorVehicleProperty::FRZCU_RRWINSTS_4D2;
            }
            case EViPropId_T1V::FRZCU_FRWINSTS_4D2:
            {
                return VendorVehicleProperty::FRZCU_FRWINSTS_4D2;
            }
            case EViPropId_T1V::FRZCU_FRSEATNEEDMEMORY_4D2:
            {
                return VendorVehicleProperty::FRZCU_FRSEATNEEDMEMORY_4D2;
            }
            case EViPropId_T1V::FRZCU_FRMEMORYFB_4D2:
            {
                return VendorVehicleProperty::FRZCU_FRMEMORYFB_4D2;
            }
            case EViPropId_T1V::FRZCU_FRRECOVERFB_4D2:
            {
                return VendorVehicleProperty::FRZCU_FRRECOVERFB_4D2;
            }
            case EViPropId_T1V::FRZCU_EASYENTRYEXITFB_4D2:
            {
                return VendorVehicleProperty::FRZCU_EASYENTRYEXITFB_4D2;
            }
            case EViPropId_T1V::FRZCU_ENJOYABLESEATWARNING_4D2:
            {
                return VendorVehicleProperty::FRZCU_ENJOYABLESEATWARNING_4D2;
            }
            case EViPropId_T1V::FRZCU_ENJOYABLESEATSTS_4D2:
            {
                return VendorVehicleProperty::FRZCU_ENJOYABLESEATSTS_4D2;
            }
            case EViPropId_T1V::SEATVENTLEVELSFR_4D2H_4D2:
            {
                return VendorVehicleProperty::SEATVENTLEVELSFR_4D2H_4D2;
            }
            case EViPropId_T1V::SEATHEATLEVELSFR_4D2H_4D2:
            {
                return VendorVehicleProperty::SEATHEATLEVELSFR_4D2H_4D2;
            }
            case EViPropId_T1V::NONPWROFFSWTSTS_4D2H_4D2:
            {
                return VendorVehicleProperty::NONPWROFFSWTSTS_4D2H_4D2;
            }
            case EViPropId_T1V::EPS_2_STEER_RETURNRMD_4D3:
            {
                return VendorVehicleProperty::EPS_2_STEER_RETURNRMD_4D3;
            }
            case EViPropId_T1V::RRCR_1_SYSST_4F3:
            {
                return VendorVehicleProperty::RRCR_1_SYSST_4F3;
            }
            case EViPropId_T1V::RRCR_1_BSDWARN_4F3:
            {
                return VendorVehicleProperty::RRCR_1_BSDWARN_4F3;
            }
            case EViPropId_T1V::BMS_HVBATTLOWSOC_50A:
            {
                return VendorVehicleProperty::BMS_HVBATTLOWSOC_50A;
            }
            case EViPropId_T1V::BMS_TBOXINSULATION_R_50B:
            {
                return VendorVehicleProperty::BMS_TBOXINSULATION_R_50B;
            }
            case EViPropId_T1V::BMS_TBOXHVBATTMAXT_50B:
            {
                return VendorVehicleProperty::BMS_TBOXHVBATTMAXT_50B;
            }
            case EViPropId_T1V::BMS_TBOXHVBATTMINT_50B:
            {
                return VendorVehicleProperty::BMS_TBOXHVBATTMINT_50B;
            }
            case EViPropId_T1V::BMS_SOCLIGHT_50B:
            {
                return VendorVehicleProperty::BMS_SOCLIGHT_50B;
            }
            case EViPropId_T1V::BMS_BATTFAULTLAMPSTS_50F:
            {
                return VendorVehicleProperty::BMS_BATTFAULTLAMPSTS_50F;
            }
            case EViPropId_T1V::BMS_OVERTEMP_LIGHTSTS_50F:
            {
                return VendorVehicleProperty::BMS_OVERTEMP_LIGHTSTS_50F;
            }
            case EViPropId_T1V::BMS_REMAINCHG_TIME_50F:
            {
                return VendorVehicleProperty::BMS_REMAINCHG_TIME_50F;
            }
            case EViPropId_T1V::BMS_THERMALRUNAWAYDIS_50F:
            {
                return VendorVehicleProperty::BMS_THERMALRUNAWAYDIS_50F;
            }
            case EViPropId_T1V::BMS_TBOXISOLATIONFAULT_50F:
            {
                return VendorVehicleProperty::BMS_TBOXISOLATIONFAULT_50F;
            }
            case EViPropId_T1V::BMS_PREWARMDIS_50F:
            {
                return VendorVehicleProperty::BMS_PREWARMDIS_50F;
            }
            case EViPropId_T1V::BMS_PACKVOLTAGEDIS_513:
            {
                return VendorVehicleProperty::BMS_PACKVOLTAGEDIS_513;
            }
            case EViPropId_T1V::BMS_PACKCURRENTDIS_513:
            {
                return VendorVehicleProperty::BMS_PACKCURRENTDIS_513;
            }
            case EViPropId_T1V::HCU_V2LDISCHGBCK_522:
            {
                return VendorVehicleProperty::HCU_V2LDISCHGBCK_522;
            }
            case EViPropId_T1V::HCU_DISCHGMEMFED_522:
            {
                return VendorVehicleProperty::HCU_DISCHGMEMFED_522;
            }
            case EViPropId_T1V::HCU_V2L_INTLDISCHGBCK_522:
            {
                return VendorVehicleProperty::HCU_V2L_INTLDISCHGBCK_522;
            }
            case EViPropId_T1V::HCU_HVDOWNREPAIRMODEFED_522:
            {
                return VendorVehicleProperty::HCU_HVDOWNREPAIRMODEFED_522;
            }
            case EViPropId_T1V::HCU_TRAILERMODE_522:
            {
                return VendorVehicleProperty::HCU_TRAILERMODE_522;
            }
            case EViPropId_T1V::HCU_KEYDRIVEMODEMEMORY_522:
            {
                return VendorVehicleProperty::HCU_KEYDRIVEMODEMEMORY_522;
            }
            case EViPropId_T1V::HCU_DRIVEPOWERDISPSETFED_522:
            {
                return VendorVehicleProperty::HCU_DRIVEPOWERDISPSETFED_522;
            }
            case EViPropId_T1V::HCU_TABSWTFED_522H_522:
            {
                return VendorVehicleProperty::HCU_TABSWTFED_522H_522;
            }
            case EViPropId_T1V::HCU_4LMODEFED_522:
            {
                return VendorVehicleProperty::HCU_4LMODEFED_522;
            }
            case EViPropId_T1V::HCU_STOPCHRGNMODEFED_522:
            {
                return VendorVehicleProperty::HCU_STOPCHRGNMODEFED_522;
            }
            case EViPropId_T1V::HCU_CLIMBFED_522:
            {
                return VendorVehicleProperty::HCU_CLIMBFED_522;
            }
            case EViPropId_T1V::HCU_PARKINGCHARGEREMINDER_522:
            {
                return VendorVehicleProperty::HCU_PARKINGCHARGEREMINDER_522;
            }
            case EViPropId_T1V::HCU_POWERCUT_522:
            {
                return VendorVehicleProperty::HCU_POWERCUT_522;
            }
            case EViPropId_T1V::HCU_IMMORELEASESIGNAL_522:
            {
                return VendorVehicleProperty::HCU_IMMORELEASESIGNAL_522;
            }
            case EViPropId_T1V::HCU_LVPOWSUPSYSABN_LIT_522:
            {
                return VendorVehicleProperty::HCU_LVPOWSUPSYSABN_LIT_522;
            }
            case EViPropId_T1V::HCU_POWERMODECHANGEINHIBIT_522:
            {
                return VendorVehicleProperty::HCU_POWERMODECHANGEINHIBIT_522;
            }
            case EViPropId_T1V::HCU_DISCONNECTCHAGWARN_522:
            {
                return VendorVehicleProperty::HCU_DISCONNECTCHAGWARN_522;
            }
            case EViPropId_T1V::HCU_VEHICLESPEEDMAX_LIMIT_522:
            {
                return VendorVehicleProperty::HCU_VEHICLESPEEDMAX_LIMIT_522;
            }
            case EViPropId_T1V::HCU_ACCLEABILITY_LIMIT_522:
            {
                return VendorVehicleProperty::HCU_ACCLEABILITY_LIMIT_522;
            }
            case EViPropId_T1V::HCU_DRIVEINHIBIT_GEARP_522:
            {
                return VendorVehicleProperty::HCU_DRIVEINHIBIT_GEARP_522;
            }
            case EViPropId_T1V::HCU_SETMODENOTCHANGE_522:
            {
                return VendorVehicleProperty::HCU_SETMODENOTCHANGE_522;
            }
            case EViPropId_T1V::HCU_TOWINGMODEENA_522:
            {
                return VendorVehicleProperty::HCU_TOWINGMODEENA_522;
            }
            case EViPropId_T1V::HCU_DEDICATEDMODEINHIBIT_522:
            {
                return VendorVehicleProperty::HCU_DEDICATEDMODEINHIBIT_522;
            }
            case EViPropId_T1V::HCU_DISCHARGESTOPFAULT_522:
            {
                return VendorVehicleProperty::HCU_DISCHARGESTOPFAULT_522;
            }
            case EViPropId_T1V::HCU_REAREDLSTS_522:
            {
                return VendorVehicleProperty::HCU_REAREDLSTS_522;
            }
            case EViPropId_T1V::HCU_FRNTEDLSTS_522:
            {
                return VendorVehicleProperty::HCU_FRNTEDLSTS_522;
            }
            case EViPropId_T1V::HCU_DRIVEMODE_JT_522:
            {
                return VendorVehicleProperty::HCU_DRIVEMODE_JT_522;
            }
            case EViPropId_T1V::HCU_SOCMANAGEFED_522:
            {
                return VendorVehicleProperty::HCU_SOCMANAGEFED_522;
            }
            case EViPropId_T1V::HCU_CCOSWTFED_522:
            {
                return VendorVehicleProperty::HCU_CCOSWTFED_522;
            }
            case EViPropId_T1V::HCU_DRVGEARSHIFTFAILUREINDCN_522:
            {
                return VendorVehicleProperty::HCU_DRVGEARSHIFTFAILUREINDCN_522;
            }
            case EViPropId_T1V::HCU_EGYREGENLEVEL_522:
            {
                return VendorVehicleProperty::HCU_EGYREGENLEVEL_522;
            }
            case EViPropId_T1V::HCU_ICCO_WARN_522:
            {
                return VendorVehicleProperty::HCU_ICCO_WARN_522;
            }
            case EViPropId_T1V::HCU_DRIVEMODECHANGEFAIL_522:
            {
                return VendorVehicleProperty::HCU_DRIVEMODECHANGEFAIL_522;
            }
            case EViPropId_T1V::HCU_ENGYFLOWTODISP_522:
            {
                return VendorVehicleProperty::HCU_ENGYFLOWTODISP_522;
            }
            case EViPropId_T1V::HCU_25_EDLFED_522:
            {
                return VendorVehicleProperty::HCU_25_EDLFED_522;
            }
            case EViPropId_T1V::HCU_DRAGGINGMODEREMIND_522:
            {
                return VendorVehicleProperty::HCU_DRAGGINGMODEREMIND_522;
            }
            case EViPropId_T1V::HCU_ITAS_ACTIVE_522:
            {
                return VendorVehicleProperty::HCU_ITAS_ACTIVE_522;
            }
            case EViPropId_T1V::HCU_25_VEHSPDOFFROADRMN_522:
            {
                return VendorVehicleProperty::HCU_25_VEHSPDOFFROADRMN_522;
            }
            case EViPropId_T1V::HCU_25_TAB_WARN_522:
            {
                return VendorVehicleProperty::HCU_25_TAB_WARN_522;
            }
            case EViPropId_T1V::HCU_CROSSBORDERSTS_522:
            {
                return VendorVehicleProperty::HCU_CROSSBORDERSTS_522;
            }
            case EViPropId_T1V::HCU_DISCHGSETSOCFED_522:
            {
                return VendorVehicleProperty::HCU_DISCHGSETSOCFED_522;
            }
            case EViPropId_T1V::LHFTIRETEMPERATURE_524:
            {
                return VendorVehicleProperty::LHFTIRETEMPERATURE_524;
            }
            case EViPropId_T1V::RHFTIRETEMPERATURE_524:
            {
                return VendorVehicleProperty::RHFTIRETEMPERATURE_524;
            }
            case EViPropId_T1V::LHRTIRETEMPERATURE_524:
            {
                return VendorVehicleProperty::LHRTIRETEMPERATURE_524;
            }
            case EViPropId_T1V::LHFTIREPRESSURE_524:
            {
                return VendorVehicleProperty::LHFTIREPRESSURE_524;
            }
            case EViPropId_T1V::RHFTIREPRESSURE_524:
            {
                return VendorVehicleProperty::RHFTIREPRESSURE_524;
            }
            case EViPropId_T1V::LHRTIREPRESSURE_524:
            {
                return VendorVehicleProperty::LHRTIREPRESSURE_524;
            }
            case EViPropId_T1V::RHRTIREPRESSURE_524:
            {
                return VendorVehicleProperty::RHRTIREPRESSURE_524;
            }
            case EViPropId_T1V::RHRTIRETEMPERATURE_524:
            {
                return VendorVehicleProperty::RHRTIRETEMPERATURE_524;
            }
            case EViPropId_T1V::TIREPOSITIONWARNING_LHFTIRE_52C:
            {
                return VendorVehicleProperty::TIREPOSITIONWARNING_LHFTIRE_52C;
            }
            case EViPropId_T1V::TIREPOSITIONWARNING_RHFTIRE_52C:
            {
                return VendorVehicleProperty::TIREPOSITIONWARNING_RHFTIRE_52C;
            }
            case EViPropId_T1V::TIREPOSITIONWARNING_LHRTIRE_52C:
            {
                return VendorVehicleProperty::TIREPOSITIONWARNING_LHRTIRE_52C;
            }
            case EViPropId_T1V::TIREPOSITIONWARNING_RHRTIRE_52C:
            {
                return VendorVehicleProperty::TIREPOSITIONWARNING_RHRTIRE_52C;
            }
            case EViPropId_T1V::TIREPRESSUREWARNINGLAMPSTS_52C:
            {
                return VendorVehicleProperty::TIREPRESSUREWARNINGLAMPSTS_52C;
            }
            case EViPropId_T1V::TIREPRESSURESYSTEMFAILSTS_52C:
            {
                return VendorVehicleProperty::TIREPRESSURESYSTEMFAILSTS_52C;
            }
            case EViPropId_T1V::RADAR_1_LHRRADARSENSORDISTANCE_530:
            {
                return VendorVehicleProperty::RADAR_1_LHRRADARSENSORDISTANCE_530;
            }
            case EViPropId_T1V::RADAR_1_RHMRRADARSENSORDISTANCE_530:
            {
                return VendorVehicleProperty::RADAR_1_RHMRRADARSENSORDISTANCE_530;
            }
            case EViPropId_T1V::RADAR_1_RHRRADARSENSORDISTANCE_530:
            {
                return VendorVehicleProperty::RADAR_1_RHRRADARSENSORDISTANCE_530;
            }
            case EViPropId_T1V::RADAR_1_LHMRRADARSENSORDISTANCE_530:
            {
                return VendorVehicleProperty::RADAR_1_LHMRRADARSENSORDISTANCE_530;
            }
            case EViPropId_T1V::RADAR_1_LHFRADARSENSORDISTANCE_530:
            {
                return VendorVehicleProperty::RADAR_1_LHFRADARSENSORDISTANCE_530;
            }
            case EViPropId_T1V::RADAR_1_RHMFRADARSENSORDISTANCE_530:
            {
                return VendorVehicleProperty::RADAR_1_RHMFRADARSENSORDISTANCE_530;
            }
            case EViPropId_T1V::RADAR_1_RHFRADARSENSORDISTANCE_530:
            {
                return VendorVehicleProperty::RADAR_1_RHFRADARSENSORDISTANCE_530;
            }
            case EViPropId_T1V::RADAR_1_LHMFRADARSENSORDISTANCE_530:
            {
                return VendorVehicleProperty::RADAR_1_LHMFRADARSENSORDISTANCE_530;
            }
            case EViPropId_T1V::DWD_DISTANCE_532:
            {
                return VendorVehicleProperty::DWD_DISTANCE_532;
            }
            case EViPropId_T1V::FMCU_ERRLVLDIS_53A:
            {
                return VendorVehicleProperty::FMCU_ERRLVLDIS_53A;
            }
            case EViPropId_T1V::FMCU_SPDACT_EDR_53A:
            {
                return VendorVehicleProperty::FMCU_SPDACT_EDR_53A;
            }
            case EViPropId_T1V::BMS_44_PACKPOWERREALTIME_53D:
            {
                return VendorVehicleProperty::BMS_44_PACKPOWERREALTIME_53D;
            }
            case EViPropId_T1V::RMCU_ERRLVLDIS_57B:
            {
                return VendorVehicleProperty::RMCU_ERRLVLDIS_57B;
            }
            case EViPropId_T1V::BMS_HVBATTSOEACTDISCHACYC_5FB:
            {
                return VendorVehicleProperty::BMS_HVBATTSOEACTDISCHACYC_5FB;
            }
            case EViPropId_T1V::BMS_HVBATTSOEACTRECHACYC_5FB:
            {
                return VendorVehicleProperty::BMS_HVBATTSOEACTRECHACYC_5FB;
            }
            case EViPropId_T1V::BMS_HVBATTTEMPMAXNUM_5FB:
            {
                return VendorVehicleProperty::BMS_HVBATTTEMPMAXNUM_5FB;
            }
            case EViPropId_T1V::BMS_HVBATTTEMPMINNUM_5FB:
            {
                return VendorVehicleProperty::BMS_HVBATTTEMPMINNUM_5FB;
            }
            default:
            {
                ALOGD("[%s] propId = 0x%04x out of range", __func__, propId);
                return VendorVehicleProperty::VENDOR_PROPERTY_INVALID;
            }
        }

    }
}  // namespace autolink