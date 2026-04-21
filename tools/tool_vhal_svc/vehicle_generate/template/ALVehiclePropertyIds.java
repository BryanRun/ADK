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
  * List of %(projectName)s vehicle property IDs.
  *
  * <p> Property IDs are used with the {@link android.car.hardware.property.CarPropertyManager} APIs
  * (e.g. {@link android.car.hardware.property.CarPropertyManager#getProperty(int, int)} or {@link
  * android.car.hardware.property.CarPropertyManager#setProperty(Class, int, int, Object)}).
  */
 public final class AL%(projectName)sVehiclePropertyIds {

     /**
      * Undefined property.
      *
      * <p>This property should never be used/will never be supported.
      */
     @AddedInOrBefore(majorVersion = 33)
     public static final int INVALID = 0;

%(g_vehicle_property_Ids_list)s

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
    public AL%(projectName)sVehiclePropertyIds() {
    }

    /**
     * Gets a user-friendly representation of a property.
     */
    @AddedInOrBefore(majorVersion = 33)
    public static String toString(int property) {
        return CarPropertyHelper.toString(property);
    }
}