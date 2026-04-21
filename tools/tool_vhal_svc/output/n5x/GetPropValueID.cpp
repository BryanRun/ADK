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
        EViPropId_N50 pid = static_cast<EViPropId_N50>(propId);
        switch(pid) {
            case EViPropId_N50::VCU_GEARSIGVLD_214:
            {
                return VendorVehicleProperty::VCU_GEARSIGVLD_214;
            }
            case EViPropId_N50::VCU_GEARSIG_214:
            {
                return VendorVehicleProperty::VCU_GEARSIG_214;
            }
            case EViPropId_N50::ESP_VEHSPD_318:
            {
                return VendorVehicleProperty::ESP_VEHSPD_318;
            }
            case EViPropId_N50::PDU_TPMS_589:
            {
                return VendorVehicleProperty::PDU_TPMS_589;
            }
            case EViPropId_N50::VCU_DRVGMILG_504:
            {
                return VendorVehicleProperty::VCU_DRVGMILG_504;
            }
            case EViPropId_N50::ECC_ACSTS_373:
            {
                return VendorVehicleProperty::ECC_ACSTS_373;
            }
            case EViPropId_N50::ECC_WINDSPDSTS_373:
            {
                return VendorVehicleProperty::ECC_WINDSPDSTS_373;
            }
            case EViPropId_N50::ECC_BACKROWAIROUTLMODSTS_373:
            {
                return VendorVehicleProperty::ECC_BACKROWAIROUTLMODSTS_373;
            }
            case EViPropId_N50::ECC_DRVRTSETSTS_373:
            {
                return VendorVehicleProperty::ECC_DRVRTSETSTS_373;
            }
            case EViPropId_N50::ECC_PASSTSETSTS_373:
            {
                return VendorVehicleProperty::ECC_PASSTSETSTS_373;
            }
            case EViPropId_N50::ECC_AUTOSTS_373:
            {
                return VendorVehicleProperty::ECC_AUTOSTS_373;
            }
            case EViPropId_N50::ECC_SYNCSTS_373:
            {
                return VendorVehicleProperty::ECC_SYNCSTS_373;
            }
            case EViPropId_N50::ECC_CIRCSTS_373:
            {
                return VendorVehicleProperty::ECC_CIRCSTS_373;
            }
            case EViPropId_N50::ECC_PARTICLECONCVLD_373:
            {
                return VendorVehicleProperty::ECC_PARTICLECONCVLD_373;
            }
            case EViPropId_N50::ECC_OUTDT_373:
            {
                return VendorVehicleProperty::ECC_OUTDT_373;
            }
            case EViPropId_N50::ECC_OUTDTVLD_373:
            {
                return VendorVehicleProperty::ECC_OUTDTVLD_373;
            }
            case EViPropId_N50::ECC_MAXFRNTDEFRST_373:
            {
                return VendorVehicleProperty::ECC_MAXFRNTDEFRST_373;
            }
            case EViPropId_N50::ECC_HEATMNGTSYSFLT_373:
            {
                return VendorVehicleProperty::ECC_HEATMNGTSYSFLT_373;
            }
            case EViPropId_N50::ECC_HEATMNGTFCTLIM_373:
            {
                return VendorVehicleProperty::ECC_HEATMNGTFCTLIM_373;
            }
            case EViPropId_N50::ECC_DRVRAIROUTLMOD_373:
            {
                return VendorVehicleProperty::ECC_DRVRAIROUTLMOD_373;
            }
            case EViPropId_N50::ECC_PASSAIROUTLMOD_373:
            {
                return VendorVehicleProperty::ECC_PASSAIROUTLMOD_373;
            }
            case EViPropId_N50::ECC_EGYSAVEMODSTS_373:
            {
                return VendorVehicleProperty::ECC_EGYSAVEMODSTS_373;
            }
            case EViPropId_N50::ECC_LEOUTLUPDWNMOTACTVSTS_378:
            {
                return VendorVehicleProperty::ECC_LEOUTLUPDWNMOTACTVSTS_378;
            }
            case EViPropId_N50::ECC_LEOUTLLERIMOTACTVSTS_378:
            {
                return VendorVehicleProperty::ECC_LEOUTLLERIMOTACTVSTS_378;
            }
            case EViPropId_N50::ECC_MIDLEOUTLUPDWNMOTACTVSTS_378:
            {
                return VendorVehicleProperty::ECC_MIDLEOUTLUPDWNMOTACTVSTS_378;
            }
            case EViPropId_N50::ECC_MIDLEOUTLLERIMOTACTVSTS_378:
            {
                return VendorVehicleProperty::ECC_MIDLEOUTLLERIMOTACTVSTS_378;
            }
            case EViPropId_N50::ECC_MIDRIOUTLUPDWNMOTACTVSTS_378:
            {
                return VendorVehicleProperty::ECC_MIDRIOUTLUPDWNMOTACTVSTS_378;
            }
            case EViPropId_N50::ECC_MIDRIOUTLLERIMOTACTVSTS_378:
            {
                return VendorVehicleProperty::ECC_MIDRIOUTLLERIMOTACTVSTS_378;
            }
            case EViPropId_N50::ECC_RIOUTLUPDWNMOTACTVSTS_378:
            {
                return VendorVehicleProperty::ECC_RIOUTLUPDWNMOTACTVSTS_378;
            }
            case EViPropId_N50::ECC_RIOUTLLERIMOTACTVSTS_378:
            {
                return VendorVehicleProperty::ECC_RIOUTLLERIMOTACTVSTS_378;
            }
            case EViPropId_N50::MCU_F_CRTROTDIR_150:
            {
                return VendorVehicleProperty::MCU_F_CRTROTDIR_150;
            }
            case EViPropId_N50::MCU_F_ALRMLAMP_FS_150:
            {
                return VendorVehicleProperty::MCU_F_ALRMLAMP_FS_150;
            }
            case EViPropId_N50::PEPS_PWRMOD_333:
            {
                return VendorVehicleProperty::PEPS_PWRMOD_333;
            }
            case EViPropId_N50::PEPS_PWRMODVLD_333:
            {
                return VendorVehicleProperty::PEPS_PWRMODVLD_333;
            }
            case EViPropId_N50::PEPS_POLLINGSTS_333:
            {
                return VendorVehicleProperty::PEPS_POLLINGSTS_333;
            }
            case EViPropId_N50::PEPS_KEYINCARRMN_37B:
            {
                return VendorVehicleProperty::PEPS_KEYINCARRMN_37B;
            }
            case EViPropId_N50::PEPS_SHIFTTOPNSTRTREQ_37B:
            {
                return VendorVehicleProperty::PEPS_SHIFTTOPNSTRTREQ_37B;
            }
            case EViPropId_N50::PEPS_STEPBRKTOSTRTREQ_37B:
            {
                return VendorVehicleProperty::PEPS_STEPBRKTOSTRTREQ_37B;
            }
            case EViPropId_N50::PEPS_NOFOUNDLEGALKEY_37B:
            {
                return VendorVehicleProperty::PEPS_NOFOUNDLEGALKEY_37B;
            }
            case EViPropId_N50::PEPS_EMGYSTRTPROMT_37B:
            {
                return VendorVehicleProperty::PEPS_EMGYSTRTPROMT_37B;
            }
            case EViPropId_N50::PEPS_VCUAUTHENTFAILPROMT_37B:
            {
                return VendorVehicleProperty::PEPS_VCUAUTHENTFAILPROMT_37B;
            }
            case EViPropId_N50::PEPS_KEYLOPWRPROMT_37B:
            {
                return VendorVehicleProperty::PEPS_KEYLOPWRPROMT_37B;
            }
            case EViPropId_N50::PEPS_KEYOUTDCARPROMT_37B:
            {
                return VendorVehicleProperty::PEPS_KEYOUTDCARPROMT_37B;
            }
            case EViPropId_N50::PEPS_TIOUTPWROFFRMN_380:
            {
                return VendorVehicleProperty::PEPS_TIOUTPWROFFRMN_380;
            }
            case EViPropId_N50::PWC_CHRGSTS_524:
            {
                return VendorVehicleProperty::PWC_CHRGSTS_524;
            }
            case EViPropId_N50::PWC_PHNFORGETREMDSTS_524:
            {
                return VendorVehicleProperty::PWC_PHNFORGETREMDSTS_524;
            }
            case EViPropId_N50::PWC_MODLESWTSTS_524:
            {
                return VendorVehicleProperty::PWC_MODLESWTSTS_524;
            }
            case EViPropId_N50::VCU_RDYLAMP_214:
            {
                return VendorVehicleProperty::VCU_RDYLAMP_214;
            }
            case EViPropId_N50::VCU_PWRBATTHVCNCTSTS_214:
            {
                return VendorVehicleProperty::VCU_PWRBATTHVCNCTSTS_214;
            }
            case EViPropId_N50::VCU_APSPERC_214:
            {
                return VendorVehicleProperty::VCU_APSPERC_214;
            }
            case EViPropId_N50::VCU_DRVMODSHIFTMISOPER_214:
            {
                return VendorVehicleProperty::VCU_DRVMODSHIFTMISOPER_214;
            }
            case EViPropId_N50::VCU_EXTREMEEGYSAVESWTENAFLG_358:
            {
                return VendorVehicleProperty::VCU_EXTREMEEGYSAVESWTENAFLG_358;
            }
            case EViPropId_N50::VCU_PULLMODENASIG_358:
            {
                return VendorVehicleProperty::VCU_PULLMODENASIG_358;
            }
            case EViPropId_N50::VCU_PULLMODSIG_358:
            {
                return VendorVehicleProperty::VCU_PULLMODSIG_358;
            }
            case EViPropId_N50::VCU_DRVPWRLIMSTS_358:
            {
                return VendorVehicleProperty::VCU_DRVPWRLIMSTS_358;
            }
            case EViPropId_N50::VCU_EGYRECOVPWRLIMSTS_358:
            {
                return VendorVehicleProperty::VCU_EGYRECOVPWRLIMSTS_358;
            }
            case EViPropId_N50::VCU_EXTREMEEGYSAVEOPENSIG_358:
            {
                return VendorVehicleProperty::VCU_EXTREMEEGYSAVEOPENSIG_358;
            }
            case EViPropId_N50::VCU_ONEPEDALKEEPDISPLAY_AB_AS_358:
            {
                return VendorVehicleProperty::VCU_ONEPEDALKEEPDISPLAY_AB_AS_358;
            }
            case EViPropId_N50::VCU_VEHACSYCNSEEGY_AB_3BD:
            {
                return VendorVehicleProperty::VCU_VEHACSYCNSEEGY_AB_3BD;
            }
            case EViPropId_N50::VCU_EGYRECOVEGY_AB_3BD:
            {
                return VendorVehicleProperty::VCU_EGYRECOVEGY_AB_3BD;
            }
            case EViPropId_N50::VCU_LONGTIHLTHSTOREPUSHINFO_605:
            {
                return VendorVehicleProperty::VCU_LONGTIHLTHSTOREPUSHINFO_605;
            }
            case EViPropId_N50::VCU_CHRGSTSTXT_605:
            {
                return VendorVehicleProperty::VCU_CHRGSTSTXT_605;
            }
            case EViPropId_N50::BMS_CHRGFLTPROMT_330:
            {
                return VendorVehicleProperty::BMS_CHRGFLTPROMT_330;
            }
            case EViPropId_N50::BMS_PWRBATTRMNGCPSOC_330:
            {
                return VendorVehicleProperty::BMS_PWRBATTRMNGCPSOC_330;
            }
            case EViPropId_N50::BMS_CELLMINTALRM_330:
            {
                return VendorVehicleProperty::BMS_CELLMINTALRM_330;
            }
            case EViPropId_N50::BMS_PWRBATTTHERMRUNAWAYALRM_330:
            {
                return VendorVehicleProperty::BMS_PWRBATTTHERMRUNAWAYALRM_330;
            }
            case EViPropId_N50::ESP_WARNINGON_261:
            {
                return VendorVehicleProperty::ESP_WARNINGON_261;
            }
            case EViPropId_N50::ESP_BRKFLDALRM_261:
            {
                return VendorVehicleProperty::ESP_BRKFLDALRM_261;
            }
            case EViPropId_N50::ESP_AVLINDCN_CST_261:
            {
                return VendorVehicleProperty::ESP_AVLINDCN_CST_261;
            }
            case EViPropId_N50::ESP_CTRLSTS_CST_261:
            {
                return VendorVehicleProperty::ESP_CTRLSTS_CST_261;
            }
            case EViPropId_N50::ESP_SYSSTS_EPB_268:
            {
                return VendorVehicleProperty::ESP_SYSSTS_EPB_268;
            }
            case EViPropId_N50::ESP_FLTINDCN_EPB_268:
            {
                return VendorVehicleProperty::ESP_FLTINDCN_EPB_268;
            }
            case EViPropId_N50::ESP_ACTVNDCN_EPB_268:
            {
                return VendorVehicleProperty::ESP_ACTVNDCN_EPB_268;
            }
            case EViPropId_N50::EPB_WARNMSG01_268:
            {
                return VendorVehicleProperty::EPB_WARNMSG01_268;
            }
            case EViPropId_N50::EPB_WARNMSG02_268:
            {
                return VendorVehicleProperty::EPB_WARNMSG02_268;
            }
            case EViPropId_N50::EPB_WARNMSG04_268:
            {
                return VendorVehicleProperty::EPB_WARNMSG04_268;
            }
            case EViPropId_N50::EPB_WARNMSG03_268:
            {
                return VendorVehicleProperty::EPB_WARNMSG03_268;
            }
            case EViPropId_N50::ESP_BRKPEDLSTS_318:
            {
                return VendorVehicleProperty::ESP_BRKPEDLSTS_318;
            }
            case EViPropId_N50::ESP_VEHSPDVLD_318:
            {
                return VendorVehicleProperty::ESP_VEHSPDVLD_318;
            }
            case EViPropId_N50::ESP_SYSACTV_318:
            {
                return VendorVehicleProperty::ESP_SYSACTV_318;
            }
            case EViPropId_N50::ESP_LAMPSWTOFFINDCN_318:
            {
                return VendorVehicleProperty::ESP_LAMPSWTOFFINDCN_318;
            }
            case EViPropId_N50::ESP_FLTINDCN_EBD_318:
            {
                return VendorVehicleProperty::ESP_FLTINDCN_EBD_318;
            }
            case EViPropId_N50::ESP_FLTINDCN_ABS_318:
            {
                return VendorVehicleProperty::ESP_FLTINDCN_ABS_318;
            }
            case EViPropId_N50::ESP_FLTINDCN_TCS_318:
            {
                return VendorVehicleProperty::ESP_FLTINDCN_TCS_318;
            }
            case EViPropId_N50::ESP_CTRLSTS_HDC_318:
            {
                return VendorVehicleProperty::ESP_CTRLSTS_HDC_318;
            }
            case EViPropId_N50::ESP_AVLINDCN_HDC_318:
            {
                return VendorVehicleProperty::ESP_AVLINDCN_HDC_318;
            }
            case EViPropId_N50::BCM_WIPRINSRVPOSN_335:
            {
                return VendorVehicleProperty::BCM_WIPRINSRVPOSN_335;
            }
            case EViPropId_N50::BCM_INTLAMPTISETSTS_335:
            {
                return VendorVehicleProperty::BCM_INTLAMPTISETSTS_335;
            }
            case EViPropId_N50::BCM_WATERPOSNSNSRSWTSTS_335:
            {
                return VendorVehicleProperty::BCM_WATERPOSNSNSRSWTSTS_335;
            }
            case EViPropId_N50::BCM_EXTLAMPSWTSTS_335:
            {
                return VendorVehicleProperty::BCM_EXTLAMPSWTSTS_335;
            }
            case EViPropId_N50::BCM_RAINCLSSUNROOFSETSTS_335:
            {
                return VendorVehicleProperty::BCM_RAINCLSSUNROOFSETSTS_335;
            }
            case EViPropId_N50::BCM_MIRRLOCKAUTOSETSTS_335:
            {
                return VendorVehicleProperty::BCM_MIRRLOCKAUTOSETSTS_335;
            }
            case EViPropId_N50::BCM_DANGERALRMLAMPSWTSTS_335:
            {
                return VendorVehicleProperty::BCM_DANGERALRMLAMPSWTSTS_335;
            }
            case EViPropId_N50::BCM_REDEFRSTHEATGCMD_335:
            {
                return VendorVehicleProperty::BCM_REDEFRSTHEATGCMD_335;
            }
            case EViPropId_N50::BCM_RVSLAMPOUTPCMD_335:
            {
                return VendorVehicleProperty::BCM_RVSLAMPOUTPCMD_335;
            }
            case EViPropId_N50::BCM_LETRUNLAMPOUTPCMD_335:
            {
                return VendorVehicleProperty::BCM_LETRUNLAMPOUTPCMD_335;
            }
            case EViPropId_N50::BCM_RITRUNLAMPOUTPCMD_335:
            {
                return VendorVehicleProperty::BCM_RITRUNLAMPOUTPCMD_335;
            }
            case EViPropId_N50::BCM_HIBEAMOUTPCMD_335:
            {
                return VendorVehicleProperty::BCM_HIBEAMOUTPCMD_335;
            }
            case EViPropId_N50::BCM_LOBEAMOUTPCMD_335:
            {
                return VendorVehicleProperty::BCM_LOBEAMOUTPCMD_335;
            }
            case EViPropId_N50::BCM_POSNLAMPOUTPCMD_335:
            {
                return VendorVehicleProperty::BCM_POSNLAMPOUTPCMD_335;
            }
            case EViPropId_N50::BCM_BRKLAMPOUTPCMD_335:
            {
                return VendorVehicleProperty::BCM_BRKLAMPOUTPCMD_335;
            }
            case EViPropId_N50::BCM_REFOGLAMPOUTPCMD_335:
            {
                return VendorVehicleProperty::BCM_REFOGLAMPOUTPCMD_335;
            }
            case EViPropId_N50::BCM_FRNTWIPRSPD_335:
            {
                return VendorVehicleProperty::BCM_FRNTWIPRSPD_335;
            }
            case EViPropId_N50::BCM_VEHAMBBRI_335:
            {
                return VendorVehicleProperty::BCM_VEHAMBBRI_335;
            }
            case EViPropId_N50::BCM_FRNTHOODLIDSTS_343:
            {
                return VendorVehicleProperty::BCM_FRNTHOODLIDSTS_343;
            }
            case EViPropId_N50::BCM_SUNROOFANTIPINCHSTS_343:
            {
                return VendorVehicleProperty::BCM_SUNROOFANTIPINCHSTS_343;
            }
            case EViPropId_N50::BCM_FRNTLEDOORLOCKSTS_343:
            {
                return VendorVehicleProperty::BCM_FRNTLEDOORLOCKSTS_343;
            }
            case EViPropId_N50::BCM_TRRELSSWTSTS_343:
            {
                return VendorVehicleProperty::BCM_TRRELSSWTSTS_343;
            }
            case EViPropId_N50::BCM_LOCKALLDOORCMD_343:
            {
                return VendorVehicleProperty::BCM_LOCKALLDOORCMD_343;
            }
            case EViPropId_N50::BCM_LEFRNTDOORSTS_343:
            {
                return VendorVehicleProperty::BCM_LEFRNTDOORSTS_343;
            }
            case EViPropId_N50::BCM_RIFRNTDOORSTS_343:
            {
                return VendorVehicleProperty::BCM_RIFRNTDOORSTS_343;
            }
            case EViPropId_N50::BCM_TRSTS_343:
            {
                return VendorVehicleProperty::BCM_TRSTS_343;
            }
            case EViPropId_N50::BCM_ANTITHFTSTS_343:
            {
                return VendorVehicleProperty::BCM_ANTITHFTSTS_343;
            }
            case EViPropId_N50::BCM_CENLOCKSWTSTS_343:
            {
                return VendorVehicleProperty::BCM_CENLOCKSWTSTS_343;
            }
            case EViPropId_N50::BCM_DOORUNLOCKSETFB_343:
            {
                return VendorVehicleProperty::BCM_DOORUNLOCKSETFB_343;
            }
            case EViPropId_N50::BCM_RIREDOORSTS_343:
            {
                return VendorVehicleProperty::BCM_RIREDOORSTS_343;
            }
            case EViPropId_N50::BCM_LEREDOORSTS_343:
            {
                return VendorVehicleProperty::BCM_LEREDOORSTS_343;
            }
            case EViPropId_N50::BCM_LEFRNTWINSTS_343:
            {
                return VendorVehicleProperty::BCM_LEFRNTWINSTS_343;
            }
            case EViPropId_N50::BCM_RIFRNTWINSTS_343:
            {
                return VendorVehicleProperty::BCM_RIFRNTWINSTS_343;
            }
            case EViPropId_N50::BCM_LEREWINSTS_343:
            {
                return VendorVehicleProperty::BCM_LEREWINSTS_343;
            }
            case EViPropId_N50::BCM_RIREWINST_343:
            {
                return VendorVehicleProperty::BCM_RIREWINST_343;
            }
            case EViPropId_N50::BCM_FOLWMESETSTSFB_343:
            {
                return VendorVehicleProperty::BCM_FOLWMESETSTSFB_343;
            }
            case EViPropId_N50::BCM_DRVRBOORUNLCKOUTPCMD_343:
            {
                return VendorVehicleProperty::BCM_DRVRBOORUNLCKOUTPCMD_343;
            }
            case EViPropId_N50::BCM_PASSDOORUNLCKOUTPCMD_343:
            {
                return VendorVehicleProperty::BCM_PASSDOORUNLCKOUTPCMD_343;
            }
            case EViPropId_N50::BCM_LEDRLOUTPCMD_343:
            {
                return VendorVehicleProperty::BCM_LEDRLOUTPCMD_343;
            }
            case EViPropId_N50::BCM_RIDRLOUTPCMD_343:
            {
                return VendorVehicleProperty::BCM_RIDRLOUTPCMD_343;
            }
            case EViPropId_N50::BCM_ARMEDCLSWINSETSTS_343:
            {
                return VendorVehicleProperty::BCM_ARMEDCLSWINSETSTS_343;
            }
            case EViPropId_N50::BCM_OFFAUTOUNLCKSETSTS_343:
            {
                return VendorVehicleProperty::BCM_OFFAUTOUNLCKSETSTS_343;
            }
            case EViPropId_N50::BCM_SUNROOFPOSNINFO_343:
            {
                return VendorVehicleProperty::BCM_SUNROOFPOSNINFO_343;
            }
            case EViPropId_N50::BCM_SUNROOFOPENAR_343:
            {
                return VendorVehicleProperty::BCM_SUNROOFOPENAR_343;
            }
            case EViPropId_N50::BCM_SUNROOFRUNNGSTS_343:
            {
                return VendorVehicleProperty::BCM_SUNROOFRUNNGSTS_343;
            }
            case EViPropId_N50::BCM_MIRRCMD_343:
            {
                return VendorVehicleProperty::BCM_MIRRCMD_343;
            }
            case EViPropId_N50::BCM_APPLIANCECLSLVL_51E:
            {
                return VendorVehicleProperty::BCM_APPLIANCECLSLVL_51E;
            }
            case EViPropId_N50::DSMC_DRVRSEATTRACKSWTSTS_4F1:
            {
                return VendorVehicleProperty::DSMC_DRVRSEATTRACKSWTSTS_4F1;
            }
            case EViPropId_N50::DSMC_DRVRSEATHEIADJSWTSTS_4F1:
            {
                return VendorVehicleProperty::DSMC_DRVRSEATHEIADJSWTSTS_4F1;
            }
            case EViPropId_N50::DSMC_DRVRSEATBACKADJSWTSTS_4F1:
            {
                return VendorVehicleProperty::DSMC_DRVRSEATBACKADJSWTSTS_4F1;
            }
            case EViPropId_N50::DSMC_CRTDRVRSEATUIDSUBPOSN_4F1:
            {
                return VendorVehicleProperty::DSMC_CRTDRVRSEATUIDSUBPOSN_4F1;
            }
            case EViPropId_N50::DSMC_DRVRSEATWELFCTSETFB_4F1:
            {
                return VendorVehicleProperty::DSMC_DRVRSEATWELFCTSETFB_4F1;
            }
            case EViPropId_N50::DSMC_REMIRRAUTODWNFLIPFB_4F1:
            {
                return VendorVehicleProperty::DSMC_REMIRRAUTODWNFLIPFB_4F1;
            }
            case EViPropId_N50::DSMC_RIMIRRRXDIECPOSN_4F3:
            {
                return VendorVehicleProperty::DSMC_RIMIRRRXDIECPOSN_4F3;
            }
            case EViPropId_N50::DSMC_RIMIRRRYDIRCPOSN_4F3:
            {
                return VendorVehicleProperty::DSMC_RIMIRRRYDIRCPOSN_4F3;
            }
            case EViPropId_N50::DSMC_LEMIRRRXPOSN_4F3:
            {
                return VendorVehicleProperty::DSMC_LEMIRRRXPOSN_4F3;
            }
            case EViPropId_N50::DSMC_LEMIRRRYPOSN_4F3:
            {
                return VendorVehicleProperty::DSMC_LEMIRRRYPOSN_4F3;
            }
            case EViPropId_N50::DSMC_DRVRSEATTRACKPOSN_4F5:
            {
                return VendorVehicleProperty::DSMC_DRVRSEATTRACKPOSN_4F5;
            }
            case EViPropId_N50::DSMC_DRVRSEATHEIPOSN_4F5:
            {
                return VendorVehicleProperty::DSMC_DRVRSEATHEIPOSN_4F5;
            }
            case EViPropId_N50::DSMC_DRVRSEATBACKPOSN_4F5:
            {
                return VendorVehicleProperty::DSMC_DRVRSEATBACKPOSN_4F5;
            }
            case EViPropId_N50::DSMC_DRVRSEATMEMRECALLFB_62:
            {
                return VendorVehicleProperty::DSMC_DRVRSEATMEMRECALLFB_62;
            }
            case EViPropId_N50::DSMC_DRVRSEATMEMDATAUPDFB_62:
            {
                return VendorVehicleProperty::DSMC_DRVRSEATMEMDATAUPDFB_62;
            }
            case EViPropId_N50::DSMC_DRVRSEATHEATGSTS_518:
            {
                return VendorVehicleProperty::DSMC_DRVRSEATHEATGSTS_518;
            }
            case EViPropId_N50::DSMC_DRVRSEATVENTNSTS_518:
            {
                return VendorVehicleProperty::DSMC_DRVRSEATVENTNSTS_518;
            }
            case EViPropId_N50::DSMC_DRVRSEATTRACKADJSTS_518:
            {
                return VendorVehicleProperty::DSMC_DRVRSEATTRACKADJSTS_518;
            }
            case EViPropId_N50::DSMC_DRVRSEATHEIADJSTS_518:
            {
                return VendorVehicleProperty::DSMC_DRVRSEATHEIADJSTS_518;
            }
            case EViPropId_N50::DSMC_DRVRSEATBACKADJSTS_518:
            {
                return VendorVehicleProperty::DSMC_DRVRSEATBACKADJSTS_518;
            }
            case EViPropId_N50::DSMC_DRVRSEATCUSHAGADJSTS_518:
            {
                return VendorVehicleProperty::DSMC_DRVRSEATCUSHAGADJSTS_518;
            }
            case EViPropId_N50::DSMC_LUMBARUPDSTS_518:
            {
                return VendorVehicleProperty::DSMC_LUMBARUPDSTS_518;
            }
            case EViPropId_N50::DSMC_LUMBARDWNSTS_518:
            {
                return VendorVehicleProperty::DSMC_LUMBARDWNSTS_518;
            }
            case EViPropId_N50::DSMC_LUMBARFWDSTS_518:
            {
                return VendorVehicleProperty::DSMC_LUMBARFWDSTS_518;
            }
            case EViPropId_N50::DSMC_LUMBARBACKWSTS_518:
            {
                return VendorVehicleProperty::DSMC_LUMBARBACKWSTS_518;
            }
            case EViPropId_N50::DSMC_LRSEATHEATSTS_518:
            {
                return VendorVehicleProperty::DSMC_LRSEATHEATSTS_518;
            }
            case EViPropId_N50::DSMC_SEATHEATAUTODWNENASTS_518:
            {
                return VendorVehicleProperty::DSMC_SEATHEATAUTODWNENASTS_518;
            }
            case EViPropId_N50::DSMC_REMIRRLERIFB_518:
            {
                return VendorVehicleProperty::DSMC_REMIRRLERIFB_518;
            }
            case EViPropId_N50::DSMC_MASFL_SEATMASMOD_518:
            {
                return VendorVehicleProperty::DSMC_MASFL_SEATMASMOD_518;
            }
            case EViPropId_N50::DSMC_MASFL_SEATMASGRADESTS_518:
            {
                return VendorVehicleProperty::DSMC_MASFL_SEATMASGRADESTS_518;
            }
            case EViPropId_N50::PLG_USRSETTRMAXHEIRESFB_64:
            {
                return VendorVehicleProperty::PLG_USRSETTRMAXHEIRESFB_64;
            }
            case EViPropId_N50::PLG_USRSETTRMAXHEI_471:
            {
                return VendorVehicleProperty::PLG_USRSETTRMAXHEI_471;
            }
            case EViPropId_N50::PLG_LETRPOSN_471:
            {
                return VendorVehicleProperty::PLG_LETRPOSN_471;
            }
            case EViPropId_N50::PLG_SOUNDREMDNGREQ_EHU_471:
            {
                return VendorVehicleProperty::PLG_SOUNDREMDNGREQ_EHU_471;
            }
            case EViPropId_N50::PLG_SYSFLTINDCN_471:
            {
                return VendorVehicleProperty::PLG_SYSFLTINDCN_471;
            }
            case EViPropId_N50::PLG_TRSWTSTSINDCN_471:
            {
                return VendorVehicleProperty::PLG_TRSWTSTSINDCN_471;
            }
            case EViPropId_N50::PLG_TRLTCHSTSINDCN_471:
            {
                return VendorVehicleProperty::PLG_TRLTCHSTSINDCN_471;
            }
            case EViPropId_N50::PLG_OPERMOD_471:
            {
                return VendorVehicleProperty::PLG_OPERMOD_471;
            }
            case EViPropId_N50::PLG_ANTIPINCHSTS_471:
            {
                return VendorVehicleProperty::PLG_ANTIPINCHSTS_471;
            }
            case EViPropId_N50::PAS_STS_FPAS_574:
            {
                return VendorVehicleProperty::PAS_STS_FPAS_574;
            }
            case EViPropId_N50::PAS_STS_RPAS_574:
            {
                return VendorVehicleProperty::PAS_STS_RPAS_574;
            }
            case EViPropId_N50::PAS_SOUNDINDCN_F_576:
            {
                return VendorVehicleProperty::PAS_SOUNDINDCN_F_576;
            }
            case EViPropId_N50::PAS_SOUNDINDCN_R_576:
            {
                return VendorVehicleProperty::PAS_SOUNDINDCN_R_576;
            }
            case EViPropId_N50::SDM_AIRBAGSYSALRMLAMPSTS_319:
            {
                return VendorVehicleProperty::SDM_AIRBAGSYSALRMLAMPSTS_319;
            }
            case EViPropId_N50::SDM_SECUBLTALRMSTS_RL_319:
            {
                return VendorVehicleProperty::SDM_SECUBLTALRMSTS_RL_319;
            }
            case EViPropId_N50::SDM_SECUBLTALRMSTS_RM_319:
            {
                return VendorVehicleProperty::SDM_SECUBLTALRMSTS_RM_319;
            }
            case EViPropId_N50::SDM_SECUBLTALRMSTS_RR_319:
            {
                return VendorVehicleProperty::SDM_SECUBLTALRMSTS_RR_319;
            }
            case EViPropId_N50::SDM_DRVERSECUBLTALRMSTS_319:
            {
                return VendorVehicleProperty::SDM_DRVERSECUBLTALRMSTS_319;
            }
            case EViPropId_N50::SDM_PASSSEATBLTBUCDSTS_319:
            {
                return VendorVehicleProperty::SDM_PASSSEATBLTBUCDSTS_319;
            }
            case EViPropId_N50::SDM_CLLSNSIG_319:
            {
                return VendorVehicleProperty::SDM_CLLSNSIG_319;
            }
            case EViPropId_N50::SDM_PASSSEATOCCSTS_319:
            {
                return VendorVehicleProperty::SDM_PASSSEATOCCSTS_319;
            }
            case EViPropId_N50::CIM_FRNTWIPRSWTSTS_310:
            {
                return VendorVehicleProperty::CIM_FRNTWIPRSWTSTS_310;
            }
            case EViPropId_N50::CIM_REWIPRSWTSTS_310:
            {
                return VendorVehicleProperty::CIM_REWIPRSWTSTS_310;
            }
            case EViPropId_N50::VCU_ACCHRGELECTCLOCKSTSFBSIG_554:
            {
                return VendorVehicleProperty::VCU_ACCHRGELECTCLOCKSTSFBSIG_554;
            }
            case EViPropId_N50::VCU_CHRGDISCHRGCRTDISP_52C:
            {
                return VendorVehicleProperty::VCU_CHRGDISCHRGCRTDISP_52C;
            }
            case EViPropId_N50::VCU_CHRGDCHAPWRDISP_52C:
            {
                return VendorVehicleProperty::VCU_CHRGDCHAPWRDISP_52C;
            }
            case EViPropId_N50::VCU_ELECTCLOCKFLTPROMT_52D:
            {
                return VendorVehicleProperty::VCU_ELECTCLOCKFLTPROMT_52D;
            }
            case EViPropId_N50::BMS_CHRGOPRTGUIDEPROMT_51B:
            {
                return VendorVehicleProperty::BMS_CHRGOPRTGUIDEPROMT_51B;
            }
            case EViPropId_N50::BMS_CHRGRLTDSTSPROMT_51B:
            {
                return VendorVehicleProperty::BMS_CHRGRLTDSTSPROMT_51B;
            }
            case EViPropId_N50::BMS_CHRGDCHASTOPREASONPROMT_51B:
            {
                return VendorVehicleProperty::BMS_CHRGDCHASTOPREASONPROMT_51B;
            }
            case EViPropId_N50::SLC_CRTCOLORR_337:
            {
                return VendorVehicleProperty::SLC_CRTCOLORR_337;
            }
            case EViPropId_N50::SLC_CRTCOLORG_337:
            {
                return VendorVehicleProperty::SLC_CRTCOLORG_337;
            }
            case EViPropId_N50::SLC_CRTCOLORB_337:
            {
                return VendorVehicleProperty::SLC_CRTCOLORB_337;
            }
            case EViPropId_N50::SLC_CRTBRI_337:
            {
                return VendorVehicleProperty::SLC_CRTBRI_337;
            }
            case EViPropId_N50::SLC_ALCCSTMSTS_337:
            {
                return VendorVehicleProperty::SLC_ALCCSTMSTS_337;
            }
            case EViPropId_N50::SLC_COURTESYFCTMODSTS_3EC:
            {
                return VendorVehicleProperty::SLC_COURTESYFCTMODSTS_3EC;
            }
            case EViPropId_N50::SLC_MUSICRHYTHMSTS_3EC:
            {
                return VendorVehicleProperty::SLC_MUSICRHYTHMSTS_3EC;
            }
            case EViPropId_N50::SLC_BRIBREATHSTS_3EC:
            {
                return VendorVehicleProperty::SLC_BRIBREATHSTS_3EC;
            }
            case EViPropId_N50::SLC_VEHSPDRHYTHMSTS_3EC:
            {
                return VendorVehicleProperty::SLC_VEHSPDRHYTHMSTS_3EC;
            }
            case EViPropId_N50::SLC_DRVMDSTS_3EC:
            {
                return VendorVehicleProperty::SLC_DRVMDSTS_3EC;
            }
            case EViPropId_N50::SLC_ACMODSTS_3EC:
            {
                return VendorVehicleProperty::SLC_ACMODSTS_3EC;
            }
            case EViPropId_N50::SLC_DOWSTS_3EC:
            {
                return VendorVehicleProperty::SLC_DOWSTS_3EC;
            }
            case EViPropId_N50::SLC_BRI_3EC:
            {
                return VendorVehicleProperty::SLC_BRI_3EC;
            }
            case EViPropId_N50::SLC_COLOURBREATHSTS2_3EC:
            {
                return VendorVehicleProperty::SLC_COLOURBREATHSTS2_3EC;
            }
            case EViPropId_N50::SLC_ALCSPCHSTS_3EC:
            {
                return VendorVehicleProperty::SLC_ALCSPCHSTS_3EC;
            }
            case EViPropId_N50::SLC_ALCMOBCHAREMDSTS_3EC:
            {
                return VendorVehicleProperty::SLC_ALCMOBCHAREMDSTS_3EC;
            }
            case EViPropId_N50::SLC_LOGOLIGSTS_3EC:
            {
                return VendorVehicleProperty::SLC_LOGOLIGSTS_3EC;
            }
            case EViPropId_N50::SLC_CONTRASTCOLORSTS1_3EC:
            {
                return VendorVehicleProperty::SLC_CONTRASTCOLORSTS1_3EC;
            }
            case EViPropId_N50::SLC_CONTRASTCOLORSTS2_3EC:
            {
                return VendorVehicleProperty::SLC_CONTRASTCOLORSTS2_3EC;
            }
            case EViPropId_N50::SLC_CONTRASTCOLORSTS3_3EC:
            {
                return VendorVehicleProperty::SLC_CONTRASTCOLORSTS3_3EC;
            }
            case EViPropId_N50::VCU_REFRSHMODRESTRNTFCTCMD_357:
            {
                return VendorVehicleProperty::VCU_REFRSHMODRESTRNTFCTCMD_357;
            }
            case EViPropId_N50::RESETFLG_TRIPFROMLASTCHARGE_AB_3BD:
            {
                return VendorVehicleProperty::RESETFLG_TRIPFROMLASTCHARGE_AB_3BD;
            }
            case EViPropId_N50::VCU_REMPWRBATTHEATGENDCMD_511:
            {
                return VendorVehicleProperty::VCU_REMPWRBATTHEATGENDCMD_511;
            }
            case EViPropId_N50::VCU_REMBATTHEATGFAILREASON_511:
            {
                return VendorVehicleProperty::VCU_REMBATTHEATGFAILREASON_511;
            }
            case EViPropId_N50::VCU_PETSMODFOBDREASON_511:
            {
                return VendorVehicleProperty::VCU_PETSMODFOBDREASON_511;
            }
            case EViPropId_N50::VCU_PETSMODWARN_511:
            {
                return VendorVehicleProperty::VCU_PETSMODWARN_511;
            }
            case EViPropId_N50::VCU_VEHCRTCHRGENDSOC_511:
            {
                return VendorVehicleProperty::VCU_VEHCRTCHRGENDSOC_511;
            }
            case EViPropId_N50::ECC_INSDT_582:
            {
                return VendorVehicleProperty::ECC_INSDT_582;
            }
            case EViPropId_N50::ECC_PARTICLECONC_582:
            {
                return VendorVehicleProperty::ECC_PARTICLECONC_582;
            }
            case EViPropId_N50::VCU_ALRMLAMP_FS_105:
            {
                return VendorVehicleProperty::VCU_ALRMLAMP_FS_105;
            }
            case EViPropId_N50::VCU_CRUISEFLTTIP_105:
            {
                return VendorVehicleProperty::VCU_CRUISEFLTTIP_105;
            }
            case EViPropId_N50::VCU_DRVMODEXTNSIG_105:
            {
                return VendorVehicleProperty::VCU_DRVMODEXTNSIG_105;
            }
            case EViPropId_N50::VCU_CRUISESTS_105:
            {
                return VendorVehicleProperty::VCU_CRUISESTS_105;
            }
            case EViPropId_N50::VCU_CRUISEAIMSPD_105:
            {
                return VendorVehicleProperty::VCU_CRUISEAIMSPD_105;
            }
            case EViPropId_N50::VCU_DRVPWRLIMPERC_503:
            {
                return VendorVehicleProperty::VCU_DRVPWRLIMPERC_503;
            }
            case EViPropId_N50::VCU_EGYFBPWRLIMPERC_503:
            {
                return VendorVehicleProperty::VCU_EGYFBPWRLIMPERC_503;
            }
            case EViPropId_N50::VCU_MEMCHRGRMNMILGTHD_503:
            {
                return VendorVehicleProperty::VCU_MEMCHRGRMNMILGTHD_503;
            }
            case EViPropId_N50::VCU_USRHMIPROMT_503:
            {
                return VendorVehicleProperty::VCU_USRHMIPROMT_503;
            }
            case EViPropId_N50::VCU_RESVCHRGSTSDISP_503:
            {
                return VendorVehicleProperty::VCU_RESVCHRGSTSDISP_503;
            }
            case EViPropId_N50::VCU_INSNTEGYCNSEHR_503:
            {
                return VendorVehicleProperty::VCU_INSNTEGYCNSEHR_503;
            }
            case EViPropId_N50::VCU_MONRPWRBATTTHERMRUNAWAYALRM_504:
            {
                return VendorVehicleProperty::VCU_MONRPWRBATTTHERMRUNAWAYALRM_504;
            }
            case EViPropId_N50::VCU_LNCHCTRLTRIGRMN_504:
            {
                return VendorVehicleProperty::VCU_LNCHCTRLTRIGRMN_504;
            }
            case EViPropId_N50::VCU_SHIFTOPERRMN_504:
            {
                return VendorVehicleProperty::VCU_SHIFTOPERRMN_504;
            }
            case EViPropId_N50::VCU_MCUFSYSOVERTDISP_504:
            {
                return VendorVehicleProperty::VCU_MCUFSYSOVERTDISP_504;
            }
            case EViPropId_N50::VCU_MCURSYSOVERTDISP_504:
            {
                return VendorVehicleProperty::VCU_MCURSYSOVERTDISP_504;
            }
            case EViPropId_N50::VCU_VEHSYSFLTLAMP_504:
            {
                return VendorVehicleProperty::VCU_VEHSYSFLTLAMP_504;
            }
            case EViPropId_N50::VCU_RMNUSRCLSECCDISPCMD_504:
            {
                return VendorVehicleProperty::VCU_RMNUSRCLSECCDISPCMD_504;
            }
            case EViPropId_N50::VCU_RMNUSRECCFCTLMTDISPCMD_504:
            {
                return VendorVehicleProperty::VCU_RMNUSRECCFCTLMTDISPCMD_504;
            }
            case EViPropId_N50::VCU_LNCHCTRLMODDIRMN_504:
            {
                return VendorVehicleProperty::VCU_LNCHCTRLMODDIRMN_504;
            }
            case EViPropId_N50::VCU_DRVRNGVLD_504:
            {
                return VendorVehicleProperty::VCU_DRVRNGVLD_504;
            }
            case EViPropId_N50::VCU_SUBTOLEGYCNSE_AS_3B8:
            {
                return VendorVehicleProperty::VCU_SUBTOLEGYCNSE_AS_3B8;
            }
            case EViPropId_N50::VCU_ACCUEEGYCNSE_505:
            {
                return VendorVehicleProperty::VCU_ACCUEEGYCNSE_505;
            }
            case EViPropId_N50::VCU_EGYRECOVFORBNFLG_505:
            {
                return VendorVehicleProperty::VCU_EGYRECOVFORBNFLG_505;
            }
            case EViPropId_N50::VCU_DRVPWRLIMINDCRLAMP_505:
            {
                return VendorVehicleProperty::VCU_DRVPWRLIMINDCRLAMP_505;
            }
            case EViPropId_N50::VCU_BATTFLTINDCN_505:
            {
                return VendorVehicleProperty::VCU_BATTFLTINDCN_505;
            }
            case EViPropId_N50::VCU_CHRGINDCRLAMP_505:
            {
                return VendorVehicleProperty::VCU_CHRGINDCRLAMP_505;
            }
            case EViPropId_N50::VCU_CHRGDCHAGUNCNCTNINDCRLAMP_505:
            {
                return VendorVehicleProperty::VCU_CHRGDCHAGUNCNCTNINDCRLAMP_505;
            }
            case EViPropId_N50::VCU_CHRGGUNSTRT_505:
            {
                return VendorVehicleProperty::VCU_CHRGGUNSTRT_505;
            }
            case EViPropId_N50::VCU_SOCLOCHRGRMN_50C:
            {
                return VendorVehicleProperty::VCU_SOCLOCHRGRMN_50C;
            }
            case EViPropId_N50::VCU_DRVGMILGDISPTYPCFM_50C:
            {
                return VendorVehicleProperty::VCU_DRVGMILGDISPTYPCFM_50C;
            }
            case EViPropId_N50::BMS_ALRMLAMP_FS_215:
            {
                return VendorVehicleProperty::BMS_ALRMLAMP_FS_215;
            }
            case EViPropId_N50::BMS_CHRGCRATEDISP_240:
            {
                return VendorVehicleProperty::BMS_CHRGCRATEDISP_240;
            }
            case EViPropId_N50::BMS_PWRBATTAVLEGY_580:
            {
                return VendorVehicleProperty::BMS_PWRBATTAVLEGY_580;
            }
            case EViPropId_N50::BMS_FBREMHEATGOPERSTS_363:
            {
                return VendorVehicleProperty::BMS_FBREMHEATGOPERSTS_363;
            }
            case EViPropId_N50::BMS_VEHEXTDCHASTS_363:
            {
                return VendorVehicleProperty::BMS_VEHEXTDCHASTS_363;
            }
            case EViPropId_N50::BMS_CHRGINSULFCTOPENSTS_363:
            {
                return VendorVehicleProperty::BMS_CHRGINSULFCTOPENSTS_363;
            }
            case EViPropId_N50::APA_FMEBSTS_2A0:
            {
                return VendorVehicleProperty::APA_FMEBSTS_2A0;
            }
            case EViPropId_N50::APA_RMEBSTS_2A0:
            {
                return VendorVehicleProperty::APA_RMEBSTS_2A0;
            }
            case EViPropId_N50::APA_STS_FPAS_558:
            {
                return VendorVehicleProperty::APA_STS_FPAS_558;
            }
            case EViPropId_N50::APA_STS_RPAS_558:
            {
                return VendorVehicleProperty::APA_STS_RPAS_558;
            }
            case EViPropId_N50::ESP_FLTINDCN_HHC_332:
            {
                return VendorVehicleProperty::ESP_FLTINDCN_HHC_332;
            }
            case EViPropId_N50::ESP_ACTVINDCN_AVH_332:
            {
                return VendorVehicleProperty::ESP_ACTVINDCN_AVH_332;
            }
            case EViPropId_N50::ESP_SWTINDCN_AVH_332:
            {
                return VendorVehicleProperty::ESP_SWTINDCN_AVH_332;
            }
            case EViPropId_N50::ESP_FLTINDCN_AVH_332:
            {
                return VendorVehicleProperty::ESP_FLTINDCN_AVH_332;
            }
            case EViPropId_N50::EPS_FLTINDCN_470:
            {
                return VendorVehicleProperty::EPS_FLTINDCN_470;
            }
            case EViPropId_N50::BCM_RLS_LIGHTSWTREQ_321:
            {
                return VendorVehicleProperty::BCM_RLS_LIGHTSWTREQ_321;
            }
            case EViPropId_N50::BCM_SWH_STEERWHLHEATGSTS_321:
            {
                return VendorVehicleProperty::BCM_SWH_STEERWHLHEATGSTS_321;
            }
            case EViPropId_N50::BCM_TIMEOUTPOWER_OFFFEEDBACK_321:
            {
                return VendorVehicleProperty::BCM_TIMEOUTPOWER_OFFFEEDBACK_321;
            }
            case EViPropId_N50::BCM_LIGHTREQREASON_RLS_321:
            {
                return VendorVehicleProperty::BCM_LIGHTREQREASON_RLS_321;
            }
            case EViPropId_N50::BCM_OFFUNLCKSETSTSFB_321:
            {
                return VendorVehicleProperty::BCM_OFFUNLCKSETSTSFB_321;
            }
            case EViPropId_N50::BCM_SUNSHADERUNNGSTS_345:
            {
                return VendorVehicleProperty::BCM_SUNSHADERUNNGSTS_345;
            }
            case EViPropId_N50::BCM_SUNSHADEPOSNINFO_345:
            {
                return VendorVehicleProperty::BCM_SUNSHADEPOSNINFO_345;
            }
            case EViPropId_N50::BCM_LEPOSNLAMPFLT_539:
            {
                return VendorVehicleProperty::BCM_LEPOSNLAMPFLT_539;
            }
            case EViPropId_N50::BCM_RIPOSNLAMPFLT_539:
            {
                return VendorVehicleProperty::BCM_RIPOSNLAMPFLT_539;
            }
            case EViPropId_N50::BCM_LELOBEAMFLT_539:
            {
                return VendorVehicleProperty::BCM_LELOBEAMFLT_539;
            }
            case EViPropId_N50::BCM_RILOBEAMFLT_539:
            {
                return VendorVehicleProperty::BCM_RILOBEAMFLT_539;
            }
            case EViPropId_N50::BCM_LEHIBEAMFLT_539:
            {
                return VendorVehicleProperty::BCM_LEHIBEAMFLT_539;
            }
            case EViPropId_N50::BCM_RIHIBEAMFLT_539:
            {
                return VendorVehicleProperty::BCM_RIHIBEAMFLT_539;
            }
            case EViPropId_N50::BCM_LEDRLFLT_539:
            {
                return VendorVehicleProperty::BCM_LEDRLFLT_539;
            }
            case EViPropId_N50::BCM_RIDRLFLT_539:
            {
                return VendorVehicleProperty::BCM_RIDRLFLT_539;
            }
            case EViPropId_N50::BCM_LEFRNTFOGLAMPFLT_539:
            {
                return VendorVehicleProperty::BCM_LEFRNTFOGLAMPFLT_539;
            }
            case EViPropId_N50::BCM_RIFRNTFOGLAMPFLT_539:
            {
                return VendorVehicleProperty::BCM_RIFRNTFOGLAMPFLT_539;
            }
            case EViPropId_N50::BCM_REFOGLAMPFLT_539:
            {
                return VendorVehicleProperty::BCM_REFOGLAMPFLT_539;
            }
            case EViPropId_N50::BCM_LOBRKLAMPFLT_539:
            {
                return VendorVehicleProperty::BCM_LOBRKLAMPFLT_539;
            }
            case EViPropId_N50::BCM_HIBRKLAMPFLT_539:
            {
                return VendorVehicleProperty::BCM_HIBRKLAMPFLT_539;
            }
            case EViPropId_N50::BCM_RVSLAMPFLT_539:
            {
                return VendorVehicleProperty::BCM_RVSLAMPFLT_539;
            }
            case EViPropId_N50::BCM_LETURNLAMPFLT_539:
            {
                return VendorVehicleProperty::BCM_LETURNLAMPFLT_539;
            }
            case EViPropId_N50::BCM_RITURNLAMPFLT_539:
            {
                return VendorVehicleProperty::BCM_RITURNLAMPFLT_539;
            }
            case EViPropId_N50::BCM_LICPLATELAMPFLT_539:
            {
                return VendorVehicleProperty::BCM_LICPLATELAMPFLT_539;
            }
            case EViPropId_N50::BCM_WINLOCKSWINPUT_539:
            {
                return VendorVehicleProperty::BCM_WINLOCKSWINPUT_539;
            }
            case EViPropId_N50::BCM_MILGDATAVLD_ODO_641:
            {
                return VendorVehicleProperty::BCM_MILGDATAVLD_ODO_641;
            }
            case EViPropId_N50::BCM_MILGRSTCNTR_ODO_641:
            {
                return VendorVehicleProperty::BCM_MILGRSTCNTR_ODO_641;
            }
            case EViPropId_N50::BCM_TOTMILG_ODO_641:
            {
                return VendorVehicleProperty::BCM_TOTMILG_ODO_641;
            }
            case EViPropId_N50::BCM_MILGOFFS_ODO_641:
            {
                return VendorVehicleProperty::BCM_MILGOFFS_ODO_641;
            }
            case EViPropId_N50::ADAS_HANDSOFFTAKEOVERREQ_32C:
            {
                return VendorVehicleProperty::ADAS_HANDSOFFTAKEOVERREQ_32C;
            }
            case EViPropId_N50::ADAS_AUDIOWARN_32C:
            {
                return VendorVehicleProperty::ADAS_AUDIOWARN_32C;
            }
            case EViPropId_N50::ADAS_LATMTNCOLOR_32C:
            {
                return VendorVehicleProperty::ADAS_LATMTNCOLOR_32C;
            }
            case EViPropId_N50::MPC_OVERSPDWARN_SLA_32E:
            {
                return VendorVehicleProperty::MPC_OVERSPDWARN_SLA_32E;
            }
            case EViPropId_N50::MPC_SPDLIMUNIT_SLA_32E:
            {
                return VendorVehicleProperty::MPC_SPDLIMUNIT_SLA_32E;
            }
            case EViPropId_N50::MPC_SPDLIM_SLA_32E:
            {
                return VendorVehicleProperty::MPC_SPDLIM_SLA_32E;
            }
            case EViPropId_N50::ADAS_WARN_FCW_33C:
            {
                return VendorVehicleProperty::ADAS_WARN_FCW_33C;
            }
            case EViPropId_N50::ADAS_STS_FCW_33C:
            {
                return VendorVehicleProperty::ADAS_STS_FCW_33C;
            }
            case EViPropId_N50::ADAS_STS_AEB_33C:
            {
                return VendorVehicleProperty::ADAS_STS_AEB_33C;
            }
            case EViPropId_N50::ADAS_TAKEOVERREQ_ACC_347:
            {
                return VendorVehicleProperty::ADAS_TAKEOVERREQ_ACC_347;
            }
            case EViPropId_N50::ADAS_DISPSPD_ACC_347:
            {
                return VendorVehicleProperty::ADAS_DISPSPD_ACC_347;
            }
            case EViPropId_N50::ADAS_SPDLIM_ASL_347:
            {
                return VendorVehicleProperty::ADAS_SPDLIM_ASL_347;
            }
            case EViPropId_N50::ADAS_SPDLIMSTS_ASL_347:
            {
                return VendorVehicleProperty::ADAS_SPDLIMSTS_ASL_347;
            }
            case EViPropId_N50::ADAS_ACC_OPERTXT_347:
            {
                return VendorVehicleProperty::ADAS_ACC_OPERTXT_347;
            }
            case EViPropId_N50::ADAS_LELCARROW_34A:
            {
                return VendorVehicleProperty::ADAS_LELCARROW_34A;
            }
            case EViPropId_N50::ADAS_RILCARROW_34A:
            {
                return VendorVehicleProperty::ADAS_RILCARROW_34A;
            }
            case EViPropId_N50::MPC_STS_HMA_334:
            {
                return VendorVehicleProperty::MPC_STS_HMA_334;
            }
            case EViPropId_N50::MPC_WARNSIGN_334:
            {
                return VendorVehicleProperty::MPC_WARNSIGN_334;
            }
            case EViPropId_N50::MPC_FOBDSIGN_334:
            {
                return VendorVehicleProperty::MPC_FOBDSIGN_334;
            }
            case EViPropId_N50::MPC_OVERTAKESIGN_334:
            {
                return VendorVehicleProperty::MPC_OVERTAKESIGN_334;
            }
            case EViPropId_N50::MPC_FRNTCAMBLI_334:
            {
                return VendorVehicleProperty::MPC_FRNTCAMBLI_334;
            }
            case EViPropId_N50::MPC_HMASETFB_334:
            {
                return VendorVehicleProperty::MPC_HMASETFB_334;
            }
            case EViPropId_N50::MPC_FRNTCAMFLT_334:
            {
                return VendorVehicleProperty::MPC_FRNTCAMFLT_334;
            }
            case EViPropId_N50::ADAS_LANECRVT_340:
            {
                return VendorVehicleProperty::ADAS_LANECRVT_340;
            }
            case EViPropId_N50::ADAS_LELINETYP_340:
            {
                return VendorVehicleProperty::ADAS_LELINETYP_340;
            }
            case EViPropId_N50::ADAS_RILINETYP_340:
            {
                return VendorVehicleProperty::ADAS_RILINETYP_340;
            }
            case EViPropId_N50::ADAS_LELINECOLOR_340:
            {
                return VendorVehicleProperty::ADAS_LELINECOLOR_340;
            }
            case EViPropId_N50::ADAS_RILINECOLOR_340:
            {
                return VendorVehicleProperty::ADAS_RILINECOLOR_340;
            }
            case EViPropId_N50::ADAS_LELINEDST_340:
            {
                return VendorVehicleProperty::ADAS_LELINEDST_340;
            }
            case EViPropId_N50::ADAS_RILINEDST_340:
            {
                return VendorVehicleProperty::ADAS_RILINEDST_340;
            }
            case EViPropId_N50::ADAS_LELINEFLASH_340:
            {
                return VendorVehicleProperty::ADAS_LELINEFLASH_340;
            }
            case EViPropId_N50::ADAS_RILINEFLASH_340:
            {
                return VendorVehicleProperty::ADAS_RILINEFLASH_340;
            }
            case EViPropId_N50::ADAS_INTEGTCRSSWTFB_340:
            {
                return VendorVehicleProperty::ADAS_INTEGTCRSSWTFB_340;
            }
            case EViPropId_N50::ADAS_FLTINDCR_340:
            {
                return VendorVehicleProperty::ADAS_FLTINDCR_340;
            }
            case EViPropId_N50::ADAS_INTECNFLTTXT_340:
            {
                return VendorVehicleProperty::ADAS_INTECNFLTTXT_340;
            }
            case EViPropId_N50::ADAS_ACCICONDISP_340:
            {
                return VendorVehicleProperty::ADAS_ACCICONDISP_340;
            }
            case EViPropId_N50::MPC_CMRR_FR_RIWARN_FCTA_243:
            {
                return VendorVehicleProperty::MPC_CMRR_FR_RIWARN_FCTA_243;
            }
            case EViPropId_N50::MPC_CMRR_FL_LEWARN_FCTA_243:
            {
                return VendorVehicleProperty::MPC_CMRR_FL_LEWARN_FCTA_243;
            }
            case EViPropId_N50::CMRR_RR_RIWARN_DOW_33A:
            {
                return VendorVehicleProperty::CMRR_RR_RIWARN_DOW_33A;
            }
            case EViPropId_N50::TBOX_RESVACCHRGOPENSTS_4F4:
            {
                return VendorVehicleProperty::TBOX_RESVACCHRGOPENSTS_4F4;
            }
            case EViPropId_N50::TBOX_RESVACCHRGSTRTTI_HR_62E:
            {
                return VendorVehicleProperty::TBOX_RESVACCHRGSTRTTI_HR_62E;
            }
            case EViPropId_N50::TBOX_RESVACCHRGSTRTTI_MINS_62E:
            {
                return VendorVehicleProperty::TBOX_RESVACCHRGSTRTTI_MINS_62E;
            }
            case EViPropId_N50::TBOX_MONRESVACCHRGREPSTRTSET_62E:
            {
                return VendorVehicleProperty::TBOX_MONRESVACCHRGREPSTRTSET_62E;
            }
            case EViPropId_N50::TBOX_RESVACCHRGENDTI_HR_62E:
            {
                return VendorVehicleProperty::TBOX_RESVACCHRGENDTI_HR_62E;
            }
            case EViPropId_N50::TBOX_RESVACCHRGENDTI_MINS_62E:
            {
                return VendorVehicleProperty::TBOX_RESVACCHRGENDTI_MINS_62E;
            }
            case EViPropId_N50::TBOX_RESVACCHRGENDSET_62E:
            {
                return VendorVehicleProperty::TBOX_RESVACCHRGENDSET_62E;
            }
            case EViPropId_N50::TBOX_MONRESVACCHRGREPENDSET_62E:
            {
                return VendorVehicleProperty::TBOX_MONRESVACCHRGREPENDSET_62E;
            }
            case EViPropId_N50::HUD_SWT_562:
            {
                return VendorVehicleProperty::HUD_SWT_562;
            }
            case EViPropId_N50::HUD_CRTSYSSTS_562:
            {
                return VendorVehicleProperty::HUD_CRTSYSSTS_562;
            }
            case EViPropId_N50::HUD_ILLADJ_562:
            {
                return VendorVehicleProperty::HUD_ILLADJ_562;
            }
            case EViPropId_N50::HUD_HEIADJ_562:
            {
                return VendorVehicleProperty::HUD_HEIADJ_562;
            }
            case EViPropId_N50::HUD_MODSWT_562:
            {
                return VendorVehicleProperty::HUD_MODSWT_562;
            }
            case EViPropId_N50::HUD_SNOWMODSWTSTS_562:
            {
                return VendorVehicleProperty::HUD_SNOWMODSWTSTS_562;
            }
            case EViPropId_N50::HUD_CRTLANGUAGE_562:
            {
                return VendorVehicleProperty::HUD_CRTLANGUAGE_562;
            }
            case EViPropId_N50::TBOX_CRTTI_DAY_62F:
            {
                return VendorVehicleProperty::TBOX_CRTTI_DAY_62F;
            }
            case EViPropId_N50::TBOX_CRTTI_HR_62F:
            {
                return VendorVehicleProperty::TBOX_CRTTI_HR_62F;
            }
            case EViPropId_N50::TBOX_CRTTI_MINS_62F:
            {
                return VendorVehicleProperty::TBOX_CRTTI_MINS_62F;
            }
            case EViPropId_N50::TBOX_CRTTI_YR_62F:
            {
                return VendorVehicleProperty::TBOX_CRTTI_YR_62F;
            }
            case EViPropId_N50::TBOX_CRTTI_MTH_62F:
            {
                return VendorVehicleProperty::TBOX_CRTTI_MTH_62F;
            }
            case EViPropId_N50::TBOX_CRTTI_SEC_62F:
            {
                return VendorVehicleProperty::TBOX_CRTTI_SEC_62F;
            }
            case EViPropId_N50::MCU_R_ALRMLAMP_FS_151:
            {
                return VendorVehicleProperty::MCU_R_ALRMLAMP_FS_151;
            }
            case EViPropId_N50::ESM_SPOILERMODSTS_30C:
            {
                return VendorVehicleProperty::ESM_SPOILERMODSTS_30C;
            }
            case EViPropId_N50::ESM_SPOILERMOVEMENTSTSFB_30C:
            {
                return VendorVehicleProperty::ESM_SPOILERMOVEMENTSTSFB_30C;
            }
            case EViPropId_N50::ESM_SPOILERCRLSTSFB_30C:
            {
                return VendorVehicleProperty::ESM_SPOILERCRLSTSFB_30C;
            }
            case EViPropId_N50::ESM_SPOILERWELCOMEFUNSETSTS_30C:
            {
                return VendorVehicleProperty::ESM_SPOILERWELCOMEFUNSETSTS_30C;
            }
            case EViPropId_N50::AMP_BALSETSTS_49:
            {
                return VendorVehicleProperty::AMP_BALSETSTS_49;
            }
            case EViPropId_N50::AMP_FADERSETSTS_49:
            {
                return VendorVehicleProperty::AMP_FADERSETSTS_49;
            }
            case EViPropId_N50::AMP_IESSMODSTS_49:
            {
                return VendorVehicleProperty::AMP_IESSMODSTS_49;
            }
            case EViPropId_N50::AMP_LOFRQAUDIOSETSTS_49:
            {
                return VendorVehicleProperty::AMP_LOFRQAUDIOSETSTS_49;
            }
            case EViPropId_N50::AMP_MIDFRQAUDIOSETSTS_49:
            {
                return VendorVehicleProperty::AMP_MIDFRQAUDIOSETSTS_49;
            }
            case EViPropId_N50::AMP_HIFRQAUDIOSETSTS_49:
            {
                return VendorVehicleProperty::AMP_HIFRQAUDIOSETSTS_49;
            }
            case EViPropId_N50::AMP_HFTVOLSETSTS_49:
            {
                return VendorVehicleProperty::AMP_HFTVOLSETSTS_49;
            }
            case EViPropId_N50::AMP_MUTECTRLSTS_49:
            {
                return VendorVehicleProperty::AMP_MUTECTRLSTS_49;
            }
            case EViPropId_N50::AMP_NAVVOLSETSTS_49:
            {
                return VendorVehicleProperty::AMP_NAVVOLSETSTS_49;
            }
            case EViPropId_N50::AMP_MAIVOLSETSTS_49:
            {
                return VendorVehicleProperty::AMP_MAIVOLSETSTS_49;
            }
            case EViPropId_N50::AMP_SWVERSS_675:
            {
                return VendorVehicleProperty::AMP_SWVERSS_675;
            }
            case EViPropId_N50::AMP_SWVERSM_675:
            {
                return VendorVehicleProperty::AMP_SWVERSM_675;
            }
            case EViPropId_N50::SLC_LBADJUSTSTS_3A7:
            {
                return VendorVehicleProperty::SLC_LBADJUSTSTS_3A7;
            }
            case EViPropId_N50::SLC_CONTRASTCOLORSTS6_3A7:
            {
                return VendorVehicleProperty::SLC_CONTRASTCOLORSTS6_3A7;
            }
            case EViPropId_N50::SLC_CONTRASTCOLORSTS4_3A7:
            {
                return VendorVehicleProperty::SLC_CONTRASTCOLORSTS4_3A7;
            }
            case EViPropId_N50::SLC_CONTRASTCOLORSTS_3A7:
            {
                return VendorVehicleProperty::SLC_CONTRASTCOLORSTS_3A7;
            }
            case EViPropId_N50::SLC_AUTOCOLORSTS1_3A7:
            {
                return VendorVehicleProperty::SLC_AUTOCOLORSTS1_3A7;
            }
            case EViPropId_N50::ADAS_STS_LB_58A:
            {
                return VendorVehicleProperty::ADAS_STS_LB_58A;
            }
            case EViPropId_N50::DSMC_PASSEATTRACKPOSN_3AA:
            {
                return VendorVehicleProperty::DSMC_PASSEATTRACKPOSN_3AA;
            }
            case EViPropId_N50::DSMC_PASSEATHEIPOSN_3AA:
            {
                return VendorVehicleProperty::DSMC_PASSEATHEIPOSN_3AA;
            }
            case EViPropId_N50::DSMC_PASSEATBACKPOSN_3AA:
            {
                return VendorVehicleProperty::DSMC_PASSEATBACKPOSN_3AA;
            }
            case EViPropId_N50::DSMC_PASSEATCUSHAGPOSN_3AA:
            {
                return VendorVehicleProperty::DSMC_PASSEATCUSHAGPOSN_3AA;
            }
            case EViPropId_N50::DSMC_PASSSEATMEMRECALLFB_66:
            {
                return VendorVehicleProperty::DSMC_PASSSEATMEMRECALLFB_66;
            }
            case EViPropId_N50::DSMC_PASSSEATMEMDATAUPDFB_66:
            {
                return VendorVehicleProperty::DSMC_PASSSEATMEMDATAUPDFB_66;
            }
            case EViPropId_N50::DSMC_PASSSEATTRACKSWTSTS_328:
            {
                return VendorVehicleProperty::DSMC_PASSSEATTRACKSWTSTS_328;
            }
            case EViPropId_N50::DSMC_PASSSEATBACKSWTSTS_328:
            {
                return VendorVehicleProperty::DSMC_PASSSEATBACKSWTSTS_328;
            }
            case EViPropId_N50::DSMC_PASSSEATCUSHAGSWTSTS_328:
            {
                return VendorVehicleProperty::DSMC_PASSSEATCUSHAGSWTSTS_328;
            }
            case EViPropId_N50::DSMC_CRTPASSSEATUIDSUBPOSN_328:
            {
                return VendorVehicleProperty::DSMC_CRTPASSSEATUIDSUBPOSN_328;
            }
            case EViPropId_N50::DSMC_PASSSEATHEATGSTS_512:
            {
                return VendorVehicleProperty::DSMC_PASSSEATHEATGSTS_512;
            }
            case EViPropId_N50::DSMC_PASSSEATVENTNSTS_512:
            {
                return VendorVehicleProperty::DSMC_PASSSEATVENTNSTS_512;
            }
            case EViPropId_N50::DSMC_PASSSEATTRACKADJSTS_512:
            {
                return VendorVehicleProperty::DSMC_PASSSEATTRACKADJSTS_512;
            }
            case EViPropId_N50::DSMC_PASSSEATBACKADJSTS_512:
            {
                return VendorVehicleProperty::DSMC_PASSSEATBACKADJSTS_512;
            }
            case EViPropId_N50::DSMC_RRSEATHEATSTS_512:
            {
                return VendorVehicleProperty::DSMC_RRSEATHEATSTS_512;
            }
            case EViPropId_N50::DSMC_PASSLUMBARUPDSTS_512:
            {
                return VendorVehicleProperty::DSMC_PASSLUMBARUPDSTS_512;
            }
            case EViPropId_N50::DSMC_PASSLUMBARDWNSTS_512:
            {
                return VendorVehicleProperty::DSMC_PASSLUMBARDWNSTS_512;
            }
            case EViPropId_N50::DSMC_PASSLUMBARFWDSTS_512:
            {
                return VendorVehicleProperty::DSMC_PASSLUMBARFWDSTS_512;
            }
            case EViPropId_N50::DSMC_PASSLUMBARBACKWSTS_512:
            {
                return VendorVehicleProperty::DSMC_PASSLUMBARBACKWSTS_512;
            }
            case EViPropId_N50::DSMC_PASSSEATHEIADJSTS_512:
            {
                return VendorVehicleProperty::DSMC_PASSSEATHEIADJSTS_512;
            }
            case EViPropId_N50::DSMC_PASSSEATCUSHAGADJSTS_512:
            {
                return VendorVehicleProperty::DSMC_PASSSEATCUSHAGADJSTS_512;
            }
            case EViPropId_N50::DSMC_SECROWSEATWELFCTSETFB_512:
            {
                return VendorVehicleProperty::DSMC_SECROWSEATWELFCTSETFB_512;
            }
            case EViPropId_N50::DSMC_MASFR_SEATMASMOD_512:
            {
                return VendorVehicleProperty::DSMC_MASFR_SEATMASMOD_512;
            }
            case EViPropId_N50::DSMC_MASFR_SEATMASGRADESTS_512:
            {
                return VendorVehicleProperty::DSMC_MASFR_SEATMASGRADESTS_512;
            }
            case EViPropId_N50::DSMC_PASSSEATTILTPERCENTADJFB_67:
            {
                return VendorVehicleProperty::DSMC_PASSSEATTILTPERCENTADJFB_67;
            }
            case EViPropId_N50::VCU_CHRGGUNANTITHFTOPENSTS_49C:
            {
                return VendorVehicleProperty::VCU_CHRGGUNANTITHFTOPENSTS_49C;
            }
            case EViPropId_N50::VCU_EHUCHRGDCHAREQ_49C:
            {
                return VendorVehicleProperty::VCU_EHUCHRGDCHAREQ_49C;
            }
            case EViPropId_N50::VCU_CHRGDCHABTNREQ_49C:
            {
                return VendorVehicleProperty::VCU_CHRGDCHABTNREQ_49C;
            }
            case EViPropId_N50::BMS_CHRGSTSDISP_49D:
            {
                return VendorVehicleProperty::BMS_CHRGSTSDISP_49D;
            }
            case EViPropId_N50::EPS_MODSTS_475:
            {
                return VendorVehicleProperty::EPS_MODSTS_475;
            }
            case EViPropId_N50::BMS_BATTLOWTEMPIND_3C3:
            {
                return VendorVehicleProperty::BMS_BATTLOWTEMPIND_3C3;
            }
            case EViPropId_N50::BMS_RMNGCHRGTIDISPLY_29F:
            {
                return VendorVehicleProperty::BMS_RMNGCHRGTIDISPLY_29F;
            }
            case EViPropId_N50::VCU_DRVMODSIG_102:
            {
                return VendorVehicleProperty::VCU_DRVMODSIG_102;
            }
            case EViPropId_N50::VCU_ACLRTIREQ_102:
            {
                return VendorVehicleProperty::VCU_ACLRTIREQ_102;
            }
            case EViPropId_N50::VCU_SPORTMODACCTI_3A2:
            {
                return VendorVehicleProperty::VCU_SPORTMODACCTI_3A2;
            }
            case EViPropId_N50::VCU_COMFORTMODACCTI_3A2:
            {
                return VendorVehicleProperty::VCU_COMFORTMODACCTI_3A2;
            }
            case EViPropId_N50::VCU_ECOMODACCTI_3A2:
            {
                return VendorVehicleProperty::VCU_ECOMODACCTI_3A2;
            }
            case EViPropId_N50::VCU_ONEPEDALMODACCTI_3A2:
            {
                return VendorVehicleProperty::VCU_ONEPEDALMODACCTI_3A2;
            }
            case EViPropId_N50::VCU_PERSONALMODACCTI_3A2:
            {
                return VendorVehicleProperty::VCU_PERSONALMODACCTI_3A2;
            }
            case EViPropId_N50::VCU_DRVSTYLEFACTOR_3A2:
            {
                return VendorVehicleProperty::VCU_DRVSTYLEFACTOR_3A2;
            }
            case EViPropId_N50::VCU_DRVSTYLE_3A2:
            {
                return VendorVehicleProperty::VCU_DRVSTYLE_3A2;
            }
            case EViPropId_N50::VCU_BRKEGYRECOVINTENSTS_3E8:
            {
                return VendorVehicleProperty::VCU_BRKEGYRECOVINTENSTS_3E8;
            }
            case EViPropId_N50::VCU_WORMSTS_3E8:
            {
                return VendorVehicleProperty::VCU_WORMSTS_3E8;
            }
            case EViPropId_N50::VCU_ACLRMODSTS_3E8:
            {
                return VendorVehicleProperty::VCU_ACLRMODSTS_3E8;
            }
            case EViPropId_N50::VCU_CHRGPORTENAFLG_3AB:
            {
                return VendorVehicleProperty::VCU_CHRGPORTENAFLG_3AB;
            }
            case EViPropId_N50::VCU_OPENCLSFLTINFODISP_3AB:
            {
                return VendorVehicleProperty::VCU_OPENCLSFLTINFODISP_3AB;
            }
            case EViPropId_N50::VCU_VEHCURDISCHRGENDMILE_3AB:
            {
                return VendorVehicleProperty::VCU_VEHCURDISCHRGENDMILE_3AB;
            }
            case EViPropId_N50::VCU_CHRGPORTDOORPOSST_3AB:
            {
                return VendorVehicleProperty::VCU_CHRGPORTDOORPOSST_3AB;
            }
            case EViPropId_N50::BCM_EEMINFOREQQUIESCENTCRT_3A9:
            {
                return VendorVehicleProperty::BCM_EEMINFOREQQUIESCENTCRT_3A9;
            }
            case EViPropId_N50::BCM_EEMFIMINSAVELEMOD_3A9:
            {
                return VendorVehicleProperty::BCM_EEMFIMINSAVELEMOD_3A9;
            }
            case EViPropId_N50::BCM_VEVMMENUMVEHMDME_3A9:
            {
                return VendorVehicleProperty::BCM_VEVMMENUMVEHMDME_3A9;
            }
            case EViPropId_N50::VCU_CARWASHMODENA_50B:
            {
                return VendorVehicleProperty::VCU_CARWASHMODENA_50B;
            }
            case EViPropId_N50::VCU_CARWASHMODSTS_50B:
            {
                return VendorVehicleProperty::VCU_CARWASHMODSTS_50B;
            }
            case EViPropId_N50::MFS_INCFOLWDST_514:
            {
                return VendorVehicleProperty::MFS_INCFOLWDST_514;
            }
            case EViPropId_N50::MFS_DECFOLWDST_514:
            {
                return VendorVehicleProperty::MFS_DECFOLWDST_514;
            }
            case EViPropId_N50::MFS_CUSTBTN_514:
            {
                return VendorVehicleProperty::MFS_CUSTBTN_514;
            }
            case EViPropId_N50::MFS_PARKAID_514:
            {
                return VendorVehicleProperty::MFS_PARKAID_514;
            }
            case EViPropId_N50::MFS_LEROLLUP_514:
            {
                return VendorVehicleProperty::MFS_LEROLLUP_514;
            }
            case EViPropId_N50::MFS_LEROLLDWN_514:
            {
                return VendorVehicleProperty::MFS_LEROLLDWN_514;
            }
            case EViPropId_N50::MFS_LEROLLPRESS_514:
            {
                return VendorVehicleProperty::MFS_LEROLLPRESS_514;
            }
            case EViPropId_N50::MFS_SRCSWTBTN_514:
            {
                return VendorVehicleProperty::MFS_SRCSWTBTN_514;
            }
            case EViPropId_N50::MFS_VOICERCTCNBTN_514:
            {
                return VendorVehicleProperty::MFS_VOICERCTCNBTN_514;
            }
            case EViPropId_N50::MFS_PREVSONGTUNESIG_514:
            {
                return VendorVehicleProperty::MFS_PREVSONGTUNESIG_514;
            }
            case EViPropId_N50::MFS_NEXTSONGTUNESIG_514:
            {
                return VendorVehicleProperty::MFS_NEXTSONGTUNESIG_514;
            }
            case EViPropId_N50::MFS_RIROLLUP_514:
            {
                return VendorVehicleProperty::MFS_RIROLLUP_514;
            }
            case EViPropId_N50::MFS_RIROLLDWN_514:
            {
                return VendorVehicleProperty::MFS_RIROLLDWN_514;
            }
            case EViPropId_N50::MFS_RIROLLPRESS_514:
            {
                return VendorVehicleProperty::MFS_RIROLLPRESS_514;
            }
            case EViPropId_N50::MFS_STEERWHLHEATGINDCRLAMPSTS_514:
            {
                return VendorVehicleProperty::MFS_STEERWHLHEATGINDCRLAMPSTS_514;
            }
            case EViPropId_N50::EUM_LECHILDLOCKSTS_309:
            {
                return VendorVehicleProperty::EUM_LECHILDLOCKSTS_309;
            }
            case EViPropId_N50::EUM_RICHILDLOCKSTS_309:
            {
                return VendorVehicleProperty::EUM_RICHILDLOCKSTS_309;
            }
            case EViPropId_N50::ECC_AFU_SWSTS_4FC:
            {
                return VendorVehicleProperty::ECC_AFU_SWSTS_4FC;
            }
            case EViPropId_N50::ECC_AFU_CHANNELSET_4FC:
            {
                return VendorVehicleProperty::ECC_AFU_CHANNELSET_4FC;
            }
            case EViPropId_N50::ECC_AFU_CONCENTRATION_4FC:
            {
                return VendorVehicleProperty::ECC_AFU_CONCENTRATION_4FC;
            }
            case EViPropId_N50::ECC_AFU_CHANNELCHGSTS_4FC:
            {
                return VendorVehicleProperty::ECC_AFU_CHANNELCHGSTS_4FC;
            }
            case EViPropId_N50::ECC_AFU_CH1STS_4FC:
            {
                return VendorVehicleProperty::ECC_AFU_CH1STS_4FC;
            }
            case EViPropId_N50::ECC_AFU_CH2STS_4FC:
            {
                return VendorVehicleProperty::ECC_AFU_CH2STS_4FC;
            }
            case EViPropId_N50::ECC_AFU_CH3STS_4FC:
            {
                return VendorVehicleProperty::ECC_AFU_CH3STS_4FC;
            }
            case EViPropId_N50::ECC_AFU_CH1LEVSTS_4FC:
            {
                return VendorVehicleProperty::ECC_AFU_CH1LEVSTS_4FC;
            }
            case EViPropId_N50::ECC_AFU_CH2LEVSTS_4FC:
            {
                return VendorVehicleProperty::ECC_AFU_CH2LEVSTS_4FC;
            }
            case EViPropId_N50::ECC_AFU_CH3LEVSTS_4FC:
            {
                return VendorVehicleProperty::ECC_AFU_CH3LEVSTS_4FC;
            }
            case EViPropId_N50::ECC_AFU_CH1EXPIRATIONREMINDER_4FC:
            {
                return VendorVehicleProperty::ECC_AFU_CH1EXPIRATIONREMINDER_4FC;
            }
            case EViPropId_N50::ECC_AFU_CH2EXPIRATIONREMINDER_4FC:
            {
                return VendorVehicleProperty::ECC_AFU_CH2EXPIRATIONREMINDER_4FC;
            }
            case EViPropId_N50::ECC_AFU_CH3EXPIRATIONREMINDER_4FC:
            {
                return VendorVehicleProperty::ECC_AFU_CH3EXPIRATIONREMINDER_4FC;
            }
            case EViPropId_N50::VCU_SOKTSPLYINTERACTIVESTS_4DC:
            {
                return VendorVehicleProperty::VCU_SOKTSPLYINTERACTIVESTS_4DC;
            }
            case EViPropId_N50::VCU_SOKTFUNOPERPROMT_EHU_4DC:
            {
                return VendorVehicleProperty::VCU_SOKTFUNOPERPROMT_EHU_4DC;
            }
            case EViPropId_N50::VCU_EXHIBCARMODSIG_219:
            {
                return VendorVehicleProperty::VCU_EXHIBCARMODSIG_219;
            }
            case EViPropId_N50::TBOX_OTAMOD_548:
            {
                return VendorVehicleProperty::TBOX_OTAMOD_548;
            }
            case EViPropId_N50::BCM_BACKGNDBRILVL_3A3:
            {
                return VendorVehicleProperty::BCM_BACKGNDBRILVL_3A3;
            }
            case EViPropId_N50::VCU_PETSMODREQFLG_3EE:
            {
                return VendorVehicleProperty::VCU_PETSMODREQFLG_3EE;
            }
            case EViPropId_N50::VCU_PWRANTITHEFT_3EE:
            {
                return VendorVehicleProperty::VCU_PWRANTITHEFT_3EE;
            }
            case EViPropId_N50::VCU_CHRGMODFUNSTS_3BD:
            {
                return VendorVehicleProperty::VCU_CHRGMODFUNSTS_3BD;
            }
            case EViPropId_N50::APM_LRLOCKWINSTS_3E0:
            {
                return VendorVehicleProperty::APM_LRLOCKWINSTS_3E0;
            }
            case EViPropId_N50::APM_RRLOCKWINSTS_3E0:
            {
                return VendorVehicleProperty::APM_RRLOCKWINSTS_3E0;
            }
            case EViPropId_N50::APM_LFWINPOSFB_3E0:
            {
                return VendorVehicleProperty::APM_LFWINPOSFB_3E0;
            }
            case EViPropId_N50::APM_RFWINPOSFB_3E0:
            {
                return VendorVehicleProperty::APM_RFWINPOSFB_3E0;
            }
            case EViPropId_N50::APM_LRWINPOSFB_3E0:
            {
                return VendorVehicleProperty::APM_LRWINPOSFB_3E0;
            }
            case EViPropId_N50::APM_RRWINPOSFB_3E0:
            {
                return VendorVehicleProperty::APM_RRWINPOSFB_3E0;
            }
            case EViPropId_N50::VCU_CHRGSTOPSOCPLANVAL_51C:
            {
                return VendorVehicleProperty::VCU_CHRGSTOPSOCPLANVAL_51C;
            }
            case EViPropId_N50::AVAP_SENTISNVTYSETSTS_4E7:
            {
                return VendorVehicleProperty::AVAP_SENTISNVTYSETSTS_4E7;
            }
            case EViPropId_N50::SLC_ALCSTS_510:
            {
                return VendorVehicleProperty::SLC_ALCSTS_510;
            }
            case EViPropId_N50::SLC_SCRNBRIAUTOSTS_510:
            {
                return VendorVehicleProperty::SLC_SCRNBRIAUTOSTS_510;
            }
            case EViPropId_N50::SLC_COLORCSTMSTS_510:
            {
                return VendorVehicleProperty::SLC_COLORCSTMSTS_510;
            }
            case EViPropId_N50::SLC_ALCCRTADJ_COLOR1_510:
            {
                return VendorVehicleProperty::SLC_ALCCRTADJ_COLOR1_510;
            }
            case EViPropId_N50::SLC_ALCCRTADJ_COLOR2_510:
            {
                return VendorVehicleProperty::SLC_ALCCRTADJ_COLOR2_510;
            }
            case EViPropId_N50::SLC_AIRVETN_AL_STS_510:
            {
                return VendorVehicleProperty::SLC_AIRVETN_AL_STS_510;
            }
            case EViPropId_N50::SLC_ALCDUALAREAMODSTS_510:
            {
                return VendorVehicleProperty::SLC_ALCDUALAREAMODSTS_510;
            }
            case EViPropId_N50::SLC_TURNLAMPMODSTS_510:
            {
                return VendorVehicleProperty::SLC_TURNLAMPMODSTS_510;
            }
            case EViPropId_N50::ECC_UVCSTS_3F7:
            {
                return VendorVehicleProperty::ECC_UVCSTS_3F7;
            }
            case EViPropId_N50::HUD_ENTEREOLMOD_49E:
            {
                return VendorVehicleProperty::HUD_ENTEREOLMOD_49E;
            }
            case EViPropId_N50::HUD_TESTPICTUREDEBUG_49E:
            {
                return VendorVehicleProperty::HUD_TESTPICTUREDEBUG_49E;
            }
            case EViPropId_N50::HUD_ARPARA1FB1_6B:
            {
                return VendorVehicleProperty::HUD_ARPARA1FB1_6B;
            }
            case EViPropId_N50::HUD_ARPARA1FB2_6B:
            {
                return VendorVehicleProperty::HUD_ARPARA1FB2_6B;
            }
            case EViPropId_N50::HUD_ARPARA1FB3_6B:
            {
                return VendorVehicleProperty::HUD_ARPARA1FB3_6B;
            }
            case EViPropId_N50::HUD_ARPARA1FB4_6B:
            {
                return VendorVehicleProperty::HUD_ARPARA1FB4_6B;
            }
            case EViPropId_N50::HUD_ARPARA1FB5_6B:
            {
                return VendorVehicleProperty::HUD_ARPARA1FB5_6B;
            }
            case EViPropId_N50::HUD_ARPARA1FB6_6B:
            {
                return VendorVehicleProperty::HUD_ARPARA1FB6_6B;
            }
            case EViPropId_N50::HUD_ARPARA1FB7_6B:
            {
                return VendorVehicleProperty::HUD_ARPARA1FB7_6B;
            }
            case EViPropId_N50::HUD_ARPARA1FB8_6B:
            {
                return VendorVehicleProperty::HUD_ARPARA1FB8_6B;
            }
            case EViPropId_N50::HUD_ARPARA1FB9_6B:
            {
                return VendorVehicleProperty::HUD_ARPARA1FB9_6B;
            }
            case EViPropId_N50::HUD_ARPARA1FB10_6B:
            {
                return VendorVehicleProperty::HUD_ARPARA1FB10_6B;
            }
            case EViPropId_N50::HUD_ARPARA1FB11_6B:
            {
                return VendorVehicleProperty::HUD_ARPARA1FB11_6B;
            }
            case EViPropId_N50::HUD_ARPARA1FB12_6B:
            {
                return VendorVehicleProperty::HUD_ARPARA1FB12_6B;
            }
            case EViPropId_N50::HUD_ARPARA1FB13_6B:
            {
                return VendorVehicleProperty::HUD_ARPARA1FB13_6B;
            }
            case EViPropId_N50::HUD_ARPARA1FB14_6B:
            {
                return VendorVehicleProperty::HUD_ARPARA1FB14_6B;
            }
            case EViPropId_N50::HUD_ARPARA1FB15_6B:
            {
                return VendorVehicleProperty::HUD_ARPARA1FB15_6B;
            }
            case EViPropId_N50::HUD_ARPARA1FB16_6B:
            {
                return VendorVehicleProperty::HUD_ARPARA1FB16_6B;
            }
            case EViPropId_N50::HUD_ARPARA2FB1_6B:
            {
                return VendorVehicleProperty::HUD_ARPARA2FB1_6B;
            }
            case EViPropId_N50::HUD_ARPARA2FB2_6B:
            {
                return VendorVehicleProperty::HUD_ARPARA2FB2_6B;
            }
            case EViPropId_N50::HUD_ARPARA2FB3_6B:
            {
                return VendorVehicleProperty::HUD_ARPARA2FB3_6B;
            }
            case EViPropId_N50::HUD_ARPARA2FB4_6B:
            {
                return VendorVehicleProperty::HUD_ARPARA2FB4_6B;
            }
            case EViPropId_N50::HUD_ARPARA2FB5_6B:
            {
                return VendorVehicleProperty::HUD_ARPARA2FB5_6B;
            }
            case EViPropId_N50::HUD_ARPARA2FB6_6B:
            {
                return VendorVehicleProperty::HUD_ARPARA2FB6_6B;
            }
            case EViPropId_N50::HUD_ARPARA2FB7_6B:
            {
                return VendorVehicleProperty::HUD_ARPARA2FB7_6B;
            }
            case EViPropId_N50::HUD_ARPARA2FB8_6B:
            {
                return VendorVehicleProperty::HUD_ARPARA2FB8_6B;
            }
            case EViPropId_N50::HUD_ARPARA2FB9_6B:
            {
                return VendorVehicleProperty::HUD_ARPARA2FB9_6B;
            }
            case EViPropId_N50::HUD_ARPARA2FB10_6B:
            {
                return VendorVehicleProperty::HUD_ARPARA2FB10_6B;
            }
            case EViPropId_N50::HUD_ARPARA2FB11_6B:
            {
                return VendorVehicleProperty::HUD_ARPARA2FB11_6B;
            }
            case EViPropId_N50::HUD_ARPARA2FB12_6B:
            {
                return VendorVehicleProperty::HUD_ARPARA2FB12_6B;
            }
            case EViPropId_N50::HUD_ARPARA2FB13_6B:
            {
                return VendorVehicleProperty::HUD_ARPARA2FB13_6B;
            }
            case EViPropId_N50::HUD_ARPARA2FB14_6B:
            {
                return VendorVehicleProperty::HUD_ARPARA2FB14_6B;
            }
            case EViPropId_N50::HUD_ARPARA2FB15_6B:
            {
                return VendorVehicleProperty::HUD_ARPARA2FB15_6B;
            }
            case EViPropId_N50::HUD_ARPARA2FB16_6B:
            {
                return VendorVehicleProperty::HUD_ARPARA2FB16_6B;
            }
            case EViPropId_N50::HUD_ARPARA3FB1_6C:
            {
                return VendorVehicleProperty::HUD_ARPARA3FB1_6C;
            }
            case EViPropId_N50::HUD_ARPARA3FB2_6C:
            {
                return VendorVehicleProperty::HUD_ARPARA3FB2_6C;
            }
            case EViPropId_N50::HUD_ARPARA3FB3_6C:
            {
                return VendorVehicleProperty::HUD_ARPARA3FB3_6C;
            }
            case EViPropId_N50::HUD_ARPARA3FB4_6C:
            {
                return VendorVehicleProperty::HUD_ARPARA3FB4_6C;
            }
            case EViPropId_N50::HUD_ARPARA3FB5_6C:
            {
                return VendorVehicleProperty::HUD_ARPARA3FB5_6C;
            }
            case EViPropId_N50::HUD_ARPARA3FB6_6C:
            {
                return VendorVehicleProperty::HUD_ARPARA3FB6_6C;
            }
            case EViPropId_N50::HUD_ARPARA3FB7_6C:
            {
                return VendorVehicleProperty::HUD_ARPARA3FB7_6C;
            }
            case EViPropId_N50::HUD_ARPARA3FB8_6C:
            {
                return VendorVehicleProperty::HUD_ARPARA3FB8_6C;
            }
            case EViPropId_N50::HUD_ARPARA3FB9_6C:
            {
                return VendorVehicleProperty::HUD_ARPARA3FB9_6C;
            }
            case EViPropId_N50::HUD_ARPARA3FB10_6C:
            {
                return VendorVehicleProperty::HUD_ARPARA3FB10_6C;
            }
            case EViPropId_N50::HUD_ARPARA3FB11_6C:
            {
                return VendorVehicleProperty::HUD_ARPARA3FB11_6C;
            }
            case EViPropId_N50::HUD_ARPARA3FB12_6C:
            {
                return VendorVehicleProperty::HUD_ARPARA3FB12_6C;
            }
            case EViPropId_N50::HUD_ARPARA3FB13_6C:
            {
                return VendorVehicleProperty::HUD_ARPARA3FB13_6C;
            }
            case EViPropId_N50::HUD_ARPARA3FB14_6C:
            {
                return VendorVehicleProperty::HUD_ARPARA3FB14_6C;
            }
            case EViPropId_N50::HUD_ARPARA3FB15_6C:
            {
                return VendorVehicleProperty::HUD_ARPARA3FB15_6C;
            }
            case EViPropId_N50::HUD_ARPARA3FB16_6C:
            {
                return VendorVehicleProperty::HUD_ARPARA3FB16_6C;
            }
            case EViPropId_N50::HUD_ARPARA4FB1_6C:
            {
                return VendorVehicleProperty::HUD_ARPARA4FB1_6C;
            }
            case EViPropId_N50::HUD_ARPARA4FB2_6C:
            {
                return VendorVehicleProperty::HUD_ARPARA4FB2_6C;
            }
            case EViPropId_N50::HUD_ARPARA4FB3_6C:
            {
                return VendorVehicleProperty::HUD_ARPARA4FB3_6C;
            }
            case EViPropId_N50::HUD_ARPARA4FB4_6C:
            {
                return VendorVehicleProperty::HUD_ARPARA4FB4_6C;
            }
            case EViPropId_N50::HUD_ARPARA4FB5_6C:
            {
                return VendorVehicleProperty::HUD_ARPARA4FB5_6C;
            }
            case EViPropId_N50::HUD_ARPARA4FB6_6C:
            {
                return VendorVehicleProperty::HUD_ARPARA4FB6_6C;
            }
            case EViPropId_N50::HUD_ARPARA4FB7_6C:
            {
                return VendorVehicleProperty::HUD_ARPARA4FB7_6C;
            }
            case EViPropId_N50::HUD_ARPARA4FB8_6C:
            {
                return VendorVehicleProperty::HUD_ARPARA4FB8_6C;
            }
            case EViPropId_N50::BMS_MAXLOADPWR_5BF:
            {
                return VendorVehicleProperty::BMS_MAXLOADPWR_5BF;
            }
            case EViPropId_N50::VCU_BATTHEATGMNGBSDMAP_616:
            {
                return VendorVehicleProperty::VCU_BATTHEATGMNGBSDMAP_616;
            }
            case EViPropId_N50::VCU_VEHWEIGHT_5BC:
            {
                return VendorVehicleProperty::VCU_VEHWEIGHT_5BC;
            }
            case EViPropId_N50::VCU_EGYCOSTMODEL_5BC:
            {
                return VendorVehicleProperty::VCU_EGYCOSTMODEL_5BC;
            }
            case EViPropId_N50::VCU_VEHSPD1EGYCONSUME_5BC:
            {
                return VendorVehicleProperty::VCU_VEHSPD1EGYCONSUME_5BC;
            }
            case EViPropId_N50::VCU_VEHSPD2EGYCONSUME_5BC:
            {
                return VendorVehicleProperty::VCU_VEHSPD2EGYCONSUME_5BC;
            }
            case EViPropId_N50::VCU_VEHSPD3EGYCONSUME_5BC:
            {
                return VendorVehicleProperty::VCU_VEHSPD3EGYCONSUME_5BC;
            }
            case EViPropId_N50::VCU_VEHSPD4EGYCONSUME_5BC:
            {
                return VendorVehicleProperty::VCU_VEHSPD4EGYCONSUME_5BC;
            }
            case EViPropId_N50::VCU_VEHSPD5EGYCONSUME_5BC:
            {
                return VendorVehicleProperty::VCU_VEHSPD5EGYCONSUME_5BC;
            }
            case EViPropId_N50::VCU_VEHSPD6EGYCONSUME_5BC:
            {
                return VendorVehicleProperty::VCU_VEHSPD6EGYCONSUME_5BC;
            }
            case EViPropId_N50::VCU_VEHSPD7EGYCONSUME_5BC:
            {
                return VendorVehicleProperty::VCU_VEHSPD7EGYCONSUME_5BC;
            }
            case EViPropId_N50::VCU_VEHSPD8EGYCONSUME_5BC:
            {
                return VendorVehicleProperty::VCU_VEHSPD8EGYCONSUME_5BC;
            }
            case EViPropId_N50::VCU_VEHSPD9EGYCONSUME_5BC:
            {
                return VendorVehicleProperty::VCU_VEHSPD9EGYCONSUME_5BC;
            }
            case EViPropId_N50::VCU_VEHSPD10EGYCONSUME_5BC:
            {
                return VendorVehicleProperty::VCU_VEHSPD10EGYCONSUME_5BC;
            }
            case EViPropId_N50::VCU_VEHSPD11EGYCONSUME_5BC:
            {
                return VendorVehicleProperty::VCU_VEHSPD11EGYCONSUME_5BC;
            }
            case EViPropId_N50::VCU_VEHSPD12EGYCONSUME_5BC:
            {
                return VendorVehicleProperty::VCU_VEHSPD12EGYCONSUME_5BC;
            }
            case EViPropId_N50::VCU_VEHSPD13EGYCONSUME_5BC:
            {
                return VendorVehicleProperty::VCU_VEHSPD13EGYCONSUME_5BC;
            }
            case EViPropId_N50::VCU_VEHSPD14EGYCONSUME_5BC:
            {
                return VendorVehicleProperty::VCU_VEHSPD14EGYCONSUME_5BC;
            }
            case EViPropId_N50::VCU_VEHSPD15EGYCONSUME_5BC:
            {
                return VendorVehicleProperty::VCU_VEHSPD15EGYCONSUME_5BC;
            }
            case EViPropId_N50::VCU_SLOPEDECLINECONSUMECOEF_5BC:
            {
                return VendorVehicleProperty::VCU_SLOPEDECLINECONSUMECOEF_5BC;
            }
            case EViPropId_N50::VCU_ATTACHCONSUMEPWR_5BC:
            {
                return VendorVehicleProperty::VCU_ATTACHCONSUMEPWR_5BC;
            }
            case EViPropId_N50::VCU_FERRYCONSUME_5BC:
            {
                return VendorVehicleProperty::VCU_FERRYCONSUME_5BC;
            }
            case EViPropId_N50::VCU_SLOPERISECONSUMECOEF_5BC:
            {
                return VendorVehicleProperty::VCU_SLOPERISECONSUMECOEF_5BC;
            }
            case EViPropId_N50::BCM_OPENDOORLAMPLANGUAGESWTSTS_311:
            {
                return VendorVehicleProperty::BCM_OPENDOORLAMPLANGUAGESWTSTS_311;
            }
            case EViPropId_N50::BCM_LOCKSOUNDPROMPTSWT_311:
            {
                return VendorVehicleProperty::BCM_LOCKSOUNDPROMPTSWT_311;
            }
            case EViPropId_N50::BCM_SMARTOPENTRUNK_311:
            {
                return VendorVehicleProperty::BCM_SMARTOPENTRUNK_311;
            }
            case EViPropId_N50::RSM_SSMOVEMENT_311:
            {
                return VendorVehicleProperty::RSM_SSMOVEMENT_311;
            }
            case EViPropId_N50::RSM_SSPOSPECR_311:
            {
                return VendorVehicleProperty::RSM_SSPOSPECR_311;
            }
            case EViPropId_N50::BCM_LOCKAUTOCLSSUNSSWTFB_311:
            {
                return VendorVehicleProperty::BCM_LOCKAUTOCLSSUNSSWTFB_311;
            }
            case EViPropId_N50::VCU_DRVGMILGDISPPERC_3B6:
            {
                return VendorVehicleProperty::VCU_DRVGMILGDISPPERC_3B6;
            }
            case EViPropId_N50::VCU_DRRANGDISPERCENT_HIGPRECDISPLAYREQUIRE_3B6:
            {
                return VendorVehicleProperty::VCU_DRRANGDISPERCENT_HIGPRECDISPLAYREQUIRE_3B6;
            }
            case EViPropId_N50::VCU_DRRANGDISPERCENT_HIGPREC_3B6:
            {
                return VendorVehicleProperty::VCU_DRRANGDISPERCENT_HIGPREC_3B6;
            }
            case EViPropId_N50::VCU_RAMPMODENABLETIP_50E:
            {
                return VendorVehicleProperty::VCU_RAMPMODENABLETIP_50E;
            }
            case EViPropId_N50::VCU_EHUPWROFFENA_50E:
            {
                return VendorVehicleProperty::VCU_EHUPWROFFENA_50E;
            }
            case EViPropId_N50::CPD_CHILDCALLASWTSTS_3B2:
            {
                return VendorVehicleProperty::CPD_CHILDCALLASWTSTS_3B2;
            }
            case EViPropId_N50::PDCU_EXHIBCARMODNOTICE_509:
            {
                return VendorVehicleProperty::PDCU_EXHIBCARMODNOTICE_509;
            }
            case EViPropId_N50::PDCU_EXHIBCARMODTEXT_509:
            {
                return VendorVehicleProperty::PDCU_EXHIBCARMODTEXT_509;
            }
            case EViPropId_N50::VCU_EXHIBCARMODDISABLENOTICE_509:
            {
                return VendorVehicleProperty::VCU_EXHIBCARMODDISABLENOTICE_509;
            }
            case EViPropId_N50::BCM_EXHIBCARMODDISABLENOTICE_3DE:
            {
                return VendorVehicleProperty::BCM_EXHIBCARMODDISABLENOTICE_3DE;
            }
            case EViPropId_N50::TBOX_EXHIBCARMODDISABLENOTICE_3FF:
            {
                return VendorVehicleProperty::TBOX_EXHIBCARMODDISABLENOTICE_3FF;
            }
            case EViPropId_N50::AVAP_SENTRYMODTI1VLD_547:
            {
                return VendorVehicleProperty::AVAP_SENTRYMODTI1VLD_547;
            }
            case EViPropId_N50::AVAP_SENTRYMODTI2VLD_547:
            {
                return VendorVehicleProperty::AVAP_SENTRYMODTI2VLD_547;
            }
            case EViPropId_N50::AVAP_SENTRYMODSTRTTI1_547:
            {
                return VendorVehicleProperty::AVAP_SENTRYMODSTRTTI1_547;
            }
            case EViPropId_N50::AVAP_SENTRYMODDATE_547:
            {
                return VendorVehicleProperty::AVAP_SENTRYMODDATE_547;
            }
            case EViPropId_N50::AVAP_SENTRYMODSTRTTI2_547:
            {
                return VendorVehicleProperty::AVAP_SENTRYMODSTRTTI2_547;
            }
            case EViPropId_N50::AVAP_SENTRYMODENDTI1_547:
            {
                return VendorVehicleProperty::AVAP_SENTRYMODENDTI1_547;
            }
            case EViPropId_N50::AVAP_SENTRYMODENDTI2_547:
            {
                return VendorVehicleProperty::AVAP_SENTRYMODENDTI2_547;
            }
            case EViPropId_N50::AVAP_SENTRYMODSTSFB_549:
            {
                return VendorVehicleProperty::AVAP_SENTRYMODSTSFB_549;
            }
            case EViPropId_N50::AVAP_SENTRYMODALRM_549:
            {
                return VendorVehicleProperty::AVAP_SENTRYMODALRM_549;
            }
            case EViPropId_N50::TBOX_SENTRYMODSTRTTI1_B6:
            {
                return VendorVehicleProperty::TBOX_SENTRYMODSTRTTI1_B6;
            }
            case EViPropId_N50::TBOX_SENTRYMODDATE_B6:
            {
                return VendorVehicleProperty::TBOX_SENTRYMODDATE_B6;
            }
            case EViPropId_N50::TBOX_SENTRYMODSTRTTI2_B6:
            {
                return VendorVehicleProperty::TBOX_SENTRYMODSTRTTI2_B6;
            }
            case EViPropId_N50::TBOX_SENTRYMODENDTI1_B6:
            {
                return VendorVehicleProperty::TBOX_SENTRYMODENDTI1_B6;
            }
            case EViPropId_N50::TBOX_SENTRYMODENDTI2_B6:
            {
                return VendorVehicleProperty::TBOX_SENTRYMODENDTI2_B6;
            }
            case EViPropId_N50::TBOX_SENTRYMODSW_B7:
            {
                return VendorVehicleProperty::TBOX_SENTRYMODSW_B7;
            }
            case EViPropId_N50::VCU_FSTEXTTIP_5A9:
            {
                return VendorVehicleProperty::VCU_FSTEXTTIP_5A9;
            }
            case EViPropId_N50::PDCUFUELLEVELDISP_5A9:
            {
                return VendorVehicleProperty::PDCUFUELLEVELDISP_5A9;
            }
            case EViPropId_N50::PDCUFUMILGVLD_5A9:
            {
                return VendorVehicleProperty::PDCUFUMILGVLD_5A9;
            }
            case EViPropId_N50::PDCUFUMILGE_5A9:
            {
                return VendorVehicleProperty::PDCUFUMILGE_5A9;
            }
            case EViPropId_N50::BCM_DRLSWTSTS_51F:
            {
                return VendorVehicleProperty::BCM_DRLSWTSTS_51F;
            }
            case EViPropId_N50::PDCUCHKENGLAMP_31F:
            {
                return VendorVehicleProperty::PDCUCHKENGLAMP_31F;
            }
            case EViPropId_N50::PDCURNGLIM_31F:
            {
                return VendorVehicleProperty::PDCURNGLIM_31F;
            }
            case EViPropId_N50::PDCUENRGMOD_3D0:
            {
                return VendorVehicleProperty::PDCUENRGMOD_3D0;
            }
            case EViPropId_N50::EMSOIL_PFAULT_3D0:
            {
                return VendorVehicleProperty::EMSOIL_PFAULT_3D0;
            }
            case EViPropId_N50::INDMODEGYFBDIS_3D0:
            {
                return VendorVehicleProperty::INDMODEGYFBDIS_3D0;
            }
            case EViPropId_N50::INDMODACCMODDIS_3D0:
            {
                return VendorVehicleProperty::INDMODACCMODDIS_3D0;
            }
            case EViPropId_N50::INDMODSTEEMODDIS_3D0:
            {
                return VendorVehicleProperty::INDMODSTEEMODDIS_3D0;
            }
            case EViPropId_N50::INDMODCREMODDIS_3D0:
            {
                return VendorVehicleProperty::INDMODCREMODDIS_3D0;
            }
            case EViPropId_N50::WORMSPEEDSTA_3D0:
            {
                return VendorVehicleProperty::WORMSPEEDSTA_3D0;
            }
            case EViPropId_N50::PDCUPARKCHARGEST_3D0:
            {
                return VendorVehicleProperty::PDCUPARKCHARGEST_3D0;
            }
            case EViPropId_N50::PDCUBMSTEMPLOWDRVLIMITHINT_3D0:
            {
                return VendorVehicleProperty::PDCUBMSTEMPLOWDRVLIMITHINT_3D0;
            }
            case EViPropId_N50::VCU_OBC_REMIND_LAMP_54B:
            {
                return VendorVehicleProperty::VCU_OBC_REMIND_LAMP_54B;
            }
            case EViPropId_N50::IHM_IHMSTS_539:
            {
                return VendorVehicleProperty::IHM_IHMSTS_539;
            }
            case EViPropId_N50::IHM_IHMHEATSTS_539:
            {
                return VendorVehicleProperty::IHM_IHMHEATSTS_539;
            }
            case EViPropId_N50::BCM_LRSEATHEATSTS_311:
            {
                return VendorVehicleProperty::BCM_LRSEATHEATSTS_311;
            }
            case EViPropId_N50::BCM_RRSEATHEATSTS_311:
            {
                return VendorVehicleProperty::BCM_RRSEATHEATSTS_311;
            }
            case EViPropId_N50::TBOXSENTISNVTYSET_B6:
            {
                return VendorVehicleProperty::TBOXSENTISNVTYSET_B6;
            }
            case EViPropId_N50::ISGSYSTFLTDISP_21C:
            {
                return VendorVehicleProperty::ISGSYSTFLTDISP_21C;
            }
            case EViPropId_N50::ISGMTRTTEMPFLTDISP_21C:
            {
                return VendorVehicleProperty::ISGMTRTTEMPFLTDISP_21C;
            }
            case EViPropId_N50::ISGINVTEMPFLTDISP_21C:
            {
                return VendorVehicleProperty::ISGINVTEMPFLTDISP_21C;
            }
            case EViPropId_N50::VCU_ABNORCHARGPORTALERT_3BC:
            {
                return VendorVehicleProperty::VCU_ABNORCHARGPORTALERT_3BC;
            }
            case EViPropId_N50::VCULASTCHRGTRIPAVRGPWRCNSPTN_AS_3B8:
            {
                return VendorVehicleProperty::VCULASTCHRGTRIPAVRGPWRCNSPTN_AS_3B8;
            }
            case EViPropId_N50::VCU_TRIPAAVRGPWRCNSPTN_AS_3B8:
            {
                return VendorVehicleProperty::VCU_TRIPAAVRGPWRCNSPTN_AS_3B8;
            }
            case EViPropId_N50::VCU_TRIPBAVRGPWRCNSPTN_AS_3B8:
            {
                return VendorVehicleProperty::VCU_TRIPBAVRGPWRCNSPTN_AS_3B8;
            }
            case EViPropId_N50::VCU_100KMREMDRVGRNG_AB_3B8:
            {
                return VendorVehicleProperty::VCU_100KMREMDRVGRNG_AB_3B8;
            }
            case EViPropId_N50::VCU_PWRCNSPTNDIAG_AS_3B8:
            {
                return VendorVehicleProperty::VCU_PWRCNSPTNDIAG_AS_3B8;
            }
            case EViPropId_N50::PDCUENRGMODREJHINT_AS_3B8:
            {
                return VendorVehicleProperty::PDCUENRGMODREJHINT_AS_3B8;
            }
            case EViPropId_N50::VCU_PARKING_REMIND_PGEAR_AB_AS_3B8:
            {
                return VendorVehicleProperty::VCU_PARKING_REMIND_PGEAR_AB_AS_3B8;
            }
            case EViPropId_N50::PDCUHYDOPERMOD_AS_3B8:
            {
                return VendorVehicleProperty::PDCUHYDOPERMOD_AS_3B8;
            }
            case EViPropId_N50::PDCUENRGMODFLTHINT_AS_3B8:
            {
                return VendorVehicleProperty::PDCUENRGMODFLTHINT_AS_3B8;
            }
            case EViPropId_N50::PDCUIDLEMODST_AS_3B8:
            {
                return VendorVehicleProperty::PDCUIDLEMODST_AS_3B8;
            }
            case EViPropId_N50::PDCUEMISSTESTMODST_AS_3B8:
            {
                return VendorVehicleProperty::PDCUEMISSTESTMODST_AS_3B8;
            }
            case EViPropId_N50::PDCUENGSYSTWARN_AS_3B8:
            {
                return VendorVehicleProperty::PDCUENGSYSTWARN_AS_3B8;
            }
            case EViPropId_N50::PDCUEVST_AS_3B8:
            {
                return VendorVehicleProperty::PDCUEVST_AS_3B8;
            }
            case EViPropId_N50::PDCUREFSWITCHSTS_AS_3B8:
            {
                return VendorVehicleProperty::PDCUREFSWITCHSTS_AS_3B8;
            }
            case EViPropId_N50::PDCUREFUNOTALLWD_AS_3B8:
            {
                return VendorVehicleProperty::PDCUREFUNOTALLWD_AS_3B8;
            }
            case EViPropId_N50::PDCUFUFILRDOORRMN_AS_3B8:
            {
                return VendorVehicleProperty::PDCUFUFILRDOORRMN_AS_3B8;
            }
            case EViPropId_N50::PDCUFUTANKRELSPROGS_AS_3B8:
            {
                return VendorVehicleProperty::PDCUFUTANKRELSPROGS_AS_3B8;
            }
            case EViPropId_N50::HDCU_WASHMODPROMPTSIG_AB_AS_3B8:
            {
                return VendorVehicleProperty::HDCU_WASHMODPROMPTSIG_AB_AS_3B8;
            }
            case EViPropId_N50::VCULASTCHRGTRIPAVRGPWRCNSPTN_AB_3B8:
            {
                return VendorVehicleProperty::VCULASTCHRGTRIPAVRGPWRCNSPTN_AB_3B8;
            }
            case EViPropId_N50::VCU_TRIPAAVRGPWRCNSPTN_AB_3B8:
            {
                return VendorVehicleProperty::VCU_TRIPAAVRGPWRCNSPTN_AB_3B8;
            }
            case EViPropId_N50::VCU_TRIPBAVRGPWRCNSPTN_AB_3B8:
            {
                return VendorVehicleProperty::VCU_TRIPBAVRGPWRCNSPTN_AB_3B8;
            }
            case EViPropId_N50::VCU_10KMREMDRVGRNG_AB_3B8:
            {
                return VendorVehicleProperty::VCU_10KMREMDRVGRNG_AB_3B8;
            }
            case EViPropId_N50::VCU_SUBTOLEGYCNSE_AB_3B8:
            {
                return VendorVehicleProperty::VCU_SUBTOLEGYCNSE_AB_3B8;
            }
            case EViPropId_N50::VCU_ECCCNSEEGY_AS_56B:
            {
                return VendorVehicleProperty::VCU_ECCCNSEEGY_AS_56B;
            }
            case EViPropId_N50::VCU_VEHDRVCNSEEGY_AS_56B:
            {
                return VendorVehicleProperty::VCU_VEHDRVCNSEEGY_AS_56B;
            }
            case EViPropId_N50::VCU_BHMCNSEEGY_AS_56B:
            {
                return VendorVehicleProperty::VCU_BHMCNSEEGY_AS_56B;
            }
            case EViPropId_N50::VCU_VEHDRVCNSEEGY_AB_56B:
            {
                return VendorVehicleProperty::VCU_VEHDRVCNSEEGY_AB_56B;
            }
            case EViPropId_N50::VCU_ECCCNSEEGY_AB_56B:
            {
                return VendorVehicleProperty::VCU_ECCCNSEEGY_AB_56B;
            }
            case EViPropId_N50::VCU_BHMCNSEEGY_AB_56B:
            {
                return VendorVehicleProperty::VCU_BHMCNSEEGY_AB_56B;
            }
            case EViPropId_N50::VCU_INDMODACCMODDIS_3E8:
            {
                return VendorVehicleProperty::VCU_INDMODACCMODDIS_3E8;
            }
            case EViPropId_N50::VCU_INDMODEGYFBDIS_3E8:
            {
                return VendorVehicleProperty::VCU_INDMODEGYFBDIS_3E8;
            }
            case EViPropId_N50::VCU_WORMSPEEDSTA_3E8:
            {
                return VendorVehicleProperty::VCU_WORMSPEEDSTA_3E8;
            }
            case EViPropId_N50::VCU_INDMODSTEEMODDIS_3E8:
            {
                return VendorVehicleProperty::VCU_INDMODSTEEMODDIS_3E8;
            }
            case EViPropId_N50::VCU_INDMODCREMODDIS_3E8:
            {
                return VendorVehicleProperty::VCU_INDMODCREMODDIS_3E8;
            }
            case EViPropId_N50::VCU_AUTPOWOFFFUNSTA_3E8:
            {
                return VendorVehicleProperty::VCU_AUTPOWOFFFUNSTA_3E8;
            }
            case EViPropId_N50::VCU_SETARRIVESOC_5BC:
            {
                return VendorVehicleProperty::VCU_SETARRIVESOC_5BC;
            }
            case EViPropId_N50::VCU_SETLEFTSOC_5BC:
            {
                return VendorVehicleProperty::VCU_SETLEFTSOC_5BC;
            }
            case EViPropId_N50::VCU_ENGCONSM_USEINMAP_5BC:
            {
                return VendorVehicleProperty::VCU_ENGCONSM_USEINMAP_5BC;
            }
            case EViPropId_N50::VCU_DRVMODE_USEINMAP_5BC:
            {
                return VendorVehicleProperty::VCU_DRVMODE_USEINMAP_5BC;
            }
            case EViPropId_N50::VCU_BATMAXCHGPWR_USEINMAP_5BC:
            {
                return VendorVehicleProperty::VCU_BATMAXCHGPWR_USEINMAP_5BC;
            }
            case EViPropId_N50::VCU_NORMALMODAVRGPWRCNSPTN_AB_3B8:
            {
                return VendorVehicleProperty::VCU_NORMALMODAVRGPWRCNSPTN_AB_3B8;
            }
            case EViPropId_N50::VCU_PWRCNSPTNDIAG_AB_3B8:
            {
                return VendorVehicleProperty::VCU_PWRCNSPTNDIAG_AB_3B8;
            }
            case EViPropId_N50::BMS_CHGMAP1_SOC_642:
            {
                return VendorVehicleProperty::BMS_CHGMAP1_SOC_642;
            }
            case EViPropId_N50::BMS_CHGMAP1_PWR_642:
            {
                return VendorVehicleProperty::BMS_CHGMAP1_PWR_642;
            }
            case EViPropId_N50::BMS_CHGMAP2_SOC_642:
            {
                return VendorVehicleProperty::BMS_CHGMAP2_SOC_642;
            }
            case EViPropId_N50::BMS_CHGMAP2_PWR_642:
            {
                return VendorVehicleProperty::BMS_CHGMAP2_PWR_642;
            }
            case EViPropId_N50::BMS_CHGMAP3_SOC_642:
            {
                return VendorVehicleProperty::BMS_CHGMAP3_SOC_642;
            }
            case EViPropId_N50::BMS_CHGMAP3_PWR_642:
            {
                return VendorVehicleProperty::BMS_CHGMAP3_PWR_642;
            }
            case EViPropId_N50::BMS_CHGMAP4_SOC_642:
            {
                return VendorVehicleProperty::BMS_CHGMAP4_SOC_642;
            }
            case EViPropId_N50::BMS_CHGMAP4_PWR_642:
            {
                return VendorVehicleProperty::BMS_CHGMAP4_PWR_642;
            }
            case EViPropId_N50::BMS_CHGMAP5_SOC_642:
            {
                return VendorVehicleProperty::BMS_CHGMAP5_SOC_642;
            }
            case EViPropId_N50::BMS_CHGMAP5_PWR_642:
            {
                return VendorVehicleProperty::BMS_CHGMAP5_PWR_642;
            }
            case EViPropId_N50::BMS_CHGMAP6_SOC_642:
            {
                return VendorVehicleProperty::BMS_CHGMAP6_SOC_642;
            }
            case EViPropId_N50::BMS_CHGMAP6_PWR_642:
            {
                return VendorVehicleProperty::BMS_CHGMAP6_PWR_642;
            }
            case EViPropId_N50::BMS_CHGMAP7_SOC_642:
            {
                return VendorVehicleProperty::BMS_CHGMAP7_SOC_642;
            }
            case EViPropId_N50::BMS_CHGMAP7_PWR_642:
            {
                return VendorVehicleProperty::BMS_CHGMAP7_PWR_642;
            }
            case EViPropId_N50::VCU_CURTACCHRGCURTLIMIT_3BC:
            {
                return VendorVehicleProperty::VCU_CURTACCHRGCURTLIMIT_3BC;
            }
            case EViPropId_N50::SDM_PASSSECUBLTALRMSTS_319:
            {
                return VendorVehicleProperty::SDM_PASSSECUBLTALRMSTS_319;
            }
            case EViPropId_N50::CMRR_RR_SDAWARN2_58E:
            {
                return VendorVehicleProperty::CMRR_RR_SDAWARN2_58E;
            }
            case EViPropId_N50::CMRR_RR_SDASTS2_58E:
            {
                return VendorVehicleProperty::CMRR_RR_SDASTS2_58E;
            }
            case EViPropId_N50::CMRR_RL_SDASTS2_57D:
            {
                return VendorVehicleProperty::CMRR_RL_SDASTS2_57D;
            }
            case EViPropId_N50::CMRR_RL_SDAWARN2_57D:
            {
                return VendorVehicleProperty::CMRR_RL_SDAWARN2_57D;
            }
            case EViPropId_N50::DSMC_DRVRSEATBEDADJSTSFB_328:
            {
                return VendorVehicleProperty::DSMC_DRVRSEATBEDADJSTSFB_328;
            }
            case EViPropId_N50::DSMC_PASSSEATBEDADJSTSFB_328:
            {
                return VendorVehicleProperty::DSMC_PASSSEATBEDADJSTSFB_328;
            }
            case EViPropId_N50::DSMC_DRVRSEATBEDMODSTSFB_328:
            {
                return VendorVehicleProperty::DSMC_DRVRSEATBEDMODSTSFB_328;
            }
            case EViPropId_N50::DSMC_DRVRSEATBEDPOSMEMFB_328:
            {
                return VendorVehicleProperty::DSMC_DRVRSEATBEDPOSMEMFB_328;
            }
            case EViPropId_N50::DSMC_PASSSEATBEDMODSTSFB_328:
            {
                return VendorVehicleProperty::DSMC_PASSSEATBEDMODSTSFB_328;
            }
            case EViPropId_N50::DSMC_PASSSEATBEDPOSMEMFB_328:
            {
                return VendorVehicleProperty::DSMC_PASSSEATBEDPOSMEMFB_328;
            }
            case EViPropId_N50::VCU_POWSYSSELFTESTABNOPROM_57B:
            {
                return VendorVehicleProperty::VCU_POWSYSSELFTESTABNOPROM_57B;
            }
            case EViPropId_N50::EMSCOOLTT_2F6:
            {
                return VendorVehicleProperty::EMSCOOLTT_2F6;
            }
            case EViPropId_N50::EMSCOOLTVLD_2F6:
            {
                return VendorVehicleProperty::EMSCOOLTVLD_2F6;
            }
            case EViPropId_N50::EMSOIL_PFAULT_SIG_2F6:
            {
                return VendorVehicleProperty::EMSOIL_PFAULT_SIG_2F6;
            }
            case EViPropId_N50::VCU_VEHACSYCNSEEGY_579:
            {
                return VendorVehicleProperty::VCU_VEHACSYCNSEEGY_579;
            }
            case EViPropId_N50::VCU_EGYRECOVEGY_579:
            {
                return VendorVehicleProperty::VCU_EGYRECOVEGY_579;
            }
            case EViPropId_N50::VCU_DRVGMILGDISPTYPCFM_AS_50C:
            {
                return VendorVehicleProperty::VCU_DRVGMILGDISPTYPCFM_AS_50C;
            }
            case EViPropId_N50::RESETFLG_TRIPFROMLASTCHARGE_357:
            {
                return VendorVehicleProperty::RESETFLG_TRIPFROMLASTCHARGE_357;
            }
            case EViPropId_N50::ECC_SELFDRYRESP_4FC:
            {
                return VendorVehicleProperty::ECC_SELFDRYRESP_4FC;
            }
            case EViPropId_N50::TBOX_SENTRYMODTI1VLD_B6:
            {
                return VendorVehicleProperty::TBOX_SENTRYMODTI1VLD_B6;
            }
            case EViPropId_N50::TBOX_SENTRYMODTI2VLD_B6:
            {
                return VendorVehicleProperty::TBOX_SENTRYMODTI2VLD_B6;
            }
            case EViPropId_N50::DSMC_PASSSEATLEGRESTPERCENTADJFB_62:
            {
                return VendorVehicleProperty::DSMC_PASSSEATLEGRESTPERCENTADJFB_62;
            }
            case EViPropId_N50::DSMC_PASSEATLEGRESTPOSN_328:
            {
                return VendorVehicleProperty::DSMC_PASSEATLEGRESTPOSN_328;
            }
            case EViPropId_N50::DSMC_PASSSEATLEGRESTSWTSTS_328:
            {
                return VendorVehicleProperty::DSMC_PASSSEATLEGRESTSWTSTS_328;
            }
            case EViPropId_N50::DSMC_PASSSEATLEGRESTADJSTS_328:
            {
                return VendorVehicleProperty::DSMC_PASSSEATLEGRESTADJSTS_328;
            }
            case EViPropId_N50::DSMC_PASSSEATZEROGRAVITYMODSTSFB_328:
            {
                return VendorVehicleProperty::DSMC_PASSSEATZEROGRAVITYMODSTSFB_328;
            }
            case EViPropId_N50::DSMC_PASSSEATZEROGRAVITYADJSTSFB_328:
            {
                return VendorVehicleProperty::DSMC_PASSSEATZEROGRAVITYADJSTSFB_328;
            }
            case EViPropId_N50::DSMC_PASSSEATZGRAVITYPOSMEMFB_328:
            {
                return VendorVehicleProperty::DSMC_PASSSEATZGRAVITYPOSMEMFB_328;
            }
            case EViPropId_N50::SELRI_287:
            {
                return VendorVehicleProperty::SELRI_287;
            }
            case EViPropId_N50::VOLUP_287:
            {
                return VendorVehicleProperty::VOLUP_287;
            }
            case EViPropId_N50::VOLDWN_287:
            {
                return VendorVehicleProperty::VOLDWN_287;
            }
            case EViPropId_N50::MOVEPREV_287:
            {
                return VendorVehicleProperty::MOVEPREV_287;
            }
            case EViPropId_N50::MOVENEXT_287:
            {
                return VendorVehicleProperty::MOVENEXT_287;
            }
            case EViPropId_N50::USRDEFDKEY_287:
            {
                return VendorVehicleProperty::USRDEFDKEY_287;
            }
            case EViPropId_N50::ICCSPEECHRECOGKEY_287:
            {
                return VendorVehicleProperty::ICCSPEECHRECOGKEY_287;
            }
            case EViPropId_N50::VOLMUTE_287:
            {
                return VendorVehicleProperty::VOLMUTE_287;
            }
            case EViPropId_N50::AMP_GETHUTINFOSTS_1_38B:
            {
                return VendorVehicleProperty::AMP_GETHUTINFOSTS_1_38B;
            }
            case EViPropId_N50::BCM_INLOOPLAMPOUTP_3A9:
            {
                return VendorVehicleProperty::BCM_INLOOPLAMPOUTP_3A9;
            }
            default:
            {
                ALOGD("[%s] propId = 0x%04x out of range", __func__, propId);
                return VendorVehicleProperty::VENDOR_PROPERTY_INVALID;
            }
        }

    }
}  // namespace autolink