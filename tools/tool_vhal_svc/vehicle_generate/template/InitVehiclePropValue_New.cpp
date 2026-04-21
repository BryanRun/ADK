/******************************************************************************
/                              Copyright
/------------------------------------------------------------------------------
*******************************************************************************/
#include "VehiclePropertyManager.h"
#include "VehicleDefine.h"
#include "VehicleService.h"
#include "Loging.h"

namespace vehicleservice
{
void VehiclePropertyManager::initVehiclePropValue()
{
%(vehicle_value_list)s
    LogDebug("Vehicle PropValue(%(version)s) init successfully\\n");
}
} // namespace vehicleservice