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
    %(g_getPropValueID_list)s
    }
}  // namespace autolink