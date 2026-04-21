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
        EViPropId_8797 pid = static_cast<EViPropId_8797>(propId);
        switch(pid) {
            case EViPropId_8797::PLGM_TRSWTSTSINDCN_391:
            {
                return VendorVehicleProperty::PLGM_TRSWTSTSINDCN_391;
            }
            default:
            {
                ALOGD("[%s] propId = 0x%04x out of range", __func__, propId);
                return VendorVehicleProperty::VENDOR_PROPERTY_INVALID;
            }
        }

    }
}  // namespace autolink