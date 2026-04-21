/******************************************************************************
/                              Copyright
/------------------------------------------------------------------------------
*******************************************************************************/
#ifndef VI_CLIENT_SIGNAL_8797_H
#define VI_CLIENT_SIGNAL_8797_H

#include <stdint.h>
#include <vendor/autolink/vehiclehal/2.1/types.h>
using vendor::autolink::vehiclehal::V2_1::VendorVehicleProperty;

enum class EViPropId_8797 : int32_t {
    PLGM_TRSWTSTSINDCN_391                                       =0x1000,
    S_IDCP_STAMPH_ST_1A0                                         =0x2000,
    S_IDCP_STAMPL_ST_1A0                                         =0x2001,
    S_IDCP_FRWDWCTL_REQ_330                                      =0x2005,
    S_IDCP_RRWDWCTL_REQ_330                                      =0x2006,
    IDCU_ALM_RED_28                                              =0x9000,
    IDCU_ALM_GREEN_28                                            =0x9001,
    IDCU_ALM_BLUE_28                                             =0x9002,
    IDCU_ALM_TARGETTRANSITIONTIME_28                             =0x9003,
    IDCU_ALM_FUNCTION_28                                         =0x9004,
    IDCU_ALM_MODE_28                                             =0x9005,
    IDCU_ALM_TRIGGER_28                                          =0x9006,
    IDCU_ALM_INTENSITY_28                                        =0x9007,


};

#endif