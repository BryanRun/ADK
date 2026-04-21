/*
 * Copyright (C) 2018 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

 package android.car;

 import static android.Manifest.permission.ACCESS_FINE_LOCATION;

 import static com.android.car.internal.ExcludeFromCodeCoverageGeneratedReport.BOILERPLATE_CODE;

 import android.annotation.RequiresPermission;
 import android.annotation.SystemApi;
 import android.car.annotation.AddedInOrBefore;
 import android.car.annotation.ApiRequirements;
 import android.car.hardware.CarPropertyValue;
 import android.car.hardware.property.VehicleElectronicTollCollectionCardStatus;
 import android.car.hardware.property.VehicleElectronicTollCollectionCardType;

 import com.android.car.internal.ExcludeFromCodeCoverageGeneratedReport;
 import com.android.car.internal.property.CarPropertyHelper;

 /**
  * List of T1V vehicle property IDs.
  *
  * <p> Property IDs are used with the {@link android.car.hardware.property.CarPropertyManager} APIs
  * (e.g. {@link android.car.hardware.property.CarPropertyManager#getProperty(int, int)} or {@link
  * android.car.hardware.property.CarPropertyManager#setProperty(Class, int, int, Object)}).
  */
 public final class ALT1VVehiclePropertyIds {

     /**
      * Undefined property.
      *
      * <p>This property should never be used/will never be supported.
      */
     @AddedInOrBefore(majorVersion = 33)
     public static final int INVALID = 0;


    /**
     * ACU_3_CRASHOUTPUTSTS_21 <p>
     * <br>
     * Function Describe: 碰撞状态信号
 Crash signal indicates the status according to bit:
 If multiple directions collide at the same time, each collision flag bit representing each direction will be set to 1.For example, if left crash is superimposed with right crash, the output signal is 00001100
 此信号发到ECU停止工作为止 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:No crash <br>
         0x1:Belt Crash <br>
         0x2:Front Crash <br>
         0x4:Left Side Crash <br>
         0x8:Right Side Crash <br>
         0x10:Rear Crash <br>
         0x20:Roll Crash <p>
     */
        public static final int ACU_3_CRASHOUTPUTSTS_21 = 557846530;

    /**
     * BMS_PACKVOLTAGE_102 <p>
     * <br>
     * Function Describe: 电池包电压（实际电压）
 Battery Voltage <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0xFFFE:Abnormal <br>
         0xFFFF:Invalid <p>
     */
        public static final int BMS_PACKVOLTAGE_102 = 557846538;

    /**
     * BMS_CHRGDCCNCTRDETD_102 <p>
     * <br>
     * Function Describe: CC2连接状态
 CC2 connect state
 拆帧至DK 网段ID 0x4E9(FLZCU_28)14-15Bit <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Init <br>
         0x1:Connector not detected <br>
         0x2:Connector detected <br>
         0x3:SNS/Fault <p>
     */
        public static final int BMS_CHRGDCCNCTRDETD_102 = 557846561;

    /**
     * BMS_DCCHGMODE_102 <p>
     * <br>
     * Function Describe: 快充模式
 DC charge mode
 0x0:Default 默认值
 0x1:HandOver 握手
 0x2:ParaConfig充电配置
 0x3:Chging充电中
 0x4:ChgEnd充电结束
 0x5:ChgWaring充电警告
 0x6:ChgFault充电错误
 CATL无0x5状态，可以不进行配置。 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Default <br>
         0x1:HandOver <br>
         0x2:ParaConfig <br>
         0x3:Chging <br>
         0x4:ChgEnd <br>
         0x5:ChgWaring <br>
         0x6:ChgFault <p>
     */
        public static final int BMS_DCCHGMODE_102 = 557846562;

    /**
     * BMS_CHRGDCCHRGNFLTSTOPREAS_102 <p>
     * <br>
     * Function Describe: Dc charge stop reason <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:no fault <br>
         0x1:End by Infrastructure fault <br>
         0x2:BMS fault <br>
         0x3:CC2 fault <br>
         0x4:DC charge not allowd because low temperature <br>
         0x5:VCU fault <br>
         0x6:Boost fault <br>
         0x7:Other fault <p>
     */
        public static final int BMS_CHRGDCCHRGNFLTSTOPREAS_102 = 557846563;

    /**
     * BMS_ISOLATIONFAULT_102 <p>
     * <br>
     * Function Describe: 电池绝缘故障
 battery insulation fault state <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:no fault <br>
         0x1:Fault L1 <br>
         0x2:Fault L2 <br>
         0x3:Fault L3 <p>
     */
        public static final int BMS_ISOLATIONFAULT_102 = 557846576;

    /**
     * BMS_SOCDIS_102 <p>
     * <br>
     * Function Describe: 发送显示SOC
 battery indication SOC <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x3FFE:Abnormal <br>
         0x3FFF:Invalid <p>
     */
        public static final int BMS_SOCDIS_102 = 557846580;

    /**
     * EMS_ENGINESPEED_ACTUAL_103 <p>
     * <br>
     * Function Describe: 发动机转速（实际）
 PHEV:Actual Engine speed send by EMS to HCU <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0xFFFF:Invalid <p>
     */
        public static final int EMS_ENGINESPEED_ACTUAL_103 = 557846582;

    /**
     * EPSFAILSTS_122 <p>
     * <br>
     * Function Describe: EPS Fail Status <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not present <br>
         0x1:Fail present <br>
         0x2~0x3:Reserved <p>
     */
        public static final int EPSFAILSTS_122 = 557846585;

    /**
     * EPSSTEERINGANGLECALIBRATIONSTS_122 <p>
     * <br>
     * Function Describe: EPS Steering Angle Calibration Status <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Calibration is fine <br>
         0x1:No calibration or no initialization <p>
     */
        public static final int EPSSTEERINGANGLECALIBRATIONSTS_122 = 557846586;

    /**
     * EPS_EOTLEARNING_STS_122 <p>
     * <br>
     * Function Describe: Indicates the status of EPS EOT(end of travel) learning, displayed on the DMC(ICM) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Learnt <br>
         0x1:Not Learnt <p>
     */
        public static final int EPS_EOTLEARNING_STS_122 = 557846587;

    /**
     * MFSL_OK_SW_201 <p>
     * <br>
     * Function Describe: 左方控确认按键 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_action <br>
         0x1:Pressed <br>
         0x2:Stuck <br>
         0x3:invalid <p>
     */
        public static final int MFSL_OK_SW_201 = 557846592;

    /**
     * MFSL_AVM_SW_201 <p>
     * <br>
     * Function Describe: 右侧360按键 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_action <br>
         0x1:Pressed <br>
         0x2:Stuck <br>
         0x3:invalid <p>
     */
        public static final int MFSL_AVM_SW_201 = 557846593;

    /**
     * MFSL_CUSTOMIZE_201 <p>
     * <br>
     * Function Describe: 左方控自定义按键 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_action <br>
         0x1:Pressed <br>
         0x2:Stuck <br>
         0x3:invalid <p>
     */
        public static final int MFSL_CUSTOMIZE_201 = 557846594;

    /**
     * MFSR_UP_SW_205 <p>
     * <br>
     * Function Describe: 上调节开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_action <br>
         0x1:Pressed <br>
         0x2:Stuck <br>
         0x3:invalid <p>
     */
        public static final int MFSR_UP_SW_205 = 557846609;

    /**
     * MFSR_DW_SW_205 <p>
     * <br>
     * Function Describe: 下调节开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_action <br>
         0x1:Pressed <br>
         0x2:Stuck <br>
         0x3:invalid <p>
     */
        public static final int MFSR_DW_SW_205 = 557846610;

    /**
     * MFSR_LEFT_SW_205 <p>
     * <br>
     * Function Describe: 左调节开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_action <br>
         0x1:Pressed <br>
         0x2:Stuck <br>
         0x3:invalid <p>
     */
        public static final int MFSR_LEFT_SW_205 = 557846611;

    /**
     * MFSR_RIGHT_SW_205 <p>
     * <br>
     * Function Describe: 右调节开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_action <br>
         0x1:Pressed <br>
         0x2:Stuck <br>
         0x3:invalid <p>
     */
        public static final int MFSR_RIGHT_SW_205 = 557846612;

    /**
     * MFSR_OK_SW_205 <p>
     * <br>
     * Function Describe: 右侧中间键 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_action <br>
         0x1:Pressed <br>
         0x2:Stuck <br>
         0x3:invalid <p>
     */
        public static final int MFSR_OK_SW_205 = 557846613;

    /**
     * MFSR_MENU_SW_205 <p>
     * <br>
     * Function Describe: 仪表菜单(T1V)左侧仪表 
卡片栏按键 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_action <br>
         0x1:Pressed <br>
         0x2:Stuck <br>
         0x3:invalid <p>
     */
        public static final int MFSR_MENU_SW_205 = 557846614;

    /**
     * MFSR_VOICE_SW_205 <p>
     * <br>
     * Function Describe: 语音唤醒 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_action <br>
         0x1:Pressed <br>
         0x2:Stuck <br>
         0x3:invalid <p>
     */
        public static final int MFSR_VOICE_SW_205 = 557846615;

    /**
     * MFSR_CUSTOMIZE_205 <p>
     * <br>
     * Function Describe: 用户自定义开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_action <br>
         0x1:Pressed <br>
         0x2:Stuck <br>
         0x3:invalid <p>
     */
        public static final int MFSR_CUSTOMIZE_205 = 557846616;

    /**
     * LHTURNLIGHTSTS_23B <p>
     * <br>
     * Function Describe: 左转向灯工作状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:Active <p>
     */
        public static final int LHTURNLIGHTSTS_23B = 557846618;

    /**
     * RHTURNLIGHTSTS_23B <p>
     * <br>
     * Function Describe: 右转向灯工作状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:Active <p>
     */
        public static final int RHTURNLIGHTSTS_23B = 557846619;

    /**
     * LHFDOORSTS_23B <p>
     * <br>
     * Function Describe: 左前门状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Close <br>
         0x1:Ajar <br>
         0x2:full_open <br>
         0x3:Reserved <p>
     */
        public static final int LHFDOORSTS_23B = 557846620;

    /**
     * LHFDOORLOCKSTS_23B <p>
     * <br>
     * Function Describe: 左前门锁状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Locked <br>
         0x1:Unlocked <br>
         0x2:Superlocked <br>
         0x3:Unknown <p>
     */
        public static final int LHFDOORLOCKSTS_23B = 557846621;

    /**
     * LHFSEATBELTSW_23B <p>
     * <br>
     * Function Describe: 安全带检测开关，0为未插入，1为插入 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:Active <p>
     */
        public static final int LHFSEATBELTSW_23B = 557846625;

    /**
     * ONEBOX_7_TAB_HIGHTEMP_23C <p>
     * <br>
     * Function Describe: 坦克转弯工作温度过高 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:No Active <br>
         0x1:Active <p>
     */
        public static final int ONEBOX_7_TAB_HIGHTEMP_23C = 557846628;

    /**
     * ONEBOX_7_TAB_ACTIVE_23C <p>
     * <br>
     * Function Describe: IPB反馈TAB状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:Active <br>
         0x2:Stand by <br>
         0x3:Failed <p>
     */
        public static final int ONEBOX_7_TAB_ACTIVE_23C = 557846629;

    /**
     * ONEBOX_7_ICCO_TGTVEL_23C <p>
     * <br>
     * Function Describe: iCCO功能目标车速 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int ONEBOX_7_ICCO_TGTVEL_23C = 557846631;

    /**
     * FLTLAMP_264H_264 <p>
     * <br>
     * Function Describe: EPB故障状态
 诊断和转毂测试模式时闪烁 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Lamp OFF <br>
         0x1:Lamp ON <br>
         0x2:Lamp Flash <br>
         0x3:Reserved <p>
     */
        public static final int FLTLAMP_264H_264 = 557846650;

    /**
     * PARKLAMP_264H_264 <p>
     * <br>
     * Function Describe: EPB驻车灯状态
 动态制动时闪烁 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Lamp OFF <br>
         0x1:Lamp ON <br>
         0x2:Lamp Flash <br>
         0x3:Reserved <p>
     */
        public static final int PARKLAMP_264H_264 = 557846651;

    /**
     * ACTRST_264H_264 <p>
     * <br>
     * Function Describe: Current state of APB actuator connected to ECU
 EPB卡钳执行状态
 
 备注：
 ①一边夹紧一边释放，按博世最新平台策略，一按照Applied外发。
 ②0x5:CompletelyReleased（IPB2.0实际按照Reserved）
 ③0x6:Half Applied（IPB2.0实际按照Reserved） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Unknow <br>
         0x1:Applied <br>
         0x2:Released <br>
         0x3:Applying <br>
         0x4:Releasing <br>
         0x5:CompletelyReleased <br>
         0x6:Half Applied <br>
         0x7:Reserved <p>
     */
        public static final int ACTRST_264H_264 = 557846652;

    /**
     * RWUST_264H_264 <p>
     * <br>
     * Function Describe: EPB 后轮防抱死工作状态：
 0x1:active仪表持续提示“紧急制动开启”且仪表红“P”灯闪烁，同时点亮制动尾灯，最后1帧信号显示完后结束 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:No active <br>
         0x1:active <p>
     */
        public static final int RWUST_264H_264 = 557846653;

    /**
     * TEXTDISP_264H_264 <p>
     * <br>
     * Function Describe: EPB文本提示
 备注：
 0x1:驻车坡度过大，请注意安全
 0x2:IPB2.0实际按照Reserved
 0x3:请关好车门并系好安全带
 0x4:请同时踩下制动踏板
 0x5:IPB2.0新增禁止P档手动释放EPB文字提示“请切换到非P档解除电子驻车”
 0x6:请先将挡位置于N挡，然后踩下制动踏板方可关闭熄火自动驻车功能 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:NO text message <br>
         0x1:Gradient too high <br>
         0x2:Clampforce not enough <br>
         0x3:fasten seatbelt <br>
         0x4:Press brake pedal <br>
         0x5:No_Release_Tip_for_Shift <br>
         0x6:Press_the_brake_pedal_first,then_shift_the_gear_to_the 'N' position <br>
         0x7~0xF:Reserved <p>
     */
        public static final int TEXTDISP_264H_264 = 557846654;

    /**
     * FRZCU_HOODSTS_27E <p>
     * <br>
     * Function Describe: 前舱盖状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Close <br>
         0x1:Ajar <br>
         0x2:full_open <br>
         0x3:Reserved <p>
     */
        public static final int FRZCU_HOODSTS_27E = 557846657;

    /**
     * FRZCU_9_POWERMODE_27E <p>
     * <br>
     * Function Describe: 低压电源状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Off <br>
         0x1:Comfortable <br>
         0x2:ON <br>
         0x3:Reserved <p>
     */
        public static final int FRZCU_9_POWERMODE_27E = 557846659;

    /**
     * FRZCU_PELOCKINKEYWARNING_27E <p>
     * <br>
     * Function Describe: PE闭锁车内有钥匙提醒 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Active <p>
     */
        public static final int FRZCU_PELOCKINKEYWARNING_27E = 557846671;

    /**
     * FRZCU_OTAPWRDWNREQFB_27E <p>
     * <br>
     * Function Describe: OTA_Power_Down_Request_FeedBack <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:No_Command <br>
         0x1:Success <br>
         0x2:Fail <br>
         0x3:Resrved <p>
     */
        public static final int FRZCU_OTAPWRDWNREQFB_27E = 557846674;

    /**
     * FRZCU_KEYLESSWARNING_27E <p>
     * <br>
     * Function Describe: 无合法钥匙提醒 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Active <p>
     */
        public static final int FRZCU_KEYLESSWARNING_27E = 557846675;

    /**
     * FRZCU_POWEROFFWARNING_27E <p>
     * <br>
     * Function Describe: 电源下电提醒 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Active <p>
     */
        public static final int FRZCU_POWEROFFWARNING_27E = 557846676;

    /**
     * FRZCU_OTAPWRONREQFB_27E <p>
     * <br>
     * Function Describe: OTA_Power_On_Request_FeedBack <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:No_Command <br>
         0x1:Success <br>
         0x2:Fail <br>
         0x3:Resrved <p>
     */
        public static final int FRZCU_OTAPWRONREQFB_27E = 557846677;

    /**
     * RHFDOORSTS_2AB <p>
     * <br>
     * Function Describe: 右前门状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Close <br>
         0x1:Ajar <br>
         0x2:full_open <br>
         0x3:Reserved <p>
     */
        public static final int RHFDOORSTS_2AB = 557846683;

    /**
     * FRZCU_1_PARKLIGHTSTS_2AB <p>
     * <br>
     * Function Describe: 位置灯状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Close <br>
         0x1:Open <p>
     */
        public static final int FRZCU_1_PARKLIGHTSTS_2AB = 557846684;

    /**
     * RHRDOORSTS_2AB <p>
     * <br>
     * Function Describe: 右后门状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Close <br>
         0x1:Ajar <br>
         0x2:full_open <br>
         0x3:Reserved <p>
     */
        public static final int RHRDOORSTS_2AB = 557846687;

    /**
     * LHRDOORSTS_2BB <p>
     * <br>
     * Function Describe:  <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Close <br>
         0x1:Ajar <br>
         0x2:full_open <br>
         0x3:Reserved <p>
     */
        public static final int LHRDOORSTS_2BB = 557846688;

    /**
     * ISGF_ERRLVL_309 <p>
     * <br>
     * Function Describe: 前发电机故障等级Error Level <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:No Error <br>
         0x1:Err_level1 <br>
         0x2:Err_level2 <br>
         0x3:Err_level3 <br>
         0x4:Err_level4 <br>
         0x5:Err_level5 <br>
         0x6:Err_level6 <p>
     */
        public static final int ISGF_ERRLVL_309 = 557846840;

    /**
     * FRZCU_FRSITPOSNSTS_313 <p>
     * <br>
     * Function Describe: 副驾座椅记忆位置反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:Location1 <br>
         0x2:Location2 <br>
         0x3:Location3 <p>
     */
        public static final int FRZCU_FRSITPOSNSTS_313 = 557846842;

    /**
     * CHRGHOODSTS_313 <p>
     * <br>
     * Function Describe: 充电口盖状态反馈
 股份FLZCU0x33E发，捷途由FRZCU发 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Close <br>
         0x1:Open <p>
     */
        public static final int CHRGHOODSTS_313 = 557846843;

    /**
     * ADS_2_AEBSTATUS_314 <p>
     * <br>
     * Function Describe: AEB状态信号
 以下为平台化库数据内容
 0x0:OFF
 0x1:ON
 0x2:Failure
 0x3:no_active(0x3:available捷途使用)
 0x4:active
 0x5:pre-fill
 0x6 blindness(捷途使用) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:OFF <br>
         0x1:ON <br>
         0x2:Failure <br>
         0x3:available <br>
         0x4:active <br>
         0x5:pre-fill <br>
         0x6:blindness <p>
     */
        public static final int ADS_2_AEBSTATUS_314 = 557846844;

    /**
     * FCM_2_IHCFUNCTIONSTS_314 <p>
     * <br>
     * Function Describe: 远近光自动切换功能状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Off <br>
         0x1:Standby <br>
         0x2:Active <br>
         0x3:Fault <br>
         0x4~0x7:Reserved <p>
     */
        public static final int FCM_2_IHCFUNCTIONSTS_314 = 557846846;

    /**
     * ATCM_AVH_SW_315 <p>
     * <br>
     * Function Describe: 自动驻车/AVH开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Release <br>
         0x1:Press <p>
     */
        public static final int ATCM_AVH_SW_315 = 557846853;

    /**
     * ADS_3_ICATEXTINFO_31A <p>
     * <br>
     * Function Describe: ICA状态信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:No dispaly <br>
         0x1:TJAICA Activated <br>
         0x2:TJAICA Cannot Be Activated <br>
         0x3:TJAICA Cancelled <br>
         0x4:TJAICA failure <br>
         0x5:TJAICA Suspend <br>
         0x6:TJAICA resumed <br>
         0x7:TJAICA degrade to ACC <br>
         0x8:Urgent TOR request <br>
         0x9:uncentered <br>
         0xA:Too Large curve <br>
         0xB:Abnormal tire pressure <br>
         0xC:Camera block <br>
         0xD:Master switch is off <br>
         0xE~0xF:reserved <p>
     */
        public static final int ADS_3_ICATEXTINFO_31A = 557846855;

    /**
     * ADS_3_ICASTATUS_31A <p>
     * <br>
     * Function Describe: ICA状态信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Off <br>
         0x1:Passive <br>
         0x2:Standby <br>
         0x3:Active <br>
         0x4:Failure <br>
         0x5:Suspend <br>
         0x6~0x7:reserved <p>
     */
        public static final int ADS_3_ICASTATUS_31A = 557846856;

    /**
     * ADS_3_ACCSTS_31A <p>
     * <br>
     * Function Describe: ACC状态信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Off <br>
         0x1:Passive <br>
         0x2:Standby <br>
         0x3:Active_Control <br>
         0x4:Brake Only <br>
         0x5:Override <br>
         0x6:Stand Wait <br>
         0x7:failure <br>
         0x8:Stand Active <br>
         0x9~0xF:reserved <p>
     */
        public static final int ADS_3_ACCSTS_31A = 557846858;

    /**
     * ADS_3_LKSSTS_31A <p>
     * <br>
     * Function Describe: LKS状态信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:OFF <br>
         0x1:Standby <br>
         0x2:Active <br>
         0x3:Failure <br>
         0x4:Passive <br>
         0x5~0x7:Reserved <p>
     */
        public static final int ADS_3_LKSSTS_31A = 557846859;

    /**
     * ADS_3_ELKSTS_31A <p>
     * <br>
     * Function Describe: ELK状态信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:OFF <br>
         0x1:Standby <br>
         0x2:Active <br>
         0x3:Failure <br>
         0x4:Passive <br>
         0x5~0x7:Reserved <p>
     */
        public static final int ADS_3_ELKSTS_31A = 557846863;

    /**
     * BMS_CHG_STS_32BH_32B <p>
     * <br>
     * Function Describe: 充电状态BMS_Chg_Sts <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x1:Parking chagre <br>
         0x2:Driving charge <br>
         0x3:no charge <br>
         0x4:charge complete <br>
         0xE:Abnomal <br>
         0xF:Invalid <p>
     */
        public static final int BMS_CHG_STS_32BH_32B = 557846866;

    /**
     * ADS_4_FCWMODE_333 <p>
     * <br>
     * Function Describe: FCW功能状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:OFF <br>
         0x1:ON <br>
         0x2:Failure <br>
         0x3:Active <br>
         0x4:blindness <br>
         0x5~0x7:Reserved <p>
     */
        public static final int ADS_4_FCWMODE_333 = 557846873;

    /**
     * ADS_4_SETSPD_333 <p>
     * <br>
     * Function Describe: 巡航车速 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int ADS_4_SETSPD_333 = 557846875;

    /**
     * ADS_4_ACCTEXTMESSAGE_333 <p>
     * <br>
     * Function Describe: ACC提示信息 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:No Display <br>
         0x1:ACC Activated <br>
         0x2:ACC Cannot Be Activated <br>
         0x3:ACC Cancelled <br>
         0x4:ACC failure <br>
         0x5:Weather abnormal <br>
         0x6:Driver Override <br>
         0x7:Active Decelerate <br>
         0x8:Cruise speed can not be added <br>
         0x9:ACC abort and take over request <br>
         0xA:Maximum decelerate to ahead speed sign <br>
         0xB:System add timegap to front big vehicle <br>
         0xC:Cut in reminder <br>
         0xD:Large curve remider <br>
         0xE:Auto drive off reminder <br>
         0xF:takeover timeout <p>
     */
        public static final int ADS_4_ACCTEXTMESSAGE_333 = 557846877;

    /**
     * ADS_5_ISLIOVERSPEEDWARN_335 <p>
     * <br>
     * Function Describe: 超速报警状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:No warning <br>
         0x1:Waning1 <br>
         0x2:Waning2 <br>
         0x3:Waning3 <p>
     */
        public static final int ADS_5_ISLIOVERSPEEDWARN_335 = 557846928;

    /**
     * ADS_5_ISLISPEEDLIMITSIGN_335 <p>
     * <br>
     * Function Describe: 限速标志值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:No display <br>
         0x1:Cancellation sign <br>
         0x2:5 <br>
         0x3:10 <br>
         0x4:15 <br>
         0x5:20 <br>
         0x6:25 <br>
         0x7:30 <br>
         0x8:35 <br>
         0x9:40 <br>
         0xA:45 <br>
         0xB:50 <br>
         0xC:55 <br>
         0xD:60 <br>
         0xE:65 <br>
         0xF:70 <br>
         0x10:75 <br>
         0x11:80 <br>
         0x12:85 <br>
         0x13:90 <br>
         0x14:95 <br>
         0x15:100 <br>
         0x16:105 <br>
         0x17:110 <br>
         0x18:115 <br>
         0x19:120 <br>
         0x1A:125 <br>
         0x1B:130 <br>
         0x1C:135 <br>
         0x1D:140 <br>
         0x1E:145 <br>
         0x1F:150 <br>
         0x20:155 <br>
         0x21:160 <br>
         0x22:165 <br>
         0x23:170 <br>
         0x24:175 <br>
         0x25:180 <br>
         0x26:185 <br>
         0x27:190 <br>
         0x28:195 <br>
         0x29:200 <br>
         0x2A~0xFF:Reserved <p>
     */
        public static final int ADS_5_ISLISPEEDLIMITSIGN_335 = 557846929;

    /**
     * ADS_5_ISLIWARNINGMOD_335 <p>
     * <br>
     * Function Describe: 智能限速提醒方式反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:None <br>
         0x1:Display warning; <br>
         0x2:Sound+display warning <br>
         0x3:Off <p>
     */
        public static final int ADS_5_ISLIWARNINGMOD_335 = 557846957;

    /**
     * REARDEFROSTSTS_35B <p>
     * <br>
     * Function Describe:  <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:OFF <br>
         0x1:ON <p>
     */
        public static final int REARDEFROSTSTS_35B = 557846972;

    /**
     * LISHOWMOD_395 <p>
     * <br>
     * Function Describe: LightShowMode <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:NotActive <br>
         0x1:OFF <br>
         0x2:Mode1 <br>
         0x3:Mode2 <br>
         0x4:Mode3 <br>
         0x5:Mode4(Reserved) <br>
         0x6:Mode5(Reserved) <p>
     */
        public static final int LISHOWMOD_395 = 557846977;

    /**
     * TMS_BATTERYLOOPERRORLEVEL_3DF <p>
     * <br>
     * Function Describe: Battery_Loop_Error_Level
 电池回路故障等级 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:No_Error <br>
         0x1:Derating_function <br>
         0x2:Disabler <br>
         0x3:ShutDown <br>
         0x4~0x7:Reserved <p>
     */
        public static final int TMS_BATTERYLOOPERRORLEVEL_3DF = 557847016;

    /**
     * TMS_MOTORLOOPERRORLEVEL_3DF <p>
     * <br>
     * Function Describe: Motor_Loop_Error_Level
 电驱回路故障等级 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:No_Error <br>
         0x1:Derating_function <br>
         0x2:Disabler <br>
         0x3:ShutDown <br>
         0x4~0x7:Reserved <p>
     */
        public static final int TMS_MOTORLOOPERRORLEVEL_3DF = 557847017;

    /**
     * SAM_1_STEERINGANGLE_3FC <p>
     * <br>
     * Function Describe: 方向盘转角角度值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int SAM_1_STEERINGANGLE_3FC = 557847019;

    /**
     * RMCU_1_SPEED_3FC <p>
     * <br>
     * Function Describe: 后驱动电机转速RMCU motor actual speed
 拆针至IC CAN 0x3FC (bit88) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0xFFFF:Invalid <p>
     */
        public static final int RMCU_1_SPEED_3FC = 557847023;

    /**
     * SAM_1_STEERINGANGLEVD_3FC <p>
     * <br>
     * Function Describe: 角度有效性 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Valid <br>
         0x1:Not Valid <p>
     */
        public static final int SAM_1_STEERINGANGLEVD_3FC = 557847024;

    /**
     * CSA_2_WIPRFRNTCMD_3FC <p>
     * <br>
     * Function Describe: Wiper front command for CSA.. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:OFF <br>
         0x1:AUTO <br>
         0x2:LOW <br>
         0x3:HIGH <p>
     */
        public static final int CSA_2_WIPRFRNTCMD_3FC = 557847033;

    /**
     * FLZCU_CARMODE_3FE <p>
     * <br>
     * Function Describe: 整车模式 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Normal Mode <br>
         0x1:Factory Mode <br>
         0x2:Transport Mode <br>
         0x3:Exhibition Mode <br>
         0x4~0x6:Reserved <br>
         0x7:Not active <p>
     */
        public static final int FLZCU_CARMODE_3FE = 557847036;

    /**
     * FLZCU_NAPAREA2FB_3FE <p>
     * <br>
     * Function Describe: 小憩模式开启区域2设置反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:2Row Left <br>
         0x2:2Row Right <br>
         0x3:2Row Left and Right <br>
         0x4:Front Left and 2Row Right <br>
         0x5:Front Right and 2Row Left <br>
         0x6:Front Left and 2Row Left <br>
         0x7:Front Right and 2Row Right <p>
     */
        public static final int FLZCU_NAPAREA2FB_3FE = 557847039;

    /**
     * FLZCU_LOGOCHARGINGSTS_3FE <p>
     * <br>
     * Function Describe: 前LOGO充电灯效开关状态反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:Reserved <p>
     */
        public static final int FLZCU_LOGOCHARGINGSTS_3FE = 557847043;

    /**
     * FLZCU_RLWINTHERMALSTATUS_3FE <p>
     * <br>
     * Function Describe: 左后车窗热保护状态
 0：未触发热保护
 1：热保护触发中 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Normal <br>
         0x1:Thermal protection <p>
     */
        public static final int FLZCU_RLWINTHERMALSTATUS_3FE = 557847045;

    /**
     * FLZCU_FLWINTHERMALSTATUS_3FE <p>
     * <br>
     * Function Describe: 左前车窗热保护状态
 0：未触发热保护
 1：热保护触发中 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Normal <br>
         0x1:Thermal protection <p>
     */
        public static final int FLZCU_FLWINTHERMALSTATUS_3FE = 557847046;

    /**
     * FLZCU_FLSITPOSNSTS_3FE <p>
     * <br>
     * Function Describe: 主驾座椅记忆位置反馈（含后视镜、管柱）
 车机座椅记忆页面有三个位置显示，需新增该信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:Location1 <br>
         0x2:Location2 <br>
         0x3:Location3 <br>
         0x4:FaceID <p>
     */
        public static final int FLZCU_FLSITPOSNSTS_3FE = 557847050;

    /**
     * FLZCU_STEEROVERHEATWARN_3FE <p>
     * <br>
     * Function Describe: 管柱热保护提醒 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:Active <p>
     */
        public static final int FLZCU_STEEROVERHEATWARN_3FE = 557847057;

    /**
     * CSUNSHADEPERCENTSTS_400 <p>
     * <br>
     * Function Describe: 天幕遮阳帘开度百分比状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:0% <br>
         0x2:10% <br>
         0x3:20% <br>
         0x4:30% <br>
         0x5:40% <br>
         0x6:50% <br>
         0x7:60% <br>
         0x8:70% <br>
         0x9:80% <br>
         0xA:90% <br>
         0xB:100% <p>
     */
        public static final int CSUNSHADEPERCENTSTS_400 = 557847059;

    /**
     * CSUNSHADESTS_400 <p>
     * <br>
     * Function Describe: 天幕遮阳帘实际状态
 (大屏动效-可显示开启和关闭的动画) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:Open <br>
         0x2:Close <br>
         0x3:Half_Open <br>
         0x4:Opening <br>
         0x5:Closing <br>
         0x6:Stop <br>
         0x7:Error <p>
     */
        public static final int CSUNSHADESTS_400 = 557847060;

    /**
     * FRZCU_ONEKEYHVOFFSWTST_400 <p>
     * <br>
     * Function Describe: 紧急下电开关状态反馈（法规要求，执行下高压，低压不变） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Pressed <br>
         0x1:Pressed <br>
         0x2:Stuck <br>
         0x3:Not Used <p>
     */
        public static final int FRZCU_ONEKEYHVOFFSWTST_400 = 557847065;

    /**
     * FRZCU_CSUNSHADETHERMALSTS_400 <p>
     * <br>
     * Function Describe: 天幕遮阳帘热保护状态
 0：未触发热保护
 1：热保护触发中 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Normal <br>
         0x1:Thermal protection <p>
     */
        public static final int FRZCU_CSUNSHADETHERMALSTS_400 = 557847066;

    /**
     * FRZCU_RRWINTHERMALSTS_400 <p>
     * <br>
     * Function Describe: 右后车窗热保护状态
 0：未触发热保护
 1：热保护触发中 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Normal <br>
         0x1:Thermal protection <p>
     */
        public static final int FRZCU_RRWINTHERMALSTS_400 = 557847067;

    /**
     * FRZCU_FRWINTHERMALSTS_400 <p>
     * <br>
     * Function Describe: 右前车窗热保护状态
 0：未触发热保护
 1：热保护触发中 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Normal <br>
         0x1:Thermal protection <p>
     */
        public static final int FRZCU_FRWINTHERMALSTS_400 = 557847068;

    /**
     * FRZCU_QUEENSEATENTERSTS_400 <p>
     * <br>
     * Function Describe: 女王副驾进入状态反馈
 0x1:调节中
 0x2:调节成功（女王模式进入成功）
 0x3:调节失败（女王模式进入失败 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:Running <br>
         0x2:Running Success <br>
         0x3:Running Fail <p>
     */
        public static final int FRZCU_QUEENSEATENTERSTS_400 = 557847071;

    /**
     * FRZCU_PASGERSEATMOVFAILCAUSE_400 <p>
     * <br>
     * Function Describe: 副驾调节失败原因
 0x1：座椅未学习
 0x2：触发防夹
 0x3：硬开关未释放
 0x4：副驾处于折叠状态
 0x5：电机线路故障（开路、短路、霍尔丢失）
 0x6：优先级不满足 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not active <br>
         0x1:Not Learned <br>
         0x2:Antipinch event <br>
         0x3:Hard Switch Not Released <br>
         0x4:Fold_Sts <br>
         0x5:Motor Circuit Failure <br>
         0x6:Low Priority <p>
     */
        public static final int FRZCU_PASGERSEATMOVFAILCAUSE_400 = 557847072;

    /**
     * FRZCU_QUEENSEATSTS_400 <p>
     * <br>
     * Function Describe: 女王副驾状态反馈
 0x0:无请求
 0x1:已退出
 0x2:已进入 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:Exited <br>
         0x2:Entered <p>
     */
        public static final int FRZCU_QUEENSEATSTS_400 = 557847074;

    /**
     * FRZCU_QUEENSEATMOVFAILCAUSE_400 <p>
     * <br>
     * Function Describe: 女王副驾调节失败原因
 0x1：座椅未学习
 0x2：触发防夹
 0x3：硬开关未释放
 0x4：副驾处于折叠状态
 0x5：电机线路故障（开路、短路、霍尔丢失）
 0x6：优先级不满足
 0x7：二排已展开
 0x8:二排右侧座椅被占用
 0x9：二排被打断 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not active <br>
         0x1:Not Learned <br>
         0x2:Antipinch event <br>
         0x3:Hard Switch Not Released <br>
         0x4:Fold_Sts <br>
         0x5:Motor Circuit Failure <br>
         0x6:Low Priority <br>
         0x7:RRSeatExpSts <br>
         0x8:RRSeat Occupied <br>
         0x9:RRSeatStop <p>
     */
        public static final int FRZCU_QUEENSEATMOVFAILCAUSE_400 = 557847075;

    /**
     * CSUNSHADEPOSN_400 <p>
     * <br>
     * Function Describe: 遮阳帘开度 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int CSUNSHADEPOSN_400 = 557847077;

    /**
     * PEPS_SMARTSYSTEMWARNING1_1_404 <p>
     * <br>
     * Function Describe: 非OFF档关门钥匙不在车内报警 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Normal <br>
         0x1:Identifier_is_out_of_vehicle <br>
         0x2~0x3:Reseved <p>
     */
        public static final int PEPS_SMARTSYSTEMWARNING1_1_404 = 557847087;

    /**
     * PEPS_SMARTSYSTEMWARNING2_2_404 <p>
     * <br>
     * Function Describe: 车速无钥匙报警 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Normal <br>
         0x1:Identifier_is_out_of_vehicle_range_when_vehicle_starts_running <br>
         0x2~0x3:Reseved <p>
     */
        public static final int PEPS_SMARTSYSTEMWARNING2_2_404 = 557847088;

    /**
     * PEPS_SMARTSYSTEMWARNING3_1_404 <p>
     * <br>
     * Function Describe: 钥匙电池电量低报警 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Normal <br>
         0x1:Identifier_low_battery_detected <br>
         0x2~0x3:Reseved <p>
     */
        public static final int PEPS_SMARTSYSTEMWARNING3_1_404 = 557847089;

    /**
     * PEPS_SMARTSYSTEMWARNING3_2_404 <p>
     * <br>
     * Function Describe: 用于SSB启动时，非P档时启动报警 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Normal <br>
         0x1:Engine_start_not_possible_if_gear_box_not_in_P_or_N_position <br>
         0x2~0x3:Reseved <p>
     */
        public static final int PEPS_SMARTSYSTEMWARNING3_2_404 = 557847090;

    /**
     * PEPS_SMARTSYSTEMWARNING4_2_404 <p>
     * <br>
     * Function Describe: 用于SSB启动时，未踩刹车提醒报警 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Normal <br>
         0x1:Engine_start_attempted_without_pressing_clutch/brake_pedal <br>
         0x2~0x3:Reseved <p>
     */
        public static final int PEPS_SMARTSYSTEMWARNING4_2_404 = 557847091;

    /**
     * PEPS_SMARTSYSTEMWARNING4_3_404 <p>
     * <br>
     * Function Describe: 下电不在P档报警 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Normal <br>
         0x1:Switching_OFF_while_Gear_box_not_in_P_position <br>
         0x2~0x3:Reseved <p>
     */
        public static final int PEPS_SMARTSYSTEMWARNING4_3_404 = 557847092;

    /**
     * PEPS_SYSTEMWARNING_404 <p>
     * <br>
     * Function Describe: PEPS系统故障提醒 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Normal <br>
         0x1:Fault <br>
         0x2~0x3:Reseved <p>
     */
        public static final int PEPS_SYSTEMWARNING_404 = 557847093;

    /**
     * REARVIEWFOLDSTS_406 <p>
     * <br>
     * Function Describe: 后视镜折叠状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:invalid <br>
         0x1:Fold <br>
         0x2:unFold <p>
     */
        public static final int REARVIEWFOLDSTS_406 = 557847095;

    /**
     * FLZCU_ALRMSTS_406 <p>
     * <br>
     * Function Describe: 解防设防动作信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not active <br>
         0x1:Arming Mode <br>
         0x2:Pre_rearming Mode <br>
         0x3:Trunk Opening Mode <br>
         0x4:Alarm Mode <br>
         0x5:Disarm Mode <br>
         0x6:Arming Fault Mode <br>
         0x7:reserved <p>
     */
        public static final int FLZCU_ALRMSTS_406 = 557847096;

    /**
     * FLZCU_STEERINGMODE_406 <p>
     * <br>
     * Function Describe: 个性化-转向模式反馈
 拆帧转发至GL ,IC CAN 0x406(bit 81) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:Normal <br>
         0x2:Sport <p>
     */
        public static final int FLZCU_STEERINGMODE_406 = 557847097;

    /**
     * FLZCU_OBDDIAGOCCUPY_406 <p>
     * <br>
     * Function Describe: OBD诊断占用指示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Occupy <br>
         0x1:Occupy <p>
     */
        public static final int FLZCU_OBDDIAGOCCUPY_406 = 557847100;

    /**
     * HCU_POWERMODEFED_40A <p>
     * <br>
     * Function Describe: Power mode Feedback <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:EV <br>
         0x2:HEV <br>
         0x3:EV+ <p>
     */
        public static final int HCU_POWERMODEFED_40A = 557847102;

    /**
     * HCU_POWERTRAINFAULT_40A <p>
     * <br>
     * Function Describe: Powertrain fault <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:No Fault <br>
         0x1:Fault <p>
     */
        public static final int HCU_POWERTRAINFAULT_40A = 557847103;

    /**
     * VCC_1_OTASTS_40B <p>
     * <br>
     * Function Describe: OTA status <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Normal Status <br>
         0x1:OTA Status <p>
     */
        public static final int VCC_1_OTASTS_40B = 557847106;

    /**
     * EBS_U_BATT_413 <p>
     * <br>
     * Function Describe: Current measured battery voltage, max value is 18V.Invalid Raw Value:16383. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int EBS_U_BATT_413 = 557847180;

    /**
     * HCU_2_G_LOWBATTERYINFO_414 <p>
     * <br>
     * Function Describe: No Request 无需显示
 Request 弹窗提示“动力电池电量过低，请立即插枪充电或切换到Ready充电”（股份信号D01不使用) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:NoRequest <br>
         0x2:Request <br>
         0x3:Sail Request <p>
     */
        public static final int HCU_2_G_LOWBATTERYINFO_414 = 557847183;

    /**
     * VCU_TOWINGMODE_421 <p>
     * <br>
     * Function Describe: 上报拖车模式提醒信息 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:NotActive <br>
         0x1:Active <br>
         0x2:Reserved <p>
     */
        public static final int VCU_TOWINGMODE_421 = 557847193;

    /**
     * VCU_ENGYCONSUPER50KM_421 <p>
     * <br>
     * Function Describe: 最近行驶50Km换算的平均百公里电耗 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0xFFF:Invalid <p>
     */
        public static final int VCU_ENGYCONSUPER50KM_421 = 557847194;

    /**
     * VCU_BOOKCHRGSETFAILRES_421 <p>
     * <br>
     * Function Describe: 预约失败原因反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Default <br>
         0x1:OBC Fault <br>
         0x2:HvBatt Fault <br>
         0x3:DCDC Fault <br>
         0x4:Vehicle Fault <br>
         0x5~0x7:Reserved <p>
     */
        public static final int VCU_BOOKCHRGSETFAILRES_421 = 557847195;

    /**
     * VCU_BOOKCHRGFAILRES_421 <p>
     * <br>
     * Function Describe: 无法进入预约充电原因反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Default <br>
         0x1:OBC Fault <br>
         0x2:HvBatt Fault <br>
         0x3:DCDC Fault <br>
         0x4:Vehicle Fault <br>
         0x5:ChargeStationFault <br>
         0x6:BNCMfault <br>
         0x7:EVSEandBNCMConnectFault <br>
         0x8:Reserved <p>
     */
        public static final int VCU_BOOKCHRGFAILRES_421 = 557847196;

    /**
     * VCU_BOOKCHRGSTSFB_421 <p>
     * <br>
     * Function Describe: 预约充电状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Default <br>
         0x1:Charging <br>
         0x2:ChargeFinished <br>
         0x3:Reserved <p>
     */
        public static final int VCU_BOOKCHRGSTSFB_421 = 557847197;

    /**
     * ICC_FLSEATHEATLEVELCMD_423 <p>
     * <br>
     * Function Describe: 一排主驾座椅加热信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:OFF <br>
         0x2:Seat_heating_Level1 <br>
         0x3:Seat_heating_Level2 <br>
         0x4:Seat_heating_Level3 <br>
         0x5~0x7:Reserved <p>
     */
        public static final int ICC_FLSEATHEATLEVELCMD_423 = 557847199;

    /**
     * ICC_FRSEATHEATLEVELCMD_423 <p>
     * <br>
     * Function Describe: 一排副驾座椅加热信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:OFF <br>
         0x2:Seat_heating_Level1 <br>
         0x3:Seat_heating_Level2 <br>
         0x4:Seat_heating_Level3 <br>
         0x5~0x7:Reserved <p>
     */
        public static final int ICC_FRSEATHEATLEVELCMD_423 = 557847200;

    /**
     * ICC_SET_PLGOPERATESTS_423 <p>
     * <br>
     * Function Describe: 电动尾门开度调节
 0x0:Not active <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_SET_PLGOPERATESTS_423 = 557847202;

    /**
     * ICC_FRSEATVENTLEVELCMD_423 <p>
     * <br>
     * Function Describe: 副驾座椅通风 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:OFF <br>
         0x2:Seat_Ventilation_Level1 <br>
         0x3:Seat_Ventilation_Level2 <br>
         0x4:Seat_Ventilation_Level3 <br>
         0x5~0x7:Reserved <p>
     */
        public static final int ICC_FRSEATVENTLEVELCMD_423 = 557847205;

    /**
     * ICC_FLSEATVENTLEVELCMD_423 <p>
     * <br>
     * Function Describe: 主驾座椅通风 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:OFF <br>
         0x2:Seat_Ventilation_Level1 <br>
         0x3:Seat_Ventilation_Level2 <br>
         0x4:Seat_Ventilation_Level3 <br>
         0x5~0x7:Reserved <p>
     */
        public static final int ICC_FLSEATVENTLEVELCMD_423 = 557847206;

    /**
     * ICC_FRONTWIPERMAINTENANCEMODE_423 <p>
     * <br>
     * Function Describe: 大屏设置前雨刮维修
 0x1:ON 进入维修
 0x2: OFF退出维修 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:ON <br>
         0x2:OFF <p>
     */
        public static final int ICC_FRONTWIPERMAINTENANCEMODE_423 = 557847207;

    /**
     * PLG_CONTROLREQ_423H_423 <p>
     * <br>
     * Function Describe: 电尾门开启请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Invalid_Default <br>
         0x1:Open_Close <br>
         0x2:Stop <p>
     */
        public static final int PLG_CONTROLREQ_423H_423 = 557847210;

    /**
     * ICC_REARWIPERMAINTENANCEMODE_423 <p>
     * <br>
     * Function Describe: 大屏设置后雨刮维修
 0x1:ON 进入维修
 0x2: OFF退出维修 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:ON <br>
         0x2:OFF <p>
     */
        public static final int ICC_REARWIPERMAINTENANCEMODE_423 = 557847211;

    /**
     * DRIVERSEATMSGSTR_LVLSTS_425 <p>
     * <br>
     * Function Describe: 0x0:关
 0x1:低
 0x2:中
 0x3:高
 CANID0x458 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:OFF/Intial <br>
         0x1:Low <br>
         0x2:Middle <br>
         0x3:High <br>
         0x4~0x7:Reserved <p>
     */
        public static final int DRIVERSEATMSGSTR_LVLSTS_425 = 557847212;

    /**
     * DRIVERSEATMSG_MODESTS_425 <p>
     * <br>
     * Function Describe: 0x0:无动作
 0x1:背部激活-脉冲模式
 0x2:背部放松-波浪模式
 0x3背部舒缓-:猫步模式
 0x4:脊柱松弛-单排模式
 0x5:腰部放松-交叉模式
 0x6:腰部激活-蝶形模式
 0x7:背部舒展-腰部按摩模式
 0x8:肩部放松-蛇形模式
 0x9:特殊模式1
 0xA:特殊模式2
 0xB:特殊模式3
 0xC:特殊模式4
 CANID0x458 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:NotActive <br>
         0x1:PulseMode <br>
         0x2:WaveMode <br>
         0x3:CatPawMode <br>
         0x4:SigleRowMode <br>
         0x5:CrossMode <br>
         0x6:ButterflyMode <br>
         0x7:WaistMode <br>
         0x8:SnakeMode <br>
         0x9:Special 1 <br>
         0xA:Special 2 <br>
         0xB:Special 3 <br>
         0xC:Special 4 <p>
     */
        public static final int DRIVERSEATMSG_MODESTS_425 = 557847213;

    /**
     * TBOX_PETMODESWITCH_427 <p>
     * <br>
     * Function Describe: 宠物模式远程开关信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:Reserved <p>
     */
        public static final int TBOX_PETMODESWITCH_427 = 557847214;

    /**
     * TBOX_SENTINELMODESW_427 <p>
     * <br>
     * Function Describe: 哨兵开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:ON <br>
         0x2:OFF <p>
     */
        public static final int TBOX_SENTINELMODESW_427 = 557847215;

    /**
     * LEFTSEATMSGSTR_LVLSTS_429 <p>
     * <br>
     * Function Describe: 0x0:关
 0x1:低
 0x2:中
 0x3:高 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:OFF/Intial <br>
         0x1:Low <br>
         0x2:Middle <br>
         0x3:High <br>
         0x4~0x7:Reserved <p>
     */
        public static final int LEFTSEATMSGSTR_LVLSTS_429 = 557847217;

    /**
     * LEFTSEATMSG_MODESTS_429 <p>
     * <br>
     * Function Describe: 0x0:无动作
 0x1:背部激活-脉冲模式
 0x2:背部放松-波浪模式
 0x3背部舒缓-:猫步模式
 0x4:脊柱松弛-单排模式
 0x5:腰部放松-交叉模式
 0x6:腰部激活-蝶形模式
 0x7:背部舒展-腰部按摩模式
 0x8:肩部放松-蛇形模式
 0x9:特殊模式1
 0xA:特殊模式2
 0xB:特殊模式3
 0xC:特殊模式4 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:NotActive <br>
         0x1:PulseMode <br>
         0x2:WaveMode <br>
         0x3:CatPawMode <br>
         0x4:SigleRowMode <br>
         0x5:CrossMode <br>
         0x6:ButterflyMode <br>
         0x7:WaistMode <br>
         0x8:SnakeMode <br>
         0x9:Special 1 <br>
         0xA:Special 2 <br>
         0xB:Special 3 <br>
         0xC:Special 4 <p>
     */
        public static final int LEFTSEATMSG_MODESTS_429 = 557847218;

    /**
     * PASSSEATMSGSTR_LVLSTS_42D <p>
     * <br>
     * Function Describe: 0x0:关
 0x1:低
 0x2:中
 0x3:高 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:OFF/Intial <br>
         0x1:Low <br>
         0x2:Middle <br>
         0x3:High <br>
         0x4~0x7:Reserved <p>
     */
        public static final int PASSSEATMSGSTR_LVLSTS_42D = 557847219;

    /**
     * PASSSEATMSG_MODESTS_42D <p>
     * <br>
     * Function Describe: 0x0:无动作
 0x1:背部激活-脉冲模式
 0x2:背部放松-波浪模式
 0x3背部舒缓-:猫步模式
 0x4:脊柱松弛-单排模式
 0x5:腰部放松-交叉模式
 0x6:腰部激活-蝶形模式
 0x7:背部舒展-腰部按摩模式
 0x8:肩部放松-蛇形模式
 0x9:特殊模式1
 0xA:特殊模式2
 0xB:特殊模式3
 0xC:特殊模式4
 CANID0x458 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:NotActive <br>
         0x1:PulseMode <br>
         0x2:WaveMode <br>
         0x3:CatPawMode <br>
         0x4:SigleRowMode <br>
         0x5:CrossMode <br>
         0x6:ButterflyMode <br>
         0x7:WaistMode <br>
         0x8:SnakeMode <br>
         0x9:Special 1 <br>
         0xA:Special 2 <br>
         0xB:Special 3 <br>
         0xC:Special 4 <p>
     */
        public static final int PASSSEATMSG_MODESTS_42D = 557847220;

    /**
     * WORKINGSTS_42EH_42E <p>
     * <br>
     * Function Describe: 无线充电器工作状态(DVD接收显示)
 0x0: 无线充电器关闭
 0x1: 无线充电器打开 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:CWCR OFF <br>
         0x1:CWCR ON <p>
     */
        public static final int WORKINGSTS_42EH_42E = 557847225;

    /**
     * PHONEFORGOTTENONOFFSTS_42EH_42E <p>
     * <br>
     * Function Describe: 手机遗忘提醒功能是否打开
 0x0:功能关闭
 0x1:功能打开 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Function OFF <br>
         0x1:Function ON <p>
     */
        public static final int PHONEFORGOTTENONOFFSTS_42EH_42E = 557847227;

    /**
     * FLZCU_CARSEARHSETSW_42F <p>
     * <br>
     * Function Describe: 寻车提示设置状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:Only Lighting <br>
         0x2:Sound and Lighting <br>
         0x3:Reserved <p>
     */
        public static final int FLZCU_CARSEARHSETSW_42F = 557847234;

    /**
     * FLZCU_AUTOFOLDSTS_42F <p>
     * <br>
     * Function Describe: 后视镜自动折叠状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not autofold mode <br>
         0x1:Autofold mode <p>
     */
        public static final int FLZCU_AUTOFOLDSTS_42F = 557847235;

    /**
     * FLZCU_AUTOLOCKSTS_42F <p>
     * <br>
     * Function Describe: 设置自动落锁模式 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not autolock mode <br>
         0x1:Autolock mode <p>
     */
        public static final int FLZCU_AUTOLOCKSTS_42F = 557847236;

    /**
     * FLZCU_AUTOREADLIGHTSTS_42F <p>
     * <br>
     * Function Describe: 自动顶灯开关状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Close <br>
         0x1:Open <p>
     */
        public static final int FLZCU_AUTOREADLIGHTSTS_42F = 557847239;

    /**
     * FLZCU_STEERNEEDMEMORY_42F <p>
     * <br>
     * Function Describe: 方向盘停止调节，是否需要记忆 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:NO Request <br>
         0x1:Request <p>
     */
        public static final int FLZCU_STEERNEEDMEMORY_42F = 557847242;

    /**
     * FLZCU_LOWBEAMFAULTS_42F <p>
     * <br>
     * Function Describe: 近光灯故障 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Faults <br>
         0x1:Faults <p>
     */
        public static final int FLZCU_LOWBEAMFAULTS_42F = 557847243;

    /**
     * FLZCU_REARNEEDMEMORY_42F <p>
     * <br>
     * Function Describe: 后视镜停止调节，是否需要记忆 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:NO Request <br>
         0x1:Request <p>
     */
        public static final int FLZCU_REARNEEDMEMORY_42F = 557847244;

    /**
     * FLZCU_BRKLIGHTFAULTS_42F <p>
     * <br>
     * Function Describe: 制动灯故障 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Faults <br>
         0x1:Faults <p>
     */
        public static final int FLZCU_BRKLIGHTFAULTS_42F = 557847245;

    /**
     * FLZCU_RVSEXTMIRRFBSTS_42F <p>
     * <br>
     * Function Describe: 后视镜倒车自动下翻开启关闭 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:OFF <br>
         0x1:Only Right Side <br>
         0x2:Only Left Side <br>
         0x3:Both Sides <p>
     */
        public static final int FLZCU_RVSEXTMIRRFBSTS_42F = 557847251;

    /**
     * FLZCU_LIGHTMAINSWITCHSTS_42F <p>
     * <br>
     * Function Describe: 小灯、近光、Auto开关位置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not active <br>
         0x1:Off Position <br>
         0x2:Auto Position <br>
         0x3:PositionLampSwitch Position <br>
         0x4:LowBeamSwitch Position <br>
         0x5~0x7:Reserved <p>
     */
        public static final int FLZCU_LIGHTMAINSWITCHSTS_42F = 557847252;

    /**
     * FLZCU_BEAMDELAYSTS_42F <p>
     * <br>
     * Function Describe: 前照灯延迟时间 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:0s <br>
         0x2:10s <br>
         0x3:20s <br>
         0x4:30s <br>
         0x5:60s <br>
         0x6~0x7:Reserved <p>
     */
        public static final int FLZCU_BEAMDELAYSTS_42F = 557847253;

    /**
     * FLZCU_LOWBEAMHIGHSTS_42F <p>
     * <br>
     * Function Describe: 反馈当前大灯高度调节等级 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Level 0 <br>
         0x1:Level 1 <br>
         0x2:Level 2 <br>
         0x3:Level 3 <br>
         0x4~0x7:Reserved <p>
     */
        public static final int FLZCU_LOWBEAMHIGHSTS_42F = 557847254;

    /**
     * FLZCU_WIPESENSITIVITYSTS_42F <p>
     * <br>
     * Function Describe: 雨刮灵敏度当前状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:Level 1 <br>
         0x2:Level 2 <br>
         0x3:Level 3 <br>
         0x4:Level 4 <br>
         0x5~0x7:Reserved <p>
     */
        public static final int FLZCU_WIPESENSITIVITYSTS_42F = 557847255;

    /**
     * FLZCU_ALARMWARNSETSW_42F <p>
     * <br>
     * Function Describe: 设防提示设置项 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:OFF <br>
         0x2:Only Lighting <br>
         0x3:Sound and Lighting <p>
     */
        public static final int FLZCU_ALARMWARNSETSW_42F = 557847259;

    /**
     * FLZCU_CLEANMODESTATUS_42F <p>
     * <br>
     * Function Describe: 洗车模式状态反馈给大屏 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not active <br>
         0x1:OFF <br>
         0x2:ON <br>
         0x3:Reserved <p>
     */
        public static final int FLZCU_CLEANMODESTATUS_42F = 557847260;

    /**
     * FLZCU_REARFOGLIGHTSTS_42F <p>
     * <br>
     * Function Describe: 后雾灯状态反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:OFF <br>
         0x1:ON <p>
     */
        public static final int FLZCU_REARFOGLIGHTSTS_42F = 557847262;

    /**
     * FLZCU_REARFOGLIGHTFAULTS_42F <p>
     * <br>
     * Function Describe: 后雾灯故障 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Faults <br>
         0x1:Faults <p>
     */
        public static final int FLZCU_REARFOGLIGHTFAULTS_42F = 557847265;

    /**
     * FLZCU_HIGHBEAMFAULTS_42F <p>
     * <br>
     * Function Describe: 远光灯故障 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Faults <br>
         0x1:Faults <p>
     */
        public static final int FLZCU_HIGHBEAMFAULTS_42F = 557847266;

    /**
     * FLZCU_HIGHBEAMSTS_42F <p>
     * <br>
     * Function Describe: 远光灯状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Close <br>
         0x1:Open <p>
     */
        public static final int FLZCU_HIGHBEAMSTS_42F = 557847267;

    /**
     * FLZCU_LOWBEAMSTS_42F <p>
     * <br>
     * Function Describe: 近光灯状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Close <br>
         0x1:Open <p>
     */
        public static final int FLZCU_LOWBEAMSTS_42F = 557847268;

    /**
     * FLZCU_PARKUNLOCKENABLEFB_42F <p>
     * <br>
     * Function Describe: 驻车解锁设置反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Disable <br>
         0x1:Enable <p>
     */
        public static final int FLZCU_PARKUNLOCKENABLEFB_42F = 557847269;

    /**
     * FLZCU_EASYENTRYEXITFB_42F <p>
     * <br>
     * Function Describe: 便捷进入\离车 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:Not Used <p>
     */
        public static final int FLZCU_EASYENTRYEXITFB_42F = 557847271;

    /**
     * FLZCU_DAYTIMELIGHT_42F <p>
     * <br>
     * Function Describe: 日行灯状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:None <br>
         0x1:Left <br>
         0x2:Right <br>
         0x3:Both <p>
     */
        public static final int FLZCU_DAYTIMELIGHT_42F = 557847274;

    /**
     * FLZCU_PARKLIGHTFAULTS_42F <p>
     * <br>
     * Function Describe: 位置灯故障 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Faults <br>
         0x1:Faults <p>
     */
        public static final int FLZCU_PARKLIGHTFAULTS_42F = 557847276;

    /**
     * FLZCU_LOCKCARWINCLOSEFB_42F <p>
     * <br>
     * Function Describe: 锁车关窗 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Enable <br>
         0x1:Disable <p>
     */
        public static final int FLZCU_LOCKCARWINCLOSEFB_42F = 557847280;

    /**
     * FLZCU_BRKLIGHTSTS_42F <p>
     * <br>
     * Function Describe: 制动灯状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Close <br>
         0x1:Open <p>
     */
        public static final int FLZCU_BRKLIGHTSTS_42F = 557847281;

    /**
     * FLZCU_STEERWHEELHEATINGFB_42F <p>
     * <br>
     * Function Describe: 方向盘加热反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:Level1 <br>
         0x2:Level2 <br>
         0x3:Level3 <br>
         0x4:OFF <p>
     */
        public static final int FLZCU_STEERWHEELHEATINGFB_42F = 557847284;

    /**
     * FLZCU_FRONTFOGLIGHTSTS_42F <p>
     * <br>
     * Function Describe: 前雾灯状态反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:OFF <br>
         0x1:ON <p>
     */
        public static final int FLZCU_FRONTFOGLIGHTSTS_42F = 557847285;

    /**
     * FLZCU_NAPAREAFB_42F <p>
     * <br>
     * Function Describe: 小憩模式开启区域设置反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:Front Left <br>
         0x2:Front Right <br>
         0x3:Front Left and Right <p>
     */
        public static final int FLZCU_NAPAREAFB_42F = 557847286;

    /**
     * FLZCU_NAPFAILCAUSE_42F <p>
     * <br>
     * Function Describe: 小憩模式开启失败原因反馈
 0x0:Not_Active
 0x1:档位非P档
 0x2:车速≠0km/h
 0x3:前舱盖未关
 0x4:后背门未关
 0x5:左前门未关
 0x6:右前门未关
 0x7:左后门未关
 0x8:右后门未关
 0x9:低压电池电压低，不满足开启条件
 0xA:高压电池电量低，不满足开启条件
 0xB:制动踏板被踩下，不满足开启条件
 0xC:电源档位非Comfortable档，不满足开启条件-捷途特有 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Gear_Not_P <br>
         0x2:Vehicle_Speed≠0km/h <br>
         0x3:Hood_Unlock <br>
         0x4:Trunk_Unlock <br>
         0x5:FLDoor_Unlock <br>
         0x6:FRDoor_Unlock <br>
         0x7:RLDoor_Unlock <br>
         0x8:RRDoor_Unlock <br>
         0x9:Low_Voltage_Battery_Voltage_Low <br>
         0xA:High_Voltage_Battery_Low <br>
         0xB:Brake_Pedal_Depressed <br>
         0xC:PowerMode Not Comfortable <p>
     */
        public static final int FLZCU_NAPFAILCAUSE_42F = 557847289;

    /**
     * FLZCU_NAPSTATUSFB_42F <p>
     * <br>
     * Function Describe: 小憩模式开关设置反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:OFF <br>
         0x1:ON <p>
     */
        public static final int FLZCU_NAPSTATUSFB_42F = 557847290;

    /**
     * LOCKCARSUNROOFSHADECLOSEFB_42F <p>
     * <br>
     * Function Describe: 遮阳帘锁车关窗设置反馈（大屏开关没打开，钥匙闭锁，遮阳帘不关闭） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:Enable <br>
         0x2:Disable <br>
         0x3:reserved <p>
     */
        public static final int LOCKCARSUNROOFSHADECLOSEFB_42F = 557847292;

    /**
     * FLZCU_NAPCLOSEPROMPT_42F <p>
     * <br>
     * Function Describe: 小憩模式关闭提示信号
 0x0:Not Active
 0x1:低压电池电量低，退出小憩模式
 0x2:高压电池电量低，退出小憩模式 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:Low Voltage Battery Low <br>
         0x2:High Voltage Battery Low <p>
     */
        public static final int FLZCU_NAPCLOSEPROMPT_42F = 557847293;

    /**
     * FLZCU_REMOTEUNLOCKFB_42F <p>
     * <br>
     * Function Describe: 遥控解锁设置状态（默认为四门解锁）按键一次,仅解锁主驾车门、按键两次解锁四门 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:Drivedoor_Unlock <br>
         0x2:Fourdoor_Unlock <br>
         0x3:reserved <p>
     */
        public static final int FLZCU_REMOTEUNLOCKFB_42F = 557847295;

    /**
     * FLZCU_RLWINSTS_42F <p>
     * <br>
     * Function Describe: 左后车窗运行状态反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:Comfort <br>
         0x2:Close <br>
         0x3:Open <br>
         0x4:Other Position <br>
         0x5:Closing <br>
         0x6:Opening <br>
         0x7:Reserved <p>
     */
        public static final int FLZCU_RLWINSTS_42F = 557847297;

    /**
     * FLZCU_FLWINSTS_42F <p>
     * <br>
     * Function Describe: 左前车窗运行状态反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:Comfort <br>
         0x2:Close <br>
         0x3:Open <br>
         0x4:Other Position <br>
         0x5:Closing <br>
         0x6:Opening <br>
         0x7:Reserved <p>
     */
        public static final int FLZCU_FLWINSTS_42F = 557847298;

    /**
     * FLZCU_DAYTIMELIGHTFAULTS_42F <p>
     * <br>
     * Function Describe: 日行灯故障 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Faults <br>
         0x1:Faults <p>
     */
        public static final int FLZCU_DAYTIMELIGHTFAULTS_42F = 557847299;

    /**
     * FLZCU_FRONTFOGLIGHTFAULTS_42F <p>
     * <br>
     * Function Describe: 前雾灯故障 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Faults <br>
         0x1:Faults <p>
     */
        public static final int FLZCU_FRONTFOGLIGHTFAULTS_42F = 557847300;

    /**
     * FLZCU_UIROPENSTAS_42F <p>
     * <br>
     * Function Describe: 走近开关状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:OFF <br>
         0x1:ON <p>
     */
        public static final int FLZCU_UIROPENSTAS_42F = 557847303;

    /**
     * FLZCU_WALOPENSTAS_42F <p>
     * <br>
     * Function Describe: 远离闭锁状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:OFF <br>
         0x1:ON <p>
     */
        public static final int FLZCU_WALOPENSTAS_42F = 557847304;

    /**
     * FLZCU_WELCOMEOPENSTAS_42F <p>
     * <br>
     * Function Describe: 迎宾灯状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:OFF <br>
         0x1:ON <p>
     */
        public static final int FLZCU_WELCOMEOPENSTAS_42F = 557847305;

    /**
     * LHFSEATBELTSW_430H_430 <p>
     * <br>
     * Function Describe: 安全带检测开关，0为未插入，1为插入 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:Active <p>
     */
        public static final int LHFSEATBELTSW_430H_430 = 557847308;

    /**
     * SEATHEATLEVELSFL_430H_430 <p>
     * <br>
     * Function Describe: 捷途需要改9档 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:OFF <br>
         0x1:Level1 <br>
         0x2:Level2 <br>
         0x3:Level3 <p>
     */
        public static final int SEATHEATLEVELSFL_430H_430 = 557847311;

    /**
     * SEATVENTLEVELSFL_430H_430 <p>
     * <br>
     * Function Describe: 捷途需要改9档 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:OFF <br>
         0x1:Level1 <br>
         0x2:Level2 <br>
         0x3:Level3 <p>
     */
        public static final int SEATVENTLEVELSFL_430H_430 = 557847313;

    /**
     * FLZCU_REARWIPERMAINTENANCESTS_430 <p>
     * <br>
     * Function Describe: 后雨刮维修模式开关状态反馈（当前可发） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:ON <br>
         0x2:OFF <p>
     */
        public static final int FLZCU_REARWIPERMAINTENANCESTS_430 = 557847316;

    /**
     * FLZCU_FRONTWIPERMAINTENANCESTS_430 <p>
     * <br>
     * Function Describe: 前雨刮维修模式开关状态反馈（当前可发） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:ON <br>
         0x2:OFF <p>
     */
        public static final int FLZCU_FRONTWIPERMAINTENANCESTS_430 = 557847317;

    /**
     * REARDOORSTA_431H_431 <p>
     * <br>
     * Function Describe: 尾门状态:
 0x0:尾门关闭
 0x1:尾门打开 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Close <br>
         0x1:Open <p>
     */
        public static final int REARDOORSTA_431H_431 = 557847318;

    /**
     * REARDOORMOVEDIRECTION_431H_431 <p>
     * <br>
     * Function Describe: 尾门移动方向:
 0x0:关门中
 0x1:开门中
 0x2:暂停 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Down_Moving <br>
         0x1:UP_Moving <br>
         0x2:Stop <br>
         0x3:Reserved <p>
     */
        public static final int REARDOORMOVEDIRECTION_431H_431 = 557847319;

    /**
     * REARDOOROPENDEGREE_431H_431 <p>
     * <br>
     * Function Describe: 尾门实时开门比例反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int REARDOOROPENDEGREE_431H_431 = 557847320;

    /**
     * PLG_LATCHSTS_436 <p>
     * <br>
     * Function Describe: 尾门门锁状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Open <br>
         0x1:Secondary <br>
         0x2:Latched <br>
         0x3:Initializing <p>
     */
        public static final int PLG_LATCHSTS_436 = 557847322;

    /**
     * RIGHTSEATMSGSTR_LVLSTS_43F <p>
     * <br>
     * Function Describe: 0x0:关
 0x1:低
 0x2:中
 0x3:高 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:OFF/Intial <br>
         0x1:Low <br>
         0x2:Middle <br>
         0x3:High <br>
         0x4~0x7:Reserved <p>
     */
        public static final int RIGHTSEATMSGSTR_LVLSTS_43F = 557847325;

    /**
     * RIGHTSEATMSG_MODESTS_43F <p>
     * <br>
     * Function Describe: 0x0:无动作
 0x1:背部激活-脉冲模式
 0x2:背部放松-波浪模式
 0x3背部舒缓-:猫步模式
 0x4:脊柱松弛-单排模式
 0x5:腰部放松-交叉模式
 0x6:腰部激活-蝶形模式
 0x7:背部舒展-腰部按摩模式
 0x8:肩部放松-蛇形模式
 0x9:特殊模式1
 0xA:特殊模式2
 0xB:特殊模式3
 0xC:特殊模式4 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:NotActive <br>
         0x1:PulseMode <br>
         0x2:WaveMode <br>
         0x3:CatPawMode <br>
         0x4:SigleRowMode <br>
         0x5:CrossMode <br>
         0x6:ButterflyMode <br>
         0x7:WaistMode <br>
         0x8:SnakeMode <br>
         0x9:Special 1 <br>
         0xA:Special 2 <br>
         0xB:Special 3 <br>
         0xC:Special 4 <p>
     */
        public static final int RIGHTSEATMSG_MODESTS_43F = 557847326;

    /**
     * RLCR_1_SYSST_447 <p>
     * <br>
     * Function Describe: System self-test State <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Off <br>
         0x1:On <br>
         0x2:Temporary Error <br>
         0x3:System Error <p>
     */
        public static final int RLCR_1_SYSST_447 = 557847330;

    /**
     * RLCR_1_BSDWARN_447 <p>
     * <br>
     * Function Describe: BSD/LCA Warning <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:No Warning <br>
         0x1:Standard Warning <br>
         0x2:Critical Warning <br>
         0x3:Not Used <p>
     */
        public static final int RLCR_1_BSDWARN_447 = 557847332;

    /**
     * TMS_FIRST_BLOWINGSTS_448 <p>
     * <br>
     * Function Describe: 空调启动时第一口风状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Off <br>
         0x1:Active <p>
     */
        public static final int TMS_FIRST_BLOWINGSTS_448 = 557847337;

    /**
     * TMS_BT_REDUCE_WIND_SPEEDSTS_448 <p>
     * <br>
     * Function Describe: 蓝牙通话降低风速状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Off <br>
         0x1:Active <p>
     */
        public static final int TMS_BT_REDUCE_WIND_SPEEDSTS_448 = 557847338;

    /**
     * TMS_COOLANTFILLSTS_448 <p>
     * <br>
     * Function Describe: 一键除气 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:No_Request <br>
         0x1:Request <p>
     */
        public static final int TMS_COOLANTFILLSTS_448 = 557847339;

    /**
     * TMS_PARKINGAIRCONDITIONINGSTATUS_448 <p>
     * <br>
     * Function Describe: 驻车空调状态工作状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Inactive <br>
         0x1:AUTO <br>
         0x2:ventilate <p>
     */
        public static final int TMS_PARKINGAIRCONDITIONINGSTATUS_448 = 557847340;

    /**
     * TMS_CROSSCOUNTRY_COOLINGSTS_448 <p>
     * <br>
     * Function Describe: 越野散热状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:No_Request <br>
         0x1:Active <br>
         0x2:Not_Active <p>
     */
        public static final int TMS_CROSSCOUNTRY_COOLINGSTS_448 = 557847341;

    /**
     * TMS_TIMEDVENTILATIONSTS_448 <p>
     * <br>
     * Function Describe: 大屏定时换气开关状态反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:Reserved <p>
     */
        public static final int TMS_TIMEDVENTILATIONSTS_448 = 557847349;

    /**
     * IMMO_CHALL_ICC_456 <p>
     * <br>
     * Function Describe:  <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int IMMO_CHALL_ICC_456 = 557847405;

    /**
     * PASSSEATMSGSTR_LVLCMD_458H_458 <p>
     * <br>
     * Function Describe: 0x0:未激活
 0x1:关
 0x2:低
 0x3:中
 0x4:高 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:NotActive/Initial <br>
         0x1:OFF <br>
         0x2:Low <br>
         0x3:Middle <br>
         0x4:High <p>
     */
        public static final int PASSSEATMSGSTR_LVLCMD_458H_458 = 557847406;

    /**
     * PASSSEATMSG_MODECMD_458H_458 <p>
     * <br>
     * Function Describe: 0x0:无动作
 0x1:脉冲模式
 0x2:波浪模式
 0x3:猫步模式
 0x4:单排模式
 0x5:交叉模式
 0x6:蝶形模式
 0x7:腰部按摩模式
 0x8:蛇形模式
 0x9:特殊模式1
 0xA:特殊模式2
 0xB:特殊模式3
 0xC:特殊模式4 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:NotActive <br>
         0x1:PulseMode <br>
         0x2:WaveMode <br>
         0x3:CatPawMode <br>
         0x4:SigleRowMode <br>
         0x5:CrossMode <br>
         0x6:ButterflyMode <br>
         0x7:WaistMode <br>
         0x8:SnakeMode <br>
         0x9:Special 1 <br>
         0xA:Special 2 <br>
         0xB:Special 3 <br>
         0xC:Special 4 <p>
     */
        public static final int PASSSEATMSG_MODECMD_458H_458 = 557847407;

    /**
     * DRIVERSEATMSGSTR_LVLCMD_458 <p>
     * <br>
     * Function Describe: 0x0:未激活
 0x1:关
 0x2:低
 0x3:中
 0x4:高 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:NotActive/Initial <br>
         0x1:OFF <br>
         0x2:Low <br>
         0x3:Middle <br>
         0x4:High <p>
     */
        public static final int DRIVERSEATMSGSTR_LVLCMD_458 = 557847408;

    /**
     * DRIVERSEATMSG_MODECMD_458 <p>
     * <br>
     * Function Describe: 0x0:无动作
 0x1:背部激活-脉冲模式
 0x2:背部放松-波浪模式
 0x3背部舒缓-:猫步模式
 0x4:脊柱松弛-单排模式
 0x5:腰部放松-交叉模式
 0x6:腰部激活-蝶形模式
 0x7:背部舒展-腰部按摩模式
 0x8:肩部放松-蛇形模式
 0x9:特殊模式1
 0xA:特殊模式2
 0xB:特殊模式3
 0xC:特殊模式4 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:NotActive <br>
         0x1:PulseMode <br>
         0x2:WaveMode <br>
         0x3:CatPawMode <br>
         0x4:SigleRowMode <br>
         0x5:CrossMode <br>
         0x6:ButterflyMode <br>
         0x7:WaistMode <br>
         0x8:SnakeMode <br>
         0x9:Special 1 <br>
         0xA:Special 2 <br>
         0xB:Special 3 <br>
         0xC:Special 4 <p>
     */
        public static final int DRIVERSEATMSG_MODECMD_458 = 557847409;

    /**
     * RIGHTSEATMSGSTR_LVLCMD_458 <p>
     * <br>
     * Function Describe: 0x0:未激活
 0x1:关
 0x2:低
 0x3:中
 0x4:高 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:NotActive/Initial <br>
         0x1:OFF <br>
         0x2:Low <br>
         0x3:Middle <br>
         0x4:High <p>
     */
        public static final int RIGHTSEATMSGSTR_LVLCMD_458 = 557847412;

    /**
     * RIGHTSEATMSG_MODECMD_458 <p>
     * <br>
     * Function Describe: 0x0:无动作
 0x1:脉冲模式
 0x2:波浪模式
 0x3:猫步模式
 0x4:单排模式
 0x5:交叉模式
 0x6:蝶形模式
 0x7:腰部按摩模式
 0x8:蛇形模式
 0x9:特殊模式1
 0xA:特殊模式2
 0xB:特殊模式3
 0xC:特殊模式4 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:NotActive <br>
         0x1:PulseMode <br>
         0x2:WaveMode <br>
         0x3:CatPawMode <br>
         0x4:SigleRowMode <br>
         0x5:CrossMode <br>
         0x6:ButterflyMode <br>
         0x7:WaistMode <br>
         0x8:SnakeMode <br>
         0x9:Special 1 <br>
         0xA:Special 2 <br>
         0xB:Special 3 <br>
         0xC:Special 4 <p>
     */
        public static final int RIGHTSEATMSG_MODECMD_458 = 557847413;

    /**
     * LEFTSEATMSGSTR_LVLCMD_458 <p>
     * <br>
     * Function Describe: 0x0:未激活
 0x1:关
 0x2:低
 0x3:中
 0x4:高 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:NotActive/Initial <br>
         0x1:OFF <br>
         0x2:Low <br>
         0x3:Middle <br>
         0x4:High <p>
     */
        public static final int LEFTSEATMSGSTR_LVLCMD_458 = 557847414;

    /**
     * LEFTSEATMSG_MODECMD_458 <p>
     * <br>
     * Function Describe: 0x0:无动作
 0x1:脉冲模式
 0x2:波浪模式
 0x3:猫步模式
 0x4:单排模式
 0x5:交叉模式
 0x6:蝶形模式
 0x7:腰部按摩模式
 0x8:蛇形模式
 0x9:特殊模式1
 0xA:特殊模式2
 0xB:特殊模式3
 0xC:特殊模式4 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:NotActive <br>
         0x1:PulseMode <br>
         0x2:WaveMode <br>
         0x3:CatPawMode <br>
         0x4:SigleRowMode <br>
         0x5:CrossMode <br>
         0x6:ButterflyMode <br>
         0x7:WaistMode <br>
         0x8:SnakeMode <br>
         0x9:Special 1 <br>
         0xA:Special 2 <br>
         0xB:Special 3 <br>
         0xC:Special 4 <p>
     */
        public static final int LEFTSEATMSG_MODECMD_458 = 557847415;

    /**
     * ICC_AUTH_IMMO_45C <p>
     * <br>
     * Function Describe: OTA上电鉴权响应 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_AUTH_IMMO_45C = 557847416;

    /**
     * ICC_BOOKCHRGSETREQ_471 <p>
     * <br>
     * Function Describe: 预约充电开启/取消设置请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:default <br>
         0x1:BookSet <br>
         0x2:CancellBook <br>
         0x3:Reserved <p>
     */
        public static final int ICC_BOOKCHRGSETREQ_471 = 557847461;

    /**
     * ICC_BKCHRGSTARTTIMEHOUR_471 <p>
     * <br>
     * Function Describe: 预约充电开始时间设置-时 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_BKCHRGSTARTTIMEHOUR_471 = 557847464;

    /**
     * ICC_BKCHRGSTARTTIMEMMIN_471 <p>
     * <br>
     * Function Describe: 预约充电开始时间设置-分 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_BKCHRGSTARTTIMEMMIN_471 = 557847465;

    /**
     * ICC_BKCHRGDURATION_471 <p>
     * <br>
     * Function Describe: 本地预约充电时长设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_BKCHRGDURATION_471 = 557847467;

    /**
     * ICC_STOPCHRGREQ_471 <p>
     * <br>
     * Function Describe: 结束充电请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:Active <p>
     */
        public static final int ICC_STOPCHRGREQ_471 = 557847469;

    /**
     * ICC_KEEPWARMSTRTHOUR_471 <p>
     * <br>
     * Function Describe: 插枪保温开始时间设置-时 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_KEEPWARMSTRTHOUR_471 = 557847478;

    /**
     * ICC_KEEPWARMSTRTMIN_471 <p>
     * <br>
     * Function Describe: 插枪保温开始时间设置-分 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_KEEPWARMSTRTMIN_471 = 557847479;

    /**
     * ICC_PETMODEFB_471 <p>
     * <br>
     * Function Describe: 宠物模式反馈信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:Invalid <p>
     */
        public static final int ICC_PETMODEFB_471 = 557847480;

    /**
     * ICC_TBOXPETMODEREQ_471 <p>
     * <br>
     * Function Describe: ICC发给TBOX宠物模式激活请求
 0x1:ON 激活
 0x2:OFF 退出 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:Reserved <p>
     */
        public static final int ICC_TBOXPETMODEREQ_471 = 557847487;

    /**
     * ICC_PETMODEWARN_2_471 <p>
     * <br>
     * Function Describe: 宠物模式异常关闭
 0x0:Not Active
 0x1:高压电池电量低
 0x2:空调异常
 0x3:高压异常
 0x4:低压电池电量低
 0x5:高压电池电量低于15%
 0x6:高压电池电量低于12%
 0x7:时间过长预警
 0x8:车辆充电中
 0x9:车辆未设防
 0xA:车辆档位为非P档 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:High Voltage Battery Low <br>
         0x2:TMS Abnormal <br>
         0x3:High Pressure Abnormal <br>
         0x4:Low Voltage Battery Low <br>
         0x5:High Voltage Battery Less Than 15% <br>
         0x6:High Voltage Battery Less Than 12% <br>
         0x7:Time Long Warning <br>
         0x8:Vehicle charging <br>
         0x9:Vehicle Disarming <br>
         0xA:Gear is non-p <p>
     */
        public static final int ICC_PETMODEWARN_2_471 = 557847488;

    /**
     * ICM_SUMTRIP_471 <p>
     * <br>
     * Function Describe: 小计里程 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICM_SUMTRIP_471 = 557847496;

    /**
     * OBC_CC_CONNECTSTS_477 <p>
     * <br>
     * Function Describe: CC connect states <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not connected <br>
         0x1:Charge Connected <br>
         0x2:V2V <br>
         0x3:V2L <br>
         0x4:Half Connection <br>
         0x5:Error <br>
         0x6~0x7:Reserved <p>
     */
        public static final int OBC_CC_CONNECTSTS_477 = 557847515;

    /**
     * OBC_INNERDISCHGREQ_477 <p>
     * <br>
     * Function Describe: Internal discharge request <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:No Req <br>
         0x1:Req <p>
     */
        public static final int OBC_INNERDISCHGREQ_477 = 557847517;

    /**
     * ICC_HVBATTKEEPWARMSET_478 <p>
     * <br>
     * Function Describe: 中控插枪保温开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not active <br>
         0x1:active <p>
     */
        public static final int ICC_HVBATTKEEPWARMSET_478 = 557847518;

    /**
     * ICC_CARSICKRELFMODEREQ_478 <p>
     * <br>
     * Function Describe: 晕车舒缓模式
 触发一次快发三帧有效，之后返回0x0:Not Active <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:Reserved <p>
     */
        public static final int ICC_CARSICKRELFMODEREQ_478 = 557847519;

    /**
     * CCP_1_FRONTAUTOACSWITCHREQ_47B <p>
     * <br>
     * Function Describe: 前排自动功能 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:No_Pressed <br>
         0x1:Pressed <p>
     */
        public static final int CCP_1_FRONTAUTOACSWITCHREQ_47B = 557847522;

    /**
     * CCP_1_FLTEMPSWITCHREQ_47B <p>
     * <br>
     * Function Describe: 前排左侧温度调节 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int CCP_1_FLTEMPSWITCHREQ_47B = 557847523;

    /**
     * CCP_1_FBLOWSPDCTRLSWITCHREQ_47B <p>
     * <br>
     * Function Describe: 前排风速 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:No_Request <br>
         0x1:Speed_1_Request <br>
         0x2:Speed_2_Request <br>
         0x3:Speed_3_Request <br>
         0x4:Speed_4_Request <br>
         0x5:Speed_5_Request <br>
         0x6:Speed_6_Request <br>
         0x7:Speed_7_Request <br>
         0x8:Speed_8_Request <br>
         0x9:Speed_9_Request <br>
         0xA:Speed_10_Request <br>
         0xC:Speed_0_Request <br>
         0xF:Invalid <p>
     */
        public static final int CCP_1_FBLOWSPDCTRLSWITCHREQ_47B = 557847526;

    /**
     * TBOX_BKCHRGSTARTTIMEEHOUR_47C <p>
     * <br>
     * Function Describe: 预约充电开始时间设置-时 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int TBOX_BKCHRGSTARTTIMEEHOUR_47C = 557847530;

    /**
     * TBOX_BKCHRGSTARTTIMEMIN_47C <p>
     * <br>
     * Function Describe: 预约充电开始时间设置-分 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int TBOX_BKCHRGSTARTTIMEMIN_47C = 557847532;

    /**
     * TBOX_BKCHRGDURATION_47C <p>
     * <br>
     * Function Describe: 远程预约充电时长设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int TBOX_BKCHRGDURATION_47C = 557847536;

    /**
     * TBOX_KEEPWARMSTRTHOUR_47C <p>
     * <br>
     * Function Describe: 插枪保温开始时间设置-时 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int TBOX_KEEPWARMSTRTHOUR_47C = 557847545;

    /**
     * TBOX_KEEPWARMSTRTMIN_47C <p>
     * <br>
     * Function Describe: 插枪保温开始时间设置-分 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int TBOX_KEEPWARMSTRTMIN_47C = 557847546;

    /**
     * IMMO_TEACH_VCC_47D <p>
     * <br>
     * Function Describe:  <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int IMMO_TEACH_VCC_47D = 557847553;

    /**
     * VCC_TEACH_IMMO_47F <p>
     * <br>
     * Function Describe:  <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int VCC_TEACH_IMMO_47F = 557847578;

    /**
     * TBOX_PETMODESETTEMPERATURE_480 <p>
     * <br>
     * Function Describe: 宠物模式远程空调温度设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int TBOX_PETMODESETTEMPERATURE_480 = 557847579;

    /**
     * ESPSWITCHSTATUS_48A <p>
     * <br>
     * Function Describe: “1” means VDC and Engine Traction Control System (PTC) Function and Brake Traction Control System (BTC) Function disabled and Ignit ESP lamp. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:On <br>
         0x1:Disable <p>
     */
        public static final int ESPSWITCHSTATUS_48A = 557847602;

    /**
     * VEHICLESPEEDVSOSIGVALIDDATA_48A <p>
     * <br>
     * Function Describe: Valid check bit of the signal VehicleSpeedVSOSig <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Valid <br>
         0x1:Not valid <p>
     */
        public static final int VEHICLESPEEDVSOSIGVALIDDATA_48A = 557847603;

    /**
     * VEHICLESPEEDVSOSIG_48A <p>
     * <br>
     * Function Describe: Vehicle Speed <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VEHICLESPEEDVSOSIG_48A = 557847604;

    /**
     * ABSFAILSTS_48A <p>
     * <br>
     * Function Describe: ABS Fail Status <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Fail not present <br>
         0x1:Fail present (lamp on) <p>
     */
        public static final int ABSFAILSTS_48A = 557847605;

    /**
     * EBDFAILSTS_48A <p>
     * <br>
     * Function Describe: EBD Fail Status <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Fail not present <br>
         0x1:Fail present (lamp on) <p>
     */
        public static final int EBDFAILSTS_48A = 557847606;

    /**
     * TCSFAILSTS_48A <p>
     * <br>
     * Function Describe: After IGN OFF, this signal should be set to 0 for avoiding ICM ESP warning. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Fail not present <br>
         0x1:Fail present (lamp on) <p>
     */
        public static final int TCSFAILSTS_48A = 557847607;

    /**
     * VDCFAILSTS_48A <p>
     * <br>
     * Function Describe: After IGN OFF, this signal should be set to 0 for avoiding ICM ESP warning. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Fail not present <br>
         0x1:Fail present (lamp on) <p>
     */
        public static final int VDCFAILSTS_48A = 557847608;

    /**
     * TCSACTIVE_48A <p>
     * <br>
     * Function Describe: TCS Active <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not active <br>
         0x1:Active(blinking lamp) <p>
     */
        public static final int TCSACTIVE_48A = 557847609;

    /**
     * VDCACTIVE_48A <p>
     * <br>
     * Function Describe: VDC Active <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not active <br>
         0x1:Active(blinking lamp) <p>
     */
        public static final int VDCACTIVE_48A = 557847610;

    /**
     * ICC_KEYDRIVEMODEMEMORY_48F <p>
     * <br>
     * Function Describe: 驾驶模式记忆开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:Reserved <p>
     */
        public static final int ICC_KEYDRIVEMODEMEMORY_48F = 557847614;

    /**
     * ICC_DRIVEMODESET_48F <p>
     * <br>
     * Function Describe: 大屏越野模式设置
 0x1：经济
 0x2：标准
 0x3：运动
 0x4：雪/草地
 0x5: 泥地
 0x6: 越野
 0x7: 沙地
 0x8: 岩石
 0x9: 专家
 0xA: 智能
 0xB: 涉水
 0xC: 极限掉头
 0xD: 漂移
 0xE: 拖挂
 0xF: 越野竞速
 0x10:攀爬 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:ECO <br>
         0x2:NORMAL <br>
         0x3:SPORT <br>
         0x4:SNOW <br>
         0x5:MUD <br>
         0x6:OffRoad <br>
         0x7:SAND <br>
         0x8:ROCK <br>
         0x9:EXPERT <br>
         0xA:X <br>
         0xB:WADE <br>
         0xC:UTURN <br>
         0xD:DRIFT <br>
         0xE:TOW <br>
         0xF:OffroadRace <br>
         0x10:CRAWL <br>
         0x11~0x1F:Reserved <p>
     */
        public static final int ICC_DRIVEMODESET_48F = 557847615;

    /**
     * ICC_CLIMBSET_48F <p>
     * <br>
     * Function Describe: 防溜设置开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:Reserved <p>
     */
        public static final int ICC_CLIMBSET_48F = 557847625;

    /**
     * ICC_V2L_INTLDISCHG_48F <p>
     * <br>
     * Function Describe: 放电记忆开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:OFF <br>
         0x2:IntelV2L ON <br>
         0x3:Reserved <p>
     */
        public static final int ICC_V2L_INTLDISCHG_48F = 557847630;

    /**
     * ICC_EXHIBITIONMODESWITCH_48F <p>
     * <br>
     * Function Describe: 展车模式开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:Reserved <p>
     */
        public static final int ICC_EXHIBITIONMODESWITCH_48F = 557847631;

    /**
     * ICC_TRAILERMODE_48F <p>
     * <br>
     * Function Describe: 被拖模式开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:Reserved <p>
     */
        public static final int ICC_TRAILERMODE_48F = 557847632;

    /**
     * ICC_V2L_DISCHGMEM_48F <p>
     * <br>
     * Function Describe: 放电记忆开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:Remember <br>
         0x2:No Remember <br>
         0x3:Reserved <p>
     */
        public static final int ICC_V2L_DISCHGMEM_48F = 557847633;

    /**
     * ICC_DRIVEPOWERDISPSET_48F <p>
     * <br>
     * Function Describe: 驱动系统功率显示方式开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:PercentDisp <br>
         0x2:kWDisp <br>
         0x3:Reserved <p>
     */
        public static final int ICC_DRIVEPOWERDISPSET_48F = 557847634;

    /**
     * ICC_REGENERATELEVELCTRL_48F <p>
     * <br>
     * Function Describe: 能量回馈设置开关
 0x0:无效值
 0x1:弱
 0x2:强
 0x3:中
 0x4:单踏板 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:Low <br>
         0x2:High <br>
         0x3:middle <br>
         0x4:SinglePedl <br>
         0x5~0x7:Reserved <p>
     */
        public static final int ICC_REGENERATELEVELCTRL_48F = 557847638;

    /**
     * ICC_HVDOWNREPAIRMODE_48F <p>
     * <br>
     * Function Describe: 断高压维修模式开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:Reserved <p>
     */
        public static final int ICC_HVDOWNREPAIRMODE_48F = 557847643;

    /**
     * LC_LISHOWMODSTS_491 <p>
     * <br>
     * Function Describe: 解闭锁模式状态反馈信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:OFF <br>
         0x2:Mode1 <br>
         0x3:Mode2 <br>
         0x4:Mode3 <br>
         0x5:Mode4(Reserved) <br>
         0x6:Mode5(Reserved) <p>
     */
        public static final int LC_LISHOWMODSTS_491 = 557847655;

    /**
     * EXTERNALTEMPERATURE_F_494 <p>
     * <br>
     * Function Describe: External_temperature（F）（外部温度（华氏度）） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int EXTERNALTEMPERATURE_F_494 = 557847656;

    /**
     * EXTERNALTEMPERATURE_C_494 <p>
     * <br>
     * Function Describe: External_temperature（℃）
 Invalid:_When_external_temperature_is_fail,_the_signal_value_is_0xFE. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0xFE:invalid <p>
     */
        public static final int EXTERNALTEMPERATURE_C_494 = 557847657;

    /**
     * BLOWSPEEDLEVELDISPLAYSTS_494 <p>
     * <br>
     * Function Describe: Blow_Speed_Level_feedback
 鼓风机档位
 0xB:Auto后面要加这个属性 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Level_1 <br>
         0x2:Level_2 <br>
         0x3:Level_3 <br>
         0x4:Level_4 <br>
         0x5:Level_5 <br>
         0x6:Level_6 <br>
         0x7:Level_7 <br>
         0x8:Level_8 <br>
         0x9:Level_9 <br>
         0xA:Level_10 <br>
         0xB:Reserved <br>
         0xC:Level_0 <br>
         0xD~0xF:Reserved <p>
     */
        public static final int BLOWSPEEDLEVELDISPLAYSTS_494 = 557847658;

    /**
     * CCP_2_DEFROSTMODESWITCHREQ_497 <p>
     * <br>
     * Function Describe: 前除霜 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:No_Pressed <br>
         0x1:Pressed <p>
     */
        public static final int CCP_2_DEFROSTMODESWITCHREQ_497 = 557847673;

    /**
     * IHU_AUTHLDSET_498 <p>
     * <br>
     * Function Describe: automatic hold set <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:On <br>
         0x2:Off <br>
         0x3:Not Used <p>
     */
        public static final int IHU_AUTHLDSET_498 = 557847682;

    /**
     * ICC_EPBSETCMD_498 <p>
     * <br>
     * Function Describe: EPB Set Command <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:Release <br>
         0x2:Apply <br>
         0x3:Reserved <p>
     */
        public static final int ICC_EPBSETCMD_498 = 557847687;

    /**
     * SET_CSTFUNCTIONSTS_498 <p>
     * <br>
     * Function Describe: CST:Comfortable stop
 To switch on or off CST function. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not active <br>
         0x1:CST ON <br>
         0x2:CST OFF <br>
         0x3:Reserved <p>
     */
        public static final int SET_CSTFUNCTIONSTS_498 = 557847690;

    /**
     * TIHU_SETHDCONOFF_498 <p>
     * <br>
     * Function Describe: 通过DVD设置HDC功能开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:Not Used <p>
     */
        public static final int TIHU_SETHDCONOFF_498 = 557847693;

    /**
     * SET_ESPFUNCTIONSTS_498 <p>
     * <br>
     * Function Describe:  <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:Not Used <p>
     */
        public static final int SET_ESPFUNCTIONSTS_498 = 557847694;

    /**
     * FUELTANKLIDSTS_499 <p>
     * <br>
     * Function Describe: 加油小门开关状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Close <br>
         0x1:Open <p>
     */
        public static final int FUELTANKLIDSTS_499 = 557847698;

    /**
     * ACU_1_AIRBAGFAILSTS_49C <p>
     * <br>
     * Function Describe: 气囊故障信号(仪表点灯) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Fail no present, lamp off <br>
         0x1:Fail no present, lamp flashing <br>
         0x2:Fail present, lamp on <br>
         0x3:Lamp on, but no warning information displaying on the LCD <p>
     */
        public static final int ACU_1_AIRBAGFAILSTS_49C = 557847704;

    /**
     * ACU_1_THDROWLBELTWARNING_49C <p>
     * <br>
     * Function Describe: 三排左安全带报警
 With Occupancy detection：
 Third row (left) safety belt status
 0x0:not occupied/occupied and fastened
 0x1:occupied and not fastened 
 Without Occupancy detection：
 0x0:Seat belt is fastened
 0x1:Seat belt is not fastened <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:No Warning <br>
         0x1:Warning <p>
     */
        public static final int ACU_1_THDROWLBELTWARNING_49C = 557847705;

    /**
     * ACU_1_THDROWRBELTWARNING_49C <p>
     * <br>
     * Function Describe: 三排右安全带报警
 With Occupancy detection：
 Third row (right) safety belt status
 0x0:not occupied/occupied and fastened
 0x1:occupied and not fastened 
 Without Occupancy detection：
 0x0:Seat belt is fastened
 0x1:Seat belt is not fastened <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:No Warning <br>
         0x1:Warning <p>
     */
        public static final int ACU_1_THDROWRBELTWARNING_49C = 557847706;

    /**
     * ACU_1_PSNGRSEATBELTWARNING_49C <p>
     * <br>
     * Function Describe: 副驾乘员安全带报警
 In addition to the corresponding value sent by ACU with copilot safety belt alarm, the signal sent by ACU without alarm configuration sends the startup value.
 The signal is judged in combination with SBR <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not warning <br>
         0x1:Reserve <br>
         0x2:Warning <br>
         0x3:Not used <p>
     */
        public static final int ACU_1_PSNGRSEATBELTWARNING_49C = 557847707;

    /**
     * ACU_1_SECROWLBELTWARNING_49C <p>
     * <br>
     * Function Describe: 二排左安全带报警
 With Occupancy detection：
 Second row (left) safety belt status
 0x0:not occupied/occupied and fastened
 0x1:occupied and not fastened 
 Without Occupancy detection：
 0x0:Seat belt is fastened
 0x1:Seat belt is not fastened <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:No Warning <br>
         0x1:Warning <p>
     */
        public static final int ACU_1_SECROWLBELTWARNING_49C = 557847708;

    /**
     * ACU_1_SECROWMBELTWARNING_49C <p>
     * <br>
     * Function Describe: 二排中间安全带
 With Occupancy detection：
 Second row (middle) safety belt status
 0x0:not occupied/occupied and fastened
 0x1:occupied and not fastened 
 Without Occupancy detection：
 0x0:Seat belt is fastened
 0x1:Seat belt is not fastened <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:No Warning <br>
         0x1:Warning <p>
     */
        public static final int ACU_1_SECROWMBELTWARNING_49C = 557847709;

    /**
     * ACU_1_SECROWRBELTWARNING_49C <p>
     * <br>
     * Function Describe: 二排右安全带报警
 With Occupancy detection：
 Second row (right) safety belt status
 0x0:not occupied/occupied and fastened
 0x1:occupied and not fastened 
 Without Occupancy detection：
 0x0:Seat belt is fastened
 0x1:Seat belt is not fastened <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:No Warning <br>
         0x1:Warning <p>
     */
        public static final int ACU_1_SECROWRBELTWARNING_49C = 557847710;

    /**
     * FLZCU_9_POWERMODE_49D <p>
     * <br>
     * Function Describe: 低压电源状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Off <br>
         0x1:Comfortable <br>
         0x2:ON <br>
         0x3:Reserved <p>
     */
        public static final int FLZCU_9_POWERMODE_49D = 557847713;

    /**
     * OBC_ELECTRONICLOCKSTS_49E <p>
     * <br>
     * Function Describe: Electronic Lock Sts <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Unlock <br>
         0x1:Lock <br>
         0x2:Lock error <br>
         0x3:Unlock error <br>
         0x4:Elock error <p>
     */
        public static final int OBC_ELECTRONICLOCKSTS_49E = 557847717;

    /**
     * OBC_WORKINGMODE_49E <p>
     * <br>
     * Function Describe: OBC working states <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Init <br>
         0x1:Standby <br>
         0x2:Chg <br>
         0x3:Default <br>
         0x4:Preheat <br>
         0x5:Keepwarm <br>
         0x6:V2L <br>
         0x7:V2V <br>
         0x8:Powerdown <br>
         0x9:Afterrun <br>
         0xA:Fault <br>
         0xB~0xF:Reserved <p>
     */
        public static final int OBC_WORKINGMODE_49E = 557847718;

    /**
     * OBC_INNERDISCHGCURR_49E <p>
     * <br>
     * Function Describe:  <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int OBC_INNERDISCHGCURR_49E = 557847719;

    /**
     * OBC_INNERDISCHGVOLT_49E <p>
     * <br>
     * Function Describe:  <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int OBC_INNERDISCHGVOLT_49E = 557847720;

    /**
     * OBC_OUTDISCHGCURR_49E <p>
     * <br>
     * Function Describe:  <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int OBC_OUTDISCHGCURR_49E = 557847721;

    /**
     * OBC_OUTDISCHGVOLT_49E <p>
     * <br>
     * Function Describe:  <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int OBC_OUTDISCHGVOLT_49E = 557847722;

    /**
     * FRONTDEFORESTDISPLAYSTS_4A4 <p>
     * <br>
     * Function Describe: 前除霜工作指示灯
 0x0:Off
 0x1:On
 TMS_3(0x4A4)LSB16拆帧路由至FLZCU_5(0x35B) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Active <p>
     */
        public static final int FRONTDEFORESTDISPLAYSTS_4A4 = 557847723;

    /**
     * TMS_AUTODISPLAYSTS_4A4 <p>
     * <br>
     * Function Describe: Auto_Display_Status
 空调自动状态显示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Auto_Off <br>
         0x1:Auto_On <p>
     */
        public static final int TMS_AUTODISPLAYSTS_4A4 = 557847726;

    /**
     * TMS_REFINSUFDISPSTS_4A4 <p>
     * <br>
     * Function Describe: Refrigerant_Insufficient_Display_Status
 冷媒不足弹窗提醒 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Off <br>
         0x1:On <p>
     */
        public static final int TMS_REFINSUFDISPSTS_4A4 = 557847730;

    /**
     * WORKINGSTS_4A4 <p>
     * <br>
     * Function Describe: Not_active-关闭空调
 Active--打开空调
 0x0:Off
 0x1:On <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Active <p>
     */
        public static final int WORKINGSTS_4A4 = 557847735;

    /**
     * TMS_ACMODECUSTOMSTS_4A4 <p>
     * <br>
     * Function Describe: AC_custom_mode_status_feedback
 空调定制模式状态反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_active <br>
         0x1:ECO <br>
         0x2:Comfortable <br>
         0x3:Strong <p>
     */
        public static final int TMS_ACMODECUSTOMSTS_4A4 = 557847738;

    /**
     * TMS_ACREQUESTDISPLAYSTS_4A4 <p>
     * <br>
     * Function Describe: AC请求指示
 压缩机状态显示信号,和发给EMS的AC请求信号需区分开 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Off <br>
         0x1:On <p>
     */
        public static final int TMS_ACREQUESTDISPLAYSTS_4A4 = 557847739;

    /**
     * TMS_ACFASTCOOL_4A4 <p>
     * <br>
     * Function Describe: AC_Fast_Cooling_Working_Status
 空调极速降温工作状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Off <br>
         0x1:On <p>
     */
        public static final int TMS_ACFASTCOOL_4A4 = 557847744;

    /**
     * TMS_ACFASTHEAT_4A4 <p>
     * <br>
     * Function Describe: AC_Fast_Heating_Working_Status
 空调快速升温工作状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Off <br>
         0x1:On <p>
     */
        public static final int TMS_ACFASTHEAT_4A4 = 557847745;

    /**
     * TMS_AUTOAIRCLEANSTS_4A4 <p>
     * <br>
     * Function Describe: Auto_Air_Clean_Status
 座舱自动清洁设置项状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Off <br>
         0x1:On <p>
     */
        public static final int TMS_AUTOAIRCLEANSTS_4A4 = 557847749;

    /**
     * TMS_SETTEMPERATURE_L_C_4A4 <p>
     * <br>
     * Function Describe: 在单区模式下，调节左旋钮可以同时设定左右两边的温度设定。在双区模式下，左旋钮设定左区温度，右旋钮设定右区温度。
 DVD未收到设定温值时，以及收到设定温值为startup_对应的1F时，DVD屏幕上温度显示区域均显示空白。 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int TMS_SETTEMPERATURE_L_C_4A4 = 557847752;

    /**
     * TMS_SETTEMPERATURE_R_C_4A4 <p>
     * <br>
     * Function Describe:  <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int TMS_SETTEMPERATURE_R_C_4A4 = 557847753;

    /**
     * TMS_MODEADJUSTDISPLAYSTS_4A4 <p>
     * <br>
     * Function Describe: Blower_Mode_Display_Status
 出风模式现实状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:BlowFace <br>
         0x1:BlowFaceAndBlowFoot <br>
         0x2:BlowFoot <br>
         0x3:BlowFootAndBlowWindow <br>
         0x4:BlowWindow <br>
         0x5:Not Active <br>
         0x6:BlowFaceAndBlowWindow <br>
         0x7:BlowFaceAndBlowFootAndBlowWindow <br>
         0x8:Auto <p>
     */
        public static final int TMS_MODEADJUSTDISPLAYSTS_4A4 = 557847754;

    /**
     * TMS_CIRCULATIONMODEDISPLAYSTS_4A4 <p>
     * <br>
     * Function Describe: Circulation_Mode_Status
 循环风门状态
 0X2用作自动循环信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Recirculation_mode <br>
         0x1:Air_circulation_mode <br>
         0x2:Two-Layer_Flow_Mode <br>
         0x3:Auto <p>
     */
        public static final int TMS_CIRCULATIONMODEDISPLAYSTS_4A4 = 557847755;

    /**
     * TMS_INCARTEMP_4A4 <p>
     * <br>
     * Function Describe: Incar_Temperature
 车内温度 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int TMS_INCARTEMP_4A4 = 557847756;

    /**
     * BLOWDELAYOFFSTS_4A4 <p>
     * <br>
     * Function Describe: Blower_Delay_Off_Status
 鼓风机延迟关闭状态
 0x0：开启延时
 0x1：关闭延时 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:DelayOff <br>
         0x1:Not_DelayOff <p>
     */
        public static final int BLOWDELAYOFFSTS_4A4 = 557847770;

    /**
     * SRF_OPERATESTS_4A5 <p>
     * <br>
     * Function Describe: 天窗玻璃运行状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:Tilt <br>
         0x2:Close <br>
         0x3:Opening <br>
         0x4:Stop <br>
         0x5:Closing <br>
         0x6:Open <br>
         0x7:Comfort_open <p>
     */
        public static final int SRF_OPERATESTS_4A5 = 557847789;

    /**
     * SRF_POSITIONSTS_4A5 <p>
     * <br>
     * Function Describe: 天窗玻璃开度值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:0% <br>
         0x2:10% <br>
         0x3:20% <br>
         0x4:30% <br>
         0x5:40% <br>
         0x6:50% <br>
         0x7:60% <br>
         0x8:70% <br>
         0x9:80% <br>
         0xA:90% <br>
         0xB:100% <br>
         0xC:Tilt <br>
         0xD~0xF:Reserved <p>
     */
        public static final int SRF_POSITIONSTS_4A5 = 557847790;

    /**
     * SRF_SUNSHADE_OPERATESTS_4A5 <p>
     * <br>
     * Function Describe: 遮阳帘状运行状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:Close <br>
         0x2:Opening <br>
         0x3:Stop <br>
         0x4:Closing <br>
         0x5:Open <br>
         0x6:Half_Open <br>
         0x7:Reserved <p>
     */
        public static final int SRF_SUNSHADE_OPERATESTS_4A5 = 557847792;

    /**
     * SRF_SUNSHADE_POSITIONSTS_4A8 <p>
     * <br>
     * Function Describe: 遮阳帘开度值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:0% <br>
         0x2:10% <br>
         0x3:20% <br>
         0x4:30% <br>
         0x5:40% <br>
         0x6:50% <br>
         0x7:60% <br>
         0x8:70% <br>
         0x9:80% <br>
         0xA:90% <br>
         0xB:100% <br>
         0xC~0xF:Reserved <p>
     */
        public static final int SRF_SUNSHADE_POSITIONSTS_4A8 = 557847796;

    /**
     * AVHWARNINGMESSAGE_4A9 <p>
     * <br>
     * Function Describe: AVH Warning Message <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Off <br>
         0x1:Fasten DriverSeatBelt and Close the LHF door <p>
     */
        public static final int AVHWARNINGMESSAGE_4A9 = 557847797;

    /**
     * CDPACTIVE_4A9 <p>
     * <br>
     * Function Describe: CDP Active <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not active <br>
         0x1:Active <p>
     */
        public static final int CDPACTIVE_4A9 = 557847798;

    /**
     * HDCFAILSTS_4A9 <p>
     * <br>
     * Function Describe: After IGN OFF, this signal should be set to 0 for avoiding ICM HDC warning. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Fail not present <br>
         0x1:Fail present (lamp on) <p>
     */
        public static final int HDCFAILSTS_4A9 = 557847799;

    /**
     * HDCCTRLSTS_4A9 <p>
     * <br>
     * Function Describe: HDC Ctrl Sts <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:OFF <br>
         0x1:not active braking(lamp on) <br>
         0x2:On active braking(flash) <br>
         0x3:Not used <p>
     */
        public static final int HDCCTRLSTS_4A9 = 557847800;

    /**
     * ONEBOX_2_G_AVHSTS_4A9 <p>
     * <br>
     * Function Describe: Auto Hold Status <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Off <br>
         0x1:Standby <br>
         0x2:Active <br>
         0x3:Not Used <p>
     */
        public static final int ONEBOX_2_G_AVHSTS_4A9 = 557847801;

    /**
     * ONEBOX_2_G_AVHFAILSTS_4A9 <p>
     * <br>
     * Function Describe: AVH Fail Status <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Fail not present <br>
         0x1:Fail present (lamp on) <p>
     */
        public static final int ONEBOX_2_G_AVHFAILSTS_4A9 = 557847802;

    /**
     * FWAWARNINGSTS_4A9 <p>
     * <br>
     * Function Describe: FWA:Fading warning Assist
 Indicate FWA state, dashboard need warn driver <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:No failure <br>
         0x1:BrakeSys High Temperature Leve1 <br>
         0x2:BrakeSys High Temperature Leve2 <br>
         0x3:Not used <p>
     */
        public static final int FWAWARNINGSTS_4A9 = 557847803;

    /**
     * BRAKEFLUIDSTS_4A9 <p>
     * <br>
     * Function Describe:  <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Normal <br>
         0x1:Empty <br>
         0x2:Electric_error <br>
         0x3:Not used <p>
     */
        public static final int BRAKEFLUIDSTS_4A9 = 557847804;

    /**
     * TDL_SWITCHSTS_4AC <p>
     * <br>
     * Function Describe: 氛围灯开关状态反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:reserved <p>
     */
        public static final int TDL_SWITCHSTS_4AC = 557847806;

    /**
     * TDL_COLOURMODESTS_4AC <p>
     * <br>
     * Function Describe: 氛围灯颜色模式反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Monochrome <br>
         0x2:panchromatic <br>
         0x3:OFF <br>
         0x4~0x7:Reserved <p>
     */
        public static final int TDL_COLOURMODESTS_4AC = 557847807;

    /**
     * TDL_RHYTHMSWSTS_4AC <p>
     * <br>
     * Function Describe: 氛围灯音乐律动状态反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:reserved <p>
     */
        public static final int TDL_RHYTHMSWSTS_4AC = 557847808;

    /**
     * TDL_APILUMINANCESTS_4AC <p>
     * <br>
     * Function Describe: 氛围灯亮度反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Level1 <br>
         0x2:Level2 <br>
         0x3:Level3 <br>
         0x4:Level4 <br>
         0x5:Level5 <br>
         0x6:Level6 <br>
         0x7:Level7 <br>
         0x8:Level8 <br>
         0x9~0xF:Reserved <p>
     */
        public static final int TDL_APILUMINANCESTS_4AC = 557847809;

    /**
     * TDL_FLOWLIGHTSWSTS_4AC <p>
     * <br>
     * Function Describe: 流水灯开关状态反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:reserved <p>
     */
        public static final int TDL_FLOWLIGHTSWSTS_4AC = 557847811;

    /**
     * TDL_FLOWLIGHTMODESTS_4AC <p>
     * <br>
     * Function Describe: 流水灯模式状态反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:mode1 <br>
         0x2:mode2 <br>
         0x3:mode3 <br>
         0x4:mode4 <br>
         0x5:mode5 <br>
         0x6:mode6 <br>
         0x7:Reserved <p>
     */
        public static final int TDL_FLOWLIGHTMODESTS_4AC = 557847812;

    /**
     * TDL_RHYTHMMODESTS_4AC <p>
     * <br>
     * Function Describe: 音乐律动模式反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Mode1 <br>
         0x2:Mode2 <br>
         0x3:Mode3 <br>
         0x4:Mode4 <br>
         0x5:Mode5 <br>
         0x6:Mode6 <br>
         0x7:Reserved <p>
     */
        public static final int TDL_RHYTHMMODESTS_4AC = 557847813;

    /**
     * TDL_DOWWARNINGSTS_4AC <p>
     * <br>
     * Function Describe: DOW预警开关反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:Reserved <p>
     */
        public static final int TDL_DOWWARNINGSTS_4AC = 557847814;

    /**
     * TDL_ASSOCIATEDDRIVINGMODESTS_4AC <p>
     * <br>
     * Function Describe: 驾驶模式开关反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:Reserved <p>
     */
        public static final int TDL_ASSOCIATEDDRIVINGMODESTS_4AC = 557847815;

    /**
     * TDL_256COLOURSTS_4AC <p>
     * <br>
     * Function Describe: 多元颜色状态反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int TDL_256COLOURSTS_4AC = 557847816;

    /**
     * CST_STATUS_4AD <p>
     * <br>
     * Function Describe: CST:Comfortable stop <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:CST is disabled <br>
         0x1:CST is Standby <br>
         0x2:CST is Active <br>
         0x3:CST is Failure <p>
     */
        public static final int CST_STATUS_4AD = 557847817;

    /**
     * BRAKEPEDALFEELSTS_4AD <p>
     * <br>
     * Function Describe:  <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Comfort <br>
         0x1:Sport <br>
         0x2:Offroad <br>
         0x3:Reserved <p>
     */
        public static final int BRAKEPEDALFEELSTS_4AD = 557847818;

    /**
     * SOC_4B0 <p>
     * <br>
     * Function Describe: Battery_state_of_charge <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int SOC_4B0 = 557847821;

    /**
     * ENGINESPEED_4B2 <p>
     * <br>
     * Function Describe: Engine Speed
 PHEV上此信号发送真实转速（给BCM使用） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x7FF:Invalid <p>
     */
        public static final int ENGINESPEED_4B2 = 557847830;

    /**
     * ENGINESPEEDVALIDDATA_4B2 <p>
     * <br>
     * Function Describe: Valid check bit of the signal EngineSpeed
 发动机转速有效位 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Valid <br>
         0x1:Not valid <p>
     */
        public static final int ENGINESPEEDVALIDDATA_4B2 = 557847831;

    /**
     * EMS_1_G_ENGINESTS_4B2 <p>
     * <br>
     * Function Describe: Engine Status
 If this value is 1, indicate that the engine is started successfully. 
 在PHEV上，此信号发送模拟的发动机状态； <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Run <br>
         0x1:Run <p>
     */
        public static final int EMS_1_G_ENGINESTS_4B2 = 557847833;

    /**
     * VCU_1_G_PTREADY_4B4 <p>
     * <br>
     * Function Describe: PT Ready indication <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:LmpOFF <br>
         0x1:LmpON <p>
     */
        public static final int VCU_1_G_PTREADY_4B4 = 557847840;

    /**
     * VCU_1_G_BOOKCHRGSETRESPONSE_4B4 <p>
     * <br>
     * Function Describe:  <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Default <br>
         0x1:Success <br>
         0x2:Cancelled <br>
         0x3:Fail <br>
         0x4:Reserved <p>
     */
        public static final int VCU_1_G_BOOKCHRGSETRESPONSE_4B4 = 557847842;

    /**
     * VCU_1_G_PRNDGEARACT_4B4 <p>
     * <br>
     * Function Describe: Gear indication <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Init <br>
         0x1:P <br>
         0x2:R <br>
         0x3:N <br>
         0x4:D <br>
         0x5~0x7:Reserved <p>
     */
        public static final int VCU_1_G_PRNDGEARACT_4B4 = 557847844;

    /**
     * PPMID_1_PPMICOUNTER_4B8 <p>
     * <br>
     * Function Describe: PPMI counter/寿命计数状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Count not full <br>
         0x1:Count is full <p>
     */
        public static final int PPMID_1_PPMICOUNTER_4B8 = 557847855;

    /**
     * PPMID_1_PPMIST_4B8 <p>
     * <br>
     * Function Describe: PPMI status/ PPMI是否有故障 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:PPMI no error <br>
         0x1:PPMI initialization <br>
         0x2:PPMI internal error <br>
         0x3:External error <br>
         0x4~0x7:Reserved <p>
     */
        public static final int PPMID_1_PPMIST_4B8 = 557847856;

    /**
     * VCU_2_G_POWERLIMIT_4B9 <p>
     * <br>
     * Function Describe: power limitation indication <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:LmpOFF <br>
         0x1:LmpON <p>
     */
        public static final int VCU_2_G_POWERLIMIT_4B9 = 557847863;

    /**
     * VCU_2_G_BRAKEPEDALSTSVALIDDATA_4B9 <p>
     * <br>
     * Function Describe: 制动踏板状态有效 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Valid <br>
         0x1:Not Valid <p>
     */
        public static final int VCU_2_G_BRAKEPEDALSTSVALIDDATA_4B9 = 557847869;

    /**
     * VCU_2_G_EXHIBITIONMOD_4B9 <p>
     * <br>
     * Function Describe:  <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:No Active <br>
         0x1:Active <p>
     */
        public static final int VCU_2_G_EXHIBITIONMOD_4B9 = 557847870;

    /**
     * VCU_2_G_BRAKEPEDALSTS_4B9 <p>
     * <br>
     * Function Describe: 制动踏板状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not applied <br>
         0x1:Applied <p>
     */
        public static final int VCU_2_G_BRAKEPEDALSTS_4B9 = 557847871;

    /**
     * VCU_2_G_HVREADY_4B9 <p>
     * <br>
     * Function Describe: HV Ready <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:LmpOFF <br>
         0x1:LmpON <p>
     */
        public static final int VCU_2_G_HVREADY_4B9 = 557847873;

    /**
     * ICC_DELETEFACEID_4BA <p>
     * <br>
     * Function Describe: 删除ID <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_active <br>
         0x1:ID1 <br>
         0x2:ID2 <br>
         0x3:ID3 <br>
         0x4:ID4 <br>
         0x5:ID5 <br>
         0x6~0x7:Not_Used <p>
     */
        public static final int ICC_DELETEFACEID_4BA = 557847886;

    /**
     * ICC_FLSEATBACKAGTARGETCMD_4BA <p>
     * <br>
     * Function Describe: 主驾座椅靠背角度调节目标
 0x0:Not active <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_FLSEATBACKAGTARGETCMD_4BA = 557847891;

    /**
     * ICC_FRSEATBACKAGTARGETCMD_4BA <p>
     * <br>
     * Function Describe: 副驾座椅靠背角度调节目标
 0x0:Not active <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_FRSEATBACKAGTARGETCMD_4BA = 557847896;

    /**
     * ICC_FRSEATLEGSPPRTTARGETCMD_4BA <p>
     * <br>
     * Function Describe: 副驾座椅腿托调节目标
 0x0:Not active <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_FRSEATLEGSPPRTTARGETCMD_4BA = 557847897;

    /**
     * ICC_NAPFLSEATLVLTARGETSET_4BA <p>
     * <br>
     * Function Describe: 小憩模式设置主驾座椅水平调节目标
 0x0:Not active <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_NAPFLSEATLVLTARGETSET_4BA = 557847900;

    /**
     * ICC_NAPFRSEATLVLTARGETSET_4BA <p>
     * <br>
     * Function Describe: 小憩模式设置副驾座椅水平调节目标
 0x0:Not active <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_NAPFRSEATLVLTARGETSET_4BA = 557847901;

    /**
     * ICC_WELCOMEOPENSETCMD_4BA <p>
     * <br>
     * Function Describe: 迎宾灯开启设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:Not_Used <p>
     */
        public static final int ICC_WELCOMEOPENSETCMD_4BA = 557847907;

    /**
     * ICC_BLTKEYPESET_4BA <p>
     * <br>
     * Function Describe: 备注：设置蓝牙钥匙的PE功能ON/OFF状态
 0x0：不动作
 0x1：PE功能打开
 0x2：PE功能关闭 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:Not_Used <p>
     */
        public static final int ICC_BLTKEYPESET_4BA = 557847911;

    /**
     * ICC_UIROPENSETCMD_4BA <p>
     * <br>
     * Function Describe: 靠近解锁开关设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:Not_Used <p>
     */
        public static final int ICC_UIROPENSETCMD_4BA = 557847913;

    /**
     * ICC_WALOPENSETCMD_4BA <p>
     * <br>
     * Function Describe: 远离闭锁开关设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:Not_Used <p>
     */
        public static final int ICC_WALOPENSETCMD_4BA = 557847914;

    /**
     * ICC_FLSITPOSNLOCATION_4BA <p>
     * <br>
     * Function Describe: 主驾座椅记忆设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Location1 <br>
         0x2:Location2 <br>
         0x3:Location3 <p>
     */
        public static final int ICC_FLSITPOSNLOCATION_4BA = 557847915;

    /**
     * ICC_FRSITPOSNLOCATION_4BA <p>
     * <br>
     * Function Describe: 副驾座椅记忆设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Location1 <br>
         0x2:Location2 <br>
         0x3:Location3 <p>
     */
        public static final int ICC_FRSITPOSNLOCATION_4BA = 557847916;

    /**
     * ICC_FREASYENTRYEXITSET_4BA <p>
     * <br>
     * Function Describe: 副驾便捷进入\离车 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:Not_Used <p>
     */
        public static final int ICC_FREASYENTRYEXITSET_4BA = 557847917;

    /**
     * ICC_FRMEMORYRECOVERYCMD_4BA <p>
     * <br>
     * Function Describe: ICC副驾记忆保存/恢复指令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Save <br>
         0x2:Recover_Manual <br>
         0x3:RecoverAuto <p>
     */
        public static final int ICC_FRMEMORYRECOVERYCMD_4BA = 557847918;

    /**
     * ICC_LOCKCARSUNROOFSHADECLOSESW_4BA <p>
     * <br>
     * Function Describe: 锁车遮阳帘设置项 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:On <br>
         0x2:Off <br>
         0x3:reserved <p>
     */
        public static final int ICC_LOCKCARSUNROOFSHADECLOSESW_4BA = 557847922;

    /**
     * ICC_REMOTEUNLOCKSETSWITCHSTS_4BA <p>
     * <br>
     * Function Describe: 遥控解锁设置项 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:Drivedoor_Unlock <br>
         0x2:Fourdoor_Unlock <br>
         0x3:reserved <p>
     */
        public static final int ICC_REMOTEUNLOCKSETSWITCHSTS_4BA = 557847923;

    /**
     * FLZCU_RECOVERFB_4BB <p>
     * <br>
     * Function Describe: 记忆恢复状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:Success <br>
         0x2:Fail <br>
         0x3:Ongoing <p>
     */
        public static final int FLZCU_RECOVERFB_4BB = 557847929;

    /**
     * FLZCU_MEMORYFB_4BB <p>
     * <br>
     * Function Describe: 记忆保存状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:Success <br>
         0x2:Fail <br>
         0x3:Ongoing <p>
     */
        public static final int FLZCU_MEMORYFB_4BB = 557847930;

    /**
     * FLZCU_SEATNEEDMEMORY_4BB <p>
     * <br>
     * Function Describe: 主驾座椅记忆弹框请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:NO Request <br>
         0x1:Request <p>
     */
        public static final int FLZCU_SEATNEEDMEMORY_4BB = 557847931;

    /**
     * FLZCU_CURRSEATMEMORYPOS_4BB <p>
     * <br>
     * Function Describe: 主驾记忆坐姿位置反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:ID1_Pos1 <br>
         0x2:ID1_Pos2 <br>
         0x3:ID1_Pos3 <br>
         0x4:ID2_Pos1 <br>
         0x5:ID2_Pos2 <br>
         0x6:ID2_Pos3 <br>
         0x7:ID3_Pos1 <br>
         0x8:ID3_Pos2 <br>
         0x9:ID3_Pos3 <br>
         0xA:ID4_Pos1 <br>
         0xB:ID4_Pos2 <br>
         0xC:ID4 Pos3 <br>
         0xD:ID5 Pos1 <br>
         0xE:ID5_Pos2 <br>
         0xF:ID5_Pos3 <br>
         0x10:NOID_Pos1 <br>
         0x11:NOID_Pos2 <br>
         0x12:NOID_Pos3 <p>
     */
        public static final int FLZCU_CURRSEATMEMORYPOS_4BB = 557847933;

    /**
     * VCU_3_G_ACTWHEELTORQUEFA_4BC <p>
     * <br>
     * Function Describe: 前轴实际轮端扭矩
 Actual wheel torque at FA <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_3_G_ACTWHEELTORQUEFA_4BC = 557847934;

    /**
     * VCU_3_G_ACTWHEELTORQUERA_4BC <p>
     * <br>
     * Function Describe: 后轴实际轮端扭矩
 Actual wheel torque at RA <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_3_G_ACTWHEELTORQUERA_4BC = 557847935;

    /**
     * BMS_HVBATTCELLVOLTMAX_NUM_4C8 <p>
     * <br>
     * Function Describe: highest voltage cell number <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int BMS_HVBATTCELLVOLTMAX_NUM_4C8 = 557847957;

    /**
     * BMS_HVBATTCELLVOLTMAX_4C8 <p>
     * <br>
     * Function Describe: highest cell voltage <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int BMS_HVBATTCELLVOLTMAX_4C8 = 557847958;

    /**
     * BMS_HVBATTCELLVOLTMIN_NUM_4C8 <p>
     * <br>
     * Function Describe: 发送最低电压电芯编码 从1开始
 lowest voltage cell number <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int BMS_HVBATTCELLVOLTMIN_NUM_4C8 = 557847959;

    /**
     * BMS_HVBATTCELLVOLTMIN_4C8 <p>
     * <br>
     * Function Describe: lowest cell voltage
 0xFFFE:Abnormal
 0xFFFF:Invalid <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int BMS_HVBATTCELLVOLTMIN_4C8 = 557847960;

    /**
     * BMS_CHG_STS_4C8 <p>
     * <br>
     * Function Describe: 充电状态BMS_Chg_Sts <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x1:Parking chagre <br>
         0x2:Driving charge <br>
         0x3:no charge <br>
         0x4:charge complete <br>
         0xE:Abnomal <br>
         0xF:Invalid <p>
     */
        public static final int BMS_CHG_STS_4C8 = 557847961;

    /**
     * VCU_CLTC_RANGEAVAL_4CD <p>
     * <br>
     * Function Describe: Remain CLTC available range <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x3FF:Invalid <p>
     */
        public static final int VCU_CLTC_RANGEAVAL_4CD = 557847962;

    /**
     * VCU_WLTC_RANGEAVAL_4CD <p>
     * <br>
     * Function Describe: Remain WLTC available range <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x3FF:Invalid <p>
     */
        public static final int VCU_WLTC_RANGEAVAL_4CD = 557847965;

    /**
     * TBOX_BOOKCHRGSETREQ_4CF <p>
     * <br>
     * Function Describe: TBOX预约充电开启/取消设置请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:default <br>
         0x1:BookSet <br>
         0x2:CancellBook <br>
         0x3:Reserved <p>
     */
        public static final int TBOX_BOOKCHRGSETREQ_4CF = 557847967;

    /**
     * TBOX_KEEPWARMSET_4CF <p>
     * <br>
     * Function Describe: TBOX插枪保温设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:OFF <br>
         0x1:ON <p>
     */
        public static final int TBOX_KEEPWARMSET_4CF = 557847969;

    /**
     * TBOX_BOOKCHRGSTS_4CF <p>
     * <br>
     * Function Describe: 预约充电状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Default <br>
         0x1:WaitingCharge <br>
         0x2:Charging <br>
         0x3:ChargeFinished <br>
         0x4:Reserved <p>
     */
        public static final int TBOX_BOOKCHRGSTS_4CF = 557847971;

    /**
     * FRZCU_RRWINSTS_4D2 <p>
     * <br>
     * Function Describe: 右后车窗运行状态反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Comfort <br>
         0x2:Close <br>
         0x3:Open <br>
         0x4:Other_Position <br>
         0x5:Closing <br>
         0x6:Opening <br>
         0x7:Reserved <p>
     */
        public static final int FRZCU_RRWINSTS_4D2 = 557847984;

    /**
     * FRZCU_FRWINSTS_4D2 <p>
     * <br>
     * Function Describe: 右前车窗运行状态反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Comfort <br>
         0x2:Close <br>
         0x3:Open <br>
         0x4:Other_Position <br>
         0x5:Closing <br>
         0x6:Opening <br>
         0x7:Reserved <p>
     */
        public static final int FRZCU_FRWINSTS_4D2 = 557847985;

    /**
     * FRZCU_FRSEATNEEDMEMORY_4D2 <p>
     * <br>
     * Function Describe: 副驾座椅记忆弹框请求-该信号捷途新增 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:No_Request <br>
         0x1:Request <p>
     */
        public static final int FRZCU_FRSEATNEEDMEMORY_4D2 = 557847988;

    /**
     * FRZCU_FRMEMORYFB_4D2 <p>
     * <br>
     * Function Describe: 副驾记忆保存状态-该信号捷途新增 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Success <br>
         0x2:Fail <br>
         0x3:Ongoing <p>
     */
        public static final int FRZCU_FRMEMORYFB_4D2 = 557847989;

    /**
     * FRZCU_FRRECOVERFB_4D2 <p>
     * <br>
     * Function Describe: 副驾记忆恢复状态-该信号捷途新增 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Success <br>
         0x2:Fail <br>
         0x3:Ongoing <p>
     */
        public static final int FRZCU_FRRECOVERFB_4D2 = 557847990;

    /**
     * FRZCU_EASYENTRYEXITFB_4D2 <p>
     * <br>
     * Function Describe: 副驾便捷进入\离车-该信号捷途新增 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:Not_Used <p>
     */
        public static final int FRZCU_EASYENTRYEXITFB_4D2 = 557847991;

    /**
     * FRZCU_ENJOYABLESEATWARNING_4D2 <p>
     * <br>
     * Function Describe: 一键尊享警示提示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:Buckle tied <br>
         0x2:Occupied <p>
     */
        public static final int FRZCU_ENJOYABLESEATWARNING_4D2 = 557847992;

    /**
     * FRZCU_ENJOYABLESEATSTS_4D2 <p>
     * <br>
     * Function Describe: 一键尊享状态反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:Forward Moving <br>
         0x2:Backward Moving <p>
     */
        public static final int FRZCU_ENJOYABLESEATSTS_4D2 = 557847993;

    /**
     * SEATVENTLEVELSFR_4D2H_4D2 <p>
     * <br>
     * Function Describe: 前排右侧座椅通风挡位 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:OFF <br>
         0x1:Level1 <br>
         0x2:Level2 <br>
         0x3:Level3 <p>
     */
        public static final int SEATVENTLEVELSFR_4D2H_4D2 = 557847994;

    /**
     * SEATHEATLEVELSFR_4D2H_4D2 <p>
     * <br>
     * Function Describe: 前排右侧座椅加热挡位
 0x4:AUTO捷途发不出来，无自动加热功能，预留 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:OFF <br>
         0x1:Level1 <br>
         0x2:Level2 <br>
         0x3:Level3 <br>
         0x4:AUTO <p>
     */
        public static final int SEATHEATLEVELSFR_4D2H_4D2 = 557847995;

    /**
     * NONPWROFFSWTSTS_4D2H_4D2 <p>
     * <br>
     * Function Describe: 驻车不下电设置反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:Not Used <p>
     */
        public static final int NONPWROFFSWTSTS_4D2H_4D2 = 557847998;

    /**
     * EPS_2_STEER_RETURNRMD_4D3 <p>
     * <br>
     * Function Describe: Steer wheeel return remind(捷途D01）
 方向盘未回正文字提示(大屏仪表显示） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:No Tip <br>
         0x1:Tip return finish <br>
         0x2:Tip return left <br>
         0x3:Tip return right <p>
     */
        public static final int EPS_2_STEER_RETURNRMD_4D3 = 557848000;

    /**
     * ICC_DISCHG_4D7 <p>
     * <br>
     * Function Describe: Discharge switch <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:OFF <br>
         0x2:V2L ON <br>
         0x3:V2V ON <p>
     */
        public static final int ICC_DISCHG_4D7 = 557848022;

    /**
     * ICC_DISCHGPERCENT_4D7 <p>
     * <br>
     * Function Describe: discharge limit set SOC(ICC确认发送) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <p>
     */
        public static final int ICC_DISCHGPERCENT_4D7 = 557848026;

    /**
     * ICC_CHGSOCSET_4D7 <p>
     * <br>
     * Function Describe: Charge target SOC(ICC确认发送) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0xFE:Abnormal <br>
         0xFF:Invalid <p>
     */
        public static final int ICC_CHGSOCSET_4D7 = 557848027;

    /**
     * ICC_TOWINGMODE_4D7 <p>
     * <br>
     * Function Describe: 打开/关闭拖车模式服务 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:OFF <br>
         0x2:ON <br>
         0x3:Not Used <p>
     */
        public static final int ICC_TOWINGMODE_4D7 = 557848029;

    /**
     * ICC_WINDOWKEYSTS_4DE <p>
     * <br>
     * Function Describe: Window Key Status
 吹窗按键开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:On <br>
         0x2:Off <br>
         0x3:Not_Used <p>
     */
        public static final int ICC_WINDOWKEYSTS_4DE = 557848068;

    /**
     * ICC_FACEKEYSTS_4DE <p>
     * <br>
     * Function Describe: Face Key Status
 吹面按键开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:On <br>
         0x2:Off <br>
         0x3:Not_Used <p>
     */
        public static final int ICC_FACEKEYSTS_4DE = 557848069;

    /**
     * ICC_FOOTKEYSTS_4DE <p>
     * <br>
     * Function Describe: Foot Key Status
 吹脚按键开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:On <br>
         0x2:Off <br>
         0x3:Not_Used <p>
     */
        public static final int ICC_FOOTKEYSTS_4DE = 557848070;

    /**
     * BLTCALLSTS_4DE <p>
     * <br>
     * Function Describe: Whether the bluetooth call is turned on
 蓝牙通话状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:On <br>
         0x2:Off <br>
         0x3:Not_Used <p>
     */
        public static final int BLTCALLSTS_4DE = 557848071;

    /**
     * ICC_ACFASTCOOL_4DE <p>
     * <br>
     * Function Describe: AC Fast Cooling Working Status Set
 空调极速降温工作状态设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:On <br>
         0x2:Off <br>
         0x3:Not_Used <p>
     */
        public static final int ICC_ACFASTCOOL_4DE = 557848074;

    /**
     * ICC_ACFASTHEAT_4DE <p>
     * <br>
     * Function Describe: AC Fast Heating Working Status Set
 空调快速升温工作状态设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:On <br>
         0x2:Off <br>
         0x3:Not_Used <p>
     */
        public static final int ICC_ACFASTHEAT_4DE = 557848075;

    /**
     * ICC_SETCLMON_4DE <p>
     * <br>
     * Function Describe: Set CLM On 
 DVD设置空调开启 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:On <br>
         0x2:Off <br>
         0x3:Not_Used <p>
     */
        public static final int ICC_SETCLMON_4DE = 557848076;

    /**
     * ICC_SETAUTOKEYSTS_4DE <p>
     * <br>
     * Function Describe: Set Auto Status
 DVD设置开启空调自动模式 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:On <br>
         0x2:Off <br>
         0x3:Not_Used <p>
     */
        public static final int ICC_SETAUTOKEYSTS_4DE = 557848077;

    /**
     * ICC_SETFRONTDEFORESTSTS_4DE <p>
     * <br>
     * Function Describe: Set Front Deforest Status
 DVD设置最大前除霜开启 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:On <br>
         0x2:Off <br>
         0x3:Not_used <p>
     */
        public static final int ICC_SETFRONTDEFORESTSTS_4DE = 557848078;

    /**
     * ICC_SETCIRCULATIONMODEKEYSTS_4DE <p>
     * <br>
     * Function Describe: Set Circulation Mode Key Status
 DVD设置内外循环切换 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Recirculation_mode <br>
         0x2:Air_circulation_mode <br>
         0x3:Two-Layer_Flow_Mode <p>
     */
        public static final int ICC_SETCIRCULATIONMODEKEYSTS_4DE = 557848079;

    /**
     * ICC_AUTOAIRCLEAN_4DE <p>
     * <br>
     * Function Describe: Auto Air Clean Set
 上报座舱自动清洁设置项状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_active <br>
         0x1:On <br>
         0x2:Off <br>
         0x3:Not_Used <p>
     */
        public static final int ICC_AUTOAIRCLEAN_4DE = 557848083;

    /**
     * ICC_BLOWSPEEDLEVELKEYSTS_4DE <p>
     * <br>
     * Function Describe: Blower Speed Level Key Status
 鼓风机档位设置
 在IHU上直接设置也通过此信号实现
 电动IPM收，自动IPM不收 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_active <br>
         0x1:Level_1 <br>
         0x2:Level_2 <br>
         0x3:Level_3 <br>
         0x4:Level_4 <br>
         0x5:Level_5 <br>
         0x6:Level_6 <br>
         0x7:Level_7 <br>
         0x8:Level_8 <br>
         0x9:Level_9 <br>
         0xA:Level_10 <br>
         0xB:Reserved <br>
         0xC:Level_0 <br>
         0xD~0xF:Reserved <p>
     */
        public static final int ICC_BLOWSPEEDLEVELKEYSTS_4DE = 557848085;

    /**
     * ICC_SETACREQUESTKEYSTS_4DE <p>
     * <br>
     * Function Describe: Set AC Request Status
 DVD设置AC请求开启 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3~0x4:Not_used <p>
     */
        public static final int ICC_SETACREQUESTKEYSTS_4DE = 557848086;

    /**
     * ICC_SETTEMPERATURE_L_C_4DE <p>
     * <br>
     * Function Describe: 在单区模式下，调节左旋钮可以同时设定左右两边的温度设定。在双区模式下，左旋钮设定左区温度，右旋钮设定右区温度。
 IHU未收到设定温值时，以及收到设定温值为startup 或default对应的1F时，IHU屏幕上温度显示区域均显示空白。
 在IHU上直接设置也通过此信号实现 
 电动空调配置时此信号预留不发
 温度范围15.5-30.5℃
 温度调节每次0.5℃
 参数改变 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x1F:Not_active <p>
     */
        public static final int ICC_SETTEMPERATURE_L_C_4DE = 557848089;

    /**
     * ICC_1_OTASTS_4E2 <p>
     * <br>
     * Function Describe: OTA status（拆帧为40B） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Normal_Status <br>
         0x1:OTA_Status <br>
         0x2~0x3:Reserved <p>
     */
        public static final int ICC_1_OTASTS_4E2 = 557848114;

    /**
     * ICC_1_OTAHV_REQ_4E2 <p>
     * <br>
     * Function Describe: OTA high voltage power down request <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_active <br>
         0x1:HVON <br>
         0x2:HVOFF <br>
         0x3:Reserved <p>
     */
        public static final int ICC_1_OTAHV_REQ_4E2 = 557848115;

    /**
     * ICC_1_OTAPWRMNGT_4E2 <p>
     * <br>
     * Function Describe: Power Management <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:No_Request <br>
         0x1:Power_Off <br>
         0x2:Power_On <br>
         0x3:Continuous_ON <br>
         0x4~0x7:Reserved <p>
     */
        public static final int ICC_1_OTAPWRMNGT_4E2 = 557848116;

    /**
     * ICC_STEERINGMODE_4E2 <p>
     * <br>
     * Function Describe: 个性化-转向模式设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Normal <br>
         0x2:Sport <br>
         0x3:Light <p>
     */
        public static final int ICC_STEERINGMODE_4E2 = 557848117;

    /**
     * ICC_AIRCONDITIONMODE_4E2 <p>
     * <br>
     * Function Describe: 个性化-空调模式设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:ECO <br>
         0x2:Comfortable <br>
         0x3:Strong <p>
     */
        public static final int ICC_AIRCONDITIONMODE_4E2 = 557848120;

    /**
     * ICC_SELFCLEARING_4E2 <p>
     * <br>
     * Function Describe: 能耗分布自清零指令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_active <br>
         0x1:Enable <p>
     */
        public static final int ICC_SELFCLEARING_4E2 = 557848123;

    /**
     * ICC_PETMODEHV_REQ_4E2 <p>
     * <br>
     * Function Describe: 宠物模式高压请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:HVON <br>
         0x2:HVOFF <br>
         0x3:Reserved <p>
     */
        public static final int ICC_PETMODEHV_REQ_4E2 = 557848124;

    /**
     * ICC_BRAKEPEDALFEELMODE_4E2 <p>
     * <br>
     * Function Describe: 个性化-制动踏板感觉设置
 0x3:越野模式 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:Comfortable <br>
         0x2:Sport <br>
         0x3:Offroad <p>
     */
        public static final int ICC_BRAKEPEDALFEELMODE_4E2 = 557848126;

    /**
     * ICC_WELCOMEOPENSET_4E6 <p>
     * <br>
     * Function Describe: 迎宾灯开启设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:On <br>
         0x2:Off <br>
         0x3:Not Used <p>
     */
        public static final int ICC_WELCOMEOPENSET_4E6 = 557848134;

    /**
     * ICC_WALOPENSET_4E6 <p>
     * <br>
     * Function Describe: 远离闭锁开关设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:On <br>
         0x2:Off <br>
         0x3:Not Used <p>
     */
        public static final int ICC_WALOPENSET_4E6 = 557848135;

    /**
     * ICC_UIROPENSET_4E6 <p>
     * <br>
     * Function Describe: 靠近解锁开关设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:On <br>
         0x2:Off <br>
         0x3:Not Used <p>
     */
        public static final int ICC_UIROPENSET_4E6 = 557848137;

    /**
     * ICC_CWCWORKINGSTSSET_4E6 <p>
     * <br>
     * Function Describe: 通过DVD软按键控制无线充电器工作模式
 0x0：不动作
 0x1: 无线充电器关闭
 0x2: 无线充电器打开
 0x3：无效
 CWC收到DVD的0x0、0x3时保持CWC当前开关状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not active <br>
         0x1:OFF <br>
         0x2:ON <br>
         0x3:Invalid <p>
     */
        public static final int ICC_CWCWORKINGSTSSET_4E6 = 557848139;

    /**
     * ICC_CWCPHONEFORGOTTENFUNSTSSET_4E6 <p>
     * <br>
     * Function Describe: 通过DVD软按键控制无线充电器手机遗忘提醒功能的开关
 0x0：不动作
 0x1: 手机遗忘提醒功能关闭
 0x2: 手机遗忘提醒功能打开
 0x3：无效
 CWC收到DVD的0x0、0x3时保持CWC当前手机遗忘提醒功能开关状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not active <br>
         0x1:OFF <br>
         0x2:ON <br>
         0x3:Invalid <p>
     */
        public static final int ICC_CWCPHONEFORGOTTENFUNSTSSET_4E6 = 557848140;

    /**
     * ICC_PWROFF_4F1 <p>
     * <br>
     * Function Describe: 车辆下电 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:No active <br>
         0x1:Active <p>
     */
        public static final int ICC_PWROFF_4F1 = 557848143;

    /**
     * ICC_ETMEGYSAVE_4F1 <p>
     * <br>
     * Function Describe: 极致节能模式 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:OFF <br>
         0x1:ON <p>
     */
        public static final int ICC_ETMEGYSAVE_4F1 = 557848144;

    /**
     * ICC_HOODSW_4F1 <p>
     * <br>
     * Function Describe: 前舱盖开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:ON <br>
         0x2~0x3:Reserved <p>
     */
        public static final int ICC_HOODSW_4F1 = 557848145;

    /**
     * ICC_REWINDEFRSTSWT_4F1 <p>
     * <br>
     * Function Describe: Rear window defrost后风窗加热 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:Reserved <p>
     */
        public static final int ICC_REWINDEFRSTSWT_4F1 = 557848148;

    /**
     * ICC_REARMIRRORFOLDCMD_4F1 <p>
     * <br>
     * Function Describe: 后视镜手动折叠开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:Fold <br>
         0x2:Unfold <br>
         0x3:Reserved <p>
     */
        public static final int ICC_REARMIRRORFOLDCMD_4F1 = 557848149;

    /**
     * ICC_CENTERLOCKSWT_4F1 <p>
     * <br>
     * Function Describe: CenterLock中控锁开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:UNLOCK <br>
         0x2:LOCK <br>
         0x3:Reserved <p>
     */
        public static final int ICC_CENTERLOCKSWT_4F1 = 557848150;

    /**
     * ICC_REVERSEEXTMIRRORSTS_4F1 <p>
     * <br>
     * Function Describe: DVD设置倒车外后视镜下翻功能开启 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not active <br>
         0x1:OFF <br>
         0x2:Only right side <br>
         0x3:Only left side <br>
         0x4:Both sides <br>
         0x5~0x7:Not Used <p>
     */
        public static final int ICC_REVERSEEXTMIRRORSTS_4F1 = 557848151;

    /**
     * ICC_LIGHTMAINSWITCHSTS_4F1 <p>
     * <br>
     * Function Describe: 小灯、近光、Auto开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not active <br>
         0x1:Off <br>
         0x2:Auto <br>
         0x3:PositionLampSwitch <br>
         0x4:LowBeamSwitch <br>
         0x5~0x7:Reserved <p>
     */
        public static final int ICC_LIGHTMAINSWITCHSTS_4F1 = 557848152;

    /**
     * ICC_AUTOFOLDSTS_4F1 <p>
     * <br>
     * Function Describe: 后视镜自动折叠 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not active <br>
         0x1:Autofold mode <br>
         0x2:Not autofold mode <br>
         0x3:Not used <p>
     */
        public static final int ICC_AUTOFOLDSTS_4F1 = 557848153;

    /**
     * ICC_HEADLAMPHEIGHTSTS_4F1 <p>
     * <br>
     * Function Describe: 大灯高度调节设置信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not active <br>
         0x1:Level 0 <br>
         0x2:Level 1 <br>
         0x3:Level 2 <br>
         0x4:Level 3 <br>
         0x5~0x7:Not Used <p>
     */
        public static final int ICC_HEADLAMPHEIGHTSTS_4F1 = 557848154;

    /**
     * ICC_WIPRSNVTY_4F1 <p>
     * <br>
     * Function Describe: WiperSensitivity雨刮灵敏度 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:Level1 <br>
         0x2:Level2 <br>
         0x3:Level3 <br>
         0x4:Level4 <br>
         0x5~0x6:Reserved <p>
     */
        public static final int ICC_WIPRSNVTY_4F1 = 557848155;

    /**
     * ICC_WINDOWCMD_4F1 <p>
     * <br>
     * Function Describe: 语音控制车窗指令：
 1、包含对左前车窗、右前车窗、左后车窗、右后车窗、前排车窗、后排车窗、全部车窗的指令控制；
 2、具备open（打开）、close（关闭）、comfort（通风）三种动作指令，目前只有同时控制四个车窗时有comfort指令。
 3、没有此功能，其他信号触发此帧报文发送时，此信号发“Not active”； <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not active <br>
         0x1:FLWindow open <br>
         0x2:FLWindow close <br>
         0x3:FRWindow open <br>
         0x4:FRWindow close <br>
         0x5:RLWindow open <br>
         0x6:RLWindow close <br>
         0x7:RRWindow open <br>
         0x8:RRWindow close <br>
         0x9:Front Windows open <br>
         0xA:Front Windows close <br>
         0xB:Rear Windows open <br>
         0xC:Rear Windows close <br>
         0xD:All Windows open <br>
         0xE:All Windows close <br>
         0xF:All Windows comfort <br>
         0x10~0x1F:Not used <p>
     */
        public static final int ICC_WINDOWCMD_4F1 = 557848156;

    /**
     * ICC_LOWBEAMDELAYOFF_4F1 <p>
     * <br>
     * Function Describe: 大灯延迟关闭开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:0s <br>
         0x2:10s <br>
         0x3:20s <br>
         0x4:30s <br>
         0x5:60s <br>
         0x6~0x7:Not Used <p>
     */
        public static final int ICC_LOWBEAMDELAYOFF_4F1 = 557848157;

    /**
     * ICC_AUTOLOCKSTS_4F1 <p>
     * <br>
     * Function Describe: 设置自动落锁模式 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not active <br>
         0x1:Autolock mode <br>
         0x2:Not autolock mode <br>
         0x3:Not Used <p>
     */
        public static final int ICC_AUTOLOCKSTS_4F1 = 557848163;

    /**
     * ICC_LOCKSETSWITCHSTS_4F1 <p>
     * <br>
     * Function Describe: 解闭锁设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:OFF <br>
         0x2:Only Lighting <br>
         0x3:Sound and Lighting <p>
     */
        public static final int ICC_LOCKSETSWITCHSTS_4F1 = 557848166;

    /**
     * ICC_PARKUNLOCKENABLE_4F1 <p>
     * <br>
     * Function Describe: 驻车解锁设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:Disable <br>
         0x2:Enable <br>
         0x3:Reserved <p>
     */
        public static final int ICC_PARKUNLOCKENABLE_4F1 = 557848168;

    /**
     * ICC_STEERWHLHEATGSWT_4F1 <p>
     * <br>
     * Function Describe: Steering Wheel heating方向盘加热 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:Level1 <br>
         0x2:Level2 <br>
         0x3:Level3 <br>
         0x4:OFF <p>
     */
        public static final int ICC_STEERWHLHEATGSWT_4F1 = 557848171;

    /**
     * ICC_FRONTFOGSW_4F1 <p>
     * <br>
     * Function Describe: 屏内前雾灯开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:Reserved <p>
     */
        public static final int ICC_FRONTFOGSW_4F1 = 557848173;

    /**
     * ICC_REARFOGSW_4F1 <p>
     * <br>
     * Function Describe: 屏内后雾灯开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:Reserved <p>
     */
        public static final int ICC_REARFOGSW_4F1 = 557848174;

    /**
     * ICC_DOORCONTROLSW_4F1 <p>
     * <br>
     * Function Describe: 顶灯门控开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:Reserved <p>
     */
        public static final int ICC_DOORCONTROLSW_4F1 = 557848175;

    /**
     * ICC_LOCKCARWINCLOSESW_4F1 <p>
     * <br>
     * Function Describe: 锁车自动升窗开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:Reserved <p>
     */
        public static final int ICC_LOCKCARWINCLOSESW_4F1 = 557848176;

    /**
     * ICC_NAPSTATUSSET_4F1 <p>
     * <br>
     * Function Describe: 小憩模式开关设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:Not Used <p>
     */
        public static final int ICC_NAPSTATUSSET_4F1 = 557848177;

    /**
     * ICC_NAPAREASET_4F1 <p>
     * <br>
     * Function Describe: 小憩模式开启区域设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:Front Left <br>
         0x2:Front Right <br>
         0x3:Front Left and Right <p>
     */
        public static final int ICC_NAPAREASET_4F1 = 557848178;

    /**
     * ICC_EASYENTRYEXITSET_4F1 <p>
     * <br>
     * Function Describe: 便捷进入\离车 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:Not Used <p>
     */
        public static final int ICC_EASYENTRYEXITSET_4F1 = 557848179;

    /**
     * ICC_NAPCFSSTATUSSET_4F1 <p>
     * <br>
     * Function Describe: 小憩模式香氛系统开关设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:On <br>
         0x2:Off <br>
         0x3:Not Used <p>
     */
        public static final int ICC_NAPCFSSTATUSSET_4F1 = 557848183;

    /**
     * RRCR_1_SYSST_4F3 <p>
     * <br>
     * Function Describe: System self-test State <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Off <br>
         0x1:On <br>
         0x2:Temporary Error <br>
         0x3:System Error <p>
     */
        public static final int RRCR_1_SYSST_4F3 = 557848192;

    /**
     * RRCR_1_BSDWARN_4F3 <p>
     * <br>
     * Function Describe: BSD/LCA Warning <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:No Warning <br>
         0x1:Standard Warning <br>
         0x2:Critical Warning <br>
         0x3:Not Used <p>
     */
        public static final int RRCR_1_BSDWARN_4F3 = 557848194;

    /**
     * FACEID_4F9 <p>
     * <br>
     * Function Describe: 人脸ID <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not active <br>
         0x1:ID1 <br>
         0x2:ID2 <br>
         0x3:ID3 <br>
         0x4:ID4 <br>
         0x5:ID5 <br>
         0x6~0x7:Not Used <p>
     */
        public static final int FACEID_4F9 = 557848214;

    /**
     * SEAT_EXTMIRROR_POSRECALL_ID_4F9 <p>
     * <br>
     * Function Describe: 主驾座椅位置调出请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not active <br>
         0x1:seat_ExtMirror_Pos1_Recall_ID1 <br>
         0x2:seat_ExtMirror_Pos2_Recall_ID1 <br>
         0x3:seat_ExtMirror_Pos3_Recall_ID1 <br>
         0x4:seat_ExtMirror_Pos1_Recall_ID2 <br>
         0x5:seat_ExtMirror_Pos2_Recall_ID2 <br>
         0x6:seat_ExtMirror_Pos3_Recall_ID2 <br>
         0x7:seat_ExtMirror_Pos1_Recall_ID3 <br>
         0x8:seat_ExtMirror_Pos2_Recall_ID3 <br>
         0x9:seat_ExtMirror_Pos3_Recall_ID3 <br>
         0xA:seat_ExtMirror_Pos1_Recall_ID4 <br>
         0xB:seat_ExtMirror_Pos2_Recall_ID4 <br>
         0xC:seat_ExtMirror_Pos3_Recall_ID4 <br>
         0xD:seat_ExtMirror_Pos1_Recall_ID5 <br>
         0xE:seat_ExtMirror_Pos2_Recall_ID5 <br>
         0xF:seat_ExtMirror_Pos3_Recall_ID5 <br>
         0x11:seat_ExtMirror_Pos1_Recall_NOID <br>
         0x12:seat_ExtMirror_Pos2_Recall_NOID <br>
         0x13:seat_ExtMirror_Pos3_Recall_NOID <p>
     */
        public static final int SEAT_EXTMIRROR_POSRECALL_ID_4F9 = 557848215;

    /**
     * SEAT_EXTMIRROR_POSSTOREREQ_ID_4F9 <p>
     * <br>
     * Function Describe: 主驾座椅位置记忆请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not active <br>
         0x1:seat_ExtMirror_Pos1_StoreReq_ID1 <br>
         0x2:seat_ExtMirror_Pos2_StoreReq_ID1 <br>
         0x3:seat_ExtMirror_Pos3_StoreReq_ID1 <br>
         0x4:seat_ExtMirror_Pos1_StoreReq_ID2 <br>
         0x5:seat_ExtMirror_Pos2_StoreReq_ID2 <br>
         0x6:seat_ExtMirror_Pos3_StoreReq_ID2 <br>
         0x7:seat_ExtMirror_Pos1_StoreReq_ID3 <br>
         0x8:seat_ExtMirror_Pos2_StoreReq_ID3 <br>
         0x9:seat_ExtMirror_Pos3_StoreReq_ID3 <br>
         0xA:seat_ExtMirror_Pos1_StoreReq_ID4 <br>
         0xB:seat_ExtMirror_Pos2_StoreReq_ID4 <br>
         0xC:seat_ExtMirror_Pos3_StoreReq_ID4 <br>
         0xD:seat_ExtMirror_Pos1_StoreReq_ID5 <br>
         0xE:seat_ExtMirror_Pos2_StoreReq_ID5 <br>
         0xF:seat_ExtMirror_Pos3_StoreReq_ID5 <br>
         0x11:seat_ExtMirror_Pos1_StoreReq_NOID <br>
         0x12:seat_ExtMirror_Pos2_StoreReq_NOID <br>
         0x13:seat_ExtMirror_Pos3_StoreReq_NOID <p>
     */
        public static final int SEAT_EXTMIRROR_POSSTOREREQ_ID_4F9 = 557848216;

    /**
     * BMS_HVBATTLOWSOC_50A <p>
     * <br>
     * Function Describe: SOC过低
 （默认发0检测到SOC过低时发1) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Normal <br>
         0x1:Failure <p>
     */
        public static final int BMS_HVBATTLOWSOC_50A = 557848262;

    /**
     * BMS_TBOXINSULATION_R_50B <p>
     * <br>
     * Function Describe: insulation resistance <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int BMS_TBOXINSULATION_R_50B = 557848271;

    /**
     * BMS_TBOXHVBATTMAXT_50B <p>
     * <br>
     * Function Describe: battery max temperature <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0xFE:Abnormal <br>
         0xFF:Invalid <p>
     */
        public static final int BMS_TBOXHVBATTMAXT_50B = 557848273;

    /**
     * BMS_TBOXHVBATTMINT_50B <p>
     * <br>
     * Function Describe: battery min temperature <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0xFE:Abnormal <br>
         0xFF:Invalid <p>
     */
        public static final int BMS_TBOXHVBATTMINT_50B = 557848274;

    /**
     * BMS_SOCLIGHT_50B <p>
     * <br>
     * Function Describe: BMS SOCLight
 SOC电量显示（仪表显示） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x7F:Invalid <p>
     */
        public static final int BMS_SOCLIGHT_50B = 557848275;

    /**
     * BMS_BATTFAULTLAMPSTS_50F <p>
     * <br>
     * Function Describe: 高压电池故障灯显示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Lamp OFF <br>
         0x1:Lamp ON <p>
     */
        public static final int BMS_BATTFAULTLAMPSTS_50F = 557848287;

    /**
     * BMS_OVERTEMP_LIGHTSTS_50F <p>
     * <br>
     * Function Describe: BMS_OverTemp_LightSts <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Lamp OFF <br>
         0x1:Lamp ON <p>
     */
        public static final int BMS_OVERTEMP_LIGHTSTS_50F = 557848288;

    /**
     * BMS_REMAINCHG_TIME_50F <p>
     * <br>
     * Function Describe: BMS_RemainChg_Time <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int BMS_REMAINCHG_TIME_50F = 557848289;

    /**
     * BMS_THERMALRUNAWAYDIS_50F <p>
     * <br>
     * Function Describe: Thermal run-away <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:no thermalrunaway <br>
         0x1:thermalrunaway occur <p>
     */
        public static final int BMS_THERMALRUNAWAYDIS_50F = 557848290;

    /**
     * BMS_TBOXISOLATIONFAULT_50F <p>
     * <br>
     * Function Describe: battery insulation fault state <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:no fault <br>
         0x1:Fault L1 <br>
         0x2:Fault L2 <br>
         0x3:Fault L3 <p>
     */
        public static final int BMS_TBOXISOLATIONFAULT_50F = 557848291;

    /**
     * BMS_PREWARMDIS_50F <p>
     * <br>
     * Function Describe: preheat and keepwarm indication <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:none <br>
         0x1:preheat state <br>
         0x2:keepwarm state <p>
     */
        public static final int BMS_PREWARMDIS_50F = 557848292;

    /**
     * BMS_PACKVOLTAGEDIS_513 <p>
     * <br>
     * Function Describe: Battery Voltage <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0xFFFE:Abnormal <br>
         0xFFFF:Invalid <p>
     */
        public static final int BMS_PACKVOLTAGEDIS_513 = 557848299;

    /**
     * BMS_PACKCURRENTDIS_513 <p>
     * <br>
     * Function Describe: Baattery Current(direction:discharge+ charge -) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0xFFFE:Abnormal <br>
         0xFFFF:Invalid <p>
     */
        public static final int BMS_PACKCURRENTDIS_513 = 557848300;

    /**
     * HCU_V2LDISCHGBCK_522 <p>
     * <br>
     * Function Describe: V2L外放电开关反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:V2L_ON <br>
         0x2:OFF <p>
     */
        public static final int HCU_V2LDISCHGBCK_522 = 557848352;

    /**
     * HCU_DISCHGMEMFED_522 <p>
     * <br>
     * Function Describe: V2L外放电记忆开关反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Remember <br>
         0x2:No_Remember <br>
         0x3:Reserved <p>
     */
        public static final int HCU_DISCHGMEMFED_522 = 557848353;

    /**
     * HCU_V2L_INTLDISCHGBCK_522 <p>
     * <br>
     * Function Describe: V2L内放电开关反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:V2L_ON <br>
         0x2:OFF <p>
     */
        public static final int HCU_V2L_INTLDISCHGBCK_522 = 557848355;

    /**
     * HCU_HVDOWNREPAIRMODEFED_522 <p>
     * <br>
     * Function Describe: 断高压维修模式开关反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:Invalid <p>
     */
        public static final int HCU_HVDOWNREPAIRMODEFED_522 = 557848359;

    /**
     * HCU_TRAILERMODE_522 <p>
     * <br>
     * Function Describe: 被拖模式开关反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:Invalid <p>
     */
        public static final int HCU_TRAILERMODE_522 = 557848360;

    /**
     * HCU_KEYDRIVEMODEMEMORY_522 <p>
     * <br>
     * Function Describe: 驾驶模式记忆开关反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Remember <br>
         0x2:No_Remember <p>
     */
        public static final int HCU_KEYDRIVEMODEMEMORY_522 = 557848362;

    /**
     * HCU_DRIVEPOWERDISPSETFED_522 <p>
     * <br>
     * Function Describe: 驱动系统功率显示方式开关反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:PercentDisp <br>
         0x2:kWDisp <p>
     */
        public static final int HCU_DRIVEPOWERDISPSETFED_522 = 557848363;

    /**
     * HCU_TABSWTFED_522H_522 <p>
     * <br>
     * Function Describe: ICC坦克转向开关反馈
 0x0:Not_Active 使能位
 0x1:Active 激活
 0x2:Stand_by 就绪
 0x3:Failed 失败 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Active <br>
         0x2:Stand_by <br>
         0x3:Failed <p>
     */
        public static final int HCU_TABSWTFED_522H_522 = 557848364;

    /**
     * HCU_4LMODEFED_522 <p>
     * <br>
     * Function Describe: 低速四驱开关反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Active <p>
     */
        public static final int HCU_4LMODEFED_522 = 557848366;

    /**
     * HCU_STOPCHRGNMODEFED_522 <p>
     * <br>
     * Function Describe: 驻车发电模式开关反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Silence <br>
         0x2:Quick <p>
     */
        public static final int HCU_STOPCHRGNMODEFED_522 = 557848374;

    /**
     * HCU_CLIMBFED_522 <p>
     * <br>
     * Function Describe: 防溜设置开关反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:Invalid <p>
     */
        public static final int HCU_CLIMBFED_522 = 557848376;

    /**
     * HCU_PARKINGCHARGEREMINDER_522 <p>
     * <br>
     * Function Describe: 仪表文字提示“请先驻车再充电” <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Active <p>
     */
        public static final int HCU_PARKINGCHARGEREMINDER_522 = 557848379;

    /**
     * HCU_POWERCUT_522 <p>
     * <br>
     * Function Describe: 仪表文字提示“动力即将切断，请靠边停车” <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Active <p>
     */
        public static final int HCU_POWERCUT_522 = 557848380;

    /**
     * HCU_IMMORELEASESIGNAL_522 <p>
     * <br>
     * Function Describe: 防盗报警指示灯信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Active <p>
     */
        public static final int HCU_IMMORELEASESIGNAL_522 = 557848381;

    /**
     * HCU_LVPOWSUPSYSABN_LIT_522 <p>
     * <br>
     * Function Describe: 低压供电系统异常状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Active <p>
     */
        public static final int HCU_LVPOWSUPSYSABN_LIT_522 = 557848382;

    /**
     * HCU_POWERMODECHANGEINHIBIT_522 <p>
     * <br>
     * Function Describe: 仪表文字提示“为保障越野性能，模式无法切换” <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Active <p>
     */
        public static final int HCU_POWERMODECHANGEINHIBIT_522 = 557848384;

    /**
     * HCU_DISCONNECTCHAGWARN_522 <p>
     * <br>
     * Function Describe: 仪表文字提示“请拔下充电枪” <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Active <p>
     */
        public static final int HCU_DISCONNECTCHAGWARN_522 = 557848385;

    /**
     * HCU_VEHICLESPEEDMAX_LIMIT_522 <p>
     * <br>
     * Function Describe: 仪表文字提示“最高车速受限，请尽快联系售后检修” <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Active <p>
     */
        public static final int HCU_VEHICLESPEEDMAX_LIMIT_522 = 557848387;

    /**
     * HCU_ACCLEABILITY_LIMIT_522 <p>
     * <br>
     * Function Describe: 仪表文字提示“加速性能受限，请尽快联系售后检修” <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Active <p>
     */
        public static final int HCU_ACCLEABILITY_LIMIT_522 = 557848388;

    /**
     * HCU_DRIVEINHIBIT_GEARP_522 <p>
     * <br>
     * Function Describe: 仪表文字提示“动力受限，进入P挡后无法再次行驶，请尽快联系售后检修” <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Active <p>
     */
        public static final int HCU_DRIVEINHIBIT_GEARP_522 = 557848389;

    /**
     * HCU_SETMODENOTCHANGE_522 <p>
     * <br>
     * Function Describe: 仪表文字提示“模式禁止切换” <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Active <p>
     */
        public static final int HCU_SETMODENOTCHANGE_522 = 557848390;

    /**
     * HCU_TOWINGMODEENA_522 <p>
     * <br>
     * Function Describe: 大屏被拖提醒文字提示ICC接收
 0x1时，大屏文字提示“切换至被拖模式需满足以下条件：1、挡位处于P挡；2、踩下刹车；3、车辆不在充电状态” <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:No Prompt <br>
         0x1:Prompt <p>
     */
        public static final int HCU_TOWINGMODEENA_522 = 557848393;

    /**
     * HCU_DEDICATEDMODEINHIBIT_522 <p>
     * <br>
     * Function Describe: 仪表文字提示“当前模式不可用，请切换至越野模式” <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Active <p>
     */
        public static final int HCU_DEDICATEDMODEINHIBIT_522 = 557848395;

    /**
     * HCU_DISCHARGESTOPFAULT_522 <p>
     * <br>
     * Function Describe: 0x1时仪表文字提示“电池电量过低，放电停止”0x2时仪表文字提示“燃油不足，放电停止” <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Init <br>
         0x1:LowSOC <br>
         0x2:LowFuel <p>
     */
        public static final int HCU_DISCHARGESTOPFAULT_522 = 557848396;

    /**
     * HCU_REAREDLSTS_522 <p>
     * <br>
     * Function Describe: 后差速锁状态
 0x0:不锁
 0x1:解锁
 0x2:锁止
 0x3:切换提醒
 0x4:不满足锁止条件
 0x5:差速锁无法锁止故障
 0x6:差速锁无法解锁故障 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:No Lock <br>
         0x1:UNLock <br>
         0x2:Lock <br>
         0x3:Warning <br>
         0x4:UnAvailable <br>
         0x5:Stuck_Open <br>
         0x6:Stuck_Close <br>
         0x7~0x9:Reserved <p>
     */
        public static final int HCU_REAREDLSTS_522 = 557848397;

    /**
     * HCU_FRNTEDLSTS_522 <p>
     * <br>
     * Function Describe: 前差速锁状态
 0x0: 不锁
 0x1: 解锁
 0x2：锁止
 0x3：切换提醒
 0x4：不满足锁止条件
 0x5：差速锁无法锁止故障
 0x6：差速锁无法解锁故障
 0x7：提示需挂入后锁和4L
 0x8：提示开启后锁
 0x9：提示开启4L <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:No Lock <br>
         0x1:UNLock <br>
         0x2:Lock <br>
         0x3:Warning <br>
         0x4:UnAvailable <br>
         0x5:Stuck Open <br>
         0x6:Stuck Close <br>
         0x7:Rear4LReq <br>
         0x8:RearReq <br>
         0x9:4LReq <p>
     */
        public static final int HCU_FRNTEDLSTS_522 = 557848398;

    /**
     * HCU_DRIVEMODE_JT_522 <p>
     * <br>
     * Function Describe: 驾驶模式反馈
 0x0:经济
 0x1:标准
 0x2:运动
 0x3:雪/草地
 0x4:泥地
 0x5:越野
 0x6:沙地
 0x7:岩石
 0x8:专家
 0x9:智能
 0xA:涉水
 0xB:极限掉头
 0xC:漂移
 0xD:拖挂
 0xE:越野竞速
 0xF:晕车舒缓
 0x10:智慧能量管理
 0x11~0x1F：预留 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:ECO <br>
         0x1:NORMAL <br>
         0x2:SPORT <br>
         0x3:SNOW <br>
         0x4:MUD <br>
         0x5:OffRoad <br>
         0x6:SAND <br>
         0x7:ROCK <br>
         0x8:EXPERT <br>
         0x9:X <br>
         0xA:WADE <br>
         0xB:UTURN <br>
         0xC:DRIFT <br>
         0xD:TOW <br>
         0xE:OffroadRace <br>
         0xF:Carsickness <br>
         0x10:CleverEngy <p>
     */
        public static final int HCU_DRIVEMODE_JT_522 = 557848399;

    /**
     * HCU_SOCMANAGEFED_522 <p>
     * <br>
     * Function Describe: Soc_Manage_Feedback <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Default <br>
         0x1:Pure_electricity_priority_mode <br>
         0x2:Fuel_priority_mode <br>
         0x3:SOC_hold_mode <br>
         0x4:SAVE <br>
         0x5:Charge <p>
     */
        public static final int HCU_SOCMANAGEFED_522 = 557848400;

    /**
     * HCU_CCOSWTFED_522 <p>
     * <br>
     * Function Describe: 越野蠕行开关反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Active <br>
         0x2:Stand_by <br>
         0x3:Failed <p>
     */
        public static final int HCU_CCOSWTFED_522 = 557848402;

    /**
     * HCU_DRVGEARSHIFTFAILUREINDCN_522 <p>
     * <br>
     * Function Describe:  <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:No_Command <br>
         0x1:brake_pedal_applied <br>
         0x2:Over_Speed <br>
         0x3:Charge_Gun_Connect <br>
         0x4:EPB_Can_Not_Lock <br>
         0x5:EPB_Can_Not_Release <br>
         0x6:Invalid_shift <br>
         0x7:Shift_fault <br>
         0x8:BrkPedl_to_start <br>
         0x9:OpenDoor_Shift <p>
     */
        public static final int HCU_DRVGEARSHIFTFAILUREINDCN_522 = 557848404;

    /**
     * HCU_EGYREGENLEVEL_522 <p>
     * <br>
     * Function Describe: power_regeneration_level <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Off <br>
         0x1:Low <br>
         0x2:High <br>
         0x3:middle <br>
         0x4:SinglePedl <p>
     */
        public static final int HCU_EGYREGENLEVEL_522 = 557848409;

    /**
     * HCU_ICCO_WARN_522 <p>
     * <br>
     * Function Describe: 0x0: 无提示
 0x1:请释放EPB
 0x2:当前车速过高，请减速
 0x3:请关好车门，系好安全带
 0x4:请切换至D档或N档开启越野蠕行
 0x5:请关闭 APA/ACC/CC巡航
 0x6:请退出HDC陡坡缓降/自动驻车
 0x7:请手动切换驾驶模式至雪地或泥地或沙地或岩石
 0x8:请踩制动踏板
 0x9:iCCO越野蠕行已退出 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:No_Warn <br>
         0x1:Please_Release_EPB <br>
         0x2:Please_slow_down <br>
         0x3:Please_Close_ Door and Belt <br>
         0x4:Please_Open in D or N <br>
         0x5:Please_Close_APA/ACC/CC <br>
         0x6:Please_Exit_HDC/AVH <br>
         0x7:Please_Switch to Snow/Mud/Sand/Rock <br>
         0x8:Please Depress the brake pedal <br>
         0x9:iCCO Exited <br>
         0xA~0xF:Reserved <p>
     */
        public static final int HCU_ICCO_WARN_522 = 557848413;

    /**
     * HCU_DRIVEMODECHANGEFAIL_522 <p>
     * <br>
     * Function Describe: 驾驶模式切换不满足条件，提示“请停车后退出当前驾驶模式” <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:NOT FAIL <br>
         0x1:FAIL <p>
     */
        public static final int HCU_DRIVEMODECHANGEFAIL_522 = 557848414;

    /**
     * HCU_ENGYFLOWTODISP_522 <p>
     * <br>
     * Function Describe: 0x0:初始化
 0x1:无能量流状态
 0x2:发动机单独运行
 0x3:纯电前驱
 0x4:纯电前驱回馈
 0x5:纯电后驱
 0x6:纯电后驱回馈
 0x7:纯电四驱
 0x8:纯电四驱回馈
 0x9:串联前驱电池充电
 0xA:串联前驱电池放电
 0xB:串联前驱电池无电流
 0xC:串联前驱回馈
 0xD:串联后驱电池充电
 0xE:串联后驱电池放电
 0xF:串联后驱电池无电流
 0x10:串联后驱回馈
 0x11:串联四驱电池充电
 0x12:串联四驱电池放电
 0x13:串联四驱电池无电流
 0x14:串联四驱回馈
 0x15:并联前驱电池充电
 0x16:并联前驱电池放电
 0x17:并联前驱电池无电流
 0x18:并联前驱回馈
 0x19:并联四驱电池充电
 0x1A:并联四驱电池放电
 0x1B:并联四驱电池无电流
 0x1C:并联四驱回馈
 0x1D:原地发电电池充电
 0x1E:原地发电电池放电
 0x1F:原地发电电池无电流 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Init <br>
         0x1:No_EngyFlow <br>
         0x2:Engine Idling <br>
         0x3:EV_FWD <br>
         0x4:EV_FWD_Regene <br>
         0x5:EV_RWD <br>
         0x6:EV_RWD_Regene <br>
         0x7:EV_4WD <br>
         0x8:EV_4WD_Regene <br>
         0x9:Series_FWD_BattChg <br>
         0xA:Series_FWD_BattDisChg <br>
         0xB:Series_FWD_BattNoCurr <br>
         0xC:Series_FWD_Regene <br>
         0xD:Series_RWD_BattChg <br>
         0xE:Series_RWD_BattDisChg <br>
         0xF:Series_RWD_BattNoCurr <br>
         0x10:Series_RWD_Regene <br>
         0x11:Series_4WD_BattChg <br>
         0x12:Series_4WD_BattDisChg <br>
         0x13:Series_4WD_BattNoCurr <br>
         0x14:Series_4WD_Regene <br>
         0x15:Parallel_FWD_BattChg <br>
         0x16:Parallel_FWD_BattDisChg <br>
         0x17:Parallel_FWD_BattNoCurr <br>
         0x18:Parallel_FWD_Regene <br>
         0x19:Parallel_4WD_BattChg <br>
         0x1A:Parallel_4WD_BattDisChg <br>
         0x1B:Parallel_4WD_BattNoCurr <br>
         0x1C:Parallel_4WD_Regene <br>
         0x1D:StopCharging_BatChg <br>
         0x1E:StopCharging_BatDChg <br>
         0x1F:StopCharging_BatNoCurr <p>
     */
        public static final int HCU_ENGYFLOWTODISP_522 = 557848415;

    /**
     * HCU_25_EDLFED_522 <p>
     * <br>
     * Function Describe: 中央差速锁显示信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Forward <br>
         0x2:Backward <br>
         0x3:Reserved <p>
     */
        public static final int HCU_25_EDLFED_522 = 557848416;

    /**
     * HCU_DRAGGINGMODEREMIND_522 <p>
     * <br>
     * Function Describe: 0x0: 无提示
 0x1:禁用ECO和越野模式
 0x2:拖挂模式下仅支持Normal和Sport
 0x3:ECO和越野模式恢复
 0x4~0x7:预留 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Enter <br>
         0x2:Working <br>
         0x3:Exit <br>
         0x4~0x7:Reserved <p>
     */
        public static final int HCU_DRAGGINGMODEREMIND_522 = 557848417;

    /**
     * HCU_ITAS_ACTIVE_522 <p>
     * <br>
     * Function Describe: 极限掉头激活状态（仪表） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Standby <br>
         0x2:Active <br>
         0x3:Filed <p>
     */
        public static final int HCU_ITAS_ACTIVE_522 = 557848421;

    /**
     * HCU_25_VEHSPDOFFROADRMN_522 <p>
     * <br>
     * Function Describe: 漂移，掉头，专家，交叉轴，越野蠕行，越野竞速功能，用户在车辆未静止状态下点退出按钮或硬开关，仪表接收该信号0x1后显示“请将车辆禁止后再设置” <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Acitve <br>
         0x1:Acitve <p>
     */
        public static final int HCU_25_VEHSPDOFFROADRMN_522 = 557848423;

    /**
     * HCU_25_TAB_WARN_522 <p>
     * <br>
     * Function Describe: TAB功能提醒(T1J FL2华为智驾使用，D01及D01华为智驾版不使用) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:No Warn <br>
         0x1:Please open CCO <br>
         0x2:Please Unlock EDL <br>
         0x3:Prohibit locking EDL <br>
         0x4:Reserved <p>
     */
        public static final int HCU_25_TAB_WARN_522 = 557848429;

    /**
     * HCU_CROSSBORDERSTS_522 <p>
     * <br>
     * Function Describe: HCU 反馈飞车模式执行情况
 0x1: On 表示飞车模式限制已开启
 0x2: Off 表示飞车模式限制未开启 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:On <br>
         0x2:Off <br>
         0x3:Reserved <p>
     */
        public static final int HCU_CROSSBORDERSTS_522 = 557848433;

    /**
     * HCU_DISCHGSETSOCFED_522 <p>
     * <br>
     * Function Describe: 放电SOC设置状态反馈
 0xFE:Abnormal
 0xFF:Invalid <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HCU_DISCHGSETSOCFED_522 = 557848436;

    /**
     * LHFTIRETEMPERATURE_524 <p>
     * <br>
     * Function Describe: 左前方位轮胎温度 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int LHFTIRETEMPERATURE_524 = 557848449;

    /**
     * RHFTIRETEMPERATURE_524 <p>
     * <br>
     * Function Describe: 右前方位轮胎温度 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int RHFTIRETEMPERATURE_524 = 557848450;

    /**
     * LHRTIRETEMPERATURE_524 <p>
     * <br>
     * Function Describe: 左后方位轮胎温度 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int LHRTIRETEMPERATURE_524 = 557848451;

    /**
     * LHFTIREPRESSURE_524 <p>
     * <br>
     * Function Describe: 左前方位轮胎胎压 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int LHFTIREPRESSURE_524 = 557848452;

    /**
     * RHFTIREPRESSURE_524 <p>
     * <br>
     * Function Describe: 右前方位轮胎胎压 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int RHFTIREPRESSURE_524 = 557848453;

    /**
     * LHRTIREPRESSURE_524 <p>
     * <br>
     * Function Describe: 左后方位轮胎胎压 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int LHRTIREPRESSURE_524 = 557848454;

    /**
     * RHRTIREPRESSURE_524 <p>
     * <br>
     * Function Describe: 右后方位轮胎胎压 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int RHRTIREPRESSURE_524 = 557848455;

    /**
     * RHRTIRETEMPERATURE_524 <p>
     * <br>
     * Function Describe: 右后方位轮胎温度 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int RHRTIRETEMPERATURE_524 = 557848456;

    /**
     * ICC_SET_TDL_RHYTHM_SWITCH_526 <p>
     * <br>
     * Function Describe: 氛围灯律动开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:reserved <p>
     */
        public static final int ICC_SET_TDL_RHYTHM_SWITCH_526 = 557848457;

    /**
     * ICC_SET_TDL_SWITCH_526 <p>
     * <br>
     * Function Describe: 氛围灯开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:reserved <p>
     */
        public static final int ICC_SET_TDL_SWITCH_526 = 557848458;

    /**
     * ICC_SET_TDL_COLOURMODEADJ_526 <p>
     * <br>
     * Function Describe: 氛围灯颜色模式调节
 
 Monochrome_单色
 panchromatic为全色
 FLZCU_TDL <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Monochrome <br>
         0x2:panchromatic <br>
         0x3:OFF <br>
         0x4~0x7:Reserved <p>
     */
        public static final int ICC_SET_TDL_COLOURMODEADJ_526 = 557848459;

    /**
     * ICC_TDL_RHYTHMREQ_526 <p>
     * <br>
     * Function Describe: 音乐律动模式调节 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Mode1 <br>
         0x2:Mode2 <br>
         0x3:Mode3 <br>
         0x4:Mode4 <br>
         0x5:Mode5 <br>
         0x6:Mode6 <br>
         0x7:Reserved <p>
     */
        public static final int ICC_TDL_RHYTHMREQ_526 = 557848460;

    /**
     * ICC_VOICEWAKE_526 <p>
     * <br>
     * Function Describe: 语音唤醒 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:LHFawaken <br>
         0x4:LHRawaken <br>
         0x5:RHFawaken <br>
         0x6:RHRawaken <br>
         0x7:Reserved <p>
     */
        public static final int ICC_VOICEWAKE_526 = 557848461;

    /**
     * ICC_TDLASSOCIATEDDRIVERMODESW_526 <p>
     * <br>
     * Function Describe: 氛围灯关联驾驶模式开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:reserved <p>
     */
        public static final int ICC_TDLASSOCIATEDDRIVERMODESW_526 = 557848462;

    /**
     * ICC_SET_APILUMINANCEADJ_526 <p>
     * <br>
     * Function Describe: 氛围灯亮度调节
 氛围灯亮度_Level1最暗_Level8最亮FLZCU_TDL <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Level1 <br>
         0x2:Level2 <br>
         0x3:Level3 <br>
         0x4:Level4 <br>
         0x5:Level5 <br>
         0x6:Level6 <br>
         0x7:Level7 <br>
         0x8:Level8 <br>
         0x9~0xF:Reserved <p>
     */
        public static final int ICC_SET_APILUMINANCEADJ_526 = 557848463;

    /**
     * ICC_SET_MUSICLOUDNESS_120HZ_526 <p>
     * <br>
     * Function Describe: 均衡器设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Level_1 <br>
         0x2:Level_2 <br>
         0x3:Level_3 <br>
         0x4:Level_4 <br>
         0x5:Level_5 <br>
         0x6:Level_6 <br>
         0x7:Level_7 <br>
         0x8:Level_8 <br>
         0x9:Level_9 <br>
         0xA:Level_10 <br>
         0xB:Level_11 <br>
         0xC:Level_12 <br>
         0xD:Level_13 <br>
         0xE:Level_14 <br>
         0xF:Level_15 <p>
     */
        public static final int ICC_SET_MUSICLOUDNESS_120HZ_526 = 557848464;

    /**
     * ICC_SET_MUSICLOUDNESS_250HZ_526 <p>
     * <br>
     * Function Describe: 均衡器设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Level_1 <br>
         0x2:Level_2 <br>
         0x3:Level_3 <br>
         0x4:Level_4 <br>
         0x5:Level_5 <br>
         0x6:Level_6 <br>
         0x7:Level_7 <br>
         0x8:Level_8 <br>
         0x9:Level_9 <br>
         0xA:Level_10 <br>
         0xB:Level_11 <br>
         0xC:Level_12 <br>
         0xD:Level_13 <br>
         0xE:Level_14 <br>
         0xF:Level_15 <p>
     */
        public static final int ICC_SET_MUSICLOUDNESS_250HZ_526 = 557848465;

    /**
     * ICC_SET_MUSICLOUDNESS_500HZ_526 <p>
     * <br>
     * Function Describe: 均衡器设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Level_1 <br>
         0x2:Level_2 <br>
         0x3:Level_3 <br>
         0x4:Level_4 <br>
         0x5:Level_5 <br>
         0x6:Level_6 <br>
         0x7:Level_7 <br>
         0x8:Level_8 <br>
         0x9:Level_9 <br>
         0xA:Level_10 <br>
         0xB:Level_11 <br>
         0xC:Level_12 <br>
         0xD:Level_13 <br>
         0xE:Level_14 <br>
         0xF:Level_15 <p>
     */
        public static final int ICC_SET_MUSICLOUDNESS_500HZ_526 = 557848466;

    /**
     * ICC_SET_MUSICLOUDNESS_1000HZ_526 <p>
     * <br>
     * Function Describe: 均衡器设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Level_1 <br>
         0x2:Level_2 <br>
         0x3:Level_3 <br>
         0x4:Level_4 <br>
         0x5:Level_5 <br>
         0x6:Level_6 <br>
         0x7:Level_7 <br>
         0x8:Level_8 <br>
         0x9:Level_9 <br>
         0xA:Level_10 <br>
         0xB:Level_11 <br>
         0xC:Level_12 <br>
         0xD:Level_13 <br>
         0xE:Level_14 <br>
         0xF:Level_15 <p>
     */
        public static final int ICC_SET_MUSICLOUDNESS_1000HZ_526 = 557848467;

    /**
     * ICC_SET_MUSICLOUDNESS_1500HZ_526 <p>
     * <br>
     * Function Describe: 均衡器设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Level_1 <br>
         0x2:Level_2 <br>
         0x3:Level_3 <br>
         0x4:Level_4 <br>
         0x5:Level_5 <br>
         0x6:Level_6 <br>
         0x7:Level_7 <br>
         0x8:Level_8 <br>
         0x9:Level_9 <br>
         0xA:Level_10 <br>
         0xB:Level_11 <br>
         0xC:Level_12 <br>
         0xD:Level_13 <br>
         0xE:Level_14 <br>
         0xF:Level_15 <p>
     */
        public static final int ICC_SET_MUSICLOUDNESS_1500HZ_526 = 557848468;

    /**
     * ICC_SET_MUSICLOUDNESS_2000HZ_526 <p>
     * <br>
     * Function Describe: 均衡器设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Level_1 <br>
         0x2:Level_2 <br>
         0x3:Level_3 <br>
         0x4:Level_4 <br>
         0x5:Level_5 <br>
         0x6:Level_6 <br>
         0x7:Level_7 <br>
         0x8:Level_8 <br>
         0x9:Level_9 <br>
         0xA:Level_10 <br>
         0xB:Level_11 <br>
         0xC:Level_12 <br>
         0xD:Level_13 <br>
         0xE:Level_14 <br>
         0xF:Level_15 <p>
     */
        public static final int ICC_SET_MUSICLOUDNESS_2000HZ_526 = 557848469;

    /**
     * ICC_SET_MUSICLOUDNESS_6000HZ_526 <p>
     * <br>
     * Function Describe: 均衡器设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:Level_1 <br>
         0x2:Level_2 <br>
         0x3:Level_3 <br>
         0x4:Level_4 <br>
         0x5:Level_5 <br>
         0x6:Level_6 <br>
         0x7:Level_7 <br>
         0x8:Level_8 <br>
         0x9:Level_9 <br>
         0xA:Level_10 <br>
         0xB:Level_11 <br>
         0xC:Level_12 <br>
         0xD:Level_13 <br>
         0xE:Level_14 <br>
         0xF:Level_15 <p>
     */
        public static final int ICC_SET_MUSICLOUDNESS_6000HZ_526 = 557848470;

    /**
     * ICC_TDL_FLOWLIGHTSW_526 <p>
     * <br>
     * Function Describe: 流水灯开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:reserved <p>
     */
        public static final int ICC_TDL_FLOWLIGHTSW_526 = 557848471;

    /**
     * ICC_TDL_FLOWLIGHTMODEADJ_526 <p>
     * <br>
     * Function Describe: 流水灯模式调节 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:mode1 <br>
         0x2:mode2 <br>
         0x3:mode3 <br>
         0x4:mode4 <br>
         0x5:mode5 <br>
         0x6:mode6 <br>
         0x7:Reserved <p>
     */
        public static final int ICC_TDL_FLOWLIGHTMODEADJ_526 = 557848472;

    /**
     * ICC_SET_256COLOURADJ_526 <p>
     * <br>
     * Function Describe: 多元颜色设置（256色） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_SET_256COLOURADJ_526 = 557848473;

    /**
     * TIREPOSITIONWARNING_LHFTIRE_52C <p>
     * <br>
     * Function Describe: 左前方位轮胎胎压报警，含快速失压、低压、高压、高温。 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Normal <br>
         0x1:Rapid_Air_Loss(Reserved) <br>
         0x2:Low_Pressure <br>
         0x3:Low Batter <br>
         0x4:High_Pressure(Reserved) <br>
         0x5:High_Temperature <br>
         0x6:Error_Mode <br>
         0x7:Not_used(Reserved) <p>
     */
        public static final int TIREPOSITIONWARNING_LHFTIRE_52C = 557848485;

    /**
     * TIREPOSITIONWARNING_RHFTIRE_52C <p>
     * <br>
     * Function Describe: 右前方位轮胎胎压报警，含快速失压、低压、高压、高温。 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Normal <br>
         0x1:Rapid_Air_Loss(Reserved) <br>
         0x2:Low_Pressure <br>
         0x3:Low Batter <br>
         0x4:High_Pressure(Reserved) <br>
         0x5:High_Temperature <br>
         0x6:Error_Mode <br>
         0x7:Not_used(Reserved) <p>
     */
        public static final int TIREPOSITIONWARNING_RHFTIRE_52C = 557848486;

    /**
     * TIREPOSITIONWARNING_LHRTIRE_52C <p>
     * <br>
     * Function Describe: 左后方位轮胎胎压报警，含快速失压、低压、高压、高温。 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Normal <br>
         0x1:Rapid_Air_Loss(Reserved) <br>
         0x2:Low_Pressure <br>
         0x3:Low Batter <br>
         0x4:High_Pressure(Reserved) <br>
         0x5:High_Temperature <br>
         0x6:Error_Mode <br>
         0x7:Not_used(Reserved) <p>
     */
        public static final int TIREPOSITIONWARNING_LHRTIRE_52C = 557848487;

    /**
     * TIREPOSITIONWARNING_RHRTIRE_52C <p>
     * <br>
     * Function Describe: 右后方位轮胎胎压报警，含快速失压、低压、高压、高温。 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Normal <br>
         0x1:Rapid_Air_Loss(Reserved) <br>
         0x2:Low_Pressure <br>
         0x3:Low Batter <br>
         0x4:High_Pressure(Reserved) <br>
         0x5:High_Temperature <br>
         0x6:Error_Mode <br>
         0x7:Not_used(Reserved) <p>
     */
        public static final int TIREPOSITIONWARNING_RHRTIRE_52C = 557848488;

    /**
     * TIREPRESSUREWARNINGLAMPSTS_52C <p>
     * <br>
     * Function Describe: 胎压报警灯状态，含熄灭、闪烁（快速失压）、常亮（低压）三种状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Lamp_Off <br>
         0x1:Lamp_Flashing <br>
         0x2:Lamp_On <br>
         0x3:Not_used <p>
     */
        public static final int TIREPRESSUREWARNINGLAMPSTS_52C = 557848489;

    /**
     * TIREPRESSURESYSTEMFAILSTS_52C <p>
     * <br>
     * Function Describe: 胎压系统失效状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Fail_Not_Present <br>
         0x1:Fail_Present <p>
     */
        public static final int TIREPRESSURESYSTEMFAILSTS_52C = 557848490;

    /**
     * RADAR_1_LHRRADARSENSORDISTANCE_530 <p>
     * <br>
     * Function Describe: 左后探头信息
 自检故障:发送Sensor_Err
 自检正常或雷达待机:发送0x3
 E正常测距:距离=(D)*5+25
 无障碍物:发送0x3E
 0x20~0x3D:无效数据 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x20~0x3D:Not_Used <br>
         0x3E:Startup <br>
         0x3F:Sensor_Err <p>
     */
        public static final int RADAR_1_LHRRADARSENSORDISTANCE_530 = 557848496;

    /**
     * RADAR_1_RHMRRADARSENSORDISTANCE_530 <p>
     * <br>
     * Function Describe: 右中后探头信息
 自检故障:发送Sensor_Err
 自检正常或雷达待机:发送0x3
 E正常测距:距离=(D)*5+25
 无障碍物:发送0x3E
 0x20~0x3D:无效数据 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x20~0x3D:Not_Used <br>
         0x3E:Startup <br>
         0x3F:Sensor_Err <p>
     */
        public static final int RADAR_1_RHMRRADARSENSORDISTANCE_530 = 557848497;

    /**
     * RADAR_1_RHRRADARSENSORDISTANCE_530 <p>
     * <br>
     * Function Describe: 右后探头信息
 自检故障:发送Sensor_Err
 自检正常或雷达待机:发送0x3
 E正常测距:距离=(D)*5+25
 无障碍物:发送0x3E
 0x20~0x3D:无效数据 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x20~0x3D:Not_Used <br>
         0x3E:Startup <br>
         0x3F:Sensor_Err <p>
     */
        public static final int RADAR_1_RHRRADARSENSORDISTANCE_530 = 557848498;

    /**
     * RADAR_1_LHMRRADARSENSORDISTANCE_530 <p>
     * <br>
     * Function Describe: 左中后探头信息
 自检故障:发送Sensor_Err
 自检正常或雷达待机:发送0x3
 E正常测距:距离=(D)*5+25
 无障碍物:发送0x3E
 0x20~0x3D:无效数据 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x20~0x3D:Not_Used <br>
         0x3E:Startup <br>
         0x3F:Sensor_Err <p>
     */
        public static final int RADAR_1_LHMRRADARSENSORDISTANCE_530 = 557848499;

    /**
     * RADAR_1_LHFRADARSENSORDISTANCE_530 <p>
     * <br>
     * Function Describe: 左前探头信息
 自检故障:发送Sensor_Err
 自检正常或雷达待机:发送0x3
 E正常测距:距离=(D)*5+25
 无障碍物:发送0x1E
 0x20~0x3D:无效数据 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x1C~0x1D:Not_Used <br>
         0x1E:Startup <br>
         0x1F:Sensor_Err <p>
     */
        public static final int RADAR_1_LHFRADARSENSORDISTANCE_530 = 557848500;

    /**
     * RADAR_1_RHMFRADARSENSORDISTANCE_530 <p>
     * <br>
     * Function Describe: 右中前探头信息
 自检故障:发送Sensor_Err
 自检正常或雷达待机:发送0x1E
 正常测距:距离=(D)*5+25
 无障碍物:发送0x1E
 低配雷达(后4_探头):发送0x1E
 0x1C~0x1D:无效数据 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x1C~0x1D:Not_Used <br>
         0x1E:Startup <br>
         0x1F:Sensor_Err <p>
     */
        public static final int RADAR_1_RHMFRADARSENSORDISTANCE_530 = 557848501;

    /**
     * RADAR_1_RHFRADARSENSORDISTANCE_530 <p>
     * <br>
     * Function Describe: 右前探头信息
 自检故障:发送Sensor_Err
 自检正常或雷达待机:发送0x3
 E正常测距:距离=(D)*5+25
 无障碍物:发送0x1E
 0x20~0x3D:无效数据 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x1C~0x1D:Not_Used <br>
         0x1E:Startup <br>
         0x1F:Sensor_Err <p>
     */
        public static final int RADAR_1_RHFRADARSENSORDISTANCE_530 = 557848503;

    /**
     * RADAR_1_LHMFRADARSENSORDISTANCE_530 <p>
     * <br>
     * Function Describe: 左中前探头信息
 自检故障:发送Sensor_Err
 自检正常或雷达待机:发送0x1E
 正常测距:距离=(D)*5+25
 无障碍物:发送0x1E
 低配雷达(后4_探头):发送0x1E
 0x1C~0x1D:无效数据 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x1C~0x1D:Not_Used <br>
         0x1E:Startup <br>
         0x1F:Sensor_Err <p>
     */
        public static final int RADAR_1_LHMFRADARSENSORDISTANCE_530 = 557848505;

    /**
     * DWD_DISTANCE_532 <p>
     * <br>
     * Function Describe: 报警距离分段 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:No object <br>
         0x1:Object in zone 1, 0~5cm <br>
         0x2:Object in zone 2, 6~10cm <br>
         0x3:Object in zone 3, 11~15cm <br>
         0x4:Object in zone 4, 16~20cm <br>
         0x5:Object in zone 5, 21~25cm <br>
         0x6:Object in zone 6, 26~30cm <br>
         0x7:Object in zone 7, 31~35cm <br>
         0x8:Object in zone 8, 36~40cm <br>
         0x9:Object in zone 9, 41~45cm <br>
         0xA:Object in zone 10, 46~50cm <br>
         0xB:Object in zone 11, 51~55cm <br>
         0xC:Object in zone 12, 56~60cm <br>
         0xD:Object in zone 13, 61~65cm <br>
         0xE:Object in zone 14, 66~70cm <br>
         0xF:Object in zone 15, 71~75cm <br>
         0x10:Object in zone 16, 76~80cm <br>
         0x11:Object in zone 17, 81~85cm <br>
         0x12:Object in zone 18, 86~90cm <br>
         0x13:Object in zone 19, 91~95cm <br>
         0x14:Object in zone 20, 96~100cm <br>
         0x15:Object in zone 21, 101~105cm <br>
         0x16:Object in zone 22, 105~110cm <br>
         0x17:Object in zone 23, 111~115cm <br>
         0x18:Object in zone 24, 116~120cm <br>
         0x19:Object in zone 25, 121~125cm <br>
         0x1A:Object in zone 26, 126~130cm <br>
         0x1B:Object in zone 27, 131~135cm <br>
         0x1C:Object in zone 28, 136~140cm <br>
         0x1D:Object in zone 29, 141~145cm <br>
         0x1E:Object in zone 30, 146~150cm <p>
     */
        public static final int DWD_DISTANCE_532 = 557848510;

    /**
     * ICC_NAPAREASET2_533 <p>
     * <br>
     * Function Describe: 小憩模式开启区域设置2 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:2Row Left <br>
         0x2:2Row Right <br>
         0x3:2Row Left and Right <br>
         0x4:Front Left and 2Row Right <br>
         0x5:Front Right and 2Row Left <br>
         0x6:Front Left and 2Row Left <br>
         0x7:Front Right and 2Row Right <p>
     */
        public static final int ICC_NAPAREASET2_533 = 557848535;

    /**
     * ICC_SRFCMD_535 <p>
     * <br>
     * Function Describe: 天窗开关设置
 全开
 全关
 翘起 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:Open <br>
         0x2:Close <br>
         0x3:Tilt <br>
         0x4~0x7:Reserved <p>
     */
        public static final int ICC_SRFCMD_535 = 557848541;

    /**
     * ICC_SRFPERCENTCMD_535 <p>
     * <br>
     * Function Describe: 手滑动开启天窗百分比 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:0 <br>
         0x2:10% <br>
         0x3:20% <br>
         0x4:30% <br>
         0x5:40% <br>
         0x6:50% <br>
         0x7:60% <br>
         0x8:70% <br>
         0x9:80% <br>
         0xA:90% <br>
         0xB:100% <p>
     */
        public static final int ICC_SRFPERCENTCMD_535 = 557848542;

    /**
     * ICC_SUNSHADECMD_535 <p>
     * <br>
     * Function Describe: 遮阳帘开关设置
 全开
 全关
 一半 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Acitive <br>
         0x1:Open <br>
         0x2:Close <br>
         0x3:Half_Open <br>
         0x4~0x7:Reserved <p>
     */
        public static final int ICC_SUNSHADECMD_535 = 557848543;

    /**
     * ICC_SUNSHADEPERCENTCMD_535 <p>
     * <br>
     * Function Describe: 手滑动开启遮阳帘百分比 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:No Acitive <br>
         0x1:0% <br>
         0x2:10% <br>
         0x3:20% <br>
         0x4:30% <br>
         0x5:40% <br>
         0x6:50% <br>
         0x7:60% <br>
         0x8:70% <br>
         0x9:80% <br>
         0xA:90% <br>
         0xB:100% <p>
     */
        public static final int ICC_SUNSHADEPERCENTCMD_535 = 557848544;

    /**
     * ICC_CSUNSHADEREQ_535 <p>
     * <br>
     * Function Describe: 天幕遮阳帘开关设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:Open <br>
         0x2:Close <br>
         0x3:HalfOpen <p>
     */
        public static final int ICC_CSUNSHADEREQ_535 = 557848545;

    /**
     * CSUNSHADEPERCENTREQ_535H_535 <p>
     * <br>
     * Function Describe: 遮阳帘开度 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:No request <br>
         0x1:Sunshade 0% <br>
         0x2:Sunshade 1% <br>
         0x3:Sunshade 2% <br>
         0x4:Sunshade 3% <br>
         0x5:Sunshade 4% <br>
         0x6:Sunshade 5% <br>
         0x7:Sunshade 6% <br>
         0x8:Sunshade 7% <br>
         0x9:Sunshade 8% <br>
         0xA:Sunshade 9% <br>
         0xB:Sunshade 10% <br>
         0xC:Sunshade 11% <br>
         0xD:Sunshade 12% <br>
         0xE:Sunshade 13% <br>
         0xF:Sunshade 14% <br>
         0x10:Sunshade 15% <br>
         0x11:Sunshade 16% <br>
         0x12:Sunshade 17% <br>
         0x13:Sunshade 18% <br>
         0x14:Sunshade 19% <br>
         0x15:Sunshade 20% <br>
         0x16:Sunshade 21% <br>
         0x17:Sunshade 22% <br>
         0x18:Sunshade 23% <br>
         0x19:Sunshade 24% <br>
         0x1A:Sunshade 25% <br>
         0x1B:Sunshade 26% <br>
         0x1C:Sunshade 27% <br>
         0x1D:Sunshade 28% <br>
         0x1E:Sunshade 29% <br>
         0x1F:Sunshade 30% <br>
         0x20:Sunshade 31% <br>
         0x21:Sunshade 32% <br>
         0x22:Sunshade 33% <br>
         0x23:Sunshade 34% <br>
         0x24:Sunshade 35% <br>
         0x25:Sunshade 36% <br>
         0x26:Sunshade 37% <br>
         0x27:Sunshade 38% <br>
         0x28:Sunshade 39% <br>
         0x29:Sunshade 40% <br>
         0x2A:Sunshade 41% <br>
         0x2B:Sunshade 42% <br>
         0x2C:Sunshade 43% <br>
         0x2D:Sunshade 44% <br>
         0x2E:Sunshade 45% <br>
         0x2F:Sunshade 46% <br>
         0x30:Sunshade 47% <br>
         0x31:Sunshade 48% <br>
         0x32:Sunshade 49% <br>
         0x33:Sunshade 50% <br>
         0x34:Sunshade 51% <br>
         0x35:Sunshade 52% <br>
         0x36:Sunshade 53% <br>
         0x37:Sunshade 54% <br>
         0x38:Sunshade 55% <br>
         0x39:Sunshade 56% <br>
         0x3A:Sunshade 57% <br>
         0x3B:Sunshade 58% <br>
         0x3C:Sunshade 59% <br>
         0x3D:Sunshade 60% <br>
         0x3E:Sunshade 61% <br>
         0x3F:Sunshade 62% <br>
         0x40:Sunshade 63% <br>
         0x41:Sunshade 64% <br>
         0x42:Sunshade 65% <br>
         0x43:Sunshade 66% <br>
         0x44:Sunshade 67% <br>
         0x45:Sunshade 68% <br>
         0x46:Sunshade 69% <br>
         0x47:Sunshade 70% <br>
         0x48:Sunshade 71% <br>
         0x49:Sunshade 72% <br>
         0x4A:Sunshade 73% <br>
         0x4B:Sunshade 74% <br>
         0x4C:Sunshade 75% <br>
         0x4D:Sunshade 76% <br>
         0x4E:Sunshade 77% <br>
         0x4F:Sunshade 78% <br>
         0x50:Sunshade 79% <br>
         0x51:Sunshade 80% <br>
         0x52:Sunshade 81% <br>
         0x53:Sunshade 82% <br>
         0x54:Sunshade 83% <br>
         0x55:Sunshade 84% <br>
         0x56:Sunshade 85% <br>
         0x57:Sunshade 86% <br>
         0x58:Sunshade 87% <br>
         0x59:Sunshade 88% <br>
         0x5A:Sunshade 89% <br>
         0x5B:Sunshade 90% <br>
         0x5C:Sunshade 91% <br>
         0x5D:Sunshade 92% <br>
         0x5E:Sunshade 93% <br>
         0x5F:Sunshade 94% <br>
         0x60:Sunshade 95% <br>
         0x61:Sunshade 96% <br>
         0x62:Sunshade 97% <br>
         0x63:Sunshade 98% <br>
         0x64:Sunshade 99% <br>
         0x65:Sunshade 100% <br>
         0x66:Stop <br>
         0x67:initialize <br>
         0x68~0xFF:Reserved <p>
     */
        public static final int CSUNSHADEPERCENTREQ_535H_535 = 557848548;

    /**
     * ICC_SET_BT_REDUCEWINDSPEED_539 <p>
     * <br>
     * Function Describe: 大屏设置蓝牙通话降低风速 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:Reserved <p>
     */
        public static final int ICC_SET_BT_REDUCEWINDSPEED_539 = 557848562;

    /**
     * ICC_SET_IPM_FIRSTBLOWING_539 <p>
     * <br>
     * Function Describe: 夏日热风规避_大屏设置空调启动时第一口风 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:Reserved <p>
     */
        public static final int ICC_SET_IPM_FIRSTBLOWING_539 = 557848563;

    /**
     * ICC_SET_IPM_BLOWERDELAY_539 <p>
     * <br>
     * Function Describe: 大屏设置车辆熄火空调鼓风机延时 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:Reserved <p>
     */
        public static final int ICC_SET_IPM_BLOWERDELAY_539 = 557848564;

    /**
     * ICC_CROSSCOUNTRYCOOLINGREQ_539 <p>
     * <br>
     * Function Describe: 越野散热开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:Reserved <p>
     */
        public static final int ICC_CROSSCOUNTRYCOOLINGREQ_539 = 557848568;

    /**
     * ICC_PARKINGAIRCONDITIONING_539 <p>
     * <br>
     * Function Describe: 驻车空调使能开关
 ventilate通风 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:Disable <br>
         0x2:AUTO <br>
         0x3:ventilate <p>
     */
        public static final int ICC_PARKINGAIRCONDITIONING_539 = 557848571;

    /**
     * ICC_COOLANTFILL_REQ_539 <p>
     * <br>
     * Function Describe: 冷却液加注开关请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:Reserved <p>
     */
        public static final int ICC_COOLANTFILL_REQ_539 = 557848572;

    /**
     * ICC_TIMEDVENTILATIONREQ_539 <p>
     * <br>
     * Function Describe: 大屏定时换气功能开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:Reserved <p>
     */
        public static final int ICC_TIMEDVENTILATIONREQ_539 = 557848578;

    /**
     * ICC_PETMODESETTEMPERATURE_L_C_539 <p>
     * <br>
     * Function Describe: 宠物模式前左空调温度设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x1F:Not active <p>
     */
        public static final int ICC_PETMODESETTEMPERATURE_L_C_539 = 557848581;

    /**
     * ICC_PETMODESETCIRCULATIONSTS_539 <p>
     * <br>
     * Function Describe: 宠物模式空调内外循环切换设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:Recirculation mode <br>
         0x2:Air circulation mode <br>
         0x3:Two-Layer Flow Mode <p>
     */
        public static final int ICC_PETMODESETCIRCULATIONSTS_539 = 557848582;

    /**
     * ICC_PETMODESETAUTOKEYSTS_539 <p>
     * <br>
     * Function Describe: 宠物模式空调自动模式设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:On <br>
         0x2:Off <br>
         0x3:Not Used <p>
     */
        public static final int ICC_PETMODESETAUTOKEYSTS_539 = 557848583;

    /**
     * ICC_PETMODESETCLMON_539 <p>
     * <br>
     * Function Describe: 宠物模式空调开关设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:On <br>
         0x2:Off <br>
         0x3:Not Used <p>
     */
        public static final int ICC_PETMODESETCLMON_539 = 557848584;

    /**
     * ICC_PETMODESETTEMPERATURE_R_C_539 <p>
     * <br>
     * Function Describe: 宠物模式前右空调温度设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x1F:Not active <p>
     */
        public static final int ICC_PETMODESETTEMPERATURE_R_C_539 = 557848585;

    /**
     * FMCU_ERRLVLDIS_53A <p>
     * <br>
     * Function Describe: 前驱动电机故障等级 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:No Error <br>
         0x1:Err_level1 <br>
         0x2:Err_level2 <br>
         0x3:Err_level3 <br>
         0x4:Err_level4 <br>
         0x5:Err_level5 <br>
         0x6:Err_level6 <p>
     */
        public static final int FMCU_ERRLVLDIS_53A = 557848587;

    /**
     * FMCU_SPDACT_EDR_53A <p>
     * <br>
     * Function Describe: 前驱动电机实际转速 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0xFFFF:Invalid <p>
     */
        public static final int FMCU_SPDACT_EDR_53A = 557848588;

    /**
     * BMS_44_PACKPOWERREALTIME_53D <p>
     * <br>
     * Function Describe: 捷途新增动力电池包实时功率 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int BMS_44_PACKPOWERREALTIME_53D = 557848589;

    /**
     * ICC_LOGOCHARGINGREQ_550 <p>
     * <br>
     * Function Describe: 前LOGO充电灯效开关请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:Reserved <p>
     */
        public static final int ICC_LOGOCHARGINGREQ_550 = 557848708;

    /**
     * ICC_DRLSW_550 <p>
     * <br>
     * Function Describe: 日间行车灯软开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:Reserved <p>
     */
        public static final int ICC_DRLSW_550 = 557848709;

    /**
     * ICC_DOWWARINGSW_550 <p>
     * <br>
     * Function Describe: 盲区检测氛围灯联动闪烁开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not_Active <br>
         0x1:ON <br>
         0x2:OFF <br>
         0x3:reserved <p>
     */
        public static final int ICC_DOWWARINGSW_550 = 557848716;

    /**
     * ICC_CARSEARHSETSWITCHSTS_550 <p>
     * <br>
     * Function Describe: 寻车设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:Only Lighting <br>
         0x2:Sound and Lighting <br>
         0x3:Reserved <p>
     */
        public static final int ICC_CARSEARHSETSWITCHSTS_550 = 557848717;

    /**
     * ICC_QUEENSEATSWITCH_564 <p>
     * <br>
     * Function Describe: 女王副驾开启
 0x1:展开
 0x2:回位
 0x3:暂停（预留） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:Entrence <br>
         0x2:Exit <br>
         0x3:Pause <p>
     */
        public static final int ICC_QUEENSEATSWITCH_564 = 557849780;

    /**
     * RMCU_ERRLVLDIS_57B <p>
     * <br>
     * Function Describe: 后驱动电机控制器故障等级 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:No Error <br>
         0x1:Err_level1 <br>
         0x2:Err_level2 <br>
         0x3:Err_level3 <br>
         0x4:Err_level4 <br>
         0x5:Err_level5 <br>
         0x6:Err_level6 <p>
     */
        public static final int RMCU_ERRLVLDIS_57B = 557849816;

    /**
     * ICC_CROSSBORDERMODE_5AD <p>
     * <br>
     * Function Describe: HCU 反馈飞车模式执行情况
 0x1: On 表示飞车模式限制已开启
 0x2: Off 表示飞车模式限制未开启 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:On <br>
         0x2:Off <br>
         0x3:Reserved <p>
     */
        public static final int ICC_CROSSBORDERMODE_5AD = 557849873;

    /**
     * ICC_BEDSTATUS_5AD <p>
     * <br>
     * Function Describe: 大床模式开关请求
 0x1:居家大床
 0x2:副驾单人床
 0x3:驻车沙发
 0x4:旅行小床 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Not Active <br>
         0x1:Large Bed At Home <br>
         0x2:Single Bed <br>
         0x3:Sofa For Parking <br>
         0x4:Travel Bed <br>
         0x5~0x6:Reserved <br>
         0x7:OFF <p>
     */
        public static final int ICC_BEDSTATUS_5AD = 557849874;

    /**
     * BMS_HVBATTSOEACTDISCHACYC_5FB <p>
     * <br>
     * Function Describe: 一个驾驶循环内放电能量累计 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0xFFFE:Abnormal <br>
         0xFFFF:Invalid <p>
     */
        public static final int BMS_HVBATTSOEACTDISCHACYC_5FB = 557849875;

    /**
     * BMS_HVBATTSOEACTRECHACYC_5FB <p>
     * <br>
     * Function Describe: 一个驾驶循环内回充能量累计 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0xFFFE:Abnormal <br>
         0xFFFF:Invalid <p>
     */
        public static final int BMS_HVBATTSOEACTRECHACYC_5FB = 557849876;

    /**
     * BMS_HVBATTTEMPMAXNUM_5FB <p>
     * <br>
     * Function Describe: 最高温度模组编号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0xFE:Abnormal <br>
         0xFF:Invalid <p>
     */
        public static final int BMS_HVBATTTEMPMAXNUM_5FB = 557849884;

    /**
     * BMS_HVBATTTEMPMINNUM_5FB <p>
     * <br>
     * Function Describe: 最低温度模组编码编号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0xFE:Abnormal <br>
         0xFF:Invalid <p>
     */
        public static final int BMS_HVBATTTEMPMINNUM_5FB = 557849885;


    /**
     * Property to feed H/W input events to android <p>
     * <br>
     * int32Values[0] : action defined by VehicleHwKeyInputAction <br>
     * int32Values[1] : key code, must use standard android key code <br>
     * int32Values[2] : target display defined in VehicleDisplay. Events not 
     *                  tied to specific display must be sent to 
     *                  VehicleDisplay#MAIN. <br>
     * int32Values[3] : [optional] Number of ticks. The value must be equal or 
     *                  greater than 1. When omitted, Android will default to 1. <br>
     * <p>
     * @change_mode VehiclePropertyChangeMode:ON_CHANGE <p>
     * @access VehiclePropertyAccess:READ <p>
     * @config_flags
     */
    public static final int HW_KEY_INPUT = 289475088;

     /**
     * Property to control power state of application processor.
     *
     * <p>Not exposed through {@link android.car.hardware.property.CarPropertyManager}.
     *
     * <p>Trying to get/set this property will cause {@link SecurityException}.
     *
     * Deprecated, use {@link android.car.hardware.power.CarPowerManager} instead.
     */
    @RequiresPermission(Car.PERMISSION_CAR_POWER)
    @AddedInOrBefore(majorVersion = 33)
    public static final int AP_POWER_STATE_REQ = 289475072;

    /**
     * Property to report power state of application processor.
     *
     * <p>Not exposed through {@link android.car.hardware.property.CarPropertyManager}.
     *
     * <p>Trying to get/set this property will cause {@link SecurityException}.
     *
     * Deprecated, use {@link android.car.hardware.power.CarPowerManager} instead.
     */
    @RequiresPermission(Car.PERMISSION_CAR_POWER)
    @AddedInOrBefore(majorVersion = 33)
    public static final int AP_POWER_STATE_REPORT = 289475073;

    /**
     * @deprecated to prevent others from instantiating this class
     */
    @Deprecated
    @ExcludeFromCodeCoverageGeneratedReport(reason = BOILERPLATE_CODE)
    public ALT1VVehiclePropertyIds() {
    }

    /**
     * Gets a user-friendly representation of a property.
     */
    @AddedInOrBefore(majorVersion = 33)
    public static String toString(int property) {
        return CarPropertyHelper.toString(property);
    }
}