/******************************************************************************
/                              Copyright
/------------------------------------------------------------------------------
*******************************************************************************/
#ifndef VI_CLIENT_SIGNAL_%(macro)s_H
#define VI_CLIENT_SIGNAL_%(macro)s_H

#include <stdint.h>
#include <vendor/autolink/vehiclehal/2.1/types.h>
using vendor::autolink::vehiclehal::V2_1::VendorVehicleProperty;

enum class %(projectName)s : int32_t {
%(g_propid_value_list)s

};

#endif