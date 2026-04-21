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

#ifndef SCCCOM_TX_CFG_H
#define SCCCOM_TX_CFG_H

#define SCC_TX_LIST \
{%- for prop in props %}
    {%- if 'custom' == prop.prop_domain and 'mcu' == prop.prop_group and 'CAR_PROPERTY_RW' == prop.prop_op%}
        { "{{prop.prop_domain}}.{{prop.prop_group}}.{{prop.prop_name}}", std::bind(&SccComModule::OnQNXSetNotify, this, std::placeholders::_1, {{prop.prop_mcu_tx_cmd_id}}) }, \
	{%- endif %}
{%- endfor %}


#endif