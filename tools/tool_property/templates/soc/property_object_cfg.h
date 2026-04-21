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

#ifndef APPFW_CM_PROPERTY_OBJECT_CFG_H
#define APPFW_CM_PROPERTY_OBJECT_CFG_H

#include <stdint.h>
#include <string.h>

#include <unordered_map>


namespace AutoLink {
namespace Frameworks {
namespace CM {

typedef struct PropertyObjectConfig {
    uint32_t dataCounter;  // 数据条数统计
} PropertyObjectConfig_;

const std::unordered_map<std::string, PropertyObjectConfig> gPropObjectCfgMap = {
{%- for prop_group_key in prop_group_keys %}
    { "{{prop_group_key}}", { {{prop_groups[prop_group_key]}} }},
{%- endfor %}
};

}  // namespace CM
}  // namespace Frameworks
}  // namespace AutoLink

#endif