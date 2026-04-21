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

#ifndef APPFW_CM_PSIS_PROPERTY_CFG_H
#define APPFW_CM_PSIS_PROPERTY_CFG_H

#include <stdint.h>
#include <string.h>

#include <unordered_map>

#include "car_property_value.h"

{%- for did_include in did_includes %}
#include "{{did_include}}"
{%- endfor %}

namespace AutoLink {
namespace Frameworks {
namespace CM {

typedef struct PsisUsrConfig {
    uint32_t dataLen;  // unit: byte
    const char * moduleName;
} PsisUsrConfig_;

typedef struct PsisCarConfig {
{%- for did_struct in did_structs %}
    {{did_struct}}* Psis{{did_struct}}Ptr;
{%- endfor %}
} PsisCarConfig_;

const std::unordered_map<std::string, PsisUsrConfig> gPsisUsrPropCfgMap = {
{%- for prop in props %}
{%- if 0 != prop.prop_val_len %}
    { "{{prop.prop_name}}", { {{prop.prop_val_len}}, "{{prop.prop_module_name}}" }},
{%- endif %}
{%- endfor %}
};

std::unordered_map<std::string, CarPropertyValue> gPsisCarPropCfgMap;

void InitCarCfgMap( const PsisCarConfig& carCfg )
{
    gPsisCarPropCfgMap = {
{%- for prop in props %}
{%- if '' != prop.prop_did_prop_name %}
        {"{{prop.prop_name}}", { (carCfg.Psis{{prop.prop_did_struct}}Ptr)->{{prop.prop_did_prop_name}} }},
{%- endif %}
{%- endfor %}
    };
}

}  // namespace CM
}  // namespace Frameworks
}  // namespace AutoLink

#endif