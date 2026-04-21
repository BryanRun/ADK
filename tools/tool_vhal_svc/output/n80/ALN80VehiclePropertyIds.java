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
  * List of N80 vehicle property IDs.
  *
  * <p> Property IDs are used with the {@link android.car.hardware.property.CarPropertyManager} APIs
  * (e.g. {@link android.car.hardware.property.CarPropertyManager#getProperty(int, int)} or {@link
  * android.car.hardware.property.CarPropertyManager#setProperty(Class, int, int, Object)}).
  */
 public final class ALN80VehiclePropertyIds {

     /**
      * Undefined property.
      *
      * <p>This property should never be used/will never be supported.
      */
     @AddedInOrBefore(majorVersion = 33)
     public static final int INVALID = 0;


    /**
     * ICMDISPVEHSPD_1C5 <p>
     * <br>
     * Function Describe: 仪表显示车速 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0xFFFF: Invalid <p>
     */
        public static final int ICMDISPVEHSPD_1C5 = 557846565;

    /**
     * ICMDISPVEHSPDVLD_1C5 <p>
     * <br>
     * Function Describe: 仪表显示车速有效性标志位 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Initializing(Reserved) <br>
         0x1: Valid <br>
         0x2: Invalid <br>
         0x3: Reserved <p>
     */
        public static final int ICMDISPVEHSPDVLD_1C5 = 557846566;

    /**
     * ICMDISPSPDUNITTYP_1C5 <p>
     * <br>
     * Function Describe: 仪表显示速度单位类型 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: initializing <br>
         0x1: the metric system <br>
         0x2: the British system <br>
         0x3: invalid <p>
     */
        public static final int ICMDISPSPDUNITTYP_1C5 = 557846567;

    /**
     * ICMDISPTOTDST_2E0 <p>
     * <br>
     * Function Describe: 仪表显示总里程 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0xFFFFFFFF: Invalid <p>
     */
        public static final int ICMDISPTOTDST_2E0 = 557846573;

    /**
     * ICMDISPTOTDSTVLD_2E0 <p>
     * <br>
     * Function Describe: 仪表显示总里程有效位 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Initializing(Reserved) <br>
         0x1: Valid <br>
         0x2: Invalid <br>
         0x3: Reserved <p>
     */
        public static final int ICMDISPTOTDSTVLD_2E0 = 557846575;

    /**
     * ODOOFFS_2E0 <p>
     * <br>
     * Function Describe: 里程表偏移 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0xFF: Invalid <p>
     */
        public static final int ODOOFFS_2E0 = 557846582;

    /**
     * ODOOFFSVLD_2E0 <p>
     * <br>
     * Function Describe: 里程表偏移有效位 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Initializing(Reserved) <br>
         0x1: Valid <br>
         0x2: Invalid <br>
         0x3: Reserved <p>
     */
        public static final int ODOOFFSVLD_2E0 = 557846583;

    /**
     * ODOTICKVAL_2E0 <p>
     * <br>
     * Function Describe: ODO ERROR情况下，当ICM总里程每增加10km时，该信号由0x0跳变为0x1，并连续发10帧，然后再持续发0x0。 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Active <br>
         0x2: Reserved <br>
         0x3: Invalid (Reserved) <p>
     */
        public static final int ODOTICKVAL_2E0 = 557846584;

    /**
     * ODORSTCNTR_2E0 <p>
     * <br>
     * Function Describe: 里程表重置计数 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Initializing(Reserved) <br>
         0x1: Once <br>
         0x2: Twice <br>
         0x3: Thrice <br>
         0x4: None <br>
         0x5~0x6: Reserved <br>
         0x7: Invalid <p>
     */
        public static final int ODORSTCNTR_2E0 = 557846585;

    /**
     * FAILRFUSAMPLECIRC_59F <p>
     * <br>
     * Function Describe: 燃油液位电路诊断 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: No ERROR <br>
         0x2: Short Circuit to Ground <br>
         0x3: Open Circuit or Short Circuit to Battery <br>
         0x4~0x6: Reserved <br>
         0x7: Invalid <p>
     */
        public static final int FAILRFUSAMPLECIRC_59F = 557846589;

    /**
     * RMNMNTNMILG_59F <p>
     * <br>
     * Function Describe: 保养里程 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0xFFFF: Invalid <p>
     */
        public static final int RMNMNTNMILG_59F = 557846591;

    /**
     * PTMSMTENTRYSET_321 <p>
     * <br>
     * Function Describe: 电动尾门感应进入设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: OFF <br>
         0x2: On Mode 1 <br>
         0x3: On Mode 2 <br>
         0x4~0x6: Reserved <br>
         0x7: Invalid <p>
     */
        public static final int PTMSMTENTRYSET_321 = 557846600;

    /**
     * ICCEXTRLAMPSWT_321 <p>
     * <br>
     * Function Describe: 灯光开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: Off <br>
         0x2: Auto <br>
         0x3: Park <br>
         0x4: Low Beam <br>
         0x5~0x7: invalid <p>
     */
        public static final int ICCEXTRLAMPSWT_321 = 557846633;

    /**
     * REFOGLIREQ_321 <p>
     * <br>
     * Function Describe: 后雾灯开关信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: On <br>
         0x2: Off <br>
         0x3: Invalid <p>
     */
        public static final int REFOGLIREQ_321 = 557846637;

    /**
     * ICCHEADLIGHTHEIGHADST_321 <p>
     * <br>
     * Function Describe: 大灯高度调节 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: 0档 <br>
         0x2: 1档 <br>
         0x3: 2档 <br>
         0x4: 3档 <br>
         0x5~0x7: Reserved <p>
     */
        public static final int ICCHEADLIGHTHEIGHADST_321 = 557846639;

    /**
     * SMTENTRYPEPSSWT_321 <p>
     * <br>
     * Function Describe: 车门感应进入开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int SMTENTRYPEPSSWT_321 = 557846642;

    /**
     * LOCKAUTOCLSSUNSSWT_321 <p>
     * <br>
     * Function Describe: 锁车自动关闭遮阳帘开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: invalid <p>
     */
        public static final int LOCKAUTOCLSSUNSSWT_321 = 557846655;

    /**
     * DAYTIRUNNGLAMPSWT_321 <p>
     * <br>
     * Function Describe: 大屏使能日间行车灯开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Initializing <br>
         0x1: Disable； <br>
         0x2: Enable； <p>
     */
        public static final int DAYTIRUNNGLAMPSWT_321 = 557846657;

    /**
     * SUNSSWITCHCTRL_321 <p>
     * <br>
     * Function Describe: 遮阳帘按键控制 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: inactive <br>
        0x1: Switch Open Sunshade <br>
        0x2: Switch Close Sunshade <br>
        0x3: Stop <p>
     */
        public static final int SUNSSWITCHCTRL_321 = 557846660;

    /**
     * SUNSPOSNSET_321 <p>
     * <br>
     * Function Describe: 电动遮阳帘控制命令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0~0x64: 0%~100% <br>
         0x65: Invalid <br>
         0x66~0x7E: Reserved <br>
         0x7F: Inactive <p>
     */
        public static final int SUNSPOSNSET_321 = 557846661;

    /**
     * ICCLOGINUID_31F <p>
     * <br>
     * Function Describe: 车端账户登录UID <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 主账号 <br>
         0x1: 授权账号1 <br>
         0x2: 授权账号2 <br>
         0x3: 授权账号3 <br>
         0x4: 授权账号4 <br>
         0x5: 授权账号5 <br>
         0x6: 授权账号6 <br>
         0x7: 授权账号7 <br>
         0x8: 授权账号8 <br>
         0x9: 游客账号 <br>
         0xA~0xE: reserved <br>
         0xF: invalid <p>
     */
        public static final int ICCLOGINUID_31F = 557846675;

    /**
     * ICC_RESVACCHRGSTRTSET_31F <p>
     * <br>
     * Function Describe: 中控预约交流充电开启设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 开启 <br>
         0x2: 取消 <br>
         0x3: Reserved <p>
     */
        public static final int ICC_RESVACCHRGSTRTSET_31F = 557846677;

    /**
     * ICC_RESVACCHRGSTRTTI_HR_31F <p>
     * <br>
     * Function Describe: 中控预约交流充电开启时间(时) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_RESVACCHRGSTRTTI_HR_31F = 557846678;

    /**
     * ICC_RESVACCHRGSTRTTI_MINS_31F <p>
     * <br>
     * Function Describe: 中控预约交流充电开启时间(分) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_RESVACCHRGSTRTTI_MINS_31F = 557846679;

    /**
     * ICC_MONRESVACCHRGREPSTRTSET_31F <p>
     * <br>
     * Function Describe: 周一预约交流充电重复开启设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 不重复 <br>
         0x1: 重复 <p>
     */
        public static final int ICC_MONRESVACCHRGREPSTRTSET_31F = 557846680;

    /**
     * ICC_RESVACCHRGENDSET_31F <p>
     * <br>
     * Function Describe: 中控预约交流充电结束设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 开启 <br>
         0x2: 取消 <br>
         0x3: Reserved <p>
     */
        public static final int ICC_RESVACCHRGENDSET_31F = 557846681;

    /**
     * ICC_RESVACCHRGENDTI_HR_31F <p>
     * <br>
     * Function Describe: 中控预约交流充电结束时间(时) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_RESVACCHRGENDTI_HR_31F = 557846682;

    /**
     * ICC_RESVACCHRGENDTI_MINS_31F <p>
     * <br>
     * Function Describe: 中控预约交流充电结束时间(分) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_RESVACCHRGENDTI_MINS_31F = 557846683;

    /**
     * ICC_MONRESVACCHRGREPENDSET_31F <p>
     * <br>
     * Function Describe: 周一预约交流充电重复结束设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 不重复 <br>
         0x1: 重复 <p>
     */
        public static final int ICC_MONRESVACCHRGREPENDSET_31F = 557846684;

    /**
     * MUSICFRQ1_2C5 <p>
     * <br>
     * Function Describe: 音乐频率一 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0~0xFF: The intensity of music <p>
     */
        public static final int MUSICFRQ1_2C5 = 557846687;

    /**
     * MUSICFRQ2_2C5 <p>
     * <br>
     * Function Describe: 音乐频率二 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0~0xFF: The intensity of music <p>
     */
        public static final int MUSICFRQ2_2C5 = 557846688;

    /**
     * MUSICFRQ3_2C5 <p>
     * <br>
     * Function Describe: 音乐频率三 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0~0xFF: The intensity of music <p>
     */
        public static final int MUSICFRQ3_2C5 = 557846689;

    /**
     * MUSICFRQ4_2C5 <p>
     * <br>
     * Function Describe: 音乐频率四 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0~0xFF: The intensity of music <p>
     */
        public static final int MUSICFRQ4_2C5 = 557846690;

    /**
     * MUSICFRQ5_2C5 <p>
     * <br>
     * Function Describe: 音乐频率五 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0~0xFF: The intensity of music <p>
     */
        public static final int MUSICFRQ5_2C5 = 557846691;

    /**
     * MUSICFRQ6_2C5 <p>
     * <br>
     * Function Describe: 音乐频率六 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0~0xFF: The intensity of music <p>
     */
        public static final int MUSICFRQ6_2C5 = 557846692;

    /**
     * MUSICFRQ7_2C5 <p>
     * <br>
     * Function Describe: 音乐频率七 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0~0xFF: The intensity of music <p>
     */
        public static final int MUSICFRQ7_2C5 = 557846693;

    /**
     * MUSICFRQ8_2C5 <p>
     * <br>
     * Function Describe: 音乐频率八 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0~0xFF: The intensity of music <p>
     */
        public static final int MUSICFRQ8_2C5 = 557846694;

    /**
     * ICC_A2BINITSTATUS_2C5 <p>
     * <br>
     * Function Describe: 车机A2B初始化状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Not Finished <br>
         0x1: Finished <br>
         0x2~0x3: Reserved <p>
     */
        public static final int ICC_A2BINITSTATUS_2C5 = 557846699;

    /**
     * ICCMUTESTS_2C5 <p>
     * <br>
     * Function Describe: 车机音频静音状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Not mute <br>
         0x1: mute <p>
     */
        public static final int ICCMUTESTS_2C5 = 557846700;

    /**
     * STEERWHLAG_150 <p>
     * <br>
     * Function Describe: 方向盘转角信号(逆时针为正，顺时针为负) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0xFFFF: Invalid <p>
     */
        public static final int STEERWHLAG_150 = 557846726;

    /**
     * STEERWHLAGVLD_150 <p>
     * <br>
     * Function Describe: 方向盘转角信号有效位 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Initializing <br>
         0x1: Valid <br>
         0x2: Invalid <br>
         0x3: Reserved <p>
     */
        public static final int STEERWHLAGVLD_150 = 557846728;

    /**
     * VEHSPDVLD_185 <p>
     * <br>
     * Function Describe: 车速信号有效位. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Initializing <br>
         0x1: Valid <br>
         0x2: Invalid <br>
         0x3: Reserved <p>
     */
        public static final int VEHSPDVLD_185 = 557846756;

    /**
     * VEHSPD_185 <p>
     * <br>
     * Function Describe: 车速信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0xFFFF: Invalid <p>
     */
        public static final int VEHSPD_185 = 557846757;

    /**
     * ESPOFFLAMP_186 <p>
     * <br>
     * Function Describe: ESP off指示灯. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Telltale Request <br>
         0x1: Telltale Request <p>
     */
        public static final int ESPOFFLAMP_186 = 557846761;

    /**
     * EBDFLTLAMP_186 <p>
     * <br>
     * Function Describe: EBD故障灯 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Telltale Request <br>
         0x1: Telltale Request <p>
     */
        public static final int EBDFLTLAMP_186 = 557846762;

    /**
     * ABSFLTLAMP_186 <p>
     * <br>
     * Function Describe: ABS故障灯 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Telltale Request <br>
         0x1: Telltale Request <p>
     */
        public static final int ABSFLTLAMP_186 = 557846763;

    /**
     * ESPTCSVDCFLTLAMP_186 <p>
     * <br>
     * Function Describe: ESP/TCS/VDC故障灯 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Telltale Request <br>
         0x1: Telltale Request <p>
     */
        public static final int ESPTCSVDCFLTLAMP_186 = 557846764;

    /**
     * ESPTCSVDCACTVLAMP_186 <p>
     * <br>
     * Function Describe: TCS/VDC工作指示灯 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Telltale Request <br>
         0x1: Telltale Request <p>
     */
        public static final int ESPTCSVDCACTVLAMP_186 = 557846765;

    /**
     * CDPACTV_186 <p>
     * <br>
     * Function Describe: CDP功能激活状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Not active <br>
         0x1: Active <p>
     */
        public static final int CDPACTV_186 = 557846766;

    /**
     * CDPAVL_186 <p>
     * <br>
     * Function Describe: CDP功能可用状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Available <br>
         0x1: Not available <p>
     */
        public static final int CDPAVL_186 = 557846767;

    /**
     * HDCSTS_186 <p>
     * <br>
     * Function Describe: HDC功能待机与激活状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: OFF <br>
         0x1: On active braking <br>
         0x2: On not active braking <br>
         0x3: Reserved <p>
     */
        public static final int HDCSTS_186 = 557846768;

    /**
     * HDCAVL_186 <p>
     * <br>
     * Function Describe: HDC功能可用状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Available <br>
         0x1: Not available <p>
     */
        public static final int HDCAVL_186 = 557846769;

    /**
     * AVHACTV_186 <p>
     * <br>
     * Function Describe: AVH功能激活状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Not active <br>
         0x1: Active <p>
     */
        public static final int AVHACTV_186 = 557846770;

    /**
     * AVHSTB_186 <p>
     * <br>
     * Function Describe: AVH功能待机状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Not standby <br>
         0x1: Standby <p>
     */
        public static final int AVHSTB_186 = 557846771;

    /**
     * AVHAVL_186 <p>
     * <br>
     * Function Describe: AVH功能可用状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Available <br>
         0x1: Not available <p>
     */
        public static final int AVHAVL_186 = 557846772;

    /**
     * CSTAVL_186 <p>
     * <br>
     * Function Describe: 舒适制动可用状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Available <br>
         0x1: Not available <p>
     */
        public static final int CSTAVL_186 = 557846773;

    /**
     * CSTSTB_186 <p>
     * <br>
     * Function Describe: 舒适制动待机状态（跟HUM的舒适制动开关状态关联：当通过HUM开关发送CstSwt=Active时，如果PBM反馈的CstStb=standby，则HUM的开关点亮。） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Not standby <br>
         0x1: Standby <p>
     */
        public static final int CSTSTB_186 = 557846779;

    /**
     * BRAKE_FLUID_SENSOR_STATE_186 <p>
     * <br>
     * Function Describe: 制动液传感器状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: BrakeFluid_Normal/Init/Default（map正常） <br>
         0x1: BrakeFluid_Empty（map异常） <br>
         0x2: BrakeFluid_Electric_error（map异常） <br>
         0x3: Reserved <p>
     */
        public static final int BRAKE_FLUID_SENSOR_STATE_186 = 557846781;

    /**
     * PBM_FAULT_IND_186 <p>
     * <br>
     * Function Describe: 制动系统故障显示（PBM故障状态） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 无故障 <br>
         0x1: 点亮仪表制动系统黄灯（故障等級1） <br>
         0x2: 点亮仪表制动系统红灯（故障等级2） <br>
         0x3: reserved <p>
     */
        public static final int PBM_FAULT_IND_186 = 557846782;

    /**
     * AVHHMIMSGN1_186 <p>
     * <br>
     * Function Describe: AVH功能打开前置条件提示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: Keep The Seatbelt Attached. <br>
         0x2: Keep The Door Closed. <br>
         0x3: Keep The Seatbelt Attached and Keep The Door Closed. <p>
     */
        public static final int AVHHMIMSGN1_186 = 557846783;

    /**
     * EZTAVL_186 <p>
     * <br>
     * Function Describe: EZT功能可用状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Available <br>
         0x1: Not available <p>
     */
        public static final int EZTAVL_186 = 557846784;

    /**
     * EZTSTB_186 <p>
     * <br>
     * Function Describe: EZT功能待机状态（低速智能辅助转向功能） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Not standby <br>
         0x1: Standby <p>
     */
        public static final int EZTSTB_186 = 557846785;

    /**
     * ESP_SWTINDCN_BDC_186 <p>
     * <br>
     * Function Describe: BDC开启指示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Not Standby <br>
         0x1: Standby <p>
     */
        public static final int ESP_SWTINDCN_BDC_186 = 557846786;

    /**
     * ESP_AVLINDCN_BDC_186 <p>
     * <br>
     * Function Describe: BDC故障指示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Avaliable <br>
         0x1: Not Available <p>
     */
        public static final int ESP_AVLINDCN_BDC_186 = 557846787;

    /**
     * ESP_ACTVINDCN_BDC_186 <p>
     * <br>
     * Function Describe: BDC激活状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Not Active <br>
         0x1: active-Lv1，only disable regen <br>
         0x2: active-Lv2:with low pressure buildup <br>
         0x3: active-Lv3，with middle pressure buildup <p>
     */
        public static final int ESP_ACTVINDCN_BDC_186 = 557846788;

    /**
     * PWRMOD_1B1 <p>
     * <br>
     * Function Describe: 低压电源状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: OFF <br>
         0x1: ACC(Reserved) <br>
         0x2: IGN ON <br>
         0x3: CRANK <p>
     */
        public static final int PWRMOD_1B1 = 557846792;

    /**
     * PWRMODVLD_1B1 <p>
     * <br>
     * Function Describe: 低压电源状态有效位 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: Invalid <br>
         0x2: Vaild <br>
         0x3: reserved <p>
     */
        public static final int PWRMODVLD_1B1 = 557846793;

    /**
     * AIRBDEPLOYMTSTS_310 <p>
     * <br>
     * Function Describe: 安全气囊碰撞状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Crash <p>
     */
        public static final int AIRBDEPLOYMTSTS_310 = 557846794;

    /**
     * DRVRSEATBLTBUCDSTS_310 <p>
     * <br>
     * Function Describe: 驾驶员侧安全带的状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Invalid <br>
         0x1: Unbuckled <br>
         0x2: Buckled <br>
         0x3: Reserved <p>
     */
        public static final int DRVRSEATBLTBUCDSTS_310 = 557846800;

    /**
     * AIRBFLTLAMP_310 <p>
     * <br>
     * Function Describe: 气囊故障指示灯 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: no fault, lamp off <br>
         0x1: fault, lamp on <br>
         0x2: customer production mode, blinking <br>
         0x3: not used <p>
     */
        public static final int AIRBFLTLAMP_310 = 557846802;

    /**
     * DRVRSEATTWARNLAMP_310 <p>
     * <br>
     * Function Describe: 主驾安全带未系指示灯 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: lamp off <br>
         0x1: lamp on <p>
     */
        public static final int DRVRSEATTWARNLAMP_310 = 557846803;

    /**
     * PASSSEATWARNLAMP_310 <p>
     * <br>
     * Function Describe: 副驾安全带未系指示灯 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: lamp off <br>
         0x1: lamp on <p>
     */
        public static final int PASSSEATWARNLAMP_310 = 557846804;

    /**
     * REDRVSEATWARNLAMP_310 <p>
     * <br>
     * Function Describe: 主驾侧二排安全带未系指示灯 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: lamp off <br>
         0x1: lamp on <p>
     */
        public static final int REDRVSEATWARNLAMP_310 = 557846805;

    /**
     * MIDRESEATWARNLAMP_310 <p>
     * <br>
     * Function Describe: 二排中间安全带未系指示灯（预留） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: lamp off <br>
         0x1: lamp on <p>
     */
        public static final int MIDRESEATWARNLAMP_310 = 557846806;

    /**
     * REPASSSEATWARNLAMP_310 <p>
     * <br>
     * Function Describe: 乘客侧二排安全带未系指示灯 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: lamp off <br>
         0x1: lamp on <p>
     */
        public static final int REPASSSEATWARNLAMP_310 = 557846807;

    /**
     * THIRDDRVSEATWARNLAMP_310 <p>
     * <br>
     * Function Describe: 三排主驾侧安全带未系指示灯 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: lamp off <br>
         0x1: lamp on <p>
     */
        public static final int THIRDDRVSEATWARNLAMP_310 = 557846808;

    /**
     * THIRDPASSSEATWARNLAMP_310 <p>
     * <br>
     * Function Describe: 三排乘客侧安全带未系指示灯 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: lamp off <br>
         0x1: lamp on <p>
     */
        public static final int THIRDPASSSEATWARNLAMP_310 = 557846809;

    /**
     * THIRDMIDSEATWARNLAMP_310 <p>
     * <br>
     * Function Describe: 三排中间安全带未系指示灯 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: lamp off <br>
         0x1: lamp on <p>
     */
        public static final int THIRDMIDSEATWARNLAMP_310 = 557846810;

    /**
     * LGTACCE_19A <p>
     * <br>
     * Function Describe: 纵向加速度(向前为正,向后为负) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0xFFFF: Invalid <p>
     */
        public static final int LGTACCE_19A = 557846817;

    /**
     * VCU_STRATEGY_SHIFT_POSITION_230 <p>
     * <br>
     * Function Describe: 挡位信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Void <br>
         0x1: P挡 <br>
         0x2: N挡 <br>
         0x3: R挡 <br>
         0x4: D挡 <br>
         0x5: Void <br>
         0x6: E挡 <br>
         0x7: S挡 <p>
     */
        public static final int VCU_STRATEGY_SHIFT_POSITION_230 = 557846819;

    /**
     * VCU_STRATEGY_SHIFT_POSN_FLAG_230 <p>
     * <br>
     * Function Describe: 挡位信号有效位 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Value OK <br>
         0x1~0x2: Not used <br>
         0x3: Value unreliable <p>
     */
        public static final int VCU_STRATEGY_SHIFT_POSN_FLAG_230 = 557846821;

    /**
     * BMS_BATT_SOC_217 <p>
     * <br>
     * Function Describe: 动力电池剩余电量SOC <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int BMS_BATT_SOC_217 = 557846822;

    /**
     * BMS_BATT_AVAIL_ENERGY_217 <p>
     * <br>
     * Function Describe: 动力电池可用能量 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int BMS_BATT_AVAIL_ENERGY_217 = 557846824;

    /**
     * BMS_PWRBATTTHERMRUNAWAYALRM_2E6 <p>
     * <br>
     * Function Describe: TR故障_P123A24_E03 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 正常 <br>
         0x1: 异常 <p>
     */
        public static final int BMS_PWRBATTTHERMRUNAWAYALRM_2E6 = 557846826;

    /**
     * BMS_MONM_MIN_TEMP_ALARM_2E6 <p>
     * <br>
     * Function Describe: 单体最低温度报警_P119321_E00 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 无故障 <br>
         0x1: 有故障 <p>
     */
        public static final int BMS_MONM_MIN_TEMP_ALARM_2E6 = 557846829;

    /**
     * VCU_CHRGGUNANTITHFTOPENSTS_49C <p>
     * <br>
     * Function Describe: 充放电枪电子锁防盗功能开启状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 关闭 <br>
         0x2: 开启 <br>
         0x3: void <p>
     */
        public static final int VCU_CHRGGUNANTITHFTOPENSTS_49C = 557846833;

    /**
     * VCU_CHRGDCHAPWRDISP_49C <p>
     * <br>
     * Function Describe: 充放电功率（显示） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_CHRGDCHAPWRDISP_49C = 557846836;

    /**
     * VCU_CHRGDCHACRT_DISP_49C <p>
     * <br>
     * Function Describe: 充放电电流 (显示) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_CHRGDCHACRT_DISP_49C = 557846837;

    /**
     * VCU_EHUCHRGDCHAREQ_49C <p>
     * <br>
     * Function Describe: 中控弹出充放电界面请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 充放电界面 <br>
         0x2: 无需求 <br>
         0x3: Invalid <p>
     */
        public static final int VCU_EHUCHRGDCHAREQ_49C = 557846838;

    /**
     * VCU_CHRGDCHABTNREQ_49C <p>
     * <br>
     * Function Describe: 充放电控制按钮请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 停止充电按钮 <br>
         0x2: 开始充电按钮 <br>
         0x3: 停止放电按钮 <br>
         0x4: 开始放电按钮 <br>
         0x5~0x7: Invalid <p>
     */
        public static final int VCU_CHRGDCHABTNREQ_49C = 557846839;

    /**
     * BATTHEATGWORKINGSTS_201 <p>
     * <br>
     * Function Describe: 电池加热工作状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始化 <br>
         0x1: 加热中 <br>
         0x2: 未加热 <p>
     */
        public static final int BATTHEATGWORKINGSTS_201 = 557846840;

    /**
     * BMS_ALRMLAMP_FS_201 <p>
     * <br>
     * Function Describe: 报警灯_BMS(功能安全) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 正常 <br>
         0x1: 异常 <p>
     */
        public static final int BMS_ALRMLAMP_FS_201 = 557846842;

    /**
     * BMS_OBC_STATE_201 <p>
     * <br>
     * Function Describe: 充电状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 连接未充电 <br>
         0x2: 交流充电中 <br>
         0x3: 直流充电中 <br>
         0x4: 充电完成 <br>
         0x5: 充电故障 <br>
         0x6: 无线充电中 <br>
         0x7: Reserved <p>
     */
        public static final int BMS_OBC_STATE_201 = 557846843;

    /**
     * BMS_ALLWREMHEATGSTS_201 <p>
     * <br>
     * Function Describe: BMS允许远程加热状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: BMS允许远程加热 <br>
         0x2: SOC低， 不允许远程加热 <br>
         0x3: 电池温度低，不允许远程加热 <br>
         0x4: Void <br>
         0x5: BMS故障 <br>
         0x6: 温度满足要求，不需要远程加热 <br>
         0x7: 车辆充电中，不需要远程加热 <p>
     */
        public static final int BMS_ALLWREMHEATGSTS_201 = 557846844;

    /**
     * BMS_CHRGINSULFCTOPENSTS_201 <p>
     * <br>
     * Function Describe: 充电保温功能开启状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 保温功能关闭 <br>
         0x1: 保温功能开启 <p>
     */
        public static final int BMS_CHRGINSULFCTOPENSTS_201 = 557846846;

    /**
     * BMS_VEH_DCHA_STA_201 <p>
     * <br>
     * Function Describe: 车辆对外放电状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 放电准备中 <br>
         0x2: 放电中 <br>
         0x3: 放电结束 <br>
         0x4: 车辆禁止放电 <br>
         0x5~0x6: void <br>
         0x7: 无效值 <p>
     */
        public static final int BMS_VEH_DCHA_STA_201 = 557846848;

    /**
     * BMS_CHRGSTSDISP_201 <p>
     * <br>
     * Function Describe: 充电状态（显示） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 充电准备中 <br>
         0x2: 交流充电中（慢充中） <br>
         0x3: 无线充电中 <br>
         0x4: 超级充电中 <br>
         0x5: 直流充电中（快充中） <br>
         0x6: 交流充电预加热中 <br>
         0x7: 无线充电预加热中 <br>
         0x8: 直流充电预加热中 <br>
         0x9: 交流充电保温中 <br>
         0xA: 无线充电保温中 <br>
         0xB: 直流充电保温中 <br>
         0xC: 充电结束 <br>
         0xD: 充电故障结束 <br>
         0xE~0x1F: Reserved <p>
     */
        public static final int BMS_CHRGSTSDISP_201 = 557846852;

    /**
     * BMS_BATTLOWTEMPINDCR_201 <p>
     * <br>
     * Function Describe: 电池低温指示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 无指示 <br>
         0x1: 指示 <p>
     */
        public static final int BMS_BATTLOWTEMPINDCR_201 = 557846853;

    /**
     * BMS_CHRGSTSPROMT_201 <p>
     * <br>
     * Function Describe: 充电相关状态提示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 不显示 <br>
         0x1: 电池处于健康充电中，充电时间将延长 <br>
         0x2: 为保护长期放置的电池，正在启动小电流激活充电，充电时间将延长 <br>
         0x3: 车辆空调开启，充电功率降低，充电时间将延长 <br>
         0x4: 动力电池加热已开启 <br>
         0x5: 充电桩电压输出能力无法满足车辆需求，车辆无法充满，建议更换充电桩 <br>
         0x6: 充电桩功率低于车辆最大允许充电功率，充电时间将延长 <br>
         0x7: 充电插座过温，功率受限，请联系授权经销商 <br>
         0x8: 车载充电机过温，功率受限，请联系授权经销商 <br>
         0x9~0xFF: 预留 <p>
     */
        public static final int BMS_CHRGSTSPROMT_201 = 557846854;

    /**
     * BMS_CHRGDCHAFLTPROMT_201 <p>
     * <br>
     * Function Describe: 充放电停止原因提示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 不显示 <br>
         0x1: 车辆充电系统故障，请重试或联系经销商 <br>
         0x2: 车辆续驶里程低于放电截止里程，放电停止 <br>
         0x3: 车辆达到充电截止SOC，充电停止 <br>
         0x4: 充电桩通讯异常，请检查充电桩状态并重试 <br>
         0x5: 充电停止:充电桩异常输出，为保护动力电池，已自动停止充电，若继续使用该充电桩存在损伤电池的风险，建议更换充电桩 <br>
         0x6: 充电停止:充电桩电压输出能力无法满足车辆需求，车辆无法充电，建议更换充电桩 <br>
         0x7: 充电桩电网断电 <br>
         0x8: 充电桩供电异常，请检查充电桩状态并重试 <br>
         0x9: 车辆放电系统故障，请重试或联系经销商。 <br>
         0xA: 充电设备功率不足，无法开启电池加热 <br>
         0xB: 充电设备功率不足，无法开启电池保温 <br>
         0xC: 车辆低于放电截止SOC，放电停止 <br>
         0xD: 车辆准备OTA，充电停止； <br>
         0xE~0x2D: 预留 <br>
         0x2E: 充电桩停止充电 <br>
         0x2F~0xFF: 预留 <p>
     */
        public static final int BMS_CHRGDCHAFLTPROMT_201 = 557846855;

    /**
     * BMS_CHRGOPERGUIDEPROMT_201 <p>
     * <br>
     * Function Describe: 充电操作引导提示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 不显示 <br>
         0x1: 充电枪未完好连接，请重新插拔枪。 <br>
         0x2: 放电枪未完好连接，请重新插拔枪。 <br>
         0x3: 充电桩未启动，请启动充电桩。 <br>
         0x4: 请连接好充电桩或用电设备 <br>
         0x5: 请连接用电设备 <br>
         0x6: 请连接充电枪 <br>
         0x7: 当前即插即充已禁用，请扫码启动充电 <br>
         0x8: 充电电流限值已调低，可能异常停止充电，需要移除车内插座上的用电设备 <br>
         0x9: 充电电流限值过低，可能异常停止充电，需要更换充电桩或调高充电电流限值 <br>
         0xA~0xFF: 预留 <p>
     */
        public static final int BMS_CHRGOPERGUIDEPROMT_201 = 557846856;

    /**
     * VCU_MONRPWRBATTTHERMRUNAWAYALRM_482 <p>
     * <br>
     * Function Describe: VCU监控TR故障_P134C00_E03 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 正常 <br>
         0x1: 报警 <p>
     */
        public static final int VCU_MONRPWRBATTTHERMRUNAWAYALRM_482 = 557846862;

    /**
     * VCU_SHIFTOPERRMN_482 <p>
     * <br>
     * Function Describe: 换挡操作提醒 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 请先减速再换挡 <br>
         0x2: 请确认车辆READY后再换挡 <br>
         0x3: 请踩制动换挡 <br>
         0x4: 不满足换挡条件 <br>
         0x5: 充电中 无法换挡 <br>
         0x6~0x9: Reserved <br>
         0xA: 请将挡位切换至P挡 <br>
         0xB: 请将挡位切换至N挡 <br>
         0xC~0xF: Reserved <p>
     */
        public static final int VCU_SHIFTOPERRMN_482 = 557846863;

    /**
     * VCU_DRVGMILGDISPTYECFM_482 <p>
     * <br>
     * Function Describe: 续驶里程显示类型确认 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 标准续航 <br>
         0x1: 动态续航 <p>
     */
        public static final int VCU_DRVGMILGDISPTYECFM_482 = 557846864;

    /**
     * VCU_SOCLOCHRGRMN_482 <p>
     * <br>
     * Function Describe: 电量低充电提醒 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 无需求 <br>
         0x1: 电量低充电提醒 <br>
         0x2: 低温电量低充电提醒 <br>
         0x3: “动力电池电量低，请上READY“ <br>
         0x4: “动力电池电量过低，整车下高压“ <br>
         0x5~0x7: 预留 <p>
     */
        public static final int VCU_SOCLOCHRGRMN_482 = 557846865;

    /**
     * VCU_ALRMLAMP_FS_482 <p>
     * <br>
     * Function Describe: 报警灯_VCU（功能安全） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 灯灭 <br>
         0x1: 灯亮 <p>
     */
        public static final int VCU_ALRMLAMP_FS_482 = 557846866;

    /**
     * VCU_EGYFBPWRLIMSTA_483 <p>
     * <br>
     * Function Describe: 能量回收功率限制状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 未限制 <br>
         0x1: 电池电量高，能量回收制动力暂时性减弱 <br>
         0x2: 电池温度低，能量回收制动力暂时性减弱 <br>
         0x3~0xF: 预留 <p>
     */
        public static final int VCU_EGYFBPWRLIMSTA_483 = 557846869;

    /**
     * VCU_EXHIBCARMODNOTICE_575 <p>
     * <br>
     * Function Describe: 展车模式弹屏  <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 不显示 <br>
         0x1: 显示开启弹屏 <br>
         0x2: 显示关闭弹屏 <br>
         0x3: Reserved <p>
     */
        public static final int VCU_EXHIBCARMODNOTICE_575 = 557846873;

    /**
     * VCU_CHRGRESVSTSDISP_575 <p>
     * <br>
     * Function Describe: 充电预约状态显示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 预约充电 <br>
         0x2: 定时出发 <br>
         0x3~0x7: Reserved <p>
     */
        public static final int VCU_CHRGRESVSTSDISP_575 = 557846874;

    /**
     * VCU_EXHIBCARMODTEXT_575 <p>
     * <br>
     * Function Describe: 展车模式指令请求（文字显示状态） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 不显示 <br>
         0x1: 闪烁（完成1次请求） <br>
         0x2~0x3: Reserved <p>
     */
        public static final int VCU_EXHIBCARMODTEXT_575 = 557846875;

    /**
     * AUTPOWOFFFUNSTA_575 <p>
     * <br>
     * Function Describe: 自动下电功能状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值； <br>
         0x1: 正常计时下电 <br>
         0x2: 不计时下电 <br>
         0x3: Reserved <p>
     */
        public static final int AUTPOWOFFFUNSTA_575 = 557846876;

    /**
     * VCU_ELECTCLOCKANORMRMN_575 <p>
     * <br>
     * Function Describe: 电子锁异常提示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 不显示 <br>
         0x1: 交流充电口电子锁未正常解锁，请手动解锁。 <br>
         0x2: 交流充电口电子锁未正常锁止，充电功率受限，请重试或联系经销商。 <br>
         0x3: 交流充电口电子锁未正常锁止，无法开启充电 <br>
         0x4~0x7: 预留 <p>
     */
        public static final int VCU_ELECTCLOCKANORMRMN_575 = 557846877;

    /**
     * VCU_EXHIBCARMODDISABLENOTICE_575 <p>
     * <br>
     * Function Describe: 展车模式状态下VCU部分功能不可用 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 不显示 <br>
         0x1: 显示通用提示 <br>
         0x2~0x3: Reserved <p>
     */
        public static final int VCU_EXHIBCARMODDISABLENOTICE_575 = 557846878;

    /**
     * VCU_USRRMN_575 <p>
     * <br>
     * Function Describe: 用户人机交互提示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 不显示 <br>
         0x1: 为保护动力电池，建议将充电截止SOC设置到90%以下 <br>
         0x2: 动力电池电量低，请进行充电 <br>
         0x3: 动力电池电量低，蓄电池智能充电禁止，车辆长期停放后可能无法启动，请尽快进行充电 <br>
         0x4: 蓄电池电量低，车辆可能无法启动，请尽快进行充电 <br>
         0x5: 蓄电池智能充电已启动 <br>
         0x6: 动力电池热管理系统异常提示 <br>
         0x7: 为确保您爱车动力电池保持最佳状态，建议您近期对车辆进行满充电（将电量充至100%） <br>
         0x8~0xF: reserved <p>
     */
        public static final int VCU_USRRMN_575 = 557846879;

    /**
     * VCU_EXHIBITIONMODE_575 <p>
     * <br>
     * Function Describe: 展车模式信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值； <br>
        0x1: 室内开启 <br>
        0x2: 展车模式关闭 <br>
        0x3: 室外开启 <p>
     */
        public static final int VCU_EXHIBITIONMODE_575 = 557846880;

    /**
     * VCU_SETCHRGENDSOC_616 <p>
     * <br>
     * Function Describe: 车辆当前充电截止SOC <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_SETCHRGENDSOC_616 = 557846881;

    /**
     * VCU_DRIVE_RANGE_FLAG_616 <p>
     * <br>
     * Function Describe: 续驶里程有效位 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Invalid <br>
         0x1: Valid <p>
     */
        public static final int VCU_DRIVE_RANGE_FLAG_616 = 557846882;

    /**
     * VCU_DRIVE_RANGE_616 <p>
     * <br>
     * Function Describe: 续驶里程 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_DRIVE_RANGE_616 = 557846884;

    /**
     * VCU_TOWMODEENABLESIG_617 <p>
     * <br>
     * Function Describe: 牵引模式使能信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 未使能 <br>
         0x1: 使能 <p>
     */
        public static final int VCU_TOWMODEENABLESIG_617 = 557846885;

    /**
     * VCU_TOWMODESIG_617 <p>
     * <br>
     * Function Describe: 牵引模式信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 牵引模式开启 <br>
         0x2: 牵引模式退出 <br>
         0x3: Reserved <p>
     */
        public static final int VCU_TOWMODESIG_617 = 557846886;

    /**
     * VCU_PARKING_REMIND_PGEAR_617 <p>
     * <br>
     * Function Describe: P挡未驻车提醒 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 无提示 <br>
         0x1: 有提醒 <p>
     */
        public static final int VCU_PARKING_REMIND_PGEAR_617 = 557846889;

    /**
     * VCU_ENERGY_CONSUM_AV_486 <p>
     * <br>
     * Function Describe: 小计能耗 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_ENERGY_CONSUM_AV_486 = 557846891;

    /**
     * VCU_ENERGY_CONSUM_IN_486 <p>
     * <br>
     * Function Describe: 瞬时能耗1（百公里能耗） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_ENERGY_CONSUM_IN_486 = 557846892;

    /**
     * VCU_ENERGY_CONSUM_HISTORY_486 <p>
     * <br>
     * Function Describe: 累计能耗 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_ENERGY_CONSUM_HISTORY_486 = 557846893;

    /**
     * VCU_DRVR_PWR_LIM_LIG_631 <p>
     * <br>
     * Function Describe: 驱动功率限制指示灯 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 灯灭 <br>
         0x1: 灯亮 <p>
     */
        public static final int VCU_DRVR_PWR_LIM_LIG_631 = 557846894;

    /**
     * VCU_MOT_TEMP_H_IND_631 <p>
     * <br>
     * Function Describe: 驱动电机系统过热显示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 正常 <br>
         0x1: 异常 <p>
     */
        public static final int VCU_MOT_TEMP_H_IND_631 = 557846895;

    /**
     * VCU_REFRSHMODRESTRNTFCTCMD_357 <p>
     * <br>
     * Function Describe: 刷写模式抑制功能启动指令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 自动声光动抑制+安全抑制 <br>
         0x2: 自动声光动抑制 <br>
         0x3: 安全抑制 <p>
     */
        public static final int VCU_REFRSHMODRESTRNTFCTCMD_357 = 557846898;

    /**
     * VCU_INHIBITFUNCMDVLD_357 <p>
     * <br>
     * Function Describe: 抑制指令有效标志 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 无效 <br>
         0x1: 有效 <p>
     */
        public static final int VCU_INHIBITFUNCMDVLD_357 = 557846899;

    /**
     * VCU_BRAKE_START_REQ_22B <p>
     * <br>
     * Function Describe: 请踩刹车启动 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 无显示 <br>
         0x1: 文字显示 <p>
     */
        public static final int VCU_BRAKE_START_REQ_22B = 557846904;

    /**
     * VCU_HVDISCNCTNLAMP_22B <p>
     * <br>
     * Function Describe: 高压断开指示灯 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 熄灭 <br>
         0x1: 点亮 <p>
     */
        public static final int VCU_HVDISCNCTNLAMP_22B = 557846905;

    /**
     * VCU_BATT_PWRON_22B <p>
     * <br>
     * Function Describe: 高压连接状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 连接状态 <br>
         0x1: 断开状态 <p>
     */
        public static final int VCU_BATT_PWRON_22B = 557846906;

    /**
     * VCU_BATTERY_FAULT_IND_22B <p>
     * <br>
     * Function Describe: 蓄电池故障显示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 正常 <br>
         0x1: 异常 <p>
     */
        public static final int VCU_BATTERY_FAULT_IND_22B = 557846907;

    /**
     * VCU_OBC_REMIND_LAMP_22B <p>
     * <br>
     * Function Describe: 充电提醒及充电状态指示灯 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 灯灭 <br>
         0x1: 灯亮 <p>
     */
        public static final int VCU_OBC_REMIND_LAMP_22B = 557846908;

    /**
     * VCU_READY_LAMP_22B <p>
     * <br>
     * Function Describe: READY灯 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 未准备好 <br>
         0x1: 已准备好 <p>
     */
        public static final int VCU_READY_LAMP_22B = 557846913;

    /**
     * VCU_CHRG_DCHA_GUN_LIG_CMD_22B <p>
     * <br>
     * Function Describe: 充放电枪连接指示灯 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 灯灭 <br>
         0x1: 灯亮 <p>
     */
        public static final int VCU_CHRG_DCHA_GUN_LIG_CMD_22B = 557846914;

    /**
     * VCU_SYS_FAULT_LAMP_22B <p>
     * <br>
     * Function Describe: 整车系统故障灯 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 正常，灯灭 <br>
         0x1: 异常，点亮 <br>
         0x2~0x3: Void <p>
     */
        public static final int VCU_SYS_FAULT_LAMP_22B = 557846915;

    /**
     * VCU_USER_OFF_ECC_CMD_22B <p>
     * <br>
     * Function Describe: 提醒用户关闭空调显示指令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 不显示 <br>
         0x1: 显示 <p>
     */
        public static final int VCU_USER_OFF_ECC_CMD_22B = 557846918;

    /**
     * TBOX_RESVACCHRGOPENSTS_4F4 <p>
     * <br>
     * Function Describe: TBOX预约交流充电开启状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 开启 <br>
         0x2: 关闭 <br>
         0x3: Reserved <p>
     */
        public static final int TBOX_RESVACCHRGOPENSTS_4F4 = 557846919;

    /**
     * TBOX_RESVACCHRGSTRTTI_HR_62E <p>
     * <br>
     * Function Describe: TBOX预约交流充电开启时间（时） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int TBOX_RESVACCHRGSTRTTI_HR_62E = 557846923;

    /**
     * TBOX_RESVACCHRGSTRTTI_MINS_62E <p>
     * <br>
     * Function Describe: TBOX预约交流充电开启时间（分） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int TBOX_RESVACCHRGSTRTTI_MINS_62E = 557846924;

    /**
     * TBOX_MONRESVACCHRGREPSTRTSET_62E <p>
     * <br>
     * Function Describe: 周一预约交流充电重复开启状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 不重复 <br>
         0x1: 重复 <p>
     */
        public static final int TBOX_MONRESVACCHRGREPSTRTSET_62E = 557846925;

    /**
     * TBOX_RESVACCHRGENDTI_HR_62E <p>
     * <br>
     * Function Describe: TBOX预约交流充电结束时间（时） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int TBOX_RESVACCHRGENDTI_HR_62E = 557846932;

    /**
     * TBOX_RESVACCHRGENDTI_MINS_62E <p>
     * <br>
     * Function Describe: TBOX预约交流充电结束时间（分） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int TBOX_RESVACCHRGENDTI_MINS_62E = 557846934;

    /**
     * TBOX_RESVACCHRGENDSET_62E <p>
     * <br>
     * Function Describe: TBOX预约交流充电结束状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 开启 <br>
         0x2: 关闭 <br>
         0x3: Reserved <p>
     */
        public static final int TBOX_RESVACCHRGENDSET_62E = 557846935;

    /**
     * TBOX_MONRESVACCHRGREPENDSET_62E <p>
     * <br>
     * Function Describe: 周一预约交流充电重复结束状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 不重复 <br>
         0x1: 重复 <p>
     */
        public static final int TBOX_MONRESVACCHRGREPENDSET_62E = 557846936;

    /**
     * ICC_CHARGEDISCHARGECMD_377 <p>
     * <br>
     * Function Describe: 中控充放电控制指令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: inactive <br>
         0x1: 停止充电指令 <br>
         0x2: 开始充电指令 <br>
         0x3: 停止放电指令 <br>
         0x4: 开始放电指令 <br>
         0x5~0x6: reserved <br>
         0x7: Invalid <p>
     */
        public static final int ICC_CHARGEDISCHARGECMD_377 = 557846946;

    /**
     * ICC_SETCHRGENDSOC_377 <p>
     * <br>
     * Function Describe: 中控设置充电截止SOC <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0~0x64: 充电限值 <p>
     */
        public static final int ICC_SETCHRGENDSOC_377 = 557846948;

    /**
     * ICC_SETACCHGCURRLIM_377 <p>
     * <br>
     * Function Describe: 中控设置交流充电电流限值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: inactive <p>
     */
        public static final int ICC_SETACCHGCURRLIM_377 = 557846949;

    /**
     * ICC_SETCHRGDCHAGUNUNLCKCMD_377 <p>
     * <br>
     * Function Describe: 中控设置充放电枪解锁指令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: inactive <br>
         0x1: 解锁 <br>
         0x2: reserved <br>
         0x3: invalid <p>
     */
        public static final int ICC_SETCHRGDCHAGUNUNLCKCMD_377 = 557846950;

    /**
     * ICC_SET_CHGER_ANTI_STEAL_377 <p>
     * <br>
     * Function Describe: 充放电枪电子锁防盗功能开启指令（慢充） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: inactive <br>
         0x1: 关闭 <br>
         0x2: 开启 <br>
         0x3: invalid <p>
     */
        public static final int ICC_SET_CHGER_ANTI_STEAL_377 = 557846951;

    /**
     * ICC_CHG_INSLATION_REQ_377 <p>
     * <br>
     * Function Describe: 中控充电保温功能请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: inactive <br>
         0x1: 开启 <br>
         0x2: 关闭 <br>
         0x3: invalid <p>
     */
        public static final int ICC_CHG_INSLATION_REQ_377 = 557846952;

    /**
     * ICC_PREHEATFUNREQ_377 <p>
     * <br>
     * Function Describe: 中控预热功能请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: inactive <br>
         0x1: 开启 <br>
         0x2: 关闭 <br>
         0x3: invalid <p>
     */
        public static final int ICC_PREHEATFUNREQ_377 = 557846953;

    /**
     * ICC_PULLMODREQ_377 <p>
     * <br>
     * Function Describe: ICC牵引模式请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: inactive <br>
         0x1: 开启请求 <br>
         0x2: 退出请求 <br>
         0x3: invalid <p>
     */
        public static final int ICC_PULLMODREQ_377 = 557846954;

    /**
     * ICC_WASHCARMODREQ_377 <p>
     * <br>
     * Function Describe: 洗车模式开关请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: inactive； <br>
         0x1: 开启洗车模式； <br>
         0x2: 开启自动洗车模式； <br>
         0x3: 关闭自动洗车模式； <br>
         0x4: 关闭洗车模式； <br>
         0x5~0xE: reserved <br>
         0xF: invalid <p>
     */
        public static final int ICC_WASHCARMODREQ_377 = 557846955;

    /**
     * USERPOWEROFFFEEDBACK_377 <p>
     * <br>
     * Function Describe: 用户下电状态反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: inactive <br>
         0x1: 允许下电 <br>
         0x2: 不允许下电 <br>
         0x3: invalid <p>
     */
        public static final int USERPOWEROFFFEEDBACK_377 = 557846956;

    /**
     * ICC_DRVGMILGDISPTYPSET_377 <p>
     * <br>
     * Function Describe: 续驶里程显示类型设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 无请求 no request <br>
        0x1: 标准续航 standard <br>
        0x2: 动态续航 <br>
        0x3: WLTC续航 <p>
     */
        public static final int ICC_DRVGMILGDISPTYPSET_377 = 557846957;

    /**
     * HMIEZTSWHMSG_377 <p>
     * <br>
     * Function Describe: EZT功能开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: On <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int HMIEZTSWHMSG_377 = 557846960;

    /**
     * ICC_DRIMODREQ_377 <p>
     * <br>
     * Function Describe: ICC驾驶模式请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: inactive <br>
         0x1: 运动模式请求 <br>
         0x2: 舒适模式请求 <br>
         0x3: 经济模式请求 <br>
         0x4: 雪地模式请求 <br>
         0x5: 泥地模式请求 <br>
         0x6: 沙地模式 请求 <br>
         0x7: One-Pedal模式请求 <br>
         0x8: E-Auto模式请求 <br>
         0x9~0xA: 预留 <br>
         0xB: 极致节能模式请求 <br>
         0xC: 个性化模式请求 <br>
         0xD: 晕车舒缓模式请求 <br>
         0xE~0xF: Reserved <p>
     */
        public static final int ICC_DRIMODREQ_377 = 557846961;

    /**
     * ICC_EPSMODEREQ_377 <p>
     * <br>
     * Function Describe: ICC EPS模式请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: inactive <br>
         0x1: Standard request <br>
         0x2: Comfort request <br>
         0x3: Sport request <br>
         0x4~0x6: Reserved <br>
         0x7: invalid <p>
     */
        public static final int ICC_EPSMODEREQ_377 = 557846962;

    /**
     * ICC_EXHIBCARMODNOTICEFLAG_377 <p>
     * <br>
     * Function Describe: 展车模式弹屏确认标志位 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
        0x1: 确认（室内开启确认，关闭确认） <br>
        0x2: 取消 <br>
        0x3: 室外开启确认 <p>
     */
        public static final int ICC_EXHIBCARMODNOTICEFLAG_377 = 557846964;

    /**
     * BDCSWT_377 <p>
     * <br>
     * Function Describe: BDC功能开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: On <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int BDCSWT_377 = 557846965;

    /**
     * ICC_ACMODEREQ_377 <p>
     * <br>
     * Function Describe: ICC加速模式请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: inactive <p>
     */
        public static final int ICC_ACMODEREQ_377 = 557846966;

    /**
     * ICC_BRAEGYRECOVINTEN_377 <p>
     * <br>
     * Function Describe: ICC能量回收强度请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: inactive <br>
         0x1~0x65: 设置值 <br>
         0x66~0xFE: Reserved <br>
         0xFF: invalid <p>
     */
        public static final int ICC_BRAEGYRECOVINTEN_377 = 557846967;

    /**
     * ICC_PWROFFREQ_377 <p>
     * <br>
     * Function Describe: 主动下电请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 无请求 <br>
         0x2: 有请求 <br>
         0x3: Reserved <p>
     */
        public static final int ICC_PWROFFREQ_377 = 557846968;

    /**
     * ICC_KEEPPWRONSWTSTS_377 <p>
     * <br>
     * Function Describe: 自动下电开关状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 开关打开 <br>
         0x2: 开关关闭 <br>
         0x3: Reserved <p>
     */
        public static final int ICC_KEEPPWRONSWTSTS_377 = 557846969;

    /**
     * ICC_CREEPSPEEDREQ_377 <p>
     * <br>
     * Function Describe: ICC蠕行车速请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 低 <br>
         0x2: 中 <br>
         0x3: 高 <br>
         0x4: 停止 <br>
         0x5~0x7: Reserved <p>
     */
        public static final int ICC_CREEPSPEEDREQ_377 = 557846970;

    /**
     * ICCENRGMOD_377 <p>
     * <br>
     * Function Describe: ICC能量模式请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: 优先用油 <br>
         0x2: 优先用电 <br>
         0x3: 自动模式 <br>
         0x4: 强制纯电 <br>
         0x5: 电量自定义 <br>
         0x6: 智能模式 <br>
         0x7: Reserved <p>
     */
        public static final int ICCENRGMOD_377 = 557846971;

    /**
     * ICC_REFSWITCHSTS_377 <p>
     * <br>
     * Function Describe: 加油开关指令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: 开启 <br>
         0x2: 关闭 <br>
         0x3: Invalid <p>
     */
        public static final int ICC_REFSWITCHSTS_377 = 557846974;

    /**
     * ICC_PARKCHARGEST_377 <p>
     * <br>
     * Function Describe: 电量过低起动增程器发电开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: On <br>
         0x2: Off <br>
         0x3: Reserved <p>
     */
        public static final int ICC_PARKCHARGEST_377 = 557846975;

    /**
     * ICC_EMISSTESTMODE_377 <p>
     * <br>
     * Function Describe: 尾气检测开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: On <br>
         0x2: Off <br>
         0x3: Reserved <p>
     */
        public static final int ICC_EMISSTESTMODE_377 = 557846981;

    /**
     * ICC_IDLEMODE_377 <p>
     * <br>
     * Function Describe: 怠速模式请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: 低怠速模式 <br>
         0x2: 高怠速模式 <br>
         0x3: Reserved <p>
     */
        public static final int ICC_IDLEMODE_377 = 557846982;

    /**
     * ICC_PWCSWT_377 <p>
     * <br>
     * Function Describe: 前排无线充电开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICC_PWCSWT_377 = 557846983;

    /**
     * ICC_PWCR1SWT_377 <p>
     * <br>
     * Function Describe: 后排无线充电开关1 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICC_PWCR1SWT_377 = 557846984;

    /**
     * ICC_PWCR2SWT_377 <p>
     * <br>
     * Function Describe: 后排无线充电开关2 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICC_PWCR2SWT_377 = 557846985;

    /**
     * ICCACTSET3_377 <p>
     * <br>
     * Function Describe: 三排温度设置。依据功能规范，低于17℃时显示Low，高于31℃时显示High。 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1~0xF: Reserved <br>
         0x10: Low <br>
         0x11: 17℃ <br>
         0x12: 18℃ <br>
         0x13: 19℃ <br>
         0x14: 20℃ <br>
         0x15: 21℃ <br>
         0x16: 22℃ <br>
         0x17: 23℃ <br>
         0x18: 24℃ <br>
         0x19: 25℃ <br>
         0x1A: 26℃ <br>
         0x1B: 27℃ <br>
         0x1C: 28℃ <br>
         0x1D: 29℃ <br>
         0x1E: 30℃ <br>
         0x1F: 31℃ <br>
         0x20: High <br>
         0x21~0x3E: Reserved <br>
         0x3F: Invalid <p>
     */
        public static final int ICCACTSET3_377 = 557846989;

    /**
     * ICCACBLOWRLELSET2_377 <p>
     * <br>
     * Function Describe: 二排风量设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Level 0(OFF) <br>
         0x2: Level 1 <br>
         0x3: Level 2 <br>
         0x4: Level 3 <br>
         0x5: Level 4 <br>
         0x6: Level 5 <br>
         0x7: Level 6 <br>
         0x8: Level 7 <br>
         0x9: Level 8 <br>
         0xA~0xE: Reserved <br>
         0xF: Invalid <p>
     */
        public static final int ICCACBLOWRLELSET2_377 = 557846990;

    /**
     * ICCACBLOWRLELSET3_377 <p>
     * <br>
     * Function Describe: 三排风量设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Level 0(OFF) <br>
         0x2: Level 1 <br>
         0x3: Level 2 <br>
         0x4: Level 3 <br>
         0x5: Level 4 <br>
         0x6: Level 5 <br>
         0x7: Level 6 <br>
         0x8: Level 7 <br>
         0x9: Level 8 <br>
         0xA~0xE: Reserved <br>
         0xF: Invalid <p>
     */
        public static final int ICCACBLOWRLELSET3_377 = 557846991;

    /**
     * ICCINTELLIGENTIZEPURSET_377 <p>
     * <br>
     * Function Describe: PM2.5主动净化开关设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: NO Request <br>
         0x1: OFF <br>
         0x2: ON <br>
         0x3: Reserved <p>
     */
        public static final int ICCINTELLIGENTIZEPURSET_377 = 557846992;

    /**
     * ICCWIONSET_377 <p>
     * <br>
     * Function Describe: 水离子开关控制 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: NO Request <br>
         0x1: OFF <br>
         0x2: ON <br>
         0x3: Reserved <p>
     */
        public static final int ICCWIONSET_377 = 557846994;

    /**
     * ICCACAUTOSWT2_377 <p>
     * <br>
     * Function Describe: 二排AUTO按钮 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICCACAUTOSWT2_377 = 557846995;

    /**
     * ICCACAIRDISTBNSET1_L_377 <p>
     * <br>
     * Function Describe: 主驾吹风模式请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: NO Request <br>
        0x1: Face <br>
        0x2: Face+Foot <br>
        0x3: Foot <br>
        0x4: Foot+Defrost <br>
        0x5: Defrost（Reserved） <br>
        0x6: Face & Defrost <br>
        0x7: Face & Foot & Defrost <p>
     */
        public static final int ICCACAIRDISTBNSET1_L_377 = 557846997;

    /**
     * ICCACAIRDISTBNSET2_377 <p>
     * <br>
     * Function Describe: 二排出风模式请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: NO Request <br>
         0x1: BlowFace <br>
         0x2: BlowFace & Foot <br>
         0x3: BlowFoot <br>
         0x4: OFF <br>
         0x5~0x7: Reserved <p>
     */
        public static final int ICCACAIRDISTBNSET2_377 = 557846998;

    /**
     * ICCACAIRDISTBNSET3_377 <p>
     * <br>
     * Function Describe: 三排出风模式请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: NO Request <br>
         0x1: BlowFace <br>
         0x2: BlowFace & Foot <br>
         0x3: BlowFoot <br>
         0x4: OFF <br>
         0x5~0x7: Reserved <p>
     */
        public static final int ICCACAIRDISTBNSET3_377 = 557846999;

    /**
     * ICCACONOFFSWT1_377 <p>
     * <br>
     * Function Describe: 1排空调开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: On <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICCACONOFFSWT1_377 = 557847000;

    /**
     * ICCACONOFFSWT2_377 <p>
     * <br>
     * Function Describe: 2排空调开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: On <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICCACONOFFSWT2_377 = 557847001;

    /**
     * ICCACONOFFSWT3_377 <p>
     * <br>
     * Function Describe: 3排空调开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: On <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICCACONOFFSWT3_377 = 557847002;

    /**
     * ICCACACSWT_377 <p>
     * <br>
     * Function Describe: 压缩机开关按钮 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICCACACSWT_377 = 557847003;

    /**
     * ICCACAUTOSWT1_377 <p>
     * <br>
     * Function Describe: 一排AUTO按钮 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICCACAUTOSWT1_377 = 557847004;

    /**
     * ICCACDEFRSTSWT_377 <p>
     * <br>
     * Function Describe: ICC AC defrost switch前除霜按钮 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICCACDEFRSTSWT_377 = 557847005;

    /**
     * ICCACAIRRECIRCSWT_377 <p>
     * <br>
     * Function Describe: 内循环按钮 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: NO Request <br>
        0x1: Internal <br>
        0x2: External <br>
        0x3: Auto <p>
     */
        public static final int ICCACAIRRECIRCSWT_377 = 557847006;

    /**
     * ICCACDUALSWT_377 <p>
     * <br>
     * Function Describe: 切换单双区按钮 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON(双区不同步) <br>
         0x2: OFF(双区同步) <br>
         0x3: Invalid <p>
     */
        public static final int ICCACDUALSWT_377 = 557847008;

    /**
     * ICCACBLOWERLESET1_377 <p>
     * <br>
     * Function Describe: 一排风量设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Level 0(OFF) <br>
         0x2: Level 1 <br>
         0x3: Level 2 <br>
         0x4: Level 3 <br>
         0x5: Level 4 <br>
         0x6: Level 5 <br>
         0x7: Level 6 <br>
         0x8: Level 7 <br>
         0x9: Level 8 <br>
         0xA~0xE: Reserved <br>
         0xF: Invalid <p>
     */
        public static final int ICCACBLOWERLESET1_377 = 557847010;

    /**
     * ICCACTSET1_L_377 <p>
     * <br>
     * Function Describe: 一排主驾温度设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1~0xF: Reserved <br>
         0x10: Low <br>
         0x11: 17℃ <br>
         0x12: 18℃ <br>
         0x13: 19℃ <br>
         0x14: 20℃ <br>
         0x15: 21℃ <br>
         0x16: 22℃ <br>
         0x17: 23℃ <br>
         0x18: 24℃ <br>
         0x19: 25℃ <br>
         0x1A: 26℃ <br>
         0x1B: 27℃ <br>
         0x1C: 28℃ <br>
         0x1D: 29℃ <br>
         0x1E: 30℃ <br>
         0x1F: 31℃ <br>
         0x20: High <br>
         0x21~0x3E: Reserved <br>
         0x3F: Invalid <p>
     */
        public static final int ICCACTSET1_L_377 = 557847011;

    /**
     * ICCACTSET2_377 <p>
     * <br>
     * Function Describe: 二排温度设置。依据功能规范，低于17℃时显示Low，高于31℃时显示High <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1~0xF: Reserved <br>
         0x10: Low <br>
         0x11: 17℃ <br>
         0x12: 18℃ <br>
         0x13: 19℃ <br>
         0x14: 20℃ <br>
         0x15: 21℃ <br>
         0x16: 22℃ <br>
         0x17: 23℃ <br>
         0x18: 24℃ <br>
         0x19: 25℃ <br>
         0x1A: 26℃ <br>
         0x1B: 27℃ <br>
         0x1C: 28℃ <br>
         0x1D: 29℃ <br>
         0x1E: 30℃ <br>
         0x1F: 31℃ <br>
         0x20: High <br>
         0x21~0x3E: Reserved <br>
         0x3F: Invalid <p>
     */
        public static final int ICCACTSET2_377 = 557847012;

    /**
     * ICCACCMFTSET_377 <p>
     * <br>
     * Function Describe: 空调舒适性设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Gentle <br>
         0x2: Standard <br>
         0x3: Powerful <br>
         0x4~0x6: Reserved <br>
         0x7: Invalid <p>
     */
        public static final int ICCACCMFTSET_377 = 557847013;

    /**
     * ICCACSELFDESICNSWT_377 <p>
     * <br>
     * Function Describe: 自干燥功能开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICCACSELFDESICNSWT_377 = 557847014;

    /**
     * ICCACPREVENTNSWT_377 <p>
     * <br>
     * Function Describe: 预通风功能开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICCACPREVENTNSWT_377 = 557847015;

    /**
     * USERDEFINESAVEBTN_377 <p>
     * <br>
     * Function Describe: 自定义保存按钮状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: no operation <br>
         0x2: operation <br>
         0x3: Invalid <p>
     */
        public static final int USERDEFINESAVEBTN_377 = 557847016;

    /**
     * USERDEFINEMODBTN_377 <p>
     * <br>
     * Function Describe: 自定义模式按键状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: no operation <br>
         0x2: operation <br>
         0x3: Invalid <p>
     */
        public static final int USERDEFINEMODBTN_377 = 557847017;

    /**
     * ICCQUICKCOOLSWT_377 <p>
     * <br>
     * Function Describe: 车机一键凉爽开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICCQUICKCOOLSWT_377 = 557847018;

    /**
     * ICCQUICKHEATSWT_377 <p>
     * <br>
     * Function Describe: 车机一键加热开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICCQUICKHEATSWT_377 = 557847019;

    /**
     * ICC_ECO_BTN_STS_377 <p>
     * <br>
     * Function Describe: 空调节能模式按键状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICC_ECO_BTN_STS_377 = 557847020;

    /**
     * ICCACAIRDISTBNSET1_R_377 <p>
     * <br>
     * Function Describe: 副驾吹风模式请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: NO Request <br>
        0x1: Face <br>
        0x2: Face+Foot <br>
        0x3: Foot <br>
        0x4: Foot+Defrost <br>
        0x5: Defrost（Reserved） <br>
        0x6: Face & Defrost <br>
        0x7: Face & Foot & Defrost <p>
     */
        public static final int ICCACAIRDISTBNSET1_R_377 = 557847021;

    /**
     * ICCACTSET1_R_377 <p>
     * <br>
     * Function Describe: 一排副驾温度设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1~0xF: Reserved <br>
         0x10: Low <br>
         0x11: 17℃ <br>
         0x12: 18℃ <br>
         0x13: 19℃ <br>
         0x14: 20℃ <br>
         0x15: 21℃ <br>
         0x16: 22℃ <br>
         0x17: 23℃ <br>
         0x18: 24℃ <br>
         0x19: 25℃ <br>
         0x1A: 26℃ <br>
         0x1B: 27℃ <br>
         0x1C: 28℃ <br>
         0x1D: 29℃ <br>
         0x1E: 30℃ <br>
         0x1F: 31℃ <br>
         0x20: High <br>
         0x21~0x3E: Reserved <br>
         0x3F: Invalid <p>
     */
        public static final int ICCACTSET1_R_377 = 557847022;

    /**
     * EPBSWT_377 <p>
     * <br>
     * Function Describe: EPB软开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: On <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int EPBSWT_377 = 557847024;

    /**
     * ESPOFFSWT_377 <p>
     * <br>
     * Function Describe: ESP关闭软开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: On <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ESPOFFSWT_377 = 557847025;

    /**
     * HDCSWT_377 <p>
     * <br>
     * Function Describe: HDC软开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: On <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int HDCSWT_377 = 557847026;

    /**
     * AVHSWT_377 <p>
     * <br>
     * Function Describe: AVH软开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: On <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int AVHSWT_377 = 557847027;

    /**
     * CSTSWT_377 <p>
     * <br>
     * Function Describe: CST软开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: On <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int CSTSWT_377 = 557847028;

    /**
     * ICCDAMPERMODREQ_377 <p>
     * <br>
     * Function Describe: ICC减振器模式请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 软 <br>
         0x2: 中 <br>
         0x3: 硬 <br>
         0x4~0xF: reserved <p>
     */
        public static final int ICCDAMPERMODREQ_377 = 557847029;

    /**
     * ECC_FUC_LIMIT_CMD_56F <p>
     * <br>
     * Function Describe: 提醒用户空调功能受限显示指令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 不显示 <br>
         0x1: 显示 <p>
     */
        public static final int ECC_FUC_LIMIT_CMD_56F = 557847033;

    /**
     * VCU_INPUT_INTER_SAT_56F <p>
     * <br>
     * Function Describe: 车载插座供电交互状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 开启状态 <br>
         0x2: 关闭状态 <br>
         0x3: Reserved <p>
     */
        public static final int VCU_INPUT_INTER_SAT_56F = 557847034;

    /**
     * VCU_SOCKET_FUN_OPER_TIPS_EHU_56F <p>
     * <br>
     * Function Describe: 车载插座功能操作提示(中控) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 车辆未解防，请解防后重试 <br>
         0x2: 车内温度过高，请降温后使用 <br>
         0x3: 电源系统故障，请联系服务商 <br>
         0x4: 电量低，请充电后重试 <br>
         0x5: 动力电池功率不足，请稍后重试 <br>
         0x6: 订单未授权，请确认订单状态 <br>
         0x7: 充电桩功率过小，请拔枪后使用 <br>
         0x8: 充电功率已降低，若需满功率充电请关闭车载插座 <br>
         0x9: 检测到充放电枪，开启充放电后可正常使用 <br>
         0xA~0xF: Reserved <p>
     */
        public static final int VCU_SOCKET_FUN_OPER_TIPS_EHU_56F = 557847035;

    /**
     * TBOX_CRTTI_DAY_551 <p>
     * <br>
     * Function Describe: 当前时间_日 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Day1 <br>
         0x1E: Day31 <p>
     */
        public static final int TBOX_CRTTI_DAY_551 = 557847038;

    /**
     * TBOX_CRTTI_HR_551 <p>
     * <br>
     * Function Describe: 当前时间_小时 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Hour 0 <br>
         0x17: Hour 23 <p>
     */
        public static final int TBOX_CRTTI_HR_551 = 557847039;

    /**
     * TBOX_CRTTI_MINS_551 <p>
     * <br>
     * Function Describe: 当前时间_分钟 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Mintue 0 <br>
         0x3B: Mintue 59 <p>
     */
        public static final int TBOX_CRTTI_MINS_551 = 557847040;

    /**
     * TBOX_CRTTI_YR_551 <p>
     * <br>
     * Function Describe: 当前时间_年 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Year 2015 <br>
         0xFF: Year2270 <p>
     */
        public static final int TBOX_CRTTI_YR_551 = 557847041;

    /**
     * TBOX_CRTTI_MTH_551 <p>
     * <br>
     * Function Describe: 当前时间_月 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: January <br>
         0xB: December <p>
     */
        public static final int TBOX_CRTTI_MTH_551 = 557847042;

    /**
     * TBOX_CRTTI_SEC_551 <p>
     * <br>
     * Function Describe: 当前时间_秒 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Second 0 <br>
         0x3B: Second 59 <p>
     */
        public static final int TBOX_CRTTI_SEC_551 = 557847043;

    /**
     * VCU_ANTITHEFTFAIL_56E <p>
     * <br>
     * Function Describe: 动力防盗失败提示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: NO information <br>
         0x1: XCU authentication Failure <p>
     */
        public static final int VCU_ANTITHEFTFAIL_56E = 557847046;

    /**
     * CHRGEPORTABNREM_56E <p>
     * <br>
     * Function Describe: 充电口异常告警 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 整车系统自检异常，充电功能受限，请保持充电口盖关闭并进店维修。 <br>
         0x2~0x7: Reserved <p>
     */
        public static final int CHRGEPORTABNREM_56E = 557847047;

    /**
     * VCU_ACCHGCURRENTLIM_56E <p>
     * <br>
     * Function Describe: 车辆当前交流充电电流限值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_ACCHGCURRENTLIM_56E = 557847048;

    /**
     * ICC_EQMODECON_3FE <p>
     * <br>
     * Function Describe: EQ模式选择 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
        0x1: 默认 <br>
        0x2: 流行<POP> <br>
        0x3: 摇滚<ROCK> <br>
        0x4: 爵士<JAZZ> <br>
        0x5: 打击<BEATS> <br>
        0x6: 古典<CLASSICAL> <br>
        0x7: 自定义<USER> <br>
        0x8~0xE: Reserved <br>
        0xF: Invalid <p>
     */
        public static final int ICC_EQMODECON_3FE = 557847101;

    /**
     * ICC_EQ1STEP_3FE <p>
     * <br>
     * Function Describe: EQ频率点1 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: -9dB <br>
         0x2: -8dB <br>
         0x3: -7dB <br>
         0x4: -6dB <br>
         0x5: -5dB <br>
         0x6: -4dB <br>
         0x7: -3dB <br>
         0x8: -2dB <br>
         0x9: -1dB <br>
         0xA: 0dB <br>
         0xB: +1dB <br>
         0xC: +2dB <br>
         0xD: +3dB <br>
         0xE: +4dB <br>
         0xF: +5dB <br>
         0x10: +6dB <br>
         0x11: +7dB <br>
         0x12: +8dB <br>
         0x13: +9dB <br>
         0x14~0x1E: Reserved <br>
         0x1F: Invalid <p>
     */
        public static final int ICC_EQ1STEP_3FE = 557847104;

    /**
     * ICC_EQ2STEP_3FE <p>
     * <br>
     * Function Describe: EQ频率点2 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: -9dB <br>
         0x2: -8dB <br>
         0x3: -7dB <br>
         0x4: -6dB <br>
         0x5: -5dB <br>
         0x6: -4dB <br>
         0x7: -3dB <br>
         0x8: -2dB <br>
         0x9: -1dB <br>
         0xA: 0dB <br>
         0xB: +1dB <br>
         0xC: +2dB <br>
         0xD: +3dB <br>
         0xE: +4dB <br>
         0xF: +5dB <br>
         0x10: +6dB <br>
         0x11: +7dB <br>
         0x12: +8dB <br>
         0x13: +9dB <br>
         0x14~0x1E: Reserved <br>
         0x1F: Invalid <p>
     */
        public static final int ICC_EQ2STEP_3FE = 557847105;

    /**
     * ICC_EQ3STEP_3FE <p>
     * <br>
     * Function Describe: EQ频率点3 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: -9dB <br>
         0x2: -8dB <br>
         0x3: -7dB <br>
         0x4: -6dB <br>
         0x5: -5dB <br>
         0x6: -4dB <br>
         0x7: -3dB <br>
         0x8: -2dB <br>
         0x9: -1dB <br>
         0xA: 0dB <br>
         0xB: +1dB <br>
         0xC: +2dB <br>
         0xD: +3dB <br>
         0xE: +4dB <br>
         0xF: +5dB <br>
         0x10: +6dB <br>
         0x11: +7dB <br>
         0x12: +8dB <br>
         0x13: +9dB <br>
         0x14~0x1E: Reserved <br>
         0x1F: Invalid <p>
     */
        public static final int ICC_EQ3STEP_3FE = 557847107;

    /**
     * ICC_2DSURROUNDCON_3FE <p>
     * <br>
     * Function Describe: 2D环绕音效开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICC_2DSURROUNDCON_3FE = 557847108;

    /**
     * ICC_EQ4STEP_3FE <p>
     * <br>
     * Function Describe: EQ频率点4 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: -9dB <br>
         0x2: -8dB <br>
         0x3: -7dB <br>
         0x4: -6dB <br>
         0x5: -5dB <br>
         0x6: -4dB <br>
         0x7: -3dB <br>
         0x8: -2dB <br>
         0x9: -1dB <br>
         0xA: 0dB <br>
         0xB: +1dB <br>
         0xC: +2dB <br>
         0xD: +3dB <br>
         0xE: +4dB <br>
         0xF: +5dB <br>
         0x10: +6dB <br>
         0x11: +7dB <br>
         0x12: +8dB <br>
         0x13: +9dB <br>
         0x14~0x1E: Reserved <br>
         0x1F: Invalid <p>
     */
        public static final int ICC_EQ4STEP_3FE = 557847109;

    /**
     * ICC_3DCHIMETURN_3FE <p>
     * <br>
     * Function Describe: 3D提示音-转向提醒控制 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICC_3DCHIMETURN_3FE = 557847110;

    /**
     * ICC_EQ5STEP_3FE <p>
     * <br>
     * Function Describe: EQ频率点5 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: -9dB <br>
         0x2: -8dB <br>
         0x3: -7dB <br>
         0x4: -6dB <br>
         0x5: -5dB <br>
         0x6: -4dB <br>
         0x7: -3dB <br>
         0x8: -2dB <br>
         0x9: -1dB <br>
         0xA: 0dB <br>
         0xB: +1dB <br>
         0xC: +2dB <br>
         0xD: +3dB <br>
         0xE: +4dB <br>
         0xF: +5dB <br>
         0x10: +6dB <br>
         0x11: +7dB <br>
         0x12: +8dB <br>
         0x13: +9dB <br>
         0x14~0x1E: Reserved <br>
         0x1F: Invalid <p>
     */
        public static final int ICC_EQ5STEP_3FE = 557847111;

    /**
     * ICC_3DCHIMEPARKING_3FE <p>
     * <br>
     * Function Describe: 3D提示音-驻车提醒控制 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICC_3DCHIMEPARKING_3FE = 557847112;

    /**
     * ICC_EQ6STEP_3FE <p>
     * <br>
     * Function Describe: EQ频率点6 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: -9dB <br>
         0x2: -8dB <br>
         0x3: -7dB <br>
         0x4: -6dB <br>
         0x5: -5dB <br>
         0x6: -4dB <br>
         0x7: -3dB <br>
         0x8: -2dB <br>
         0x9: -1dB <br>
         0xA: 0dB <br>
         0xB: +1dB <br>
         0xC: +2dB <br>
         0xD: +3dB <br>
         0xE: +4dB <br>
         0xF: +5dB <br>
         0x10: +6dB <br>
         0x11: +7dB <br>
         0x12: +8dB <br>
         0x13: +9dB <br>
         0x14~0x1E: Reserved <br>
         0x1F: Invalid <p>
     */
        public static final int ICC_EQ6STEP_3FE = 557847113;

    /**
     * ICC_3DCHIMEBLIND_3FE <p>
     * <br>
     * Function Describe: 3D提示音-并线提醒控制 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICC_3DCHIMEBLIND_3FE = 557847114;

    /**
     * ICC_EQ7STEP_3FE <p>
     * <br>
     * Function Describe: EQ频率点7 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: -9dB <br>
         0x2: -8dB <br>
         0x3: -7dB <br>
         0x4: -6dB <br>
         0x5: -5dB <br>
         0x6: -4dB <br>
         0x7: -3dB <br>
         0x8: -2dB <br>
         0x9: -1dB <br>
         0xA: 0dB <br>
         0xB: +1dB <br>
         0xC: +2dB <br>
         0xD: +3dB <br>
         0xE: +4dB <br>
         0xF: +5dB <br>
         0x10: +6dB <br>
         0x11: +7dB <br>
         0x12: +8dB <br>
         0x13: +9dB <br>
         0x14~0x1E: Reserved <br>
         0x1F: Invalid <p>
     */
        public static final int ICC_EQ7STEP_3FE = 557847115;

    /**
     * ICC_VSCMOD_3FE <p>
     * <br>
     * Function Describe: 音量随速档位 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
        0x1: Off <br>
        0x2: Low <br>
        0x3: Mid <br>
        0x4: High <p>
     */
        public static final int ICC_VSCMOD_3FE = 557847119;

    /**
     * ICC_LISTENINGPOSN_3FE <p>
     * <br>
     * Function Describe: 听音位调节 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
        0x1: 主驾 <br>
        0x2: 副驾 <br>
        0x3: 二排左 <br>
        0x4: 二排右 <br>
        0x5: 三排 <br>
        0x6: 全车 <br>
        0x7: OFF <p>
     */
        public static final int ICC_LISTENINGPOSN_3FE = 557847120;

    /**
     * ICC_VIRTSOUNDFIELD_3FE <p>
     * <br>
     * Function Describe: 虚拟声场 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: 音乐厅 <br>
         0x2: 影院 <br>
         0x3: 原声 <br>
         0x4: 舒享空间 <br>
         0x5: Invalid <p>
     */
        public static final int ICC_VIRTSOUNDFIELD_3FE = 557847121;

    /**
     * ICC_DRVRMOD_3FE <p>
     * <br>
     * Function Describe: 主驾模式 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
        0x1: 主驾 <br>
        0x2: 全车 <br>
        0x3: 智能 <br>
        0x4: Invalid <p>
     */
        public static final int ICC_DRVRMOD_3FE = 557847122;

    /**
     * ICC_VOLUMEVALUE_3FE <p>
     * <br>
     * Function Describe: 音量值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 0 <br>
        0x1: 1 <br>
        0x2: 2 <br>
        0x3: 3 <br>
        0x4: 4 <br>
        0x5: 5 <br>
        0x6: 6 <br>
        0x7: 7 <br>
        0x8: 8 <br>
        0x9: 9 <br>
        0xA: 10 <br>
        0xB: 11 <br>
        0xC: 12 <br>
        0xD: 13 <br>
        0xE: 14 <br>
        0xF: 15 <br>
        0x10: 16 <br>
        0x11: 17 <br>
        0x12: 18 <br>
        0x13: 19 <br>
        0x14: 20 <br>
        0x15: 21 <br>
        0x16: 22 <br>
        0x17: 23 <br>
        0x18: 24 <br>
        0x19: 25 <br>
        0x1A: 26 <br>
        0x1B: 27 <br>
        0x1C: 28 <br>
        0x1D: 29 <br>
        0x1E: 30 <br>
        0x1F: Inactive <p>
     */
        public static final int ICC_VOLUMEVALUE_3FE = 557847123;

    /**
     * ICC_ALACMODSWT_3FE <p>
     * <br>
     * Function Describe: 氛围灯空调模式律动功能开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICC_ALACMODSWT_3FE = 557847124;

    /**
     * ICC_ALMOBCHAMODSWT_3FE <p>
     * <br>
     * Function Describe: 氛围灯手机充电提醒功能开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICC_ALMOBCHAMODSWT_3FE = 557847125;

    /**
     * ICC_ALMOBFGTREMDSWT_3FE <p>
     * <br>
     * Function Describe: 氛围灯手机遗忘提醒功能开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICC_ALMOBFGTREMDSWT_3FE = 557847126;

    /**
     * ICC_HUMAISPCHSTS_3FE <p>
     * <br>
     * Function Describe: 车机语音交互状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No speech <br>
         0x1: Speech mode <br>
         0x2: Reserved <br>
         0x3: Invalid <p>
     */
        public static final int ICC_HUMAISPCHSTS_3FE = 557847127;

    /**
     * ICC_ALDOWARSWT_3FE <p>
     * <br>
     * Function Describe: 氛围灯开门提示功能开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICC_ALDOWARSWT_3FE = 557847128;

    /**
     * ICC_ALSPCHSWT_3FE <p>
     * <br>
     * Function Describe: 氛围灯语音交互功能开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICC_ALSPCHSWT_3FE = 557847129;

    /**
     * ICC_ALSPDRHYMODSWT_3FE <p>
     * <br>
     * Function Describe: 氛围灯车速律动功能开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICC_ALSPDRHYMODSWT_3FE = 557847130;

    /**
     * ICC_ALMUSICRHYMODSWT_3FE <p>
     * <br>
     * Function Describe: 氛围灯音乐律动功能开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICC_ALMUSICRHYMODSWT_3FE = 557847131;

    /**
     * ICC_ALBRIAUTOSET_3FE <p>
     * <br>
     * Function Describe: 氛围灯亮度自动调节 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICC_ALBRIAUTOSET_3FE = 557847132;

    /**
     * ICC_ALBRIBREAMODSWT_3FE <p>
     * <br>
     * Function Describe: 氛围灯单色呼吸模式开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICC_ALBRIBREAMODSWT_3FE = 557847133;

    /**
     * ICC_ALZONESWT_3FE <p>
     * <br>
     * Function Describe: 氛围灯分区开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: FrontOFF(前排区关) <br>
         0x2: FrontON(前排区开) <br>
         0x3: RearOFF(后排区关) <br>
         0x4: RearON(后排区开) <br>
         0x5: RoofOFF(顶棚区关) <br>
         0x6: RoofON(顶棚区开) <br>
         0x7: IPOFF(仪表板氛围灯关) <br>
         0x8: IPON(仪表板氛围灯开) <br>
         0x9: Reserved <br>
         0xA: Invalid <p>
     */
        public static final int ICC_ALZONESWT_3FE = 557847135;

    /**
     * ICC_ALRECMODSET_3FE <p>
     * <br>
     * Function Describe: 氛围灯单色主题色模式选择 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Mode 1 <br>
         0x2: Mode 2 <br>
         0x3: Mode 3 <br>
         0x4: Mode 4 <br>
         0x5: Mode 5 <br>
         0x6: Mode 6 <br>
         0x7: Mode 7 <br>
         0x8: Mode 8 <br>
         0x9: Mode 9 <br>
         0xA: Mode 10 <br>
         0xB: OFF <p>
     */
        public static final int ICC_ALRECMODSET_3FE = 557847136;

    /**
     * ICC_ALSWT_3FE <p>
     * <br>
     * Function Describe: 氛围灯总开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Reserved <p>
     */
        public static final int ICC_ALSWT_3FE = 557847137;

    /**
     * ICC_ALBRILESET_3FE <p>
     * <br>
     * Function Describe: 氛围灯亮度调节 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Level 1 <br>
         0x2: Level 2 <br>
         0x3: Level 3 <br>
         0x4: Level 4 <br>
         0x5: Level 5 <br>
         0x6: Level 6 <br>
         0x7: Level 7 <br>
         0x8: Level 8 <br>
         0x9: Level 9 <br>
         0xA: Level 10 <br>
         0xB: OFF <p>
     */
        public static final int ICC_ALBRILESET_3FE = 557847138;

    /**
     * ICC_ALCLRCSTMSET_3FE <p>
     * <br>
     * Function Describe: 氛围灯颜色自定义选择 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0~0xFF: Color1~Color256 <br>
         0x1FF: Inactive <p>
     */
        public static final int ICC_ALCLRCSTMSET_3FE = 557847139;

    /**
     * ICC_ALWELMODSWT_3FE <p>
     * <br>
     * Function Describe: 氛围灯迎宾模式开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: invalid <p>
     */
        public static final int ICC_ALWELMODSWT_3FE = 557847140;

    /**
     * ICC_ALDRVMODSWT_3FE <p>
     * <br>
     * Function Describe: 氛围灯驾驶模式开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICC_ALDRVMODSWT_3FE = 557847141;

    /**
     * ICC_ALCSTMSWT_3FE <p>
     * <br>
     * Function Describe: 氛围灯自定义模式开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICC_ALCSTMSWT_3FE = 557847143;

    /**
     * ICC_ALCLRMODSWT_3FE <p>
     * <br>
     * Function Describe: 氛围灯颜色模式 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Custom Mode（自定义模式） <br>
         0x2: Recommend Mode（主题色模式） <br>
         0x3: Reserved <p>
     */
        public static final int ICC_ALCLRMODSWT_3FE = 557847144;

    /**
     * ICC_AVRGCNSEEGY_RECENT50KM_559 <p>
     * <br>
     * Function Describe: 近50km平均电耗 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_AVRGCNSEEGY_RECENT50KM_559 = 557847145;

    /**
     * ICC_AVRGCNSEEGY_RECENT100KM_559 <p>
     * <br>
     * Function Describe: 近100km平均电耗 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_AVRGCNSEEGY_RECENT100KM_559 = 557847146;

    /**
     * ICC_50KMAVRGPWRCNSPTN_F_559 <p>
     * <br>
     * Function Describe: 近50km平均油耗 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_50KMAVRGPWRCNSPTN_F_559 = 557847147;

    /**
     * ICC_100KMAVRGPWRCNSPTN_F_559 <p>
     * <br>
     * Function Describe: 近100km平均油耗 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_100KMAVRGPWRCNSPTN_F_559 = 557847148;

    /**
     * BATTMAXLOADELECCHG_624 <p>
     * <br>
     * Function Describe: 电池最大负载电量 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int BATTMAXLOADELECCHG_624 = 557847149;

    /**
     * BMS_CHGRESTIME_624 <p>
     * <br>
     * Function Describe: 剩余充电时间（显示） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int BMS_CHGRESTIME_624 = 557847150;

    /**
     * EPBSYSOPERSTS_1A7 <p>
     * <br>
     * Function Describe:  EPB工作状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Status unkown 状态不确定 <br>
         0x1: Released 卡钳处于释放状态 <br>
         0x2: Closed 卡钳处于夹紧状态 <br>
         0x3: Releasing 卡钳正处于释放过程 <br>
         0x4: Locking 卡钳正处于夹紧过程 <br>
         0x5~0x7: Reserved <p>
     */
        public static final int EPBSYSOPERSTS_1A7 = 557847154;

    /**
     * EPBSYSFLTSTS_1A7 <p>
     * <br>
     * Function Describe: EPB系统错误提示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: No error <br>
         0x2: Error <br>
         0x3: Diagnosis <p>
     */
        public static final int EPBSYSFLTSTS_1A7 = 557847155;

    /**
     * EPBSYSPARKLI_1A7 <p>
     * <br>
     * Function Describe: EPB指示灯状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: OFF <br>
         0x1: ON <br>
         0x2: Blinking 1 <br>
         0x3: Blinking 2 <p>
     */
        public static final int EPBSYSPARKLI_1A7 = 557847156;

    /**
     * PBMPARKINGREMIND_1A7 <p>
     * <br>
     * Function Describe: PBM停车提醒。提示信息，告知驾驶员需切出P挡后再释放EPB。 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 无提醒 <br>
         0x1: 有提醒 <p>
     */
        public static final int PBMPARKINGREMIND_1A7 = 557847157;

    /**
     * EPBSYSHMIMSGN1_1A7 <p>
     * <br>
     * Function Describe: 提示信息，告知驾驶员下一步操作. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: Press The Brake First. Release The APB Button <p>
     */
        public static final int EPBSYSHMIMSGN1_1A7 = 557847158;

    /**
     * EPBSYSHMIMSGN2_1A7 <p>
     * <br>
     * Function Describe: 提示信息，告知驾驶员下一步操作，驻车坡度超过门限 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: Park The Car On The Slope With Gentle Incline <p>
     */
        public static final int EPBSYSHMIMSGN2_1A7 = 557847159;

    /**
     * EPBSYSHMIMSGN3_1A7 <p>
     * <br>
     * Function Describe: 提示信息，告知驾驶员下一步操作，安全带未系或车门未关（与AVH安全带未系或车门未关提示共用） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: Keep The Seatbelt Attached. <br>
         0x2: Keep The Door Closed. <br>
         0x3: Keep The Seatbelt Attached and Keep The Door Closed. <p>
     */
        public static final int EPBSYSHMIMSGN3_1A7 = 557847160;

    /**
     * EPBSYSHMIMSGN4_1A7 <p>
     * <br>
     * Function Describe: 提示信息，告知驾驶员动态制动中 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: Dynamic applying is in progress <p>
     */
        public static final int EPBSYSHMIMSGN4_1A7 = 557847163;

    /**
     * VCU_ACCHRGELECTCLOCKSTSFBSIG_554 <p>
     * <br>
     * Function Describe: 交流充放电电子锁状态反馈信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 闭锁状态 <br>
         0x2: 解锁状态 <br>
         0x3~0x7: Void <p>
     */
        public static final int VCU_ACCHRGELECTCLOCKSTSFBSIG_554 = 557847164;

    /**
     * VCU_CARWASHMODENA_556 <p>
     * <br>
     * Function Describe: 洗车模式使能 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值； <br>
         0x1: 洗车模式使能； <br>
         0x2: 自动洗车模式使能； <br>
         0x3: Reserved <p>
     */
        public static final int VCU_CARWASHMODENA_556 = 557847177;

    /**
     * VCU_CARWASHMODSTS_556 <p>
     * <br>
     * Function Describe: 洗车模式状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值； <br>
         0x1: 洗车模式； <br>
         0x2: 自动洗车模式； <br>
         0x3~0xF: reserved <p>
     */
        public static final int VCU_CARWASHMODSTS_556 = 557847178;

    /**
     * VEHICLEDRIVEENERGYCONSUM_56A <p>
     * <br>
     * Function Describe: 车辆行驶消耗能量 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VEHICLEDRIVEENERGYCONSUM_56A = 557847180;

    /**
     * VEHICLEACENERGYCONSUM_56A <p>
     * <br>
     * Function Describe: 车辆空调系统消耗能量 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VEHICLEACENERGYCONSUM_56A = 557847181;

    /**
     * BATTHEATMANGMENTENERGYCONSUM_56A <p>
     * <br>
     * Function Describe: 电池热管理消耗能量 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int BATTHEATMANGMENTENERGYCONSUM_56A = 557847182;

    /**
     * VEHICLEDRIVEENERGYCONSUMOTER_56A <p>
     * <br>
     * Function Describe: 车辆其他消耗能量 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VEHICLEDRIVEENERGYCONSUMOTER_56A = 557847183;

    /**
     * ENERGYRECOVERENERGY_56A <p>
     * <br>
     * Function Describe: 能量回收能量 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int ENERGYRECOVERENERGY_56A = 557847184;

    /**
     * VCU_ESTIDRIVMILEAGE_RECENT10KM_56A <p>
     * <br>
     * Function Describe: 近10km剩余续驶里程 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_ESTIDRIVMILEAGE_RECENT10KM_56A = 557847185;

    /**
     * VCU_ESTIDRIVMILEAGE_RECENT100KM_56A <p>
     * <br>
     * Function Describe: 近100km剩余续驶里程 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_ESTIDRIVMILEAGE_RECENT100KM_56A = 557847186;

    /**
     * VCU_AVRGCNSEEGY_STD_56A <p>
     * <br>
     * Function Describe: 标准工况下的平均电耗 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_AVRGCNSEEGY_STD_56A = 557847187;

    /**
     * VCU_FETRANSEGYAVRGNOW_E_56A <p>
     * <br>
     * Function Describe: 本次行程能耗值_转电耗 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_FETRANSEGYAVRGNOW_E_56A = 557847188;

    /**
     * VCU_FETRANSEGYAVRGNOW_F_56A <p>
     * <br>
     * Function Describe: 本次行程能耗值_转油耗 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_FETRANSEGYAVRGNOW_F_56A = 557847189;

    /**
     * VCU_APPFETRANSEGYAVRGNOW_E_56A <p>
     * <br>
     * Function Describe: APP单次行程能耗值_转电耗 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_APPFETRANSEGYAVRGNOW_E_56A = 557847190;

    /**
     * VCU_APPFETRANSEGYAVRGNOW_F_56A <p>
     * <br>
     * Function Describe: APP单次行程能耗值_转油耗 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_APPFETRANSEGYAVRGNOW_F_56A = 557847191;

    /**
     * VCU_INSNTFEGYCNSE_MILE_56A <p>
     * <br>
     * Function Describe: 瞬时油耗（里程） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_INSNTFEGYCNSE_MILE_56A = 557847192;

    /**
     * FVEHDRVCNSEEGY_56A <p>
     * <br>
     * Function Describe: 车辆行驶消耗能量（油耗分布） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int FVEHDRVCNSEEGY_56A = 557847193;

    /**
     * FECCCNSEEGY_56A <p>
     * <br>
     * Function Describe: 车辆空调系统消耗能量（油耗分布） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int FECCCNSEEGY_56A = 557847194;

    /**
     * FBHMCNSEEGY_56A <p>
     * <br>
     * Function Describe: 电池热管理消耗能量（油耗分布） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int FBHMCNSEEGY_56A = 557847195;

    /**
     * FVEHACSYCNSEEGY_56A <p>
     * <br>
     * Function Describe: 车辆其他消耗能量（油耗分布） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int FVEHACSYCNSEEGY_56A = 557847196;

    /**
     * FEGYRECOVEGY_56A <p>
     * <br>
     * Function Describe: 能量回收能量（油耗分布） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int FEGYRECOVEGY_56A = 557847197;

    /**
     * FETRANSEGY_56A <p>
     * <br>
     * Function Describe: 油转电消耗能量（油耗分布） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int FETRANSEGY_56A = 557847198;

    /**
     * VCU_AVRGCNSEEGYFROMLSTCHRG_558 <p>
     * <br>
     * Function Describe: 自上次充电后行程平均电耗 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_AVRGCNSEEGYFROMLSTCHRG_558 = 557847199;

    /**
     * VCU_AVRGCNSEEGYOFTRIPA_558 <p>
     * <br>
     * Function Describe: Trip A行程平均电耗 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_AVRGCNSEEGYOFTRIPA_558 = 557847200;

    /**
     * VCU_AVRGCNSEEGYOFTRIPB_558 <p>
     * <br>
     * Function Describe: Trip B行程平均电耗 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_AVRGCNSEEGYOFTRIPB_558 = 557847201;

    /**
     * RSTLASTREF_558 <p>
     * <br>
     * Function Describe: 自上次加油后行程重置标志位 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 重置 <p>
     */
        public static final int RSTLASTREF_558 = 557847202;

    /**
     * AVRGCNSEENGFROMLSTCHRG_558 <p>
     * <br>
     * Function Describe: 自上次充电后行程平均油耗 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int AVRGCNSEENGFROMLSTCHRG_558 = 557847203;

    /**
     * AVRGCNSEEGYFROMLSTREF_558 <p>
     * <br>
     * Function Describe: 自上次加油后行程平均电耗 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int AVRGCNSEEGYFROMLSTREF_558 = 557847204;

    /**
     * AVRGCNSEENGFROMLSTREF_558 <p>
     * <br>
     * Function Describe: 自上次加油后行程平均油耗 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int AVRGCNSEENGFROMLSTREF_558 = 557847205;

    /**
     * AVRGCNSEENGOFTRIPA_558 <p>
     * <br>
     * Function Describe: Trip A行程平均油耗 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int AVRGCNSEENGOFTRIPA_558 = 557847206;

    /**
     * AVRGCNSEENGOFTRIPB_558 <p>
     * <br>
     * Function Describe: Trip B行程平均油耗 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int AVRGCNSEENGOFTRIPB_558 = 557847207;

    /**
     * ESTIREMAINEGYPERCENT_535 <p>
     * <br>
     * Function Describe: 预计剩余电量百分比 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ESTIREMAINEGYPERCENT_535 = 557847208;

    /**
     * ARIVDSTTIME_535 <p>
     * <br>
     * Function Describe: 当前到目的的剩余时间 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ARIVDSTTIME_535 = 557847209;

    /**
     * ARIVDSTMLIE_535 <p>
     * <br>
     * Function Describe: 当前到目的的剩余里程 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ARIVDSTMLIE_535 = 557847210;

    /**
     * TRAVELTOTMLILE_535 <p>
     * <br>
     * Function Describe: 全程总计行驶里程 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int TRAVELTOTMLILE_535 = 557847211;

    /**
     * TRAVELTOTTIME_535 <p>
     * <br>
     * Function Describe: 全程总计行驶时间 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int TRAVELTOTTIME_535 = 557847212;

    /**
     * ESTIREMAINEGY_535 <p>
     * <br>
     * Function Describe: 预计剩余能量 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ESTIREMAINEGY_535 = 557847213;

    /**
     * NAVIGATIONSTS_535 <p>
     * <br>
     * Function Describe: 导航状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 待机； <br>
         0x1: 导航规划； <br>
         0x2: 开始导航； <br>
         0x3: 结束导航； <p>
     */
        public static final int NAVIGATIONSTS_535 = 557847214;

    /**
     * ICCNAVICTRYROADTYP_535 <p>
     * <br>
     * Function Describe: 当前道路类型 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Unknown 未知 <br>
         0x1: Expressway 高速公路 <br>
         0x2: City expressway 城市快速路 <br>
         0x3: National road 国道 <br>
         0x4: Provincial road 省道 <br>
         0x5: County road 县道 <br>
         0x6: City or Village road 城市或乡村道路 <br>
         0x7: ramp 匝道 <br>
         0x8: Tunnel 隧道 <br>
         0x9: Side road支路 <br>
         0xA: Channel 通道 <br>
         0xB~0xE: Reserved 保留 <br>
         0xF: Invalid <p>
     */
        public static final int ICCNAVICTRYROADTYP_535 = 557847216;

    /**
     * ICC_ARIVNEXCHARGSTADESTTIM_535 <p>
     * <br>
     * Function Describe: 车辆到达下一充电站（目的地）的时间 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_ARIVNEXCHARGSTADESTTIM_535 = 557847220;

    /**
     * ICC_NEXCHARGSTACATGRY_535 <p>
     * <br>
     * Function Describe: 途中下一个充电站类别 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 非充电站； <br>
         0x1: 快充桩； <br>
         0x2: 慢充桩； <br>
         0x3: 无法识别充电站类别（快慢充均有）； <br>
         0x4~0x7: Reserved <p>
     */
        public static final int ICC_NEXCHARGSTACATGRY_535 = 557847221;

    /**
     * ICC_ARIVNEXCHARGSTADESTDIST_535 <p>
     * <br>
     * Function Describe: 车辆到达下一充电站（目的地）的里程 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_ARIVNEXCHARGSTADESTDIST_535 = 557847222;

    /**
     * ICC_KL15KEEPREQ_535 <p>
     * <br>
     * Function Describe: ICC KL15保持请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No Request <br>
         0x1: Keep <p>
     */
        public static final int ICC_KL15KEEPREQ_535 = 557847229;

    /**
     * TOTNROFTRAFFICLI_535 <p>
     * <br>
     * Function Describe: 全程红绿灯数量 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int TOTNROFTRAFFICLI_535 = 557847230;

    /**
     * FULLROADCDNINFO_SECTION_535 <p>
     * <br>
     * Function Describe: 全程路况信息（分为几段） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int FULLROADCDNINFO_SECTION_535 = 557847231;

    /**
     * FULLROADCDNINFO_NR_535 <p>
     * <br>
     * Function Describe: 全程路况信息（编号） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int FULLROADCDNINFO_NR_535 = 557847232;

    /**
     * FULLROADCDNINFO_LEN_535 <p>
     * <br>
     * Function Describe: 全程路况信息_长度 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int FULLROADCDNINFO_LEN_535 = 557847233;

    /**
     * FULLROADCDNINFO_TI_535 <p>
     * <br>
     * Function Describe: 全程路况信息_时间 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int FULLROADCDNINFO_TI_535 = 557847234;

    /**
     * FULLROADCDNINFO_535 <p>
     * <br>
     * Function Describe: 全程路况信息_路况状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 未知状态/⽆交通数据(蓝⾊) <br>
         0x1: 畅通（绿⾊） <br>
         0x2: 缓⾏（黄色） <br>
         0x3: 拥堵（红⾊） <br>
         0x4: 严重拥堵（深红⾊） <br>
         0x5: 极度通畅（深绿⾊） <br>
         0x6: reserved <br>
         0xA: ⾏驶过的路段（灰⾊） <p>
     */
        public static final int FULLROADCDNINFO_535 = 557847235;

    /**
     * CURRENTROADSPDLIM_535 <p>
     * <br>
     * Function Describe: 当前道路速度限制 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int CURRENTROADSPDLIM_535 = 557847236;

    /**
     * TURNICON_535 <p>
     * <br>
     * Function Describe: 转向图标 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int TURNICON_535 = 557847238;

    /**
     * CURRENTROADCDN_NR_535 <p>
     * <br>
     * Function Describe: 当前路况状态-编号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int CURRENTROADCDN_NR_535 = 557847239;

    /**
     * CURRENTROADCDN_MILG_535 <p>
     * <br>
     * Function Describe: 当前路况状态-里程 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int CURRENTROADCDN_MILG_535 = 557847240;

    /**
     * CURRENTROADCDN_TI_535 <p>
     * <br>
     * Function Describe: 当前路况状态-时间 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int CURRENTROADCDN_TI_535 = 557847241;

    /**
     * CURRENTROADCDN_535 <p>
     * <br>
     * Function Describe: 当前路况状态-道路状况 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 未知状态/⽆交通数据(蓝⾊) <br>
         0x1: 畅通（绿⾊） <br>
         0x2: 缓⾏（黄色） <br>
         0x3: 拥堵（红⾊） <br>
         0x4: 严重拥堵（深红⾊） <br>
         0x5: 极度通畅（深绿⾊） <br>
         0x6: reserved <br>
         0xA: ⾏驶过的路段（灰⾊） <p>
     */
        public static final int CURRENTROADCDN_535 = 557847242;

    /**
     * SPD1CORSPEGYCUM_534 <p>
     * <br>
     * Function Describe: 车速1对应能耗值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int SPD1CORSPEGYCUM_534 = 557847243;

    /**
     * SPD2CORSPEGYCUM_534 <p>
     * <br>
     * Function Describe: 车速2对应能耗值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int SPD2CORSPEGYCUM_534 = 557847244;

    /**
     * SPD3CORSPEGYCUM_534 <p>
     * <br>
     * Function Describe: 车速3对应能耗值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int SPD3CORSPEGYCUM_534 = 557847245;

    /**
     * SPD4CORSPEGYCUM_534 <p>
     * <br>
     * Function Describe: 车速4对应能耗值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int SPD4CORSPEGYCUM_534 = 557847246;

    /**
     * SPD5CORSPEGYCUM_534 <p>
     * <br>
     * Function Describe: 车速5对应能耗值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int SPD5CORSPEGYCUM_534 = 557847247;

    /**
     * SPD6CORSPEGYCUM_534 <p>
     * <br>
     * Function Describe: 车速6对应能耗值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int SPD6CORSPEGYCUM_534 = 557847248;

    /**
     * SPD7CORSPEGYCUM_534 <p>
     * <br>
     * Function Describe: 车速7对应能耗值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int SPD7CORSPEGYCUM_534 = 557847249;

    /**
     * SPD8CORSPEGYCUM_534 <p>
     * <br>
     * Function Describe: 车速8对应能耗值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int SPD8CORSPEGYCUM_534 = 557847250;

    /**
     * SPD9CORSPEGYCUM_534 <p>
     * <br>
     * Function Describe: 车速9对应能耗值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int SPD9CORSPEGYCUM_534 = 557847251;

    /**
     * SPD10CORSPEGYCUM_534 <p>
     * <br>
     * Function Describe: 车速10对应能耗值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int SPD10CORSPEGYCUM_534 = 557847252;

    /**
     * SPD11CORSPEGYCUM_534 <p>
     * <br>
     * Function Describe: 车速11对应能耗值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int SPD11CORSPEGYCUM_534 = 557847253;

    /**
     * SPD12CORSPEGYCUM_534 <p>
     * <br>
     * Function Describe: 车速12对应能耗值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int SPD12CORSPEGYCUM_534 = 557847254;

    /**
     * SPD13CORSPEGYCUM_534 <p>
     * <br>
     * Function Describe: 车速13对应能耗值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int SPD13CORSPEGYCUM_534 = 557847255;

    /**
     * SPD14CORSPEGYCUM_534 <p>
     * <br>
     * Function Describe: 车速14对应能耗值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int SPD14CORSPEGYCUM_534 = 557847256;

    /**
     * SPD15CORSPEGYCUM_534 <p>
     * <br>
     * Function Describe: 车速15对应能耗值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int SPD15CORSPEGYCUM_534 = 557847257;

    /**
     * VEHWEIGHT_534 <p>
     * <br>
     * Function Describe: 车辆重量 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VEHWEIGHT_534 = 557847258;

    /**
     * EGYCUNMODEL_534 <p>
     * <br>
     * Function Describe: 能耗代价模型 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int EGYCUNMODEL_534 = 557847259;

    /**
     * SLOPRISCONSUINDEX_534 <p>
     * <br>
     * Function Describe: 坡度上升的消耗系数 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int SLOPRISCONSUINDEX_534 = 557847260;

    /**
     * SLOPDOWNCONSUINDEX_534 <p>
     * <br>
     * Function Describe: 坡度下降的消耗系数 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int SLOPDOWNCONSUINDEX_534 = 557847261;

    /**
     * ACCESSCONSUPOW_534 <p>
     * <br>
     * Function Describe: 附件消耗功率 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int ACCESSCONSUPOW_534 = 557847262;

    /**
     * FERRYCONSUM_534 <p>
     * <br>
     * Function Describe: 轮渡消耗 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int FERRYCONSUM_534 = 557847263;

    /**
     * MCUDRVMODSIG_127 <p>
     * <br>
     * Function Describe: 驾驶模式信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 运动模式 <br>
         0x2: 舒适模式 <br>
         0x3: 经济模式 <br>
         0x4: 雪地模式 <br>
         0x5: 泥地模式 <br>
         0x6: 沙地模式 <br>
         0x7: One-Pedal模式 <br>
         0x8: E-Auto模式 <br>
         0x9: 狂暴模式 <br>
         0xA: 赛道模式 <br>
         0xB: 极致节能模式 <br>
         0xC: 个性化模式 <br>
         0xD: 晕车舒缓模式 <br>
         0xE~0xF: Reserved <p>
     */
        public static final int MCUDRVMODSIG_127 = 557847265;

    /**
     * WORMSPEEDSTA_25F <p>
     * <br>
     * Function Describe: 蠕行车速状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 低 <br>
         0x2: 中 <br>
         0x3: 高 <br>
         0x4: 停止 <br>
         0x5~0x7: Reserved <p>
     */
        public static final int WORMSPEEDSTA_25F = 557847272;

    /**
     * INDMODDAMPERMODDIS_25F <p>
     * <br>
     * Function Describe: 个性化模式减振器模式显示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 软 <br>
         0x2: 中 <br>
         0x3: 硬 <br>
         0x4~0xF: reserved <p>
     */
        public static final int INDMODDAMPERMODDIS_25F = 557847276;

    /**
     * ONEPEDLKEEPDISP_25F <p>
     * <br>
     * Function Describe: 单踏板保持提示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
        0x1: 待用 <br>
        0x2: 激活 <br>
        0x3: 故障 <p>
     */
        public static final int ONEPEDLKEEPDISP_25F = 557847277;

    /**
     * MCUDRIRADICALDISPLAY_25F <p>
     * <br>
     * Function Describe: 驾驶激进程度显示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值； <br>
         0x1: 平和； <br>
         0x2: 正常； <br>
         0x3: 激进； <p>
     */
        public static final int MCUDRIRADICALDISPLAY_25F = 557847278;

    /**
     * INDMODEGYFBDIS_25F <p>
     * <br>
     * Function Describe: 个性化模式能量回收显示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1~0x65: 0~100% <p>
     */
        public static final int INDMODEGYFBDIS_25F = 557847281;

    /**
     * MCUDRISTYLEFACTOR_25F <p>
     * <br>
     * Function Describe: 驾驶风格因子 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int MCUDRISTYLEFACTOR_25F = 557847282;

    /**
     * ACCMODESTA_25F <p>
     * <br>
     * Function Describe: 加速模式状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int ACCMODESTA_25F = 557847283;

    /**
     * BRAEGYRECOVINTENREQ_25F <p>
     * <br>
     * Function Describe: 能量回收强度状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int BRAEGYRECOVINTENREQ_25F = 557847284;

    /**
     * INDMODSTEEMODDIS_25F <p>
     * <br>
     * Function Describe: 个性化模式转向模式显示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Void <br>
         0x1: Standard request <br>
         0x2: Comfort request <br>
         0x3: Sport request <br>
         0x4~0x7: Reserved <p>
     */
        public static final int INDMODSTEEMODDIS_25F = 557847286;

    /**
     * INDMODCREMODDIS_25F <p>
     * <br>
     * Function Describe: 个性化模式蠕行车速显示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 低 <br>
         0x2: 中 <br>
         0x3: 高 <br>
         0x4: 停止 <br>
         0x5~0x7: Reserved <p>
     */
        public static final int INDMODCREMODDIS_25F = 557847287;

    /**
     * CCSPEUNITAFF_48B <p>
     * <br>
     * Function Describe: 定速巡航车速单位确认 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: The metric system <br>
         0x2: The British system <br>
         0x3: Inavlid <p>
     */
        public static final int CCSPEUNITAFF_48B = 557847288;

    /**
     * VCU_BRAKE_ENGERY_RECOV_STA_48B <p>
     * <br>
     * Function Describe: 制动能量回收功能禁止标志位 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 允许能量回收 <br>
         0x1: 禁止能量回收 <p>
     */
        public static final int VCU_BRAKE_ENGERY_RECOV_STA_48B = 557847289;

    /**
     * VCUCCSTATEENUM_48B <p>
     * <br>
     * Function Describe: 定速巡航状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 关闭 <br>
         0x1: 待用 <br>
         0x2: 激活 <br>
         0x3: Reserved <p>
     */
        public static final int VCUCCSTATEENUM_48B = 557847290;

    /**
     * VCUCCTIPSENUM_48B <p>
     * <br>
     * Function Describe: 定速巡航提示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 无提示 <br>
         0x1: 系统故障，巡航无法开启 <br>
         0x2: 请向下拨动两次换挡拨杆后开启巡航 <br>
         0x3: 请提高车速后开启巡航 <br>
         0x4: 请松开制动后开启巡航 <br>
         0x5: 定速巡航激活 <br>
         0x6: 定速巡航退出 <br>
         0x7~0x8: Reserved <p>
     */
        public static final int VCUCCTIPSENUM_48B = 557847291;

    /**
     * VCUCCTARSPDKPH_48B <p>
     * <br>
     * Function Describe: 定速巡航目标车速 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCUCCTARSPDKPH_48B = 557847292;

    /**
     * VCU_LNCHCTRLTRIGRMN_48B <p>
     * <br>
     * Function Describe: 弹射起步触发提醒 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 条件不满足，弹射起步无法启用（Launch Control unavailable） <br>
         0x2: 弹射起步模式已启用，请等待扭矩加载（Launch Control available，wait for loading Torque） <br>
         0x3: 请快速松开刹车，完成弹射起步（Boost ready，Please release the brake pedal） <br>
         0x4~0x7: Reserved <p>
     */
        public static final int VCU_LNCHCTRLTRIGRMN_48B = 557847293;

    /**
     * VCU_LNCHCTRLMODDIRMN_48B <p>
     * <br>
     * Function Describe: 弹射起步模式不启用仪表提醒 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 整车系统故障，弹射起步模式无法启用（Vehicle system failure，Launch Control unavailable） <br>
         0x2: 动力电池剩余电量较低，弹射起步模式无法启用（SOC too low，Launch Control unavailable） <br>
         0x3: 智能驾驶功能已激活，弹射起步模式无法启用（Intelligent driving function activation，Launch Control unavailable） <br>
         0x4: 请系安全带后启用弹射起步模式（Please fasten your seat belt before enable Launch Control） <br>
         0x5: 加速和制动踏板同时踩下，动力受限(Accelerator and brake pedal are both pressed，power limited) <br>
         0x6: 请挂入D挡后启用弹射起步模式（Please shift into D gear before enable Launch Control） <br>
         0x7: 请切换为运动模式后启用弹射起步模式（Please switching drive mode to sport before enable Launch Control） <br>
         0x8: 请将方向盘回正后启用弹射起步模式(Please turn the steering wheel back before enable Launch Control) <br>
         0x9: 请深踩制动踏板后启用弹射起步模式（Please depress the brake pedal deeply before enable Launch Control） <br>
         0xA: 请深踩加速踏板后启用弹射起步模式（Please depress the acceleration pedal deeply before enable Launch Control） <br>
         0xB~0xF: Reserved <p>
     */
        public static final int VCU_LNCHCTRLMODDIRMN_48B = 557847294;

    /**
     * VCU_EHUPWROFFENA_484 <p>
     * <br>
     * Function Describe: 主动下电开关使能信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 未使能 <br>
         0x2: 已使能 <br>
         0x3: Reserved <p>
     */
        public static final int VCU_EHUPWROFFENA_484 = 557847295;

    /**
     * VCU_DRVGMILGDISPPERC_484 <p>
     * <br>
     * Function Describe: 续驶里程显示百分比 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_DRVGMILGDISPPERC_484 = 557847297;

    /**
     * VCU_DRVGMILGDISPPERCFLG_484 <p>
     * <br>
     * Function Describe: 续驶里程显示百分比有效标志位 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 无效 <br>
         0x1: 有效 <p>
     */
        public static final int VCU_DRVGMILGDISPPERCFLG_484 = 557847298;

    /**
     * VCU_REMBATTHEATGFAILREASON_511 <p>
     * <br>
     * Function Describe: 远程电池加热失败原因 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始化 <br>
         0x1: 当前环境、电池禁止放电 <br>
         0x2: SOC低 <br>
         0x3: 车辆充电中，无需加热 <br>
         0x4: 整车故障 <br>
         0x5: 温度满足要求，不需要远程加热 <br>
         0x6: 整车正在更新软件，无法开启加热 <br>
         0x7: Void <p>
     */
        public static final int VCU_REMBATTHEATGFAILREASON_511 = 557847300;

    /**
     * CHARGEFFICIENCY_FLAG_392 <p>
     * <br>
     * Function Describe: 充电效率标志位 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 交流充电 <br>
         0x2: 直流充电 <br>
         0x3: Reservd <p>
     */
        public static final int CHARGEFFICIENCY_FLAG_392 = 557847301;

    /**
     * RESETFLG_TRIPFROMLASTCHARGE_392 <p>
     * <br>
     * Function Describe: 自上次充电后行程重置标志位 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 重置 <p>
     */
        public static final int RESETFLG_TRIPFROMLASTCHARGE_392 = 557847302;

    /**
     * PDCUFUELLEVELDISP_392 <p>
     * <br>
     * Function Describe: 剩余油量百分比 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int PDCUFUELLEVELDISP_392 = 557847303;

    /**
     * PDCUHYDOPERMOD_392 <p>
     * <br>
     * Function Describe: 混动系统能量流信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 无能量流 <br>
         0x1: 空怠速 <br>
         0x2: EV两驱 <br>
         0x3: 仅增程器发电 <br>
         0x4: 能量回收 <br>
         0x5: 能量回收+发电 <br>
         0x6: 串联驱动 <br>
         0x7: 串联助力 <br>
         0x8: 串联发电 <br>
         0x9~0xF: Reserved <p>
     */
        public static final int PDCUHYDOPERMOD_392 = 557847304;

    /**
     * CHARGEFFICIENCY_392 <p>
     * <br>
     * Function Describe: 充电效率（显示） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int CHARGEFFICIENCY_392 = 557847306;

    /**
     * PDCUFUMILGVLD_392 <p>
     * <br>
     * Function Describe: 燃油续航里程有效位  <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 无效 <br>
         0x1: 有效 <p>
     */
        public static final int PDCUFUMILGVLD_392 = 557847307;

    /**
     * PDCUFUMILGE_392 <p>
     * <br>
     * Function Describe: 当前状态下燃油续航里程 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int PDCUFUMILGE_392 = 557847308;

    /**
     * TOTMILGE_392 <p>
     * <br>
     * Function Describe: 当前状态下总续航里程 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int TOTMILGE_392 = 557847309;

    /**
     * ELECMILGE_392 <p>
     * <br>
     * Function Describe: 当前状态下纯电续航里程 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int ELECMILGE_392 = 557847310;

    /**
     * RANGEDISPLAYCYCLE_392 <p>
     * <br>
     * Function Describe: 当前续航显示工况反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: WLTC <br>
         0x2: CLTC <br>
         0x3: Real <p>
     */
        public static final int RANGEDISPLAYCYCLE_392 = 557847313;

    /**
     * PDCUREFSWITCHSTS_392 <p>
     * <br>
     * Function Describe: 加油开关确认指令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: 开启 <br>
         0x2: 关闭 <br>
         0x3: 预留 <p>
     */
        public static final int PDCUREFSWITCHSTS_392 = 557847314;

    /**
     * PDCUREFUNOTALLWD_392 <p>
     * <br>
     * Function Describe: 禁止加油 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: RefuelAllowed（允许加油） <br>
         0x1: RefuelNotAllowed,Vehicle is running（车辆运行中，当前无法加油） <br>
         0x2: RefuelNotAllowed,Vehicle is charging（车辆正在充电或放电，当前无法加油） <br>
         0x3: RefuelNotAllowed,please power off and shit the gear shaft to P gear.（请下电，挂P档加油） <br>
         0x4: please shit the gear shaft to P gear（请挂P档加油） <br>
         0x5~0x7: Reserved <p>
     */
        public static final int PDCUREFUNOTALLWD_392 = 557847315;

    /**
     * PDCUFUFILRDOORRMN_392 <p>
     * <br>
     * Function Describe: 加油口门状态提醒 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: close （加油口盖关闭） <br>
         0x1: open（加油口盖已打开） <br>
         0x2: please push the fuel filler door opener Button（因超时关闭加油盖，如需加油请重新按加油按钮） <br>
         0x3: please close refuel door （请关闭加油盖） <br>
         0x4: If want to charge，please close refuel door（若想充电或放电，请立即关闭加油口盖） <br>
         0x5~0x7: Reserved（预留） <p>
     */
        public static final int PDCUFUFILRDOORRMN_392 = 557847316;

    /**
     * PDCUFUTANKRELSPROGS_392 <p>
     * <br>
     * Function Describe: 高压油箱泄压过程 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: default （默认） <br>
         0x1: releasing （泄压中） <br>
         0x2: break off （泄压中断） <br>
         0x3: release completed （泄压完成） <br>
         0x4: fault（油箱泄压阀故障） <br>
         0x5: refueling（加油中） <br>
         0x6: refuel finish（加油完成） <br>
         0x7: reserved（预留） <p>
     */
        public static final int PDCUFUTANKRELSPROGS_392 = 557847317;

    /**
     * PDCUENGSYSTWARN_392 <p>
     * <br>
     * Function Describe: 增程器起机提醒 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 已起动增程器，对长期未起动的增程器进行自我养护 <br>
         0x2~0x3: Reserved <p>
     */
        public static final int PDCUENGSYSTWARN_392 = 557847329;

    /**
     * REXERRDISP_392 <p>
     * <br>
     * Function Describe: 增程器故障文字提示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 灯灭 <br>
         0x1: 灯亮 <p>
     */
        public static final int REXERRDISP_392 = 557847332;

    /**
     * PWRSYSSELFCHKFLTPROMT_392 <p>
     * <br>
     * Function Describe: 动力系统自检异常提示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 不显示 <br>
         0x1: 显示 <p>
     */
        public static final int PWRSYSSELFCHKFLTPROMT_392 = 557847333;

    /**
     * ENGCONSUMAV_392 <p>
     * <br>
     * Function Describe: 本次行程平均油耗 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int ENGCONSUMAV_392 = 557847335;

    /**
     * PDCUTANKCOVERUNLCK_392 <p>
     * <br>
     * Function Describe: 油箱盖解锁命令/加油口门解锁命令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Request <br>
         0x1: Lock Request <br>
         0x2: Unlock Request <br>
         0x3: Not used <p>
     */
        public static final int PDCUTANKCOVERUNLCK_392 = 557847338;

    /**
     * PDCUBMSTEMPLOWDRVLIMITHINT_392 <p>
     * <br>
     * Function Describe: 动力电池温度低行驶受限提示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 无限制 <br>
         0x1: 电池温度过低，车辆动力受限，请平稳驾驶 <br>
         0x2: 电池温度过低，驻车加热已开启，车辆暂时无法行驶 <br>
         0x3: 温度过低，车辆无法行驶 <br>
         0x4~0x7: Reserved <p>
     */
        public static final int PDCUBMSTEMPLOWDRVLIMITHINT_392 = 557847340;

    /**
     * ENRGMODREJHINT_392 <p>
     * <br>
     * Function Describe: 能量模式无法进入提示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 不提示 <br>
         0x1: 动力系统故障，无法进入目标模式 <br>
         0x2: 电池电量过低，无法进入目标模式 <br>
         0x3: 电池功率不足，无法进入目标模式 <br>
         0x4: 动力系统不支持进入目标能量模式 <br>
         0x5: 电池电量过高，无法进入目标模式 <br>
         0x6: 当前状态下，不可调节能量模式 <br>
         0x7: Reserved <p>
     */
        public static final int ENRGMODREJHINT_392 = 557847341;

    /**
     * PDCUENRGMODFLTHINT_392 <p>
     * <br>
     * Function Describe: 强制纯电模式异常退出提示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 不提示 <br>
         0x1: 动力系统故障，退出当前能量模式 <br>
         0x2: 电池电量过低，退出当前能量模式 <br>
         0x3: 电池功率受限，退出当前能量模式 <br>
         0x4: 动力系统不支持，退出当前能量模式 <br>
         0x5~0x7: Reserved <p>
     */
        public static final int PDCUENRGMODFLTHINT_392 = 557847342;

    /**
     * PDCUEVST_392 <p>
     * <br>
     * Function Describe: 增程器工作状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: EV <br>
         0x1: R-EV <br>
         0x2~0x3: Reserved <p>
     */
        public static final int PDCUEVST_392 = 557847343;

    /**
     * PDCUPARKCHARGEST_392 <p>
     * <br>
     * Function Describe: 非ready下驻车起动发动机补电开关反馈信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: On <br>
         0x2: Off（Default） <br>
         0x3: Reserved <p>
     */
        public static final int PDCUPARKCHARGEST_392 = 557847344;

    /**
     * PDCUEMISSTESTMODST_392 <p>
     * <br>
     * Function Describe: 尾气检测模式状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: On <br>
         0x2: Off <br>
         0x3: Reserved <p>
     */
        public static final int PDCUEMISSTESTMODST_392 = 557847345;

    /**
     * PDCUIDLEMODST_392 <p>
     * <br>
     * Function Describe: 怠速模式状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: 低怠速模式 <br>
         0x2: 高怠速模式 <br>
         0x3: Reserved <p>
     */
        public static final int PDCUIDLEMODST_392 = 557847349;

    /**
     * TBOX_EXHIBCARMODDISABLENOTICE_5ED <p>
     * <br>
     * Function Describe: 展车模式状态下TBOX部分功能不可用 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 不显示 <br>
         0x1: 显示通用提示 <br>
         0x2~0x3: Reserved <p>
     */
        public static final int TBOX_EXHIBCARMODDISABLENOTICE_5ED = 557847350;

    /**
     * AEBACTV_183 <p>
     * <br>
     * Function Describe: AEB功能激活状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Not active <br>
         0x1: Active <p>
     */
        public static final int AEBACTV_183 = 557847351;

    /**
     * ACONOFFSTSDISP1_271 <p>
     * <br>
     * Function Describe: 1排空调开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: On <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ACONOFFSTSDISP1_271 = 557847352;

    /**
     * ACONOFFSTSDISP2_271 <p>
     * <br>
     * Function Describe: 2排空调开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: On <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ACONOFFSTSDISP2_271 = 557847353;

    /**
     * ACONOFFSTSDISP3_271 <p>
     * <br>
     * Function Describe: 3排空调开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: On <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ACONOFFSTSDISP3_271 = 557847354;

    /**
     * ACBLOWRLELDISP1_271 <p>
     * <br>
     * Function Describe: 风量1显示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: Level 0 (OFF) <br>
         0x2: Level 1 <br>
         0x3: Level 2 <br>
         0x4: Level 3 <br>
         0x5: Level 4 <br>
         0x6: Level 5 <br>
         0x7: Level 6 <br>
         0x8: Level 7 <br>
         0x9: Level 8 <br>
         0xA~0xE: Reserved <br>
         0xF: Invalid <p>
     */
        public static final int ACBLOWRLELDISP1_271 = 557847355;

    /**
     * ACBLOWRLELDISP3_271 <p>
     * <br>
     * Function Describe: 风量3显示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: Level 0 (OFF) <br>
         0x2: Level 1 <br>
         0x3: Level 2 <br>
         0x4: Level 3 <br>
         0x5: Level 4 <br>
         0x6: Level 5 <br>
         0x7: Level 6 <br>
         0x8: Level 7 <br>
         0x9: Level 8 <br>
         0xA~0xE: Reserved <br>
         0xF: Invalid <p>
     */
        public static final int ACBLOWRLELDISP3_271 = 557847356;

    /**
     * ACBLOWRLELDISP5_271 <p>
     * <br>
     * Function Describe: 风量5显示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: Level 0 (OFF) <br>
         0x2: Level 1 <br>
         0x3: Level 2 <br>
         0x4: Level 3 <br>
         0x5: Level 4 <br>
         0x6: Level 5 <br>
         0x7: Level 6 <br>
         0x8: Level 7 <br>
         0x9: Level 8 <br>
         0xA~0xE: Reserved <br>
         0xF: Invalid <p>
     */
        public static final int ACBLOWRLELDISP5_271 = 557847357;

    /**
     * ACLETDISP1_271 <p>
     * <br>
     * Function Describe: 1排左温度显示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: No Temperature Display <br>
         0x2~0xF: Reserved <br>
         0x10: Low <br>
         0x11: 17℃ <br>
         0x12: 18℃ <br>
         0x13: 19℃ <br>
         0x14: 20℃ <br>
         0x15: 21℃ <br>
         0x16: 22℃ <br>
         0x17: 23℃ <br>
         0x18: 24℃ <br>
         0x19: 25℃ <br>
         0x1A: 26℃ <br>
         0x1B: 27℃ <br>
         0x1C: 28℃ <br>
         0x1D: 29℃ <br>
         0x1E: 30℃ <br>
         0x1F: 31℃ <br>
         0x20: High <br>
         0x21~0x3E: Reserved <br>
         0x3F: Invalid <p>
     */
        public static final int ACLETDISP1_271 = 557847358;

    /**
     * ACRITDISP1_271 <p>
     * <br>
     * Function Describe: 1排右温度显示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: No Temperature Display <br>
         0x2~0xF: Reserved <br>
         0x10: Low <br>
         0x11: 17℃ <br>
         0x12: 18℃ <br>
         0x13: 19℃ <br>
         0x14: 20℃ <br>
         0x15: 21℃ <br>
         0x16: 22℃ <br>
         0x17: 23℃ <br>
         0x18: 24℃ <br>
         0x19: 25℃ <br>
         0x1A: 26℃ <br>
         0x1B: 27℃ <br>
         0x1C: 28℃ <br>
         0x1D: 29℃ <br>
         0x1E: 30℃ <br>
         0x1F: 31℃ <br>
         0x20: High <br>
         0x21~0x3E: Reserved <br>
         0x3F: Invalid <p>
     */
        public static final int ACRITDISP1_271 = 557847359;

    /**
     * ACLETDISP2_271 <p>
     * <br>
     * Function Describe: 2排左温度显示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: No Temperature Display <br>
         0x2~0xF: Reserved <br>
         0x10: Low <br>
         0x11: 17℃ <br>
         0x12: 18℃ <br>
         0x13: 19℃ <br>
         0x14: 20℃ <br>
         0x15: 21℃ <br>
         0x16: 22℃ <br>
         0x17: 23℃ <br>
         0x18: 24℃ <br>
         0x19: 25℃ <br>
         0x1A: 26℃ <br>
         0x1B: 27℃ <br>
         0x1C: 28℃ <br>
         0x1D: 29℃ <br>
         0x1E: 30℃ <br>
         0x1F: 31℃ <br>
         0x20: High <br>
         0x21~0x3E: Reserved <br>
         0x3F: Invalid <p>
     */
        public static final int ACLETDISP2_271 = 557847360;

    /**
     * ACLETDISP3_271 <p>
     * <br>
     * Function Describe: 3排左温度显示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: No Temperature Display <br>
         0x2~0xF: Reserved <br>
         0x10: Low <br>
         0x11: 17℃ <br>
         0x12: 18℃ <br>
         0x13: 19℃ <br>
         0x14: 20℃ <br>
         0x15: 21℃ <br>
         0x16: 22℃ <br>
         0x17: 23℃ <br>
         0x18: 24℃ <br>
         0x19: 25℃ <br>
         0x1A: 26℃ <br>
         0x1B: 27℃ <br>
         0x1C: 28℃ <br>
         0x1D: 29℃ <br>
         0x1E: 30℃ <br>
         0x1F: 31℃ <br>
         0x20: High <br>
         0x21~0x3E: Reserved <br>
         0x3F: Invalid <p>
     */
        public static final int ACLETDISP3_271 = 557847361;

    /**
     * ACLEAIRDISTBNDISP1_271 <p>
     * <br>
     * Function Describe: 1排左出风模式显示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
        0x1: Not display <br>
        0x2: Face <br>
        0x3: Face+Foot <br>
        0x4: Foot <br>
        0x5: Foot+Defrost <br>
        0x6: Defrost <br>
        0x7: Invalid <p>
     */
        public static final int ACLEAIRDISTBNDISP1_271 = 557847362;

    /**
     * ACRIAIRDISTBNDISP1_271 <p>
     * <br>
     * Function Describe: 1排右出风模式显示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: NO Request <br>
        0x1: Face <br>
        0x2: Face+Foot <br>
        0x3: Foot <br>
        0x4: Foot+Defrost <br>
        0x5: Defrost（Reserved） <br>
        0x6: Face & Defrost <br>
        0x7: Face & Foot & Defrost <p>
     */
        public static final int ACRIAIRDISTBNDISP1_271 = 557847363;

    /**
     * ACLEAIRDISTBNDISP2_271 <p>
     * <br>
     * Function Describe: 2排左出风模式显示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: Not display <br>
         0x2: Face <br>
         0x3: Face+Foot <br>
         0x4: Foot <br>
         0x5: Foot+Defrost <br>
         0x6: Defrost <br>
         0x7: Invalid <p>
     */
        public static final int ACLEAIRDISTBNDISP2_271 = 557847364;

    /**
     * ACLEAIRDISTBNDISP3_271 <p>
     * <br>
     * Function Describe: 3排左出风模式显示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: Not display <br>
         0x2: Face <br>
         0x3: Face+Foot <br>
         0x4: Foot <br>
         0x5: Foot+Defrost <br>
         0x6: Defrost <br>
         0x7: Invalid <p>
     */
        public static final int ACLEAIRDISTBNDISP3_271 = 557847365;

    /**
     * ACDEFRSTDISP_271 <p>
     * <br>
     * Function Describe: 前除霜显示图标 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: On <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ACDEFRSTDISP_271 = 557847366;

    /**
     * ACRECIRCDISP_271 <p>
     * <br>
     * Function Describe: 内外循环显示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
        0x1: Not display <br>
        0x2: Display Fresh Air <br>
        0x3: Display Recirculation <br>
        0x4: Auto <br>
        0x5~0x6: Reserved <br>
        0x7: Invalid <p>
     */
        public static final int ACRECIRCDISP_271 = 557847367;

    /**
     * ACLEAUTODISP1_271 <p>
     * <br>
     * Function Describe: 一排左Auto 显示图标 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: On <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ACLEAUTODISP1_271 = 557847368;

    /**
     * ACLEAUTODISP2_271 <p>
     * <br>
     * Function Describe: 二排左Auto 显示图标 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: On <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ACLEAUTODISP2_271 = 557847369;

    /**
     * ACACDISP_271 <p>
     * <br>
     * Function Describe: AC 显示图标 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: On <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ACACDISP_271 = 557847371;

    /**
     * ACDUALDISP_271 <p>
     * <br>
     * Function Describe: 双温区显示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: On(双区不同步) <br>
         0x2: OFF(双区同步) <br>
         0x3: Invalid <p>
     */
        public static final int ACDUALDISP_271 = 557847372;

    /**
     * ACECODISP_271 <p>
     * <br>
     * Function Describe: ECON（经济模式）显示图标 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: On <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ACECODISP_271 = 557847374;

    /**
     * ACAQSDISP_271 <p>
     * <br>
     * Function Describe: AQS功能状态显示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: On <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ACAQSDISP_271 = 557847377;

    /**
     * ACAIRCLNSTSDISP_271 <p>
     * <br>
     * Function Describe: 空气净化状态指示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: On <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ACAIRCLNSTSDISP_271 = 557847378;

    /**
     * ACQUICKCOOLSTSDISP_271 <p>
     * <br>
     * Function Describe: 一键凉爽状态显示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: On <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ACQUICKCOOLSTSDISP_271 = 557847380;

    /**
     * ACQUICKHEATSTSDISP_271 <p>
     * <br>
     * Function Describe: 一键取暖状态显示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: On <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ACQUICKHEATSTSDISP_271 = 557847381;

    /**
     * ACSELFSTSDISP_271 <p>
     * <br>
     * Function Describe: 自干燥功能状态显示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: On <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ACSELFSTSDISP_271 = 557847382;

    /**
     * ACCMFTSTSDISP_271 <p>
     * <br>
     * Function Describe: 空调舒适性状态显示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: Gentle <br>
         0x2: Standard <br>
         0x3: Powerful <br>
         0x4~0x6: Reserved <br>
         0x7: Invalid <p>
     */
        public static final int ACCMFTSTSDISP_271 = 557847383;

    /**
     * WION_RUNSTS_271 <p>
     * <br>
     * Function Describe: WION产品运行状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: AIUOff <br>
         0x1: AIUOn <br>
         0x2: Sleep <br>
         0x3: Reserved <p>
     */
        public static final int WION_RUNSTS_271 = 557847387;

    /**
     * ECC_AQSAIRQUALITYLEVEL_271 <p>
     * <br>
     * Function Describe: AQS空气质量等级 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Initial <br>
         0x1: 等级1 <br>
         0x2: 等级2 <br>
         0x3: 等级3 <br>
         0x4: 等级4 <br>
         0x5: 等级5 <br>
         0x6: 等级6 <br>
         0x7: Invalid <p>
     */
        public static final int ECC_AQSAIRQUALITYLEVEL_271 = 557847390;

    /**
     * L_PM25_INDEN_271 <p>
     * <br>
     * Function Describe: 车内PM2.5显示的数值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int L_PM25_INDEN_271 = 557847392;

    /**
     * OUTDT_3F2 <p>
     * <br>
     * Function Describe: 车外温度 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int OUTDT_3F2 = 557847395;

    /**
     * ECC_HEATMNGTSYSFLT_55A <p>
     * <br>
     * Function Describe: 热管理系统故障 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 正常 <br>
         0x1: 异常 <p>
     */
        public static final int ECC_HEATMNGTSYSFLT_55A = 557847396;

    /**
     * PDCUENRGMOD_3D0 <p>
     * <br>
     * Function Describe: PDCU能源模式 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: 优先用油 <br>
         0x2: 优先用电 <br>
         0x3: 自动模式 <br>
         0x4: 强制纯电 <br>
         0x5: 电量自定义 <br>
         0x6: 智能模式 <br>
         0x7: Reserved <p>
     */
        public static final int PDCUENRGMOD_3D0 = 557847403;

    /**
     * ACCHRGSHTTRSTS_356 <p>
     * <br>
     * Function Describe: 交流充放电口门板状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 关闭 <br>
         0x2: 打开 <p>
     */
        public static final int ACCHRGSHTTRSTS_356 = 557847420;

    /**
     * DRVRSEATMASSGINTENREQ_313 <p>
     * <br>
     * Function Describe: 主驾座椅按摩强度请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No Request <br>
         0x1: OFF <br>
         0x2: SOFT <br>
         0x3: MEDIUM <br>
         0x4: HEAVY <br>
         0x5~0x6: Reserved <br>
         0x7: Invalid <p>
     */
        public static final int DRVRSEATMASSGINTENREQ_313 = 557847451;

    /**
     * DRVRSEATMASSAGEZONEREQ_313 <p>
     * <br>
     * Function Describe: 主驾座椅按摩区域选择 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No Command <br>
         0x1: Backrest <br>
         0x2: Cushion <br>
         0x3: Backrest and Cushion <p>
     */
        public static final int DRVRSEATMASSAGEZONEREQ_313 = 557847452;

    /**
     * RELESEATBACKMASSGINTENREQ_313 <p>
     * <br>
     * Function Describe: 左后座椅背按摩强度请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No Request <br>
         0x1: OFF <br>
         0x2: SOFT <br>
         0x3: MEDIUM <br>
         0x4: HEAVY <br>
         0x5~0x6: Reserved <br>
         0x7: Invalid <p>
     */
        public static final int RELESEATBACKMASSGINTENREQ_313 = 557847453;

    /**
     * RELESEATBACKMASSAGEZONEREQ_313 <p>
     * <br>
     * Function Describe: 左后座椅背按摩区域选择 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No Command <br>
         0x1: Backrest <br>
         0x2: Cushion <br>
         0x3: Backrest and Cushion <p>
     */
        public static final int RELESEATBACKMASSAGEZONEREQ_313 = 557847454;

    /**
     * RELESEATCUSHIONMASSGINTENREQ_313 <p>
     * <br>
     * Function Describe: 左后座椅座按摩强度请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No Request <br>
         0x1: OFF <br>
         0x2: SOFT <br>
         0x3: MEDIUM <br>
         0x4: HEAVY <br>
         0x5~0x6: Reserved <br>
         0x7: Invalid <p>
     */
        public static final int RELESEATCUSHIONMASSGINTENREQ_313 = 557847455;

    /**
     * RELESEATCUSHIONMASSAGEZONEREQ_313 <p>
     * <br>
     * Function Describe: 左后座椅座按摩区域选择 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No Command <br>
         0x1: Backrest <br>
         0x2: Cushion <br>
         0x3: Backrest and Cushion <p>
     */
        public static final int RELESEATCUSHIONMASSAGEZONEREQ_313 = 557847456;

    /**
     * PASSEATMASSGINTENREQ_313 <p>
     * <br>
     * Function Describe: 副驾座椅按摩强度请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No Request <br>
         0x1: OFF <br>
         0x2: SOFT <br>
         0x3: MEDIUM <br>
         0x4: HEAVY <br>
         0x5~0x6: Reserved <br>
         0x7: Invalid <p>
     */
        public static final int PASSEATMASSGINTENREQ_313 = 557847457;

    /**
     * PASSEATMASSAGEZONEREQ_313 <p>
     * <br>
     * Function Describe: 副驾座椅按摩区域选择 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No Command <br>
         0x1: Backrest <br>
         0x2: Cushion <br>
         0x3: Backrest and Cushion <p>
     */
        public static final int PASSEATMASSAGEZONEREQ_313 = 557847458;

    /**
     * RERISEATBACKMASSGINTENREQ_313 <p>
     * <br>
     * Function Describe: 右后座椅背按摩强度请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No Request <br>
         0x1: OFF <br>
         0x2: SOFT <br>
         0x3: MEDIUM <br>
         0x4: HEAVY <br>
         0x5~0x6: Reserved <br>
         0x7: Invalid <p>
     */
        public static final int RERISEATBACKMASSGINTENREQ_313 = 557847459;

    /**
     * RERISEATBACKMASSAGEZONEREQ_313 <p>
     * <br>
     * Function Describe: 右后座椅背按摩区域选择 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No Command <br>
         0x1: Backrest <br>
         0x2: Cushion <br>
         0x3: Backrest and Cushion <p>
     */
        public static final int RERISEATBACKMASSAGEZONEREQ_313 = 557847460;

    /**
     * RERISEATCUSHIONMASSGINTENREQ_313 <p>
     * <br>
     * Function Describe: 右后座椅座按摩强度请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No Request <br>
         0x1: OFF <br>
         0x2: SOFT <br>
         0x3: MEDIUM <br>
         0x4: HEAVY <br>
         0x5~0x6: Reserved <br>
         0x7: Invalid <p>
     */
        public static final int RERISEATCUSHIONMASSGINTENREQ_313 = 557847461;

    /**
     * RERISEATCUSHIONMASSAGEZONEREQ_313 <p>
     * <br>
     * Function Describe: 右后座椅座按摩区域选择 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No Command <br>
         0x1: Backrest <br>
         0x2: Cushion <br>
         0x3: Backrest and Cushion <p>
     */
        public static final int RERISEATCUSHIONMASSAGEZONEREQ_313 = 557847462;

    /**
     * DRVRSEATMASSGMODREQ_313 <p>
     * <br>
     * Function Describe: 主驾座椅按摩模式请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No Request <br>
         0x1: OFF <br>
         0x2: Mode_1 <br>
         0x3: Mode_2 <br>
         0x4: Mode_3 <br>
         0x5: Mode_4 <br>
         0x6: Mode_5 <br>
         0x7: Mode_6 <br>
         0x8: Mode_7 <br>
         0x9: Mode_8 <br>
         0xA~0xB: Reserved <br>
         0xC: Invalid <p>
     */
        public static final int DRVRSEATMASSGMODREQ_313 = 557847463;

    /**
     * RELESEATBACKMASSGMODREQ_313 <p>
     * <br>
     * Function Describe: 左后座椅背按摩模式请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No Request <br>
         0x1: OFF <br>
         0x2: Mode_1 <br>
         0x3: Mode_2 <br>
         0x4: Mode_3 <br>
         0x5: Mode_4 <br>
         0x6: Mode_5 <br>
         0x7: Mode_6 <br>
         0x8: Mode_7 <br>
         0x9: Mode_8 <br>
         0xA~0xB: Reserved <br>
         0xC: Invalid <p>
     */
        public static final int RELESEATBACKMASSGMODREQ_313 = 557847464;

    /**
     * RELESEATCUSHIONMASSGMODREQ_313 <p>
     * <br>
     * Function Describe: 左后座椅座按摩模式请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No Request <br>
         0x1: OFF <br>
         0x2: Mode_1 <br>
         0x3: Mode_2 <br>
         0x4: Mode_3 <br>
         0x5: Mode_4 <br>
         0x6: Mode_5 <br>
         0x7: Mode_6 <br>
         0x8: Mode_7 <br>
         0x9: Mode_8 <br>
         0xA~0xB: Reserved <br>
         0xC: Invalid <p>
     */
        public static final int RELESEATCUSHIONMASSGMODREQ_313 = 557847465;

    /**
     * PASSEATMASSGMODREQ_313 <p>
     * <br>
     * Function Describe: 副驾座椅按摩模式请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No Request <br>
         0x1: OFF <br>
         0x2: Mode_1 <br>
         0x3: Mode_2 <br>
         0x4: Mode_3 <br>
         0x5: Mode_4 <br>
         0x6: Mode_5 <br>
         0x7: Mode_6 <br>
         0x8: Mode_7 <br>
         0x9: Mode_8 <br>
         0xA~0xB: Reserved <br>
         0xC: Invalid <p>
     */
        public static final int PASSEATMASSGMODREQ_313 = 557847466;

    /**
     * RERISEATBACKMASSGMODREQ_313 <p>
     * <br>
     * Function Describe: 右后座椅背按摩模式请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No Request <br>
         0x1: OFF <br>
         0x2: Mode_1 <br>
         0x3: Mode_2 <br>
         0x4: Mode_3 <br>
         0x5: Mode_4 <br>
         0x6: Mode_5 <br>
         0x7: Mode_6 <br>
         0x8: Mode_7 <br>
         0x9: Mode_8 <br>
         0xA~0xB: Reserved <br>
         0xC: Invalid <p>
     */
        public static final int RERISEATBACKMASSGMODREQ_313 = 557847467;

    /**
     * RERISEATCUSHIONMASSGMODREQ_313 <p>
     * <br>
     * Function Describe: 右后座椅座按摩模式请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No Request <br>
         0x1: OFF <br>
         0x2: Mode_1 <br>
         0x3: Mode_2 <br>
         0x4: Mode_3 <br>
         0x5: Mode_4 <br>
         0x6: Mode_5 <br>
         0x7: Mode_6 <br>
         0x8: Mode_7 <br>
         0x9: Mode_8 <br>
         0xA~0xB: Reserved <br>
         0xC: Invalid <p>
     */
        public static final int RERISEATCUSHIONMASSGMODREQ_313 = 557847468;

    /**
     * DOORSLDCENTRALLOCKSTS_RL_248 <p>
     * <br>
     * Function Describe: 中控锁状态信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x1: Locked <br>
         0x0: Unlocked <p>
     */
        public static final int DOORSLDCENTRALLOCKSTS_RL_248 = 557847484;

    /**
     * DOORSLDWARNANTIPINCH_RL_248 <p>
     * <br>
     * Function Describe: 防夹提示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x1: True <br>
         0x0: False <p>
     */
        public static final int DOORSLDWARNANTIPINCH_RL_248 = 557847494;

    /**
     * DOORSLDWARNDURNGDOORMOV_RL_248 <p>
     * <br>
     * Function Describe: 电动开关门运行过程中发出信号(一直发)，比如与开关门声音提示相关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x1: True <br>
         0x0: False <p>
     */
        public static final int DOORSLDWARNDURNGDOORMOV_RL_248 = 557847498;

    /**
     * DOORSLDWARNSTPDURNGDOORMOV_RL_248 <p>
     * <br>
     * Function Describe: 开门或关门过程中，有其他命令（有车速、按钮等）打断时，发出警告 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x1: True <br>
         0x0: False <p>
     */
        public static final int DOORSLDWARNSTPDURNGDOORMOV_RL_248 = 557847500;

    /**
     * DOORSLDWARNOPRTNOTSUCCSS_RL_248 <p>
     * <br>
     * Function Describe: 开关门超时时发出信号，一般是10秒，具体标定。 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x1: True <br>
         0x0: False <p>
     */
        public static final int DOORSLDWARNOPRTNOTSUCCSS_RL_248 = 557847501;

    /**
     * DOORSLDWARNDISBYWINPOSSTS_RL_248 <p>
     * <br>
     * Function Describe: 车窗互锁状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x1: True <br>
         0x0: False <p>
     */
        public static final int DOORSLDWARNDISBYWINPOSSTS_RL_248 = 557847507;

    /**
     * DOORSLDWARNDISBYCHGPORTSTS_RL_248 <p>
     * <br>
     * Function Describe: 充电口互锁状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x1: True <br>
         0x0: False <p>
     */
        public static final int DOORSLDWARNDISBYCHGPORTSTS_RL_248 = 557847508;

    /**
     * DOORSLDWARNREASON_RL_248 <p>
     * <br>
     * Function Describe: 开门条件不满足原因 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Not active <br>
         0x1: 手动模式 <br>
         0x2: 车速超标或无效 <br>
         0x3: 中控锁锁止 <br>
         0x4: 儿童锁锁止 <br>
         0x5: 车窗互锁功能激活 <br>
         0x6: 充电口互锁功能激活 <br>
         0x7: 加油口锁功能激活 <br>
         0x8: 防夹条防夹事件 <br>
         0x9: 电流霍尔防夹事件 <br>
         0xA: 防玩保护激活 <br>
         0xB: 洗车模式 <br>
         0xC: 供电电压欠压or过压 <br>
         0xD: 未完成自学习 <br>
         0xE: 滑门状态为Ukwn <br>
         0xF: 锁系统故障 <br>
         0x10: 驱动器故障 <br>
         0x11: 碰撞保护激活 <p>
     */
        public static final int DOORSLDWARNREASON_RL_248 = 557847512;

    /**
     * DOORSLDFAULTSTS_RL_248 <p>
     * <br>
     * Function Describe: 侧滑门故障状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x1: True <br>
         0x0: False <p>
     */
        public static final int DOORSLDFAULTSTS_RL_248 = 557847513;

    /**
     * DOORSLDSTS_RL_248 <p>
     * <br>
     * Function Describe: 实时门状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0xA: StopMinPntForCls <br>
         0x9: HalfClsd <br>
         0x8: StopDurgCls <br>
         0x7: MoveInBrkg <br>
         0x6: MovgIn <br>
         0x5: FullOpened <br>
         0x4: StopDurgOpen <br>
         0x3: MovgOutBrkg <br>
         0x2: MovgOut <br>
         0x1: FullClsd <br>
         0x0: Ukwn <p>
     */
        public static final int DOORSLDSTS_RL_248 = 557847521;

    /**
     * DOORSLDWARNABUSESTS_RL_248 <p>
     * <br>
     * Function Describe: 防玩状态信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x1: True <br>
         0x0: False <p>
     */
        public static final int DOORSLDWARNABUSESTS_RL_248 = 557847526;

    /**
     * DRVRDOOROPENSTSSWT_226 <p>
     * <br>
     * Function Describe: 主驾车门开关状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: Closed <br>
         0x2: Open <br>
         0x3: Invalid(Reserved) <p>
     */
        public static final int DRVRDOOROPENSTSSWT_226 = 557847529;

    /**
     * RELEDOOROPENSTSSWT_226 <p>
     * <br>
     * Function Describe: 左后车门开关状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: Closed <br>
         0x2: Open <br>
         0x3: Invalid(Reserved) <p>
     */
        public static final int RELEDOOROPENSTSSWT_226 = 557847530;

    /**
     * HOODLIDOPENSTSSWT_226 <p>
     * <br>
     * Function Describe: 前舱盖开关状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: Closed <br>
         0x2: Open <br>
         0x3: Invalid(Reserved) <p>
     */
        public static final int HOODLIDOPENSTSSWT_226 = 557847531;

    /**
     * FRNTLELOBEAMCMDOUTP_226 <p>
     * <br>
     * Function Describe: 左前近光灯输出 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: off <br>
         0x2: on <br>
         0x3: Invalid <p>
     */
        public static final int FRNTLELOBEAMCMDOUTP_226 = 557847532;

    /**
     * FRNTRILOBEAMCMDOUTP_226 <p>
     * <br>
     * Function Describe: 右前近光灯输出 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: off <br>
         0x2: on <br>
         0x3: Invalid <p>
     */
        public static final int FRNTRILOBEAMCMDOUTP_226 = 557847533;

    /**
     * FRNTLEHIBEAMCMDOUTP_226 <p>
     * <br>
     * Function Describe: 左前远光灯输出 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: off <br>
         0x2: on <br>
         0x3: Invalid <p>
     */
        public static final int FRNTLEHIBEAMCMDOUTP_226 = 557847534;

    /**
     * FRNTRIHIBEAMCMDOUTP_226 <p>
     * <br>
     * Function Describe: 右前远光灯输出 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: off <br>
         0x2: on <br>
         0x3: Invalid <p>
     */
        public static final int FRNTRIHIBEAMCMDOUTP_226 = 557847535;

    /**
     * FRNTLEPOSNLAMPCMD_226 <p>
     * <br>
     * Function Describe: 左前位置灯输出 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: off <br>
         0x2: on <br>
         0x3: Invalid <p>
     */
        public static final int FRNTLEPOSNLAMPCMD_226 = 557847536;

    /**
     * RELEPOSNLAMPCMD_226 <p>
     * <br>
     * Function Describe: 左后位置灯输出 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: off <br>
         0x2: on <br>
         0x3: Invalid <p>
     */
        public static final int RELEPOSNLAMPCMD_226 = 557847537;

    /**
     * FRNTLETURNLICMD_226 <p>
     * <br>
     * Function Describe: 左前转向灯输出 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: off <br>
         0x2: on <br>
         0x3: Invalid <p>
     */
        public static final int FRNTLETURNLICMD_226 = 557847538;

    /**
     * FRNTRITURNLICMD_226 <p>
     * <br>
     * Function Describe: 右前转向灯输出 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: off <br>
         0x2: on <br>
         0x3: Invalid <p>
     */
        public static final int FRNTRITURNLICMD_226 = 557847540;

    /**
     * CENTRHIMNTDBRKLAMPCMD_226 <p>
     * <br>
     * Function Describe: 高位制动灯输出 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: off <br>
         0x2: on <br>
         0x3: Invalid <p>
     */
        public static final int CENTRHIMNTDBRKLAMPCMD_226 = 557847547;

    /**
     * RELEBRKLAMPCMD_226 <p>
     * <br>
     * Function Describe: 左后制动灯输出 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: off <br>
         0x2: on <br>
         0x3: Invalid <p>
     */
        public static final int RELEBRKLAMPCMD_226 = 557847548;

    /**
     * RERIBRKLAMPCMD_226 <p>
     * <br>
     * Function Describe: 右后制动灯输出 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: off <br>
         0x2: on <br>
         0x3: Invalid <p>
     */
        public static final int RERIBRKLAMPCMD_226 = 557847549;

    /**
     * FRNTRIPOSNLAMPFAILRSTS_226 <p>
     * <br>
     * Function Describe: 右前位置灯故障 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: no failure <br>
         0x1: failure <p>
     */
        public static final int FRNTRIPOSNLAMPFAILRSTS_226 = 557847558;

    /**
     * FRNTRIPOSNLAMPCMD_226 <p>
     * <br>
     * Function Describe: 右前位置灯输出 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: off <br>
         0x2: on <br>
         0x3: Invalid <p>
     */
        public static final int FRNTRIPOSNLAMPCMD_226 = 557847559;

    /**
     * RERIPOSNLAMPCMD_226 <p>
     * <br>
     * Function Describe: 右后位置灯输出 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: off <br>
         0x2: on <br>
         0x3: Invalid <p>
     */
        public static final int RERIPOSNLAMPCMD_226 = 557847560;

    /**
     * HEADLIGHTHEIGHADSTSTS_226 <p>
     * <br>
     * Function Describe: 大灯高度调节反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Initializing <br>
         0x1: 0档 <br>
         0x2: 1档 <br>
         0x3: 2档 <br>
         0x4: 3档 <br>
         0x5~0x7: Reserved <p>
     */
        public static final int HEADLIGHTHEIGHADSTSTS_226 = 557847561;

    /**
     * RERIPOSNLAMPFAILRSTS_226 <p>
     * <br>
     * Function Describe: 右后位置灯故障 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: no failure <br>
         0x1: failure <p>
     */
        public static final int RERIPOSNLAMPFAILRSTS_226 = 557847562;

    /**
     * FRNTLETURNLIFAILRSTS_226 <p>
     * <br>
     * Function Describe: 左前转向灯故障状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: no failure <br>
         0x1: failure <p>
     */
        public static final int FRNTLETURNLIFAILRSTS_226 = 557847563;

    /**
     * RELETURNLIFAILRSTS_226 <p>
     * <br>
     * Function Describe: 左后转向灯故障状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: no failure <br>
         0x1: failure <p>
     */
        public static final int RELETURNLIFAILRSTS_226 = 557847564;

    /**
     * FRNTRITURNLIFAILRSTS_226 <p>
     * <br>
     * Function Describe: 右前转向灯故障状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: no failure <br>
         0x1: failure <p>
     */
        public static final int FRNTRITURNLIFAILRSTS_226 = 557847565;

    /**
     * RERITURNLIFAILRSTS_226 <p>
     * <br>
     * Function Describe: 右后转向灯故障状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: no failure <br>
         0x1: failure <p>
     */
        public static final int RERITURNLIFAILRSTS_226 = 557847566;

    /**
     * FRNTLEPOSNLAMPFAILRSTS_226 <p>
     * <br>
     * Function Describe: 左前位置灯故障 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: no failure <br>
         0x1: failure <p>
     */
        public static final int FRNTLEPOSNLAMPFAILRSTS_226 = 557847567;

    /**
     * RELEPOSNLAMPFAILRSTS_226 <p>
     * <br>
     * Function Describe: 左后位置灯故障 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: no failure <br>
         0x1: failure <p>
     */
        public static final int RELEPOSNLAMPFAILRSTS_226 = 557847568;

    /**
     * CENTRHIMNTDBRKLAMPFAILRSTS_226 <p>
     * <br>
     * Function Describe: 高位制动灯故障状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: no failure <br>
         0x1: failure <p>
     */
        public static final int CENTRHIMNTDBRKLAMPFAILRSTS_226 = 557847569;

    /**
     * RELEBRKLAMPFAILRSTS_226 <p>
     * <br>
     * Function Describe: 左后制动灯故障 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: no failure <br>
         0x1: failure <p>
     */
        public static final int RELEBRKLAMPFAILRSTS_226 = 557847570;

    /**
     * RERIBRKLAMPFAILRSTS_226 <p>
     * <br>
     * Function Describe: 右后制动灯故障 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: no failure <br>
         0x1: failure <p>
     */
        public static final int RERIBRKLAMPFAILRSTS_226 = 557847571;

    /**
     * LICENSELAMPFAILRSTS_226 <p>
     * <br>
     * Function Describe: 牌照灯故障状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: no failure <br>
         0x1: failure <p>
     */
        public static final int LICENSELAMPFAILRSTS_226 = 557847574;

    /**
     * FRNTLELOBEAMFAILRSTS_226 <p>
     * <br>
     * Function Describe: 左前近光灯故障状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: NoError <br>
         0x1: Short <br>
         0x2: Open <br>
         0x3: Other Faults <p>
     */
        public static final int FRNTLELOBEAMFAILRSTS_226 = 557847599;

    /**
     * FRNTRILOBEAMFAILRSTS_226 <p>
     * <br>
     * Function Describe: 右前近光灯故障状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: NoError <br>
         0x1: Short <br>
         0x2: Open <br>
         0x3: Other Faults <p>
     */
        public static final int FRNTRILOBEAMFAILRSTS_226 = 557847600;

    /**
     * FRNTLEHIBEAMFAILRSTS_226 <p>
     * <br>
     * Function Describe: 左前远光灯故障状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: NoError <br>
         0x1: Short <br>
         0x2: Open <br>
         0x3: Other Faults <p>
     */
        public static final int FRNTLEHIBEAMFAILRSTS_226 = 557847601;

    /**
     * FRNTRIHIBEAMFAILRSTS_226 <p>
     * <br>
     * Function Describe: 右前远光灯故障状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: NoError <br>
         0x1: Short <br>
         0x2: Open <br>
         0x3: Other Faults <p>
     */
        public static final int FRNTRIHIBEAMFAILRSTS_226 = 557847602;

    /**
     * VIU_MLSEATZGMFEEDBACK_226 <p>
     * <br>
     * Function Describe: 左后零重力座椅展开反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: default value <br>
        0x1: normal <br>
        0x2: Faulty <br>
        0x3: Regulating <br>
        0x4: opening <br>
        0x5: closeing <br>
        0x6: Opened <br>
        0x7: Closed <br>
        0x8: Paused <p>
     */
        public static final int VIU_MLSEATZGMFEEDBACK_226 = 557847603;

    /**
     * WASHCARMODAUTOWIPRSTS_226 <p>
     * <br>
     * Function Describe: 洗车模式下自动雨刮状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 禁用 <br>
         0x2: 未禁用 <br>
         0x3: Reserved <p>
     */
        public static final int WASHCARMODAUTOWIPRSTS_226 = 557847604;

    /**
     * DOORSLDCENTRALLOCKSTS_RR_249 <p>
     * <br>
     * Function Describe: 中控锁状态信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x1: Locked <br>
         0x0: Unlocked <p>
     */
        public static final int DOORSLDCENTRALLOCKSTS_RR_249 = 557847607;

    /**
     * DOORSLDWARNANTIPINCH_RR_249 <p>
     * <br>
     * Function Describe: 防夹提示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x1: True <br>
         0x0: False <p>
     */
        public static final int DOORSLDWARNANTIPINCH_RR_249 = 557847617;

    /**
     * DOORSLDWARNDURNGDOORMOV_RR_249 <p>
     * <br>
     * Function Describe: 电动开关门运行过程中发出信号(一直发)，比如与开关门声音提示相关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x1: True <br>
         0x0: False <p>
     */
        public static final int DOORSLDWARNDURNGDOORMOV_RR_249 = 557847621;

    /**
     * DOORSLDWARNSTPDURNGDOORMOV_RR_249 <p>
     * <br>
     * Function Describe: 开门或关门过程中，有其他命令（有车速、按钮等）打断时，发出警告 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x1: True <br>
         0x0: False <p>
     */
        public static final int DOORSLDWARNSTPDURNGDOORMOV_RR_249 = 557847623;

    /**
     * DOORSLDWARNOPRTNOTSUCCSS_RR_249 <p>
     * <br>
     * Function Describe: 开关门超时时发出信号，一般是10秒，具体标定。 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x1: True <br>
         0x0: False <p>
     */
        public static final int DOORSLDWARNOPRTNOTSUCCSS_RR_249 = 557847624;

    /**
     * DOORSLDWARNDISBYWINPOSSTS_RR_249 <p>
     * <br>
     * Function Describe: 车窗互锁状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x1: True <br>
         0x0: False <p>
     */
        public static final int DOORSLDWARNDISBYWINPOSSTS_RR_249 = 557847630;

    /**
     * DOORSLDWARNDISBYFUELPORTSTS_RR_249 <p>
     * <br>
     * Function Describe: 加油口互锁状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x1: True <br>
         0x0: False <p>
     */
        public static final int DOORSLDWARNDISBYFUELPORTSTS_RR_249 = 557847632;

    /**
     * DOORSLDWARNREASON_RR_249 <p>
     * <br>
     * Function Describe: 开门条件不满足原因 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Not active <br>
         0x1: 手动模式 <br>
         0x2: 车速超标或无效 <br>
         0x3: 中控锁锁止 <br>
         0x4: 儿童锁锁止 <br>
         0x5: 车窗互锁功能激活 <br>
         0x6: 充电口互锁功能激活 <br>
         0x7: 加油口锁功能激活 <br>
         0x8: 防夹条防夹事件 <br>
         0x9: 电流霍尔防夹事件 <br>
         0xA: 防玩保护激活 <br>
         0xB: 洗车模式 <br>
         0xC: 供电电压欠压or过压 <br>
         0xD: 未完成自学习 <br>
         0xE: 滑门状态为Ukwn <br>
         0xF: 锁系统故障 <br>
         0x10: 驱动器故障 <br>
         0x11: 碰撞保护激活 <p>
     */
        public static final int DOORSLDWARNREASON_RR_249 = 557847635;

    /**
     * DOORSLDFAULTSTS_RR_249 <p>
     * <br>
     * Function Describe: 侧滑门故障状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x1: True <br>
         0x0: False <p>
     */
        public static final int DOORSLDFAULTSTS_RR_249 = 557847636;

    /**
     * DOORSLDSTS_RR_249 <p>
     * <br>
     * Function Describe: 实时门状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0xA: StopMinPntForCls <br>
         0x9: HalfClsd <br>
         0x8: StopDurgCls <br>
         0x7: MoveInBrkg <br>
         0x6: MovgIn <br>
         0x5: FullOpened <br>
         0x4: StopDurgOpen <br>
         0x3: MovgOutBrkg <br>
         0x2: MovgOut <br>
         0x1: FullClsd <br>
         0x0: Ukwn <p>
     */
        public static final int DOORSLDSTS_RR_249 = 557847644;

    /**
     * DOORSLDWARNABUSESTS_RR_249 <p>
     * <br>
     * Function Describe: 防玩状态信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x1: True <br>
         0x0: False <p>
     */
        public static final int DOORSLDWARNABUSESTS_RR_249 = 557847649;

    /**
     * PASSDOOROPENSTSSWT_227 <p>
     * <br>
     * Function Describe: 副驾车门开关状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: Closed <br>
         0x2: Open <br>
         0x3: Invalid(Reserved) <p>
     */
        public static final int PASSDOOROPENSTSSWT_227 = 557847651;

    /**
     * RERIDOOROPENSTSSWT_227 <p>
     * <br>
     * Function Describe: 右后车门开关状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: Closed <br>
         0x2: Open <br>
         0x3: Invalid(Reserved) <p>
     */
        public static final int RERIDOOROPENSTSSWT_227 = 557847652;

    /**
     * REFOGLICMD_227 <p>
     * <br>
     * Function Describe: 后雾灯输出 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: off <br>
         0x2: on <br>
         0x3: Invalid <p>
     */
        public static final int REFOGLICMD_227 = 557847653;

    /**
     * REFOGLIFAILRSTS_227 <p>
     * <br>
     * Function Describe: 后雾灯故障状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: no failure <br>
         0x1: failure <p>
     */
        public static final int REFOGLIFAILRSTS_227 = 557847659;

    /**
     * RVSLAMPFAILRSTS_227 <p>
     * <br>
     * Function Describe: 倒车灯故障状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: no failure <br>
         0x1: failure <p>
     */
        public static final int RVSLAMPFAILRSTS_227 = 557847660;

    /**
     * VIU_RLSEATZGMFEEDBACK_227 <p>
     * <br>
     * Function Describe: 右后零重力座椅展开反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: default value <br>
        0x1: normal <br>
        0x2: Faulty <br>
        0x3: Regulating <br>
        0x4: opening <br>
        0x5: closeing <br>
        0x6: Opened <br>
        0x7: Closed <br>
        0x8: Paused <p>
     */
        public static final int VIU_RLSEATZGMFEEDBACK_227 = 557847664;

    /**
     * PLGM_SOUNDREMDNGREQ_EHU_488 <p>
     * <br>
     * Function Describe: 扬声器提示音请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: NO Sound:无操作，无声音提示 <br>
         0x1: PTM closing sound:尾门关闭声音提示 <br>
         0x2: PTM opening sound:尾门打开声音提示 <br>
         0x3: PTM PINCH EVENT sound:尾门防夹声音提示 <br>
         0x4: PTM delay close event sound:尾门延时关闭声音提示 <br>
         0x5: PTM position reset successful:尾门位置设置声音提示 <br>
         0x6~0x7: Reserved <p>
     */
        public static final int PLGM_SOUNDREMDNGREQ_EHU_488 = 557847667;

    /**
     * PLGM_SYSFLTINDCN_488 <p>
     * <br>
     * Function Describe: 电动尾门系统有故障 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Failure <br>
         0x1: Failure happened <p>
     */
        public static final int PLGM_SYSFLTINDCN_488 = 557847668;

    /**
     * PLGM_TRSWTSTSINDCN_488 <p>
     * <br>
     * Function Describe: 后尾门开关状态信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Stop（运行过程中停止/手动操作后停止） <br>
         0x1: Open（开启到目标开度） <br>
         0x2: close（尾门关闭状态） <br>
         0x3: opening（开启过程中） <br>
         0x4: Closing（关闭过程中） <br>
         0x5~0x7: Reserved <p>
     */
        public static final int PLGM_TRSWTSTSINDCN_488 = 557847670;

    /**
     * PLGM_ANTIPINCHSTS_488 <p>
     * <br>
     * Function Describe: 防夹状态(是否发生防夹) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Pinch <br>
         0x1: Anti-pinch Happened <p>
     */
        public static final int PLGM_ANTIPINCHSTS_488 = 557847673;

    /**
     * PWC_CRTSTS_5A4 <p>
     * <br>
     * Function Describe: PWC充电状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: OFF <br>
         0x1: Stand By Mode <br>
         0x2: In Charing <br>
         0x3: Overvoltage Protection <br>
         0x4: Lowvoltage Protection <br>
         0x5: FOD <br>
         0x6: Overcurrent Protection <br>
         0x7: Overtemperature Protection <br>
         0x8: OverPower Prptection <br>
         0x9: PEPS Forbids PWC <br>
         0xA: Other Faults <br>
         0xB: Charing Complete Remind <br>
         0xC~0x1E: Reserved <br>
         0x1F: Invalid <p>
     */
        public static final int PWC_CRTSTS_5A4 = 557847685;

    /**
     * PWC_SOFTSWSTS_5A4 <p>
     * <br>
     * Function Describe: PWC模块开关状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: OFF <br>
         0x1: ON <br>
         0x2~0x3: Reserved <p>
     */
        public static final int PWC_SOFTSWSTS_5A4 = 557847686;

    /**
     * PWC_PHONEFGTRND_5A4 <p>
     * <br>
     * Function Describe: PWC手机遗忘提醒状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Warning <br>
         0x1: Warning <p>
     */
        public static final int PWC_PHONEFGTRND_5A4 = 557847687;

    /**
     * PWC_LVPMSTS_5A4 <p>
     * <br>
     * Function Describe: PWC低压能量管理状态信号反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: LVPM Enable <br>
         0x1: LBMS Error <br>
         0x2: LBMS dismatch <br>
         0x3: Invald <br>
         0x4: LVPM disable by HUM/APP <br>
         0x5: LVPM disable by OTA <br>
         0x6~0xF: Reserved <p>
     */
        public static final int PWC_LVPMSTS_5A4 = 557847692;

    /**
     * PWC_DYNLVPMLVLFB_5A4 <p>
     * <br>
     * Function Describe: PWC低压电源管理动态分级反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: level 0 <br>
         0x1: level 1 <br>
         0x2: level 2 <br>
         0x3: level 3 <br>
         0x4~0xF: reserved <p>
     */
        public static final int PWC_DYNLVPMLVLFB_5A4 = 557847693;

    /**
     * PWC_STATLVPMLVLFB_5A4 <p>
     * <br>
     * Function Describe: PWC低压电源管理静态分级 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: IGON level 0 <br>
         0x1: IGON level 1 <br>
         0x2: IGON level 2 <br>
         0x3: IGON level 3 <br>
         0x4: IGON level 4 <br>
         0x5: IGON level 5 <br>
         0x6~0x7: Reserved <br>
         0x8: IGOFF level 0 <br>
         0x9: IGOFF level 1 <br>
         0xA~0xF: reserved <p>
     */
        public static final int PWC_STATLVPMLVLFB_5A4 = 557847694;

    /**
     * BDCEXTRLAMPSTS_2D2 <p>
     * <br>
     * Function Describe: 灯光软开关状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Initializing <br>
         0x1: Off <br>
         0x2: Auto <br>
         0x3: Park <br>
         0x4: Low Beam <br>
         0x5~0x7: invalid <p>
     */
        public static final int BDCEXTRLAMPSTS_2D2 = 557847722;

    /**
     * MIRRFADEREQSTS_2D2 <p>
     * <br>
     * Function Describe: 后视镜折叠/展开状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Unfold <br>
         0x2: Fold <br>
         0x3: Invalid <p>
     */
        public static final int MIRRFADEREQSTS_2D2 = 557847724;

    /**
     * DAYTIRUNNGLAMPSWTSTS_2D2 <p>
     * <br>
     * Function Describe: 日间行车灯开关状态反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Initializing <br>
         0x1: Disable <br>
         0x2: Enable <p>
     */
        public static final int DAYTIRUNNGLAMPSWTSTS_2D2 = 557847727;

    /**
     * REFOGLAMPSWT_2D2 <p>
     * <br>
     * Function Describe: 后雾灯开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: Not active <br>
         0x2: Active <br>
         0x3: Invalid(Reserved) <p>
     */
        public static final int REFOGLAMPSWT_2D2 = 557847729;

    /**
     * TBOX_OTAMOD_327 <p>
     * <br>
     * Function Describe: OTA模式 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 刷写模式 <br>
         0x2: 非刷写模式 <br>
         0x3: Void <p>
     */
        public static final int TBOX_OTAMOD_327 = 557847733;

    /**
     * BDCVEHMOD_2F1 <p>
     * <br>
     * Function Describe: 车辆模式 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: initialization <br>
         0x1: Normal Mode <br>
         0x2: Factory Mode（default） <br>
         0x3: Transport Mode <br>
         0x4: Crash Mode（预留） <br>
         0x5: Test Mode（预留） <br>
         0x6: Gallery Mode（预留） <br>
         0x7: Rerserved <p>
     */
        public static final int BDCVEHMOD_2F1 = 557847736;

    /**
     * BCMODOTOTDST_2F1 <p>
     * <br>
     * Function Describe: BDC备份里程 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0xFFFFFFFF: Invalid <p>
     */
        public static final int BCMODOTOTDST_2F1 = 557847739;

    /**
     * BCMODOOFFS_2F1 <p>
     * <br>
     * Function Describe: BDC备份里程偏移量 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int BCMODOOFFS_2F1 = 557847740;

    /**
     * BCMODOTOTDSTVLD_2F1 <p>
     * <br>
     * Function Describe: BDC备份里程有效位 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Initializing <br>
         0x1: Valid <br>
         0x2: Invalid <br>
         0x3: Reserved <p>
     */
        public static final int BCMODOTOTDSTVLD_2F1 = 557847741;

    /**
     * BCMODORSTCNTR_2F1 <p>
     * <br>
     * Function Describe: BDC备份里程复位次数 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Initializing <br>
         0x1: Once <br>
         0x2: Twice <br>
         0x3: Thrice <br>
         0x4: None <br>
         0x5~0x6: Reserved <br>
         0x7: Invalid <p>
     */
        public static final int BCMODORSTCNTR_2F1 = 557847742;

    /**
     * PIATWSBEFORE_2F1 <p>
     * <br>
     * Function Describe: 整车防盗状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Disarm <br>
         0x1: Remind <br>
         0x2: Prearm <br>
         0x3: Armed <br>
         0x4: Alarm <br>
         0x5: PreAlarm <br>
         0x6: DelayArm <br>
         0x7: TRUNKDISARM <p>
     */
        public static final int PIATWSBEFORE_2F1 = 557847743;

    /**
     * SELRI_287 <p>
     * <br>
     * Function Describe: 仪表循环翻页 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: active <p>
     */
        public static final int SELRI_287 = 557847744;

    /**
     * VOLUP_287 <p>
     * <br>
     * Function Describe: 音量+ <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: active <p>
     */
        public static final int VOLUP_287 = 557847745;

    /**
     * VOLDWN_287 <p>
     * <br>
     * Function Describe: 音量- <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: active <p>
     */
        public static final int VOLDWN_287 = 557847746;

    /**
     * MOVEPREV_287 <p>
     * <br>
     * Function Describe: 上一曲 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: active <p>
     */
        public static final int MOVEPREV_287 = 557847747;

    /**
     * MOVENEXT_287 <p>
     * <br>
     * Function Describe: 下一曲 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: active <p>
     */
        public static final int MOVENEXT_287 = 557847748;

    /**
     * USRDEFDKEY_287 <p>
     * <br>
     * Function Describe: 自定义功能 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Short press active <br>
         0x2: Long press active <br>
         0x3: reserved <p>
     */
        public static final int USRDEFDKEY_287 = 557847749;

    /**
     * ICCSPEECHRECOGKEY_287 <p>
     * <br>
     * Function Describe: 语音识别激活/退出 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: inactive <br>
         0x1: short press active <br>
         0x2: long press active <br>
         0x3: extra long press active <p>
     */
        public static final int ICCSPEECHRECOGKEY_287 = 557847750;

    /**
     * VOLMUTE_287 <p>
     * <br>
     * Function Describe: 暂停/播放/静音，区分长短按） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: inactive <br>
         0x1: short press active <br>
         0x2: long press active <br>
         0x3: extra long press active <p>
     */
        public static final int VOLMUTE_287 = 557847752;

    /**
     * AMP_EQMODE_35B <p>
     * <br>
     * Function Describe: EQ模式选择功放反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 默认 <br>
        0x1: 流行<POP> <br>
        0x2: 摇滚<ROCK> <br>
        0x3: 爵士<JAZZ> <br>
        0x4: 打击<BEATS> <br>
        0x5: 古典<CLASSICAL> <br>
        0x6: 自定义<USER> <br>
        0x7~0xA: Reserved <p>
     */
        public static final int AMP_EQMODE_35B = 557847753;

    /**
     * AMP_2DSURROUNDSTA_35B <p>
     * <br>
     * Function Describe: 2D环绕音效开关功放反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: ON <br>
         0x1: OFF <p>
     */
        public static final int AMP_2DSURROUNDSTA_35B = 557847756;

    /**
     * AMP_3DCHIMETURNSTA_35B <p>
     * <br>
     * Function Describe: 3D提示音-转向提醒功放反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: ON <br>
         0x1: OFF <p>
     */
        public static final int AMP_3DCHIMETURNSTA_35B = 557847757;

    /**
     * AMP_3DCHIMEPARKINGSTA_35B <p>
     * <br>
     * Function Describe: 3D提示音-驻车提醒功放反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: ON <br>
         0x1: OFF <p>
     */
        public static final int AMP_3DCHIMEPARKINGSTA_35B = 557847758;

    /**
     * AMP_3DCHIMEBLINDSTA_35B <p>
     * <br>
     * Function Describe: 3D提示音-并线提醒功放反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: ON <br>
         0x1: OFF <p>
     */
        public static final int AMP_3DCHIMEBLINDSTA_35B = 557847759;

    /**
     * AMP_EQ1STEPBACK_35B <p>
     * <br>
     * Function Describe: EQ频率点1功放反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: -9dB <br>
         0x1: -8dB <br>
         0x2: -7dB <br>
         0x3: -6dB <br>
         0x4: -5dB <br>
         0x5: -4dB <br>
         0x6: -3dB <br>
         0x7: -2dB <br>
         0x8: -1dB <br>
         0x9: 0dB <br>
         0xA: +1dB <br>
         0xB: +2dB <br>
         0xC: +3dB <br>
         0xD: +4dB <br>
         0xE: +5dB <br>
         0xF: +6dB <br>
         0x10: +7dB <br>
         0x11: +8dB <br>
         0x12: +9dB <p>
     */
        public static final int AMP_EQ1STEPBACK_35B = 557847760;

    /**
     * AMP_EQ2STEPBACK_35B <p>
     * <br>
     * Function Describe: EQ频率点2功放反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: -9dB <br>
         0x1: -8dB <br>
         0x2: -7dB <br>
         0x3: -6dB <br>
         0x4: -5dB <br>
         0x5: -4dB <br>
         0x6: -3dB <br>
         0x7: -2dB <br>
         0x8: -1dB <br>
         0x9: 0dB <br>
         0xA: +1dB <br>
         0xB: +2dB <br>
         0xC: +3dB <br>
         0xD: +4dB <br>
         0xE: +5dB <br>
         0xF: +6dB <br>
         0x10: +7dB <br>
         0x11: +8dB <br>
         0x12: +9dB <p>
     */
        public static final int AMP_EQ2STEPBACK_35B = 557847761;

    /**
     * AMP_LISTENINGPOSNSTA_35B <p>
     * <br>
     * Function Describe: 听音位调节反馈信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 主驾 <br>
        0x1: 副驾 <br>
        0x2: 二排左 <br>
        0x3: 二排右 <br>
        0x4: 三排 <br>
        0x5: 全车 <br>
        0x6: OFF <p>
     */
        public static final int AMP_LISTENINGPOSNSTA_35B = 557847762;

    /**
     * AMP_EQ3STEPBACK_35B <p>
     * <br>
     * Function Describe: EQ频率点3功放反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: -9dB <br>
         0x1: -8dB <br>
         0x2: -7dB <br>
         0x3: -6dB <br>
         0x4: -5dB <br>
         0x5: -4dB <br>
         0x6: -3dB <br>
         0x7: -2dB <br>
         0x8: -1dB <br>
         0x9: 0dB <br>
         0xA: +1dB <br>
         0xB: +2dB <br>
         0xC: +3dB <br>
         0xD: +4dB <br>
         0xE: +5dB <br>
         0xF: +6dB <br>
         0x10: +7dB <br>
         0x11: +8dB <br>
         0x12: +9dB <p>
     */
        public static final int AMP_EQ3STEPBACK_35B = 557847763;

    /**
     * AMP_VIRTSOUNDFIELDSTA_35B <p>
     * <br>
     * Function Describe: 虚拟声场反馈信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 音乐厅 <br>
         0x1: 影院 <br>
         0x2: 原声 <br>
         0x3: 舒享空间 <p>
     */
        public static final int AMP_VIRTSOUNDFIELDSTA_35B = 557847764;

    /**
     * AMP_EQ4STEPBACK_35B <p>
     * <br>
     * Function Describe: EQ频率点4功放反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: -9dB <br>
         0x1: -8dB <br>
         0x2: -7dB <br>
         0x3: -6dB <br>
         0x4: -5dB <br>
         0x5: -4dB <br>
         0x6: -3dB <br>
         0x7: -2dB <br>
         0x8: -1dB <br>
         0x9: 0dB <br>
         0xA: +1dB <br>
         0xB: +2dB <br>
         0xC: +3dB <br>
         0xD: +4dB <br>
         0xE: +5dB <br>
         0xF: +6dB <br>
         0x10: +7dB <br>
         0x11: +8dB <br>
         0x12: +9dB <p>
     */
        public static final int AMP_EQ4STEPBACK_35B = 557847765;

    /**
     * AMP_DRVRMODSTA_35B <p>
     * <br>
     * Function Describe: 主驾模式反馈信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 主驾 <br>
        0x1: 全车 <br>
        0x2: 智能 <p>
     */
        public static final int AMP_DRVRMODSTA_35B = 557847766;

    /**
     * AMP_EQ5STEPBACK_35B <p>
     * <br>
     * Function Describe: EQ频率点5功放反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: -9dB <br>
         0x1: -8dB <br>
         0x2: -7dB <br>
         0x3: -6dB <br>
         0x4: -5dB <br>
         0x5: -4dB <br>
         0x6: -3dB <br>
         0x7: -2dB <br>
         0x8: -1dB <br>
         0x9: 0dB <br>
         0xA: +1dB <br>
         0xB: +2dB <br>
         0xC: +3dB <br>
         0xD: +4dB <br>
         0xE: +5dB <br>
         0xF: +6dB <br>
         0x10: +7dB <br>
         0x11: +8dB <br>
         0x12: +9dB <p>
     */
        public static final int AMP_EQ5STEPBACK_35B = 557847767;

    /**
     * AMP_MUTECTRLSTS_35B <p>
     * <br>
     * Function Describe: 静音控制状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Unmute <br>
         0x1: Mute <p>
     */
        public static final int AMP_MUTECTRLSTS_35B = 557847768;

    /**
     * AMP_VSCMODSTS_35B <p>
     * <br>
     * Function Describe: 音量随速档位 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: Low <br>
         0x2: Mid <br>
         0x3: High <p>
     */
        public static final int AMP_VSCMODSTS_35B = 557847769;

    /**
     * AMP_EQ6STEPBACK_35B <p>
     * <br>
     * Function Describe: EQ频率点6功放反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: -9dB <br>
         0x1: -8dB <br>
         0x2: -7dB <br>
         0x3: -6dB <br>
         0x4: -5dB <br>
         0x5: -4dB <br>
         0x6: -3dB <br>
         0x7: -2dB <br>
         0x8: -1dB <br>
         0x9: 0dB <br>
         0xA: +1dB <br>
         0xB: +2dB <br>
         0xC: +3dB <br>
         0xD: +4dB <br>
         0xE: +5dB <br>
         0xF: +6dB <br>
         0x10: +7dB <br>
         0x11: +8dB <br>
         0x12: +9dB <p>
     */
        public static final int AMP_EQ6STEPBACK_35B = 557847770;

    /**
     * AMP_EQ7STEPBACK_35B <p>
     * <br>
     * Function Describe: EQ频率点7功放反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: -9dB <br>
         0x1: -8dB <br>
         0x2: -7dB <br>
         0x3: -6dB <br>
         0x4: -5dB <br>
         0x5: -4dB <br>
         0x6: -3dB <br>
         0x7: -2dB <br>
         0x8: -1dB <br>
         0x9: 0dB <br>
         0xA: +1dB <br>
         0xB: +2dB <br>
         0xC: +3dB <br>
         0xD: +4dB <br>
         0xE: +5dB <br>
         0xF: +6dB <br>
         0x10: +7dB <br>
         0x11: +8dB <br>
         0x12: +9dB <p>
     */
        public static final int AMP_EQ7STEPBACK_35B = 557847771;

    /**
     * AMP_INITSTATUS_35B <p>
     * <br>
     * Function Describe: AMP初始化状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Not Finished <br>
         0x1: Finished <br>
         0x2: Handshake OK <br>
         0x3: Reserved <p>
     */
        public static final int AMP_INITSTATUS_35B = 557847773;

    /**
     * AMP_SOUNDEFFECTSTA_35B <p>
     * <br>
     * Function Describe: 环境音效反馈信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: ON <br>
         0x1: OFF <p>
     */
        public static final int AMP_SOUNDEFFECTSTA_35B = 557847776;

    /**
     * ALMUSICRHYMODSTS_3E8 <p>
     * <br>
     * Function Describe: 氛围灯音乐律动功能状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ALMUSICRHYMODSTS_3E8 = 557847777;

    /**
     * ALSPDRHYMODSTS_3E8 <p>
     * <br>
     * Function Describe: 氛围灯车速律动功能状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ALSPDRHYMODSTS_3E8 = 557847778;

    /**
     * ALBRILESTS_3E8 <p>
     * <br>
     * Function Describe: 氛围灯亮度状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Level 1 <br>
         0x2: Level 2 <br>
         0x3: Level 3 <br>
         0x4: Level 4 <br>
         0x5: Level 5 <br>
         0x6: Level 6 <br>
         0x7: Level 7 <br>
         0x8: Level 8 <br>
         0x9: Level 9 <br>
         0xA: Level 10 <br>
         0xB: OFF <p>
     */
        public static final int ALBRILESTS_3E8 = 557847779;

    /**
     * ALWELMODSTS_3E8 <p>
     * <br>
     * Function Describe: 氛围灯迎宾模式状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Reserved <p>
     */
        public static final int ALWELMODSTS_3E8 = 557847780;

    /**
     * ALDRVMODSTS_3E8 <p>
     * <br>
     * Function Describe: 氛围灯驾驶模式状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Reserved <p>
     */
        public static final int ALDRVMODSTS_3E8 = 557847781;

    /**
     * ALSTS_3E8 <p>
     * <br>
     * Function Describe: 氛围灯总开关状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Reserved <p>
     */
        public static final int ALSTS_3E8 = 557847782;

    /**
     * ALFRONTZONESTS_3E8 <p>
     * <br>
     * Function Describe: 氛围灯前排分区开关状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ALFRONTZONESTS_3E8 = 557847783;

    /**
     * ALREARZONESTS_3E8 <p>
     * <br>
     * Function Describe: 氛围灯后排分区开关状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ALREARZONESTS_3E8 = 557847784;

    /**
     * ALROOFZONESTS_3E8 <p>
     * <br>
     * Function Describe: 氛围灯顶棚分区开关状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ALROOFZONESTS_3E8 = 557847785;

    /**
     * ALIPZONESTS_3E8 <p>
     * <br>
     * Function Describe: 氛围灯仪表台分区开关状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ALIPZONESTS_3E8 = 557847786;

    /**
     * ALBRIAUTOSTS_3E8 <p>
     * <br>
     * Function Describe: 氛围灯亮度自动调节状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ALBRIAUTOSTS_3E8 = 557847787;

    /**
     * ALCLRCSTMSTS_3E8 <p>
     * <br>
     * Function Describe: 氛围灯颜色自定义状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0~0xFF: Color1~Color256 <p>
     */
        public static final int ALCLRCSTMSTS_3E8 = 557847788;

    /**
     * ALRECMODSTS_3E8 <p>
     * <br>
     * Function Describe: 氛围灯单色主题色模式状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Mode 1 <br>
         0x2: Mode 2 <br>
         0x3: Mode 3 <br>
         0x4: Mode 4 <br>
         0x5: Mode 5 <br>
         0x6: Mode 6 <br>
         0x7: Mode 7 <br>
         0x8: Mode 8 <br>
         0x9: Mode 9 <br>
         0xA: Mode 10 <br>
         0xB: OFF <p>
     */
        public static final int ALRECMODSTS_3E8 = 557847789;

    /**
     * ALBRIBREAMODSTS_3E8 <p>
     * <br>
     * Function Describe: 氛围灯单色呼吸模式状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ALBRIBREAMODSTS_3E8 = 557847790;

    /**
     * ALDOWARSTS_3E8 <p>
     * <br>
     * Function Describe: 氛围灯开门提示功能状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ALDOWARSTS_3E8 = 557847791;

    /**
     * ALSPCHSTS_3E8 <p>
     * <br>
     * Function Describe: 氛围灯语音交互功能状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ALSPCHSTS_3E8 = 557847793;

    /**
     * ALCSTMSTS_3E8 <p>
     * <br>
     * Function Describe: 氛围灯自定义模式开关状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ALCSTMSTS_3E8 = 557847794;

    /**
     * ALACMODSTS_3E8 <p>
     * <br>
     * Function Describe: 氛围灯空调模式律动功能状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ALACMODSTS_3E8 = 557847795;

    /**
     * ALMOBCHAMODSTS_3E8 <p>
     * <br>
     * Function Describe: 氛围灯手机充电提醒功能状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ALMOBCHAMODSTS_3E8 = 557847796;

    /**
     * ALMOBFGTREMDSTS_3E8 <p>
     * <br>
     * Function Describe: 氛围灯手机遗忘提醒功能状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ALMOBFGTREMDSTS_3E8 = 557847797;

    /**
     * ALCLRMODSTS_3E8 <p>
     * <br>
     * Function Describe: 氛围灯颜色模式反馈信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Custom Mode（自定义模式） <br>
         0x2: Recommend Mode（主题色模式） <br>
         0x3: Reserved <p>
     */
        public static final int ALCLRMODSTS_3E8 = 557847798;

    /**
     * EPSFLTSTS_129 <p>
     * <br>
     * Function Describe: EPS故障灯状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: WarnLamp off <br>
         0x1: WarnLamp flash(reserved) <br>
         0x2: WarnLamp on（yellow） <br>
         0x3: WarnLamp on（red） <p>
     */
        public static final int EPSFLTSTS_129 = 557847799;

    /**
     * EPSMODESTA_129 <p>
     * <br>
     * Function Describe: EPS模式状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Void <br>
        0x1: Standard <br>
        0x2: Comfort <br>
        0x3: Sport <br>
        0x4~0x7: Reserved <p>
     */
        public static final int EPSMODESTA_129 = 557847804;

    /**
     * OHPACTV_1BC <p>
     * <br>
     * Function Describe: 过热保护 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Active <p>
     */
        public static final int OHPACTV_1BC = 557847805;

    /**
     * TIRESYSWARN_295 <p>
     * <br>
     * Function Describe: 胎压系统报警 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No any error <br>
         0x1: System error <p>
     */
        public static final int TIRESYSWARN_295 = 557847822;

    /**
     * LERETIRET_295 <p>
     * <br>
     * Function Describe: 左后胎压温度 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int LERETIRET_295 = 557847823;

    /**
     * LEFRNTTIRET_295 <p>
     * <br>
     * Function Describe: 左前胎压温度 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int LEFRNTTIRET_295 = 557847824;

    /**
     * RIFRNTTIRET_295 <p>
     * <br>
     * Function Describe: 右前胎压温度 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int RIFRNTTIRET_295 = 557847825;

    /**
     * RIRETIRET_295 <p>
     * <br>
     * Function Describe: 右后胎压温度 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int RIRETIRET_295 = 557847826;

    /**
     * TIRELEFRNTPWARN_295 <p>
     * <br>
     * Function Describe: 左前胎压报警状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No warning. <br>
         0x1: High pressure warning. <br>
         0x2: Low pressure warning. <br>
         0x3: Quik leakage. <br>
         0x4: Lost Sensor <br>
         0x5: Sensor battery low <br>
         0x6: Sensor failure <br>
         0x7: Temperature warning <br>
         0x8: initiali <p>
     */
        public static final int TIRELEFRNTPWARN_295 = 557847829;

    /**
     * LEFRNTP_295 <p>
     * <br>
     * Function Describe: 左前胎压压力 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int LEFRNTP_295 = 557847830;

    /**
     * RIFRNTP_295 <p>
     * <br>
     * Function Describe: 右前胎压压力 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int RIFRNTP_295 = 557847831;

    /**
     * RIREP_295 <p>
     * <br>
     * Function Describe: 右后胎压压力 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int RIREP_295 = 557847832;

    /**
     * LEREP_295 <p>
     * <br>
     * Function Describe: 左后胎压压力 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int LEREP_295 = 557847833;

    /**
     * TIRELEREPWARN_295 <p>
     * <br>
     * Function Describe: 左后胎压报警状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No warning. <br>
         0x1: High pressure warning. <br>
         0x2: Low pressure warning. <br>
         0x3: Quik leakage. <br>
         0x4: Lost Sensor <br>
         0x5: Sensor battery low <br>
         0x6: Sensor failure <br>
         0x7: Temperature warning <br>
         0x8: initiali <p>
     */
        public static final int TIRELEREPWARN_295 = 557847836;

    /**
     * RSM_SSLMOVSTSFB_307 <p>
     * <br>
     * Function Describe: 遮阳帘移动状态反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: open stopped <br>
        0x1: opening slide <br>
        0x2: closing slide <br>
        0x3: reversing (AP/Stall) <br>
        0x4: moving uninitialized (reserved) <br>
        0x5: close stopped <br>
        0x6~0x7: reserved <p>
     */
        public static final int RSM_SSLMOVSTSFB_307 = 557847839;

    /**
     * RSM_SSPOSITIONFB_307 <p>
     * <br>
     * Function Describe: 遮阳帘初始化状态显示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: Initializing <br>
         0x2~0x4: Reserved <br>
         0x5: Reversed <br>
         0x6: Reserved <br>
         0x7: Uninitialized <p>
     */
        public static final int RSM_SSPOSITIONFB_307 = 557847840;

    /**
     * RSM_REARSSOPENPERC_307 <p>
     * <br>
     * Function Describe: 后遮阳帘开度反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x65~0x7F: reserved <p>
     */
        public static final int RSM_REARSSOPENPERC_307 = 557847842;

    /**
     * RSM_SSINITIALIZINGSTS_307 <p>
     * <br>
     * Function Describe: 遮阳帘初始化状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: De-initialized <br>
         0x1: initialized <p>
     */
        public static final int RSM_SSINITIALIZINGSTS_307 = 557847844;

    /**
     * RSM_REARSSSTS_307 <p>
     * <br>
     * Function Describe: 后遮阳帘状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Normal <br>
         0x1: Fail <p>
     */
        public static final int RSM_REARSSSTS_307 = 557847851;

    /**
     * RSM_LOCKAUTOCLSSUNSSWTFB_307 <p>
     * <br>
     * Function Describe: 锁车自动关闭遮阳帘开关反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: initializing <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: invalid <p>
     */
        public static final int RSM_LOCKAUTOCLSSUNSSWTFB_307 = 557847852;

    /**
     * MAS_FL_DRVRMASSGINTENST_307 <p>
     * <br>
     * Function Describe: 主驾座椅按摩强度状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: OFF <br>
         0x1: SOFT <br>
         0x2: MEDIUM <br>
         0x3: HEAVY <br>
         0x4~0x6: Reserved <br>
         0x7: Error <p>
     */
        public static final int MAS_FL_DRVRMASSGINTENST_307 = 557847853;

    /**
     * MAS_RL1_SEATBACKMASSGINTENST_307 <p>
     * <br>
     * Function Describe: 左后座椅背按摩强度状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: OFF <br>
         0x1: SOFT <br>
         0x2: MEDIUM <br>
         0x3: HEAVY <br>
         0x4~0x6: Reserved <br>
         0x7: Error <p>
     */
        public static final int MAS_RL1_SEATBACKMASSGINTENST_307 = 557847864;

    /**
     * MAS_RL2_SEATCUSHIONMASSGINTENST_307 <p>
     * <br>
     * Function Describe: 左后座椅座按摩强度状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: OFF <br>
         0x1: SOFT <br>
         0x2: MEDIUM <br>
         0x3: HEAVY <br>
         0x4~0x6: Reserved <br>
         0x7: Error <p>
     */
        public static final int MAS_RL2_SEATCUSHIONMASSGINTENST_307 = 557847875;

    /**
     * MAS_FL_DRVRMASSGMODST_307 <p>
     * <br>
     * Function Describe: 主驾座椅按摩模式状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: OFF <br>
         0x1: Mode_1 <br>
         0x2: Mode_2 <br>
         0x3: Mode_3 <br>
         0x4: Mode_4 <br>
         0x5: Mode_5 <br>
         0x6: Mode_6 <br>
         0x7: Mode_7 <br>
         0x8: Mode_8 <br>
         0x9~0xA: Reserved <br>
         0xB: Error <p>
     */
        public static final int MAS_FL_DRVRMASSGMODST_307 = 557847886;

    /**
     * MAS_RL1_SEATBACKMASSGMODST_307 <p>
     * <br>
     * Function Describe: 左后座椅背按摩模式状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: OFF <br>
         0x1: Mode_1 <br>
         0x2: Mode_2 <br>
         0x3: Mode_3 <br>
         0x4: Mode_4 <br>
         0x5: Mode_5 <br>
         0x6: Mode_6 <br>
         0x7: Mode_7 <br>
         0x8: Mode_8 <br>
         0x9~0xA: Reserved <br>
         0xB: Error <p>
     */
        public static final int MAS_RL1_SEATBACKMASSGMODST_307 = 557847887;

    /**
     * MAS_RL2_SEATCUSHIONMASSGMODST_307 <p>
     * <br>
     * Function Describe: 左后座椅座按摩模式状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: OFF <br>
         0x1: Mode_1 <br>
         0x2: Mode_2 <br>
         0x3: Mode_3 <br>
         0x4: Mode_4 <br>
         0x5: Mode_5 <br>
         0x6: Mode_6 <br>
         0x7: Mode_7 <br>
         0x8: Mode_8 <br>
         0x9~0xA: Reserved <br>
         0xB: Error <p>
     */
        public static final int MAS_RL2_SEATCUSHIONMASSGMODST_307 = 557847888;

    /**
     * MAS_FR_DRVRMASSGINTENST_367 <p>
     * <br>
     * Function Describe: 副驾座椅按摩强度状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: OFF <br>
         0x1: SOFT <br>
         0x2: MEDIUM <br>
         0x3: HEAVY <br>
         0x4~0x6: Reserved <br>
         0x7: Error <p>
     */
        public static final int MAS_FR_DRVRMASSGINTENST_367 = 557847889;

    /**
     * MAS_RR1_SEATBACKMASSGINTENST_367 <p>
     * <br>
     * Function Describe: 右后座椅背按摩强度状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: OFF <br>
         0x1: SOFT <br>
         0x2: MEDIUM <br>
         0x3: HEAVY <br>
         0x4~0x6: Reserved <br>
         0x7: Error <p>
     */
        public static final int MAS_RR1_SEATBACKMASSGINTENST_367 = 557847900;

    /**
     * MAS_RR2_SEATCUSHIONMASSGINTENST_367 <p>
     * <br>
     * Function Describe: 右后座椅座按摩强度状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: OFF <br>
         0x1: SOFT <br>
         0x2: MEDIUM <br>
         0x3: HEAVY <br>
         0x4~0x6: Reserved <br>
         0x7: Error <p>
     */
        public static final int MAS_RR2_SEATCUSHIONMASSGINTENST_367 = 557847911;

    /**
     * MAS_FR_DRVRMASSGMODST_367 <p>
     * <br>
     * Function Describe: 副驾座椅按摩模式状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: OFF <br>
         0x1: Mode_1 <br>
         0x2: Mode_2 <br>
         0x3: Mode_3 <br>
         0x4: Mode_4 <br>
         0x5: Mode_5 <br>
         0x6: Mode_6 <br>
         0x7: Mode_7 <br>
         0x8: Mode_8 <br>
         0x9~0xA: Reserved <br>
         0xB: Error <p>
     */
        public static final int MAS_FR_DRVRMASSGMODST_367 = 557847922;

    /**
     * MAS_RR1_SEATBACKMASSGMODST_367 <p>
     * <br>
     * Function Describe: 右后座椅背按摩模式状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: OFF <br>
         0x1: Mode_1 <br>
         0x2: Mode_2 <br>
         0x3: Mode_3 <br>
         0x4: Mode_4 <br>
         0x5: Mode_5 <br>
         0x6: Mode_6 <br>
         0x7: Mode_7 <br>
         0x8: Mode_8 <br>
         0x9~0xA: Reserved <br>
         0xB: Error <p>
     */
        public static final int MAS_RR1_SEATBACKMASSGMODST_367 = 557847923;

    /**
     * MAS_RR2_SEATCUSHIONMASSGMODST_367 <p>
     * <br>
     * Function Describe: 右后座椅座按摩模式状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: OFF <br>
         0x1: Mode_1 <br>
         0x2: Mode_2 <br>
         0x3: Mode_3 <br>
         0x4: Mode_4 <br>
         0x5: Mode_5 <br>
         0x6: Mode_6 <br>
         0x7: Mode_7 <br>
         0x8: Mode_8 <br>
         0x9~0xA: Reserved <br>
         0xB: Error <p>
     */
        public static final int MAS_RR2_SEATCUSHIONMASSGMODST_367 = 557847924;

    /**
     * ICC_IRMOPENDOORREQ_36C <p>
     * <br>
     * Function Describe: 车载冷暖箱门开门请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No Request <br>
         0x1: Open <br>
         0x2: Reserve <br>
         0x3: Invalid <p>
     */
        public static final int ICC_IRMOPENDOORREQ_36C = 557847925;

    /**
     * ICC_IRMUVREQ_36C <p>
     * <br>
     * Function Describe: 车载冷暖箱杀菌开关请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No Request <br>
         0x1: UV ON <br>
         0x2: UV OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICC_IRMUVREQ_36C = 557847926;

    /**
     * ICC_IRMMODREQ_36C <p>
     * <br>
     * Function Describe: 车载冷暖箱工作模式请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No Request <br>
         0x1: Cooling Mode <br>
         0x2: Heating Mode <br>
         0x3: Power Save Mode <br>
         0x4: Freezeing Mode <br>
         0x5: TempKeep Mode <br>
         0x6: Reserve <br>
         0x7: Invalid <p>
     */
        public static final int ICC_IRMMODREQ_36C = 557847927;

    /**
     * ICC_IRMONOFFREQ_36C <p>
     * <br>
     * Function Describe: 车载冷暖箱功能开关请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No Request <br>
         0x1: OFF <br>
         0x2: ON <br>
         0x3: Invalid <p>
     */
        public static final int ICC_IRMONOFFREQ_36C = 557847928;

    /**
     * ICC_IRMCHILDLOCKREQ_36C <p>
     * <br>
     * Function Describe: 车载冷暖箱儿童锁开关请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No Request <br>
         0x1: Lock <br>
         0x2: Unlock <br>
         0x3: Invalid <p>
     */
        public static final int ICC_IRMCHILDLOCKREQ_36C = 557847929;

    /**
     * ICC_IRMDELAYEDWORKREQ_36C <p>
     * <br>
     * Function Describe: 延时保温工作指令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No Request <br>
         0x1: OFF <br>
         0x2: ON <br>
         0x3: Invalid <p>
     */
        public static final int ICC_IRMDELAYEDWORKREQ_36C = 557847930;

    /**
     * ICC_IRMTSET_36C <p>
     * <br>
     * Function Describe: 车载冷暖箱温度设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x7E: No Request <p>
     */
        public static final int ICC_IRMTSET_36C = 557847931;

    /**
     * ICC_IRMDELAYEDWORKTIMERSET_36C <p>
     * <br>
     * Function Describe: 延时工作时间设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x7FF: No Request <p>
     */
        public static final int ICC_IRMDELAYEDWORKTIMERSET_36C = 557847932;

    /**
     * IRM_NOTWORKREASON_36B <p>
     * <br>
     * Function Describe: 冰箱不执行工作原因 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Normal <br>
        0x1: OTA mode <br>
        0x2: LowSoc <br>
        0x3: DoorOpen <br>
        0x4: Error <br>
        0x5: 远程执行成功 <br>
        0x6: Transport Mode <br>
        0x7: 冰箱本地接管 <br>
        0x8: HV Err <br>
        0x9~0xF: Reserved <p>
     */
        public static final int IRM_NOTWORKREASON_36B = 557847933;

    /**
     * IRM_OFFREASON_36B <p>
     * <br>
     * Function Describe: 冰箱关闭原因 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Normal <br>
         0x1: OTA mode <br>
         0x2: LowSoc <br>
         0x3: DoorOpen <br>
         0x4: Error <br>
         0x5: IRM OFF Command <br>
         0x6: IGN OFF <br>
         0x7: WorkTimerOver <br>
         0x8: Transport Mode <br>
         0x9: HV Err <br>
         0xA~0xF: Reserved <p>
     */
        public static final int IRM_OFFREASON_36B = 557847934;

    /**
     * IRM_MODSTS_36B <p>
     * <br>
     * Function Describe: 车载冷暖箱工作模式状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Standby Mode <br>
         0x1: Cooling Mode <br>
         0x2: Heating Mode <br>
         0x3: Power Save Mode <br>
         0x4: Freezeing Mode <br>
         0x5: TempKeep Mode <br>
         0x6: Reserve <br>
         0x7: Invalid <p>
     */
        public static final int IRM_MODSTS_36B = 557847935;

    /**
     * IRM_TSTORG_36B <p>
     * <br>
     * Function Describe: 车载冷暖箱记忆的用户温度设定值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int IRM_TSTORG_36B = 557847936;

    /**
     * IRM_CHILDLOCKSTS_36B <p>
     * <br>
     * Function Describe: 车载冷暖箱儿童锁状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Unlock <br>
        0x1: Lock <br>
        0x2: Reserved <br>
        0x3: Invalid <p>
     */
        public static final int IRM_CHILDLOCKSTS_36B = 557847937;

    /**
     * IRM_DOOROPENWARN_36B <p>
     * <br>
     * Function Describe: 车载冷暖箱门未关闭超时提醒 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: noWarning <br>
         0x1: 3minDoorOpening <br>
         0x2: 5minDoorOpening <br>
         0x3: Invalid <p>
     */
        public static final int IRM_DOOROPENWARN_36B = 557847938;

    /**
     * IRM_DOORSTS_36B <p>
     * <br>
     * Function Describe: 车载冷暖箱门状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Closed <br>
         0x1: Opened <br>
         0x2: Reserved <br>
         0x3: Invalid <p>
     */
        public static final int IRM_DOORSTS_36B = 557847939;

    /**
     * IRM_UVSTS_36B <p>
     * <br>
     * Function Describe: 车载冷暖箱杀菌灯工作状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: OFF <br>
         0x1: ON <br>
         0x2: Reserved <br>
         0x3: Invalid <p>
     */
        public static final int IRM_UVSTS_36B = 557847940;

    /**
     * IRM_WORKTIMER_36B <p>
     * <br>
     * Function Describe: 延时工作时间设置反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x7FF: Invalid <p>
     */
        public static final int IRM_WORKTIMER_36B = 557847941;

    /**
     * IRM_DELAYEDWORKST_36B <p>
     * <br>
     * Function Describe: 延时保温工作状态反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int IRM_DELAYEDWORKST_36B = 557847942;

    /**
     * IRM_WORKTIMERLEFT_36B <p>
     * <br>
     * Function Describe: 延时工作时间倒计时时长 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x7FF: Invalid <p>
     */
        public static final int IRM_WORKTIMERLEFT_36B = 557847943;

    /**
     * IRM_INBOXT_36B <p>
     * <br>
     * Function Describe: 车载冷暖箱箱内实时温度 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x7F: Invalid <p>
     */
        public static final int IRM_INBOXT_36B = 557847944;

    /**
     * IRM_UERR_387 <p>
     * <br>
     * Function Describe: 车载冷暖箱供电电压故障状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Normal <br>
         0x1: Over Voltage <br>
         0x2: Under Voltage <br>
         0x3: Invalid <p>
     */
        public static final int IRM_UERR_387 = 557847945;

    /**
     * IRM_UVERR_387 <p>
     * <br>
     * Function Describe: 车载冷暖箱杀菌灯故障状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Normal <br>
         0x1: Short Circuit <br>
         0x2: Open Circuit <br>
         0x3: Invalid <p>
     */
        public static final int IRM_UVERR_387 = 557847946;

    /**
     * IRM_TSNSRERR_387 <p>
     * <br>
     * Function Describe: 车载冷暖箱温度传感器故障状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Normal <br>
         0x1: Short Circuit <br>
         0x2: Open Circuit <br>
         0x3: Invalid <p>
     */
        public static final int IRM_TSNSRERR_387 = 557847947;

    /**
     * IRM_FANERR_387 <p>
     * <br>
     * Function Describe: 车载冷暖箱冷却风扇故障状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Normal <br>
         0x1: Short Circuit <br>
         0x2: Open Circuit <br>
         0x3: Invalid <p>
     */
        public static final int IRM_FANERR_387 = 557847948;

    /**
     * IRM_LEDERR_387 <p>
     * <br>
     * Function Describe: 车载冷暖箱LED照明灯故障状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Normal <br>
         0x1: Short Circuit <br>
         0x2: Open Circuit <br>
         0x3: Invalid <p>
     */
        public static final int IRM_LEDERR_387 = 557847949;

    /**
     * IRM_REFRIGERATIONERR_387 <p>
     * <br>
     * Function Describe: 车载冷暖箱压缩机制冷故障 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Initial <br>
         0x1: No Fault <br>
         0x2: Fault <br>
         0x3: Invalid <p>
     */
        public static final int IRM_REFRIGERATIONERR_387 = 557847950;

    /**
     * IRM_HEATERR_387 <p>
     * <br>
     * Function Describe: 车载冷暖箱制热故障 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Initial <br>
         0x1: No Fault <br>
         0x2: Fault <br>
         0x3: Invalid <p>
     */
        public static final int IRM_HEATERR_387 = 557847951;

    /**
     * IRM_DOORSTRUTERR_387 <p>
     * <br>
     * Function Describe: 车载冷暖箱门撑杆电机故障状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Initial <br>
         0x1: No Fault <br>
         0x2: Fault <br>
         0x3: Invalid <p>
     */
        public static final int IRM_DOORSTRUTERR_387 = 557847952;

    /**
     * IRM_LOCALCOMMUNICATIONERR_387 <p>
     * <br>
     * Function Describe: 车载冷暖箱主板与显示板内部通信故障 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Initial <br>
         0x1: No Fault <br>
         0x2: Fault <br>
         0x3: Invalid <p>
     */
        public static final int IRM_LOCALCOMMUNICATIONERR_387 = 557847953;

    /**
     * IRM_EXCOMMUNICATIONERR_387 <p>
     * <br>
     * Function Describe: 车载冷暖箱与外部通信故障 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Initial <br>
         0x1: No Fault <br>
         0x2: Fault <br>
         0x3: Invalid <p>
     */
        public static final int IRM_EXCOMMUNICATIONERR_387 = 557847954;

    /**
     * USEID_0_245 <p>
     * <br>
     * Function Describe: 账户ID_0 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int USEID_0_245 = 557847956;

    /**
     * USEID_1_245 <p>
     * <br>
     * Function Describe: 账户ID_1 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int USEID_1_245 = 557847957;

    /**
     * SPORTMODACCTIM_628 <p>
     * <br>
     * Function Describe: 运动模式百公里加速时间 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int SPORTMODACCTIM_628 = 557848006;

    /**
     * COMMODACCTIM_628 <p>
     * <br>
     * Function Describe: 舒适模式百公里加速时间 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int COMMODACCTIM_628 = 557848007;

    /**
     * ECOMODACCTIM_628 <p>
     * <br>
     * Function Describe: 经济模式百公里加速时间 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int ECOMODACCTIM_628 = 557848009;

    /**
     * ONEPEDMODACCTIM_628 <p>
     * <br>
     * Function Describe: 单踏板模式百公里加速时间 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int ONEPEDMODACCTIM_628 = 557848010;

    /**
     * PERSMODACCTIM_628 <p>
     * <br>
     * Function Describe: 个性化模式百公里加速时间 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int PERSMODACCTIM_628 = 557848011;

    /**
     * TBOXSENTISNVTYSET_36A <p>
     * <br>
     * Function Describe: 哨兵模式灵敏度设置Sentinel mode Sensitivity Set <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inacitve <br>
         0x1: Low Sensitivity <br>
         0x2: Middle Sensitivity <br>
         0x3: High Sensitivity <br>
         0x4~0x6: reserved <br>
         0x7: Invalid <p>
     */
        public static final int TBOXSENTISNVTYSET_36A = 557848012;

    /**
     * TBOXSENTIMODSINGLESET_36A <p>
     * <br>
     * Function Describe: 哨兵模式单次设置（开启和关闭） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Initialize <br>
         0x1: Not active <br>
         0x2: Active <br>
         0x3: Invalid <p>
     */
        public static final int TBOXSENTIMODSINGLESET_36A = 557848014;

    /**
     * TBOXSENTIAPPIONTSTRTSTS_MINS_36A <p>
     * <br>
     * Function Describe: 哨兵预约开启时间_分钟 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Mintue 0 <br>
         0x3B: Mintue 59 <p>
     */
        public static final int TBOXSENTIAPPIONTSTRTSTS_MINS_36A = 557848015;

    /**
     * TBOXSENTIAPPIONTSTS_36A <p>
     * <br>
     * Function Describe: 哨兵预约状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Initialize <br>
         0x1: Active <br>
         0x2: Not active <br>
         0x3: Invalid <p>
     */
        public static final int TBOXSENTIAPPIONTSTS_36A = 557848016;

    /**
     * TBOXSENTIAPPIONTSTRTSTS_HR_36A <p>
     * <br>
     * Function Describe: 哨兵预约开启时间_小时 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Hour 0 <br>
         0x17: Hour 23 <p>
     */
        public static final int TBOXSENTIAPPIONTSTRTSTS_HR_36A = 557848017;

    /**
     * TBOXSENTIAPPIONTENDSTS_HR_36A <p>
     * <br>
     * Function Describe: 哨兵预约结束时间_小时 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Hour 0 <br>
         0x17: Hour 23 <p>
     */
        public static final int TBOXSENTIAPPIONTENDSTS_HR_36A = 557848018;

    /**
     * TBOXSENTIAPPIONTENDSTS_MINS_36A <p>
     * <br>
     * Function Describe: 哨兵预约结束时间_分钟 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Mintue 0 <br>
         0x3B: Mintue 59 <p>
     */
        public static final int TBOXSENTIAPPIONTENDSTS_MINS_36A = 557848019;

    /**
     * TBOXSENTIAPPIONTRPTSTS_36A <p>
     * <br>
     * Function Describe: 哨兵预约是否重复设置状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Initialize <br>
         0x1: Active <br>
         0x2: Not active <br>
         0x3: Invalid <p>
     */
        public static final int TBOXSENTIAPPIONTRPTSTS_36A = 557848020;

    /**
     * ICCSENTIMODSWSTS_369 <p>
     * <br>
     * Function Describe: 哨兵模式单次开关显示状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Initialize <br>
         0x1: Not active <br>
         0x2: Active <br>
         0x3: Invalid <p>
     */
        public static final int ICCSENTIMODSWSTS_369 = 557848033;

    /**
     * ICCSENTIAPPIONTSTRTSET_MINS_369 <p>
     * <br>
     * Function Describe: 哨兵预约开启时间设置_分钟 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Mintue 0 <br>
         0x3B: Mintue 59 <p>
     */
        public static final int ICCSENTIAPPIONTSTRTSET_MINS_369 = 557848034;

    /**
     * ICCSENTIAPPIONTSET_369 <p>
     * <br>
     * Function Describe: 哨兵预约设置开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Initialize <br>
         0x1: Active <br>
         0x2: Not active <br>
         0x3: Invalid <p>
     */
        public static final int ICCSENTIAPPIONTSET_369 = 557848035;

    /**
     * ICCSENTIAPPIONTENDSET_HR_369 <p>
     * <br>
     * Function Describe: 哨兵预约结束时间设置_小时 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Hour 0 <br>
         0x17: Hour 23 <p>
     */
        public static final int ICCSENTIAPPIONTENDSET_HR_369 = 557848036;

    /**
     * ICCSENTIAPPIONTSTRTSET_HR_369 <p>
     * <br>
     * Function Describe: 哨兵预约开启时间设置_小时 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Hour 0 <br>
         0x17: Hour 23 <p>
     */
        public static final int ICCSENTIAPPIONTSTRTSET_HR_369 = 557848037;

    /**
     * ICCSENTIAPPIONTENDSET_MINS_369 <p>
     * <br>
     * Function Describe: 哨兵预约结束时间设置_分钟 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Mintue 0 <br>
         0x3B: Mintue 59 <p>
     */
        public static final int ICCSENTIAPPIONTENDSET_MINS_369 = 557848038;

    /**
     * ICCSENTIAPPIONTRPTSET_369 <p>
     * <br>
     * Function Describe: 哨兵预约是否重复设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Initialize <br>
         0x1: Active <br>
         0x2: Not active <br>
         0x3: Invalid <p>
     */
        public static final int ICCSENTIAPPIONTRPTSET_369 = 557848045;

    /**
     * REQCHKENGTELLTL_131 <p>
     * <br>
     * Function Describe: 发送机故障灯 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Normal <br>
         0x1: 'check engine' lamp <p>
     */
        public static final int REQCHKENGTELLTL_131 = 557848048;

    /**
     * EMSCOOLTT_131 <p>
     * <br>
     * Function Describe: 发动机水温 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int EMSCOOLTT_131 = 557848049;

    /**
     * EMSCOOLTVLD_131 <p>
     * <br>
     * Function Describe: 发动机水温有效位 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Initializing <br>
         0x1: Vaild <br>
         0x2: Invalid <br>
         0x3: Reserved <p>
     */
        public static final int EMSCOOLTVLD_131 = 557848050;

    /**
     * EMSENGSTS_3E4 <p>
     * <br>
     * Function Describe: 发动机运行状态  <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Stand by <br>
         0x1: Ready <br>
         0x2: Cranking <br>
         0x3: Running <br>
         0x4: Stopping <br>
         0x5: Finish <br>
         0x6: AutoStopping <br>
         0x7: Reserved <p>
     */
        public static final int EMSENGSTS_3E4 = 557848053;

    /**
     * HMIMSGREQNR7_20D <p>
     * <br>
     * Function Describe: 钥匙遗忘车内提醒信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Information <br>
         0x1: key in reminder <p>
     */
        public static final int HMIMSGREQNR7_20D = 557848054;

    /**
     * HMIMSGREQNR3_20D <p>
     * <br>
     * Function Describe: 切换D/R档启动提示信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Information <br>
         0x1: press brake to start <p>
     */
        public static final int HMIMSGREQNR3_20D = 557848058;

    /**
     * HMIMSGREQNR2_20D <p>
     * <br>
     * Function Describe: 未发现智能钥匙 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Information <br>
         0x1: no UID found <p>
     */
        public static final int HMIMSGREQNR2_20D = 557848059;

    /**
     * HMIMSGREQNR0_20D <p>
     * <br>
     * Function Describe: 无钥匙启动系统故障 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Information <br>
         0x1: system yellow warning <p>
     */
        public static final int HMIMSGREQNR0_20D = 557848061;

    /**
     * HMIMSGREQNR13_20D <p>
     * <br>
     * Function Describe: 退出远程启动模式提示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Information <br>
         0x1: INFORM_13_DRVIER_INFORMATION <p>
     */
        public static final int HMIMSGREQNR13_20D = 557848064;

    /**
     * HMIMSGREQNR12_20D <p>
     * <br>
     * Function Describe: 请将钥匙靠近紧急启动区域或检测整车电压 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Information <br>
         0x1: Please keep UID close to SSB <p>
     */
        public static final int HMIMSGREQNR12_20D = 557848065;

    /**
     * HMIMSGREQNR9_20D <p>
     * <br>
     * Function Describe: 智能钥匙电量低提示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Information <br>
         0x1: UID low battery <p>
     */
        public static final int HMIMSGREQNR9_20D = 557848068;

    /**
     * HMIMSGREQNR8_20D <p>
     * <br>
     * Function Describe: 钥匙不在车内提醒 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Information <br>
         0x1: key out reminder <p>
     */
        public static final int HMIMSGREQNR8_20D = 557848069;

    /**
     * SMTENTRYFCTSTS_20D <p>
     * <br>
     * Function Describe: Polling功能开启状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: initialing <br>
         0x1: Unabled <br>
         0x2: Enabled <br>
         0x3: Invalid <p>
     */
        public static final int SMTENTRYFCTSTS_20D = 557848070;

    /**
     * PTMSMTENTRYMOD_20D <p>
     * <br>
     * Function Describe: 智能后备箱功能开启状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: OFF <br>
         0x2: On Mode 1 <br>
         0x3: On Mode 2 <br>
         0x4~0x6: Reserved <br>
         0x7: Invalid <p>
     */
        public static final int PTMSMTENTRYMOD_20D = 557848071;

    /**
     * ISGSYSTFLTDISP_21C <p>
     * <br>
     * Function Describe: ISG电机系统故障提示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 正常 <br>
         0x1: 异常 <p>
     */
        public static final int ISGSYSTFLTDISP_21C = 557848072;

    /**
     * ISGMTRTTEMPFLTDISP_21C <p>
     * <br>
     * Function Describe: ISG电机过温提示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 正常 <br>
         0x1: 异常 <p>
     */
        public static final int ISGMTRTTEMPFLTDISP_21C = 557848073;

    /**
     * ISGINVTEMPFLTDISP_21C <p>
     * <br>
     * Function Describe: ISG电机控制器过温提示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 正常 <br>
         0x1: 异常 <p>
     */
        public static final int ISGINVTEMPFLTDISP_21C = 557848074;

    /**
     * NOTIFYPOWEROFF_37C <p>
     * <br>
     * Function Describe: 超时下电前提醒 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 无提醒 <br>
         0x1: 提醒请求 <p>
     */
        public static final int NOTIFYPOWEROFF_37C = 557848075;

    /**
     * LBMSLOWSOCALARMDIS_373 <p>
     * <br>
     * Function Describe: 低压电池低电量报警提示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Active <br>
         0x1: Active <p>
     */
        public static final int LBMSLOWSOCALARMDIS_373 = 557848076;

    /**
     * LBMSTHERMALRUNAWAYFLT_373 <p>
     * <br>
     * Function Describe: 热失控故障 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Active <br>
         0x1: Active <p>
     */
        public static final int LBMSTHERMALRUNAWAYFLT_373 = 557848077;

    /**
     * LBMSSYSFLT_373 <p>
     * <br>
     * Function Describe: 低压电池故障状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Active <br>
         0x1: Active <p>
     */
        public static final int LBMSSYSFLT_373 = 557848078;

    /**
     * DAMPERMODSTS_366 <p>
     * <br>
     * Function Describe: 减振器模式状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 软 <br>
         0x2: 中 <br>
         0x3: 硬 <br>
         0x4~0xF: reserved <p>
     */
        public static final int DAMPERMODSTS_366 = 557848079;

    /**
     * DAMPERFAULTSIG_366 <p>
     * <br>
     * Function Describe: 减振器故障信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 正常 <br>
         0x1: 故障 <p>
     */
        public static final int DAMPERFAULTSIG_366 = 557848080;

    /**
     * ICCACWINDLESSSWT_377 <p>
     * <br>
     * Function Describe: 无风感开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
        0x1: ON <br>
        0x2: OFF <br>
        0x3: Invalid <p>
     */
        public static final int ICCACWINDLESSSWT_377 = 557848082;

    /**
     * ACPREVENTNDISP_271 <p>
     * <br>
     * Function Describe: 预通风功能状态显示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
        0x1: On <br>
        0x2: OFF <br>
        0x3: Invalid <p>
     */
        public static final int ACPREVENTNDISP_271 = 557848083;

    /**
     * ACWINDLESSSTSDISP_271 <p>
     * <br>
     * Function Describe: 无风感开关状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
        0x1: On <br>
        0x2: OFF <br>
        0x3: Invalid <p>
     */
        public static final int ACWINDLESSSTSDISP_271 = 557848084;

    /**
     * PDCUHYDMILSTS_3D0 <p>
     * <br>
     * Function Describe: 混动部件MIL点灯请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Normal <br>
        0x1: MIL lamp <p>
     */
        public static final int PDCUHYDMILSTS_3D0 = 557848085;

    /**
     * ICC_MLSEATZGMOPEN_313 <p>
     * <br>
     * Function Describe: 左后零重力座椅展开 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: default value <br>
        0x1: open <br>
        0x2: close <br>
        0x3: reserved <p>
     */
        public static final int ICC_MLSEATZGMOPEN_313 = 557848086;

    /**
     * ICC_RLSEATZGMOPEN_313 <p>
     * <br>
     * Function Describe: 右后零重力座椅展开 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: default value <br>
        0x1: open <br>
        0x2: close <br>
        0x3: reserved <p>
     */
        public static final int ICC_RLSEATZGMOPEN_313 = 557848087;

    /**
     * TIRERIFRNTPWARN_295 <p>
     * <br>
     * Function Describe: 右前胎压报警状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No warning. <br>
        0x1: High pressure warning. <br>
        0x2: Low pressure warning. <br>
        0x3: Quik leakage. <br>
        0x4: Lost Sensor <br>
        0x5: Sensor battery low <br>
        0x6: Sensor failure <br>
        0x7: Temperature warning <br>
        0x8: initiali <p>
     */
        public static final int TIRERIFRNTPWARN_295 = 557848089;

    /**
     * TIRERIREPWARN_295 <p>
     * <br>
     * Function Describe: 右后胎压报警状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No warning. <br>
        0x1: High pressure warning. <br>
        0x2: Low pressure warning. <br>
        0x3: Quik leakage. <br>
        0x4: Lost Sensor <br>
        0x5: Sensor battery low <br>
        0x6: Sensor failure <br>
        0x7: Temperature warning <br>
        0x8: initiali <p>
     */
        public static final int TIRERIREPWARN_295 = 557848090;

    /**
     * BCM_EXHIBCARMODDISABLENOTICE_37C <p>
     * <br>
     * Function Describe: 展车模式状态下BCM部分功能不可用 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 不显示 <br>
        0x1: 显示通用提示 <br>
        0x2~0x3: Reserved <p>
     */
        public static final int BCM_EXHIBCARMODDISABLENOTICE_37C = 557848091;

    /**
     * VCU_DRVGMILGDISPPERC_HIACCDEM_484 <p>
     * <br>
     * Function Describe: 驶里程显示百分比（高精度）显示需求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
        0x1: 有需求 <br>
        0x2: Reserved <br>
        0x3: invalid <p>
     */
        public static final int VCU_DRVGMILGDISPPERC_HIACCDEM_484 = 557848096;

    /**
     * BDCLVPMSTS_5C6 <p>
     * <br>
     * Function Describe: 低压能量管理状态信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: LVPM Enable <br>
        0x1: LBMS Error <br>
        0x2: LBMS dismatch <br>
        0x3: Invald <br>
        0x4: LVPM disable by HUM/APP <br>
        0x5: LVPM disable by OTA <br>
        0x6~0xF: Reserved <p>
     */
        public static final int BDCLVPMSTS_5C6 = 557848112;

    /**
     * BDCDYNLVPMLVLFB_5C6 <p>
     * <br>
     * Function Describe: 低压电源管理动态分级 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: level 0 <br>
        0x1: level 1 <br>
        0x2: level 2 <br>
        0x3: level 3 <br>
        0x4~0xF: reserved <p>
     */
        public static final int BDCDYNLVPMLVLFB_5C6 = 557848113;

    /**
     * BDCSTATLVPMLVLFB_5C6 <p>
     * <br>
     * Function Describe: 低压电源管理静态分级 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: IGON level 0 <br>
        0x1: IGON level 1 <br>
        0x2: IGON level 2 <br>
        0x3: IGON level 3 <br>
        0x4: IGON level 4 <br>
        0x5: IGON level 5 <br>
        0x6~0x7: Reserved <br>
        0x8: IGOFF level 0 <br>
        0x9: IGOFF level 1 <br>
        0xA~0xF: reserved <p>
     */
        public static final int BDCSTATLVPMLVLFB_5C6 = 557848114;

    /**
     * ACCHRGELECTCLOCKSTSFBSIG_356 <p>
     * <br>
     * Function Describe: 交流充放电电子锁状态反馈信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
        0x1: 闭锁状态 <br>
        0x2: 解锁状态 <br>
        0x3~0x7: Void <p>
     */
        public static final int ACCHRGELECTCLOCKSTSFBSIG_356 = 557848115;

    /**
     * ICC_MEDIAPOSN_3FE <p>
     * <br>
     * Function Describe: 媒体音位置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
        0x1: 全车 <br>
        0x2: 主驾 <br>
        0x3: 一排 <br>
        0x4: 二排 <br>
        0x5: 三排 <br>
        0x6: Reserved <br>
        0x7: Invalid <p>
     */
        public static final int ICC_MEDIAPOSN_3FE = 557848117;

    /**
     * VCU_DRVGMILGDISPTYPCFM_AS_482 <p>
     * <br>
     * Function Describe: 续驶里程显示类型确认 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 标准续航 <br>
        0x1: 动态续航 <br>
        0x2: WLTC续航 <br>
        0x3~0x7: Reserved <p>
     */
        public static final int VCU_DRVGMILGDISPTYPCFM_AS_482 = 557848121;

    /**
     * VIULRSEATLEVEL_31B <p>
     * <br>
     * Function Describe: 左后座椅硬按键加热挡位 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Invalid <br>
        0x1: OFF <br>
        0x2: Level_1 <br>
        0x3: Level_2 <br>
        0x4: Level_3 <br>
        0x5~0x7: Reserved <p>
     */
        public static final int VIULRSEATLEVEL_31B = 557848132;

    /**
     * VIULRSEATVENTLEVEL_31B <p>
     * <br>
     * Function Describe: 左后座椅硬按键通风挡位 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Invalid <br>
        0x1: OFF <br>
        0x2: Level_1 <br>
        0x3: Level_2 <br>
        0x4: Level_3 <br>
        0x5~0x7: Reserved <p>
     */
        public static final int VIULRSEATVENTLEVEL_31B = 557848133;

    /**
     * LRSEATPASSENGERSTS_31B <p>
     * <br>
     * Function Describe: 左后座椅是否载客 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: invalid <br>
        0x1: yes <br>
        0x2: no <br>
        0x3: reserved <p>
     */
        public static final int LRSEATPASSENGERSTS_31B = 557848134;

    /**
     * VIUTHIRDLSEATLEVEL_31B <p>
     * <br>
     * Function Describe: 三排左座椅硬按键加热挡位 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Invalid <br>
        0x1: OFF <br>
        0x2: Level_1 <br>
        0x3: Level_2 <br>
        0x4: Level_3 <br>
        0x5~0x7: Reserved <p>
     */
        public static final int VIUTHIRDLSEATLEVEL_31B = 557848135;

    /**
     * THIRDLSEATPASSENGERSTS_31B <p>
     * <br>
     * Function Describe: 三排左座椅是否载客 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Invalid <br>
        0x1: yes <br>
        0x2: no <br>
        0x3: reserved <p>
     */
        public static final int THIRDLSEATPASSENGERSTS_31B = 557848136;

    /**
     * THIRDMSEATPASSENGERSTS_31B <p>
     * <br>
     * Function Describe: 三排中座椅是否载客 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Invalid <br>
        0x1: yes <br>
        0x2: no <br>
        0x3: reserved <p>
     */
        public static final int THIRDMSEATPASSENGERSTS_31B = 557848137;

    /**
     * PASSEATPASSENGERSTS_31C <p>
     * <br>
     * Function Describe: 副驾座椅是否载客 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: void <br>
        0x1: yes <br>
        0x2: no <br>
        0x3: reserved <p>
     */
        public static final int PASSEATPASSENGERSTS_31C = 557848138;

    /**
     * RRSEATPASSENGERSTS_31C <p>
     * <br>
     * Function Describe: 右后座椅是否载客 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: invalid <br>
        0x1: yes <br>
        0x2: no <br>
        0x3: reserved <p>
     */
        public static final int RRSEATPASSENGERSTS_31C = 557848139;

    /**
     * THIRDRSEATPASSENGERSTS_31C <p>
     * <br>
     * Function Describe: 三排右座椅是否载客 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Invalid <br>
        0x1: yes <br>
        0x2: no <br>
        0x3: reserved <p>
     */
        public static final int THIRDRSEATPASSENGERSTS_31C = 557848140;

    /**
     * VIUPASSEATLEVEL_31C <p>
     * <br>
     * Function Describe: 副驾座椅硬按键加热挡位 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Invalid <br>
        0x1: OFF <br>
        0x2: Level_1 <br>
        0x3: Level_2 <br>
        0x4: Level_3 <br>
        0x5~0x7: Reserved <p>
     */
        public static final int VIUPASSEATLEVEL_31C = 557848141;

    /**
     * VIUPASSEATVENTLEVEL_31C <p>
     * <br>
     * Function Describe: 副驾座椅硬按键通风挡位 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Invalid <br>
        0x1: OFF <br>
        0x2: Level_1 <br>
        0x3: Level_2 <br>
        0x4: Level_3 <br>
        0x5~0x7: Reserved <p>
     */
        public static final int VIUPASSEATVENTLEVEL_31C = 557848142;

    /**
     * VIURRSEATLEVEL_31C <p>
     * <br>
     * Function Describe: 右后座椅硬按键加热挡位 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Invalid <br>
        0x1: OFF <br>
        0x2: Level_1 <br>
        0x3: Level_2 <br>
        0x4: Level_3 <br>
        0x5~0x7: Reserved <p>
     */
        public static final int VIURRSEATLEVEL_31C = 557848143;

    /**
     * VIURRSEATVENTLEVEL_31C <p>
     * <br>
     * Function Describe: 右后座椅硬按键通风挡位 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Invalid <br>
        0x1: OFF <br>
        0x2: Level_1 <br>
        0x3: Level_2 <br>
        0x4: Level_3 <br>
        0x5~0x7: Reserved <p>
     */
        public static final int VIURRSEATVENTLEVEL_31C = 557848144;

    /**
     * VIUTHIRDRSEATLEVEL_31C <p>
     * <br>
     * Function Describe: 三排右座椅硬按键加热挡位 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Invalid <br>
        0x1: OFF <br>
        0x2: Level_1 <br>
        0x3: Level_2 <br>
        0x4: Level_3 <br>
        0x5 <p>
     */
        public static final int VIUTHIRDRSEATLEVEL_31C = 557848145;

    /**
     * ICCCITY0_384 <p>
     * <br>
     * Function Describe: 天气状态（城市位置0） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICCCITY0_384 = 557848146;

    /**
     * ICCCITY1_384 <p>
     * <br>
     * Function Describe: 天气状态（城市位置1） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICCCITY1_384 = 557848147;

    /**
     * ICCCITY2_384 <p>
     * <br>
     * Function Describe: 天气状态（城市位置2） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICCCITY2_384 = 557848148;

    /**
     * ICCCITY3_384 <p>
     * <br>
     * Function Describe: 天气状态（城市位置3） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICCCITY3_384 = 557848149;

    /**
     * ICCWEATHER_384 <p>
     * <br>
     * Function Describe: 天气状态（天气状态） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
        0x1: 晴 <br>
        0x2: 阴 <br>
        0x3: 多云 <br>
        0x4: 雨 <br>
        0x5: 小雨 <br>
        0x6: 中雨 <br>
        0x7: 大雨 <br>
        0x8: 阵雨 <br>
        0x9: 雷阵雨 <br>
        0xA: 雾 <br>
        0xB: 霾 <br>
        0xC~0xE: Reserved <br>
        0xF: Invalid <p>
     */
        public static final int ICCWEATHER_384 = 557848150;

    /**
     * ICCACAISWT1_384 <p>
     * <br>
     * Function Describe: AI空调开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
        0x1: ON <br>
        0x2: OFF <br>
        0x3: Invalid <p>
     */
        public static final int ICCACAISWT1_384 = 557848151;

    /**
     * ICCWIND_LEVEL_384 <p>
     * <br>
     * Function Describe: 天气状态（风量等级） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 无风 <br>
        0x1: 1 级风 <br>
        0x2: 2 级风 <br>
        0x3: 3 级风 <br>
        0x4: 4 级风 <br>
        0x5: 5级风 <br>
        0x6: 6 级风 <br>
        0x7: 7 级风 <br>
        0x8: 8 级风 <br>
        0x9: 9 级风 <br>
        0xA: 10 级风 <br>
        0xB: 11 级风 <br>
        0xC: 12 级风 <br>
        0xD~0xE: 预留 <br>
        0xF: Invalid <p>
     */
        public static final int ICCWIND_LEVEL_384 = 557848152;

    /**
     * ICCPRESSURE_384 <p>
     * <br>
     * Function Describe: 天气状态（大气压强） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICCPRESSURE_384 = 557848153;

    /**
     * ICCWIND_SPEED_384 <p>
     * <br>
     * Function Describe: 天气状态（风速） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICCWIND_SPEED_384 = 557848154;

    /**
     * ICCWIND_ANGLE_384 <p>
     * <br>
     * Function Describe: 天气状态（风向） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 北风 <br>
        0x2D: 东北风 <br>
        0x5A: 东风 <br>
        0x87: 东南风 <br>
        0xB4: 南风 <br>
        0xE1: 西南风 <br>
        0x10E: 西风 <br>
        0x13B: 西北风 <br>
        0x1FF: 无持续风向（N/A） <p>
     */
        public static final int ICCWIND_ANGLE_384 = 557848155;

    /**
     * ICCFATIGUE_384 <p>
     * <br>
     * Function Describe: 疲劳状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 正常 <br>
        0x1: 疲劳无效 <br>
        0x2: 轻度疲劳 <br>
        0x3: 中度疲劳 <br>
        0x4: 重度疲劳 <br>
        0x5~0x7: 预留 <p>
     */
        public static final int ICCFATIGUE_384 = 557848156;

    /**
     * ICCSEAT1_SEX_384 <p>
     * <br>
     * Function Describe: 性别 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 男 <br>
        0x1: 女 <p>
     */
        public static final int ICCSEAT1_SEX_384 = 557848157;

    /**
     * ICCSEAT1_AGE_384 <p>
     * <br>
     * Function Describe: 年龄 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Reserved <br>
        0x1: 小于18岁 <br>
        0x2: 18-29岁 <br>
        0x3: 30-44岁 <br>
        0x4: 45岁以上 <br>
        0x5~0x7: 预留 <p>
     */
        public static final int ICCSEAT1_AGE_384 = 557848158;

    /**
     * ICCSEAT1_HEIGHT_384 <p>
     * <br>
     * Function Describe: 身高 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICCSEAT1_HEIGHT_384 = 557848159;

    /**
     * ICCSEAT1_WEIGHT_384 <p>
     * <br>
     * Function Describe: 体重 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICCSEAT1_WEIGHT_384 = 557848160;

    /**
     * ICCSEAT1_CLOTH_384 <p>
     * <br>
     * Function Describe: 衣着 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Reserved <br>
        0x1: T-shirt <br>
        0x2: Long sleeve <br>
        0x3: thick clothes <br>
        0x7: Invalid <p>
     */
        public static final int ICCSEAT1_CLOTH_384 = 557848161;

    /**
     * ICCSEAT2_SEX_384 <p>
     * <br>
     * Function Describe: 性别 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 男 <br>
        0x1: 女 <p>
     */
        public static final int ICCSEAT2_SEX_384 = 557848162;

    /**
     * ICCSEAT2_AGE_384 <p>
     * <br>
     * Function Describe: 年龄 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Reserved <br>
        0x1: 小于18岁 <br>
        0x2: 18-29岁 <br>
        0x3: 30-44岁 <br>
        0x4: 45岁以上 <br>
        0x5~0x7: 预留 <p>
     */
        public static final int ICCSEAT2_AGE_384 = 557848163;

    /**
     * ICCSEAT2_HEIGHT_384 <p>
     * <br>
     * Function Describe: 身高 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICCSEAT2_HEIGHT_384 = 557848164;

    /**
     * ICCSEAT2_WEIGHT_384 <p>
     * <br>
     * Function Describe: 体重 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICCSEAT2_WEIGHT_384 = 557848165;

    /**
     * ICCSEAT2_CLOTH_384 <p>
     * <br>
     * Function Describe: 衣着 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Reserved <br>
        0x1: T-shirt <br>
        0x2: Long sleeve <br>
        0x3: thick clothes <br>
        0x7: Invalid <p>
     */
        public static final int ICCSEAT2_CLOTH_384 = 557848166;

    /**
     * ICCSEAT3_SEX_384 <p>
     * <br>
     * Function Describe: 性别 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 男 <br>
        0x1: 女 <p>
     */
        public static final int ICCSEAT3_SEX_384 = 557848167;

    /**
     * ICCSEAT3_AGE_384 <p>
     * <br>
     * Function Describe: 年龄 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Reserved <br>
        0x1: 小于18岁 <br>
        0x2: 18-29岁 <br>
        0x3: 30-44岁 <br>
        0x4: 45岁以上 <br>
        0x5~0x7: 预留 <p>
     */
        public static final int ICCSEAT3_AGE_384 = 557848168;

    /**
     * ICCSEAT3_HEIGHT_384 <p>
     * <br>
     * Function Describe: 身高 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICCSEAT3_HEIGHT_384 = 557848169;

    /**
     * ICCSEAT3_WEIGHT_384 <p>
     * <br>
     * Function Describe: 体重 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICCSEAT3_WEIGHT_384 = 557848170;

    /**
     * ICCSEAT3_CLOTH_384 <p>
     * <br>
     * Function Describe: 衣着 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Reserved <br>
        0x1: T-shirt <br>
        0x2: Long sleeve <br>
        0x3: thick clothes <br>
        0x7: Invalid <p>
     */
        public static final int ICCSEAT3_CLOTH_384 = 557848171;

    /**
     * ICCSEAT4_SEX_384 <p>
     * <br>
     * Function Describe: 性别 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 男 <br>
        0x1: 女 <p>
     */
        public static final int ICCSEAT4_SEX_384 = 557848172;

    /**
     * ICCSEAT4_AGE_384 <p>
     * <br>
     * Function Describe: 年龄 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Reserved <br>
        0x1: 小于18岁 <br>
        0x2: 18-29岁 <br>
        0x3: 30-44岁 <br>
        0x4: 45岁以上 <br>
        0x5~0x7: 预留 <p>
     */
        public static final int ICCSEAT4_AGE_384 = 557848173;

    /**
     * ICCSEAT4_HEIGHT_384 <p>
     * <br>
     * Function Describe: 身高 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICCSEAT4_HEIGHT_384 = 557848174;

    /**
     * ICCSEAT4_WEIGHT_384 <p>
     * <br>
     * Function Describe: 体重 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICCSEAT4_WEIGHT_384 = 557848175;

    /**
     * ICCSEAT4_CLOTH_384 <p>
     * <br>
     * Function Describe: 衣着 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Reserved <br>
        0x1: T-shirt <br>
        0x2: Long sleeve <br>
        0x3: thick clothes <br>
        0x7: Invalid <p>
     */
        public static final int ICCSEAT4_CLOTH_384 = 557848176;

    /**
     * ICCSEAT5_SEX_384 <p>
     * <br>
     * Function Describe: 性别 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 男 <br>
        0x1: 女 <p>
     */
        public static final int ICCSEAT5_SEX_384 = 557848177;

    /**
     * ICCSEAT5_AGE_384 <p>
     * <br>
     * Function Describe: 年龄 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Reserved <br>
        0x1: 小于18岁 <br>
        0x2: 18-29岁 <br>
        0x3: 30-44岁 <br>
        0x4: 45岁以上 <br>
        0x5~0x7: 预留 <p>
     */
        public static final int ICCSEAT5_AGE_384 = 557848178;

    /**
     * ICCSEAT5_HEIGHT_384 <p>
     * <br>
     * Function Describe: 身高 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICCSEAT5_HEIGHT_384 = 557848179;

    /**
     * ICCSEAT5_WEIGHT_384 <p>
     * <br>
     * Function Describe: 体重 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICCSEAT5_WEIGHT_384 = 557848180;

    /**
     * ICCSEAT5_CLOTH_384 <p>
     * <br>
     * Function Describe: 衣着 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Reserved <br>
        0x1: T-shirt <br>
        0x2: Long sleeve <br>
        0x3: thick clothes <br>
        0x7: Invalid <p>
     */
        public static final int ICCSEAT5_CLOTH_384 = 557848181;

    /**
     * ICCSEAT6_SEX_384 <p>
     * <br>
     * Function Describe: 性别 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 男 <br>
        0x1: 女 <p>
     */
        public static final int ICCSEAT6_SEX_384 = 557848182;

    /**
     * ICCSEAT6_AGE_384 <p>
     * <br>
     * Function Describe: 年龄 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Reserved <br>
        0x1: 小于18岁 <br>
        0x2: 18-29岁 <br>
        0x3: 30-44岁 <br>
        0x4: 45岁以上 <br>
        0x5~0x7: 预留 <p>
     */
        public static final int ICCSEAT6_AGE_384 = 557848183;

    /**
     * ICCSEAT6_HEIGHT_384 <p>
     * <br>
     * Function Describe: 身高 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICCSEAT6_HEIGHT_384 = 557848184;

    /**
     * ICCSEAT6_WEIGHT_384 <p>
     * <br>
     * Function Describe: 体重 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICCSEAT6_WEIGHT_384 = 557848185;

    /**
     * ICCSEAT6_CLOTH_384 <p>
     * <br>
     * Function Describe: 衣着 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Reserved <br>
        0x1: T-shirt <br>
        0x2: Long sleeve <br>
        0x3: thick clothes <br>
        0x7: Invalid <p>
     */
        public static final int ICCSEAT6_CLOTH_384 = 557848186;

    /**
     * ICCSEAT7_SEX_384 <p>
     * <br>
     * Function Describe: 性别 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 男 <br>
        0x1: 女 <p>
     */
        public static final int ICCSEAT7_SEX_384 = 557848187;

    /**
     * ICCSEAT7_AGE_384 <p>
     * <br>
     * Function Describe: 年龄 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Reserved <br>
        0x1: 小于18岁 <br>
        0x2: 18-29岁 <br>
        0x3: 30-44岁 <br>
        0x4: 45岁以上 <br>
        0x5~0x7: 预留 <p>
     */
        public static final int ICCSEAT7_AGE_384 = 557848188;

    /**
     * ICCSEAT7_HEIGHT_384 <p>
     * <br>
     * Function Describe: 身高 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICCSEAT7_HEIGHT_384 = 557848189;

    /**
     * ICCSEAT7_WEIGHT_384 <p>
     * <br>
     * Function Describe: 体重 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICCSEAT7_WEIGHT_384 = 557848190;

    /**
     * ICCSEAT7_CLOTH_384 <p>
     * <br>
     * Function Describe: 衣着 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Reserved <br>
        0x1: T-shirt <br>
        0x2: Long sleeve <br>
        0x3: thick clothes <br>
        0x7: Invalid <p>
     */
        public static final int ICCSEAT7_CLOTH_384 = 557848191;

    /**
     * ICCFACEID0_384 <p>
     * <br>
     * Function Describe: 人脸识别结果(0) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICCFACEID0_384 = 557848192;

    /**
     * ICCFACEID1_384 <p>
     * <br>
     * Function Describe: 人脸识别结果(1) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICCFACEID1_384 = 557848193;

    /**
     * VDCTOICCAISTATE_382 <p>
     * <br>
     * Function Describe: AI空调运行状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: AI空调已开启 <br>
         0x2: AI空调已关闭 <br>
         0x3: Invalid <p>
     */
        public static final int VDCTOICCAISTATE_382 = 557848194;

    /**
     * VDCACTSET1_L_382 <p>
     * <br>
     * Function Describe: 一排主驾温度设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1~0xF: Reserved <br>
         0x10: Low <br>
         0x11: 17℃ <br>
         0x12: 18℃ <br>
         0x13: 19℃ <br>
         0x14: 20℃ <br>
         0x15: 21℃ <br>
         0x16: 22℃ <br>
         0x17: 23℃ <br>
         0x18: 24℃ <br>
         0x19: 25℃ <br>
         0x1A: 26℃ <br>
         0x1B: 27℃ <br>
         0x1C: 28℃ <br>
         0x1D: 29℃ <br>
         0x1E: 30℃ <br>
         0x1F: 31℃ <br>
         0x20: High <br>
         0x21~0x3E: Reserved <br>
         0x3F: Invalid <p>
     */
        public static final int VDCACTSET1_L_382 = 557848195;

    /**
     * VDCACTSET1_R_382 <p>
     * <br>
     * Function Describe: 一排副驾温度设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1~0xF: Reserved <br>
         0x10: Low <br>
         0x11: 17℃ <br>
         0x12: 18℃ <br>
         0x13: 19℃ <br>
         0x14: 20℃ <br>
         0x15: 21℃ <br>
         0x16: 22℃ <br>
         0x17: 23℃ <br>
         0x18: 24℃ <br>
         0x19: 25℃ <br>
         0x1A: 26℃ <br>
         0x1B: 27℃ <br>
         0x1C: 28℃ <br>
         0x1D: 29℃ <br>
         0x1E: 30℃ <br>
         0x1F: 31℃ <br>
         0x20: High <br>
         0x21~0x3E: Reserved <br>
         0x3F: Invalid <p>
     */
        public static final int VDCACTSET1_R_382 = 557848196;

    /**
     * VDCACTSET2_382 <p>
     * <br>
     * Function Describe: 二排温度设置。依据功能规范，低于17℃时显示Low，高于31℃时显示High <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1~0xF: Reserved <br>
         0x10: Low <br>
         0x11: 17℃ <br>
         0x12: 18℃ <br>
         0x13: 19℃ <br>
         0x14: 20℃ <br>
         0x15: 21℃ <br>
         0x16: 22℃ <br>
         0x17: 23℃ <br>
         0x18: 24℃ <br>
         0x19: 25℃ <br>
         0x1A: 26℃ <br>
         0x1B: 27℃ <br>
         0x1C: 28℃ <br>
         0x1D: 29℃ <br>
         0x1E: 30℃ <br>
         0x1F: 31℃ <br>
         0x20: High <br>
         0x21~0x3E: Reserved <br>
         0x3F: Invalid <p>
     */
        public static final int VDCACTSET2_382 = 557848197;

    /**
     * VDCACTSET3_382 <p>
     * <br>
     * Function Describe: 三排温度设置。依据功能规范，低于17℃时显示Low，高于31℃时显示High。 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1~0xF: Reserved <br>
         0x10: Low <br>
         0x11: 17℃ <br>
         0x12: 18℃ <br>
         0x13: 19℃ <br>
         0x14: 20℃ <br>
         0x15: 21℃ <br>
         0x16: 22℃ <br>
         0x17: 23℃ <br>
         0x18: 24℃ <br>
         0x19: 25℃ <br>
         0x1A: 26℃ <br>
         0x1B: 27℃ <br>
         0x1C: 28℃ <br>
         0x1D: 29℃ <br>
         0x1E: 30℃ <br>
         0x1F: 31℃ <br>
         0x20: High <br>
         0x21~0x3E: Reserved <br>
         0x3F: Invalid <p>
     */
        public static final int VDCACTSET3_382 = 557848198;

    /**
     * VDCACBLOWERLESET1_382 <p>
     * <br>
     * Function Describe: 一排风量设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Level 0(OFF) <br>
         0x2: Level 1 <br>
         0x3: Level 2 <br>
         0x4: Level 3 <br>
         0x5: Level 4 <br>
         0x6: Level 5 <br>
         0x7: Level 6 <br>
         0x8: Level 7 <br>
         0x9: Level 8 <br>
         0xA~0xE: Reserved <br>
         0xF: Invalid <p>
     */
        public static final int VDCACBLOWERLESET1_382 = 557848199;

    /**
     * VDCACBLOWRLELSET2_382 <p>
     * <br>
     * Function Describe: 二排风量设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Level 0(OFF) <br>
         0x2: Level 1 <br>
         0x3: Level 2 <br>
         0x4: Level 3 <br>
         0x5: Level 4 <br>
         0x6: Level 5 <br>
         0x7: Level 6 <br>
         0x8: Level 7 <br>
         0x9: Level 8 <br>
         0xA~0xE: Reserved <br>
         0xF: Invalid <p>
     */
        public static final int VDCACBLOWRLELSET2_382 = 557848200;

    /**
     * VDCACBLOWRLELSET3_382 <p>
     * <br>
     * Function Describe: 三排风量设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Level 0(OFF) <br>
         0x2: Level 1 <br>
         0x3: Level 2 <br>
         0x4: Level 3 <br>
         0x5: Level 4 <br>
         0x6: Level 5 <br>
         0x7: Level 6 <br>
         0x8: Level 7 <br>
         0x9: Level 8 <br>
         0xA~0xE: Reserved <br>
         0xF: Invalid <p>
     */
        public static final int VDCACBLOWRLELSET3_382 = 557848201;

    /**
     * VDCACAIRRECIRCSWT_382 <p>
     * <br>
     * Function Describe: 内循环按钮 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON(内循环) <br>
         0x2: OFF(外循环) <br>
         0x3: Invalid <p>
     */
        public static final int VDCACAIRRECIRCSWT_382 = 557848202;

    /**
     * VDCICCACONOFFSWT1_382 <p>
     * <br>
     * Function Describe: 1排空调开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: On <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int VDCICCACONOFFSWT1_382 = 557848203;

    /**
     * VDCACONOFFSWT2_382 <p>
     * <br>
     * Function Describe: 2排空调开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: On <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int VDCACONOFFSWT2_382 = 557848204;

    /**
     * VDCACDEFRSTSWT_382 <p>
     * <br>
     * Function Describe: 前除霜按钮 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int VDCACDEFRSTSWT_382 = 557848206;

    /**
     * VDCREDEFRSTSWT_382 <p>
     * <br>
     * Function Describe: 后除霜开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: On <br>
         0x2: Off <br>
         0x3: Invalid <p>
     */
        public static final int VDCREDEFRSTSWT_382 = 557848207;

    /**
     * VDCACAIRDISTBNSET1_L_382 <p>
     * <br>
     * Function Describe: 主驾吹风模式请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: NO Request <br>
         0x1: Face <br>
         0x2: Face+Foot <br>
         0x3: Foot <br>
         0x4: Foot+Defrost <br>
         0x5: Defrost（Reserved） <br>
         0x6: Reserved <br>
         0x7: Invalid <p>
     */
        public static final int VDCACAIRDISTBNSET1_L_382 = 557848208;

    /**
     * VDCACAIRDISTBNSET1_R_382 <p>
     * <br>
     * Function Describe: 副驾吹风模式请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: NO Request <br>
         0x1: Face <br>
         0x2: Face+Foot <br>
         0x3: Foot <br>
         0x4: Foot+Defrost <br>
         0x5: Defrost（Reserved） <br>
         0x6: Reserved <br>
         0x7: Invalid <p>
     */
        public static final int VDCACAIRDISTBNSET1_R_382 = 557848209;

    /**
     * VDCWIONSET_382 <p>
     * <br>
     * Function Describe: 水离子开关控制 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: NO Request <br>
         0x1: OFF <br>
         0x2: ON <br>
         0x3: Reserved <p>
     */
        public static final int VDCWIONSET_382 = 557848210;

    /**
     * VDCACAIRDISTBNSET2_382 <p>
     * <br>
     * Function Describe: 二排出风模式请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: NO Request <br>
         0x1: BlowFace <br>
         0x2: BlowFace & Foot <br>
         0x3: BlowFoot <br>
         0x4: OFF <br>
         0x5~0x7: Reserved <p>
     */
        public static final int VDCACAIRDISTBNSET2_382 = 557848211;

    /**
     * VDCACAIRDISTBNSET3_382 <p>
     * <br>
     * Function Describe: 三排出风模式请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: NO Request <br>
         0x1: BlowFace <br>
         0x2: BlowFace & Foot <br>
         0x3: BlowFoot <br>
         0x4: OFF <br>
         0x5~0x7: Reserved <p>
     */
        public static final int VDCACAIRDISTBNSET3_382 = 557848212;

    /**
     * VDCACSWT_382 <p>
     * <br>
     * Function Describe: 空调系统状态按钮 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int VDCACSWT_382 = 557848213;

    /**
     * VDCTMDRVRSEATHEAT_382 <p>
     * <br>
     * Function Describe: 主驾座椅加热指令信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Level1 <br>
         0x2: Level2 <br>
         0x3: Level3 <br>
         0x4: OFF <br>
         0x5~0x7: Reserved <p>
     */
        public static final int VDCTMDRVRSEATHEAT_382 = 557848214;

    /**
     * VDCTMDRVRSEATVENTN_382 <p>
     * <br>
     * Function Describe: 主驾座椅通风指令信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Level1 <br>
         0x2: Level2 <br>
         0x3: Level3 <br>
         0x4: OFF <br>
         0x5~0x7: Reserved <p>
     */
        public static final int VDCTMDRVRSEATVENTN_382 = 557848215;

    /**
     * VDCTMPASSSEATHEAT_382 <p>
     * <br>
     * Function Describe: 副驾座椅加热指令信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Level1 <br>
         0x2: Level2 <br>
         0x3: Level3 <br>
         0x4: OFF <br>
         0x5~0x7: Reserved <p>
     */
        public static final int VDCTMPASSSEATHEAT_382 = 557848216;

    /**
     * VDCTMPASSSEATVENTN_382 <p>
     * <br>
     * Function Describe: 副驾座椅通风指令信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Level1 <br>
         0x2: Level2 <br>
         0x3: Level3 <br>
         0x4: OFF <br>
         0x5~0x7: Reserved <p>
     */
        public static final int VDCTMPASSSEATVENTN_382 = 557848217;

    /**
     * VDCLRSEATHEAT_382 <p>
     * <br>
     * Function Describe: 左后座椅加热 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Level1 <br>
         0x2: Level2 <br>
         0x3: Level3 <br>
         0x4: OFF <br>
         0x5~0x7: Reserved <p>
     */
        public static final int VDCLRSEATHEAT_382 = 557848218;

    /**
     * VDCRRSEATHEAT_382 <p>
     * <br>
     * Function Describe: 右后座椅加热 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Level1 <br>
         0x2: Level2 <br>
         0x3: Level3 <br>
         0x4: OFF <br>
         0x5~0x7: Reserved <p>
     */
        public static final int VDCRRSEATHEAT_382 = 557848219;

    /**
     * VDCTHIRDLSEATHEAT_382 <p>
     * <br>
     * Function Describe: 三排左座椅加热 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Level1 <br>
         0x2: Level2 <br>
         0x3: Level3 <br>
         0x4: OFF <br>
         0x5~0x7: Reserved <p>
     */
        public static final int VDCTHIRDLSEATHEAT_382 = 557848220;

    /**
     * VDCTHIRDRSEATHEAT_382 <p>
     * <br>
     * Function Describe: 三排右座椅加热 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Level1 <br>
         0x2: Level2 <br>
         0x3: Level3 <br>
         0x4: OFF <br>
         0x5~0x7: Reserved <p>
     */
        public static final int VDCTHIRDRSEATHEAT_382 = 557848221;

    /**
     * VDCLRSEATVENTN_382 <p>
     * <br>
     * Function Describe: 左后座椅通风 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Level1 <br>
         0x2: Level2 <br>
         0x3: Level3 <br>
         0x4: OFF <br>
         0x5~0x7: Reserved <p>
     */
        public static final int VDCLRSEATVENTN_382 = 557848222;

    /**
     * VDCRRSEATVENTN_382 <p>
     * <br>
     * Function Describe: 右后座椅通风 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Level1 <br>
         0x2: Level2 <br>
         0x3: Level3 <br>
         0x4: OFF <br>
         0x5~0x7: Reserved <p>
     */
        public static final int VDCRRSEATVENTN_382 = 557848223;

    /**
     * VDCTHIRDLSEATVENTN_382 <p>
     * <br>
     * Function Describe: 三排左座椅通风指令信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Invalid <br>
         0x1: OFF <br>
         0x2: Level_1 <br>
         0x3: Level_2 <br>
         0x4: Level_3 <br>
         0x5~0x7: Reserved <p>
     */
        public static final int VDCTHIRDLSEATVENTN_382 = 557848224;

    /**
     * VDCTHIRDRSEATVENTN_382 <p>
     * <br>
     * Function Describe: 三排右座椅通风指令信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Invalid <br>
         0x1: OFF <br>
         0x2: Level_1 <br>
         0x3: Level_2 <br>
         0x4: Level_3 <br>
         0x5~0x7: Reserved <p>
     */
        public static final int VDCTHIRDRSEATVENTN_382 = 557848225;

    /**
     * ICSMRCSWT_377 <p>
     * <br>
     * Function Describe: 智能魔毯悬架功能开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
        0x1: On <br>
        0x2: OFF <br>
        0x3: Invalid <p>
     */
        public static final int ICSMRCSWT_377 = 557848226;

    /**
     * ICSMRCSTB_366 <p>
     * <br>
     * Function Describe: 智能魔毯悬架功能待机状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Not standby <br>
        0x1: Standby <p>
     */
        public static final int ICSMRCSTB_366 = 557848227;

    /**
     * ICSMRCAVL_366 <p>
     * <br>
     * Function Describe: 智能魔毯悬架功能可用状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Available <br>
        0x1: Not available <p>
     */
        public static final int ICSMRCAVL_366 = 557848228;

    /**
     * TAILLIGHTADASLAMPSTS_227 <p>
     * <br>
     * Function Describe: 尾灯智驾指示灯状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
        0x1: off <br>
        0x2: on <br>
        0x3: Invalid <p>
     */
        public static final int TAILLIGHTADASLAMPSTS_227 = 557848237;

    /**
     * MIRRADASLAMPSTS_227 <p>
     * <br>
     * Function Describe: 后视镜智驾指示灯状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
        0x1: off <br>
        0x2: on <br>
        0x3: Invalid <p>
     */
        public static final int MIRRADASLAMPSTS_227 = 557848238;

    /**
     * ICCFACEID2_384 <p>
     * <br>
     * Function Describe: 人脸识别结果(2) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICCFACEID2_384 = 557848240;


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
    public ALN80VehiclePropertyIds() {
    }

    /**
     * Gets a user-friendly representation of a property.
     */
    @AddedInOrBefore(majorVersion = 33)
    public static String toString(int property) {
        return CarPropertyHelper.toString(property);
    }
}