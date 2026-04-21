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
        EViPropId_N80 pid = static_cast<EViPropId_N80>(propId);
        switch(pid) {
            case EViPropId_N80::VEHSPDVLD_185:
            {
                return VendorVehicleProperty::VEHSPDVLD_185;
            }
            case EViPropId_N80::VEHSPD_185:
            {
                return VendorVehicleProperty::VEHSPD_185;
            }
            case EViPropId_N80::ESPOFFLAMP_186:
            {
                return VendorVehicleProperty::ESPOFFLAMP_186;
            }
            case EViPropId_N80::EBDFLTLAMP_186:
            {
                return VendorVehicleProperty::EBDFLTLAMP_186;
            }
            case EViPropId_N80::ABSFLTLAMP_186:
            {
                return VendorVehicleProperty::ABSFLTLAMP_186;
            }
            case EViPropId_N80::ESPTCSVDCFLTLAMP_186:
            {
                return VendorVehicleProperty::ESPTCSVDCFLTLAMP_186;
            }
            case EViPropId_N80::ESPTCSVDCACTVLAMP_186:
            {
                return VendorVehicleProperty::ESPTCSVDCACTVLAMP_186;
            }
            case EViPropId_N80::CDPACTV_186:
            {
                return VendorVehicleProperty::CDPACTV_186;
            }
            case EViPropId_N80::CDPAVL_186:
            {
                return VendorVehicleProperty::CDPAVL_186;
            }
            case EViPropId_N80::HDCSTS_186:
            {
                return VendorVehicleProperty::HDCSTS_186;
            }
            case EViPropId_N80::HDCAVL_186:
            {
                return VendorVehicleProperty::HDCAVL_186;
            }
            case EViPropId_N80::AVHACTV_186:
            {
                return VendorVehicleProperty::AVHACTV_186;
            }
            case EViPropId_N80::AVHSTB_186:
            {
                return VendorVehicleProperty::AVHSTB_186;
            }
            case EViPropId_N80::AVHAVL_186:
            {
                return VendorVehicleProperty::AVHAVL_186;
            }
            case EViPropId_N80::CSTAVL_186:
            {
                return VendorVehicleProperty::CSTAVL_186;
            }
            case EViPropId_N80::CSTSTB_186:
            {
                return VendorVehicleProperty::CSTSTB_186;
            }
            case EViPropId_N80::BRAKE_FLUID_SENSOR_STATE_186:
            {
                return VendorVehicleProperty::BRAKE_FLUID_SENSOR_STATE_186;
            }
            case EViPropId_N80::PBM_FAULT_IND_186:
            {
                return VendorVehicleProperty::PBM_FAULT_IND_186;
            }
            case EViPropId_N80::AVHHMIMSGN1_186:
            {
                return VendorVehicleProperty::AVHHMIMSGN1_186;
            }
            case EViPropId_N80::EZTAVL_186:
            {
                return VendorVehicleProperty::EZTAVL_186;
            }
            case EViPropId_N80::EZTSTB_186:
            {
                return VendorVehicleProperty::EZTSTB_186;
            }
            case EViPropId_N80::ESP_SWTINDCN_BDC_186:
            {
                return VendorVehicleProperty::ESP_SWTINDCN_BDC_186;
            }
            case EViPropId_N80::ESP_AVLINDCN_BDC_186:
            {
                return VendorVehicleProperty::ESP_AVLINDCN_BDC_186;
            }
            case EViPropId_N80::ESP_ACTVINDCN_BDC_186:
            {
                return VendorVehicleProperty::ESP_ACTVINDCN_BDC_186;
            }
            case EViPropId_N80::PWRMOD_1B1:
            {
                return VendorVehicleProperty::PWRMOD_1B1;
            }
            case EViPropId_N80::PWRMODVLD_1B1:
            {
                return VendorVehicleProperty::PWRMODVLD_1B1;
            }
            case EViPropId_N80::AIRBDEPLOYMTSTS_310:
            {
                return VendorVehicleProperty::AIRBDEPLOYMTSTS_310;
            }
            case EViPropId_N80::DRVRSEATBLTBUCDSTS_310:
            {
                return VendorVehicleProperty::DRVRSEATBLTBUCDSTS_310;
            }
            case EViPropId_N80::AIRBFLTLAMP_310:
            {
                return VendorVehicleProperty::AIRBFLTLAMP_310;
            }
            case EViPropId_N80::DRVRSEATTWARNLAMP_310:
            {
                return VendorVehicleProperty::DRVRSEATTWARNLAMP_310;
            }
            case EViPropId_N80::PASSSEATWARNLAMP_310:
            {
                return VendorVehicleProperty::PASSSEATWARNLAMP_310;
            }
            case EViPropId_N80::REDRVSEATWARNLAMP_310:
            {
                return VendorVehicleProperty::REDRVSEATWARNLAMP_310;
            }
            case EViPropId_N80::MIDRESEATWARNLAMP_310:
            {
                return VendorVehicleProperty::MIDRESEATWARNLAMP_310;
            }
            case EViPropId_N80::REPASSSEATWARNLAMP_310:
            {
                return VendorVehicleProperty::REPASSSEATWARNLAMP_310;
            }
            case EViPropId_N80::THIRDDRVSEATWARNLAMP_310:
            {
                return VendorVehicleProperty::THIRDDRVSEATWARNLAMP_310;
            }
            case EViPropId_N80::THIRDPASSSEATWARNLAMP_310:
            {
                return VendorVehicleProperty::THIRDPASSSEATWARNLAMP_310;
            }
            case EViPropId_N80::THIRDMIDSEATWARNLAMP_310:
            {
                return VendorVehicleProperty::THIRDMIDSEATWARNLAMP_310;
            }
            case EViPropId_N80::LGTACCE_19A:
            {
                return VendorVehicleProperty::LGTACCE_19A;
            }
            case EViPropId_N80::VCU_STRATEGY_SHIFT_POSITION_230:
            {
                return VendorVehicleProperty::VCU_STRATEGY_SHIFT_POSITION_230;
            }
            case EViPropId_N80::VCU_STRATEGY_SHIFT_POSN_FLAG_230:
            {
                return VendorVehicleProperty::VCU_STRATEGY_SHIFT_POSN_FLAG_230;
            }
            case EViPropId_N80::BMS_BATT_SOC_217:
            {
                return VendorVehicleProperty::BMS_BATT_SOC_217;
            }
            case EViPropId_N80::BMS_BATT_AVAIL_ENERGY_217:
            {
                return VendorVehicleProperty::BMS_BATT_AVAIL_ENERGY_217;
            }
            case EViPropId_N80::BMS_PWRBATTTHERMRUNAWAYALRM_2E6:
            {
                return VendorVehicleProperty::BMS_PWRBATTTHERMRUNAWAYALRM_2E6;
            }
            case EViPropId_N80::BMS_MONM_MIN_TEMP_ALARM_2E6:
            {
                return VendorVehicleProperty::BMS_MONM_MIN_TEMP_ALARM_2E6;
            }
            case EViPropId_N80::VCU_CHRGGUNANTITHFTOPENSTS_49C:
            {
                return VendorVehicleProperty::VCU_CHRGGUNANTITHFTOPENSTS_49C;
            }
            case EViPropId_N80::VCU_CHRGDCHAPWRDISP_49C:
            {
                return VendorVehicleProperty::VCU_CHRGDCHAPWRDISP_49C;
            }
            case EViPropId_N80::VCU_CHRGDCHACRT_DISP_49C:
            {
                return VendorVehicleProperty::VCU_CHRGDCHACRT_DISP_49C;
            }
            case EViPropId_N80::VCU_EHUCHRGDCHAREQ_49C:
            {
                return VendorVehicleProperty::VCU_EHUCHRGDCHAREQ_49C;
            }
            case EViPropId_N80::VCU_CHRGDCHABTNREQ_49C:
            {
                return VendorVehicleProperty::VCU_CHRGDCHABTNREQ_49C;
            }
            case EViPropId_N80::BATTHEATGWORKINGSTS_201:
            {
                return VendorVehicleProperty::BATTHEATGWORKINGSTS_201;
            }
            case EViPropId_N80::BMS_ALRMLAMP_FS_201:
            {
                return VendorVehicleProperty::BMS_ALRMLAMP_FS_201;
            }
            case EViPropId_N80::BMS_OBC_STATE_201:
            {
                return VendorVehicleProperty::BMS_OBC_STATE_201;
            }
            case EViPropId_N80::BMS_ALLWREMHEATGSTS_201:
            {
                return VendorVehicleProperty::BMS_ALLWREMHEATGSTS_201;
            }
            case EViPropId_N80::BMS_CHRGINSULFCTOPENSTS_201:
            {
                return VendorVehicleProperty::BMS_CHRGINSULFCTOPENSTS_201;
            }
            case EViPropId_N80::BMS_VEH_DCHA_STA_201:
            {
                return VendorVehicleProperty::BMS_VEH_DCHA_STA_201;
            }
            case EViPropId_N80::BMS_CHRGSTSDISP_201:
            {
                return VendorVehicleProperty::BMS_CHRGSTSDISP_201;
            }
            case EViPropId_N80::BMS_BATTLOWTEMPINDCR_201:
            {
                return VendorVehicleProperty::BMS_BATTLOWTEMPINDCR_201;
            }
            case EViPropId_N80::BMS_CHRGSTSPROMT_201:
            {
                return VendorVehicleProperty::BMS_CHRGSTSPROMT_201;
            }
            case EViPropId_N80::BMS_CHRGDCHAFLTPROMT_201:
            {
                return VendorVehicleProperty::BMS_CHRGDCHAFLTPROMT_201;
            }
            case EViPropId_N80::BMS_CHRGOPERGUIDEPROMT_201:
            {
                return VendorVehicleProperty::BMS_CHRGOPERGUIDEPROMT_201;
            }
            case EViPropId_N80::VCU_MONRPWRBATTTHERMRUNAWAYALRM_482:
            {
                return VendorVehicleProperty::VCU_MONRPWRBATTTHERMRUNAWAYALRM_482;
            }
            case EViPropId_N80::VCU_SHIFTOPERRMN_482:
            {
                return VendorVehicleProperty::VCU_SHIFTOPERRMN_482;
            }
            case EViPropId_N80::VCU_DRVGMILGDISPTYECFM_482:
            {
                return VendorVehicleProperty::VCU_DRVGMILGDISPTYECFM_482;
            }
            case EViPropId_N80::VCU_SOCLOCHRGRMN_482:
            {
                return VendorVehicleProperty::VCU_SOCLOCHRGRMN_482;
            }
            case EViPropId_N80::VCU_ALRMLAMP_FS_482:
            {
                return VendorVehicleProperty::VCU_ALRMLAMP_FS_482;
            }
            case EViPropId_N80::VCU_EGYFBPWRLIMSTA_483:
            {
                return VendorVehicleProperty::VCU_EGYFBPWRLIMSTA_483;
            }
            case EViPropId_N80::VCU_EXHIBCARMODNOTICE_575:
            {
                return VendorVehicleProperty::VCU_EXHIBCARMODNOTICE_575;
            }
            case EViPropId_N80::VCU_CHRGRESVSTSDISP_575:
            {
                return VendorVehicleProperty::VCU_CHRGRESVSTSDISP_575;
            }
            case EViPropId_N80::VCU_EXHIBCARMODTEXT_575:
            {
                return VendorVehicleProperty::VCU_EXHIBCARMODTEXT_575;
            }
            case EViPropId_N80::AUTPOWOFFFUNSTA_575:
            {
                return VendorVehicleProperty::AUTPOWOFFFUNSTA_575;
            }
            case EViPropId_N80::VCU_ELECTCLOCKANORMRMN_575:
            {
                return VendorVehicleProperty::VCU_ELECTCLOCKANORMRMN_575;
            }
            case EViPropId_N80::VCU_EXHIBCARMODDISABLENOTICE_575:
            {
                return VendorVehicleProperty::VCU_EXHIBCARMODDISABLENOTICE_575;
            }
            case EViPropId_N80::VCU_USRRMN_575:
            {
                return VendorVehicleProperty::VCU_USRRMN_575;
            }
            case EViPropId_N80::VCU_EXHIBITIONMODE_575:
            {
                return VendorVehicleProperty::VCU_EXHIBITIONMODE_575;
            }
            case EViPropId_N80::VCU_SETCHRGENDSOC_616:
            {
                return VendorVehicleProperty::VCU_SETCHRGENDSOC_616;
            }
            case EViPropId_N80::VCU_DRIVE_RANGE_FLAG_616:
            {
                return VendorVehicleProperty::VCU_DRIVE_RANGE_FLAG_616;
            }
            case EViPropId_N80::VCU_DRIVE_RANGE_616:
            {
                return VendorVehicleProperty::VCU_DRIVE_RANGE_616;
            }
            case EViPropId_N80::VCU_TOWMODEENABLESIG_617:
            {
                return VendorVehicleProperty::VCU_TOWMODEENABLESIG_617;
            }
            case EViPropId_N80::VCU_TOWMODESIG_617:
            {
                return VendorVehicleProperty::VCU_TOWMODESIG_617;
            }
            case EViPropId_N80::VCU_PARKING_REMIND_PGEAR_617:
            {
                return VendorVehicleProperty::VCU_PARKING_REMIND_PGEAR_617;
            }
            case EViPropId_N80::VCU_ENERGY_CONSUM_AV_486:
            {
                return VendorVehicleProperty::VCU_ENERGY_CONSUM_AV_486;
            }
            case EViPropId_N80::VCU_ENERGY_CONSUM_IN_486:
            {
                return VendorVehicleProperty::VCU_ENERGY_CONSUM_IN_486;
            }
            case EViPropId_N80::VCU_ENERGY_CONSUM_HISTORY_486:
            {
                return VendorVehicleProperty::VCU_ENERGY_CONSUM_HISTORY_486;
            }
            case EViPropId_N80::VCU_DRVR_PWR_LIM_LIG_631:
            {
                return VendorVehicleProperty::VCU_DRVR_PWR_LIM_LIG_631;
            }
            case EViPropId_N80::VCU_MOT_TEMP_H_IND_631:
            {
                return VendorVehicleProperty::VCU_MOT_TEMP_H_IND_631;
            }
            case EViPropId_N80::VCU_REFRSHMODRESTRNTFCTCMD_357:
            {
                return VendorVehicleProperty::VCU_REFRSHMODRESTRNTFCTCMD_357;
            }
            case EViPropId_N80::VCU_INHIBITFUNCMDVLD_357:
            {
                return VendorVehicleProperty::VCU_INHIBITFUNCMDVLD_357;
            }
            case EViPropId_N80::VCU_BRAKE_START_REQ_22B:
            {
                return VendorVehicleProperty::VCU_BRAKE_START_REQ_22B;
            }
            case EViPropId_N80::VCU_HVDISCNCTNLAMP_22B:
            {
                return VendorVehicleProperty::VCU_HVDISCNCTNLAMP_22B;
            }
            case EViPropId_N80::VCU_BATT_PWRON_22B:
            {
                return VendorVehicleProperty::VCU_BATT_PWRON_22B;
            }
            case EViPropId_N80::VCU_BATTERY_FAULT_IND_22B:
            {
                return VendorVehicleProperty::VCU_BATTERY_FAULT_IND_22B;
            }
            case EViPropId_N80::VCU_OBC_REMIND_LAMP_22B:
            {
                return VendorVehicleProperty::VCU_OBC_REMIND_LAMP_22B;
            }
            case EViPropId_N80::VCU_READY_LAMP_22B:
            {
                return VendorVehicleProperty::VCU_READY_LAMP_22B;
            }
            case EViPropId_N80::VCU_CHRG_DCHA_GUN_LIG_CMD_22B:
            {
                return VendorVehicleProperty::VCU_CHRG_DCHA_GUN_LIG_CMD_22B;
            }
            case EViPropId_N80::VCU_SYS_FAULT_LAMP_22B:
            {
                return VendorVehicleProperty::VCU_SYS_FAULT_LAMP_22B;
            }
            case EViPropId_N80::VCU_USER_OFF_ECC_CMD_22B:
            {
                return VendorVehicleProperty::VCU_USER_OFF_ECC_CMD_22B;
            }
            case EViPropId_N80::TBOX_RESVACCHRGOPENSTS_4F4:
            {
                return VendorVehicleProperty::TBOX_RESVACCHRGOPENSTS_4F4;
            }
            case EViPropId_N80::TBOX_RESVACCHRGSTRTTI_HR_62E:
            {
                return VendorVehicleProperty::TBOX_RESVACCHRGSTRTTI_HR_62E;
            }
            case EViPropId_N80::TBOX_RESVACCHRGSTRTTI_MINS_62E:
            {
                return VendorVehicleProperty::TBOX_RESVACCHRGSTRTTI_MINS_62E;
            }
            case EViPropId_N80::TBOX_MONRESVACCHRGREPSTRTSET_62E:
            {
                return VendorVehicleProperty::TBOX_MONRESVACCHRGREPSTRTSET_62E;
            }
            case EViPropId_N80::TBOX_RESVACCHRGENDTI_HR_62E:
            {
                return VendorVehicleProperty::TBOX_RESVACCHRGENDTI_HR_62E;
            }
            case EViPropId_N80::TBOX_RESVACCHRGENDTI_MINS_62E:
            {
                return VendorVehicleProperty::TBOX_RESVACCHRGENDTI_MINS_62E;
            }
            case EViPropId_N80::TBOX_RESVACCHRGENDSET_62E:
            {
                return VendorVehicleProperty::TBOX_RESVACCHRGENDSET_62E;
            }
            case EViPropId_N80::TBOX_MONRESVACCHRGREPENDSET_62E:
            {
                return VendorVehicleProperty::TBOX_MONRESVACCHRGREPENDSET_62E;
            }
            case EViPropId_N80::ECC_FUC_LIMIT_CMD_56F:
            {
                return VendorVehicleProperty::ECC_FUC_LIMIT_CMD_56F;
            }
            case EViPropId_N80::VCU_INPUT_INTER_SAT_56F:
            {
                return VendorVehicleProperty::VCU_INPUT_INTER_SAT_56F;
            }
            case EViPropId_N80::VCU_SOCKET_FUN_OPER_TIPS_EHU_56F:
            {
                return VendorVehicleProperty::VCU_SOCKET_FUN_OPER_TIPS_EHU_56F;
            }
            case EViPropId_N80::TBOX_CRTTI_DAY_551:
            {
                return VendorVehicleProperty::TBOX_CRTTI_DAY_551;
            }
            case EViPropId_N80::TBOX_CRTTI_HR_551:
            {
                return VendorVehicleProperty::TBOX_CRTTI_HR_551;
            }
            case EViPropId_N80::TBOX_CRTTI_MINS_551:
            {
                return VendorVehicleProperty::TBOX_CRTTI_MINS_551;
            }
            case EViPropId_N80::TBOX_CRTTI_YR_551:
            {
                return VendorVehicleProperty::TBOX_CRTTI_YR_551;
            }
            case EViPropId_N80::TBOX_CRTTI_MTH_551:
            {
                return VendorVehicleProperty::TBOX_CRTTI_MTH_551;
            }
            case EViPropId_N80::TBOX_CRTTI_SEC_551:
            {
                return VendorVehicleProperty::TBOX_CRTTI_SEC_551;
            }
            case EViPropId_N80::VCU_ANTITHEFTFAIL_56E:
            {
                return VendorVehicleProperty::VCU_ANTITHEFTFAIL_56E;
            }
            case EViPropId_N80::CHRGEPORTABNREM_56E:
            {
                return VendorVehicleProperty::CHRGEPORTABNREM_56E;
            }
            case EViPropId_N80::VCU_ACCHGCURRENTLIM_56E:
            {
                return VendorVehicleProperty::VCU_ACCHGCURRENTLIM_56E;
            }
            case EViPropId_N80::BATTMAXLOADELECCHG_624:
            {
                return VendorVehicleProperty::BATTMAXLOADELECCHG_624;
            }
            case EViPropId_N80::BMS_CHGRESTIME_624:
            {
                return VendorVehicleProperty::BMS_CHGRESTIME_624;
            }
            case EViPropId_N80::EPBSYSOPERSTS_1A7:
            {
                return VendorVehicleProperty::EPBSYSOPERSTS_1A7;
            }
            case EViPropId_N80::EPBSYSFLTSTS_1A7:
            {
                return VendorVehicleProperty::EPBSYSFLTSTS_1A7;
            }
            case EViPropId_N80::EPBSYSPARKLI_1A7:
            {
                return VendorVehicleProperty::EPBSYSPARKLI_1A7;
            }
            case EViPropId_N80::PBMPARKINGREMIND_1A7:
            {
                return VendorVehicleProperty::PBMPARKINGREMIND_1A7;
            }
            case EViPropId_N80::EPBSYSHMIMSGN1_1A7:
            {
                return VendorVehicleProperty::EPBSYSHMIMSGN1_1A7;
            }
            case EViPropId_N80::EPBSYSHMIMSGN2_1A7:
            {
                return VendorVehicleProperty::EPBSYSHMIMSGN2_1A7;
            }
            case EViPropId_N80::EPBSYSHMIMSGN3_1A7:
            {
                return VendorVehicleProperty::EPBSYSHMIMSGN3_1A7;
            }
            case EViPropId_N80::EPBSYSHMIMSGN4_1A7:
            {
                return VendorVehicleProperty::EPBSYSHMIMSGN4_1A7;
            }
            case EViPropId_N80::VCU_ACCHRGELECTCLOCKSTSFBSIG_554:
            {
                return VendorVehicleProperty::VCU_ACCHRGELECTCLOCKSTSFBSIG_554;
            }
            case EViPropId_N80::VCU_CARWASHMODENA_556:
            {
                return VendorVehicleProperty::VCU_CARWASHMODENA_556;
            }
            case EViPropId_N80::VCU_CARWASHMODSTS_556:
            {
                return VendorVehicleProperty::VCU_CARWASHMODSTS_556;
            }
            case EViPropId_N80::VEHICLEDRIVEENERGYCONSUM_56A:
            {
                return VendorVehicleProperty::VEHICLEDRIVEENERGYCONSUM_56A;
            }
            case EViPropId_N80::VEHICLEACENERGYCONSUM_56A:
            {
                return VendorVehicleProperty::VEHICLEACENERGYCONSUM_56A;
            }
            case EViPropId_N80::BATTHEATMANGMENTENERGYCONSUM_56A:
            {
                return VendorVehicleProperty::BATTHEATMANGMENTENERGYCONSUM_56A;
            }
            case EViPropId_N80::VEHICLEDRIVEENERGYCONSUMOTER_56A:
            {
                return VendorVehicleProperty::VEHICLEDRIVEENERGYCONSUMOTER_56A;
            }
            case EViPropId_N80::ENERGYRECOVERENERGY_56A:
            {
                return VendorVehicleProperty::ENERGYRECOVERENERGY_56A;
            }
            case EViPropId_N80::VCU_ESTIDRIVMILEAGE_RECENT10KM_56A:
            {
                return VendorVehicleProperty::VCU_ESTIDRIVMILEAGE_RECENT10KM_56A;
            }
            case EViPropId_N80::VCU_ESTIDRIVMILEAGE_RECENT100KM_56A:
            {
                return VendorVehicleProperty::VCU_ESTIDRIVMILEAGE_RECENT100KM_56A;
            }
            case EViPropId_N80::VCU_AVRGCNSEEGY_STD_56A:
            {
                return VendorVehicleProperty::VCU_AVRGCNSEEGY_STD_56A;
            }
            case EViPropId_N80::VCU_FETRANSEGYAVRGNOW_E_56A:
            {
                return VendorVehicleProperty::VCU_FETRANSEGYAVRGNOW_E_56A;
            }
            case EViPropId_N80::VCU_FETRANSEGYAVRGNOW_F_56A:
            {
                return VendorVehicleProperty::VCU_FETRANSEGYAVRGNOW_F_56A;
            }
            case EViPropId_N80::VCU_APPFETRANSEGYAVRGNOW_E_56A:
            {
                return VendorVehicleProperty::VCU_APPFETRANSEGYAVRGNOW_E_56A;
            }
            case EViPropId_N80::VCU_APPFETRANSEGYAVRGNOW_F_56A:
            {
                return VendorVehicleProperty::VCU_APPFETRANSEGYAVRGNOW_F_56A;
            }
            case EViPropId_N80::VCU_INSNTFEGYCNSE_MILE_56A:
            {
                return VendorVehicleProperty::VCU_INSNTFEGYCNSE_MILE_56A;
            }
            case EViPropId_N80::FVEHDRVCNSEEGY_56A:
            {
                return VendorVehicleProperty::FVEHDRVCNSEEGY_56A;
            }
            case EViPropId_N80::FECCCNSEEGY_56A:
            {
                return VendorVehicleProperty::FECCCNSEEGY_56A;
            }
            case EViPropId_N80::FBHMCNSEEGY_56A:
            {
                return VendorVehicleProperty::FBHMCNSEEGY_56A;
            }
            case EViPropId_N80::FVEHACSYCNSEEGY_56A:
            {
                return VendorVehicleProperty::FVEHACSYCNSEEGY_56A;
            }
            case EViPropId_N80::FEGYRECOVEGY_56A:
            {
                return VendorVehicleProperty::FEGYRECOVEGY_56A;
            }
            case EViPropId_N80::FETRANSEGY_56A:
            {
                return VendorVehicleProperty::FETRANSEGY_56A;
            }
            case EViPropId_N80::VCU_AVRGCNSEEGYFROMLSTCHRG_558:
            {
                return VendorVehicleProperty::VCU_AVRGCNSEEGYFROMLSTCHRG_558;
            }
            case EViPropId_N80::VCU_AVRGCNSEEGYOFTRIPA_558:
            {
                return VendorVehicleProperty::VCU_AVRGCNSEEGYOFTRIPA_558;
            }
            case EViPropId_N80::VCU_AVRGCNSEEGYOFTRIPB_558:
            {
                return VendorVehicleProperty::VCU_AVRGCNSEEGYOFTRIPB_558;
            }
            case EViPropId_N80::RSTLASTREF_558:
            {
                return VendorVehicleProperty::RSTLASTREF_558;
            }
            case EViPropId_N80::AVRGCNSEENGFROMLSTCHRG_558:
            {
                return VendorVehicleProperty::AVRGCNSEENGFROMLSTCHRG_558;
            }
            case EViPropId_N80::AVRGCNSEEGYFROMLSTREF_558:
            {
                return VendorVehicleProperty::AVRGCNSEEGYFROMLSTREF_558;
            }
            case EViPropId_N80::AVRGCNSEENGFROMLSTREF_558:
            {
                return VendorVehicleProperty::AVRGCNSEENGFROMLSTREF_558;
            }
            case EViPropId_N80::AVRGCNSEENGOFTRIPA_558:
            {
                return VendorVehicleProperty::AVRGCNSEENGOFTRIPA_558;
            }
            case EViPropId_N80::AVRGCNSEENGOFTRIPB_558:
            {
                return VendorVehicleProperty::AVRGCNSEENGOFTRIPB_558;
            }
            case EViPropId_N80::SPD1CORSPEGYCUM_534:
            {
                return VendorVehicleProperty::SPD1CORSPEGYCUM_534;
            }
            case EViPropId_N80::SPD2CORSPEGYCUM_534:
            {
                return VendorVehicleProperty::SPD2CORSPEGYCUM_534;
            }
            case EViPropId_N80::SPD3CORSPEGYCUM_534:
            {
                return VendorVehicleProperty::SPD3CORSPEGYCUM_534;
            }
            case EViPropId_N80::SPD4CORSPEGYCUM_534:
            {
                return VendorVehicleProperty::SPD4CORSPEGYCUM_534;
            }
            case EViPropId_N80::SPD5CORSPEGYCUM_534:
            {
                return VendorVehicleProperty::SPD5CORSPEGYCUM_534;
            }
            case EViPropId_N80::SPD6CORSPEGYCUM_534:
            {
                return VendorVehicleProperty::SPD6CORSPEGYCUM_534;
            }
            case EViPropId_N80::SPD7CORSPEGYCUM_534:
            {
                return VendorVehicleProperty::SPD7CORSPEGYCUM_534;
            }
            case EViPropId_N80::SPD8CORSPEGYCUM_534:
            {
                return VendorVehicleProperty::SPD8CORSPEGYCUM_534;
            }
            case EViPropId_N80::SPD9CORSPEGYCUM_534:
            {
                return VendorVehicleProperty::SPD9CORSPEGYCUM_534;
            }
            case EViPropId_N80::SPD10CORSPEGYCUM_534:
            {
                return VendorVehicleProperty::SPD10CORSPEGYCUM_534;
            }
            case EViPropId_N80::SPD11CORSPEGYCUM_534:
            {
                return VendorVehicleProperty::SPD11CORSPEGYCUM_534;
            }
            case EViPropId_N80::SPD12CORSPEGYCUM_534:
            {
                return VendorVehicleProperty::SPD12CORSPEGYCUM_534;
            }
            case EViPropId_N80::SPD13CORSPEGYCUM_534:
            {
                return VendorVehicleProperty::SPD13CORSPEGYCUM_534;
            }
            case EViPropId_N80::SPD14CORSPEGYCUM_534:
            {
                return VendorVehicleProperty::SPD14CORSPEGYCUM_534;
            }
            case EViPropId_N80::SPD15CORSPEGYCUM_534:
            {
                return VendorVehicleProperty::SPD15CORSPEGYCUM_534;
            }
            case EViPropId_N80::VEHWEIGHT_534:
            {
                return VendorVehicleProperty::VEHWEIGHT_534;
            }
            case EViPropId_N80::EGYCUNMODEL_534:
            {
                return VendorVehicleProperty::EGYCUNMODEL_534;
            }
            case EViPropId_N80::SLOPRISCONSUINDEX_534:
            {
                return VendorVehicleProperty::SLOPRISCONSUINDEX_534;
            }
            case EViPropId_N80::SLOPDOWNCONSUINDEX_534:
            {
                return VendorVehicleProperty::SLOPDOWNCONSUINDEX_534;
            }
            case EViPropId_N80::ACCESSCONSUPOW_534:
            {
                return VendorVehicleProperty::ACCESSCONSUPOW_534;
            }
            case EViPropId_N80::FERRYCONSUM_534:
            {
                return VendorVehicleProperty::FERRYCONSUM_534;
            }
            case EViPropId_N80::MCUDRVMODSIG_127:
            {
                return VendorVehicleProperty::MCUDRVMODSIG_127;
            }
            case EViPropId_N80::WORMSPEEDSTA_25F:
            {
                return VendorVehicleProperty::WORMSPEEDSTA_25F;
            }
            case EViPropId_N80::INDMODDAMPERMODDIS_25F:
            {
                return VendorVehicleProperty::INDMODDAMPERMODDIS_25F;
            }
            case EViPropId_N80::ONEPEDLKEEPDISP_25F:
            {
                return VendorVehicleProperty::ONEPEDLKEEPDISP_25F;
            }
            case EViPropId_N80::MCUDRIRADICALDISPLAY_25F:
            {
                return VendorVehicleProperty::MCUDRIRADICALDISPLAY_25F;
            }
            case EViPropId_N80::INDMODEGYFBDIS_25F:
            {
                return VendorVehicleProperty::INDMODEGYFBDIS_25F;
            }
            case EViPropId_N80::MCUDRISTYLEFACTOR_25F:
            {
                return VendorVehicleProperty::MCUDRISTYLEFACTOR_25F;
            }
            case EViPropId_N80::ACCMODESTA_25F:
            {
                return VendorVehicleProperty::ACCMODESTA_25F;
            }
            case EViPropId_N80::BRAEGYRECOVINTENREQ_25F:
            {
                return VendorVehicleProperty::BRAEGYRECOVINTENREQ_25F;
            }
            case EViPropId_N80::INDMODSTEEMODDIS_25F:
            {
                return VendorVehicleProperty::INDMODSTEEMODDIS_25F;
            }
            case EViPropId_N80::INDMODCREMODDIS_25F:
            {
                return VendorVehicleProperty::INDMODCREMODDIS_25F;
            }
            case EViPropId_N80::CCSPEUNITAFF_48B:
            {
                return VendorVehicleProperty::CCSPEUNITAFF_48B;
            }
            case EViPropId_N80::VCU_BRAKE_ENGERY_RECOV_STA_48B:
            {
                return VendorVehicleProperty::VCU_BRAKE_ENGERY_RECOV_STA_48B;
            }
            case EViPropId_N80::VCUCCSTATEENUM_48B:
            {
                return VendorVehicleProperty::VCUCCSTATEENUM_48B;
            }
            case EViPropId_N80::VCUCCTIPSENUM_48B:
            {
                return VendorVehicleProperty::VCUCCTIPSENUM_48B;
            }
            case EViPropId_N80::VCUCCTARSPDKPH_48B:
            {
                return VendorVehicleProperty::VCUCCTARSPDKPH_48B;
            }
            case EViPropId_N80::VCU_LNCHCTRLTRIGRMN_48B:
            {
                return VendorVehicleProperty::VCU_LNCHCTRLTRIGRMN_48B;
            }
            case EViPropId_N80::VCU_LNCHCTRLMODDIRMN_48B:
            {
                return VendorVehicleProperty::VCU_LNCHCTRLMODDIRMN_48B;
            }
            case EViPropId_N80::VCU_EHUPWROFFENA_484:
            {
                return VendorVehicleProperty::VCU_EHUPWROFFENA_484;
            }
            case EViPropId_N80::VCU_DRVGMILGDISPPERC_484:
            {
                return VendorVehicleProperty::VCU_DRVGMILGDISPPERC_484;
            }
            case EViPropId_N80::VCU_DRVGMILGDISPPERCFLG_484:
            {
                return VendorVehicleProperty::VCU_DRVGMILGDISPPERCFLG_484;
            }
            case EViPropId_N80::VCU_REMBATTHEATGFAILREASON_511:
            {
                return VendorVehicleProperty::VCU_REMBATTHEATGFAILREASON_511;
            }
            case EViPropId_N80::CHARGEFFICIENCY_FLAG_392:
            {
                return VendorVehicleProperty::CHARGEFFICIENCY_FLAG_392;
            }
            case EViPropId_N80::RESETFLG_TRIPFROMLASTCHARGE_392:
            {
                return VendorVehicleProperty::RESETFLG_TRIPFROMLASTCHARGE_392;
            }
            case EViPropId_N80::PDCUFUELLEVELDISP_392:
            {
                return VendorVehicleProperty::PDCUFUELLEVELDISP_392;
            }
            case EViPropId_N80::PDCUHYDOPERMOD_392:
            {
                return VendorVehicleProperty::PDCUHYDOPERMOD_392;
            }
            case EViPropId_N80::CHARGEFFICIENCY_392:
            {
                return VendorVehicleProperty::CHARGEFFICIENCY_392;
            }
            case EViPropId_N80::PDCUFUMILGVLD_392:
            {
                return VendorVehicleProperty::PDCUFUMILGVLD_392;
            }
            case EViPropId_N80::PDCUFUMILGE_392:
            {
                return VendorVehicleProperty::PDCUFUMILGE_392;
            }
            case EViPropId_N80::TOTMILGE_392:
            {
                return VendorVehicleProperty::TOTMILGE_392;
            }
            case EViPropId_N80::ELECMILGE_392:
            {
                return VendorVehicleProperty::ELECMILGE_392;
            }
            case EViPropId_N80::RANGEDISPLAYCYCLE_392:
            {
                return VendorVehicleProperty::RANGEDISPLAYCYCLE_392;
            }
            case EViPropId_N80::PDCUREFSWITCHSTS_392:
            {
                return VendorVehicleProperty::PDCUREFSWITCHSTS_392;
            }
            case EViPropId_N80::PDCUREFUNOTALLWD_392:
            {
                return VendorVehicleProperty::PDCUREFUNOTALLWD_392;
            }
            case EViPropId_N80::PDCUFUFILRDOORRMN_392:
            {
                return VendorVehicleProperty::PDCUFUFILRDOORRMN_392;
            }
            case EViPropId_N80::PDCUFUTANKRELSPROGS_392:
            {
                return VendorVehicleProperty::PDCUFUTANKRELSPROGS_392;
            }
            case EViPropId_N80::PDCUENGSYSTWARN_392:
            {
                return VendorVehicleProperty::PDCUENGSYSTWARN_392;
            }
            case EViPropId_N80::REXERRDISP_392:
            {
                return VendorVehicleProperty::REXERRDISP_392;
            }
            case EViPropId_N80::PWRSYSSELFCHKFLTPROMT_392:
            {
                return VendorVehicleProperty::PWRSYSSELFCHKFLTPROMT_392;
            }
            case EViPropId_N80::ENGCONSUMAV_392:
            {
                return VendorVehicleProperty::ENGCONSUMAV_392;
            }
            case EViPropId_N80::PDCUTANKCOVERUNLCK_392:
            {
                return VendorVehicleProperty::PDCUTANKCOVERUNLCK_392;
            }
            case EViPropId_N80::PDCUBMSTEMPLOWDRVLIMITHINT_392:
            {
                return VendorVehicleProperty::PDCUBMSTEMPLOWDRVLIMITHINT_392;
            }
            case EViPropId_N80::ENRGMODREJHINT_392:
            {
                return VendorVehicleProperty::ENRGMODREJHINT_392;
            }
            case EViPropId_N80::PDCUENRGMODFLTHINT_392:
            {
                return VendorVehicleProperty::PDCUENRGMODFLTHINT_392;
            }
            case EViPropId_N80::PDCUEVST_392:
            {
                return VendorVehicleProperty::PDCUEVST_392;
            }
            case EViPropId_N80::PDCUPARKCHARGEST_392:
            {
                return VendorVehicleProperty::PDCUPARKCHARGEST_392;
            }
            case EViPropId_N80::PDCUEMISSTESTMODST_392:
            {
                return VendorVehicleProperty::PDCUEMISSTESTMODST_392;
            }
            case EViPropId_N80::PDCUIDLEMODST_392:
            {
                return VendorVehicleProperty::PDCUIDLEMODST_392;
            }
            case EViPropId_N80::TBOX_EXHIBCARMODDISABLENOTICE_5ED:
            {
                return VendorVehicleProperty::TBOX_EXHIBCARMODDISABLENOTICE_5ED;
            }
            case EViPropId_N80::AEBACTV_183:
            {
                return VendorVehicleProperty::AEBACTV_183;
            }
            case EViPropId_N80::ACONOFFSTSDISP1_271:
            {
                return VendorVehicleProperty::ACONOFFSTSDISP1_271;
            }
            case EViPropId_N80::ACONOFFSTSDISP2_271:
            {
                return VendorVehicleProperty::ACONOFFSTSDISP2_271;
            }
            case EViPropId_N80::ACONOFFSTSDISP3_271:
            {
                return VendorVehicleProperty::ACONOFFSTSDISP3_271;
            }
            case EViPropId_N80::ACBLOWRLELDISP1_271:
            {
                return VendorVehicleProperty::ACBLOWRLELDISP1_271;
            }
            case EViPropId_N80::ACBLOWRLELDISP3_271:
            {
                return VendorVehicleProperty::ACBLOWRLELDISP3_271;
            }
            case EViPropId_N80::ACBLOWRLELDISP5_271:
            {
                return VendorVehicleProperty::ACBLOWRLELDISP5_271;
            }
            case EViPropId_N80::ACLETDISP1_271:
            {
                return VendorVehicleProperty::ACLETDISP1_271;
            }
            case EViPropId_N80::ACRITDISP1_271:
            {
                return VendorVehicleProperty::ACRITDISP1_271;
            }
            case EViPropId_N80::ACLETDISP2_271:
            {
                return VendorVehicleProperty::ACLETDISP2_271;
            }
            case EViPropId_N80::ACLETDISP3_271:
            {
                return VendorVehicleProperty::ACLETDISP3_271;
            }
            case EViPropId_N80::ACLEAIRDISTBNDISP1_271:
            {
                return VendorVehicleProperty::ACLEAIRDISTBNDISP1_271;
            }
            case EViPropId_N80::ACRIAIRDISTBNDISP1_271:
            {
                return VendorVehicleProperty::ACRIAIRDISTBNDISP1_271;
            }
            case EViPropId_N80::ACLEAIRDISTBNDISP2_271:
            {
                return VendorVehicleProperty::ACLEAIRDISTBNDISP2_271;
            }
            case EViPropId_N80::ACLEAIRDISTBNDISP3_271:
            {
                return VendorVehicleProperty::ACLEAIRDISTBNDISP3_271;
            }
            case EViPropId_N80::ACDEFRSTDISP_271:
            {
                return VendorVehicleProperty::ACDEFRSTDISP_271;
            }
            case EViPropId_N80::ACRECIRCDISP_271:
            {
                return VendorVehicleProperty::ACRECIRCDISP_271;
            }
            case EViPropId_N80::ACLEAUTODISP1_271:
            {
                return VendorVehicleProperty::ACLEAUTODISP1_271;
            }
            case EViPropId_N80::ACLEAUTODISP2_271:
            {
                return VendorVehicleProperty::ACLEAUTODISP2_271;
            }
            case EViPropId_N80::ACACDISP_271:
            {
                return VendorVehicleProperty::ACACDISP_271;
            }
            case EViPropId_N80::ACDUALDISP_271:
            {
                return VendorVehicleProperty::ACDUALDISP_271;
            }
            case EViPropId_N80::ACECODISP_271:
            {
                return VendorVehicleProperty::ACECODISP_271;
            }
            case EViPropId_N80::ACAQSDISP_271:
            {
                return VendorVehicleProperty::ACAQSDISP_271;
            }
            case EViPropId_N80::ACAIRCLNSTSDISP_271:
            {
                return VendorVehicleProperty::ACAIRCLNSTSDISP_271;
            }
            case EViPropId_N80::ACQUICKCOOLSTSDISP_271:
            {
                return VendorVehicleProperty::ACQUICKCOOLSTSDISP_271;
            }
            case EViPropId_N80::ACQUICKHEATSTSDISP_271:
            {
                return VendorVehicleProperty::ACQUICKHEATSTSDISP_271;
            }
            case EViPropId_N80::ACSELFSTSDISP_271:
            {
                return VendorVehicleProperty::ACSELFSTSDISP_271;
            }
            case EViPropId_N80::ACCMFTSTSDISP_271:
            {
                return VendorVehicleProperty::ACCMFTSTSDISP_271;
            }
            case EViPropId_N80::WION_RUNSTS_271:
            {
                return VendorVehicleProperty::WION_RUNSTS_271;
            }
            case EViPropId_N80::ECC_AQSAIRQUALITYLEVEL_271:
            {
                return VendorVehicleProperty::ECC_AQSAIRQUALITYLEVEL_271;
            }
            case EViPropId_N80::L_PM25_INDEN_271:
            {
                return VendorVehicleProperty::L_PM25_INDEN_271;
            }
            case EViPropId_N80::OUTDT_3F2:
            {
                return VendorVehicleProperty::OUTDT_3F2;
            }
            case EViPropId_N80::ECC_HEATMNGTSYSFLT_55A:
            {
                return VendorVehicleProperty::ECC_HEATMNGTSYSFLT_55A;
            }
            case EViPropId_N80::PDCUENRGMOD_3D0:
            {
                return VendorVehicleProperty::PDCUENRGMOD_3D0;
            }
            case EViPropId_N80::ACCHRGSHTTRSTS_356:
            {
                return VendorVehicleProperty::ACCHRGSHTTRSTS_356;
            }
            case EViPropId_N80::DOORSLDCENTRALLOCKSTS_RL_248:
            {
                return VendorVehicleProperty::DOORSLDCENTRALLOCKSTS_RL_248;
            }
            case EViPropId_N80::DOORSLDWARNANTIPINCH_RL_248:
            {
                return VendorVehicleProperty::DOORSLDWARNANTIPINCH_RL_248;
            }
            case EViPropId_N80::DOORSLDWARNDURNGDOORMOV_RL_248:
            {
                return VendorVehicleProperty::DOORSLDWARNDURNGDOORMOV_RL_248;
            }
            case EViPropId_N80::DOORSLDWARNSTPDURNGDOORMOV_RL_248:
            {
                return VendorVehicleProperty::DOORSLDWARNSTPDURNGDOORMOV_RL_248;
            }
            case EViPropId_N80::DOORSLDWARNOPRTNOTSUCCSS_RL_248:
            {
                return VendorVehicleProperty::DOORSLDWARNOPRTNOTSUCCSS_RL_248;
            }
            case EViPropId_N80::DOORSLDWARNDISBYWINPOSSTS_RL_248:
            {
                return VendorVehicleProperty::DOORSLDWARNDISBYWINPOSSTS_RL_248;
            }
            case EViPropId_N80::DOORSLDWARNDISBYCHGPORTSTS_RL_248:
            {
                return VendorVehicleProperty::DOORSLDWARNDISBYCHGPORTSTS_RL_248;
            }
            case EViPropId_N80::DOORSLDWARNREASON_RL_248:
            {
                return VendorVehicleProperty::DOORSLDWARNREASON_RL_248;
            }
            case EViPropId_N80::DOORSLDFAULTSTS_RL_248:
            {
                return VendorVehicleProperty::DOORSLDFAULTSTS_RL_248;
            }
            case EViPropId_N80::DOORSLDSTS_RL_248:
            {
                return VendorVehicleProperty::DOORSLDSTS_RL_248;
            }
            case EViPropId_N80::DOORSLDWARNABUSESTS_RL_248:
            {
                return VendorVehicleProperty::DOORSLDWARNABUSESTS_RL_248;
            }
            case EViPropId_N80::DRVRDOOROPENSTSSWT_226:
            {
                return VendorVehicleProperty::DRVRDOOROPENSTSSWT_226;
            }
            case EViPropId_N80::RELEDOOROPENSTSSWT_226:
            {
                return VendorVehicleProperty::RELEDOOROPENSTSSWT_226;
            }
            case EViPropId_N80::HOODLIDOPENSTSSWT_226:
            {
                return VendorVehicleProperty::HOODLIDOPENSTSSWT_226;
            }
            case EViPropId_N80::FRNTLELOBEAMCMDOUTP_226:
            {
                return VendorVehicleProperty::FRNTLELOBEAMCMDOUTP_226;
            }
            case EViPropId_N80::FRNTRILOBEAMCMDOUTP_226:
            {
                return VendorVehicleProperty::FRNTRILOBEAMCMDOUTP_226;
            }
            case EViPropId_N80::FRNTLEHIBEAMCMDOUTP_226:
            {
                return VendorVehicleProperty::FRNTLEHIBEAMCMDOUTP_226;
            }
            case EViPropId_N80::FRNTRIHIBEAMCMDOUTP_226:
            {
                return VendorVehicleProperty::FRNTRIHIBEAMCMDOUTP_226;
            }
            case EViPropId_N80::FRNTLEPOSNLAMPCMD_226:
            {
                return VendorVehicleProperty::FRNTLEPOSNLAMPCMD_226;
            }
            case EViPropId_N80::RELEPOSNLAMPCMD_226:
            {
                return VendorVehicleProperty::RELEPOSNLAMPCMD_226;
            }
            case EViPropId_N80::FRNTLETURNLICMD_226:
            {
                return VendorVehicleProperty::FRNTLETURNLICMD_226;
            }
            case EViPropId_N80::FRNTRITURNLICMD_226:
            {
                return VendorVehicleProperty::FRNTRITURNLICMD_226;
            }
            case EViPropId_N80::CENTRHIMNTDBRKLAMPCMD_226:
            {
                return VendorVehicleProperty::CENTRHIMNTDBRKLAMPCMD_226;
            }
            case EViPropId_N80::RELEBRKLAMPCMD_226:
            {
                return VendorVehicleProperty::RELEBRKLAMPCMD_226;
            }
            case EViPropId_N80::RERIBRKLAMPCMD_226:
            {
                return VendorVehicleProperty::RERIBRKLAMPCMD_226;
            }
            case EViPropId_N80::FRNTRIPOSNLAMPFAILRSTS_226:
            {
                return VendorVehicleProperty::FRNTRIPOSNLAMPFAILRSTS_226;
            }
            case EViPropId_N80::FRNTRIPOSNLAMPCMD_226:
            {
                return VendorVehicleProperty::FRNTRIPOSNLAMPCMD_226;
            }
            case EViPropId_N80::RERIPOSNLAMPCMD_226:
            {
                return VendorVehicleProperty::RERIPOSNLAMPCMD_226;
            }
            case EViPropId_N80::HEADLIGHTHEIGHADSTSTS_226:
            {
                return VendorVehicleProperty::HEADLIGHTHEIGHADSTSTS_226;
            }
            case EViPropId_N80::RERIPOSNLAMPFAILRSTS_226:
            {
                return VendorVehicleProperty::RERIPOSNLAMPFAILRSTS_226;
            }
            case EViPropId_N80::FRNTLETURNLIFAILRSTS_226:
            {
                return VendorVehicleProperty::FRNTLETURNLIFAILRSTS_226;
            }
            case EViPropId_N80::RELETURNLIFAILRSTS_226:
            {
                return VendorVehicleProperty::RELETURNLIFAILRSTS_226;
            }
            case EViPropId_N80::FRNTRITURNLIFAILRSTS_226:
            {
                return VendorVehicleProperty::FRNTRITURNLIFAILRSTS_226;
            }
            case EViPropId_N80::RERITURNLIFAILRSTS_226:
            {
                return VendorVehicleProperty::RERITURNLIFAILRSTS_226;
            }
            case EViPropId_N80::FRNTLEPOSNLAMPFAILRSTS_226:
            {
                return VendorVehicleProperty::FRNTLEPOSNLAMPFAILRSTS_226;
            }
            case EViPropId_N80::RELEPOSNLAMPFAILRSTS_226:
            {
                return VendorVehicleProperty::RELEPOSNLAMPFAILRSTS_226;
            }
            case EViPropId_N80::CENTRHIMNTDBRKLAMPFAILRSTS_226:
            {
                return VendorVehicleProperty::CENTRHIMNTDBRKLAMPFAILRSTS_226;
            }
            case EViPropId_N80::RELEBRKLAMPFAILRSTS_226:
            {
                return VendorVehicleProperty::RELEBRKLAMPFAILRSTS_226;
            }
            case EViPropId_N80::RERIBRKLAMPFAILRSTS_226:
            {
                return VendorVehicleProperty::RERIBRKLAMPFAILRSTS_226;
            }
            case EViPropId_N80::LICENSELAMPFAILRSTS_226:
            {
                return VendorVehicleProperty::LICENSELAMPFAILRSTS_226;
            }
            case EViPropId_N80::FRNTLELOBEAMFAILRSTS_226:
            {
                return VendorVehicleProperty::FRNTLELOBEAMFAILRSTS_226;
            }
            case EViPropId_N80::FRNTRILOBEAMFAILRSTS_226:
            {
                return VendorVehicleProperty::FRNTRILOBEAMFAILRSTS_226;
            }
            case EViPropId_N80::FRNTLEHIBEAMFAILRSTS_226:
            {
                return VendorVehicleProperty::FRNTLEHIBEAMFAILRSTS_226;
            }
            case EViPropId_N80::FRNTRIHIBEAMFAILRSTS_226:
            {
                return VendorVehicleProperty::FRNTRIHIBEAMFAILRSTS_226;
            }
            case EViPropId_N80::VIU_MLSEATZGMFEEDBACK_226:
            {
                return VendorVehicleProperty::VIU_MLSEATZGMFEEDBACK_226;
            }
            case EViPropId_N80::WASHCARMODAUTOWIPRSTS_226:
            {
                return VendorVehicleProperty::WASHCARMODAUTOWIPRSTS_226;
            }
            case EViPropId_N80::DOORSLDCENTRALLOCKSTS_RR_249:
            {
                return VendorVehicleProperty::DOORSLDCENTRALLOCKSTS_RR_249;
            }
            case EViPropId_N80::DOORSLDWARNANTIPINCH_RR_249:
            {
                return VendorVehicleProperty::DOORSLDWARNANTIPINCH_RR_249;
            }
            case EViPropId_N80::DOORSLDWARNDURNGDOORMOV_RR_249:
            {
                return VendorVehicleProperty::DOORSLDWARNDURNGDOORMOV_RR_249;
            }
            case EViPropId_N80::DOORSLDWARNSTPDURNGDOORMOV_RR_249:
            {
                return VendorVehicleProperty::DOORSLDWARNSTPDURNGDOORMOV_RR_249;
            }
            case EViPropId_N80::DOORSLDWARNOPRTNOTSUCCSS_RR_249:
            {
                return VendorVehicleProperty::DOORSLDWARNOPRTNOTSUCCSS_RR_249;
            }
            case EViPropId_N80::DOORSLDWARNDISBYWINPOSSTS_RR_249:
            {
                return VendorVehicleProperty::DOORSLDWARNDISBYWINPOSSTS_RR_249;
            }
            case EViPropId_N80::DOORSLDWARNDISBYFUELPORTSTS_RR_249:
            {
                return VendorVehicleProperty::DOORSLDWARNDISBYFUELPORTSTS_RR_249;
            }
            case EViPropId_N80::DOORSLDWARNREASON_RR_249:
            {
                return VendorVehicleProperty::DOORSLDWARNREASON_RR_249;
            }
            case EViPropId_N80::DOORSLDFAULTSTS_RR_249:
            {
                return VendorVehicleProperty::DOORSLDFAULTSTS_RR_249;
            }
            case EViPropId_N80::DOORSLDSTS_RR_249:
            {
                return VendorVehicleProperty::DOORSLDSTS_RR_249;
            }
            case EViPropId_N80::DOORSLDWARNABUSESTS_RR_249:
            {
                return VendorVehicleProperty::DOORSLDWARNABUSESTS_RR_249;
            }
            case EViPropId_N80::PASSDOOROPENSTSSWT_227:
            {
                return VendorVehicleProperty::PASSDOOROPENSTSSWT_227;
            }
            case EViPropId_N80::RERIDOOROPENSTSSWT_227:
            {
                return VendorVehicleProperty::RERIDOOROPENSTSSWT_227;
            }
            case EViPropId_N80::REFOGLICMD_227:
            {
                return VendorVehicleProperty::REFOGLICMD_227;
            }
            case EViPropId_N80::REFOGLIFAILRSTS_227:
            {
                return VendorVehicleProperty::REFOGLIFAILRSTS_227;
            }
            case EViPropId_N80::RVSLAMPFAILRSTS_227:
            {
                return VendorVehicleProperty::RVSLAMPFAILRSTS_227;
            }
            case EViPropId_N80::VIU_RLSEATZGMFEEDBACK_227:
            {
                return VendorVehicleProperty::VIU_RLSEATZGMFEEDBACK_227;
            }
            case EViPropId_N80::PLGM_SOUNDREMDNGREQ_EHU_488:
            {
                return VendorVehicleProperty::PLGM_SOUNDREMDNGREQ_EHU_488;
            }
            case EViPropId_N80::PLGM_SYSFLTINDCN_488:
            {
                return VendorVehicleProperty::PLGM_SYSFLTINDCN_488;
            }
            case EViPropId_N80::PLGM_TRSWTSTSINDCN_488:
            {
                return VendorVehicleProperty::PLGM_TRSWTSTSINDCN_488;
            }
            case EViPropId_N80::PLGM_ANTIPINCHSTS_488:
            {
                return VendorVehicleProperty::PLGM_ANTIPINCHSTS_488;
            }
            case EViPropId_N80::PWC_CRTSTS_5A4:
            {
                return VendorVehicleProperty::PWC_CRTSTS_5A4;
            }
            case EViPropId_N80::PWC_SOFTSWSTS_5A4:
            {
                return VendorVehicleProperty::PWC_SOFTSWSTS_5A4;
            }
            case EViPropId_N80::PWC_PHONEFGTRND_5A4:
            {
                return VendorVehicleProperty::PWC_PHONEFGTRND_5A4;
            }
            case EViPropId_N80::PWC_LVPMSTS_5A4:
            {
                return VendorVehicleProperty::PWC_LVPMSTS_5A4;
            }
            case EViPropId_N80::PWC_DYNLVPMLVLFB_5A4:
            {
                return VendorVehicleProperty::PWC_DYNLVPMLVLFB_5A4;
            }
            case EViPropId_N80::PWC_STATLVPMLVLFB_5A4:
            {
                return VendorVehicleProperty::PWC_STATLVPMLVLFB_5A4;
            }
            case EViPropId_N80::BDCEXTRLAMPSTS_2D2:
            {
                return VendorVehicleProperty::BDCEXTRLAMPSTS_2D2;
            }
            case EViPropId_N80::MIRRFADEREQSTS_2D2:
            {
                return VendorVehicleProperty::MIRRFADEREQSTS_2D2;
            }
            case EViPropId_N80::DAYTIRUNNGLAMPSWTSTS_2D2:
            {
                return VendorVehicleProperty::DAYTIRUNNGLAMPSWTSTS_2D2;
            }
            case EViPropId_N80::REFOGLAMPSWT_2D2:
            {
                return VendorVehicleProperty::REFOGLAMPSWT_2D2;
            }
            case EViPropId_N80::TBOX_OTAMOD_327:
            {
                return VendorVehicleProperty::TBOX_OTAMOD_327;
            }
            case EViPropId_N80::BDCVEHMOD_2F1:
            {
                return VendorVehicleProperty::BDCVEHMOD_2F1;
            }
            case EViPropId_N80::BCMODOTOTDST_2F1:
            {
                return VendorVehicleProperty::BCMODOTOTDST_2F1;
            }
            case EViPropId_N80::BCMODOOFFS_2F1:
            {
                return VendorVehicleProperty::BCMODOOFFS_2F1;
            }
            case EViPropId_N80::BCMODOTOTDSTVLD_2F1:
            {
                return VendorVehicleProperty::BCMODOTOTDSTVLD_2F1;
            }
            case EViPropId_N80::BCMODORSTCNTR_2F1:
            {
                return VendorVehicleProperty::BCMODORSTCNTR_2F1;
            }
            case EViPropId_N80::PIATWSBEFORE_2F1:
            {
                return VendorVehicleProperty::PIATWSBEFORE_2F1;
            }
            case EViPropId_N80::SELRI_287:
            {
                return VendorVehicleProperty::SELRI_287;
            }
            case EViPropId_N80::VOLUP_287:
            {
                return VendorVehicleProperty::VOLUP_287;
            }
            case EViPropId_N80::VOLDWN_287:
            {
                return VendorVehicleProperty::VOLDWN_287;
            }
            case EViPropId_N80::MOVEPREV_287:
            {
                return VendorVehicleProperty::MOVEPREV_287;
            }
            case EViPropId_N80::MOVENEXT_287:
            {
                return VendorVehicleProperty::MOVENEXT_287;
            }
            case EViPropId_N80::USRDEFDKEY_287:
            {
                return VendorVehicleProperty::USRDEFDKEY_287;
            }
            case EViPropId_N80::ICCSPEECHRECOGKEY_287:
            {
                return VendorVehicleProperty::ICCSPEECHRECOGKEY_287;
            }
            case EViPropId_N80::VOLMUTE_287:
            {
                return VendorVehicleProperty::VOLMUTE_287;
            }
            case EViPropId_N80::AMP_EQMODE_35B:
            {
                return VendorVehicleProperty::AMP_EQMODE_35B;
            }
            case EViPropId_N80::AMP_2DSURROUNDSTA_35B:
            {
                return VendorVehicleProperty::AMP_2DSURROUNDSTA_35B;
            }
            case EViPropId_N80::AMP_3DCHIMETURNSTA_35B:
            {
                return VendorVehicleProperty::AMP_3DCHIMETURNSTA_35B;
            }
            case EViPropId_N80::AMP_3DCHIMEPARKINGSTA_35B:
            {
                return VendorVehicleProperty::AMP_3DCHIMEPARKINGSTA_35B;
            }
            case EViPropId_N80::AMP_3DCHIMEBLINDSTA_35B:
            {
                return VendorVehicleProperty::AMP_3DCHIMEBLINDSTA_35B;
            }
            case EViPropId_N80::AMP_EQ1STEPBACK_35B:
            {
                return VendorVehicleProperty::AMP_EQ1STEPBACK_35B;
            }
            case EViPropId_N80::AMP_EQ2STEPBACK_35B:
            {
                return VendorVehicleProperty::AMP_EQ2STEPBACK_35B;
            }
            case EViPropId_N80::AMP_LISTENINGPOSNSTA_35B:
            {
                return VendorVehicleProperty::AMP_LISTENINGPOSNSTA_35B;
            }
            case EViPropId_N80::AMP_EQ3STEPBACK_35B:
            {
                return VendorVehicleProperty::AMP_EQ3STEPBACK_35B;
            }
            case EViPropId_N80::AMP_VIRTSOUNDFIELDSTA_35B:
            {
                return VendorVehicleProperty::AMP_VIRTSOUNDFIELDSTA_35B;
            }
            case EViPropId_N80::AMP_EQ4STEPBACK_35B:
            {
                return VendorVehicleProperty::AMP_EQ4STEPBACK_35B;
            }
            case EViPropId_N80::AMP_DRVRMODSTA_35B:
            {
                return VendorVehicleProperty::AMP_DRVRMODSTA_35B;
            }
            case EViPropId_N80::AMP_EQ5STEPBACK_35B:
            {
                return VendorVehicleProperty::AMP_EQ5STEPBACK_35B;
            }
            case EViPropId_N80::AMP_MUTECTRLSTS_35B:
            {
                return VendorVehicleProperty::AMP_MUTECTRLSTS_35B;
            }
            case EViPropId_N80::AMP_VSCMODSTS_35B:
            {
                return VendorVehicleProperty::AMP_VSCMODSTS_35B;
            }
            case EViPropId_N80::AMP_EQ6STEPBACK_35B:
            {
                return VendorVehicleProperty::AMP_EQ6STEPBACK_35B;
            }
            case EViPropId_N80::AMP_EQ7STEPBACK_35B:
            {
                return VendorVehicleProperty::AMP_EQ7STEPBACK_35B;
            }
            case EViPropId_N80::AMP_INITSTATUS_35B:
            {
                return VendorVehicleProperty::AMP_INITSTATUS_35B;
            }
            case EViPropId_N80::AMP_SOUNDEFFECTSTA_35B:
            {
                return VendorVehicleProperty::AMP_SOUNDEFFECTSTA_35B;
            }
            case EViPropId_N80::ALMUSICRHYMODSTS_3E8:
            {
                return VendorVehicleProperty::ALMUSICRHYMODSTS_3E8;
            }
            case EViPropId_N80::ALSPDRHYMODSTS_3E8:
            {
                return VendorVehicleProperty::ALSPDRHYMODSTS_3E8;
            }
            case EViPropId_N80::ALBRILESTS_3E8:
            {
                return VendorVehicleProperty::ALBRILESTS_3E8;
            }
            case EViPropId_N80::ALWELMODSTS_3E8:
            {
                return VendorVehicleProperty::ALWELMODSTS_3E8;
            }
            case EViPropId_N80::ALDRVMODSTS_3E8:
            {
                return VendorVehicleProperty::ALDRVMODSTS_3E8;
            }
            case EViPropId_N80::ALSTS_3E8:
            {
                return VendorVehicleProperty::ALSTS_3E8;
            }
            case EViPropId_N80::ALFRONTZONESTS_3E8:
            {
                return VendorVehicleProperty::ALFRONTZONESTS_3E8;
            }
            case EViPropId_N80::ALREARZONESTS_3E8:
            {
                return VendorVehicleProperty::ALREARZONESTS_3E8;
            }
            case EViPropId_N80::ALROOFZONESTS_3E8:
            {
                return VendorVehicleProperty::ALROOFZONESTS_3E8;
            }
            case EViPropId_N80::ALIPZONESTS_3E8:
            {
                return VendorVehicleProperty::ALIPZONESTS_3E8;
            }
            case EViPropId_N80::ALBRIAUTOSTS_3E8:
            {
                return VendorVehicleProperty::ALBRIAUTOSTS_3E8;
            }
            case EViPropId_N80::ALCLRCSTMSTS_3E8:
            {
                return VendorVehicleProperty::ALCLRCSTMSTS_3E8;
            }
            case EViPropId_N80::ALRECMODSTS_3E8:
            {
                return VendorVehicleProperty::ALRECMODSTS_3E8;
            }
            case EViPropId_N80::ALBRIBREAMODSTS_3E8:
            {
                return VendorVehicleProperty::ALBRIBREAMODSTS_3E8;
            }
            case EViPropId_N80::ALDOWARSTS_3E8:
            {
                return VendorVehicleProperty::ALDOWARSTS_3E8;
            }
            case EViPropId_N80::ALSPCHSTS_3E8:
            {
                return VendorVehicleProperty::ALSPCHSTS_3E8;
            }
            case EViPropId_N80::ALCSTMSTS_3E8:
            {
                return VendorVehicleProperty::ALCSTMSTS_3E8;
            }
            case EViPropId_N80::ALACMODSTS_3E8:
            {
                return VendorVehicleProperty::ALACMODSTS_3E8;
            }
            case EViPropId_N80::ALMOBCHAMODSTS_3E8:
            {
                return VendorVehicleProperty::ALMOBCHAMODSTS_3E8;
            }
            case EViPropId_N80::ALMOBFGTREMDSTS_3E8:
            {
                return VendorVehicleProperty::ALMOBFGTREMDSTS_3E8;
            }
            case EViPropId_N80::ALCLRMODSTS_3E8:
            {
                return VendorVehicleProperty::ALCLRMODSTS_3E8;
            }
            case EViPropId_N80::EPSFLTSTS_129:
            {
                return VendorVehicleProperty::EPSFLTSTS_129;
            }
            case EViPropId_N80::EPSMODESTA_129:
            {
                return VendorVehicleProperty::EPSMODESTA_129;
            }
            case EViPropId_N80::OHPACTV_1BC:
            {
                return VendorVehicleProperty::OHPACTV_1BC;
            }
            case EViPropId_N80::TIRESYSWARN_295:
            {
                return VendorVehicleProperty::TIRESYSWARN_295;
            }
            case EViPropId_N80::LERETIRET_295:
            {
                return VendorVehicleProperty::LERETIRET_295;
            }
            case EViPropId_N80::LEFRNTTIRET_295:
            {
                return VendorVehicleProperty::LEFRNTTIRET_295;
            }
            case EViPropId_N80::RIFRNTTIRET_295:
            {
                return VendorVehicleProperty::RIFRNTTIRET_295;
            }
            case EViPropId_N80::RIRETIRET_295:
            {
                return VendorVehicleProperty::RIRETIRET_295;
            }
            case EViPropId_N80::TIRELEFRNTPWARN_295:
            {
                return VendorVehicleProperty::TIRELEFRNTPWARN_295;
            }
            case EViPropId_N80::LEFRNTP_295:
            {
                return VendorVehicleProperty::LEFRNTP_295;
            }
            case EViPropId_N80::RIFRNTP_295:
            {
                return VendorVehicleProperty::RIFRNTP_295;
            }
            case EViPropId_N80::RIREP_295:
            {
                return VendorVehicleProperty::RIREP_295;
            }
            case EViPropId_N80::LEREP_295:
            {
                return VendorVehicleProperty::LEREP_295;
            }
            case EViPropId_N80::TIRELEREPWARN_295:
            {
                return VendorVehicleProperty::TIRELEREPWARN_295;
            }
            case EViPropId_N80::RSM_SSLMOVSTSFB_307:
            {
                return VendorVehicleProperty::RSM_SSLMOVSTSFB_307;
            }
            case EViPropId_N80::RSM_SSPOSITIONFB_307:
            {
                return VendorVehicleProperty::RSM_SSPOSITIONFB_307;
            }
            case EViPropId_N80::RSM_REARSSOPENPERC_307:
            {
                return VendorVehicleProperty::RSM_REARSSOPENPERC_307;
            }
            case EViPropId_N80::RSM_SSINITIALIZINGSTS_307:
            {
                return VendorVehicleProperty::RSM_SSINITIALIZINGSTS_307;
            }
            case EViPropId_N80::RSM_REARSSSTS_307:
            {
                return VendorVehicleProperty::RSM_REARSSSTS_307;
            }
            case EViPropId_N80::RSM_LOCKAUTOCLSSUNSSWTFB_307:
            {
                return VendorVehicleProperty::RSM_LOCKAUTOCLSSUNSSWTFB_307;
            }
            case EViPropId_N80::MAS_FL_DRVRMASSGINTENST_307:
            {
                return VendorVehicleProperty::MAS_FL_DRVRMASSGINTENST_307;
            }
            case EViPropId_N80::MAS_RL1_SEATBACKMASSGINTENST_307:
            {
                return VendorVehicleProperty::MAS_RL1_SEATBACKMASSGINTENST_307;
            }
            case EViPropId_N80::MAS_RL2_SEATCUSHIONMASSGINTENST_307:
            {
                return VendorVehicleProperty::MAS_RL2_SEATCUSHIONMASSGINTENST_307;
            }
            case EViPropId_N80::MAS_FL_DRVRMASSGMODST_307:
            {
                return VendorVehicleProperty::MAS_FL_DRVRMASSGMODST_307;
            }
            case EViPropId_N80::MAS_RL1_SEATBACKMASSGMODST_307:
            {
                return VendorVehicleProperty::MAS_RL1_SEATBACKMASSGMODST_307;
            }
            case EViPropId_N80::MAS_RL2_SEATCUSHIONMASSGMODST_307:
            {
                return VendorVehicleProperty::MAS_RL2_SEATCUSHIONMASSGMODST_307;
            }
            case EViPropId_N80::MAS_FR_DRVRMASSGINTENST_367:
            {
                return VendorVehicleProperty::MAS_FR_DRVRMASSGINTENST_367;
            }
            case EViPropId_N80::MAS_RR1_SEATBACKMASSGINTENST_367:
            {
                return VendorVehicleProperty::MAS_RR1_SEATBACKMASSGINTENST_367;
            }
            case EViPropId_N80::MAS_RR2_SEATCUSHIONMASSGINTENST_367:
            {
                return VendorVehicleProperty::MAS_RR2_SEATCUSHIONMASSGINTENST_367;
            }
            case EViPropId_N80::MAS_FR_DRVRMASSGMODST_367:
            {
                return VendorVehicleProperty::MAS_FR_DRVRMASSGMODST_367;
            }
            case EViPropId_N80::MAS_RR1_SEATBACKMASSGMODST_367:
            {
                return VendorVehicleProperty::MAS_RR1_SEATBACKMASSGMODST_367;
            }
            case EViPropId_N80::MAS_RR2_SEATCUSHIONMASSGMODST_367:
            {
                return VendorVehicleProperty::MAS_RR2_SEATCUSHIONMASSGMODST_367;
            }
            case EViPropId_N80::IRM_NOTWORKREASON_36B:
            {
                return VendorVehicleProperty::IRM_NOTWORKREASON_36B;
            }
            case EViPropId_N80::IRM_OFFREASON_36B:
            {
                return VendorVehicleProperty::IRM_OFFREASON_36B;
            }
            case EViPropId_N80::IRM_MODSTS_36B:
            {
                return VendorVehicleProperty::IRM_MODSTS_36B;
            }
            case EViPropId_N80::IRM_TSTORG_36B:
            {
                return VendorVehicleProperty::IRM_TSTORG_36B;
            }
            case EViPropId_N80::IRM_CHILDLOCKSTS_36B:
            {
                return VendorVehicleProperty::IRM_CHILDLOCKSTS_36B;
            }
            case EViPropId_N80::IRM_DOOROPENWARN_36B:
            {
                return VendorVehicleProperty::IRM_DOOROPENWARN_36B;
            }
            case EViPropId_N80::IRM_DOORSTS_36B:
            {
                return VendorVehicleProperty::IRM_DOORSTS_36B;
            }
            case EViPropId_N80::IRM_UVSTS_36B:
            {
                return VendorVehicleProperty::IRM_UVSTS_36B;
            }
            case EViPropId_N80::IRM_WORKTIMER_36B:
            {
                return VendorVehicleProperty::IRM_WORKTIMER_36B;
            }
            case EViPropId_N80::IRM_DELAYEDWORKST_36B:
            {
                return VendorVehicleProperty::IRM_DELAYEDWORKST_36B;
            }
            case EViPropId_N80::IRM_WORKTIMERLEFT_36B:
            {
                return VendorVehicleProperty::IRM_WORKTIMERLEFT_36B;
            }
            case EViPropId_N80::IRM_INBOXT_36B:
            {
                return VendorVehicleProperty::IRM_INBOXT_36B;
            }
            case EViPropId_N80::IRM_UERR_387:
            {
                return VendorVehicleProperty::IRM_UERR_387;
            }
            case EViPropId_N80::IRM_UVERR_387:
            {
                return VendorVehicleProperty::IRM_UVERR_387;
            }
            case EViPropId_N80::IRM_TSNSRERR_387:
            {
                return VendorVehicleProperty::IRM_TSNSRERR_387;
            }
            case EViPropId_N80::IRM_FANERR_387:
            {
                return VendorVehicleProperty::IRM_FANERR_387;
            }
            case EViPropId_N80::IRM_LEDERR_387:
            {
                return VendorVehicleProperty::IRM_LEDERR_387;
            }
            case EViPropId_N80::IRM_REFRIGERATIONERR_387:
            {
                return VendorVehicleProperty::IRM_REFRIGERATIONERR_387;
            }
            case EViPropId_N80::IRM_HEATERR_387:
            {
                return VendorVehicleProperty::IRM_HEATERR_387;
            }
            case EViPropId_N80::IRM_DOORSTRUTERR_387:
            {
                return VendorVehicleProperty::IRM_DOORSTRUTERR_387;
            }
            case EViPropId_N80::IRM_LOCALCOMMUNICATIONERR_387:
            {
                return VendorVehicleProperty::IRM_LOCALCOMMUNICATIONERR_387;
            }
            case EViPropId_N80::IRM_EXCOMMUNICATIONERR_387:
            {
                return VendorVehicleProperty::IRM_EXCOMMUNICATIONERR_387;
            }
            case EViPropId_N80::USEID_0_245:
            {
                return VendorVehicleProperty::USEID_0_245;
            }
            case EViPropId_N80::USEID_1_245:
            {
                return VendorVehicleProperty::USEID_1_245;
            }
            case EViPropId_N80::SPORTMODACCTIM_628:
            {
                return VendorVehicleProperty::SPORTMODACCTIM_628;
            }
            case EViPropId_N80::COMMODACCTIM_628:
            {
                return VendorVehicleProperty::COMMODACCTIM_628;
            }
            case EViPropId_N80::ECOMODACCTIM_628:
            {
                return VendorVehicleProperty::ECOMODACCTIM_628;
            }
            case EViPropId_N80::ONEPEDMODACCTIM_628:
            {
                return VendorVehicleProperty::ONEPEDMODACCTIM_628;
            }
            case EViPropId_N80::PERSMODACCTIM_628:
            {
                return VendorVehicleProperty::PERSMODACCTIM_628;
            }
            case EViPropId_N80::TBOXSENTISNVTYSET_36A:
            {
                return VendorVehicleProperty::TBOXSENTISNVTYSET_36A;
            }
            case EViPropId_N80::TBOXSENTIMODSINGLESET_36A:
            {
                return VendorVehicleProperty::TBOXSENTIMODSINGLESET_36A;
            }
            case EViPropId_N80::TBOXSENTIAPPIONTSTRTSTS_MINS_36A:
            {
                return VendorVehicleProperty::TBOXSENTIAPPIONTSTRTSTS_MINS_36A;
            }
            case EViPropId_N80::TBOXSENTIAPPIONTSTS_36A:
            {
                return VendorVehicleProperty::TBOXSENTIAPPIONTSTS_36A;
            }
            case EViPropId_N80::TBOXSENTIAPPIONTSTRTSTS_HR_36A:
            {
                return VendorVehicleProperty::TBOXSENTIAPPIONTSTRTSTS_HR_36A;
            }
            case EViPropId_N80::TBOXSENTIAPPIONTENDSTS_HR_36A:
            {
                return VendorVehicleProperty::TBOXSENTIAPPIONTENDSTS_HR_36A;
            }
            case EViPropId_N80::TBOXSENTIAPPIONTENDSTS_MINS_36A:
            {
                return VendorVehicleProperty::TBOXSENTIAPPIONTENDSTS_MINS_36A;
            }
            case EViPropId_N80::TBOXSENTIAPPIONTRPTSTS_36A:
            {
                return VendorVehicleProperty::TBOXSENTIAPPIONTRPTSTS_36A;
            }
            case EViPropId_N80::REQCHKENGTELLTL_131:
            {
                return VendorVehicleProperty::REQCHKENGTELLTL_131;
            }
            case EViPropId_N80::EMSCOOLTT_131:
            {
                return VendorVehicleProperty::EMSCOOLTT_131;
            }
            case EViPropId_N80::EMSCOOLTVLD_131:
            {
                return VendorVehicleProperty::EMSCOOLTVLD_131;
            }
            case EViPropId_N80::EMSENGSTS_3E4:
            {
                return VendorVehicleProperty::EMSENGSTS_3E4;
            }
            case EViPropId_N80::HMIMSGREQNR7_20D:
            {
                return VendorVehicleProperty::HMIMSGREQNR7_20D;
            }
            case EViPropId_N80::HMIMSGREQNR3_20D:
            {
                return VendorVehicleProperty::HMIMSGREQNR3_20D;
            }
            case EViPropId_N80::HMIMSGREQNR2_20D:
            {
                return VendorVehicleProperty::HMIMSGREQNR2_20D;
            }
            case EViPropId_N80::HMIMSGREQNR0_20D:
            {
                return VendorVehicleProperty::HMIMSGREQNR0_20D;
            }
            case EViPropId_N80::HMIMSGREQNR13_20D:
            {
                return VendorVehicleProperty::HMIMSGREQNR13_20D;
            }
            case EViPropId_N80::HMIMSGREQNR12_20D:
            {
                return VendorVehicleProperty::HMIMSGREQNR12_20D;
            }
            case EViPropId_N80::HMIMSGREQNR9_20D:
            {
                return VendorVehicleProperty::HMIMSGREQNR9_20D;
            }
            case EViPropId_N80::HMIMSGREQNR8_20D:
            {
                return VendorVehicleProperty::HMIMSGREQNR8_20D;
            }
            case EViPropId_N80::SMTENTRYFCTSTS_20D:
            {
                return VendorVehicleProperty::SMTENTRYFCTSTS_20D;
            }
            case EViPropId_N80::PTMSMTENTRYMOD_20D:
            {
                return VendorVehicleProperty::PTMSMTENTRYMOD_20D;
            }
            case EViPropId_N80::ISGSYSTFLTDISP_21C:
            {
                return VendorVehicleProperty::ISGSYSTFLTDISP_21C;
            }
            case EViPropId_N80::ISGMTRTTEMPFLTDISP_21C:
            {
                return VendorVehicleProperty::ISGMTRTTEMPFLTDISP_21C;
            }
            case EViPropId_N80::ISGINVTEMPFLTDISP_21C:
            {
                return VendorVehicleProperty::ISGINVTEMPFLTDISP_21C;
            }
            case EViPropId_N80::NOTIFYPOWEROFF_37C:
            {
                return VendorVehicleProperty::NOTIFYPOWEROFF_37C;
            }
            case EViPropId_N80::LBMSLOWSOCALARMDIS_373:
            {
                return VendorVehicleProperty::LBMSLOWSOCALARMDIS_373;
            }
            case EViPropId_N80::LBMSTHERMALRUNAWAYFLT_373:
            {
                return VendorVehicleProperty::LBMSTHERMALRUNAWAYFLT_373;
            }
            case EViPropId_N80::LBMSSYSFLT_373:
            {
                return VendorVehicleProperty::LBMSSYSFLT_373;
            }
            case EViPropId_N80::DAMPERMODSTS_366:
            {
                return VendorVehicleProperty::DAMPERMODSTS_366;
            }
            case EViPropId_N80::DAMPERFAULTSIG_366:
            {
                return VendorVehicleProperty::DAMPERFAULTSIG_366;
            }
            case EViPropId_N80::ACPREVENTNDISP_271:
            {
                return VendorVehicleProperty::ACPREVENTNDISP_271;
            }
            case EViPropId_N80::ACWINDLESSSTSDISP_271:
            {
                return VendorVehicleProperty::ACWINDLESSSTSDISP_271;
            }
            case EViPropId_N80::PDCUHYDMILSTS_3D0:
            {
                return VendorVehicleProperty::PDCUHYDMILSTS_3D0;
            }
            case EViPropId_N80::TIRERIFRNTPWARN_295:
            {
                return VendorVehicleProperty::TIRERIFRNTPWARN_295;
            }
            case EViPropId_N80::TIRERIREPWARN_295:
            {
                return VendorVehicleProperty::TIRERIREPWARN_295;
            }
            case EViPropId_N80::BCM_EXHIBCARMODDISABLENOTICE_37C:
            {
                return VendorVehicleProperty::BCM_EXHIBCARMODDISABLENOTICE_37C;
            }
            case EViPropId_N80::VCU_DRVGMILGDISPPERC_HIACCDEM_484:
            {
                return VendorVehicleProperty::VCU_DRVGMILGDISPPERC_HIACCDEM_484;
            }
            case EViPropId_N80::BDCLVPMSTS_5C6:
            {
                return VendorVehicleProperty::BDCLVPMSTS_5C6;
            }
            case EViPropId_N80::BDCDYNLVPMLVLFB_5C6:
            {
                return VendorVehicleProperty::BDCDYNLVPMLVLFB_5C6;
            }
            case EViPropId_N80::BDCSTATLVPMLVLFB_5C6:
            {
                return VendorVehicleProperty::BDCSTATLVPMLVLFB_5C6;
            }
            case EViPropId_N80::ACCHRGELECTCLOCKSTSFBSIG_356:
            {
                return VendorVehicleProperty::ACCHRGELECTCLOCKSTSFBSIG_356;
            }
            case EViPropId_N80::VCU_DRVGMILGDISPTYPCFM_AS_482:
            {
                return VendorVehicleProperty::VCU_DRVGMILGDISPTYPCFM_AS_482;
            }
            case EViPropId_N80::VIULRSEATLEVEL_31B:
            {
                return VendorVehicleProperty::VIULRSEATLEVEL_31B;
            }
            case EViPropId_N80::VIULRSEATVENTLEVEL_31B:
            {
                return VendorVehicleProperty::VIULRSEATVENTLEVEL_31B;
            }
            case EViPropId_N80::LRSEATPASSENGERSTS_31B:
            {
                return VendorVehicleProperty::LRSEATPASSENGERSTS_31B;
            }
            case EViPropId_N80::VIUTHIRDLSEATLEVEL_31B:
            {
                return VendorVehicleProperty::VIUTHIRDLSEATLEVEL_31B;
            }
            case EViPropId_N80::THIRDLSEATPASSENGERSTS_31B:
            {
                return VendorVehicleProperty::THIRDLSEATPASSENGERSTS_31B;
            }
            case EViPropId_N80::THIRDMSEATPASSENGERSTS_31B:
            {
                return VendorVehicleProperty::THIRDMSEATPASSENGERSTS_31B;
            }
            case EViPropId_N80::PASSEATPASSENGERSTS_31C:
            {
                return VendorVehicleProperty::PASSEATPASSENGERSTS_31C;
            }
            case EViPropId_N80::RRSEATPASSENGERSTS_31C:
            {
                return VendorVehicleProperty::RRSEATPASSENGERSTS_31C;
            }
            case EViPropId_N80::THIRDRSEATPASSENGERSTS_31C:
            {
                return VendorVehicleProperty::THIRDRSEATPASSENGERSTS_31C;
            }
            case EViPropId_N80::VIUPASSEATLEVEL_31C:
            {
                return VendorVehicleProperty::VIUPASSEATLEVEL_31C;
            }
            case EViPropId_N80::VIUPASSEATVENTLEVEL_31C:
            {
                return VendorVehicleProperty::VIUPASSEATVENTLEVEL_31C;
            }
            case EViPropId_N80::VIURRSEATLEVEL_31C:
            {
                return VendorVehicleProperty::VIURRSEATLEVEL_31C;
            }
            case EViPropId_N80::VIURRSEATVENTLEVEL_31C:
            {
                return VendorVehicleProperty::VIURRSEATVENTLEVEL_31C;
            }
            case EViPropId_N80::VIUTHIRDRSEATLEVEL_31C:
            {
                return VendorVehicleProperty::VIUTHIRDRSEATLEVEL_31C;
            }
            case EViPropId_N80::VDCTOICCAISTATE_382:
            {
                return VendorVehicleProperty::VDCTOICCAISTATE_382;
            }
            case EViPropId_N80::VDCACTSET1_L_382:
            {
                return VendorVehicleProperty::VDCACTSET1_L_382;
            }
            case EViPropId_N80::VDCACTSET1_R_382:
            {
                return VendorVehicleProperty::VDCACTSET1_R_382;
            }
            case EViPropId_N80::VDCACTSET2_382:
            {
                return VendorVehicleProperty::VDCACTSET2_382;
            }
            case EViPropId_N80::VDCACTSET3_382:
            {
                return VendorVehicleProperty::VDCACTSET3_382;
            }
            case EViPropId_N80::VDCACBLOWERLESET1_382:
            {
                return VendorVehicleProperty::VDCACBLOWERLESET1_382;
            }
            case EViPropId_N80::VDCACBLOWRLELSET2_382:
            {
                return VendorVehicleProperty::VDCACBLOWRLELSET2_382;
            }
            case EViPropId_N80::VDCACBLOWRLELSET3_382:
            {
                return VendorVehicleProperty::VDCACBLOWRLELSET3_382;
            }
            case EViPropId_N80::VDCACAIRRECIRCSWT_382:
            {
                return VendorVehicleProperty::VDCACAIRRECIRCSWT_382;
            }
            case EViPropId_N80::VDCICCACONOFFSWT1_382:
            {
                return VendorVehicleProperty::VDCICCACONOFFSWT1_382;
            }
            case EViPropId_N80::VDCACONOFFSWT2_382:
            {
                return VendorVehicleProperty::VDCACONOFFSWT2_382;
            }
            case EViPropId_N80::VDCACDEFRSTSWT_382:
            {
                return VendorVehicleProperty::VDCACDEFRSTSWT_382;
            }
            case EViPropId_N80::VDCREDEFRSTSWT_382:
            {
                return VendorVehicleProperty::VDCREDEFRSTSWT_382;
            }
            case EViPropId_N80::VDCACAIRDISTBNSET1_L_382:
            {
                return VendorVehicleProperty::VDCACAIRDISTBNSET1_L_382;
            }
            case EViPropId_N80::VDCACAIRDISTBNSET1_R_382:
            {
                return VendorVehicleProperty::VDCACAIRDISTBNSET1_R_382;
            }
            case EViPropId_N80::VDCWIONSET_382:
            {
                return VendorVehicleProperty::VDCWIONSET_382;
            }
            case EViPropId_N80::VDCACAIRDISTBNSET2_382:
            {
                return VendorVehicleProperty::VDCACAIRDISTBNSET2_382;
            }
            case EViPropId_N80::VDCACAIRDISTBNSET3_382:
            {
                return VendorVehicleProperty::VDCACAIRDISTBNSET3_382;
            }
            case EViPropId_N80::VDCACSWT_382:
            {
                return VendorVehicleProperty::VDCACSWT_382;
            }
            case EViPropId_N80::VDCTMDRVRSEATHEAT_382:
            {
                return VendorVehicleProperty::VDCTMDRVRSEATHEAT_382;
            }
            case EViPropId_N80::VDCTMDRVRSEATVENTN_382:
            {
                return VendorVehicleProperty::VDCTMDRVRSEATVENTN_382;
            }
            case EViPropId_N80::VDCTMPASSSEATHEAT_382:
            {
                return VendorVehicleProperty::VDCTMPASSSEATHEAT_382;
            }
            case EViPropId_N80::VDCTMPASSSEATVENTN_382:
            {
                return VendorVehicleProperty::VDCTMPASSSEATVENTN_382;
            }
            case EViPropId_N80::VDCLRSEATHEAT_382:
            {
                return VendorVehicleProperty::VDCLRSEATHEAT_382;
            }
            case EViPropId_N80::VDCRRSEATHEAT_382:
            {
                return VendorVehicleProperty::VDCRRSEATHEAT_382;
            }
            case EViPropId_N80::VDCTHIRDLSEATHEAT_382:
            {
                return VendorVehicleProperty::VDCTHIRDLSEATHEAT_382;
            }
            case EViPropId_N80::VDCTHIRDRSEATHEAT_382:
            {
                return VendorVehicleProperty::VDCTHIRDRSEATHEAT_382;
            }
            case EViPropId_N80::VDCLRSEATVENTN_382:
            {
                return VendorVehicleProperty::VDCLRSEATVENTN_382;
            }
            case EViPropId_N80::VDCRRSEATVENTN_382:
            {
                return VendorVehicleProperty::VDCRRSEATVENTN_382;
            }
            case EViPropId_N80::VDCTHIRDLSEATVENTN_382:
            {
                return VendorVehicleProperty::VDCTHIRDLSEATVENTN_382;
            }
            case EViPropId_N80::VDCTHIRDRSEATVENTN_382:
            {
                return VendorVehicleProperty::VDCTHIRDRSEATVENTN_382;
            }
            case EViPropId_N80::ICSMRCSTB_366:
            {
                return VendorVehicleProperty::ICSMRCSTB_366;
            }
            case EViPropId_N80::ICSMRCAVL_366:
            {
                return VendorVehicleProperty::ICSMRCAVL_366;
            }
            case EViPropId_N80::TAILLIGHTADASLAMPSTS_227:
            {
                return VendorVehicleProperty::TAILLIGHTADASLAMPSTS_227;
            }
            case EViPropId_N80::MIRRADASLAMPSTS_227:
            {
                return VendorVehicleProperty::MIRRADASLAMPSTS_227;
            }
            default:
            {
                ALOGD("[%s] propId = 0x%04x out of range", __func__, propId);
                return VendorVehicleProperty::VENDOR_PROPERTY_INVALID;
            }
        }

    }
}  // namespace autolink