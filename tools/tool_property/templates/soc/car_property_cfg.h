/*    Copyright(C) 2024 Autolink Information Technology Co.Ltd. All rights reserved.   */
/*                                                                                     */
/*                         The file is automatically generated.                        */
/*                      !!!!!! Manual changes are prohibited !!!!!                     */
/*                                                                                     */
/* latest change:                                                                      */
/*
      {{latest_change_date}}

      {{latest_change_comment}}
*/

#ifndef APPFW_CM_CAR_PROPERTY_CFG_H
#define APPFW_CM_CAR_PROPERTY_CFG_H

#include "impl/common/car_property_def.h"

namespace AutoLink {
namespace Frameworks {
namespace CM {

const char* CAR_PROPERTY_CFG_GEN_TIME = "{{gen_time}}";

const bool ProcessHost = {{prop_host}};

const uint32_t ConfigNum = {{prop_num}};

const CarPropertyConfig gCarProperyConfigArray[ConfigNum] = {
{%- for prop in props %}
    { {{prop.prop_op}}, {{prop.prop_nty}}, {{prop.prop_intv}}, {{prop.prop_val_type}}, "{{prop.prop_val_default}}", "{{prop.prop_domain}}", "{{prop.prop_group}}", "{{prop.prop_name}}" },
{%- endfor %}
};

} // namespace CM
} // namespace Frameworks
} // namespace AutoLink

#endif
