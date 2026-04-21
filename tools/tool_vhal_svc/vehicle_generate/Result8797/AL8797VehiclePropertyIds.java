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
  * List of 8797 vehicle property IDs.
  *
  * <p> Property IDs are used with the {@link android.car.hardware.property.CarPropertyManager} APIs
  * (e.g. {@link android.car.hardware.property.CarPropertyManager#getProperty(int, int)} or {@link
  * android.car.hardware.property.CarPropertyManager#setProperty(Class, int, int, Object)}).
  */
 public final class AL8797VehiclePropertyIds {

     /**
      * Undefined property.
      *
      * <p>This property should never be used/will never be supported.
      */
     @AddedInOrBefore(majorVersion = 33)
     public static final int INVALID = 0;


    /**
     * PLGM_TRSWTSTSINDCN_391 <p>
     * <br>
     * Function Describe: 后尾门开关状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0:Door Open <br>
         0x1:Door Closed <p>
     */
        public static final int PLGM_TRSWTSTSINDCN_391 = 557846528;

    /**
     * S_IDCP_STAMPH_ST_1A0 <p>
     * <br>
     * Function Describe: 基于2025.1.1偏移毫秒数的高32位 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int S_IDCP_STAMPH_ST_1A0 = 557850624;

    /**
     * S_IDCP_STAMPL_ST_1A0 <p>
     * <br>
     * Function Describe: 基于2025.1.1偏移毫秒数的低32位 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int S_IDCP_STAMPL_ST_1A0 = 557850625;

    /**
     * S_IDCP_FRWDWCTL_REQ_330 <p>
     * <br>
     * Function Describe: 右前车窗控制指令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Stop <br>
         0x1:Up <br>
         0x2:Down <br>
         0x3~0x6:Reserved <br>
         0x7:Invalid <p>
     */
        public static final int S_IDCP_FRWDWCTL_REQ_330 = 557850629;

    /**
     * S_IDCP_RRWDWCTL_REQ_330 <p>
     * <br>
     * Function Describe: 右后车窗控制指令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Stop <br>
         0x1:Up <br>
         0x2:Down <br>
         0x3~0x6:Reserved <br>
         0x7:Invalid <p>
     */
        public static final int S_IDCP_RRWDWCTL_REQ_330 = 557850630;

    /**
     * IDCU_ALM_RED_28 <p>
     * <br>
     * Function Describe: 氛围灯红色调节 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int IDCU_ALM_RED_28 = 557879296;

    /**
     * IDCU_ALM_GREEN_28 <p>
     * <br>
     * Function Describe: 氛围灯绿色调节 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int IDCU_ALM_GREEN_28 = 557879297;

    /**
     * IDCU_ALM_BLUE_28 <p>
     * <br>
     * Function Describe: 氛围灯蓝色调节 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int IDCU_ALM_BLUE_28 = 557879298;

    /**
     * IDCU_ALM_TARGETTRANSITIONTIME_28 <p>
     * <br>
     * Function Describe: 渐变到目标的时间 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int IDCU_ALM_TARGETTRANSITIONTIME_28 = 557879299;

    /**
     * IDCU_ALM_FUNCTION_28 <p>
     * <br>
     * Function Describe: 氛围灯亮灭请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:OFF <br>
         0x1:On <p>
     */
        public static final int IDCU_ALM_FUNCTION_28 = 557879300;

    /**
     * IDCU_ALM_MODE_28 <p>
     * <br>
     * Function Describe: 氛围灯模式请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Default <br>
         0x1:Single 变色模式 <br>
         0x2:Breathe 呼吸模式 <br>
         0x3~0x7: Reserved <p>
     */
        public static final int IDCU_ALM_MODE_28 = 557879301;

    /**
     * IDCU_ALM_TRIGGER_28 <p>
     * <br>
     * Function Describe: 氛围灯执行触发 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Inactive 不触发 <br>
         0x1:Active 触发 <p>
     */
        public static final int IDCU_ALM_TRIGGER_28 = 557879302;

    /**
     * IDCU_ALM_INTENSITY_28 <p>
     * <br>
     * Function Describe: 氛围灯亮度调节 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int IDCU_ALM_INTENSITY_28 = 557879303;


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
    public AL8797VehiclePropertyIds() {
    }

    /**
     * Gets a user-friendly representation of a property.
     */
    @AddedInOrBefore(majorVersion = 33)
    public static String toString(int property) {
        return CarPropertyHelper.toString(property);
    }
}