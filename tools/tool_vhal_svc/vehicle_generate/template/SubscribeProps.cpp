/******************************************************************************
/                              Copyright
/------------------------------------------------------------------------------
*******************************************************************************/

/**
 * @file SubscribeProps.cpp
 * @brief Declaration VehicleIFClient::subscribeProps
 */

#include <vhal_v2_0/FdbusClient.h>
#include "Signal.h"

namespace autolink {
void VehicleIFClient::subscribeProps() {
%(g_android_subscribe_list)s
        uint16_t size = sizeof(subscribeList) / sizeof(int32_t);
        subscribe(subscribeList, size);
        ALOGD("VehicleIFClient subscribe props: %%d done", size);
    }

}// namespace autolink