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
  * List of N50 vehicle property IDs.
  *
  * <p> Property IDs are used with the {@link android.car.hardware.property.CarPropertyManager} APIs
  * (e.g. {@link android.car.hardware.property.CarPropertyManager#getProperty(int, int)} or {@link
  * android.car.hardware.property.CarPropertyManager#setProperty(Class, int, int, Object)}).
  */
 public final class ALN50VehiclePropertyIds {

     /**
      * Undefined property.
      *
      * <p>This property should never be used/will never be supported.
      */
     @AddedInOrBefore(majorVersion = 33)
     public static final int INVALID = 0;


    /**
     * VCU_GEARSIGVLD_214 <p>
     * <br>
     * Function Describe: 档位信号有效位 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Initializing <br>
        0x1: Valid <br>
        0x2: Invalid <br>
        0x3: Reserved <p>
     */
        public static final int VCU_GEARSIGVLD_214 = 557846528;

    /**
     * VCU_GEARSIG_214 <p>
     * <br>
     * Function Describe: 档位信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Undefined 初始值 <br>
        0x1: P挡 <br>
        0x2: N挡 <br>
        0x3: R挡 <br>
        0x4: D挡 <br>
        0x5: Reserved <br>
        0x6: E挡 <br>
        0x7: S挡 <br>
        0x8~0xF: Reserved <p>
     */
        public static final int VCU_GEARSIG_214 = 557846529;

    /**
     * ESP_VEHSPD_318 <p>
     * <br>
     * Function Describe: 车速 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int ESP_VEHSPD_318 = 557846530;

    /**
     * PDU_TPMS_589 <p>
     * <br>
     * Function Describe: 轮胎信号组 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        轮胎 <br>
        0: TPMS_SngTirePSts 轮胎压力状态 <br>
        1: TPMS_SngTireP    轮胎压力值 <br>
        2: TPMS_SngTireT    轮胎温度值 <br>
        3: TPMS_TirePosn    轮胎位置 <br>
        4: TPMS_SngTireSigSts  轮胎信号状态 <br>
        5: TPMS_SysSts      TPMS系统状态 <br>
        6: TPMS_TireTStsFlg 轮胎温度状态标志位 <br>
        7: TPMS_SysDataSts  胎压监测系统数据状态 <br>
        8: TPMS_SngTireLeakageSts  轮胎漏气状态 <br>
        9: TPMS_SngTireSnsrBattVoltSts  胎压传感器电池电压状态 <br>
        10:TPMS_SnsrMatchSts 胎压监测传感器匹配状态 <p>
     */
        public static final int PDU_TPMS_589 = 557912067;

    /**
     * VCU_DRVGMILG_504 <p>
     * <br>
     * Function Describe: 续驶里程 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_DRVGMILG_504 = 557846534;

    /**
     * ECC_ACSTS_373 <p>
     * <br>
     * Function Describe: A/C状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 关闭状态 <br>
         0x1: 开启状态 <p>
     */
        public static final int ECC_ACSTS_373 = 557846799;

    /**
     * ECC_WINDSPDSTS_373 <p>
     * <br>
     * Function Describe: 风速状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 无风挡位 <br>
         0x1: 风速一挡 <br>
         0x2: 风速二挡 <br>
         0x3: 风速三挡 <br>
         0x4: 风速四挡 <br>
         0x5: 风速五挡 <br>
         0x6: 风速六挡 <br>
         0x7: 风速七挡 <br>
         0x8: 风速八挡 <br>
         0x9~0xF: Reserved <p>
     */
        public static final int ECC_WINDSPDSTS_373 = 557846801;

    /**
     * ECC_BACKROWAIROUTLMODSTS_373 <p>
     * <br>
     * Function Describe: 后排出风模式状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 后排吹面 <br>
         0x1: 后排吹面吹脚 <br>
         0x2: 后排吹脚 <br>
         0x3: 后排截止 <br>
         0x4~0x7: Reserved <p>
     */
        public static final int ECC_BACKROWAIROUTLMODSTS_373 = 557846802;

    /**
     * ECC_DRVRTSETSTS_373 <p>
     * <br>
     * Function Describe: 主驾温度值设定状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1~0x23: Low <br>
         0x24: 18℃ <br>
         0x25: 18.5℃ <br>
         0x26: 19℃ <br>
         0x27: 19.5℃ <br>
         0x28: 20℃ <br>
         0x29: 20.5℃ <br>
         0x2A: 21℃ <br>
         0x2B: 21.5℃ <br>
         0x2C: 22℃ <br>
         0x2D: 22.5℃ <br>
         0x2E: 23℃ <br>
         0x2F: 23.5℃ <br>
         0x30: 24℃ <br>
         0x31: 24.5℃ <br>
         0x32: 25℃ <br>
         0x33: 25.5℃ <br>
         0x34: 26℃ <br>
         0x35: 26.5℃ <br>
         0x36: 27℃ <br>
         0x37: 27.5℃ <br>
         0x38: 28℃ <br>
         0x39: 28.5℃ <br>
         0x3A: 29℃ <br>
         0x3B: 29.5℃ <br>
         0x3C: 30℃ <br>
         0x3D: 30.5℃ <br>
         0x3E: 31℃ <br>
         0x3F: 31.5℃ <br>
         0x40: 32℃ <br>
         0x41~0xFE: High <br>
         0xFF: Invalid <p>
     */
        public static final int ECC_DRVRTSETSTS_373 = 557846803;

    /**
     * ECC_PASSTSETSTS_373 <p>
     * <br>
     * Function Describe: 副驾温度值设定状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1~0x23: Low <br>
         0x24: 18℃ <br>
         0x25: 18.5℃ <br>
         0x26: 19℃ <br>
         0x27: 19.5℃ <br>
         0x28: 20℃ <br>
         0x29: 20.5℃ <br>
         0x2A: 21℃ <br>
         0x2B: 21.5℃ <br>
         0x2C: 22℃ <br>
         0x2D: 22.5℃ <br>
         0x2E: 23℃ <br>
         0x2F: 23.5℃ <br>
         0x30: 24℃ <br>
         0x31: 24.5℃ <br>
         0x32: 25℃ <br>
         0x33: 25.5℃ <br>
         0x34: 26℃ <br>
         0x35: 26.5℃ <br>
         0x36: 27℃ <br>
         0x37: 27.5℃ <br>
         0x38: 28℃ <br>
         0x39: 28.5℃ <br>
         0x3A: 29℃ <br>
         0x3B: 29.5℃ <br>
         0x3C: 30℃ <br>
         0x3D: 30.5℃ <br>
         0x3E: 31℃ <br>
         0x3F: 31.5℃ <br>
         0x40: 32℃ <br>
         0x41~0xFE: High <br>
         0xFF: Invalid <p>
     */
        public static final int ECC_PASSTSETSTS_373 = 557846804;

    /**
     * ECC_AUTOSTS_373 <p>
     * <br>
     * Function Describe: 空调AUTO状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 关闭 <br>
         0x1: 开启 <p>
     */
        public static final int ECC_AUTOSTS_373 = 557846806;

    /**
     * ECC_SYNCSTS_373 <p>
     * <br>
     * Function Describe: SYNC状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 关闭 <br>
         0x1: 开启 <p>
     */
        public static final int ECC_SYNCSTS_373 = 557846807;

    /**
     * ECC_CIRCSTS_373 <p>
     * <br>
     * Function Describe: 循环状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 内循环状态 <br>
         0x1: 外循环状态 <p>
     */
        public static final int ECC_CIRCSTS_373 = 557846809;

    /**
     * ECC_PARTICLECONCVLD_373 <p>
     * <br>
     * Function Describe: 颗粒物浓度有效位 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Initializing <br>
         0x1: Valid <br>
         0x2: Invalid <br>
         0x3: Reserved <p>
     */
        public static final int ECC_PARTICLECONCVLD_373 = 557846810;

    /**
     * ECC_OUTDT_373 <p>
     * <br>
     * Function Describe: 车外环境温度 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0xFF: Invalid <p>
     */
        public static final int ECC_OUTDT_373 = 557846811;

    /**
     * ECC_OUTDTVLD_373 <p>
     * <br>
     * Function Describe: 车外环境温度有效位 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Initializing <br>
         0x1: Valid <br>
         0x2: Invalid <br>
         0x3: Reserved <p>
     */
        public static final int ECC_OUTDTVLD_373 = 557846812;

    /**
     * ECC_MAXFRNTDEFRST_373 <p>
     * <br>
     * Function Describe: Max前除霜 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 未打开 <br>
         0x1: 打开 <p>
     */
        public static final int ECC_MAXFRNTDEFRST_373 = 557846813;

    /**
     * ECC_HEATMNGTSYSFLT_373 <p>
     * <br>
     * Function Describe: 热管理系统故障 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 正常 <br>
         0x1: 故障 <p>
     */
        public static final int ECC_HEATMNGTSYSFLT_373 = 557846814;

    /**
     * ECC_HEATMNGTFCTLIM_373 <p>
     * <br>
     * Function Describe: 乘员舱热管理功能限制 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 功能正常 <br>
         0x1: 功能限制 <p>
     */
        public static final int ECC_HEATMNGTFCTLIM_373 = 557846815;

    /**
     * ECC_DRVRAIROUTLMOD_373 <p>
     * <br>
     * Function Describe: 主驾出风模式 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: 主驾吹面模式 <br>
         0x2: 主驾吹面/吹足模式 <br>
         0x3: 主驾吹足模式 <br>
         0x4: 主驾吹足/吹窗模式 <br>
         0x5: 吹窗模式 <br>
         0x6~0x7: Reserved <p>
     */
        public static final int ECC_DRVRAIROUTLMOD_373 = 557846816;

    /**
     * ECC_PASSAIROUTLMOD_373 <p>
     * <br>
     * Function Describe: 副驾出风模式 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: 副驾吹面模式 <br>
         0x2: 副驾吹面/吹足模式 <br>
         0x3: 副驾吹足模式 <br>
         0x4: 副驾吹足/吹窗模式 <br>
         0x5: 副驾截止 <br>
         0x6~0x7: Reserved <p>
     */
        public static final int ECC_PASSAIROUTLMOD_373 = 557846817;

    /**
     * ECC_EGYSAVEMODSTS_373 <p>
     * <br>
     * Function Describe: 空调节能模式状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 正常模式 <br>
         0x1: 节能模式 <br>
         0x2~0x3: Reserved <p>
     */
        public static final int ECC_EGYSAVEMODSTS_373 = 557846818;

    /**
     * ICC_AUTOPOWER_OFFSWITCHSTATUS_37A <p>
     * <br>
     * Function Describe: 自动下电开关状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 关闭 <br>
         0x2: 打开 <br>
         0x3: Reserved <p>
     */
        public static final int ICC_AUTOPOWER_OFFSWITCHSTATUS_37A = 557846819;

    /**
     * EHU_PETSMODBTN_37A <p>
     * <br>
     * Function Describe: 宠物模式开启请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 请求开启 <br>
         0x2: 请求关闭 <br>
         0x3: 预留 <p>
     */
        public static final int EHU_PETSMODBTN_37A = 557846820;

    /**
     * EHU_LEOUTLUPDWNMOTACTVCMD_37A <p>
     * <br>
     * Function Describe: 左出风口上下电机动作指令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No Action <br>
         0x1: Level 1向上调节100% <br>
         0x2: Level 2向上调节80% <br>
         0x3: Level 3向上调节60% <br>
         0x4: Level 4向上调节40% <br>
         0x5: Level 5向上调节20% <br>
         0x6: Level 6正方向 <br>
         0x7: Level 7向下调节20% <br>
         0x8: Level 8向下调节40% <br>
         0x9: Level 9向下调节60% <br>
         0xA: Level 10向下调节80% <br>
         0xB: Level 11向下调节100% <br>
         0xC~0xE: Reserved <br>
         0xF: Invalid <p>
     */
        public static final int EHU_LEOUTLUPDWNMOTACTVCMD_37A = 557846822;

    /**
     * EHU_LEOUTLLERIMOTACTVCMD_37A <p>
     * <br>
     * Function Describe: 左出风口左右电机动作指令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No Action <br>
         0x1: Level 1向左调节100% <br>
         0x2: Level 2向左调节80% <br>
         0x3: Level 3向左调节60% <br>
         0x4: Level 4向左调节40% <br>
         0x5: Level 5向左调节20% <br>
         0x6: Level 6正方向 <br>
         0x7: Level 7向右调节20% <br>
         0x8: Level 8向右调节40% <br>
         0x9: Level 9向右调节60% <br>
         0xA: Level 10向右调节80% <br>
         0xB: Level 11向右调节100% <br>
         0xC: 风门关闭 <br>
         0xD~0xE: Reserved <br>
         0xF: Invalid <p>
     */
        public static final int EHU_LEOUTLLERIMOTACTVCMD_37A = 557846823;

    /**
     * EHU_MIDLEOUTLUPDWNMOTACTVCMD_37A <p>
     * <br>
     * Function Describe: 中左出风口上下电机动作指令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No Action <br>
         0x1: Level 1向上调节100% <br>
         0x2: Level 2向上调节80% <br>
         0x3: Level 3向上调节60% <br>
         0x4: Level 4向上调节40% <br>
         0x5: Level 5向上调节20% <br>
         0x6: Level 6正方向 <br>
         0x7: Level 7向下调节20% <br>
         0x8: Level 8向下调节40% <br>
         0x9: Level 9向下调节60% <br>
         0xA: Level 10向下调节80% <br>
         0xB: Level 11向下调节100% <br>
         0xC~0xE: Reserved <br>
         0xF: Invalid <p>
     */
        public static final int EHU_MIDLEOUTLUPDWNMOTACTVCMD_37A = 557846825;

    /**
     * EHU_MIDLEOUTLLERIMOTACTVCMD_37A <p>
     * <br>
     * Function Describe: 中左出风口左右电机动作指令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No Action <br>
         0x1: Level 1向左调节100% <br>
         0x2: Level 2向左调节80% <br>
         0x3: Level 3向左调节60% <br>
         0x4: Level 4向左调节40% <br>
         0x5: Level 5向左调节20% <br>
         0x6: Level 6正方向 <br>
         0x7: Level 7向右调节20% <br>
         0x8: Level 8向右调节40% <br>
         0x9: Level 9向右调节60% <br>
         0xA: Level 10向右调节80% <br>
         0xB: Level 11向右调节100% <br>
         0xC: 风门关闭 <br>
         0xD~0xE: Reserved <br>
         0xF: Invalid <p>
     */
        public static final int EHU_MIDLEOUTLLERIMOTACTVCMD_37A = 557846826;

    /**
     * EHU_MIDRIOUTLUPDWNMOTACTVCMD_37A <p>
     * <br>
     * Function Describe: 中右出风口上下电机动作指令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No Action <br>
         0x1: Level 1向上调节100% <br>
         0x2: Level 2向上调节80% <br>
         0x3: Level 3向上调节60% <br>
         0x4: Level 4向上调节40% <br>
         0x5: Level 5向上调节20% <br>
         0x6: Level 6正方向 <br>
         0x7: Level 7向下调节20% <br>
         0x8: Level 8向下调节40% <br>
         0x9: Level 9向下调节60% <br>
         0xA: Level 10向下调节80% <br>
         0xB: Level 11向下调节100% <br>
         0xC~0xE: Reserved <br>
         0xF: Invalid <p>
     */
        public static final int EHU_MIDRIOUTLUPDWNMOTACTVCMD_37A = 557846828;

    /**
     * EHU_MIDRIOUTLLERIMOTACTVCMD_37A <p>
     * <br>
     * Function Describe: 中右出风口左右电机动作指令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No Action <br>
         0x1: Level 1向左调节100% <br>
         0x2: Level 2向左调节80% <br>
         0x3: Level 3向左调节60% <br>
         0x4: Level 4向左调节40% <br>
         0x5: Level 5向左调节20% <br>
         0x6: Level 6正方向 <br>
         0x7: Level 7向右调节20% <br>
         0x8: Level 8向右调节40% <br>
         0x9: Level 9向右调节60% <br>
         0xA: Level 10向右调节80% <br>
         0xB: Level 11向右调节100% <br>
         0xC: 风门关闭 <br>
         0xD~0xE: Reserved <br>
         0xF: Invalid <p>
     */
        public static final int EHU_MIDRIOUTLLERIMOTACTVCMD_37A = 557846829;

    /**
     * EHU_RIOUTLUPDWNMOTACTVCMD_37A <p>
     * <br>
     * Function Describe: 右出风口上下电机动作指令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No Action <br>
         0x1: Level 1向上调节100% <br>
         0x2: Level 2向上调节80% <br>
         0x3: Level 3向上调节60% <br>
         0x4: Level 4向上调节40% <br>
         0x5: Level 5向上调节20% <br>
         0x6: Level 6正方向 <br>
         0x7: Level 7向下调节20% <br>
         0x8: Level 8向下调节40% <br>
         0x9: Level 9向下调节60% <br>
         0xA: Level 10向下调节80% <br>
         0xB: Level 11向下调节100% <br>
         0xC~0xE: Reserved <br>
         0xF: Invalid <p>
     */
        public static final int EHU_RIOUTLUPDWNMOTACTVCMD_37A = 557846831;

    /**
     * EHU_RIOUTLLERIMOTACTVCMD_37A <p>
     * <br>
     * Function Describe: 右出风口左右电机动作指令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No Action <br>
         0x1: Level 1向左调节100% <br>
         0x2: Level 2向左调节80% <br>
         0x3: Level 3向左调节60% <br>
         0x4: Level 4向左调节40% <br>
         0x5: Level 5向左调节20% <br>
         0x6: Level 6正方向 <br>
         0x7: Level 7向右调节20% <br>
         0x8: Level 8向右调节40% <br>
         0x9: Level 9向右调节60% <br>
         0xA: Level 10向右调节80% <br>
         0xB: Level 11向右调节100% <br>
         0xC: 风门关闭 <br>
         0xD~0xE: Reserved <br>
         0xF: Invalid <p>
     */
        public static final int EHU_RIOUTLLERIMOTACTVCMD_37A = 557846832;

    /**
     * ECC_LEOUTLUPDWNMOTACTVSTS_378 <p>
     * <br>
     * Function Describe: 左出风口上下电机动作状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Action <br>
         0x1: Level 1向上调节100% <br>
         0x2: Level 2向上调节80% <br>
         0x3: Level 3向上调节60% <br>
         0x4: Level 4向上调节40% <br>
         0x5: Level 5向上调节20% <br>
         0x6: Level 6正方向 <br>
         0x7: Level 7向下调节20% <br>
         0x8: Level 8向下调节40% <br>
         0x9: Level 9向下调节60% <br>
         0xA: Level 10向下调节80% <br>
         0xB: Level 11向下调节100% <br>
         0xC~0xE: Reserved <br>
         0xF: Invalid <p>
     */
        public static final int ECC_LEOUTLUPDWNMOTACTVSTS_378 = 557846834;

    /**
     * ECC_LEOUTLLERIMOTACTVSTS_378 <p>
     * <br>
     * Function Describe: 左出风口左右电机动作状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Action <br>
         0x1: Level 1向左调节100% <br>
         0x2: Level 2向左调节80% <br>
         0x3: Level 3向左调节60% <br>
         0x4: Level 4向左调节40% <br>
         0x5: Level 5向左调节20% <br>
         0x6: Level 6正方向 <br>
         0x7: Level 7向右调节20% <br>
         0x8: Level 8向右调节40% <br>
         0x9: Level 9向右调节60% <br>
         0xA: Level 10向右调节80% <br>
         0xB: Level 11向右调节100% <br>
         0xC: 风门关闭 <br>
         0xD~0xE: Reserved <br>
         0xF: Invalid <p>
     */
        public static final int ECC_LEOUTLLERIMOTACTVSTS_378 = 557846835;

    /**
     * ECC_MIDLEOUTLUPDWNMOTACTVSTS_378 <p>
     * <br>
     * Function Describe: 中左出风口上下电机动作状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Action <br>
         0x1: Level 1向上调节100% <br>
         0x2: Level 2向上调节80% <br>
         0x3: Level 3向上调节60% <br>
         0x4: Level 4向上调节40% <br>
         0x5: Level 5向上调节20% <br>
         0x6: Level 6正方向 <br>
         0x7: Level 7向下调节20% <br>
         0x8: Level 8向下调节40% <br>
         0x9: Level 9向下调节60% <br>
         0xA: Level 10向下调节80% <br>
         0xB: Level 11向下调节100% <br>
         0xC~0xE: Reserved <br>
         0xF: Invalid <p>
     */
        public static final int ECC_MIDLEOUTLUPDWNMOTACTVSTS_378 = 557846837;

    /**
     * ECC_MIDLEOUTLLERIMOTACTVSTS_378 <p>
     * <br>
     * Function Describe: 中左出风口左右电机动作状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Action <br>
         0x1: Level 1向左调节100% <br>
         0x2: Level 2向左调节80% <br>
         0x3: Level 3向左调节60% <br>
         0x4: Level 4向左调节40% <br>
         0x5: Level 5向左调节20% <br>
         0x6: Level 6正方向 <br>
         0x7: Level 7向右调节20% <br>
         0x8: Level 8向右调节40% <br>
         0x9: Level 9向右调节60% <br>
         0xA: Level 10向右调节80% <br>
         0xB: Level 11向右调节100% <br>
         0xC: 风门关闭 <br>
         0xD~0xE: Reserved <br>
         0xF: Invalid <p>
     */
        public static final int ECC_MIDLEOUTLLERIMOTACTVSTS_378 = 557846838;

    /**
     * ECC_MIDRIOUTLUPDWNMOTACTVSTS_378 <p>
     * <br>
     * Function Describe: 中右出风口上下电机动作状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Action <br>
         0x1: Level 1向上调节100% <br>
         0x2: Level 2向上调节80% <br>
         0x3: Level 3向上调节60% <br>
         0x4: Level 4向上调节40% <br>
         0x5: Level 5向上调节20% <br>
         0x6: Level 6正方向 <br>
         0x7: Level 7向下调节20% <br>
         0x8: Level 8向下调节40% <br>
         0x9: Level 9向下调节60% <br>
         0xA: Level 10向下调节80% <br>
         0xB: Level 11向下调节100% <br>
         0xC~0xE: Reserved <br>
         0xF: Invalid <p>
     */
        public static final int ECC_MIDRIOUTLUPDWNMOTACTVSTS_378 = 557846840;

    /**
     * ECC_MIDRIOUTLLERIMOTACTVSTS_378 <p>
     * <br>
     * Function Describe: 中右出风口左右电机动作状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Action <br>
         0x1: Level 1向左调节100% <br>
         0x2: Level 2向左调节80% <br>
         0x3: Level 3向左调节60% <br>
         0x4: Level 4向左调节40% <br>
         0x5: Level 5向左调节20% <br>
         0x6: Level 6正方向 <br>
         0x7: Level 7向右调节20% <br>
         0x8: Level 8向右调节40% <br>
         0x9: Level 9向右调节60% <br>
         0xA: Level 10向右调节80% <br>
         0xB: Level 11向右调节100% <br>
         0xC: 风门关闭 <br>
         0xD~0xE: Reserved <br>
         0xF: Invalid <p>
     */
        public static final int ECC_MIDRIOUTLLERIMOTACTVSTS_378 = 557846841;

    /**
     * ECC_RIOUTLUPDWNMOTACTVSTS_378 <p>
     * <br>
     * Function Describe: 右出风口上下电机动作状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Action <br>
         0x1: Level 1向上调节100% <br>
         0x2: Level 2向上调节80% <br>
         0x3: Level 3向上调节60% <br>
         0x4: Level 4向上调节40% <br>
         0x5: Level 5向上调节20% <br>
         0x6: Level 6正方向 <br>
         0x7: Level 7向下调节20% <br>
         0x8: Level 8向下调节40% <br>
         0x9: Level 9向下调节60% <br>
         0xA: Level 10向下调节80% <br>
         0xB: Level 11向下调节100% <br>
         0xC~0xE: Reserved <br>
         0xF: Invalid <p>
     */
        public static final int ECC_RIOUTLUPDWNMOTACTVSTS_378 = 557846843;

    /**
     * ECC_RIOUTLLERIMOTACTVSTS_378 <p>
     * <br>
     * Function Describe: 右出风口左右电机动作状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Action <br>
         0x1: Level 1向左调节100% <br>
         0x2: Level 2向左调节80% <br>
         0x3: Level 3向左调节60% <br>
         0x4: Level 4向左调节40% <br>
         0x5: Level 5向左调节20% <br>
         0x6: Level 6正方向 <br>
         0x7: Level 7向右调节20% <br>
         0x8: Level 8向右调节40% <br>
         0x9: Level 9向右调节60% <br>
         0xA: Level 10向右调节80% <br>
         0xB: Level 11向右调节100% <br>
         0xC: 风门关闭 <br>
         0xD~0xE: Reserved <br>
         0xF: Invalid <p>
     */
        public static final int ECC_RIOUTLLERIMOTACTVSTS_378 = 557846844;

    /**
     * MCU_F_CRTROTDIR_150 <p>
     * <br>
     * Function Describe: 前驱动电机当前旋转方向MotorFRotingdirection <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 待机状态 <br>
         0x1: 正转(前进模式) <br>
         0x2: 反转(倒车模式) <br>
         0x3: Reserved <p>
     */
        public static final int MCU_F_CRTROTDIR_150 = 557846851;

    /**
     * MCU_F_ALRMLAMP_FS_150 <p>
     * <br>
     * Function Describe: 报警灯_前驱动电机(功能安全) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Disable <br>
         0x1: Enable <p>
     */
        public static final int MCU_F_ALRMLAMP_FS_150 = 557846855;

    /**
     * PEPS_PWRMOD_333 <p>
     * <br>
     * Function Describe: 电源模式 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: ACC (Reserved) <br>
         0x2: IGN On <br>
         0x3: Crank Pending(动力防盗认证过程中) <br>
         0x4: Run <br>
         0x5: Crank Off (Reserved) <br>
         0x6~0x7: Reserved <p>
     */
        public static final int PEPS_PWRMOD_333 = 557846858;

    /**
     * PEPS_PWRMODVLD_333 <p>
     * <br>
     * Function Describe: 电源模式有效值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Initializing <br>
         0x1: Valid <br>
         0x2: Invalid <br>
         0x3: Reserved <p>
     */
        public static final int PEPS_PWRMODVLD_333 = 557846859;

    /**
     * PEPS_POLLINGSTS_333 <p>
     * <br>
     * Function Describe: polling状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Active <p>
     */
        public static final int PEPS_POLLINGSTS_333 = 557846860;

    /**
     * PEPS_KEYINCARRMN_37B <p>
     * <br>
     * Function Describe: 钥匙落在车内提醒 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Information <br>
         0x1: Key In Reminder <p>
     */
        public static final int PEPS_KEYINCARRMN_37B = 557846866;

    /**
     * PEPS_SHIFTTOPNSTRTREQ_37B <p>
     * <br>
     * Function Describe: 请挂P/N档启动 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Information <br>
         0x1: Shift To P/N To Start <p>
     */
        public static final int PEPS_SHIFTTOPNSTRTREQ_37B = 557846868;

    /**
     * PEPS_STEPBRKTOSTRTREQ_37B <p>
     * <br>
     * Function Describe: 请踩刹车启动 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Information <br>
         0x1: Press Bake To Start <p>
     */
        public static final int PEPS_STEPBRKTOSTRTREQ_37B = 557846869;

    /**
     * PEPS_NOFOUNDLEGALKEY_37B <p>
     * <br>
     * Function Describe: 未发现合法钥匙 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Information <br>
         0x1: No UID Found <p>
     */
        public static final int PEPS_NOFOUNDLEGALKEY_37B = 557846870;

    /**
     * PEPS_EMGYSTRTPROMT_37B <p>
     * <br>
     * Function Describe: 应急启动提示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Information <br>
         0x1: Please Keep UID Close to (xxx) <p>
     */
        public static final int PEPS_EMGYSTRTPROMT_37B = 557846873;

    /**
     * PEPS_VCUAUTHENTFAILPROMT_37B <p>
     * <br>
     * Function Describe: VCU认证失败提示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Information <br>
         0x1: VCU Authentication Failure <p>
     */
        public static final int PEPS_VCUAUTHENTFAILPROMT_37B = 557846875;

    /**
     * PEPS_KEYLOPWRPROMT_37B <p>
     * <br>
     * Function Describe: 钥匙电量低提示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Information <br>
         0x1: UID Low Battery <p>
     */
        public static final int PEPS_KEYLOPWRPROMT_37B = 557846876;

    /**
     * PEPS_KEYOUTDCARPROMT_37B <p>
     * <br>
     * Function Describe: 钥匙不在车内提示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Information <br>
         0x1: Key Out Reminder <p>
     */
        public static final int PEPS_KEYOUTDCARPROMT_37B = 557846877;

    /**
     * PEPS_TIOUTPWROFFRMN_380 <p>
     * <br>
     * Function Describe: 超时下电前提醒 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No request <br>
         0x1: Request reminder <p>
     */
        public static final int PEPS_TIOUTPWROFFRMN_380 = 557846885;

    /**
     * PWC_CHRGSTS_524 <p>
     * <br>
     * Function Describe: 充电状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Charge <br>
         0x1: Charging <br>
         0x2: Charge Full <br>
         0x3: FOD <br>
         0x4: RX Error <br>
         0x5: TX Error <br>
         0x6: NFC Protection <br>
         0x7: NFC Phone Detection <p>
     */
        public static final int PWC_CHRGSTS_524 = 557846886;

    /**
     * PWC_PHNFORGETREMDSTS_524 <p>
     * <br>
     * Function Describe: 手机遗忘提醒状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Forget <br>
         0x1: Forget <p>
     */
        public static final int PWC_PHNFORGETREMDSTS_524 = 557846887;

    /**
     * PWC_MODLESWTSTS_524 <p>
     * <br>
     * Function Describe: 模块开关状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Default <br>
         0x1: Module Off <p>
     */
        public static final int PWC_MODLESWTSTS_524 = 557846888;

    /**
     * EHU_DRVRSEATTRACKMANREQ_533 <p>
     * <br>
     * Function Describe: 驾驶员座椅前后调节请求Driver seat track manual movement directionValues:Off/Fwd/Rwd. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: Fwd <br>
         0x2: Rwd <br>
         0x3: Reserved <p>
     */
        public static final int EHU_DRVRSEATTRACKMANREQ_533 = 557846910;

    /**
     * EHU_DRVRHEIMANREQ_533 <p>
     * <br>
     * Function Describe: 驾驶员座椅高度调节请求Driver seat height manual movement directionValues:Off/Up/Down. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: Up <br>
         0x2: Down <br>
         0x3: Reserved <p>
     */
        public static final int EHU_DRVRHEIMANREQ_533 = 557846912;

    /**
     * EHU_DRVRSEATBACKMANREQ_533 <p>
     * <br>
     * Function Describe: 驾驶员座椅靠背调节Driver seat recliner manual movement directionValues:Off/Up/Down. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: Fwd <br>
         0x2: Rwd <br>
         0x3: Reserved <p>
     */
        public static final int EHU_DRVRSEATBACKMANREQ_533 = 557846913;

    /**
     * EHU_PASSSEATTRACKMANREQ_533 <p>
     * <br>
     * Function Describe: 副驾驶座椅前后调节请求Panssenger seat track manual movement directionValues:Off/Fwd/Rwd. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: Fwd <br>
         0x2: Rwd <br>
         0x3: Reserved <p>
     */
        public static final int EHU_PASSSEATTRACKMANREQ_533 = 557846914;

    /**
     * EHU_PASSSEATBACKMANREQ_533 <p>
     * <br>
     * Function Describe: 副驾驶座椅靠背调节Panssenger seat recliner manual movement directionValues:Off/Up/Down. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: Fwd <br>
         0x2: Rwd <br>
         0x3: Reserved <p>
     */
        public static final int EHU_PASSSEATBACKMANREQ_533 = 557846915;

    /**
     * EHU_LUMBARUPD_533 <p>
     * <br>
     * Function Describe: 腰托向上调节 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Release <br>
         0x1: Press <p>
     */
        public static final int EHU_LUMBARUPD_533 = 557846916;

    /**
     * EHU_LUMBARDWN_533 <p>
     * <br>
     * Function Describe: 腰托向下调节 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Release <br>
         0x1: Press <p>
     */
        public static final int EHU_LUMBARDWN_533 = 557846917;

    /**
     * EHU_LUMBARFWD_533 <p>
     * <br>
     * Function Describe: 腰托向前调节 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Release <br>
         0x1: Press <p>
     */
        public static final int EHU_LUMBARFWD_533 = 557846918;

    /**
     * EHU_LUMBARBACKW_533 <p>
     * <br>
     * Function Describe: 腰托向后调节 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Release <br>
         0x1: Press <p>
     */
        public static final int EHU_LUMBARBACKW_533 = 557846919;

    /**
     * EHU_AUTOPASSSEATHEATENA_533 <p>
     * <br>
     * Function Describe: 副驾座椅自动加热功能使能 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Void <br>
         0x1: 开启自动加热高温档 <br>
         0x2: 开启自动加热中温档 <br>
         0x3: 开启自动加热低温档 <br>
         0x4: 关闭自动加热 <br>
         0x5~0x7: Reserved <p>
     */
        public static final int EHU_AUTOPASSSEATHEATENA_533 = 557846921;

    /**
     * EHU_PASSSEATTILTMANREQ_533 <p>
     * <br>
     * Function Describe: 副驾座椅坐垫倾角调节请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: Up <br>
         0x2: Down <br>
         0x3: Reserved <p>
     */
        public static final int EHU_PASSSEATTILTMANREQ_533 = 557846924;

    /**
     * EHU_PASSLUMBARUPD_533 <p>
     * <br>
     * Function Describe: 副驾腰托向上调节 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Release <br>
         0x1: Press <p>
     */
        public static final int EHU_PASSLUMBARUPD_533 = 557846926;

    /**
     * EHU_PASSLUMBARDWN_533 <p>
     * <br>
     * Function Describe: 副驾腰托向下调节 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Release <br>
         0x1: Press <p>
     */
        public static final int EHU_PASSLUMBARDWN_533 = 557846927;

    /**
     * EHU_PASSLUMBARFWD_533 <p>
     * <br>
     * Function Describe: 副驾腰托向前调节 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Release <br>
         0x1: Press <p>
     */
        public static final int EHU_PASSLUMBARFWD_533 = 557846928;

    /**
     * EHU_PASSLUMBARBACKW_533 <p>
     * <br>
     * Function Describe: 副驾腰托向后调节 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Release <br>
         0x1: Press <p>
     */
        public static final int EHU_PASSLUMBARBACKW_533 = 557846929;

    /**
     * EHU_LRLOCKWINCMD_533 <p>
     * <br>
     * Function Describe: 左后门锁窗命令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive； <br>
         0x1: Lock rearleft window； <br>
         0x2: Unlock rearleft window； <br>
         0x3: Reserved <p>
     */
        public static final int EHU_LRLOCKWINCMD_533 = 557846930;

    /**
     * EHU_RRLOCKWINCMD_533 <p>
     * <br>
     * Function Describe: 右后门锁窗命令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive； <br>
         0x1: Lock rearright window； <br>
         0x2: Unlock rearright window； <br>
         0x3: Reserved <p>
     */
        public static final int EHU_RRLOCKWINCMD_533 = 557846931;

    /**
     * EHU_SETMAXPOSNCMD_PLG_52 <p>
     * <br>
     * Function Describe: 中控的设置后尾门最大开启高度命令Reset maximum height by touchscreen. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1~0x31: Reserved <br>
         0x32~0x5F: Max Height Setting <br>
         0x60~0xFF: Reserved <p>
     */
        public static final int EHU_SETMAXPOSNCMD_PLG_52 = 557846933;

    /**
     * EHU_TRACTNCMD_52 <p>
     * <br>
     * Function Describe: 中控的开启和关闭后尾门命令Open or close trunk by touchscreen or voice (语音和大屏菜单触发). <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Open Request(Touch Screen Or Voice) <br>
         0x2: Close Request(Touch Screen Or Voice) <br>
         0x3: Halt <p>
     */
        public static final int EHU_TRACTNCMD_52 = 557846934;

    /**
     * ICC_DRLSWT_52 <p>
     * <br>
     * Function Describe: 日间行车灯控制开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Invalid <br>
         0x1: on <br>
         0x2: off <br>
         0x3: reserved <p>
     */
        public static final int ICC_DRLSWT_52 = 557846935;

    /**
     * ICC_LOCKAUTOCLSSUNSSWT_52 <p>
     * <br>
     * Function Describe: 锁车自动关闭遮阳帘开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICC_LOCKAUTOCLSSUNSSWT_52 = 557846936;

    /**
     * EHU_VEHACCOUNTLOGINUIDSTS_90 <p>
     * <br>
     * Function Describe: 车端账户登录UID状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: 切换为ICC当前登录的UID <br>
         0x2: 切换至访客账户 <br>
         0x3: Reserved <p>
     */
        public static final int EHU_VEHACCOUNTLOGINUIDSTS_90 = 557846938;

    /**
     * EHU_VEHACCOUNTLOGINUID_90 <p>
     * <br>
     * Function Describe: 车端账户登录UID <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int EHU_VEHACCOUNTLOGINUID_90 = 557846939;

    /**
     * EHU_SEATLOCNMEMOPERCMD_90 <p>
     * <br>
     * Function Describe: 座椅位置记忆操作命令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Invalid <br>
         0x1: 记忆位置写入 <br>
         0x2: 记忆位置删除 <br>
         0x3: 记忆位置调出 <br>
         0x4: Download <br>
         0x5~0x7: Reserved <p>
     */
        public static final int EHU_SEATLOCNMEMOPERCMD_90 = 557846940;

    /**
     * EHU_DRVRSEATUIDSUBPOSN_90 <p>
     * <br>
     * Function Describe: 驾驶员座椅子位置编号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 无效 <br>
         0x1: 位置1 <br>
         0x2: 位置2 <br>
         0x3: 位置3 <br>
         0x4~0x5: 保留 <br>
         0x6: 小憩位置 <br>
         0x7: 冥想位置 <p>
     */
        public static final int EHU_DRVRSEATUIDSUBPOSN_90 = 557846941;

    /**
     * EHU_PASSSEATLOCNMEMOPERCMD_90 <p>
     * <br>
     * Function Describe: 副驾驶座椅位置记忆操作命令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Invalid <br>
         0x1: 记忆位置写入 <br>
         0x2: 记忆位置删除 <br>
         0x3: 记忆位置调出 <br>
         0x4: Download <br>
         0x5~0x7: Reserved <p>
     */
        public static final int EHU_PASSSEATLOCNMEMOPERCMD_90 = 557846942;

    /**
     * EHU_PASSSEATUIDSUBPOSN_90 <p>
     * <br>
     * Function Describe: 副驾驶座椅子位置编号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 无效 <br>
         0x1: 位置1 <br>
         0x2: 位置2 <br>
         0x3: 位置3 <br>
         0x4~0x5: 保留 <br>
         0x6: 小憩位置 <br>
         0x7: 冥想位置 <p>
     */
        public static final int EHU_PASSSEATUIDSUBPOSN_90 = 557846943;

    /**
     * EHU_FADERSET_44 <p>
     * <br>
     * Function Describe: 前后平衡调节Front/rear audio fader set. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0~0x9: Rear+10~Rear+1 <br>
         0xA: Center <br>
         0xB~0x14: Front+1~Front+10 <br>
         0x15~0x1F: Reserved <p>
     */
        public static final int EHU_FADERSET_44 = 557846954;

    /**
     * EHU_LERIBALSET_44 <p>
     * <br>
     * Function Describe: 左右平衡调节Left/Right Audio Balance set. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0~0x9: Lch+10~Lch+1 <br>
         0xA: Center <br>
         0xB~0x14: Rch+1~Rch+10 <br>
         0x15~0x1F: Reserved <p>
     */
        public static final int EHU_LERIBALSET_44 = 557846956;

    /**
     * EHU_MIDFRQAUDIOSET_44 <p>
     * <br>
     * Function Describe: 中音域调节Mid frequency audio set. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0~0x14: -10~+10 <br>
         0x15~0x1F: Reserved <p>
     */
        public static final int EHU_MIDFRQAUDIOSET_44 = 557846958;

    /**
     * EHU_LOFRQAUDIOSET_44 <p>
     * <br>
     * Function Describe: 低音域调节Low frequency audio set. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0~0x14: -10~+10 <br>
         0x15~0x1F: Reserved <p>
     */
        public static final int EHU_LOFRQAUDIOSET_44 = 557846960;

    /**
     * EHU_HIFRQAUDIOSET_44 <p>
     * <br>
     * Function Describe: 高音域调节High frequency audio set. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0~0x14: -10~+10 <br>
         0x15~0x1F: Reserved <p>
     */
        public static final int EHU_HIFRQAUDIOSET_44 = 557846962;

    /**
     * EHU_SOUNDSWITCH_44 <p>
     * <br>
     * Function Describe: 音效开关（主机均衡器与功放音效开关） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: off（表示选择车机自定义均衡器音效） <br>
         0x1: On （表示关闭车机均衡器，打开极狐音效） <p>
     */
        public static final int EHU_SOUNDSWITCH_44 = 557846968;

    /**
     * EHU_ARCFOXSOUNDMODESELECT_44 <p>
     * <br>
     * Function Describe: 极狐音效模式选择 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 极狐音效1 <br>
         0x1: 极狐音效2 <br>
         0x2: 极狐音效3 <br>
         0x3: 极狐音效4 <p>
     */
        public static final int EHU_ARCFOXSOUNDMODESELECT_44 = 557846969;

    /**
     * EHU_FOLWMEHOMETISET_46 <p>
     * <br>
     * Function Describe: 中控伴我回家时间设置(延时关闭) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Not Use <br>
         0x1: 0 <br>
         0x2: 15 <br>
         0x3: 30 <br>
         0x4: 45 <br>
         0x5: 60 <br>
         0x6~0x7: Reserved <p>
     */
        public static final int EHU_FOLWMEHOMETISET_46 = 557846970;

    /**
     * EHU_INTRLAMPTISET_46 <p>
     * <br>
     * Function Describe: 中控内灯门控延时时间设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Not Use <br>
         0x1: 0 <br>
         0x2: 15 <br>
         0x3: 30 <br>
         0x4: 45 <br>
         0x5: 60 <br>
         0x6~0x7: Reserved <p>
     */
        public static final int EHU_INTRLAMPTISET_46 = 557846971;

    /**
     * EHU_MAIVOLSET_46 <p>
     * <br>
     * Function Describe: 主媒体音量设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0~0x27: Main Volume Step 0~39 <br>
         0x28~0x3E: Reserved <br>
         0x3F: Invalid Value <p>
     */
        public static final int EHU_MAIVOLSET_46 = 557846974;

    /**
     * EHU_MUTECTRL_46 <p>
     * <br>
     * Function Describe: 静音控制Mute all speakers. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Unmute <br>
         0x1: Mute <p>
     */
        public static final int EHU_MUTECTRL_46 = 557846975;

    /**
     * EHU_IESSMODREQ_46 <p>
     * <br>
     * Function Describe: IESS模式选择请求IESS Model write request to IESS. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: iESS Off <br>
         0x1: iESS Mode 1 <br>
         0x2: iESS Mode 2 <br>
         0x3: iESS Mode 3 <p>
     */
        public static final int EHU_IESSMODREQ_46 = 557846977;

    /**
     * EHU_VSCMODREQ_46 <p>
     * <br>
     * Function Describe: 音量随速档位选择Vehicle Speed Compensation mode(on/off) request. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: Low <br>
         0x2: Mid <br>
         0x3: High <p>
     */
        public static final int EHU_VSCMODREQ_46 = 557846978;

    /**
     * EHU_HFTVOLSET_46 <p>
     * <br>
     * Function Describe: 免提电话音量设置HFM(hand free mode), RT(ring tone) and Tbox-I/B call volume set. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0~0x27: HFM Colume Step 0~39 <br>
         0x28~0x3E: Reserved <br>
         0x3F: Invalid <p>
     */
        public static final int EHU_HFTVOLSET_46 = 557846979;

    /**
     * EHU_NAVVOLSET_46 <p>
     * <br>
     * Function Describe: 导航音量设置Navi volume adjustment. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0~0x27: Navi Volume Step 0~39 <br>
         0x28~0x3E: Reserved <br>
         0x3F: Invalid <p>
     */
        public static final int EHU_NAVVOLSET_46 = 557846982;

    /**
     * EHU_RTVOLSET_46 <p>
     * <br>
     * Function Describe: 铃声音量设置 RT(ring tone) volume set. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0~0x27: RT Step 0~39 <br>
         0x28~0x3E: Reserved <br>
         0x3F: Invalid <p>
     */
        public static final int EHU_RTVOLSET_46 = 557846984;

    /**
     * EHU_VOLINCREASEWITHSPEED_46 <p>
     * <br>
     * Function Describe: 随速音量增强 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: on <br>
         0x1: off <p>
     */
        public static final int EHU_VOLINCREASEWITHSPEED_46 = 557846990;

    /**
     * EHU_RIFRNTWINCTRL_4E <p>
     * <br>
     * Function Describe: 副驾驶员侧车窗控制 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Manual Up(reserved) <br>
         0x2: Manual Down(reserved) <br>
         0x3~0x4: Reserved <br>
         0x5: Auto Up <br>
         0x6: Auto Down <br>
         0x7: Reserved <p>
     */
        public static final int EHU_RIFRNTWINCTRL_4E = 557846992;

    /**
     * EHU_LEREWINCTRL_4E <p>
     * <br>
     * Function Describe: 左后侧车窗控制 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Manual Up(reserved) <br>
         0x2: Manual Down(reserved) <br>
         0x3~0x4: Reserved <br>
         0x5: Auto Up <br>
         0x6: Auto Down <br>
         0x7: Reserved <p>
     */
        public static final int EHU_LEREWINCTRL_4E = 557846993;

    /**
     * EHU_RIREWINCTRL_4E <p>
     * <br>
     * Function Describe: 右后侧车窗控制 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Manual Up(reserved) <br>
         0x2: Manual Down(reserved) <br>
         0x3~0x4: Reserved <br>
         0x5: Auto Up <br>
         0x6: Auto Down <br>
         0x7: Reserved <p>
     */
        public static final int EHU_RIREWINCTRL_4E = 557846994;

    /**
     * EHU_LEFRNTWINCTRL_4E <p>
     * <br>
     * Function Describe: 驾驶员侧车窗控制 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Manual Up(reserved) <br>
         0x2: Manual Down(reserved) <br>
         0x3~0x4: Reserved <br>
         0x5: Auto Up <br>
         0x6: Auto Down <br>
         0x7: Reserved <p>
     */
        public static final int EHU_LEFRNTWINCTRL_4E = 557846995;

    /**
     * EHU_POSNLAMPCTRL_4E <p>
     * <br>
     * Function Describe: 位置灯控制 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Left Park On <br>
         0x2: Right Park On <br>
         0x3: All On <br>
         0x4: Off <br>
         0x5~0x7: Reserved <p>
     */
        public static final int EHU_POSNLAMPCTRL_4E = 557846999;

    /**
     * EHU_LOBEAMCTRL_4E <p>
     * <br>
     * Function Describe: 近光灯控制 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: On <br>
         0x2: Off <br>
         0x3: Reserved <p>
     */
        public static final int EHU_LOBEAMCTRL_4E = 557847001;

    /**
     * EHU_TRUNKLOCKCTRL_4E <p>
     * <br>
     * Function Describe: 后背门锁控制 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Open <br>
         0x2: Close <br>
         0x3: Reserved <p>
     */
        public static final int EHU_TRUNKLOCKCTRL_4E = 557847003;

    /**
     * EHU_REDEFRSTOPENREQ_4E <p>
     * <br>
     * Function Describe: 后除霜开启请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Enable <br>
         0x2: Disable <br>
         0x3: Reserved <p>
     */
        public static final int EHU_REDEFRSTOPENREQ_4E = 557847007;

    /**
     * EHU_SUNSHADECTRLREQ_4E <p>
     * <br>
     * Function Describe: 遮阳帘控制请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No Request 无请求 <br>
         0x1: Sunshade Open Request 遮阳帘开启请求 <br>
         0x2: Sunshade Close Request 遮阳帘关闭请求 <br>
         0x3: Reserved <p>
     */
        public static final int EHU_SUNSHADECTRLREQ_4E = 557847008;

    /**
     * EHU_CENTRLOCKCTRL_4E <p>
     * <br>
     * Function Describe: 中控屏中控锁控制 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Unlock <br>
         0x2: Lock <br>
         0x3: Reserved <p>
     */
        public static final int EHU_CENTRLOCKCTRL_4E = 557847009;

    /**
     * EHU_MIRRCMD_4E <p>
     * <br>
     * Function Describe: 中控外后视镜控制 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Fold <br>
         0x2: Unfold <br>
         0x3: Reserved <p>
     */
        public static final int EHU_MIRRCMD_4E = 557847010;

    /**
     * EHU_REMIRRAUTOFOLDSET_4E <p>
     * <br>
     * Function Describe: 中控后视镜闭锁自动折叠设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: On <br>
         0x2: Off <br>
         0x3: Reserved <p>
     */
        public static final int EHU_REMIRRAUTOFOLDSET_4E = 557847011;

    /**
     * EHU_RAINCLSDSUNROOFSET_4E <p>
     * <br>
     * Function Describe: 中控屏雨天关天窗设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Default <br>
         0x1: Active <br>
         0x2: Inactive <br>
         0x3: Reserved <p>
     */
        public static final int EHU_RAINCLSDSUNROOFSET_4E = 557847013;

    /**
     * EHU_ARMEDCLSDWINSET_4E <p>
     * <br>
     * Function Describe: 中控屏设防关窗设置(锁车自动关窗) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Default <br>
         0x1: Active <br>
         0x2: Inactive <br>
         0x3: Reserved <p>
     */
        public static final int EHU_ARMEDCLSDWINSET_4E = 557847014;

    /**
     * EHU_OFFUNLCKSET_4E <p>
     * <br>
     * Function Describe: 中控熄火自动解锁设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Default <br>
         0x1: 四门解锁模式 <br>
         0x2: 功能关闭（Inactive） <br>
         0x3: 单门解锁模式 <p>
     */
        public static final int EHU_OFFUNLCKSET_4E = 557847015;

    /**
     * EHU_DOORUNLOCKSET_4E <p>
     * <br>
     * Function Describe: 车门解锁设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: 驾驶员侧车门 <br>
         0x2: 所有车门 <br>
         0x3: Reserved <p>
     */
        public static final int EHU_DOORUNLOCKSET_4E = 557847016;

    /**
     * EHU_SETATMLAMPBRI_336 <p>
     * <br>
     * Function Describe: 设置氛围灯亮度 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Level 1 <br>
         0x1: Level 2 <br>
         0x2: Level 3 <br>
         0x3: Level 4 <br>
         0x4: Level 5 <br>
         0x5: Level 6 <br>
         0x6: Level 7 <br>
         0x7: Level 8 <br>
         0x8: Level 9 <br>
         0x9: Level 10 <br>
         0xA~0xF: Reserved <p>
     */
        public static final int EHU_SETATMLAMPBRI_336 = 557847019;

    /**
     * EHU_ATMLAMPOPENCMD_336 <p>
     * <br>
     * Function Describe: 氛围灯开启命令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 关闭氛围灯 <br>
         0x1: 打开氛围灯 <p>
     */
        public static final int EHU_ATMLAMPOPENCMD_336 = 557847023;

    /**
     * EHU_ALCCSTMSWT_336 <p>
     * <br>
     * Function Describe: 氛围灯自定义模式开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: On <br>
         0x2: Off <br>
         0x3: Invalid <p>
     */
        public static final int EHU_ALCCSTMSWT_336 = 557847025;

    /**
     * EHU_HDCSWTSIG_336 <p>
     * <br>
     * Function Describe: HDC开关信号HDC switch, pressed or not. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No Pressed <br>
         0x1: Pressed <p>
     */
        public static final int EHU_HDCSWTSIG_336 = 557847026;

    /**
     * EHU_ESPSWTSIG_336 <p>
     * <br>
     * Function Describe: ESP开关信号ESP switch, pressed or not. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No Pressed <br>
         0x1: Pressed <p>
     */
        public static final int EHU_ESPSWTSIG_336 = 557847027;

    /**
     * EHU_SLCSWT_336 <p>
     * <br>
     * Function Describe: 氛围灯总开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: On <br>
         0x2: Off <br>
         0x3: Invalid <p>
     */
        public static final int EHU_SLCSWT_336 = 557847030;

    /**
     * EHU_DRVRSEATHEATGREQ_528 <p>
     * <br>
     * Function Describe: 驾驶员座椅加热请求Seat heating request on driver seatValues:Off/Low/Medium/High. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Not Change <br>
         0x1: High <br>
         0x2: Med <br>
         0x3: Low <br>
         0x4: Off <br>
         0x5~0x7: Reserved <p>
     */
        public static final int EHU_DRVRSEATHEATGREQ_528 = 557847034;

    /**
     * EHU_DRVRSEATVENTNREQ_528 <p>
     * <br>
     * Function Describe: 驾驶员座椅通风请求Seat ventilation request on driver seat Values:Off/Low/Medium/High. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Not Change <br>
         0x1: High <br>
         0x2: Med <br>
         0x3: Low <br>
         0x4: Off <br>
         0x5~0x7: Reserved <p>
     */
        public static final int EHU_DRVRSEATVENTNREQ_528 = 557847035;

    /**
     * EHU_SEATWELFCTENAREQ_528 <p>
     * <br>
     * Function Describe: 座椅迎宾功能使能请求Unactive/Active. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Not Change <br>
         0x1: Unactive <br>
         0x2: Active <br>
         0x3: Reserved <p>
     */
        public static final int EHU_SEATWELFCTENAREQ_528 = 557847038;

    /**
     * EHU_PASSSEATWELFCTENAREQ_528 <p>
     * <br>
     * Function Describe: 副驾迎宾功能使能请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Not Change <br>
         0x1: Unactive <br>
         0x2: Active <br>
         0x3: Reserved <p>
     */
        public static final int EHU_PASSSEATWELFCTENAREQ_528 = 557847039;

    /**
     * EHU_SEATHEATLVAUTOREDUCEREQ_528 <p>
     * <br>
     * Function Describe: 座椅加热通风自动降档使能请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Invalid <br>
         0x1: Disable <br>
         0x2: Enable <br>
         0x3: Reserved <p>
     */
        public static final int EHU_SEATHEATLVAUTOREDUCEREQ_528 = 557847041;

    /**
     * EHU_PASSSEATHEATGREQ_528 <p>
     * <br>
     * Function Describe: 副驾驶座椅加热请求Seat heating request on Panssenger seatValues:Off/Low/Medium/High. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Not Change <br>
         0x1: High <br>
         0x2: Med <br>
         0x3: Low <br>
         0x4: Off <br>
         0x5~0x7: Reserved <p>
     */
        public static final int EHU_PASSSEATHEATGREQ_528 = 557847042;

    /**
     * EHU_PASSSEATVENTNREQ_528 <p>
     * <br>
     * Function Describe: 副驾驶座椅通风请求Seat ventilation request on Panssenger seat Values:Off/Low/Medium/High. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Not Change <br>
         0x1: High <br>
         0x2: Med <br>
         0x3: Low <br>
         0x4: Off <br>
         0x5~0x7: Reserved <p>
     */
        public static final int EHU_PASSSEATVENTNREQ_528 = 557847043;

    /**
     * EHU_LRSEATHEATREQ_528 <p>
     * <br>
     * Function Describe: 左后座椅加热请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Not Change <br>
         0x1: High <br>
         0x2: Med <br>
         0x3: Low <br>
         0x4: Off <br>
         0x5~0x7: Reserved <p>
     */
        public static final int EHU_LRSEATHEATREQ_528 = 557847044;

    /**
     * EHU_RRSEATHEATREQ_528 <p>
     * <br>
     * Function Describe: 右后座椅加热请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Not Change <br>
         0x1: High <br>
         0x2: Med <br>
         0x3: Low <br>
         0x4: Off <br>
         0x5~0x7: Reserved <p>
     */
        public static final int EHU_RRSEATHEATREQ_528 = 557847046;

    /**
     * EHU_CRTLANGUAGE_529 <p>
     * <br>
     * Function Describe: ICC当前语言 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Keep the current <br>
         0x1: Chinese <br>
         0x2: English <br>
         0x3: Reserved <p>
     */
        public static final int EHU_CRTLANGUAGE_529 = 557847049;

    /**
     * EHU_BRIADJ_HUD_529 <p>
     * <br>
     * Function Describe: HUD亮度手动调节 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Not Pressed <br>
         0x1: Up <br>
         0x2: Down <br>
         0x3: Reserved <p>
     */
        public static final int EHU_BRIADJ_HUD_529 = 557847051;

    /**
     * EHU_STEERWHLPHNKEYBACKLI_529 <p>
     * <br>
     * Function Describe: 方向盘电话按键背光 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Normal 普通状态 <br>
         0x1: Incoming Call 来电 <br>
         0x2: Call 蓝牙电话来电 <br>
         0x3: Reserved <p>
     */
        public static final int EHU_STEERWHLPHNKEYBACKLI_529 = 557847052;

    /**
     * EHU_BACKGNDBRILVL_529 <p>
     * <br>
     * Function Describe: 背景光亮度等级Light intensity level.  <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Level 1 <br>
         0x1: Level 2 <br>
         0x2: Level 3 <br>
         0x3: Level 4 <br>
         0x4: Level 5 <br>
         0x5: Level 6 <br>
         0x6: Level 7 <br>
         0x7: Level 8 <br>
         0x8: Level 9 <br>
         0x9: Level 10 <br>
         0xA~0xF: Reserved <p>
     */
        public static final int EHU_BACKGNDBRILVL_529 = 557847053;

    /**
     * EHU_BRIADJVAL_HUD_529 <p>
     * <br>
     * Function Describe: HUD亮度手动调节值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Keep the current <br>
         0x1: Level1 <br>
         0x2: Level2 <br>
         0x3: Level3 <br>
         0x4: Level4 <br>
         0x5: Level5 <br>
         0x6: Level6 <br>
         0x7: Level7 <br>
         0x8: Level8 <br>
         0x9: Level9 <br>
         0xA: Level10 <br>
         0xB: Reserved <p>
     */
        public static final int EHU_BRIADJVAL_HUD_529 = 557847056;

    /**
     * EHU_OPENCMD_HUD_529 <p>
     * <br>
     * Function Describe: HUD开启指令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Keep the Current <br>
         0x1: Close <br>
         0x2: Open <br>
         0x3: Reserved <p>
     */
        public static final int EHU_OPENCMD_HUD_529 = 557847057;

    /**
     * EHU_SNOWMODSWT_HUD_529 <p>
     * <br>
     * Function Describe: HUD雪地模式开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Keep the Current <br>
         0x1: Off <br>
         0x2: On <br>
         0x3: Reserved <p>
     */
        public static final int EHU_SNOWMODSWT_HUD_529 = 557847058;

    /**
     * EHU_HEIADJ_HUD_529 <p>
     * <br>
     * Function Describe: HUD显示高度手动调节 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Keep the current <br>
         0x1: Level1 <br>
         0x2: Level2 <br>
         0x3: Level3 <br>
         0x4: Level4 <br>
         0x5: Level5 <br>
         0x6: Level6 <br>
         0x7: Level7 <br>
         0x8: Level8 <br>
         0x9: Level9 <br>
         0xA: Level10 <br>
         0xB: Reserved <p>
     */
        public static final int EHU_HEIADJ_HUD_529 = 557847059;

    /**
     * EHU_WIPRSRVPOSN_529 <p>
     * <br>
     * Function Describe: 雨刮服务位置(维修模式) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: On <br>
         0x2: Off <br>
         0x3: Reserved <p>
     */
        public static final int EHU_WIPRSRVPOSN_529 = 557847062;

    /**
     * EHU_PULLMODREQ_529 <p>
     * <br>
     * Function Describe: ICC牵引模式请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 开启请求 <br>
         0x2: 退出请求 <br>
         0x3: Reserved <p>
     */
        public static final int EHU_PULLMODREQ_529 = 557847067;

    /**
     * EHU_USRPWROFFFB_529 <p>
     * <br>
     * Function Describe: 用户下电反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 允许下电 <br>
         0x2: 不允许下电 <br>
         0x3: 预留 <p>
     */
        public static final int EHU_USRPWROFFFB_529 = 557847068;

    /**
     * EHU_STEERWHLHEATGSW_529 <p>
     * <br>
     * Function Describe: 方向盘加热开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Active <br>
         0x2: Reserved <br>
         0x3: Invalid <p>
     */
        public static final int EHU_STEERWHLHEATGSW_529 = 557847069;

    /**
     * EHU_DRVRTSET_530 <p>
     * <br>
     * Function Describe: 主驾温度值设定 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1~0x23: Low <br>
         0x24: 18℃ <br>
         0x25: 18.5℃ <br>
         0x26: 19℃ <br>
         0x27: 19.5℃ <br>
         0x28: 20℃ <br>
         0x29: 20.5℃ <br>
         0x2A: 21℃ <br>
         0x2B: 21.5℃ <br>
         0x2C: 22℃ <br>
         0x2D: 22.5℃ <br>
         0x2E: 23℃ <br>
         0x2F: 23.5℃ <br>
         0x30: 24℃ <br>
         0x31: 24.5℃ <br>
         0x32: 25℃ <br>
         0x33: 25.5℃ <br>
         0x34: 26℃ <br>
         0x35: 26.5℃ <br>
         0x36: 27℃ <br>
         0x37: 27.5℃ <br>
         0x38: 28℃ <br>
         0x39: 28.5℃ <br>
         0x3A: 29℃ <br>
         0x3B: 29.5℃ <br>
         0x3C: 30℃ <br>
         0x3D: 30.5℃ <br>
         0x3E: 31℃ <br>
         0x3F: 31.5℃ <br>
         0x40: 32℃ <br>
         0x41~0xFE: High <br>
         0xFF: Invalid <p>
     */
        public static final int EHU_DRVRTSET_530 = 557847072;

    /**
     * EHU_PASSTSET_530 <p>
     * <br>
     * Function Describe: 副驾温度值设定 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1~0x23: Low <br>
         0x24: 18℃ <br>
         0x25: 18.5℃ <br>
         0x26: 19℃ <br>
         0x27: 19.5℃ <br>
         0x28: 20℃ <br>
         0x29: 20.5℃ <br>
         0x2A: 21℃ <br>
         0x2B: 21.5℃ <br>
         0x2C: 22℃ <br>
         0x2D: 22.5℃ <br>
         0x2E: 23℃ <br>
         0x2F: 23.5℃ <br>
         0x30: 24℃ <br>
         0x31: 24.5℃ <br>
         0x32: 25℃ <br>
         0x33: 25.5℃ <br>
         0x34: 26℃ <br>
         0x35: 26.5℃ <br>
         0x36: 27℃ <br>
         0x37: 27.5℃ <br>
         0x38: 28℃ <br>
         0x39: 28.5℃ <br>
         0x3A: 29℃ <br>
         0x3B: 29.5℃ <br>
         0x3C: 30℃ <br>
         0x3D: 30.5℃ <br>
         0x3E: 31℃ <br>
         0x3F: 31.5℃ <br>
         0x40: 32℃ <br>
         0x41~0xFE: High <br>
         0xFF: Invalid <p>
     */
        public static final int EHU_PASSTSET_530 = 557847073;

    /**
     * EHU_ECCAUTOREQ_530 <p>
     * <br>
     * Function Describe: 空调AUTO请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Active <p>
     */
        public static final int EHU_ECCAUTOREQ_530 = 557847075;

    /**
     * EHU_DRVRSYNCREQ_530 <p>
     * <br>
     * Function Describe: 主驾SYNC请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Active <p>
     */
        public static final int EHU_DRVRSYNCREQ_530 = 557847076;

    /**
     * EHU_ACSWTREQ_530 <p>
     * <br>
     * Function Describe: A/C开关请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Active <p>
     */
        public static final int EHU_ACSWTREQ_530 = 557847077;

    /**
     * EHU_AIRVOLSET_530 <p>
     * <br>
     * Function Describe: 风量设定 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 无风挡位 <br>
         0x1: 风速一挡 <br>
         0x2: 风速二挡 <br>
         0x3: 风速三挡 <br>
         0x4: 风速四挡 <br>
         0x5: 风速五挡 <br>
         0x6: 风速六挡 <br>
         0x7: 风速七挡 <br>
         0x8: 风速八挡 <br>
         0x9~0xF: Reserved <p>
     */
        public static final int EHU_AIRVOLSET_530 = 557847078;

    /**
     * EHU_ECCINTEXTCIRCREQ_530 <p>
     * <br>
     * Function Describe: 空调内外循环请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Active <p>
     */
        public static final int EHU_ECCINTEXTCIRCREQ_530 = 557847079;

    /**
     * EHU_AIRCLNSWTREQ_530 <p>
     * <br>
     * Function Describe: 空气净化开关请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: inactive <br>
         0x1: active <p>
     */
        public static final int EHU_AIRCLNSWTREQ_530 = 557847080;

    /**
     * EHU_MAXFRNTDEFRSTSET_530 <p>
     * <br>
     * Function Describe: Max前除霜设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 无请求 <br>
         0x1: 切换请求 <p>
     */
        public static final int EHU_MAXFRNTDEFRSTSET_530 = 557847081;

    /**
     * EHU_VSPCTRLCMD_530 <p>
     * <br>
     * Function Describe: VSP控制指令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Active <p>
     */
        public static final int EHU_VSPCTRLCMD_530 = 557847082;

    /**
     * EHU_NAVROADTYP_530 <p>
     * <br>
     * Function Describe: 导航-道路类型Road type from navigation. <p>
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
         0x9: Side road 0x09:支路 <br>
         0xA: Channel 通道 <br>
         0xB~0xE: Reserved 保留 <br>
         0xF: invalid <p>
     */
        public static final int EHU_NAVROADTYP_530 = 557847084;

    /**
     * EHU_ECCEGYSAVEMODREQ_530 <p>
     * <br>
     * Function Describe: 空调节能模式请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 无请求 <br>
         0x1: 切换请求 <p>
     */
        public static final int EHU_ECCEGYSAVEMODREQ_530 = 557847088;

    /**
     * EHU_BLOWWINBTN_530 <p>
     * <br>
     * Function Describe: 吹窗按键 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Pressed <p>
     */
        public static final int EHU_BLOWWINBTN_530 = 557847089;

    /**
     * EHU_DRVGMILGDISPTYPSET_534 <p>
     * <br>
     * Function Describe: 续驶里程显示类型设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 无请求 <br>
        0x1: 标准续航 <br>
        0x2: 动态续航 <br>
        0x3: WLTC续航 <p>
     */
        public static final int EHU_DRVGMILGDISPTYPSET_534 = 557847091;

    /**
     * EHU_UVCREQ_534 <p>
     * <br>
     * Function Describe: UVC开关请求(鼓风机) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 无请求 <br>
         0x1: 有请求 <p>
     */
        public static final int EHU_UVCREQ_534 = 557847092;

    /**
     * EHU_DRVRBLOWFACEBTN_534 <p>
     * <br>
     * Function Describe: 主驾吹面按键 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Pressed <p>
     */
        public static final int EHU_DRVRBLOWFACEBTN_534 = 557847095;

    /**
     * EHU_PASSBLOWFACETBTN_534 <p>
     * <br>
     * Function Describe: 副驾吹面按键 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Pressed <p>
     */
        public static final int EHU_PASSBLOWFACETBTN_534 = 557847096;

    /**
     * EHU_DRVRBLOWFOOTBTN_534 <p>
     * <br>
     * Function Describe: 主驾吹脚按键 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Pressed <p>
     */
        public static final int EHU_DRVRBLOWFOOTBTN_534 = 557847097;

    /**
     * EHU_PASSBLOWFOOTBTN_534 <p>
     * <br>
     * Function Describe: 副驾吹脚按键 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Pressed <p>
     */
        public static final int EHU_PASSBLOWFOOTBTN_534 = 557847098;

    /**
     * EHU_BACKROWAIROUTLMODREQ_534 <p>
     * <br>
     * Function Describe: 后排出风模式请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: 后排吹面 <br>
         0x2: 后排吹面吹脚 <br>
         0x3: 后排吹脚 <br>
         0x4: 后排截止 <br>
         0x5~0x7: Reserved <p>
     */
        public static final int EHU_BACKROWAIROUTLMODREQ_534 = 557847099;

    /**
     * EHU_ECCSYSSWTCMD_534 <p>
     * <br>
     * Function Describe: 空调系统开关指令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: 空调开机(Short) <br>
         0x2: 空调关机(Long) <br>
         0x3: Reserved <p>
     */
        public static final int EHU_ECCSYSSWTCMD_534 = 557847101;

    /**
     * EHU_DRVRBLOWMODREQ_534 <p>
     * <br>
     * Function Describe: 语音主驾吹风模式请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: 主驾吹面模式 <br>
         0x2: 主驾吹面/吹足模式 <br>
         0x3: 主驾吹足模式 <br>
         0x4: 主驾吹足/吹窗模式 <br>
         0x5: 吹窗模式 <br>
         0x6~0x7: Reserved <p>
     */
        public static final int EHU_DRVRBLOWMODREQ_534 = 557847102;

    /**
     * EHU_PASSBLOWMODREQ_534 <p>
     * <br>
     * Function Describe: 语音副驾吹风模式请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: 副驾吹面模式 <br>
         0x2: 副驾吹面/吹足模式 <br>
         0x3: 副驾吹足模式 <br>
         0x4: 副驾吹足/吹窗模式 <br>
         0x5~0x7: Reserved <p>
     */
        public static final int EHU_PASSBLOWMODREQ_534 = 557847103;

    /**
     * EHU_FLSEATMASMODCMD_534 <p>
     * <br>
     * Function Describe: 左前座椅按摩模式指令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Default <br>
         0x1: Mode 1 <br>
         0x2: Mode 2 <br>
         0x3: Mode 3 <br>
         0x4: Mode 4 <br>
         0x5: Mode 5 <br>
         0x6: Mode 6 <br>
         0x7: Mode 7 <br>
         0x8: Mode 8 <p>
     */
        public static final int EHU_FLSEATMASMODCMD_534 = 557847104;

    /**
     * EHU_FLSEATMASGRADECMD_534 <p>
     * <br>
     * Function Describe: 左前座椅按摩档位指令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Default <br>
         0x1: Low <br>
         0x2: Middle <br>
         0x3: High <br>
         0x4: OFF <p>
     */
        public static final int EHU_FLSEATMASGRADECMD_534 = 557847105;

    /**
     * EHU_FRSEATMASMODCMD_534 <p>
     * <br>
     * Function Describe: 右前座椅按摩模式指令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Default <br>
         0x1: Mode 1 <br>
         0x2: Mode 2 <br>
         0x3: Mode 3 <br>
         0x4: Mode 4 <br>
         0x5: Mode 5 <br>
         0x6: Mode 6 <br>
         0x7: Mode 7 <br>
         0x8: Mode 8 <p>
     */
        public static final int EHU_FRSEATMASMODCMD_534 = 557847106;

    /**
     * EHU_FRSEATMASGRADECMD_534 <p>
     * <br>
     * Function Describe: 右前座椅按摩档位指令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Default <br>
         0x1: Low <br>
         0x2: Middle <br>
         0x3: High <br>
         0x4: OFF <p>
     */
        public static final int EHU_FRSEATMASGRADECMD_534 = 557847107;

    /**
     * EHU_USRSETCHRGGUNANTITHFT_59C <p>
     * <br>
     * Function Describe: 充放电枪电子锁防盗功能开启指令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 关闭 <br>
         0x2: 开启 <br>
         0x3: void <p>
     */
        public static final int EHU_USRSETCHRGGUNANTITHFT_59C = 557847115;

    /**
     * EHU_CHRGDCHACTRLCMD_59C <p>
     * <br>
     * Function Describe: 中控充放电控制指令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 停止充电指令 <br>
         0x2: 开始充电指令 <br>
         0x3: 停止放电指令 <br>
         0x4: 开始放电指令 <br>
         0x5~0x7: Invalid <p>
     */
        public static final int EHU_CHRGDCHACTRLCMD_59C = 557847124;

    /**
     * EHU_SETACCHRGGUNUNLOCKSWT_59C <p>
     * <br>
     * Function Describe: 中控设置充放电枪解锁指令_S000026_E00 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 无动作 <br>
         0x1: 解锁 <p>
     */
        public static final int EHU_SETACCHRGGUNUNLOCKSWT_59C = 557847125;

    /**
     * EHU_OPENCLOSECHRGPORT1REQ_59C <p>
     * <br>
     * Function Describe: 中控开闭车辆充电口盖1请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 开启请求 <br>
         0x2: 关闭请求 <br>
         0x3: Reserved <p>
     */
        public static final int EHU_OPENCLOSECHRGPORT1REQ_59C = 557847127;

    /**
     * ICC_AUTOCOLORSWT_59C <p>
     * <br>
     * Function Describe: 氛围灯自动颜色开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No Request <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICC_AUTOCOLORSWT_59C = 557847129;

    /**
     * ICC_EMISSTESTMODE_59C <p>
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
        public static final int ICC_EMISSTESTMODE_59C = 557847131;

    /**
     * ICC_IDLEMODE_59C <p>
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
        public static final int ICC_IDLEMODE_59C = 557847132;

    /**
     * ICC_ENRGMOD_59C <p>
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
        public static final int ICC_ENRGMOD_59C = 557847134;

    /**
     * ICC_REFSWITCHSTS_59C <p>
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
        public static final int ICC_REFSWITCHSTS_59C = 557847135;

    /**
     * ICC_CHRGMODUSRSET_59D <p>
     * <br>
     * Function Describe: 充电模式用户设置请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 无请求 <br>
         0x1: 自定义模式 <br>
         0x2: 智能模式 <br>
         0x3: 远途模式 <br>
         0x4: 长期健康存放 <br>
         0x5~0x7: 预留 <p>
     */
        public static final int ICC_CHRGMODUSRSET_59D = 557847141;

    /**
     * ICC_TURNLAMPMODSWT_59D <p>
     * <br>
     * Function Describe: 氛围灯转向联动开关(精灵灯光) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No request <br>
         0x1: on <br>
         0x2: off <br>
         0x3: Invalid <p>
     */
        public static final int ICC_TURNLAMPMODSWT_59D = 557847144;

    /**
     * ICC_CONTRASTCOLORSWT4_59D <p>
     * <br>
     * Function Describe: 氛围灯撞色开关4-虚拟霓虹（动态） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No request <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICC_CONTRASTCOLORSWT4_59D = 557847145;

    /**
     * ICC_CONTRASTCOLORSWT5_59D <p>
     * <br>
     * Function Describe: 氛围灯撞色开关5-极速电拧（动态） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No request <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICC_CONTRASTCOLORSWT5_59D = 557847146;

    /**
     * ICC_CONTRASTCOLORSWT6_59D <p>
     * <br>
     * Function Describe: 氛围灯撞色开关6-星际（动态） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No request <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICC_CONTRASTCOLORSWT6_59D = 557847147;

    /**
     * EHU_USRSETCHRGRMNMILG_610 <p>
     * <br>
     * Function Describe: 用户设置充电提醒里程 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int EHU_USRSETCHRGRMNMILG_610 = 557847166;

    /**
     * EHU_KL15KEEPREQ_610 <p>
     * <br>
     * Function Describe: ICC KL15保持请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No Request <br>
         0x1: Keep <p>
     */
        public static final int EHU_KL15KEEPREQ_610 = 557847167;

    /**
     * FAILRFUSAMPLECIRC_610 <p>
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
        public static final int FAILRFUSAMPLECIRC_610 = 557847171;

    /**
     * EHU_POLLINGFCTOPENSTS_610 <p>
     * <br>
     * Function Describe: polling功能开启状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Default <br>
         0x1: Active <br>
         0x2: Inactive <br>
         0x3: Reserved <p>
     */
        public static final int EHU_POLLINGFCTOPENSTS_610 = 557847172;

    /**
     * EHU_CHRGINSULFCTREQ_610 <p>
     * <br>
     * Function Describe: 中控充电保温功能请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 无动作 <br>
         0x1: 开启 <br>
         0x2: 关闭 <br>
         0x3: Reserved <p>
     */
        public static final int EHU_CHRGINSULFCTREQ_610 = 557847174;

    /**
     * EHU_USRSETDISCHRGRMNMILG_610 <p>
     * <br>
     * Function Describe: 用户设置放电截止里程 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int EHU_USRSETDISCHRGRMNMILG_610 = 557847179;

    /**
     * EHU_SETCHRGENDSOC_610 <p>
     * <br>
     * Function Describe: 中控设置截止充电SOC值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int EHU_SETCHRGENDSOC_610 = 557847180;

    /**
     * ICC_ROADLMTSPD_63D <p>
     * <br>
     * Function Describe: 当前道路最高限速 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_ROADLMTSPD_63D = 557847185;

    /**
     * ICC_TIMETODEST_63D <p>
     * <br>
     * Function Describe: 当前到目的剩余时间 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_TIMETODEST_63D = 557847186;

    /**
     * ICC_MILETODEST_63D <p>
     * <br>
     * Function Describe: 当前到目的剩余里程 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_MILETODEST_63D = 557847187;

    /**
     * VCU_RDYLAMP_214 <p>
     * <br>
     * Function Describe: READY灯 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 未准备好 <br>
         0x1: 已准备好 <p>
     */
        public static final int VCU_RDYLAMP_214 = 557847204;

    /**
     * VCU_PWRBATTHVCNCTSTS_214 <p>
     * <br>
     * Function Describe: 动力电池高压连接状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 连接状态 <br>
         0x1: 断开状态 <p>
     */
        public static final int VCU_PWRBATTHVCNCTSTS_214 = 557847205;

    /**
     * VCU_APSPERC_214 <p>
     * <br>
     * Function Describe: 加速踏板开度 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_APSPERC_214 = 557847210;

    /**
     * VCU_DRVMODSHIFTMISOPER_214 <p>
     * <br>
     * Function Describe: 驾驶模式切换误操作 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 正常 <br>
         0x1: 异常 <p>
     */
        public static final int VCU_DRVMODSHIFTMISOPER_214 = 557847212;

    /**
     * VCU_EXTREMEEGYSAVESWTENAFLG_358 <p>
     * <br>
     * Function Describe: 极致节能开关使能标志位 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 未使能 <br>
         0x1: 使能 <p>
     */
        public static final int VCU_EXTREMEEGYSAVESWTENAFLG_358 = 557847215;

    /**
     * VCU_PULLMODENASIG_358 <p>
     * <br>
     * Function Describe: 牵引模式使能信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 未使能 <br>
         0x1: 使能 <p>
     */
        public static final int VCU_PULLMODENASIG_358 = 557847217;

    /**
     * VCU_PULLMODSIG_358 <p>
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
        public static final int VCU_PULLMODSIG_358 = 557847218;

    /**
     * VCU_DRVPWRLIMSTS_358 <p>
     * <br>
     * Function Describe: 驱动功率限制状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 未限制 <br>
         0x1: 动力电池电量过低，车辆动力减弱 <br>
         0x2: 动力电池温度过低，车辆动力暂时性减弱 <br>
         0x3: 动力电池温度过高，车辆动力暂时性减弱 <br>
         0x4: 动力总成过热，车辆动力暂时性减弱 <br>
         0x5~0xF: Reserved <p>
     */
        public static final int VCU_DRVPWRLIMSTS_358 = 557847221;

    /**
     * VCU_EGYRECOVPWRLIMSTS_358 <p>
     * <br>
     * Function Describe: 能量回收功率限制状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 未限制 <br>
         0x1: 电池电量高，能量回收制动力暂时性减弱 <br>
         0x2: 电池温度低，能量回收制动力暂时性减弱 <br>
         0x3~0xF: Reserved <p>
     */
        public static final int VCU_EGYRECOVPWRLIMSTS_358 = 557847222;

    /**
     * VCU_EXTREMEEGYSAVEOPENSIG_358 <p>
     * <br>
     * Function Describe: 极致节能开启推送信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 无需推送 <br>
         0x1: 需求推送 <p>
     */
        public static final int VCU_EXTREMEEGYSAVEOPENSIG_358 = 557847224;

    /**
     * VCU_ONEPEDALKEEPDISPLAY_AB_AS_358 <p>
     * <br>
     * Function Describe: 单踏板保持显示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 待用 <br>
         0x2: 激活 <br>
         0x3: Reserved <p>
     */
        public static final int VCU_ONEPEDALKEEPDISPLAY_AB_AS_358 = 557847226;

    /**
     * VCU_VEHACSYCNSEEGY_AB_3BD <p>
     * <br>
     * Function Describe: 车辆其它消耗能量 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_VEHACSYCNSEEGY_AB_3BD = 557847240;

    /**
     * VCU_EGYRECOVEGY_AB_3BD <p>
     * <br>
     * Function Describe: 能量回收能量 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_EGYRECOVEGY_AB_3BD = 557847243;

    /**
     * VCU_LONGTIHLTHSTOREPUSHINFO_605 <p>
     * <br>
     * Function Describe: 长期健康存放推送信息 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 您已经XX天没有用车，系统已为您自动开启健康存放，以延长电池寿命 <br>
         0x2: 系统检测到您已用车，长期健康存放已主动关闭 <br>
         0x3: 充电未成功启动 <p>
     */
        public static final int VCU_LONGTIHLTHSTOREPUSHINFO_605 = 557847261;

    /**
     * VCU_CHRGSTSTXT_605 <p>
     * <br>
     * Function Describe: 充电状态文字提示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 智能充电保护中 <br>
         0x2: 启用长期健康存放 <br>
         0x3: 预留 <p>
     */
        public static final int VCU_CHRGSTSTXT_605 = 557847262;

    /**
     * BMS_CHRGFLTPROMT_330 <p>
     * <br>
     * Function Describe: 充电口异常提醒 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 整车系统自检异常，充电功能可能受限，请进店维修 <br>
         0x2: 整车系统自检异常，充电功能可能受限，请进店维修（尝试关闭充电口盖或插上直流充电枪） <br>
         0x3: 整车系统自检异常，充电功能受限，请进店维修 <br>
         0x4~0x7: Reserved <p>
     */
        public static final int BMS_CHRGFLTPROMT_330 = 557847265;

    /**
     * BMS_PWRBATTRMNGCPSOC_330 <p>
     * <br>
     * Function Describe: 动力电池剩余电量SOC(显示) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int BMS_PWRBATTRMNGCPSOC_330 = 557847271;

    /**
     * BMS_CELLMINTALRM_330 <p>
     * <br>
     * Function Describe: 单体最低温度报警_P119321_E00 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 无故障 <br>
         0x1: 有故障 <p>
     */
        public static final int BMS_CELLMINTALRM_330 = 557847272;

    /**
     * BMS_PWRBATTTHERMRUNAWAYALRM_330 <p>
     * <br>
     * Function Describe: 动力电池热失控预警_P123A24_E00 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 正常 <br>
         0x1: 异常 <p>
     */
        public static final int BMS_PWRBATTTHERMRUNAWAYALRM_330 = 557847273;

    /**
     * ESP_WARNINGON_261 <p>
     * <br>
     * Function Describe: ESP制动故障点灯请求With this signal ESP requests the warning in the dashboard. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Request <br>
         0x1: Yellow Lamp Request <br>
         0x2: Red Lamp Request <br>
         0x3: Reserved <p>
     */
        public static final int ESP_WARNINGON_261 = 557847281;

    /**
     * ESP_BRKFLDALRM_261 <p>
     * <br>
     * Function Describe: 制动液位报警信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Lamp OFF <br>
         0x1: Lamp ON <br>
         0x2: Lamp Flashing <br>
         0x3: Invalid <p>
     */
        public static final int ESP_BRKFLDALRM_261 = 557847283;

    /**
     * ESP_AVLINDCN_CST_261 <p>
     * <br>
     * Function Describe: 指示CST的状态是否可用 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: not available <br>
         0x1: available <p>
     */
        public static final int ESP_AVLINDCN_CST_261 = 557847284;

    /**
     * ESP_CTRLSTS_CST_261 <p>
     * <br>
     * Function Describe: 舒适制动开关状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: off <br>
         0x1: stand by <p>
     */
        public static final int ESP_CTRLSTS_CST_261 = 557847285;

    /**
     * ESP_SYSSTS_EPB_268 <p>
     * <br>
     * Function Describe: EPB状态Status of EPB system. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Undefined 未定义 <br>
         0x1: Released 卡钳处于释放状态 <br>
         0x2: Closed 卡钳处于夹紧状态 <br>
         0x3: Releasing 卡钳正处于释放过程中 <br>
         0x4: Locking 卡钳正处于夹紧过程中 <br>
         0x5~0x7: Reserved <p>
     */
        public static final int ESP_SYSSTS_EPB_268 = 557847288;

    /**
     * ESP_FLTINDCN_EPB_268 <p>
     * <br>
     * Function Describe: EPB系统错误指示indicating EPB is available or not. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Available <br>
         0x1: Not Available <br>
         0x2: In Diagnosis <br>
         0x3: Reserved <p>
     */
        public static final int ESP_FLTINDCN_EPB_268 = 557847289;

    /**
     * ESP_ACTVNDCN_EPB_268 <p>
     * <br>
     * Function Describe: EPB工作指示Indicating the working state of EPB funtion. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: On <br>
         0x2: Flash <br>
         0x3: Reserved <p>
     */
        public static final int ESP_ACTVNDCN_EPB_268 = 557847290;

    /**
     * EPB_WARNMSG01_268 <p>
     * <br>
     * Function Describe: 提示信息，告知驾驶员下一步操作Additional warning message to inform the driver how to do the next step. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: Press The Brake Pedal First, Then Release The APB Button <p>
     */
        public static final int EPB_WARNMSG01_268 = 557847291;

    /**
     * EPB_WARNMSG02_268 <p>
     * <br>
     * Function Describe: 提示信息，告知驾驶员下一步操作，安全带未系或者车门未关Additional warning message to inform the driver how to do the next step when seatbelt not attached or the door not closed. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: Press Keep The Seatbelt Attached And The Door Closed <p>
     */
        public static final int EPB_WARNMSG02_268 = 557847292;

    /**
     * EPB_WARNMSG04_268 <p>
     * <br>
     * Function Describe: 提示信息，告知驾驶员下一步操作，驻车坡度超过门限Additional warning message to inform the driver to park the car on the slope with gentle incline. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: Park The Car On The Slope With Gentle Incline <p>
     */
        public static final int EPB_WARNMSG04_268 = 557847293;

    /**
     * EPB_WARNMSG03_268 <p>
     * <br>
     * Function Describe: 提示信息，告知驾驶员下一步操作，请切换出 P挡后释放电子驻车Additional warning message to inform the driver how to do the next step. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: Switch to the P gear First, Then Release the EPB <p>
     */
        public static final int EPB_WARNMSG03_268 = 557847294;

    /**
     * ESP_BRKPEDLSTS_318 <p>
     * <br>
     * Function Describe: 制动踏板状态indicating brake pedal activated by driver or not. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Brake Pedal Not Pressed <br>
         0x1: Brake Pedal Pressed <p>
     */
        public static final int ESP_BRKPEDLSTS_318 = 557847302;

    /**
     * ESP_VEHSPDVLD_318 <p>
     * <br>
     * Function Describe: ABS_ESC信号提示车速是否有效When the diagnostic have set the failure code on this signal the value wil be 2. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Initializing <br>
         0x1: Valid <br>
         0x2: Invalid <br>
         0x3: Reserved <p>
     */
        public static final int ESP_VEHSPDVLD_318 = 557847303;

    /**
     * ESP_SYSACTV_318 <p>
     * <br>
     * Function Describe: ESP工作有效Is used to indicate to the driver that the system is currently active.Not used for ABS. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Telltale Requested <br>
         0x1: Telltale Requested <p>
     */
        public static final int ESP_SYSACTV_318 = 557847304;

    /**
     * ESP_LAMPSWTOFFINDCN_318 <p>
     * <br>
     * Function Describe: ESP关闭指示Signal indicates to light up 'TCS/ESP off' lamp.-manual switch off of ESP function (on/off switch).Not used for ABS. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Telltale Requested <br>
         0x1: Telltale Requested <p>
     */
        public static final int ESP_LAMPSWTOFFINDCN_318 = 557847305;

    /**
     * ESP_FLTINDCN_EBD_318 <p>
     * <br>
     * Function Describe: EBD故障指示Signal indicates to light up EBD lamp. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Telltale Requested <br>
         0x1: Telltale Requested <p>
     */
        public static final int ESP_FLTINDCN_EBD_318 = 557847306;

    /**
     * ESP_FLTINDCN_ABS_318 <p>
     * <br>
     * Function Describe: ABS故障指示Signal indicates to light up ABS lamp. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Telltale Requested <br>
         0x1: Telltale Requested <p>
     */
        public static final int ESP_FLTINDCN_ABS_318 = 557847307;

    /**
     * ESP_FLTINDCN_TCS_318 <p>
     * <br>
     * Function Describe: ESP/TCS故障指示Signal indicates failure monitoring of ESP function. Not used for ABS <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Telltale Requested <br>
         0x1: Telltale Requested <p>
     */
        public static final int ESP_FLTINDCN_TCS_318 = 557847310;

    /**
     * ESP_CTRLSTS_HDC_318 <p>
     * <br>
     * Function Describe: 指示HDC处于开/关或工作状态，另外ADAS接收此信号判断ACC是否关闭。HDC control(Off/On, not active braking/On, active braking). <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: On Active Braking <br>
         0x2: On Not Active Braking <br>
         0x3: Reserved <p>
     */
        public static final int ESP_CTRLSTS_HDC_318 = 557847311;

    /**
     * ESP_AVLINDCN_HDC_318 <p>
     * <br>
     * Function Describe: HDC有效标志位indicating HDC is available or not. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Available <br>
         0x1: Not Available <p>
     */
        public static final int ESP_AVLINDCN_HDC_318 = 557847312;

    /**
     * BCM_WIPRINSRVPOSN_335 <p>
     * <br>
     * Function Describe: 电子雨刮是否在服务位置(维修模式) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No <br>
         0x1: Yes <p>
     */
        public static final int BCM_WIPRINSRVPOSN_335 = 557847320;

    /**
     * BCM_INTLAMPTISETSTS_335 <p>
     * <br>
     * Function Describe: 中控内灯门控延时时间设置状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Not Use <br>
         0x1: 0 <br>
         0x2: 15 <br>
         0x3: 30 <br>
         0x4: 45 <br>
         0x5: 60 <br>
         0x6~0x7: Reserved <p>
     */
        public static final int BCM_INTLAMPTISETSTS_335 = 557847321;

    /**
     * BCM_WATERPOSNSNSRSWTSTS_335 <p>
     * <br>
     * Function Describe: 液位传感器开关状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Active <p>
     */
        public static final int BCM_WATERPOSNSNSRSWTSTS_335 = 557847322;

    /**
     * BCM_EXTLAMPSWTSTS_335 <p>
     * <br>
     * Function Describe: 外灯开关状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: Auto <br>
         0x2: Position <br>
         0x3: Low Beam <br>
         0x4~0x7: Reserved <p>
     */
        public static final int BCM_EXTLAMPSWTSTS_335 = 557847326;

    /**
     * BCM_RAINCLSSUNROOFSETSTS_335 <p>
     * <br>
     * Function Describe: 中控屏雨天关天窗设置状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Active <p>
     */
        public static final int BCM_RAINCLSSUNROOFSETSTS_335 = 557847332;

    /**
     * BCM_MIRRLOCKAUTOSETSTS_335 <p>
     * <br>
     * Function Describe: 中控后视镜闭锁自动折叠设置状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 关闭 <br>
         0x1: 开启 <p>
     */
        public static final int BCM_MIRRLOCKAUTOSETSTS_335 = 557847333;

    /**
     * BCM_DANGERALRMLAMPSWTSTS_335 <p>
     * <br>
     * Function Describe: 危险报警灯开关状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: On <p>
     */
        public static final int BCM_DANGERALRMLAMPSWTSTS_335 = 557847335;

    /**
     * BCM_REDEFRSTHEATGCMD_335 <p>
     * <br>
     * Function Describe: 后除霜加热命令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: On <p>
     */
        public static final int BCM_REDEFRSTHEATGCMD_335 = 557847336;

    /**
     * BCM_RVSLAMPOUTPCMD_335 <p>
     * <br>
     * Function Describe: 倒车灯输出命令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: On <p>
     */
        public static final int BCM_RVSLAMPOUTPCMD_335 = 557847337;

    /**
     * BCM_LETRUNLAMPOUTPCMD_335 <p>
     * <br>
     * Function Describe: 左转向灯输出命令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: On <p>
     */
        public static final int BCM_LETRUNLAMPOUTPCMD_335 = 557847339;

    /**
     * BCM_RITRUNLAMPOUTPCMD_335 <p>
     * <br>
     * Function Describe: 右转向灯输出命令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: On <p>
     */
        public static final int BCM_RITRUNLAMPOUTPCMD_335 = 557847340;

    /**
     * BCM_HIBEAMOUTPCMD_335 <p>
     * <br>
     * Function Describe: 远光灯输出命令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: On <p>
     */
        public static final int BCM_HIBEAMOUTPCMD_335 = 557847343;

    /**
     * BCM_LOBEAMOUTPCMD_335 <p>
     * <br>
     * Function Describe: 近光灯输出命令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: On <p>
     */
        public static final int BCM_LOBEAMOUTPCMD_335 = 557847344;

    /**
     * BCM_POSNLAMPOUTPCMD_335 <p>
     * <br>
     * Function Describe: 位置灯输出命令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: Left Park On <br>
         0x2: Right Park On <br>
         0x3: All On <p>
     */
        public static final int BCM_POSNLAMPOUTPCMD_335 = 557847345;

    /**
     * BCM_BRKLAMPOUTPCMD_335 <p>
     * <br>
     * Function Describe: 制动灯输出命令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: On <p>
     */
        public static final int BCM_BRKLAMPOUTPCMD_335 = 557847346;

    /**
     * BCM_REFOGLAMPOUTPCMD_335 <p>
     * <br>
     * Function Describe: 后雾灯输出命令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: On <p>
     */
        public static final int BCM_REFOGLAMPOUTPCMD_335 = 557847347;

    /**
     * BCM_FRNTWIPRSPD_335 <p>
     * <br>
     * Function Describe: 前雨刮刮刷速度 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int BCM_FRNTWIPRSPD_335 = 557847348;

    /**
     * BCM_VEHAMBBRI_335 <p>
     * <br>
     * Function Describe: 环境光检测值输出 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0xFF: Invalid <p>
     */
        public static final int BCM_VEHAMBBRI_335 = 557847350;

    /**
     * BCM_FRNTHOODLIDSTS_343 <p>
     * <br>
     * Function Describe: 前机舱盖状态_S000025_E00 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Closed <br>
         0x1: Open <p>
     */
        public static final int BCM_FRNTHOODLIDSTS_343 = 557847353;

    /**
     * BCM_SUNROOFANTIPINCHSTS_343 <p>
     * <br>
     * Function Describe: 天窗防夹状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Active <p>
     */
        public static final int BCM_SUNROOFANTIPINCHSTS_343 = 557847354;

    /**
     * BCM_FRNTLEDOORLOCKSTS_343 <p>
     * <br>
     * Function Describe: 驾驶侧门锁状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Lock <br>
         0x1: Unlock <p>
     */
        public static final int BCM_FRNTLEDOORLOCKSTS_343 = 557847355;

    /**
     * BCM_TRRELSSWTSTS_343 <p>
     * <br>
     * Function Describe: 后背门微动开关状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Active <p>
     */
        public static final int BCM_TRRELSSWTSTS_343 = 557847356;

    /**
     * BCM_LOCKALLDOORCMD_343 <p>
     * <br>
     * Function Describe: 四门闭锁输出命令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Active <p>
     */
        public static final int BCM_LOCKALLDOORCMD_343 = 557847357;

    /**
     * BCM_LEFRNTDOORSTS_343 <p>
     * <br>
     * Function Describe: 左前门状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Closed <br>
         0x1: Open <p>
     */
        public static final int BCM_LEFRNTDOORSTS_343 = 557847358;

    /**
     * BCM_RIFRNTDOORSTS_343 <p>
     * <br>
     * Function Describe: 右前门状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Closed <br>
         0x1: Open <p>
     */
        public static final int BCM_RIFRNTDOORSTS_343 = 557847359;

    /**
     * BCM_TRSTS_343 <p>
     * <br>
     * Function Describe: 后备箱状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Closed <br>
         0x1: Open <p>
     */
        public static final int BCM_TRSTS_343 = 557847360;

    /**
     * BCM_ANTITHFTSTS_343 <p>
     * <br>
     * Function Describe: 车身防盗状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 解防 <br>
         0x1: 预设防 <br>
         0x2: 设防 <br>
         0x3: 报警 <p>
     */
        public static final int BCM_ANTITHFTSTS_343 = 557847361;

    /**
     * BCM_CENLOCKSWTSTS_343 <p>
     * <br>
     * Function Describe: 中控锁开关状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Unlock <br>
         0x2: Lock <br>
         0x3: Reserved <p>
     */
        public static final int BCM_CENLOCKSWTSTS_343 = 557847362;

    /**
     * BCM_DOORUNLOCKSETFB_343 <p>
     * <br>
     * Function Describe: 车门解锁设置反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 驾驶员侧车门 <br>
         0x1: 所有车门 <p>
     */
        public static final int BCM_DOORUNLOCKSETFB_343 = 557847363;

    /**
     * BCM_RIREDOORSTS_343 <p>
     * <br>
     * Function Describe: 右后门状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Closed <br>
         0x1: Open <p>
     */
        public static final int BCM_RIREDOORSTS_343 = 557847364;

    /**
     * BCM_LEREDOORSTS_343 <p>
     * <br>
     * Function Describe: 左后门状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Closed <br>
         0x1: Open <p>
     */
        public static final int BCM_LEREDOORSTS_343 = 557847365;

    /**
     * BCM_LEFRNTWINSTS_343 <p>
     * <br>
     * Function Describe: 左前车窗开闭状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Closed <br>
         0x1: Open <p>
     */
        public static final int BCM_LEFRNTWINSTS_343 = 557847366;

    /**
     * BCM_RIFRNTWINSTS_343 <p>
     * <br>
     * Function Describe: 右前车窗开闭状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Closed <br>
         0x1: Open <p>
     */
        public static final int BCM_RIFRNTWINSTS_343 = 557847367;

    /**
     * BCM_LEREWINSTS_343 <p>
     * <br>
     * Function Describe: 左后车窗开闭状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Closed <br>
         0x1: Open <p>
     */
        public static final int BCM_LEREWINSTS_343 = 557847368;

    /**
     * BCM_RIREWINST_343 <p>
     * <br>
     * Function Describe: 右后车窗开闭状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Closed <br>
         0x1: Open <p>
     */
        public static final int BCM_RIREWINST_343 = 557847369;

    /**
     * BCM_FOLWMESETSTSFB_343 <p>
     * <br>
     * Function Describe: 伴我回家设置状态反馈(延时关闭) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Follow Me Closed <br>
         0x1: 15 <br>
         0x2: 30 <br>
         0x3: 45 <br>
         0x4: 60 <br>
         0x5~0x7: Reserved <p>
     */
        public static final int BCM_FOLWMESETSTSFB_343 = 557847370;

    /**
     * BCM_DRVRBOORUNLCKOUTPCMD_343 <p>
     * <br>
     * Function Describe: 主驾驶门解锁输出命令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Active <p>
     */
        public static final int BCM_DRVRBOORUNLCKOUTPCMD_343 = 557847371;

    /**
     * BCM_PASSDOORUNLCKOUTPCMD_343 <p>
     * <br>
     * Function Describe: 乘客门解锁输出命令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Active <p>
     */
        public static final int BCM_PASSDOORUNLCKOUTPCMD_343 = 557847372;

    /**
     * BCM_LEDRLOUTPCMD_343 <p>
     * <br>
     * Function Describe: 左日间行车灯输出命令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: On <p>
     */
        public static final int BCM_LEDRLOUTPCMD_343 = 557847373;

    /**
     * BCM_RIDRLOUTPCMD_343 <p>
     * <br>
     * Function Describe: 右日间行车灯输出命令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: On <p>
     */
        public static final int BCM_RIDRLOUTPCMD_343 = 557847374;

    /**
     * BCM_ARMEDCLSWINSETSTS_343 <p>
     * <br>
     * Function Describe: 中控屏设防关窗设置状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Active <p>
     */
        public static final int BCM_ARMEDCLSWINSETSTS_343 = 557847375;

    /**
     * BCM_OFFAUTOUNLCKSETSTS_343 <p>
     * <br>
     * Function Describe: 中控熄火自动解锁设置状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Active <p>
     */
        public static final int BCM_OFFAUTOUNLCKSETSTS_343 = 557847376;

    /**
     * BCM_SUNROOFPOSNINFO_343 <p>
     * <br>
     * Function Describe: 天窗开度信息 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int BCM_SUNROOFPOSNINFO_343 = 557847377;

    /**
     * BCM_SUNROOFOPENAR_343 <p>
     * <br>
     * Function Describe: 天窗开度区域 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Horizontal 水平滑动区域 <br>
         0x1: Vertical 倾斜区域 <p>
     */
        public static final int BCM_SUNROOFOPENAR_343 = 557847378;

    /**
     * BCM_SUNROOFRUNNGSTS_343 <p>
     * <br>
     * Function Describe: 天窗运行状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Stopped <br>
         0x1: Opening Tilt <br>
         0x2: Closing Tilt <br>
         0x3: Opening Slide <br>
         0x4: Closing Slide <br>
         0x5: Reversing (AP/Stall) <br>
         0x6: Moving Uninitialized <br>
         0x7: Reserved <p>
     */
        public static final int BCM_SUNROOFRUNNGSTS_343 = 557847379;

    /**
     * BCM_MIRRCMD_343 <p>
     * <br>
     * Function Describe: 外后视镜控制(状态反馈) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Fold <br>
         0x2: Unfold <br>
         0x3: Not Used <p>
     */
        public static final int BCM_MIRRCMD_343 = 557847380;

    /**
     * BCM_APPLIANCECLSLVL_51E <p>
     * <br>
     * Function Describe: 用电器关闭等级 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 不关闭 <br>
         0x1: 关闭等级1 <br>
         0x2: 关闭等级2 <br>
         0x3: 关闭等级3 <br>
         0x4: 关闭等级4 <br>
         0x5: 关闭等级5 <br>
         0x6: 关闭等级6 <br>
         0x7: Reserved <p>
     */
        public static final int BCM_APPLIANCECLSLVL_51E = 557847381;

    /**
     * DSMC_DRVRSEATTRACKSWTSTS_4F1 <p>
     * <br>
     * Function Describe: 驾驶员座椅滑轨开关状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: Fwd <br>
         0x2: Rwd <br>
         0x3: Defect <p>
     */
        public static final int DSMC_DRVRSEATTRACKSWTSTS_4F1 = 557847384;

    /**
     * DSMC_DRVRSEATHEIADJSWTSTS_4F1 <p>
     * <br>
     * Function Describe: 驾驶员座椅高度调节开关状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: Up <br>
         0x2: Down <br>
         0x3: Defect <p>
     */
        public static final int DSMC_DRVRSEATHEIADJSWTSTS_4F1 = 557847385;

    /**
     * DSMC_DRVRSEATBACKADJSWTSTS_4F1 <p>
     * <br>
     * Function Describe: 驾驶员座椅靠背调节开关状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: Fwd <br>
         0x2: Rwd <br>
         0x3: Defect <p>
     */
        public static final int DSMC_DRVRSEATBACKADJSWTSTS_4F1 = 557847386;

    /**
     * DSMC_CRTDRVRSEATUIDSUBPOSN_4F1 <p>
     * <br>
     * Function Describe: 当前驾驶员座椅子位置编号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 无效 <br>
         0x1: 位置1 <br>
         0x2: 位置2 <br>
         0x3: 位置3 <br>
         0x4~0x5: 保留 <br>
         0x6: 小憩位置 <br>
         0x7: 冥想位置 <p>
     */
        public static final int DSMC_CRTDRVRSEATUIDSUBPOSN_4F1 = 557847388;

    /**
     * DSMC_DRVRSEATWELFCTSETFB_4F1 <p>
     * <br>
     * Function Describe: 驾驶员座椅迎宾功能设置反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Void <br>
         0x1: Inactive <br>
         0x2: Active <br>
         0x3: Reserved <p>
     */
        public static final int DSMC_DRVRSEATWELFCTSETFB_4F1 = 557847389;

    /**
     * DSMC_REMIRRAUTODWNFLIPFB_4F1 <p>
     * <br>
     * Function Describe: 倒车后视镜自动下翻反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 无效 <br>
         0x1: Left Mirror <br>
         0x2: Right Mirror <br>
         0x3: Both <br>
         0x4: 关闭 <br>
         0x5~0x7: 预留 <p>
     */
        public static final int DSMC_REMIRRAUTODWNFLIPFB_4F1 = 557847390;

    /**
     * DSMC_RIMIRRRXDIECPOSN_4F3 <p>
     * <br>
     * Function Describe: 右侧后视镜X方向位置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int DSMC_RIMIRRRXDIECPOSN_4F3 = 557847392;

    /**
     * DSMC_RIMIRRRYDIRCPOSN_4F3 <p>
     * <br>
     * Function Describe: 右侧后视镜Y方向位置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int DSMC_RIMIRRRYDIRCPOSN_4F3 = 557847393;

    /**
     * DSMC_LEMIRRRXPOSN_4F3 <p>
     * <br>
     * Function Describe: 左侧后视镜X方向位置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int DSMC_LEMIRRRXPOSN_4F3 = 557847394;

    /**
     * DSMC_LEMIRRRYPOSN_4F3 <p>
     * <br>
     * Function Describe: 左侧后视镜Y方向位置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int DSMC_LEMIRRRYPOSN_4F3 = 557847395;

    /**
     * DSMC_DRVRSEATTRACKPOSN_4F5 <p>
     * <br>
     * Function Describe: 驾驶员座椅滑轨位置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int DSMC_DRVRSEATTRACKPOSN_4F5 = 557847400;

    /**
     * DSMC_DRVRSEATHEIPOSN_4F5 <p>
     * <br>
     * Function Describe: 驾驶员座椅高度位置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int DSMC_DRVRSEATHEIPOSN_4F5 = 557847401;

    /**
     * DSMC_DRVRSEATBACKPOSN_4F5 <p>
     * <br>
     * Function Describe: 驾驶员座椅靠背位置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int DSMC_DRVRSEATBACKPOSN_4F5 = 557847402;

    /**
     * DSMC_DRVRSEATMEMRECALLFB_62 <p>
     * <br>
     * Function Describe: 驾驶员座椅记忆调出反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Void <br>
         0x1: Successful <br>
         0x2: Failed <br>
         0x3: No UID Data <p>
     */
        public static final int DSMC_DRVRSEATMEMRECALLFB_62 = 557847404;

    /**
     * DSMC_DRVRSEATMEMDATAUPDFB_62 <p>
     * <br>
     * Function Describe: 驾驶员座椅记忆信息更新完成反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Void <br>
         0x1: Successful <br>
         0x2: Failed <br>
         0x3: Reserved <p>
     */
        public static final int DSMC_DRVRSEATMEMDATAUPDFB_62 = 557847405;

    /**
     * DSMC_DRVRSEATHEATGSTS_518 <p>
     * <br>
     * Function Describe: 驾驶员座椅加热状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: High <br>
         0x2: Med <br>
         0x3: Low <br>
         0x4: Off <br>
         0x5: OpenCnct <br>
         0x6: OverLoad <br>
         0x7: Unsatisfied <p>
     */
        public static final int DSMC_DRVRSEATHEATGSTS_518 = 557847407;

    /**
     * DSMC_DRVRSEATVENTNSTS_518 <p>
     * <br>
     * Function Describe: 驾驶员座椅风机状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: High <br>
         0x2: Med <br>
         0x3: Low <br>
         0x4: Off <br>
         0x5~0x7: Reserved <p>
     */
        public static final int DSMC_DRVRSEATVENTNSTS_518 = 557847408;

    /**
     * DSMC_DRVRSEATTRACKADJSTS_518 <p>
     * <br>
     * Function Describe: 驾驶员座椅滑轨调节状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: Fwd <br>
         0x2: Rwd <br>
         0x3: Defect <p>
     */
        public static final int DSMC_DRVRSEATTRACKADJSTS_518 = 557847409;

    /**
     * DSMC_DRVRSEATHEIADJSTS_518 <p>
     * <br>
     * Function Describe: 驾驶员座椅高度调节状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: Up <br>
         0x2: Down <br>
         0x3: Defect <p>
     */
        public static final int DSMC_DRVRSEATHEIADJSTS_518 = 557847410;

    /**
     * DSMC_DRVRSEATBACKADJSTS_518 <p>
     * <br>
     * Function Describe: 驾驶员座椅靠背调节状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: Fwd <br>
         0x2: Rwd <br>
         0x3: Defect <p>
     */
        public static final int DSMC_DRVRSEATBACKADJSTS_518 = 557847411;

    /**
     * DSMC_DRVRSEATCUSHAGADJSTS_518 <p>
     * <br>
     * Function Describe: 驾驶员座椅坐垫角度调节状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: Down <br>
         0x2: Up <br>
         0x3: Defect <p>
     */
        public static final int DSMC_DRVRSEATCUSHAGADJSTS_518 = 557847412;

    /**
     * DSMC_LUMBARUPDSTS_518 <p>
     * <br>
     * Function Describe: 腰托向上调节状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Release <br>
         0x1: Press <p>
     */
        public static final int DSMC_LUMBARUPDSTS_518 = 557847413;

    /**
     * DSMC_LUMBARDWNSTS_518 <p>
     * <br>
     * Function Describe: 腰托向下调节状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Release <br>
         0x1: Press <p>
     */
        public static final int DSMC_LUMBARDWNSTS_518 = 557847414;

    /**
     * DSMC_LUMBARFWDSTS_518 <p>
     * <br>
     * Function Describe: 腰托向前调节状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Release <br>
         0x1: Press <p>
     */
        public static final int DSMC_LUMBARFWDSTS_518 = 557847415;

    /**
     * DSMC_LUMBARBACKWSTS_518 <p>
     * <br>
     * Function Describe: 腰托向后调节状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Release <br>
         0x1: Press <p>
     */
        public static final int DSMC_LUMBARBACKWSTS_518 = 557847416;

    /**
     * DSMC_LRSEATHEATSTS_518 <p>
     * <br>
     * Function Describe: 左后座椅加热状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: High <br>
         0x2: Med <br>
         0x3: Low <br>
         0x4: Off <br>
         0x5: OpenCnct <br>
         0x6: OverLoad <br>
         0x7: Unsatisfied <p>
     */
        public static final int DSMC_LRSEATHEATSTS_518 = 557847418;

    /**
     * DSMC_SEATHEATAUTODWNENASTS_518 <p>
     * <br>
     * Function Describe: 座椅加热自动降档使能状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Disable <br>
         0x1: Enable <p>
     */
        public static final int DSMC_SEATHEATAUTODWNENASTS_518 = 557847419;

    /**
     * DSMC_REMIRRLERIFB_518 <p>
     * <br>
     * Function Describe: 左右后视镜选择反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Void <br>
         0x1: Left Mirror <br>
         0x2: Right Mirror <br>
         0x3: Defect <p>
     */
        public static final int DSMC_REMIRRLERIFB_518 = 557847420;

    /**
     * DSMC_MASFL_SEATMASMOD_518 <p>
     * <br>
     * Function Describe: 左前座椅按摩模式 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Default <br>
         0x1: Mode 1 <br>
         0x2: Mode 2 <br>
         0x3: Mode 3 <br>
         0x4: Mode 4 <br>
         0x5: Mode 5 <br>
         0x6: Mode 6 <br>
         0x7: Mode 7 <br>
         0x8: Mode 8 <p>
     */
        public static final int DSMC_MASFL_SEATMASMOD_518 = 557847422;

    /**
     * DSMC_MASFL_SEATMASGRADESTS_518 <p>
     * <br>
     * Function Describe: 左前座椅按摩档位 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Default <br>
         0x1: Low <br>
         0x2: Middle <br>
         0x3: High <br>
         0x4: OFF <p>
     */
        public static final int DSMC_MASFL_SEATMASGRADESTS_518 = 557847423;

    /**
     * PLG_USRSETTRMAXHEIRESFB_64 <p>
     * <br>
     * Function Describe: 用户设定后尾门电动开启最大高度的结果反馈If user customize the maximum height, PLG give feedback to ICC to indicate result on screen. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Not Setting <br>
         0x1: Successful Setting <br>
         0x2: Failed Setting <br>
         0x3: Reserved <p>
     */
        public static final int PLG_USRSETTRMAXHEIRESFB_64 = 557847425;

    /**
     * PLG_USRSETTRMAXHEI_471 <p>
     * <br>
     * Function Describe: 用户设定的后尾门电动开启最大高度(表示用户设定停止高度，电动模式下，尾门高度不会大于该值)Indicate customized maximum height. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1~0x31: Reserved <br>
         0x32~0x5F: Max Height Setting <br>
         0x60~0xFF: Reserved <p>
     */
        public static final int PLG_USRSETTRMAXHEI_471 = 557847426;

    /**
     * PLG_LETRPOSN_471 <p>
     * <br>
     * Function Describe: 左侧撑杆提供的尾门当前高度Indicate the trunk position by percentage. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int PLG_LETRPOSN_471 = 557847427;

    /**
     * PLG_SOUNDREMDNGREQ_EHU_471 <p>
     * <br>
     * Function Describe: 扬声器提示音请求Reqeust to ICC for sound reminding <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No whistle <br>
         0x1: For moving process <br>
         0x2: Set max Height successfully. <br>
         0x3: For Anti-pinch <br>
         0x4~0x7: Reserved <p>
     */
        public static final int PLG_SOUNDREMDNGREQ_EHU_471 = 557847428;

    /**
     * PLG_SYSFLTINDCN_471 <p>
     * <br>
     * Function Describe: 电动尾门系统有故障Indicate if PLG System failure happened., Including ECU,spindle and latch <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Failure <br>
         0x1: Failure happened <p>
     */
        public static final int PLG_SYSFLTINDCN_471 = 557847430;

    /**
     * PLG_TRSWTSTSINDCN_471 <p>
     * <br>
     * Function Describe: 后尾门开关状态信号Indicate trunk status. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Trunk Closed <br>
         0x1: Trunk Open Fully <br>
         0x2: Trunk Halt <br>
         0x3: Trunk Opening <br>
         0x4: Trunk Closing <br>
         0x5~0x7: Reserved <p>
     */
        public static final int PLG_TRSWTSTSINDCN_471 = 557847431;

    /**
     * PLG_TRLTCHSTSINDCN_471 <p>
     * <br>
     * Function Describe: 尾门锁状态信号Indicate latch status. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: FullLatched_PawlSwOff 尾门锁全锁状态 <br>
         0x1: HalfLatched_StrikerLeverSwOn_LockProcess 尾门锁半锁状态且尾门锁不在执行解锁动作 <br>
         0x2: Open_PawlSwOn 尾门锁全开状态 <br>
         0x3: Initializing 门锁上电初始化过程且无论尾门锁实际处于任何状态，包括全锁、全开、半锁和雪载 <br>
         0x4: HalfLatched_StrikerLeverSwOn_ReleaseProcess 尾门锁半锁状态且尾门锁在执行解锁动作 <br>
         0x5: Snowload 尾门锁“雪载”状态 <br>
         0x6~0x7: Reserved 预留 <p>
     */
        public static final int PLG_TRLTCHSTSINDCN_471 = 557847432;

    /**
     * PLG_OPERMOD_471 <p>
     * <br>
     * Function Describe: 控制器工作模式Indicate the working mode of PLG after end of line test. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Not Learnt <br>
         0x1: Learnt, But Shipping Mode, With Power Lifting Or Closing Function Forbidden <br>
         0x2: Learnt, With Maximum Height Customization Allowed <br>
         0x3: Reserved <p>
     */
        public static final int PLG_OPERMOD_471 = 557847433;

    /**
     * PLG_ANTIPINCHSTS_471 <p>
     * <br>
     * Function Describe: 防夹状态(是否发生防夹)Indicate if anti-pinch happened.  <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Pinch <br>
         0x1: Anti-pinch Happened <p>
     */
        public static final int PLG_ANTIPINCHSTS_471 = 557847434;

    /**
     * PAS_STS_FPAS_574 <p>
     * <br>
     * Function Describe: 前泊车雷达工作模式Front Parking Assistant System Status. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Disable <br>
         0x1: Enable <br>
         0x2: Active <br>
         0x3: Failed <p>
     */
        public static final int PAS_STS_FPAS_574 = 557847438;

    /**
     * PAS_STS_RPAS_574 <p>
     * <br>
     * Function Describe: 后泊车雷达工作模式Rear Parking Assistant System Status. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Disable <br>
         0x1: Enable <br>
         0x2: Active <br>
         0x3: Failed <p>
     */
        public static final int PAS_STS_RPAS_574 = 557847440;

    /**
     * PAS_SOUNDINDCN_F_576 <p>
     * <br>
     * Function Describe: 前泊车雷达报警声频率Front Parking Assistant System Sound Indication. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Tone 0-OFF <br>
         0x1: Tone 1-Long beep <br>
         0x2: Tone 2-4Hz <br>
         0x3: Tone 3-2Hz <br>
         0x4: Chime for 3s(Failed) <br>
         0x5~0x7: Reserved <p>
     */
        public static final int PAS_SOUNDINDCN_F_576 = 557847459;

    /**
     * PAS_SOUNDINDCN_R_576 <p>
     * <br>
     * Function Describe: 后泊车雷达报警声频率Rear Parking Assistant System Sound Indication. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Tone 0-Off <br>
         0x1: Tone 1-Long Beep <br>
         0x2: Tone 2-5 Hz <br>
         0x3: Tone 3-3Hz <br>
         0x4: Tone 4-1Hz <br>
         0x5: Chime For 3s(Failed) <br>
         0x6~0x7: Reserved <p>
     */
        public static final int PAS_SOUNDINDCN_R_576 = 557847460;

    /**
     * EHU_INTEGTCRSSWT_526 <p>
     * <br>
     * Function Describe: 智能巡航系统开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Default 初始值 <br>
         0x1: Switch Off 开关关闭 <br>
         0x2: Switch On 开关打开 <br>
         0x3: Reserved <p>
     */
        public static final int EHU_INTEGTCRSSWT_526 = 557847467;

    /**
     * EHU_HMASET_526 <p>
     * <br>
     * Function Describe: 智能远光灯辅助开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Default 初始值 <br>
         0x1: Switch Off 开关关闭 <br>
         0x2: Switch On 开关打开 <br>
         0x3: Reserved <p>
     */
        public static final int EHU_HMASET_526 = 557847477;

    /**
     * EHU_LIFESIGNMONITORSWT_4DF <p>
     * <br>
     * Function Describe: 生命体征监测开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No request <br>
         0x1: OFF <br>
         0x2: On <p>
     */
        public static final int EHU_LIFESIGNMONITORSWT_4DF = 557847490;

    /**
     * ICM_TOTMILGVLD_ODO_531 <p>
     * <br>
     * Function Describe: ODO总里程有效位 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Value OK <br>
         0x1: Value Unreliable <p>
     */
        public static final int ICM_TOTMILGVLD_ODO_531 = 557847503;

    /**
     * ICC_REMSENTRYMODSTS_531 <p>
     * <br>
     * Function Describe: 远程开启哨兵模式状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
        0x1: 开启成功 <br>
        0x2: 开启失败，原因1 <br>
        0x3: 开启失败，原因2 <br>
        0x4: 开启失败，原因3 <br>
        0x5: 开启失败，原因4:用户认证失败 <br>
        0x6: 认证成功 <br>
        0x7~0x9: Reserved <br>
        0xA: 开启成功，但由于无存储设备/存储设备故障，无法录制报警视频 <br>
        0xB~0xF: Reserved <p>
     */
        public static final int ICC_REMSENTRYMODSTS_531 = 557847504;

    /**
     * ICM_TOTMILG_ODO_531 <p>
     * <br>
     * Function Describe: ODO总里程 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICM_TOTMILG_ODO_531 = 557847505;

    /**
     * ICM_DISPVEHSPD_531 <p>
     * <br>
     * Function Describe: 显示车速(write) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICM_DISPVEHSPD_531 = 557847506;

    /**
     * ICM_DISPVEHSPDUNIT_531 <p>
     * <br>
     * Function Describe: 显示车速单位 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: KMH <br>
         0x1: MPH <p>
     */
        public static final int ICM_DISPVEHSPDUNIT_531 = 557847507;

    /**
     * SDM_AIRBAGSYSALRMLAMPSTS_319 <p>
     * <br>
     * Function Describe: 安全气囊系统报警灯状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Lamp Off <br>
         0x1: Lamp Flash <br>
         0x2: Lamp On <br>
         0x3: Reserved <p>
     */
        public static final int SDM_AIRBAGSYSALRMLAMPSTS_319 = 557847514;

    /**
     * SDM_SECUBLTALRMSTS_RL_319 <p>
     * <br>
     * Function Describe: 后排左侧安全带报警状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Lamp Off(Safety Belt Tied) <br>
         0x1: Fault(Reserved) <br>
         0x2: Lamp On(Safety Belt Not Tied) <br>
         0x3: Reserved <p>
     */
        public static final int SDM_SECUBLTALRMSTS_RL_319 = 557847515;

    /**
     * SDM_SECUBLTALRMSTS_RM_319 <p>
     * <br>
     * Function Describe: 后排中间安全带报警状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Lamp Off(Safety Belt Tied) <br>
         0x1: Fault(Reserved) <br>
         0x2: Lamp On(Safety Belt Not Tied) <br>
         0x3: Reserved <p>
     */
        public static final int SDM_SECUBLTALRMSTS_RM_319 = 557847516;

    /**
     * SDM_SECUBLTALRMSTS_RR_319 <p>
     * <br>
     * Function Describe: 后排右侧安全带报警状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Lamp Off(Safety Belt Tied) <br>
         0x1: Fault(Reserved) <br>
         0x2: Lamp On(Safety Belt Not Tied) <br>
         0x3: Reserved <p>
     */
        public static final int SDM_SECUBLTALRMSTS_RR_319 = 557847517;

    /**
     * SDM_DRVERSECUBLTALRMSTS_319 <p>
     * <br>
     * Function Describe: 驾驶员安全带报警状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Lamp Off(Safety Belt Tied) <br>
         0x1: Fault(Reserved) <br>
         0x2: Lamp On(Safety Belt Not Tied) <br>
         0x3: Reserved <p>
     */
        public static final int SDM_DRVERSECUBLTALRMSTS_319 = 557847518;

    /**
     * SDM_PASSSEATBLTBUCDSTS_319 <p>
     * <br>
     * Function Describe: 副驾驶安全带锁扣状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Safety Belt Tied <br>
         0x1: Fault(Reserved) <br>
         0x2: Safety Belt Not Tied <br>
         0x3: Reserved <p>
     */
        public static final int SDM_PASSSEATBLTBUCDSTS_319 = 557847519;

    /**
     * SDM_CLLSNSIG_319 <p>
     * <br>
     * Function Describe: 碰撞信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Crash <br>
         0x1: Crash <p>
     */
        public static final int SDM_CLLSNSIG_319 = 557847520;

    /**
     * SDM_PASSSEATOCCSTS_319 <p>
     * <br>
     * Function Describe: 乘客侧座垫状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Occupied不坐人 <br>
         0x1: Occupied坐人 <p>
     */
        public static final int SDM_PASSSEATOCCSTS_319 = 557847521;

    /**
     * CIM_FRNTWIPRSWTSTS_310 <p>
     * <br>
     * Function Describe: 前雨刮刮水开关状态Wiper front command. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off 默认值 <br>
         0x1: AutoLow 雨刮自动(低灵敏度) <br>
         0x2: AutoHigh 雨刮自动(高灵敏度) <br>
         0x3: Low 连续低速刮动 <br>
         0x4: High 连续高速刮动 <br>
         0x5~0x6: Reserved <br>
         0x7: Invalid <p>
     */
        public static final int CIM_FRNTWIPRSWTSTS_310 = 557847528;

    /**
     * CIM_REWIPRSWTSTS_310 <p>
     * <br>
     * Function Describe: 后雨刮开关状态WiperRearCommand. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off 后雨刮关闭 <br>
         0x1: On 后雨刮开启 <br>
         0x2: Reserved <br>
         0x3: Invalid <p>
     */
        public static final int CIM_REWIPRSWTSTS_310 = 557847530;

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
        public static final int VCU_ACCHRGELECTCLOCKSTSFBSIG_554 = 557847531;

    /**
     * VCU_CHRGDISCHRGCRTDISP_52C <p>
     * <br>
     * Function Describe: 充放电电流(显示) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_CHRGDISCHRGCRTDISP_52C = 557847536;

    /**
     * VCU_CHRGDCHAPWRDISP_52C <p>
     * <br>
     * Function Describe: 充放电功率（显示） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_CHRGDCHAPWRDISP_52C = 557847537;

    /**
     * VCU_ELECTCLOCKFLTPROMT_52D <p>
     * <br>
     * Function Describe: 电子锁异常提示_P130063 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 不显示 <br>
         0x1: 交流充电口电子锁未正常解锁，请手动解锁。 <br>
         0x2: 交流充电口电子锁未正常锁止，充电功率受限，请重试或联系经销商。 <br>
         0x3: 交流充电口电子锁未正常锁止，无法开启充电 <br>
         0x4~0x7: 预留 <p>
     */
        public static final int VCU_ELECTCLOCKFLTPROMT_52D = 557847538;

    /**
     * BMS_CHRGOPRTGUIDEPROMT_51B <p>
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
         0xA~0xF: 预留 <p>
     */
        public static final int BMS_CHRGOPRTGUIDEPROMT_51B = 557847540;

    /**
     * BMS_CHRGRLTDSTSPROMT_51B <p>
     * <br>
     * Function Describe: 充电相关状态提示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 不显示 <br>
         0x1: 电池处于健康充电中，充电时间将延长 <br>
         0x2: 为保护长期放置的电池，正在启动小电流激活充电，充电时间将延长 <br>
         0x3: 车辆空调开启，充电功率降低，充电时间将延长。 <br>
         0x4: 动力电池加热已开启 <br>
         0x5: 充电桩电压输出能力无法满足车辆需求，车辆无法充满，建议更换充电桩。 <br>
         0x6: 充电桩功率低于车辆最大允许充电功率，充电时间将延长。 <br>
         0x7: 充电插座过温，功率受限，请联系授权经销商。 <br>
         0x8: 车载充电机过温，功率受限，请联系授权经销商。 <br>
         0x9~0xFF: 预留 <p>
     */
        public static final int BMS_CHRGRLTDSTSPROMT_51B = 557847541;

    /**
     * BMS_CHRGDCHASTOPREASONPROMT_51B <p>
     * <br>
     * Function Describe: 充放电停止原因提示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 不显示 <br>
         0x1: 车辆充电系统故障，请重试或联系经销商 <br>
         0x2: 车辆续驶里程低于放电截止里程，放电停止。 <br>
         0x3: 车辆达到充电截止SOC，充电停止。 <br>
         0x4: 充电桩通讯异常，请检查充电桩状态并重试。 <br>
         0x5: 充电停止:充电桩异常输出，为保护动力电池，已自动停止充电，若继续使用该充电桩存在损伤电池的风险，建议更换充电桩。 <br>
         0x6: 充电停止:充电桩电压输出能力无法满足车辆需求，车辆无法充电，建议更换充电桩。 <br>
         0x7: 充电桩电网断电 <br>
         0x8: 充电桩供电异常，请检查充电桩状态并重试。 <br>
         0x9: 车辆放电系统故障，请重试或联系经销商。 <br>
         0xA: 充电设备功率不足，无法开启电池加热 <br>
         0xB: 充电设备功率不足，无法开启电池保温 <br>
         0xC: 车辆低于放电截止SOC，放电停止 <br>
         0xD: 车辆准备OTA，充电停止； <br>
         0xE~0x2D: 预留 <br>
         0x2E: 充电桩停止充电； <br>
         0x2F~0xFF: 预留 <p>
     */
        public static final int BMS_CHRGDCHASTOPREASONPROMT_51B = 557847542;

    /**
     * ICC_NUMTRFCLMP_61F <p>
     * <br>
     * Function Describe: 全程红绿灯数量 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_NUMTRFCLMP_61F = 557847592;

    /**
     * ICC_NXTCHGTYPE_61F <p>
     * <br>
     * Function Describe: 途中下一个充电桩类别 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 非充电桩 <br>
         0x1: 快充桩 <br>
         0x2: 慢充桩 <br>
         0x3: 无法识别充电桩类别 <br>
         0x4~0x7: Reserved <p>
     */
        public static final int ICC_NXTCHGTYPE_61F = 557847595;

    /**
     * ICC_MAPSTS_61F <p>
     * <br>
     * Function Describe: 导航状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 待机 <br>
         0x1: 设置导航 <br>
         0x2: 开始导航 <br>
         0x3: 结束导航 <br>
         0x4: 偏离导航 <br>
         0x5: 选桩计算 <br>
         0x6~0xF: Reserved <p>
     */
        public static final int ICC_MAPSTS_61F = 557847596;

    /**
     * ICC_FULLROADTRFCINFO_SEG_602 <p>
     * <br>
     * Function Describe: 全程路况信息（分为几段） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_FULLROADTRFCINFO_SEG_602 = 557847602;

    /**
     * ICC_FULLROADTRFCINFO_NUM_602 <p>
     * <br>
     * Function Describe: 全程路况信息（编号） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_FULLROADTRFCINFO_NUM_602 = 557847603;

    /**
     * ICC_FULLROADTRFCINFO_LEN_602 <p>
     * <br>
     * Function Describe: 全程路况信息_长度 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_FULLROADTRFCINFO_LEN_602 = 557847604;

    /**
     * ICC_FULLROADTRFCINFO_TI_602 <p>
     * <br>
     * Function Describe: 全程路况信息_时间 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_FULLROADTRFCINFO_TI_602 = 557847605;

    /**
     * ICC_FULLROADTRFCINFO_STS_602 <p>
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
         0x6~0x9: reserve <br>
         0xA: ⾏驶过的路段（灰⾊） <br>
         0xB~0xF: reserve <p>
     */
        public static final int ICC_FULLROADTRFCINFO_STS_602 = 557847606;

    /**
     * ICC_TURNICON_620 <p>
     * <br>
     * Function Describe: 转向图标 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_TURNICON_620 = 557847611;

    /**
     * ICC_CRTROADTRFCINFO_NUM_620 <p>
     * <br>
     * Function Describe: 当前路况状态-编号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_CRTROADTRFCINFO_NUM_620 = 557847612;

    /**
     * ICC_CRTROADTRFCINFO_MILG_620 <p>
     * <br>
     * Function Describe: 当前路况状态-里程 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_CRTROADTRFCINFO_MILG_620 = 557847613;

    /**
     * ICC_CRTROADTRFCINFO_TI_620 <p>
     * <br>
     * Function Describe: 当前路况状态-时间 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_CRTROADTRFCINFO_TI_620 = 557847614;

    /**
     * ICC_CRTROADTRFCINFO_STS_620 <p>
     * <br>
     * Function Describe: 当前路况状态-道路状况 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_CRTROADTRFCINFO_STS_620 = 557847615;

    /**
     * ICC_ESTIMTSOCPERC_60E <p>
     * <br>
     * Function Describe: 预计剩余电量百分比 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_ESTIMTSOCPERC_60E = 557847656;

    /**
     * ICC_ESTIMTREMSOC_60E <p>
     * <br>
     * Function Describe: 预计剩余能量 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_ESTIMTREMSOC_60E = 557847657;

    /**
     * ICC_RNG2NXTCHGTIME_64F <p>
     * <br>
     * Function Describe: 车辆到达下一充电桩/目的地的时间 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_RNG2NXTCHGTIME_64F = 557847662;

    /**
     * ICC_RNG2NXTCHGMILE_64F <p>
     * <br>
     * Function Describe: 车辆到达下一充电桩/目的地的里程 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_RNG2NXTCHGMILE_64F = 557847663;

    /**
     * ICC_TOTLMILERNG_61D <p>
     * <br>
     * Function Describe: 全程总计行驶里程 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_TOTLMILERNG_61D = 557847696;

    /**
     * ICC_TOTLTIMERNG_61D <p>
     * <br>
     * Function Describe: 全程总计行驶时间 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_TOTLTIMERNG_61D = 557847697;

    /**
     * SLC_CRTCOLORR_337 <p>
     * <br>
     * Function Describe: 氛围灯当前颜色R值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int SLC_CRTCOLORR_337 = 557847702;

    /**
     * SLC_CRTCOLORG_337 <p>
     * <br>
     * Function Describe: 氛围灯当前颜色G值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int SLC_CRTCOLORG_337 = 557847703;

    /**
     * SLC_CRTCOLORB_337 <p>
     * <br>
     * Function Describe: 氛围灯当前颜色B值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int SLC_CRTCOLORB_337 = 557847704;

    /**
     * SLC_CRTBRI_337 <p>
     * <br>
     * Function Describe: 氛围灯当前亮度 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Level 1 <br>
         0x1: Level 2 <br>
         0x2: Level 3 <br>
         0x3: Level 4 <br>
         0x4: Level 5 <br>
         0x5: Level 6 <br>
         0x6: Level 7 <br>
         0x7: Level 8 <br>
         0x8: Level 9 <br>
         0x9: Level 10 <br>
         0xA~0xF: Reserved <p>
     */
        public static final int SLC_CRTBRI_337 = 557847705;

    /**
     * SLC_ALCCSTMSTS_337 <p>
     * <br>
     * Function Describe: 氛围灯自定义模式状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: On <br>
         0x2: Off <br>
         0x3: Invalid <p>
     */
        public static final int SLC_ALCCSTMSTS_337 = 557847707;

    /**
     * SLC_COURTESYFCTMODSTS_3EC <p>
     * <br>
     * Function Describe: SLC Courtesy Function mode status <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: off <br>
         0x1: on <br>
         0x2: Invalid <br>
         0x3: Reserved <p>
     */
        public static final int SLC_COURTESYFCTMODSTS_3EC = 557847710;

    /**
     * SLC_MUSICRHYTHMSTS_3EC <p>
     * <br>
     * Function Describe: SLC Music Rhythm status <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: off <br>
         0x1: on <br>
         0x2: Invalid <br>
         0x3: Reserved <p>
     */
        public static final int SLC_MUSICRHYTHMSTS_3EC = 557847711;

    /**
     * SLC_BRIBREATHSTS_3EC <p>
     * <br>
     * Function Describe: SLC Brightness Breath status(单色亮度呼吸模式开关反馈) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: off <br>
         0x1: on <br>
         0x2: Invalid <br>
         0x3: Reserved <p>
     */
        public static final int SLC_BRIBREATHSTS_3EC = 557847712;

    /**
     * SLC_VEHSPDRHYTHMSTS_3EC <p>
     * <br>
     * Function Describe: SLC Vehicle speed Rhythm status(车速律动模式反馈信号) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: off <br>
         0x1: on <br>
         0x2: Invalid <br>
         0x3: Reserved <p>
     */
        public static final int SLC_VEHSPDRHYTHMSTS_3EC = 557847714;

    /**
     * SLC_DRVMDSTS_3EC <p>
     * <br>
     * Function Describe: SLC Driver Mode Relevance status(开门提醒) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: off <br>
         0x1: on <br>
         0x2: Invalid <br>
         0x3: Reserved <p>
     */
        public static final int SLC_DRVMDSTS_3EC = 557847715;

    /**
     * SLC_ACMODSTS_3EC <p>
     * <br>
     * Function Describe: 氛围灯制冷制热模式开关状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: off <br>
         0x1: on <br>
         0x2: Invalid <br>
         0x3: Reserved <p>
     */
        public static final int SLC_ACMODSTS_3EC = 557847716;

    /**
     * SLC_DOWSTS_3EC <p>
     * <br>
     * Function Describe: 开门后方来车状态提醒 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: off <br>
         0x1: on <br>
         0x2: Invalid <br>
         0x3: Reserved <p>
     */
        public static final int SLC_DOWSTS_3EC = 557847717;

    /**
     * SLC_BRI_3EC <p>
     * <br>
     * Function Describe: SLC Brightness(氛围灯手动亮度调节反馈信号) <p>
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
         0xB: OFF <br>
         0xC~0xE: Reserved <br>
         0xF: Invalid <p>
     */
        public static final int SLC_BRI_3EC = 557847718;

    /**
     * SLC_COLOURBREATHSTS2_3EC <p>
     * <br>
     * Function Describe: SLC Colour Breath status2(色彩呼吸模式反馈信号) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: off <br>
         0x1: on <br>
         0x2: Invalid <br>
         0x3: Reserved <p>
     */
        public static final int SLC_COLOURBREATHSTS2_3EC = 557847719;

    /**
     * SLC_ALCSPCHSTS_3EC <p>
     * <br>
     * Function Describe: 精灵灯光状态信号(智慧语音) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: off <br>
         0x1: on <br>
         0x2: Invalid <br>
         0x3: Reserved <p>
     */
        public static final int SLC_ALCSPCHSTS_3EC = 557847721;

    /**
     * SLC_ALCMOBCHAREMDSTS_3EC <p>
     * <br>
     * Function Describe: 手机充电联动氛围灯状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: off <br>
         0x1: on <br>
         0x2: Invalid <br>
         0x3: Reserved <p>
     */
        public static final int SLC_ALCMOBCHAREMDSTS_3EC = 557847722;

    /**
     * SLC_LOGOLIGSTS_3EC <p>
     * <br>
     * Function Describe: LOGO灯开关状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: off <br>
         0x1: on <br>
         0x2: Invalid <br>
         0x3: Reserved <p>
     */
        public static final int SLC_LOGOLIGSTS_3EC = 557847723;

    /**
     * SLC_CONTRASTCOLORSTS1_3EC <p>
     * <br>
     * Function Describe: 氛围灯撞色开关1状态-虚拟霓虹 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: off <br>
         0x1: on <br>
         0x2: Invalid <br>
         0x3: Reserved <p>
     */
        public static final int SLC_CONTRASTCOLORSTS1_3EC = 557847724;

    /**
     * SLC_CONTRASTCOLORSTS2_3EC <p>
     * <br>
     * Function Describe: 氛围灯撞色开关2状态-极速电拧 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: off <br>
         0x1: on <br>
         0x2: Invalid <br>
         0x3: Reserved <p>
     */
        public static final int SLC_CONTRASTCOLORSTS2_3EC = 557847725;

    /**
     * SLC_CONTRASTCOLORSTS3_3EC <p>
     * <br>
     * Function Describe: 氛围灯撞色开关3状态-星际引擎 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: off <br>
         0x1: on <br>
         0x2: Invalid <br>
         0x3: Reserved <p>
     */
        public static final int SLC_CONTRASTCOLORSTS3_3EC = 557847726;

    /**
     * ICC_LIGHTCRLSTSFB_320 <p>
     * <br>
     * Function Describe: 灯光控制指令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: Auto <br>
         0x2: Position <br>
         0x3: Low Beam <br>
         0x4~0x7: Reserved <p>
     */
        public static final int ICC_LIGHTCRLSTSFB_320 = 557847775;

    /**
     * ICC_REFOGLAMPOUTPCMD_320 <p>
     * <br>
     * Function Describe: 后雾灯输出命令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: On <p>
     */
        public static final int ICC_REFOGLAMPOUTPCMD_320 = 557847776;

    /**
     * ICM_MILGOFFS_ODO_532 <p>
     * <br>
     * Function Describe: 里程偏移量 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICM_MILGOFFS_ODO_532 = 557847780;

    /**
     * ICM_DISPTOTMILG_ODO_532 <p>
     * <br>
     * Function Describe: 显示总里程 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICM_DISPTOTMILG_ODO_532 = 557847781;

    /**
     * ICM_MILGDATAVLD_ODO_532 <p>
     * <br>
     * Function Describe: 里程有效信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Value OK <br>
         0x1: Value Unreliable <p>
     */
        public static final int ICM_MILGDATAVLD_ODO_532 = 557847782;

    /**
     * ICM_MILGRSTCNTR_ODO_532 <p>
     * <br>
     * Function Describe: 里程清零次数 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 不清除 <br>
         0x1: 清除1次 <br>
         0x2: 清除2次 <br>
         0x3: 清除3次 <p>
     */
        public static final int ICM_MILGRSTCNTR_ODO_532 = 557847783;

    /**
     * ICC_CTRL_CMD_532 <p>
     * <br>
     * Function Describe: 遮阳帘触控开关信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Auto Open Sunshade <br>
         0x2: Auto Close Sunshade <br>
         0x3: MANAUAL open Sunshade <br>
         0x4: MANAUAL close Sunshade <br>
         0x5: Reserved <p>
     */
        public static final int ICC_CTRL_CMD_532 = 557847784;

    /**
     * ICC_OPENPERCCMD_532 <p>
     * <br>
     * Function Describe: 语音信号（开/关遮阳帘） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive  <br>
        0x1~0x65: 0%~100% <br>
        0x66: stop <br>
        0x67~0x7E: Reserved <p>
     */
        public static final int ICC_OPENPERCCMD_532 = 557847785;

    /**
     * EHU_RESVACCHRGSTRTTI_HR_614 <p>
     * <br>
     * Function Describe: 中控预约交流充电开启时间(时) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int EHU_RESVACCHRGSTRTTI_HR_614 = 557847849;

    /**
     * EHU_RESVACCHRGSTRTTI_MINS_614 <p>
     * <br>
     * Function Describe: 中控预约交流充电开启时间(分) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int EHU_RESVACCHRGSTRTTI_MINS_614 = 557847850;

    /**
     * EHU_RESVACCHRGSTRTSET_614 <p>
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
        public static final int EHU_RESVACCHRGSTRTSET_614 = 557847851;

    /**
     * EHU_MONRESVACCHRGREPSTRTSET_614 <p>
     * <br>
     * Function Describe: 周一预约交流充电重复开启设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 不重复 <br>
         0x1: 重复 <p>
     */
        public static final int EHU_MONRESVACCHRGREPSTRTSET_614 = 557847852;

    /**
     * EHU_RESVACCHRGENDTI_HR_614 <p>
     * <br>
     * Function Describe: 中控预约交流充电结束时间(时) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int EHU_RESVACCHRGENDTI_HR_614 = 557847859;

    /**
     * EHU_RESVACCHRGENDTI_MINS_614 <p>
     * <br>
     * Function Describe: 中控预约交流充电结束时间(分) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int EHU_RESVACCHRGENDTI_MINS_614 = 557847860;

    /**
     * EHU_RESVACCHRGENDSET_614 <p>
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
        public static final int EHU_RESVACCHRGENDSET_614 = 557847861;

    /**
     * EHU_MONRESVACCHRGREPENDSET_614 <p>
     * <br>
     * Function Describe: 周一预约交流充电重复结束设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 不重复 <br>
         0x1: 重复 <p>
     */
        public static final int EHU_MONRESVACCHRGREPENDSET_614 = 557847862;

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
        public static final int VCU_REFRSHMODRESTRNTFCTCMD_357 = 557847875;

    /**
     * RESETFLG_TRIPFROMLASTCHARGE_AB_3BD <p>
     * <br>
     * Function Describe: 自上次充电后行程重置标志位 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 重置 <p>
     */
        public static final int RESETFLG_TRIPFROMLASTCHARGE_AB_3BD = 557847876;

    /**
     * VCU_REMPWRBATTHEATGENDCMD_511 <p>
     * <br>
     * Function Describe: 远程动力电池加热结束指令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 未结束 <br>
         0x1: 结束 <p>
     */
        public static final int VCU_REMPWRBATTHEATGENDCMD_511 = 557847878;

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
         0x3: 车辆充电中，不需要远程加热 <br>
         0x4: 整车故障 <br>
         0x5: 温度满足要求，不需要远程加热 <br>
         0x6: 整车正在更新软件，无法开启加热 <br>
         0x7: Void <p>
     */
        public static final int VCU_REMBATTHEATGFAILREASON_511 = 557847879;

    /**
     * VCU_PETSMODFOBDREASON_511 <p>
     * <br>
     * Function Describe: 宠物模式禁止原因 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 车辆充电预加热中，宠物模式禁止开启 <br>
         0x2: SOC低于20%，宠物模式禁止开启 <br>
         0x3: 整车故障，宠物模式禁止开启 <br>
         0x4: 车辆未在P挡，宠物模式禁止开启 <br>
         0x5: 热管理故障，宠物模式禁止开启 <br>
         0x6: 空调开启超时，宠物模式禁止开启 <br>
         0x7: 预留 <p>
     */
        public static final int VCU_PETSMODFOBDREASON_511 = 557847880;

    /**
     * VCU_PETSMODWARN_511 <p>
     * <br>
     * Function Describe: 宠物模式提醒告警 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 开启提醒 <br>
         0x2: 定时提醒 <br>
         0x3: 低值提醒 <br>
         0x4: 极低告警 <br>
         0x5: 温度无法保持告警 <br>
         0x6: 整车禁止上高压故障 <br>
         0x7: 退出提醒 <br>
         0x8: 车窗未完全关闭提醒 <br>
         0x9~0xF: 预留 <p>
     */
        public static final int VCU_PETSMODWARN_511 = 557847881;

    /**
     * VCU_VEHCRTCHRGENDSOC_511 <p>
     * <br>
     * Function Describe: 车辆当前充电截止SOC值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_VEHCRTCHRGENDSOC_511 = 557847883;

    /**
     * ECC_INSDT_582 <p>
     * <br>
     * Function Describe: 车内温度 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0xFF: Invalid <p>
     */
        public static final int ECC_INSDT_582 = 557847885;

    /**
     * ECC_PARTICLECONC_582 <p>
     * <br>
     * Function Describe: 颗粒物浓度 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int ECC_PARTICLECONC_582 = 557847886;

    /**
     * VCU_ALRMLAMP_FS_105 <p>
     * <br>
     * Function Describe: 报警灯_VCU(功能安全) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 灯灭 <br>
         0x1: 灯亮 <p>
     */
        public static final int VCU_ALRMLAMP_FS_105 = 557847895;

    /**
     * VCU_CRUISEFLTTIP_105 <p>
     * <br>
     * Function Describe: 定速巡航故障提示 <p>
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
         0x7~0x8: 预留 <p>
     */
        public static final int VCU_CRUISEFLTTIP_105 = 557847896;

    /**
     * VCU_DRVMODEXTNSIG_105 <p>
     * <br>
     * Function Describe: 驾驶模式扩展信号 <p>
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
         0x7: E-Pedal模式 <br>
         0x8~0xA: Reserved <br>
         0xB: 极致节能模式 <br>
         0xC~0xF: Reserved <p>
     */
        public static final int VCU_DRVMODEXTNSIG_105 = 557847897;

    /**
     * VCU_CRUISESTS_105 <p>
     * <br>
     * Function Describe: 定速巡航状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 关闭 <br>
         0x1: 开启 <br>
         0x2: 激活 <br>
         0x3: Voild <p>
     */
        public static final int VCU_CRUISESTS_105 = 557847898;

    /**
     * VCU_CRUISEAIMSPD_105 <p>
     * <br>
     * Function Describe: 定速巡航目标车速 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_CRUISEAIMSPD_105 = 557847899;

    /**
     * VCU_DRVPWRLIMPERC_503 <p>
     * <br>
     * Function Describe: 驱动功率限值百分比 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_DRVPWRLIMPERC_503 = 557847900;

    /**
     * VCU_EGYFBPWRLIMPERC_503 <p>
     * <br>
     * Function Describe: 能量回馈功率限值百分比 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_EGYFBPWRLIMPERC_503 = 557847901;

    /**
     * VCU_MEMCHRGRMNMILGTHD_503 <p>
     * <br>
     * Function Describe: 记忆充电提醒里程阈值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_MEMCHRGRMNMILGTHD_503 = 557847902;

    /**
     * VCU_USRHMIPROMT_503 <p>
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
        public static final int VCU_USRHMIPROMT_503 = 557847908;

    /**
     * VCU_RESVCHRGSTSDISP_503 <p>
     * <br>
     * Function Describe: 充电预约状态（显示） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 预约充电 <br>
         0x2: 定时出发 <br>
         0x3: Reserved <p>
     */
        public static final int VCU_RESVCHRGSTSDISP_503 = 557847909;

    /**
     * VCU_INSNTEGYCNSEHR_503 <p>
     * <br>
     * Function Describe: 瞬时能耗(小时能耗) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_INSNTEGYCNSEHR_503 = 557847910;

    /**
     * VCU_MONRPWRBATTTHERMRUNAWAYALRM_504 <p>
     * <br>
     * Function Describe: VCU监控动力电池热失控预警_P134C00_E03 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 正常 <br>
         0x1: 报警 <p>
     */
        public static final int VCU_MONRPWRBATTTHERMRUNAWAYALRM_504 = 557847911;

    /**
     * VCU_LNCHCTRLTRIGRMN_504 <p>
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
        public static final int VCU_LNCHCTRLTRIGRMN_504 = 557847912;

    /**
     * VCU_SHIFTOPERRMN_504 <p>
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
        public static final int VCU_SHIFTOPERRMN_504 = 557847913;

    /**
     * VCU_MCUFSYSOVERTDISP_504 <p>
     * <br>
     * Function Describe: MCUF系统过热显示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 正常 <br>
         0x1: 异常 <p>
     */
        public static final int VCU_MCUFSYSOVERTDISP_504 = 557847916;

    /**
     * VCU_MCURSYSOVERTDISP_504 <p>
     * <br>
     * Function Describe: MCUR系统过热显示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 正常 <br>
         0x1: 异常 <p>
     */
        public static final int VCU_MCURSYSOVERTDISP_504 = 557847917;

    /**
     * VCU_VEHSYSFLTLAMP_504 <p>
     * <br>
     * Function Describe: 整车系统故障灯 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 正常 灯灭 <br>
         0x1: 异常 点亮 <br>
         0x2~0x3: Reserved <p>
     */
        public static final int VCU_VEHSYSFLTLAMP_504 = 557847918;

    /**
     * VCU_RMNUSRCLSECCDISPCMD_504 <p>
     * <br>
     * Function Describe: 提醒用户关闭空调显示指令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 不显示 <br>
         0x1: 显示 <p>
     */
        public static final int VCU_RMNUSRCLSECCDISPCMD_504 = 557847919;

    /**
     * VCU_RMNUSRECCFCTLMTDISPCMD_504 <p>
     * <br>
     * Function Describe: 提醒用户空调功能受限显示指令 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 不显示 <br>
         0x1: 显示 <p>
     */
        public static final int VCU_RMNUSRECCFCTLMTDISPCMD_504 = 557847920;

    /**
     * VCU_LNCHCTRLMODDIRMN_504 <p>
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
        public static final int VCU_LNCHCTRLMODDIRMN_504 = 557847921;

    /**
     * VCU_DRVRNGVLD_504 <p>
     * <br>
     * Function Describe: 续驶里程有效位_S000002_E00 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Initializing <br>
         0x1: Valid <br>
         0x2: Invalid <br>
         0x3: Reserved <p>
     */
        public static final int VCU_DRVRNGVLD_504 = 557847924;

    /**
     * VCU_SUBTOLEGYCNSE_AS_3B8 <p>
     * <br>
     * Function Describe: 小计能耗 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_SUBTOLEGYCNSE_AS_3B8 = 557847926;

    /**
     * VCU_ACCUEEGYCNSE_505 <p>
     * <br>
     * Function Describe: 累计能耗 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_ACCUEEGYCNSE_505 = 557847928;

    /**
     * VCU_EGYRECOVFORBNFLG_505 <p>
     * <br>
     * Function Describe: 能量回收功能禁止标志位 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 允许能量回收 <br>
         0x1: 禁止能量回收 <p>
     */
        public static final int VCU_EGYRECOVFORBNFLG_505 = 557847929;

    /**
     * VCU_DRVPWRLIMINDCRLAMP_505 <p>
     * <br>
     * Function Describe: 驱动功率限制指示灯 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 灯灭 <br>
         0x1: 灯亮 <p>
     */
        public static final int VCU_DRVPWRLIMINDCRLAMP_505 = 557847930;

    /**
     * VCU_BATTFLTINDCN_505 <p>
     * <br>
     * Function Describe: 蓄电池故障显示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 正常 <br>
         0x1: 异常 <p>
     */
        public static final int VCU_BATTFLTINDCN_505 = 557847933;

    /**
     * VCU_CHRGINDCRLAMP_505 <p>
     * <br>
     * Function Describe: 充电提醒及充电状态指示灯 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 灯灭 <br>
         0x1: 灯亮 <p>
     */
        public static final int VCU_CHRGINDCRLAMP_505 = 557847934;

    /**
     * VCU_CHRGDCHAGUNCNCTNINDCRLAMP_505 <p>
     * <br>
     * Function Describe: 充放电枪连接指示灯 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 灯灭 <br>
         0x1: 灯亮 <p>
     */
        public static final int VCU_CHRGDCHAGUNCNCTNINDCRLAMP_505 = 557847936;

    /**
     * VCU_CHRGGUNSTRT_505 <p>
     * <br>
     * Function Describe: 请拔充电枪启动 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 无显示 <br>
         0x1: 文字显示 <p>
     */
        public static final int VCU_CHRGGUNSTRT_505 = 557847938;

    /**
     * VCU_SOCLOCHRGRMN_50C <p>
     * <br>
     * Function Describe: 电量低充电提醒 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 无需求 <br>
        0x1: 电量低充电提醒 <br>
        0x2: 低温电量低充电提醒 <br>
        0x3: 动力电池电量低，请上READY <br>
        0x4: 动力电池电量过低，整车下高压 <br>
        0x5~0x7: 预留 <p>
     */
        public static final int VCU_SOCLOCHRGRMN_50C = 557847942;

    /**
     * VCU_DRVGMILGDISPTYPCFM_50C <p>
     * <br>
     * Function Describe: 续驶里程显示类型确认 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 标准续航 <br>
         0x1: 动态续航 <p>
     */
        public static final int VCU_DRVGMILGDISPTYPCFM_50C = 557847943;

    /**
     * BMS_ALRMLAMP_FS_215 <p>
     * <br>
     * Function Describe: 报警灯_BMS(功能安全) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 正常 <br>
         0x1: 异常 <p>
     */
        public static final int BMS_ALRMLAMP_FS_215 = 557847950;

    /**
     * BMS_CHRGCRATEDISP_240 <p>
     * <br>
     * Function Describe: 充电倍率显示需求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int BMS_CHRGCRATEDISP_240 = 557847954;

    /**
     * BMS_PWRBATTAVLEGY_580 <p>
     * <br>
     * Function Describe: 动力电池可用能量 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0xFFFF: Invalid <p>
     */
        public static final int BMS_PWRBATTAVLEGY_580 = 557847957;

    /**
     * BMS_FBREMHEATGOPERSTS_363 <p>
     * <br>
     * Function Describe: BMS反馈远程加热工作状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始化 <br>
         0x1: 远程加热中 <p>
     */
        public static final int BMS_FBREMHEATGOPERSTS_363 = 557847960;

    /**
     * BMS_VEHEXTDCHASTS_363 <p>
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
         0x5~0x6: Reserved <br>
         0x7: Invalid <p>
     */
        public static final int BMS_VEHEXTDCHASTS_363 = 557847961;

    /**
     * BMS_CHRGINSULFCTOPENSTS_363 <p>
     * <br>
     * Function Describe: 充电保温功能开启状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 保温功能关闭 <br>
         0x1: 保温功能开启 <p>
     */
        public static final int BMS_CHRGINSULFCTOPENSTS_363 = 557847964;

    /**
     * APA_FMEBSTS_2A0 <p>
     * <br>
     * Function Describe: 前低速辅助制动系统状态信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: OFF <br>
         0x1: Inactive <br>
         0x2: Ready <br>
         0x3: PreFill <br>
         0x4: AEB Active <br>
         0x5: Standstill <br>
         0x6: Secure <br>
         0x7: Finished With Override <br>
         0x8: Finished Without Override <br>
         0x9: Error <br>
         0xA~0xF: Reserved <p>
     */
        public static final int APA_FMEBSTS_2A0 = 557847989;

    /**
     * APA_RMEBSTS_2A0 <p>
     * <br>
     * Function Describe: 后低速辅助制动系统状态信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: Inactive <br>
         0x2: Ready <br>
         0x3: PreFill <br>
         0x4: AEB Active <br>
         0x5: Standstill <br>
         0x6: Secure <br>
         0x7: Finished With Override <br>
         0x8: Finished Without Override <br>
         0x9: Error <br>
         0xA~0xF: Reserved <p>
     */
        public static final int APA_RMEBSTS_2A0 = 557847991;

    /**
     * APA_STS_FPAS_558 <p>
     * <br>
     * Function Describe: 前泊车雷达工作模式Front Parking Assistant System Status. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Disable <br>
         0x1: Enable <br>
         0x2: Active <br>
         0x3: Failed <p>
     */
        public static final int APA_STS_FPAS_558 = 557848016;

    /**
     * APA_STS_RPAS_558 <p>
     * <br>
     * Function Describe: 后泊车雷达工作模式Rear Parking Assistant System Status. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Disable <br>
         0x1: Enable <br>
         0x2: Active <br>
         0x3: Failed <p>
     */
        public static final int APA_STS_RPAS_558 = 557848019;

    /**
     * ESP_FLTINDCN_HHC_332 <p>
     * <br>
     * Function Describe: HHC故障指示indicating HHC is available or not. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Available <br>
         0x1: Not Available <p>
     */
        public static final int ESP_FLTINDCN_HHC_332 = 557848099;

    /**
     * ESP_ACTVINDCN_AVH_332 <p>
     * <br>
     * Function Describe: 指示AVH是否激活indicates AVH in active or not. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Not Active <br>
         0x1: Active <p>
     */
        public static final int ESP_ACTVINDCN_AVH_332 = 557848100;

    /**
     * ESP_SWTINDCN_AVH_332 <p>
     * <br>
     * Function Describe: AVH开启指示AVH switch on without fault=standby. indicates AVH in standby mode or not. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Not standby <br>
         0x1: standby <p>
     */
        public static final int ESP_SWTINDCN_AVH_332 = 557848101;

    /**
     * ESP_FLTINDCN_AVH_332 <p>
     * <br>
     * Function Describe: AVH故障指示indicating AVH is available or not. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Available <br>
         0x1: Not Available <p>
     */
        public static final int ESP_FLTINDCN_AVH_332 = 557848102;

    /**
     * EPS_FLTINDCN_470 <p>
     * <br>
     * Function Describe: EPS故障显示EPS Fault indication. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 正常 <br>
         0x1: 故障状态 <p>
     */
        public static final int EPS_FLTINDCN_470 = 557848106;

    /**
     * BCM_RLS_LIGHTSWTREQ_321 <p>
     * <br>
     * Function Describe: 自动灯光开启请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 开灯请求 <br>
         0x2: 关灯请求 <br>
         0x3: 无效值 <p>
     */
        public static final int BCM_RLS_LIGHTSWTREQ_321 = 557848107;

    /**
     * BCM_SWH_STEERWHLHEATGSTS_321 <p>
     * <br>
     * Function Describe: 方向盘加热状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: On <br>
         0x2: Invalid <br>
         0x3: Reserved <p>
     */
        public static final int BCM_SWH_STEERWHLHEATGSTS_321 = 557848108;

    /**
     * BCM_TIMEOUTPOWER_OFFFEEDBACK_321 <p>
     * <br>
     * Function Describe: 超时下电状态反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 正常计时下电 <br>
         0x2: 不进行计时下电 <br>
         0x3: Reserved <p>
     */
        public static final int BCM_TIMEOUTPOWER_OFFFEEDBACK_321 = 557848109;

    /**
     * BCM_LIGHTREQREASON_RLS_321 <p>
     * <br>
     * Function Describe: 雨量光传感器开灯请求原因Light switch reason  <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Day 日间 <br>
         0x1: Twilight 黄昏黎明 <br>
         0x2: Night /夜晚 <br>
         0x4: Rainlight-light switch due to rain 下雨开灯 <br>
         0x5: Twilight and rainlight 黎明黄昏与下雨 <br>
         0x6: Night and rainlight 夜间与下雨 <br>
         0x8: Tunnel /隧道 <br>
         0x9: Tunnel and Twilight/隧道与黄昏黎明 <br>
         0xC: Tunnel and rainlight 隧道与下雨 <br>
         0xD: Tunnel and rainlight and Twilight隧道与下雨与黄昏黎明 <br>
         0x10: Underground car park 驶出地下车库 <br>
         0x14: Underground car park_garage and rainlight 驶出地下车库与下雨 <p>
     */
        public static final int BCM_LIGHTREQREASON_RLS_321 = 557848115;

    /**
     * BCM_OFFUNLCKSETSTSFB_321 <p>
     * <br>
     * Function Describe: 下电自动解锁设置状态反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 四门解锁模式 <br>
         0x1: 单门解锁模式 <br>
         0x2: 功能关闭 <br>
         0x3: 预留 <p>
     */
        public static final int BCM_OFFUNLCKSETSTSFB_321 = 557848116;

    /**
     * BCM_SUNSHADERUNNGSTS_345 <p>
     * <br>
     * Function Describe: 遮阳帘运行状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Stopped <br>
         0x1: Opening Slide <br>
         0x2: Closing Slide <br>
         0x3: Reversing (AP/Stall) <br>
         0x4: Moving Uninitialized <br>
         0x5~0x7: Reserved <p>
     */
        public static final int BCM_SUNSHADERUNNGSTS_345 = 557848120;

    /**
     * BCM_SUNSHADEPOSNINFO_345 <p>
     * <br>
     * Function Describe: 遮阳帘开度信息 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int BCM_SUNSHADEPOSNINFO_345 = 557848121;

    /**
     * BCM_LEPOSNLAMPFLT_539 <p>
     * <br>
     * Function Describe: 左位置灯故障 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Not Failed <br>
         0x1: Failed <p>
     */
        public static final int BCM_LEPOSNLAMPFLT_539 = 557848122;

    /**
     * BCM_RIPOSNLAMPFLT_539 <p>
     * <br>
     * Function Describe: 右位置灯故障 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Not Failed <br>
         0x1: Failed <p>
     */
        public static final int BCM_RIPOSNLAMPFLT_539 = 557848123;

    /**
     * BCM_LELOBEAMFLT_539 <p>
     * <br>
     * Function Describe: 左近光灯故障 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Not Failed <br>
         0x1: Failed <p>
     */
        public static final int BCM_LELOBEAMFLT_539 = 557848124;

    /**
     * BCM_RILOBEAMFLT_539 <p>
     * <br>
     * Function Describe: 右近光灯故障 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Not Failed <br>
         0x1: Failed <p>
     */
        public static final int BCM_RILOBEAMFLT_539 = 557848125;

    /**
     * BCM_LEHIBEAMFLT_539 <p>
     * <br>
     * Function Describe: 左远光灯故障 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Not Failed <br>
         0x1: Failed <p>
     */
        public static final int BCM_LEHIBEAMFLT_539 = 557848126;

    /**
     * BCM_RIHIBEAMFLT_539 <p>
     * <br>
     * Function Describe: 右远光灯故障 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Not Failed <br>
         0x1: Failed <p>
     */
        public static final int BCM_RIHIBEAMFLT_539 = 557848127;

    /**
     * BCM_LEDRLFLT_539 <p>
     * <br>
     * Function Describe: 左日间行车灯故障 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Not Failed <br>
         0x1: Failed <p>
     */
        public static final int BCM_LEDRLFLT_539 = 557848128;

    /**
     * BCM_RIDRLFLT_539 <p>
     * <br>
     * Function Describe: 右日间行车灯故障 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Not Failed <br>
         0x1: Failed <p>
     */
        public static final int BCM_RIDRLFLT_539 = 557848129;

    /**
     * BCM_LEFRNTFOGLAMPFLT_539 <p>
     * <br>
     * Function Describe: 左前雾灯故障 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Not Failed <br>
         0x1: Failed <p>
     */
        public static final int BCM_LEFRNTFOGLAMPFLT_539 = 557848130;

    /**
     * BCM_RIFRNTFOGLAMPFLT_539 <p>
     * <br>
     * Function Describe: 右前雾灯故障 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Not Failed <br>
         0x1: Failed <p>
     */
        public static final int BCM_RIFRNTFOGLAMPFLT_539 = 557848131;

    /**
     * BCM_REFOGLAMPFLT_539 <p>
     * <br>
     * Function Describe: 后雾灯故障 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Not Failed <br>
         0x1: Failed <p>
     */
        public static final int BCM_REFOGLAMPFLT_539 = 557848132;

    /**
     * BCM_LOBRKLAMPFLT_539 <p>
     * <br>
     * Function Describe: 低位制动灯故障 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Not Failed <br>
         0x1: Failed <p>
     */
        public static final int BCM_LOBRKLAMPFLT_539 = 557848133;

    /**
     * BCM_HIBRKLAMPFLT_539 <p>
     * <br>
     * Function Describe: 高位制动灯故障 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Not Failed <br>
         0x1: Failed <p>
     */
        public static final int BCM_HIBRKLAMPFLT_539 = 557848134;

    /**
     * BCM_RVSLAMPFLT_539 <p>
     * <br>
     * Function Describe: 倒车灯故障 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Not Failed <br>
         0x1: Failed <p>
     */
        public static final int BCM_RVSLAMPFLT_539 = 557848135;

    /**
     * BCM_LETURNLAMPFLT_539 <p>
     * <br>
     * Function Describe: 左转向灯故障 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Not Failed <br>
         0x1: Failed <p>
     */
        public static final int BCM_LETURNLAMPFLT_539 = 557848136;

    /**
     * BCM_RITURNLAMPFLT_539 <p>
     * <br>
     * Function Describe: 右转向灯故障 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Not Failed <br>
         0x1: Failed <p>
     */
        public static final int BCM_RITURNLAMPFLT_539 = 557848137;

    /**
     * BCM_LICPLATELAMPFLT_539 <p>
     * <br>
     * Function Describe: 牌照灯故障 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Not Failed <br>
         0x1: Failed <p>
     */
        public static final int BCM_LICPLATELAMPFLT_539 = 557848138;

    /**
     * BCM_WINLOCKSWINPUT_539 <p>
     * <br>
     * Function Describe: 车窗锁止开关状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Error <br>
         0x1: Active <br>
         0x2: Not Active <br>
         0x3: Reserved <p>
     */
        public static final int BCM_WINLOCKSWINPUT_539 = 557848139;

    /**
     * BCM_MILGDATAVLD_ODO_641 <p>
     * <br>
     * Function Describe: 里程有效信号_BCM <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Value OK <br>
         0x1: Value Unreliable <p>
     */
        public static final int BCM_MILGDATAVLD_ODO_641 = 557848140;

    /**
     * BCM_MILGRSTCNTR_ODO_641 <p>
     * <br>
     * Function Describe: 里程清零次数_BCM <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 不清除 <br>
         0x1: 清除1次 <br>
         0x2: 清除2次 <br>
         0x3: 清除3次 <p>
     */
        public static final int BCM_MILGRSTCNTR_ODO_641 = 557848141;

    /**
     * BCM_TOTMILG_ODO_641 <p>
     * <br>
     * Function Describe: BCM总里程 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int BCM_TOTMILG_ODO_641 = 557848142;

    /**
     * BCM_MILGOFFS_ODO_641 <p>
     * <br>
     * Function Describe: 里程偏移量_BCM <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int BCM_MILGOFFS_ODO_641 = 557848143;

    /**
     * ADAS_HANDSOFFTAKEOVERREQ_32C <p>
     * <br>
     * Function Describe: 横向功能接管请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Active <p>
     */
        public static final int ADAS_HANDSOFFTAKEOVERREQ_32C = 557848158;

    /**
     * ADAS_AUDIOWARN_32C <p>
     * <br>
     * Function Describe: ADAS声音报警 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Active <p>
     */
        public static final int ADAS_AUDIOWARN_32C = 557848166;

    /**
     * ADAS_LATMTNCOLOR_32C <p>
     * <br>
     * Function Describe: 横向控制显示颜色 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off(No Display) <br>
         0x1: Passive(No Display) <br>
         0x2: Standby(White) <br>
         0x3: Active(Blue) <br>
         0x4: Fault(No Display) <br>
         0x5: 黄色变大闪烁 <br>
         0x6~0x7: Reserved <p>
     */
        public static final int ADAS_LATMTNCOLOR_32C = 557848167;

    /**
     * MPC_OVERSPDWARN_SLA_32E <p>
     * <br>
     * Function Describe: SLA超速报警 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Warning <br>
         0x1: Warning Level 1 <br>
         0x2~0x3: Reserved <p>
     */
        public static final int MPC_OVERSPDWARN_SLA_32E = 557848175;

    /**
     * MPC_SPDLIMUNIT_SLA_32E <p>
     * <br>
     * Function Describe: SLA限速值单位 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Unknown <br>
         0x1: KMH <br>
         0x2: MPH <br>
         0x3: Reserved <p>
     */
        public static final int MPC_SPDLIMUNIT_SLA_32E = 557848181;

    /**
     * MPC_SPDLIM_SLA_32E <p>
     * <br>
     * Function Describe: SLA限速值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Display <br>
         0x1: SPL 5 <br>
         0x2: SPL 10 <br>
         0x3: SPL 15 <br>
         0x4: SPL 20 <br>
         0x5: SPL 25 <br>
         0x6: SPL 30 <br>
         0x7: SPL 35 <br>
         0x8: SPL 40 <br>
         0x9: SPL 45 <br>
         0xA: SPL 50 <br>
         0xB: SPL 55 <br>
         0xC: SPL 60 <br>
         0xD: SPL 65 <br>
         0xE: SPL 70 <br>
         0xF: SPL 75 <br>
         0x10: SPL 80 <br>
         0x11: SPL 85 <br>
         0x12: SPL 90 <br>
         0x13: SPL 95 <br>
         0x14: SPL 100 <br>
         0x15: SPL 105 <br>
         0x16: SPL 110 <br>
         0x17: SPL 115 <br>
         0x18: SPL 120 <br>
         0x19~0xFD: Reserved <br>
         0xFE: Spl Cancelled <br>
         0xFF: Invalid <p>
     */
        public static final int MPC_SPDLIM_SLA_32E = 557848182;

    /**
     * ADAS_WARN_FCW_33C <p>
     * <br>
     * Function Describe: FCW报警 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Warning 无警告 <br>
         0x1: Latent Warning <br>
         0x2: Prewarning 预警告 <br>
         0x3: Acutewarning <p>
     */
        public static final int ADAS_WARN_FCW_33C = 557848183;

    /**
     * ADAS_STS_FCW_33C <p>
     * <br>
     * Function Describe: FCW状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: Passive <br>
         0x2: Standby <br>
         0x3: Active <br>
         0x4: Fault <br>
         0x5~0x7: Reserved <p>
     */
        public static final int ADAS_STS_FCW_33C = 557848185;

    /**
     * ADAS_STS_AEB_33C <p>
     * <br>
     * Function Describe: AEB状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: Passive <br>
         0x2: Standby <br>
         0x3: Active <br>
         0x4: Fault <br>
         0x5~0x7: Reserved <p>
     */
        public static final int ADAS_STS_AEB_33C = 557848186;

    /**
     * ADAS_TAKEOVERREQ_ACC_347 <p>
     * <br>
     * Function Describe: ACC接管请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No request <br>
         0x1: Request <p>
     */
        public static final int ADAS_TAKEOVERREQ_ACC_347 = 557848205;

    /**
     * ADAS_DISPSPD_ACC_347 <p>
     * <br>
     * Function Describe: ACC目标速度显示需仪表显示的ACC设定巡航车速，当驾驶员操作ACC进入active状态时，控制器选择仪表显示车速vSet为vSetDis。在ACC实际控制中，巡航车速为对应的实际车速。 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0~0xFE: 显示 <br>
         0xFF: 无显示 <p>
     */
        public static final int ADAS_DISPSPD_ACC_347 = 557848206;

    /**
     * ADAS_SPDLIM_ASL_347 <p>
     * <br>
     * Function Describe: ASL智能限速速度 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0xFF: 无显示 <p>
     */
        public static final int ADAS_SPDLIM_ASL_347 = 557848209;

    /**
     * ADAS_SPDLIMSTS_ASL_347 <p>
     * <br>
     * Function Describe: ASL智能限速状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: OFF <br>
         0x1: STANDBY <br>
         0x2: ACTIVE <br>
         0x3: OVERRIDE <br>
         0x4: REVERSIBLE_FAILURE <br>
         0x5: IREVERSIBLE_FAILURE <br>
         0x6~0x7: Reserved <p>
     */
        public static final int ADAS_SPDLIMSTS_ASL_347 = 557848210;

    /**
     * ADAS_ACC_OPERTXT_347 <p>
     * <br>
     * Function Describe: 智能巡航ACC操作文本提示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Default <br>
         0x1: 胎压异常，智能巡航无法激活 <br>
         0x2: 请松开制动后激活智能巡航 <br>
         0x3: 自动泊车中，暂无法激活智能巡航 <br>
         0x4: 前雷达超差，请稍后再试（预留） <br>
         0x5: 巡航摄像头超差，请稍后再试（预留） <br>
         0x6: 前雷达遮挡，请稍后再试（预留） <br>
         0x7: 巡航摄像头遮挡，请稍后再试（预留） <br>
         0x8: 请驾驶员接管，智能巡航即将退出 <br>
         0x9~0xFF: Reserved <p>
     */
        public static final int ADAS_ACC_OPERTXT_347 = 557848211;

    /**
     * ADAS_LELCARROW_34A <p>
     * <br>
     * Function Describe: 左变道箭头 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Display <br>
         0x1: Display Gray <br>
         0x2: Display Green <br>
         0x3: Reserved <p>
     */
        public static final int ADAS_LELCARROW_34A = 557848222;

    /**
     * ADAS_RILCARROW_34A <p>
     * <br>
     * Function Describe: 右变道箭头 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Display <br>
         0x1: Display Gray <br>
         0x2: Display Green <br>
         0x3: Reserved <p>
     */
        public static final int ADAS_RILCARROW_34A = 557848230;

    /**
     * MPC_STS_HMA_334 <p>
     * <br>
     * Function Describe: HMA状态(观测量) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: Reserved <br>
         0x2: Standby <br>
         0x3: Active <br>
         0x4: Fault <br>
         0x5~0x7: Reserved <p>
     */
        public static final int MPC_STS_HMA_334 = 557848234;

    /**
     * MPC_WARNSIGN_334 <p>
     * <br>
     * Function Describe: 警告类交通标志 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Default <br>
         0x1: 禁止临时及长时间停车(X) <br>
         0x2: 禁止停车(P) <br>
         0x3: 禁止长时间停车(\) <br>
         0x4: 停车让行 <br>
         0x5: 减速让行 <br>
         0x6: 高速公路入口 <br>
         0x7: 高速公路出口 <br>
         0x8: 单行道路 <br>
         0x9~0xA: Reserved <p>
     */
        public static final int MPC_WARNSIGN_334 = 557848237;

    /**
     * MPC_FOBDSIGN_334 <p>
     * <br>
     * Function Describe: 禁止类交通标志 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Default <br>
         0x1: 禁止左转弯 <br>
         0x2: 禁止右转弯 <br>
         0x3: 禁止调头 <br>
         0x4: 禁止驶入 <br>
         0x5: 禁止通行 <br>
         0x6: 禁止机动车驶入 <br>
         0x7~0xF: Reserved <p>
     */
        public static final int MPC_FOBDSIGN_334 = 557848238;

    /**
     * MPC_OVERTAKESIGN_334 <p>
     * <br>
     * Function Describe: 超车类交通标志 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Default <br>
         0x1: 禁止超车 <br>
         0x2: 解除禁止超车 <br>
         0x3~0x7: Reserved <p>
     */
        public static final int MPC_OVERTAKESIGN_334 = 557848239;

    /**
     * MPC_FRNTCAMBLI_334 <p>
     * <br>
     * Function Describe: 前摄像头遮挡 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Blind <br>
         0x1: Blind <br>
         0x2~0x3: Reserved <p>
     */
        public static final int MPC_FRNTCAMBLI_334 = 557848240;

    /**
     * MPC_HMASETFB_334 <p>
     * <br>
     * Function Describe: 智能远光灯辅助开关反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Default 初始值 <br>
         0x1: Switch Off 开关关闭 <br>
         0x2: Switch On 开关打开 <br>
         0x3: Fault <p>
     */
        public static final int MPC_HMASETFB_334 = 557848241;

    /**
     * MPC_FRNTCAMFLT_334 <p>
     * <br>
     * Function Describe: 前摄像头故障(ICC暂不处理) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Failure <br>
         0x1: Reversible Failure <br>
         0x2: Irrversible Failure <br>
         0x3: Reserved <p>
     */
        public static final int MPC_FRNTCAMFLT_334 = 557848242;

    /**
     * ADAS_LANECRVT_340 <p>
     * <br>
     * Function Describe: 车道曲率The radium of the ego cars lane. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x3F: Straight Lane <br>
         0x7F: No Display <p>
     */
        public static final int ADAS_LANECRVT_340 = 557848247;

    /**
     * ADAS_LELINETYP_340 <p>
     * <br>
     * Function Describe: 左车道线类型The type of the left line. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Default <br>
         0x1: Solid Lane <br>
         0x2: Dashed Lane(Alc) <br>
         0x3: Reserved <p>
     */
        public static final int ADAS_LELINETYP_340 = 557848248;

    /**
     * ADAS_RILINETYP_340 <p>
     * <br>
     * Function Describe: 右车道线类型The type of the Right line. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Default <br>
         0x1: Solid Lane <br>
         0x2: Dashed Lane(Alc) <br>
         0x3: Reserved <p>
     */
        public static final int ADAS_RILINETYP_340 = 557848249;

    /**
     * ADAS_LELINECOLOR_340 <p>
     * <br>
     * Function Describe: 左车道线颜色The color of the left line. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Gray <br>
         0x1: White <br>
         0x2: Blue(Alc) <br>
         0x3: Red <p>
     */
        public static final int ADAS_LELINECOLOR_340 = 557848250;

    /**
     * ADAS_RILINECOLOR_340 <p>
     * <br>
     * Function Describe: 右车道线颜色The color of the Right line. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Gray <br>
         0x1: White <br>
         0x2: Blue(Alc) <br>
         0x3: Red <p>
     */
        public static final int ADAS_RILINECOLOR_340 = 557848251;

    /**
     * ADAS_LELINEDST_340 <p>
     * <br>
     * Function Describe: 自车到左车道线距离indicate the y distance between the leftline and the ego car center. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x7D~0x7F: Invalid <p>
     */
        public static final int ADAS_LELINEDST_340 = 557848252;

    /**
     * ADAS_RILINEDST_340 <p>
     * <br>
     * Function Describe: 自车到右车道线距离indicate the y distance between the Rightline and the ego car center. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x7D~0x7F: Invalid <p>
     */
        public static final int ADAS_RILINEDST_340 = 557848253;

    /**
     * ADAS_LELINEFLASH_340 <p>
     * <br>
     * Function Describe: 左车道线闪烁 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Flash <br>
         0x1: Flash <br>
         0x2~0x3: Reserved <p>
     */
        public static final int ADAS_LELINEFLASH_340 = 557848254;

    /**
     * ADAS_RILINEFLASH_340 <p>
     * <br>
     * Function Describe: 右车道线闪烁 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Flash <br>
         0x1: Flash <br>
         0x2~0x3: Reserved <p>
     */
        public static final int ADAS_RILINEFLASH_340 = 557848255;

    /**
     * ADAS_INTEGTCRSSWTFB_340 <p>
     * <br>
     * Function Describe: 智能巡航系统开关反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Default 初始值 <br>
         0x1: Switch Off 开关关闭 <br>
         0x2: Switch On 开关打开 <br>
         0x3: Fault <p>
     */
        public static final int ADAS_INTEGTCRSSWTFB_340 = 557848257;

    /**
     * ADAS_FLTINDCR_340 <p>
     * <br>
     * Function Describe: ADAS故障灯指示(MRR/ADAS接收所有功能的故障、硬件遮挡和故障、发出此信号) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Default <br>
         0x1: No Fault <br>
         0x2: Fault <br>
         0x3: Dynamic Calibration Running <p>
     */
        public static final int ADAS_FLTINDCR_340 = 557848260;

    /**
     * ADAS_INTECNFLTTXT_340 <p>
     * <br>
     * Function Describe: 相关系统故障，驾驶辅助系统失效 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Default <br>
         0x1: 相关系统故障驾驶辅助系统失效 <p>
     */
        public static final int ADAS_INTECNFLTTXT_340 = 557848262;

    /**
     * ADAS_ACCICONDISP_340 <p>
     * <br>
     * Function Describe: ACC图标颜色 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Display <br>
         0x1: White <br>
         0x2: Green <br>
         0x3: Fault <br>
         0x4~0x7: Reserved <p>
     */
        public static final int ADAS_ACCICONDISP_340 = 557848263;

    /**
     * MPC_CMRR_FR_RIWARN_FCTA_243 <p>
     * <br>
     * Function Describe: FCTA右侧报警 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Warning <br>
         0x1: Warning Level 1 <br>
         0x2: Warning Level 2 <br>
         0x3: Reserved <p>
     */
        public static final int MPC_CMRR_FR_RIWARN_FCTA_243 = 557848286;

    /**
     * MPC_CMRR_FL_LEWARN_FCTA_243 <p>
     * <br>
     * Function Describe: FCTA左侧报警 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Warning <br>
         0x1: Warning Level 1 <br>
         0x2: Warning Level 2 <br>
         0x3: Reserved <p>
     */
        public static final int MPC_CMRR_FL_LEWARN_FCTA_243 = 557848290;

    /**
     * CMRR_RR_RIWARN_DOW_33A <p>
     * <br>
     * Function Describe: DOW右侧报警 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Warning <br>
         0x1: Warning Level 1 <br>
         0x2: Warning Level 2 <br>
         0x3: Reserved <p>
     */
        public static final int CMRR_RR_RIWARN_DOW_33A = 557848299;

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
        public static final int TBOX_RESVACCHRGOPENSTS_4F4 = 557848319;

    /**
     * TBOX_RESVACCHRGSTRTTI_HR_62E <p>
     * <br>
     * Function Describe: TBOX预约交流充电开启时间（时） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int TBOX_RESVACCHRGSTRTTI_HR_62E = 557848324;

    /**
     * TBOX_RESVACCHRGSTRTTI_MINS_62E <p>
     * <br>
     * Function Describe: TBOX预约交流充电开启时间（分） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int TBOX_RESVACCHRGSTRTTI_MINS_62E = 557848326;

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
        public static final int TBOX_MONRESVACCHRGREPSTRTSET_62E = 557848327;

    /**
     * TBOX_RESVACCHRGENDTI_HR_62E <p>
     * <br>
     * Function Describe: TBOX预约交流充电结束时间（时） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int TBOX_RESVACCHRGENDTI_HR_62E = 557848334;

    /**
     * TBOX_RESVACCHRGENDTI_MINS_62E <p>
     * <br>
     * Function Describe: TBOX预约交流充电结束时间（分） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int TBOX_RESVACCHRGENDTI_MINS_62E = 557848335;

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
        public static final int TBOX_RESVACCHRGENDSET_62E = 557848336;

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
        public static final int TBOX_MONRESVACCHRGREPENDSET_62E = 557848337;

    /**
     * HUD_SWT_562 <p>
     * <br>
     * Function Describe: HUD开关机反馈信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Initial <br>
         0x1: Off <br>
         0x2: On <br>
         0x3: Reserved <p>
     */
        public static final int HUD_SWT_562 = 557848344;

    /**
     * HUD_CRTSYSSTS_562 <p>
     * <br>
     * Function Describe: HUD当前系统状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Normal <br>
         0x1: Error <br>
         0x2: Preparatory <br>
         0x3: Standby <p>
     */
        public static final int HUD_CRTSYSSTS_562 = 557848345;

    /**
     * HUD_ILLADJ_562 <p>
     * <br>
     * Function Describe: HUD亮度档位值反馈信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Initial <br>
         0x1: Level1 <br>
         0x2: Level2 <br>
         0x3: Level3 <br>
         0x4: Level4 <br>
         0x5: Level5 <br>
         0x6: Level6 <br>
         0x7: Level7 <br>
         0x8: Level8 <br>
         0x9: Level9 <br>
         0xA: Level10 <br>
         0xB~0xF: Reserved <p>
     */
        public static final int HUD_ILLADJ_562 = 557848346;

    /**
     * HUD_HEIADJ_562 <p>
     * <br>
     * Function Describe: HUD高度档位值反馈信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Initial <br>
         0x1: Level1 <br>
         0x2: Level2 <br>
         0x3: Level3 <br>
         0x4: Level4 <br>
         0x5: Level5 <br>
         0x6: Level6 <br>
         0x7: Level7 <br>
         0x8: Level8 <br>
         0x9: Level9 <br>
         0xA: Level10 <br>
         0xB~0x1F: Reserved <p>
     */
        public static final int HUD_HEIADJ_562 = 557848347;

    /**
     * HUD_MODSWT_562 <p>
     * <br>
     * Function Describe: HUD主题反馈信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Initial <br>
         0x1: 全显模式 <br>
         0x2: 运动模式 <br>
         0x3: 精简模式 <p>
     */
        public static final int HUD_MODSWT_562 = 557848348;

    /**
     * HUD_SNOWMODSWTSTS_562 <p>
     * <br>
     * Function Describe: HUD色彩模式反馈信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Initial <br>
         0x1: Off <br>
         0x2: On <br>
         0x3: Reserved <p>
     */
        public static final int HUD_SNOWMODSWTSTS_562 = 557848349;

    /**
     * HUD_CRTLANGUAGE_562 <p>
     * <br>
     * Function Describe: HUD语言种类切换反馈信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Chinese <br>
         0x1: English <br>
         0x2~0x3: Reserved <p>
     */
        public static final int HUD_CRTLANGUAGE_562 = 557848350;

    /**
     * TBOX_CRTTI_DAY_62F <p>
     * <br>
     * Function Describe: 当前时间_日 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Day1 <br>
         0x1E: Day31 <p>
     */
        public static final int TBOX_CRTTI_DAY_62F = 557848351;

    /**
     * TBOX_CRTTI_HR_62F <p>
     * <br>
     * Function Describe: 当前时间_小时 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Hour 0 <br>
         0x17: Hour 23 <p>
     */
        public static final int TBOX_CRTTI_HR_62F = 557848352;

    /**
     * TBOX_CRTTI_MINS_62F <p>
     * <br>
     * Function Describe: 当前时间_分钟 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Mintue 0 <br>
         0x3B: Mintue 59 <p>
     */
        public static final int TBOX_CRTTI_MINS_62F = 557848353;

    /**
     * TBOX_CRTTI_YR_62F <p>
     * <br>
     * Function Describe: 当前时间_年 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Year 2015 <br>
         0xFF: Year2270 <p>
     */
        public static final int TBOX_CRTTI_YR_62F = 557848354;

    /**
     * TBOX_CRTTI_MTH_62F <p>
     * <br>
     * Function Describe: 当前时间_月 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: January <br>
         0xB: December <p>
     */
        public static final int TBOX_CRTTI_MTH_62F = 557848355;

    /**
     * TBOX_CRTTI_SEC_62F <p>
     * <br>
     * Function Describe: 当前时间_秒 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Second 0 <br>
         0x3B: Second 59 <p>
     */
        public static final int TBOX_CRTTI_SEC_62F = 557848356;

    /**
     * MCU_R_ALRMLAMP_FS_151 <p>
     * <br>
     * Function Describe: 报警灯_后驱动电机(功能安全) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Disable <br>
         0x1: Enable <p>
     */
        public static final int MCU_R_ALRMLAMP_FS_151 = 557848389;

    /**
     * ESM_SPOILERMODSTS_30C <p>
     * <br>
     * Function Describe: 电动尾翼运行模式状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: 保持打开 <br>
         0x2: 保持关闭 <br>
         0x3: 自动开闭 <br>
         0x4~0x7: Reserved <p>
     */
        public static final int ESM_SPOILERMODSTS_30C = 557848398;

    /**
     * ESM_SPOILERMOVEMENTSTSFB_30C <p>
     * <br>
     * Function Describe: 电动尾翼运动状态反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: inactive； <br>
         0x1: opening；打开中 <br>
         0x2: closing； 关闭中 <br>
         0x3: open；已打开 <br>
         0x4: closed；已关闭 <br>
         0x5: middle stopped 中间堵转 <br>
         0x6~0x7: Reserved <p>
     */
        public static final int ESM_SPOILERMOVEMENTSTSFB_30C = 557848400;

    /**
     * ESM_SPOILERCRLSTSFB_30C <p>
     * <br>
     * Function Describe: 大屏控制尾翼状态反馈信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: inactive <br>
         0x1: 执行成功 <br>
         0x2: 执行失败，系统故障 <br>
         0x3: 执行失败，未完成自学习 <br>
         0x4: 执行失败，电机处于热保护 <br>
         0x5: 执行失败，破冰失败 <br>
         0x6: 执行失败，防夹触发 <br>
         0x7: 执行失败，距离过近 <br>
         0x8~0xF: Reserved <p>
     */
        public static final int ESM_SPOILERCRLSTSFB_30C = 557848401;

    /**
     * ESM_SPOILERWELCOMEFUNSETSTS_30C <p>
     * <br>
     * Function Describe: 电动尾翼迎宾使能状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Enable(默认） <br>
         0x1: Disable <br>
         0x2~0x3: Reserved <p>
     */
        public static final int ESM_SPOILERWELCOMEFUNSETSTS_30C = 557848402;

    /**
     * ICC_EPSMODREQ_3C6 <p>
     * <br>
     * Function Describe: ICC EPS模式请求(转向模式) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Void <br>
         0x1: Standard request <br>
         0x2: Comfort request <br>
         0x3: Sport request <br>
         0x4~0x7: Reserved <p>
     */
        public static final int ICC_EPSMODREQ_3C6 = 557848413;

    /**
     * ICC_BRAKEEGYRECOVINTENREQ_3C6 <p>
     * <br>
     * Function Describe: ICC 能量回收强度请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1~0x65: 对应0到100% <p>
     */
        public static final int ICC_BRAKEEGYRECOVINTENREQ_3C6 = 557848414;

    /**
     * ICC_AVHSWTSIG_3C6 <p>
     * <br>
     * Function Describe: AVH开关信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No Pressed <br>
         0x1: Pressed <p>
     */
        public static final int ICC_AVHSWTSIG_3C6 = 557848415;

    /**
     * ICC_DRVGMODREQ_3C6 <p>
     * <br>
     * Function Describe: ICC驾驶模式请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
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
         0xD~0xF: Reserved <p>
     */
        public static final int ICC_DRVGMODREQ_3C6 = 557848416;

    /**
     * ICC_AFONSTS_3C6 <p>
     * <br>
     * Function Describe: 香氛开启状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No Action <br>
         0x1: On <br>
         0x2: Off <br>
         0x3: Reserved <p>
     */
        public static final int ICC_AFONSTS_3C6 = 557848417;

    /**
     * ICC_AFCHANNELSET_3C6 <p>
     * <br>
     * Function Describe: 香氛通道选择 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No Action； <br>
         0x1: Channel 1； <br>
         0x2: Channel 2； <br>
         0x3: Channel 3； <p>
     */
        public static final int ICC_AFCHANNELSET_3C6 = 557848418;

    /**
     * ICC_AFCONCENTRATION_3C6 <p>
     * <br>
     * Function Describe: 香氛出香浓度 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No Action； <br>
         0x1: Low； <br>
         0x2: mid； <br>
         0x3: High； <p>
     */
        public static final int ICC_AFCONCENTRATION_3C6 = 557848419;

    /**
     * ICC_WASHCARSWT_3C6 <p>
     * <br>
     * Function Describe: 洗车模式开关信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 开启手动洗车模式 <br>
         0x2: 开启自动洗车模式 <br>
         0x3: 关闭自动洗车模式 <br>
         0x4: 关闭洗车模式 <br>
         0x5~0xF: Reserved <p>
     */
        public static final int ICC_WASHCARSWT_3C6 = 557848420;

    /**
     * ICC_SPOILERMODSWT_3C6 <p>
     * <br>
     * Function Describe: 电动尾翼运行模式控制 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: 保持打开 <br>
         0x2: 保持关闭 <br>
         0x3: 自动开闭 <br>
         0x4~0x7: Reserved <p>
     */
        public static final int ICC_SPOILERMODSWT_3C6 = 557848421;

    /**
     * ICC_SPOILERWELCOMEFUNSWT_3C6 <p>
     * <br>
     * Function Describe: 电动尾翼迎宾使能开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive（默认） <br>
         0x1: 使能打开 <br>
         0x2: 使能关闭 <br>
         0x3: Reserved <p>
     */
        public static final int ICC_SPOILERWELCOMEFUNSWT_3C6 = 557848422;

    /**
     * ICC_WORMSTS_3C6 <p>
     * <br>
     * Function Describe: ICC蠕行状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Void <br>
         0x1: 开启请求 <br>
         0x2: 关闭请求 <br>
         0x3: Reserved <p>
     */
        public static final int ICC_WORMSTS_3C6 = 557848423;

    /**
     * ICC_ACCEMODREQ_3C6 <p>
     * <br>
     * Function Describe: ICC加速模式请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1~0x65: 对应0到100% <p>
     */
        public static final int ICC_ACCEMODREQ_3C6 = 557848424;

    /**
     * ICC_CREEPSPEEDREQ_3C6 <p>
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
        public static final int ICC_CREEPSPEEDREQ_3C6 = 557848425;

    /**
     * ICC_PARKCHARGEST_3C6 <p>
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
        public static final int ICC_PARKCHARGEST_3C6 = 557848426;

    /**
     * AMP_BALSETSTS_49 <p>
     * <br>
     * Function Describe: 左右平衡调节状态Balance setting. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0~0x9: Lch+10~Lch+1 <br>
         0xA: Center <br>
         0xB~0x14: Rch+1~Rch+10 <br>
         0x15~0x1F: Reserved <p>
     */
        public static final int AMP_BALSETSTS_49 = 557848433;

    /**
     * AMP_FADERSETSTS_49 <p>
     * <br>
     * Function Describe: 前后平衡调节状态Fade setting. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0~0x9: Rear+10~Rear+1 <br>
         0xA: Center <br>
         0xB~0x14: Front+1~Front+10 <br>
         0x15~0x1F: Reserved <p>
     */
        public static final int AMP_FADERSETSTS_49 = 557848436;

    /**
     * AMP_IESSMODSTS_49 <p>
     * <br>
     * Function Describe: IESS模式状态IESS model status feedback to HUT. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: IESS Mode Off <br>
         0x1: IESS Mode 1 <br>
         0x2: IESS Mode 2 <br>
         0x3: ISS Mode 3 <p>
     */
        public static final int AMP_IESSMODSTS_49 = 557848438;

    /**
     * AMP_LOFRQAUDIOSETSTS_49 <p>
     * <br>
     * Function Describe: 低音域调节状态Low frequency audio setting. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0~0x14: -10~+10 <br>
         0x15~0x1F: Reserved <p>
     */
        public static final int AMP_LOFRQAUDIOSETSTS_49 = 557848439;

    /**
     * AMP_MIDFRQAUDIOSETSTS_49 <p>
     * <br>
     * Function Describe: 中音域调节状态Mid frequency audio setting. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0~0x14: -10~+10 <br>
         0x15~0x1F: Reserved <p>
     */
        public static final int AMP_MIDFRQAUDIOSETSTS_49 = 557848441;

    /**
     * AMP_HIFRQAUDIOSETSTS_49 <p>
     * <br>
     * Function Describe: 高音域调节状态High frequency audio setting. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0~0x14: -10~+10 <br>
         0x15~0x1F: Reserved <p>
     */
        public static final int AMP_HIFRQAUDIOSETSTS_49 = 557848443;

    /**
     * AMP_HFTVOLSETSTS_49 <p>
     * <br>
     * Function Describe: 免提电话音量HFM(hand free mode), RT(ring tone) and Tbox-I/B call volume set status. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0~0x27: HFM Volume Step 0~39 <br>
         0x28~0x3E: Reserved <br>
         0x3F: Invalid <p>
     */
        public static final int AMP_HFTVOLSETSTS_49 = 557848445;

    /**
     * AMP_MUTECTRLSTS_49 <p>
     * <br>
     * Function Describe: 静音控制状态Mute/Unmute all speakers. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Unmute <br>
         0x1: Mute <p>
     */
        public static final int AMP_MUTECTRLSTS_49 = 557848446;

    /**
     * AMP_NAVVOLSETSTS_49 <p>
     * <br>
     * Function Describe: 导航音量Navi volume adjustment. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0~0x27: Navi Volume Step 0~39 <br>
         0x28~0x3E: Reserved <br>
         0x3F: Invalid <p>
     */
        public static final int AMP_NAVVOLSETSTS_49 = 557848447;

    /**
     * AMP_MAIVOLSETSTS_49 <p>
     * <br>
     * Function Describe: 主媒体音量Main volume step. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0~0x27: Main Volume Step 0~39 <br>
         0x28~0x3E: Reserved <br>
         0x3F: Invalid <p>
     */
        public static final int AMP_MAIVOLSETSTS_49 = 557848448;

    /**
     * AMP_SWVERSS_675 <p>
     * <br>
     * Function Describe: AMP次软件版本号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int AMP_SWVERSS_675 = 557848451;

    /**
     * AMP_SWVERSM_675 <p>
     * <br>
     * Function Describe: AMP主软件版本号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int AMP_SWVERSM_675 = 557848455;

    /**
     * ICC_LBADJUSTSET_3A8 <p>
     * <br>
     * Function Describe: 大灯手动调节开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: 0档 <br>
         0x2: 1档 <br>
         0x3: 2档 <br>
         0x4: 3档 <p>
     */
        public static final int ICC_LBADJUSTSET_3A8 = 557848456;

    /**
     * SLC_LBADJUSTSTS_3A7 <p>
     * <br>
     * Function Describe: 大灯手动调节信号状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: 0档 <br>
         0x2: 1档 <br>
         0x3: 2档 <br>
         0x4: 3档 <p>
     */
        public static final int SLC_LBADJUSTSTS_3A7 = 557848468;

    /**
     * SLC_CONTRASTCOLORSTS6_3A7 <p>
     * <br>
     * Function Describe: 氛围灯撞色开关6状态-星际引擎（动态） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: off <br>
         0x1: on <br>
         0x2: Invalid <br>
         0x3: Reserved <p>
     */
        public static final int SLC_CONTRASTCOLORSTS6_3A7 = 557848469;

    /**
     * SLC_CONTRASTCOLORSTS4_3A7 <p>
     * <br>
     * Function Describe: 氛围灯撞色开关4状态-虚拟霓虹（动态） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: off <br>
         0x1: on <br>
         0x2: Invalid <br>
         0x3: Reserved <p>
     */
        public static final int SLC_CONTRASTCOLORSTS4_3A7 = 557848470;

    /**
     * SLC_CONTRASTCOLORSTS_3A7 <p>
     * <br>
     * Function Describe: 氛围灯撞色开关5状态-极速电拧（动态） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: off <br>
         0x1: on <br>
         0x2: Invalid <br>
         0x3: Reserved <p>
     */
        public static final int SLC_CONTRASTCOLORSTS_3A7 = 557848471;

    /**
     * SLC_AUTOCOLORSTS1_3A7 <p>
     * <br>
     * Function Describe: 氛围灯自动颜色开关状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: off <br>
         0x1: on <br>
         0x2: Invalid <br>
         0x3: Reserved <p>
     */
        public static final int SLC_AUTOCOLORSTS1_3A7 = 557848475;

    /**
     * ICC_SCRNBRILESET_327 <p>
     * <br>
     * Function Describe: atmosphere brightness grade(氛围灯手动亮度调节) <p>
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
         0xB: OFF <br>
         0xC~0xE: Reserved <br>
         0xF: Invalid <p>
     */
        public static final int ICC_SCRNBRILESET_327 = 557848476;

    /**
     * ICC_SCRNBRIAUTOSET_327 <p>
     * <br>
     * Function Describe: SLC screen brightness auto mode(氛围灯自动亮度调节) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICC_SCRNBRIAUTOSET_327 = 557848477;

    /**
     * ICC_HUMAISPCHSTS_327 <p>
     * <br>
     * Function Describe: 车机回复状态(精灵灯光) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: not speech <br>
         0x1: Speech mode <br>
         0x2: Reserved <br>
         0x3: Invalid <p>
     */
        public static final int ICC_HUMAISPCHSTS_327 = 557848478;

    /**
     * ICC_MUSICFRQ1_31B <p>
     * <br>
     * Function Describe: 音乐频率一 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0~0xFF: The intensity of music <p>
     */
        public static final int ICC_MUSICFRQ1_31B = 557848479;

    /**
     * ICC_MUSICFRQ2_31B <p>
     * <br>
     * Function Describe: 音乐频率二 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0~0xFF: The intensity of music <p>
     */
        public static final int ICC_MUSICFRQ2_31B = 557848480;

    /**
     * ICC_MUSICFRQ3_31B <p>
     * <br>
     * Function Describe: 音乐频率三 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0~0xFF: The intensity of music <p>
     */
        public static final int ICC_MUSICFRQ3_31B = 557848481;

    /**
     * ICC_MUSICFRQ4_31B <p>
     * <br>
     * Function Describe: 音乐频率四 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0~0xFF: The intensity of music <p>
     */
        public static final int ICC_MUSICFRQ4_31B = 557848482;

    /**
     * ICC_MUSICFRQ5_31B <p>
     * <br>
     * Function Describe: 音乐频率五 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0~0xFF: The intensity of music <p>
     */
        public static final int ICC_MUSICFRQ5_31B = 557848483;

    /**
     * ICC_MUSICFRQ6_31B <p>
     * <br>
     * Function Describe: 音乐频率六 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0~0xFF: The intensity of music <p>
     */
        public static final int ICC_MUSICFRQ6_31B = 557848484;

    /**
     * ICC_MUSICFRQ7_31B <p>
     * <br>
     * Function Describe: 音乐频率七 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0~0xFF: The intensity of music <p>
     */
        public static final int ICC_MUSICFRQ7_31B = 557848485;

    /**
     * ICC_MUSICFRQ8_31B <p>
     * <br>
     * Function Describe: 音乐频率八 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0~0xFF: The intensity of music <p>
     */
        public static final int ICC_MUSICFRQ8_31B = 557848486;

    /**
     * ICC_ALCBRIBREAMODSWT_3ED <p>
     * <br>
     * Function Describe: 亮度呼吸模式开关(单色) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICC_ALCBRIBREAMODSWT_3ED = 557848488;

    /**
     * ICC_ALCCLRBREAMODSWT2_3ED <p>
     * <br>
     * Function Describe: 色彩呼吸模式开关-自定义 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICC_ALCCLRBREAMODSWT2_3ED = 557848490;

    /**
     * ICC_ALCMUSICRHYMODSWT_3ED <p>
     * <br>
     * Function Describe: 音乐律动模式开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICC_ALCMUSICRHYMODSWT_3ED = 557848491;

    /**
     * ICC_ALCSPDRHYMODSWT_3ED <p>
     * <br>
     * Function Describe: 车速律动模式开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICC_ALCSPDRHYMODSWT_3ED = 557848493;

    /**
     * ICC_ALCSPCHSWT_3ED <p>
     * <br>
     * Function Describe: 精灵灯光开关(智慧语音) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICC_ALCSPCHSWT_3ED = 557848494;

    /**
     * ICC_ALCACMODSWT_3ED <p>
     * <br>
     * Function Describe: 调温模式开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICC_ALCACMODSWT_3ED = 557848495;

    /**
     * ICC_ALCDOWMODSWT_3ED <p>
     * <br>
     * Function Describe: 氛围灯侧方来车提醒开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICC_ALCDOWMODSWT_3ED = 557848496;

    /**
     * ICC_ALCDRVMODRHYSWT_3ED <p>
     * <br>
     * Function Describe: 驾驶模式律动开关(开门提醒) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICC_ALCDRVMODRHYSWT_3ED = 557848497;

    /**
     * ICC_ALCMOBCHAREMDMODSWT_3ED <p>
     * <br>
     * Function Describe: 手机充电联动氛围灯开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICC_ALCMOBCHAREMDMODSWT_3ED = 557848498;

    /**
     * ICC_ALCWELMODSWT_3ED <p>
     * <br>
     * Function Describe: 迎宾模式开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICC_ALCWELMODSWT_3ED = 557848499;

    /**
     * ICC_VEHMDMESTS_3ED <p>
     * <br>
     * Function Describe: ICC车辆模式反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 初始化 <br>
         0x1: 用户模式 <br>
         0x2: 工厂模式(默认) <br>
         0x3: 运输模式 <br>
         0x4: 碰撞模式(预留) <br>
         0x5: 测试模式(预留) <br>
         0x6: 展厅模式(预留) <br>
         0x7: Reserved <p>
     */
        public static final int ICC_VEHMDMESTS_3ED = 557848500;

    /**
     * ICC_APPLIANCECLSLVL_3ED <p>
     * <br>
     * Function Describe: ICC关闭限能等级反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 不关闭 <br>
         0x1: 关闭等级 1 <br>
         0x2: 关闭等级2 <br>
         0x3: 关闭等级3 <br>
         0x4: 关闭等级 4 <br>
         0x5: 关闭等级 5 <br>
         0x6: 关闭等级6 <br>
         0x7: Reserved <p>
     */
        public static final int ICC_APPLIANCECLSLVL_3ED = 557848501;

    /**
     * ICC_SCRNBRILESET_DUALAREA_3ED <p>
     * <br>
     * Function Describe: 氛围灯亮度设置（双色模式） <p>
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
         0xB: OFF <br>
         0xC~0xE: Reserved <br>
         0xF: Invalid <p>
     */
        public static final int ICC_SCRNBRILESET_DUALAREA_3ED = 557848502;

    /**
     * ICC_AIRVETN_AL_SWT_3ED <p>
     * <br>
     * Function Describe: 出风口氛围灯开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICC_AIRVETN_AL_SWT_3ED = 557848503;

    /**
     * ICC_ALCDUALAREAMODSWT_3ED <p>
     * <br>
     * Function Describe: 双色模式开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICC_ALCDUALAREAMODSWT_3ED = 557848504;

    /**
     * ADAS_STS_LB_58A <p>
     * <br>
     * Function Describe: 智慧避让状态机（观测量） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: Passive <br>
         0x2: Standby <br>
         0x3: Left active <br>
         0x4: Right active <br>
         0x5: Fault <br>
         0x6: Reserved <p>
     */
        public static final int ADAS_STS_LB_58A = 557848511;

    /**
     * DSMC_PASSEATTRACKPOSN_3AA <p>
     * <br>
     * Function Describe: 副驾驶座椅滑轨位置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int DSMC_PASSEATTRACKPOSN_3AA = 557848512;

    /**
     * DSMC_PASSEATHEIPOSN_3AA <p>
     * <br>
     * Function Describe: 副驾驶座椅高度位置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int DSMC_PASSEATHEIPOSN_3AA = 557848513;

    /**
     * DSMC_PASSEATBACKPOSN_3AA <p>
     * <br>
     * Function Describe: 副驾驶座椅靠背位置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int DSMC_PASSEATBACKPOSN_3AA = 557848514;

    /**
     * DSMC_PASSEATCUSHAGPOSN_3AA <p>
     * <br>
     * Function Describe: 副驾驶座椅坐垫角度位置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int DSMC_PASSEATCUSHAGPOSN_3AA = 557848515;

    /**
     * DSMC_PASSSEATMEMRECALLFB_66 <p>
     * <br>
     * Function Describe: 副驾驶座椅记忆调出反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Void <br>
         0x1: Successful <br>
         0x2: Failed <br>
         0x3: No UID Data <p>
     */
        public static final int DSMC_PASSSEATMEMRECALLFB_66 = 557848516;

    /**
     * DSMC_PASSSEATMEMDATAUPDFB_66 <p>
     * <br>
     * Function Describe: 副驾驶座椅记忆信息更新完成反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Void <br>
         0x1: Successful <br>
         0x2: Failed <br>
         0x3: Reserved <p>
     */
        public static final int DSMC_PASSSEATMEMDATAUPDFB_66 = 557848517;

    /**
     * DSMC_PASSSEATTRACKSWTSTS_328 <p>
     * <br>
     * Function Describe: 副驾驶座椅滑轨开关状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: Fwd <br>
         0x2: Rwd <br>
         0x3: Defect <p>
     */
        public static final int DSMC_PASSSEATTRACKSWTSTS_328 = 557848518;

    /**
     * DSMC_PASSSEATBACKSWTSTS_328 <p>
     * <br>
     * Function Describe: 副驾驶座椅靠背调节开关状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: Fwd <br>
         0x2: Rwd <br>
         0x3: Defect <p>
     */
        public static final int DSMC_PASSSEATBACKSWTSTS_328 = 557848519;

    /**
     * DSMC_PASSSEATCUSHAGSWTSTS_328 <p>
     * <br>
     * Function Describe: 副驾驶坐垫角度调节开关状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: Up <br>
         0x2: Down <br>
         0x3: Defect <p>
     */
        public static final int DSMC_PASSSEATCUSHAGSWTSTS_328 = 557848521;

    /**
     * DSMC_CRTPASSSEATUIDSUBPOSN_328 <p>
     * <br>
     * Function Describe: 当前副驾驶座椅子位置编号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 无效 <br>
         0x1: 位置1 <br>
         0x2: 位置2 <br>
         0x3: 位置3 <br>
         0x4~0x5: 保留 <br>
         0x6: 小憩位置 <br>
         0x7: 冥想位置 <p>
     */
        public static final int DSMC_CRTPASSSEATUIDSUBPOSN_328 = 557848522;

    /**
     * DSMC_PASSSEATHEATGSTS_512 <p>
     * <br>
     * Function Describe: 副驾驶座椅加热状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: High <br>
         0x2: Med <br>
         0x3: Low <br>
         0x4: Off <br>
         0x5: OpenCnct <br>
         0x6: OverLoad <br>
         0x7: Unsatisfied <p>
     */
        public static final int DSMC_PASSSEATHEATGSTS_512 = 557848523;

    /**
     * DSMC_PASSSEATVENTNSTS_512 <p>
     * <br>
     * Function Describe: 副驾驶座椅风机状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Not Change <br>
         0x1: High <br>
         0x2: Med <br>
         0x3: Low <br>
         0x4: Off <br>
         0x5~0x7: Reserved <p>
     */
        public static final int DSMC_PASSSEATVENTNSTS_512 = 557848524;

    /**
     * DSMC_PASSSEATTRACKADJSTS_512 <p>
     * <br>
     * Function Describe: 副驾驶座椅滑轨调节状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: Fwd <br>
         0x2: Rwd <br>
         0x3: Defect <p>
     */
        public static final int DSMC_PASSSEATTRACKADJSTS_512 = 557848525;

    /**
     * DSMC_PASSSEATBACKADJSTS_512 <p>
     * <br>
     * Function Describe: 副驾驶座椅靠背调节状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: Fwd <br>
         0x2: Rwd <br>
         0x3: Defect <p>
     */
        public static final int DSMC_PASSSEATBACKADJSTS_512 = 557848526;

    /**
     * DSMC_RRSEATHEATSTS_512 <p>
     * <br>
     * Function Describe: 右后座椅加热状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
         0x1: High <br>
         0x2: Med <br>
         0x3: Low <br>
         0x4: Off <br>
         0x5: OpenCnct <br>
         0x6: OverLoad <br>
         0x7: Unsatisfied <p>
     */
        public static final int DSMC_RRSEATHEATSTS_512 = 557848527;

    /**
     * DSMC_PASSLUMBARUPDSTS_512 <p>
     * <br>
     * Function Describe: 副驾腰托向上调节状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Release <br>
         0x1: Press <p>
     */
        public static final int DSMC_PASSLUMBARUPDSTS_512 = 557848529;

    /**
     * DSMC_PASSLUMBARDWNSTS_512 <p>
     * <br>
     * Function Describe: 副驾腰托向下调节状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Release <br>
         0x1: Press <p>
     */
        public static final int DSMC_PASSLUMBARDWNSTS_512 = 557848530;

    /**
     * DSMC_PASSLUMBARFWDSTS_512 <p>
     * <br>
     * Function Describe: 副驾腰托向前调节状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Release <br>
         0x1: Press <p>
     */
        public static final int DSMC_PASSLUMBARFWDSTS_512 = 557848531;

    /**
     * DSMC_PASSLUMBARBACKWSTS_512 <p>
     * <br>
     * Function Describe: 副驾腰托向后调节状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Release <br>
         0x1: Press <p>
     */
        public static final int DSMC_PASSLUMBARBACKWSTS_512 = 557848532;

    /**
     * DSMC_PASSSEATHEIADJSTS_512 <p>
     * <br>
     * Function Describe: 副驾驶座椅高度调节状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: Up <br>
         0x2: Down <br>
         0x3: Defect <p>
     */
        public static final int DSMC_PASSSEATHEIADJSTS_512 = 557848533;

    /**
     * DSMC_PASSSEATCUSHAGADJSTS_512 <p>
     * <br>
     * Function Describe: 副驾驶座椅坐垫调节状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: Up <br>
         0x2: Down <br>
         0x3: Defect <p>
     */
        public static final int DSMC_PASSSEATCUSHAGADJSTS_512 = 557848534;

    /**
     * DSMC_SECROWSEATWELFCTSETFB_512 <p>
     * <br>
     * Function Describe: 副驾驶座椅迎宾功能设置反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Void <br>
         0x1: Unactive <br>
         0x2: Active <br>
         0x3: Reserved <p>
     */
        public static final int DSMC_SECROWSEATWELFCTSETFB_512 = 557848535;

    /**
     * DSMC_MASFR_SEATMASMOD_512 <p>
     * <br>
     * Function Describe: 右前座椅按摩模式 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Default <br>
         0x1: Mode 1 <br>
         0x2: Mode 2 <br>
         0x3: Mode 3 <br>
         0x4: Mode 4 <br>
         0x5: Mode 5 <br>
         0x6: Mode 6 <br>
         0x7: Mode 7 <br>
         0x8: Mode 8 <p>
     */
        public static final int DSMC_MASFR_SEATMASMOD_512 = 557848537;

    /**
     * DSMC_MASFR_SEATMASGRADESTS_512 <p>
     * <br>
     * Function Describe: 右前座椅按摩档位 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Default <br>
         0x1: Low <br>
         0x2: Middle <br>
         0x3: High <br>
         0x4: OFF <p>
     */
        public static final int DSMC_MASFR_SEATMASGRADESTS_512 = 557848538;

    /**
     * DSMC_PASSSEATTILTPERCENTADJFB_67 <p>
     * <br>
     * Function Describe: 副驾座椅坐垫倾角位置%调节反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Void <br>
         0x1: Successful <br>
         0x2: Failed <br>
         0x3: Reserved <p>
     */
        public static final int DSMC_PASSSEATTILTPERCENTADJFB_67 = 557848545;

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
        public static final int VCU_CHRGGUNANTITHFTOPENSTS_49C = 557848548;

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
        public static final int VCU_EHUCHRGDCHAREQ_49C = 557848550;

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
        public static final int VCU_CHRGDCHABTNREQ_49C = 557848551;

    /**
     * BMS_CHRGSTSDISP_49D <p>
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
        public static final int BMS_CHRGSTSDISP_49D = 557848552;

    /**
     * EPS_MODSTS_475 <p>
     * <br>
     * Function Describe: EPS模式状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Void <br>
         0x1: Standard request <br>
         0x2: Comfort request <br>
         0x3: Sport request <br>
         0x4~0x7: Reserved <p>
     */
        public static final int EPS_MODSTS_475 = 557848553;

    /**
     * BMS_BATTLOWTEMPIND_3C3 <p>
     * <br>
     * Function Describe: 电池低温指示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 灯灭 <br>
         0x1: 灯亮 <p>
     */
        public static final int BMS_BATTLOWTEMPIND_3C3 = 557848554;

    /**
     * BMS_RMNGCHRGTIDISPLY_29F <p>
     * <br>
     * Function Describe: 剩余充电时间（显示） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int BMS_RMNGCHRGTIDISPLY_29F = 557848555;

    /**
     * EHU_DRVRSEATTRACKPERCENTREQ_68 <p>
     * <br>
     * Function Describe: 驾驶员座椅滑轨位置%调节请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int EHU_DRVRSEATTRACKPERCENTREQ_68 = 557848556;

    /**
     * EHU_DRVRSEATTILTPERCENTREQ_68 <p>
     * <br>
     * Function Describe: 驾驶员座椅坐垫倾角位置%调节请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int EHU_DRVRSEATTILTPERCENTREQ_68 = 557848557;

    /**
     * EHU_DRVRHEIPERCENTREQ_68 <p>
     * <br>
     * Function Describe: 驾驶员座椅高度位置%调节请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int EHU_DRVRHEIPERCENTREQ_68 = 557848558;

    /**
     * EHU_DRVRSEATBACKPERCENTREQ_68 <p>
     * <br>
     * Function Describe: 驾驶员座椅靠位置%背调节 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int EHU_DRVRSEATBACKPERCENTREQ_68 = 557848559;

    /**
     * EHU_PASSSEATTRACKPERCENTREQ_68 <p>
     * <br>
     * Function Describe: 副驾座椅滑轨位置%调节请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int EHU_PASSSEATTRACKPERCENTREQ_68 = 557848560;

    /**
     * EHU_PASSSEATTILTPERCENTREQ_68 <p>
     * <br>
     * Function Describe: 副驾座椅坐垫倾角位置%调节请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int EHU_PASSSEATTILTPERCENTREQ_68 = 557848561;

    /**
     * EHU_PASSHEIPERCENTREQ_68 <p>
     * <br>
     * Function Describe: 副驾座椅高度位置%调节请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int EHU_PASSHEIPERCENTREQ_68 = 557848562;

    /**
     * EHU_PASSSEATBACKPERCENTREQ_68 <p>
     * <br>
     * Function Describe: 副驾座椅靠位置%背调节 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int EHU_PASSSEATBACKPERCENTREQ_68 = 557848563;

    /**
     * EHU_MIRRADJUP_3AC <p>
     * <br>
     * Function Describe: 后视镜向上调节 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: On <p>
     */
        public static final int EHU_MIRRADJUP_3AC = 557848564;

    /**
     * EHU_MIRRADJDOWN_3AC <p>
     * <br>
     * Function Describe: 后视镜向下调节 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: On <p>
     */
        public static final int EHU_MIRRADJDOWN_3AC = 557848565;

    /**
     * EHU_MIRRADJLEF_3AC <p>
     * <br>
     * Function Describe: 后视镜向左调节 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: On <p>
     */
        public static final int EHU_MIRRADJLEF_3AC = 557848566;

    /**
     * EHU_MIRRADJRI_3AC <p>
     * <br>
     * Function Describe: 后视镜向右调节 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: On <p>
     */
        public static final int EHU_MIRRADJRI_3AC = 557848567;

    /**
     * EHU_LEREMIRRADJCMD_3AC <p>
     * <br>
     * Function Describe: 左右外后视镜位置调节 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: Left Mrrior Active <br>
         0x2: Right Mrrior Active <br>
         0x3: Reserved <p>
     */
        public static final int EHU_LEREMIRRADJCMD_3AC = 557848568;

    /**
     * EHU_DRVRMIRRTURNDWNALLWD_3AC <p>
     * <br>
     * Function Describe: 外后视镜倒车自动下翻设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 无效 <br>
         0x1: Left Mirror <br>
         0x2: Right Mirror <br>
         0x3: Both <br>
         0x4: 关闭 <br>
         0x5~0x7: 预留 <p>
     */
        public static final int EHU_DRVRMIRRTURNDWNALLWD_3AC = 557848569;

    /**
     * ICC_EXHIBCARMODNOTICEFLAG_3AC <p>
     * <br>
     * Function Describe: 展车模式弹屏确认标志位 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 确认 <br>
         0x2: 取消 <br>
         0x3: Reserved <p>
     */
        public static final int ICC_EXHIBCARMODNOTICEFLAG_3AC = 557848570;

    /**
     * VCU_DRVMODSIG_102 <p>
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
         0xD~0xF: Reserved <p>
     */
        public static final int VCU_DRVMODSIG_102 = 557848573;

    /**
     * VCU_ACLRTIREQ_102 <p>
     * <br>
     * Function Describe: 加速计时请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 无请求 <br>
         0x1: 有请求 <p>
     */
        public static final int VCU_ACLRTIREQ_102 = 557848575;

    /**
     * VCU_SPORTMODACCTI_3A2 <p>
     * <br>
     * Function Describe: 运动模式百公里加速时间 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_SPORTMODACCTI_3A2 = 557848576;

    /**
     * VCU_COMFORTMODACCTI_3A2 <p>
     * <br>
     * Function Describe: 舒适模式百公里加速时间 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_COMFORTMODACCTI_3A2 = 557848577;

    /**
     * VCU_ECOMODACCTI_3A2 <p>
     * <br>
     * Function Describe: 经济模式百公里加速时间 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_ECOMODACCTI_3A2 = 557848578;

    /**
     * VCU_ONEPEDALMODACCTI_3A2 <p>
     * <br>
     * Function Describe: One-Pedal模式百公里加速时间 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_ONEPEDALMODACCTI_3A2 = 557848579;

    /**
     * VCU_PERSONALMODACCTI_3A2 <p>
     * <br>
     * Function Describe: 个性化模式百公里加速时间 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_PERSONALMODACCTI_3A2 = 557848580;

    /**
     * VCU_DRVSTYLEFACTOR_3A2 <p>
     * <br>
     * Function Describe: 驾驶风格因子 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_DRVSTYLEFACTOR_3A2 = 557848581;

    /**
     * VCU_DRVSTYLE_3A2 <p>
     * <br>
     * Function Describe: 驾驶风格 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 平和 <br>
         0x2: 正常 <br>
         0x3: 激进 <p>
     */
        public static final int VCU_DRVSTYLE_3A2 = 557848582;

    /**
     * VCU_BRKEGYRECOVINTENSTS_3E8 <p>
     * <br>
     * Function Describe: 能量回收强度状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_BRKEGYRECOVINTENSTS_3E8 = 557848584;

    /**
     * VCU_WORMSTS_3E8 <p>
     * <br>
     * Function Describe: 蠕行状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Void <br>
         0x1: 开启 <br>
         0x2: 关闭 <br>
         0x3: Reserved <p>
     */
        public static final int VCU_WORMSTS_3E8 = 557848585;

    /**
     * VCU_ACLRMODSTS_3E8 <p>
     * <br>
     * Function Describe: 加速模式状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1~0x65: 对应0到100% <p>
     */
        public static final int VCU_ACLRMODSTS_3E8 = 557848586;

    /**
     * VCU_CHRGPORTENAFLG_3AB <p>
     * <br>
     * Function Describe: 充电口盖使能标志位 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 未使能； <br>
         0x1: 使能 <p>
     */
        public static final int VCU_CHRGPORTENAFLG_3AB = 557848587;

    /**
     * VCU_OPENCLSFLTINFODISP_3AB <p>
     * <br>
     * Function Describe: 充电口盖开闭异常信息显示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 口盖开启失败，请检查口盖是否有异物 <br>
         0x2: 口盖关闭失败，请检查口盖是否有异物 <br>
         0x3: 口盖开启失败，请挂至P挡重试 <br>
         0x4: 口盖开启失败，请关闭洗车模式重试 <br>
         0x5: 口盖关闭失败，请拔枪重试 <br>
         0x6: 车辆处于升级，请稍后重试 <br>
         0x7: 口盖故障，请联系服务站处理 <br>
         0x8~0xF: Reserved <p>
     */
        public static final int VCU_OPENCLSFLTINFODISP_3AB = 557848588;

    /**
     * VCU_VEHCURDISCHRGENDMILE_3AB <p>
     * <br>
     * Function Describe: 车辆当前放电截止里程 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_VEHCURDISCHRGENDMILE_3AB = 557848589;

    /**
     * VCU_CHRGPORTDOORPOSST_3AB <p>
     * <br>
     * Function Describe: 充电口盖位置状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: actuator is idle <br>
         0x1: actuator is moving <br>
         0x2: full open <br>
         0x3: full close <p>
     */
        public static final int VCU_CHRGPORTDOORPOSST_3AB = 557848590;

    /**
     * ICM_PHNMSGSTS_587 <p>
     * <br>
     * Function Describe: 蓝牙电话状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 初始值，无电话动作触发 <br>
         0x1: 去电中 <br>
         0x2: 来电中 <br>
         0x3: 通话中 <br>
         0x4: 挂断 <p>
     */
        public static final int ICM_PHNMSGSTS_587 = 557848592;

    /**
     * ICM_PHNMSGCALLINGTIMEH_587 <p>
     * <br>
     * Function Describe: 通话时长：小时,0~255 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICM_PHNMSGCALLINGTIMEH_587 = 557848593;

    /**
     * ICM_PHNMSGCALLINGTIMEM_587 <p>
     * <br>
     * Function Describe: 通话时长：分钟,0~59 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICM_PHNMSGCALLINGTIMEM_587 = 557848594;

    /**
     * ICM_PHNMSGCALLINGTIMES_587 <p>
     * <br>
     * Function Describe: 通话时长：秒,0~59 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICM_PHNMSGCALLINGTIMES_587 = 557848595;

    /**
     * ICC_10KMAVRGPWRCNSPTN_3B3 <p>
     * <br>
     * Function Describe: 近10km平均电耗 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_10KMAVRGPWRCNSPTN_3B3 = 557848596;

    /**
     * ICC_100KMAVRGPWRCNSPTN_3B3 <p>
     * <br>
     * Function Describe: 近100km平均电耗 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_100KMAVRGPWRCNSPTN_3B3 = 557848598;

    /**
     * ICC_MODSWT_HUD_3B3 <p>
     * <br>
     * Function Describe: 显示主题切换 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Keep the current <br>
         0x1: 全显模式 <br>
         0x2: 运动模式 <br>
         0x3: 精简模式 <p>
     */
        public static final int ICC_MODSWT_HUD_3B3 = 557848599;

    /**
     * ICC_CMD_VOICECONTROLHUD_3B3 <p>
     * <br>
     * Function Describe: 主机语音控制HUD <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Keep the current <br>
         0x1: Close <br>
         0x2: Open <br>
         0x3: HUD亮度调低 <br>
         0x4: HUD亮度调高 <br>
         0x5: HUD亮度调到1档位 <br>
         0x6: HUD亮度调到2档位 <br>
         0x7: HUD亮度调到3档位 <br>
         0x8: HUD亮度调到4档位 <br>
         0x9: HUD亮度调到5档位 <br>
         0xA: HUD亮度调到6档位 <br>
         0xB: HUD亮度调到7档位 <br>
         0xC: HUD亮度调到8档位 <br>
         0xD: HUD亮度调到9档位 <br>
         0xE: HUD亮度调到10档位 <br>
         0xF: HUD高度调高 <br>
         0x10: HUD高度调低 <br>
         0x11: HUD高度调到1档位 <br>
         0x12: HUD高度调到2档位 <br>
         0x13: HUD高度调到3档位 <br>
         0x14: HUD高度调到4档位 <br>
         0x15: HUD高度调到5档位 <br>
         0x16: HUD高度调到6档位 <br>
         0x17: HUD高度调到7档位 <br>
         0x18: HUD高度调到8档位 <br>
         0x19: HUD高度调到9档位 <br>
         0x1A: HUD高度调到10档位 <p>
     */
        public static final int ICC_CMD_VOICECONTROLHUD_3B3 = 557848600;

    /**
     * ICC_TRIPARESETFLG_3B3 <p>
     * <br>
     * Function Describe: Trip A行程重置标志位 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 初始化 <br>
         0x1: 重置 <p>
     */
        public static final int ICC_TRIPARESETFLG_3B3 = 557848602;

    /**
     * ICC_TRIPBRESETFLG_3B3 <p>
     * <br>
     * Function Describe: Trip B行程重置标志位 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 初始化 <br>
         0x1: 重置 <p>
     */
        public static final int ICC_TRIPBRESETFLG_3B3 = 557848603;

    /**
     * BCM_EEMINFOREQQUIESCENTCRT_3A9 <p>
     * <br>
     * Function Describe: 高静态电流提醒标志位 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Normal <br>
         0x1: High quiescent current fault <br>
         0x2~0x3: Reserved <p>
     */
        public static final int BCM_EEMINFOREQQUIESCENTCRT_3A9 = 557848644;

    /**
     * BCM_EEMFIMINSAVELEMOD_3A9 <p>
     * <br>
     * Function Describe: 工厂调试五分钟节点模式 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Disable <br>
         0x1: 提示“电量消耗过多，请上电，否则系统将在2分钟内关闭” <br>
         0x2~0x3: Reserved <p>
     */
        public static final int BCM_EEMFIMINSAVELEMOD_3A9 = 557848645;

    /**
     * BCM_VEVMMENUMVEHMDME_3A9 <p>
     * <br>
     * Function Describe: 车辆模式 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始化 <br>
         0x1: 用户模式 <br>
         0x2: 工厂模式(默认) <br>
         0x3: 运输模式 <br>
         0x4: 碰撞模式(预留) <br>
         0x5: 测试模式(预留) <br>
         0x6: 展厅模式(预留) <br>
         0x7: Reserved <p>
     */
        public static final int BCM_VEVMMENUMVEHMDME_3A9 = 557848646;

    /**
     * VCU_CARWASHMODENA_50B <p>
     * <br>
     * Function Describe: 洗车模式使能 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 洗车模式使能 <br>
         0x2: 自动洗车模式使能 <br>
         0x3: Reserved <p>
     */
        public static final int VCU_CARWASHMODENA_50B = 557848647;

    /**
     * VCU_CARWASHMODSTS_50B <p>
     * <br>
     * Function Describe: 洗车模式状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 洗车模式 <br>
         0x2: 自动洗车模式 <br>
         0x3: Reserved <p>
     */
        public static final int VCU_CARWASHMODSTS_50B = 557848648;

    /**
     * MFS_INCFOLWDST_514 <p>
     * <br>
     * Function Describe: 左侧方向盘上侧按键（增加跟车时距、RES/+） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Pressed <br>
         0x1: Pressed <br>
         0x2: Long Press <br>
         0x3: Reserved <p>
     */
        public static final int MFS_INCFOLWDST_514 = 557848649;

    /**
     * MFS_DECFOLWDST_514 <p>
     * <br>
     * Function Describe: 左侧方向盘下侧按键（减少跟车时距、RES/-） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Pressed <br>
         0x1: Pressed <br>
         0x2: Long Press <br>
         0x3: Reserved <p>
     */
        public static final int MFS_DECFOLWDST_514 = 557848650;

    /**
     * MFS_CUSTBTN_514 <p>
     * <br>
     * Function Describe: 左侧方向盘左侧按键（自定义） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Pressed <br>
         0x1: Pressed <br>
         0x2: Long Press <br>
         0x3: Reserved <p>
     */
        public static final int MFS_CUSTBTN_514 = 557848651;

    /**
     * MFS_PARKAID_514 <p>
     * <br>
     * Function Describe: 左侧方向盘右侧按键（泊车辅助、CANCEL） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Pressed <br>
         0x1: Pressed <br>
         0x2: Long Press <br>
         0x3: Reserved <p>
     */
        public static final int MFS_PARKAID_514 = 557848652;

    /**
     * MFS_LEROLLUP_514 <p>
     * <br>
     * Function Describe: 左侧滚轮(上滚) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Pressed未按 <br>
         0x1: 焦点向上1单位 <br>
         0x2: 焦点向上2单位 <br>
         0x3: 焦点向上3单位 <br>
         0x4: 焦点向上4单位 <br>
         0x5: 焦点向上5单位 <br>
         0x6: 焦点向上6单位 <br>
         0x7: 焦点向上7单位 <p>
     */
        public static final int MFS_LEROLLUP_514 = 557848653;

    /**
     * MFS_LEROLLDWN_514 <p>
     * <br>
     * Function Describe: 左侧滚轮(下滚) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Pressed未按 <br>
         0x1: 焦点向下1单位 <br>
         0x2: 焦点向下2单位 <br>
         0x3: 焦点向下3单位 <br>
         0x4: 焦点向下4单位 <br>
         0x5: 焦点向下5单位 <br>
         0x6: 焦点向下6单位 <br>
         0x7: 焦点向下7单位 <p>
     */
        public static final int MFS_LEROLLDWN_514 = 557848654;

    /**
     * MFS_LEROLLPRESS_514 <p>
     * <br>
     * Function Describe: 左侧滚轮(按下) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Pressed <br>
         0x1: Pressed <br>
         0x2: Long Press <br>
         0x3: 长按(按键时间≥10s) <p>
     */
        public static final int MFS_LEROLLPRESS_514 = 557848655;

    /**
     * MFS_SRCSWTBTN_514 <p>
     * <br>
     * Function Describe: 右侧方向盘开关上侧按键（音源切换按键/蓝牙电话控制键(复用)） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Pressed <br>
         0x1: Pressed <br>
         0x2: Long Press <br>
         0x3: Reserved <p>
     */
        public static final int MFS_SRCSWTBTN_514 = 557848656;

    /**
     * MFS_VOICERCTCNBTN_514 <p>
     * <br>
     * Function Describe: 右侧方向盘开关下侧按键（语音识别按键） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Pressed <br>
         0x1: Pressed <br>
         0x2: Long Press <br>
         0x3: Reserved <p>
     */
        public static final int MFS_VOICERCTCNBTN_514 = 557848657;

    /**
     * MFS_PREVSONGTUNESIG_514 <p>
     * <br>
     * Function Describe: 右侧方向盘开关左侧按键（在多媒体播放时可以切换上一曲,在收音机播放时向低频段搜索上一台） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Pressed <br>
         0x1: Pressed <br>
         0x2: Long Press <br>
         0x3: Reserved <p>
     */
        public static final int MFS_PREVSONGTUNESIG_514 = 557848658;

    /**
     * MFS_NEXTSONGTUNESIG_514 <p>
     * <br>
     * Function Describe: 右侧方向盘开关右侧按键（在多媒体播放时可以切换下一曲,在收音机播放时向高频段搜索下一台） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Pressed <br>
         0x1: Pressed <br>
         0x2: Long Press <br>
         0x3: Reserved <p>
     */
        public static final int MFS_NEXTSONGTUNESIG_514 = 557848659;

    /**
     * MFS_RIROLLUP_514 <p>
     * <br>
     * Function Describe: 右侧滚轮(上滚) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Pressed未按 <br>
         0x1: 焦点向上1单位 <br>
         0x2: 焦点向上2单位 <br>
         0x3: 焦点向上3单位 <br>
         0x4: 焦点向上4单位 <br>
         0x5: 焦点向上5单位 <br>
         0x6: 焦点向上6单位 <br>
         0x7: 焦点向上7单位 <p>
     */
        public static final int MFS_RIROLLUP_514 = 557848660;

    /**
     * MFS_RIROLLDWN_514 <p>
     * <br>
     * Function Describe: 右侧滚轮(下滚) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Pressed未按 <br>
         0x1: 焦点向下1单位 <br>
         0x2: 焦点向下2单位 <br>
         0x3: 焦点向下3单位 <br>
         0x4: 焦点向下4单位 <br>
         0x5: 焦点向下5单位 <br>
         0x6: 焦点向下6单位 <br>
         0x7: 焦点向下7单位 <p>
     */
        public static final int MFS_RIROLLDWN_514 = 557848661;

    /**
     * MFS_RIROLLPRESS_514 <p>
     * <br>
     * Function Describe: 右侧滚轮(按下) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Pressed <br>
         0x1: Pressed <br>
         0x2: Long Press <br>
         0x3: Reserved <p>
     */
        public static final int MFS_RIROLLPRESS_514 = 557848662;

    /**
     * MFS_STEERWHLHEATGINDCRLAMPSTS_514 <p>
     * <br>
     * Function Describe: 方向盘加热指示灯状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: On <br>
         0x2: 不满足加热条件 <br>
         0x3: Reserved <p>
     */
        public static final int MFS_STEERWHLHEATGINDCRLAMPSTS_514 = 557848663;

    /**
     * EUM_LECHILDLOCKSTS_309 <p>
     * <br>
     * Function Describe: 左侧儿童锁状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Invalid <br>
         0x1: Lock <br>
         0x2: Unlock <br>
         0x3: Reserved <p>
     */
        public static final int EUM_LECHILDLOCKSTS_309 = 557848676;

    /**
     * EUM_RICHILDLOCKSTS_309 <p>
     * <br>
     * Function Describe: 右侧儿童锁状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Invalid <br>
         0x1: Lock <br>
         0x2: Unlock <br>
         0x3: Reserved <p>
     */
        public static final int EUM_RICHILDLOCKSTS_309 = 557848677;

    /**
     * ECC_AFU_SWSTS_4FC <p>
     * <br>
     * Function Describe: 香氛系统开关状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off； <br>
         0x1: On； <br>
         0x2: Reserved； <br>
         0x3: Invalid； <p>
     */
        public static final int ECC_AFU_SWSTS_4FC = 557848682;

    /**
     * ECC_AFU_CHANNELSET_4FC <p>
     * <br>
     * Function Describe: 香氛通道选择 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Action； <br>
         0x1: Channel 1； <br>
         0x2: Channel 2； <br>
         0x3: Channel 3； <p>
     */
        public static final int ECC_AFU_CHANNELSET_4FC = 557848683;

    /**
     * ECC_AFU_CONCENTRATION_4FC <p>
     * <br>
     * Function Describe: 香氛出香浓度 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Action； <br>
         0x1: Low； <br>
         0x2: mid； <br>
         0x3: High； <p>
     */
        public static final int ECC_AFU_CONCENTRATION_4FC = 557848684;

    /**
     * ECC_AFU_CHANNELCHGSTS_4FC <p>
     * <br>
     * Function Describe: 香型通道切换状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: No Change； <br>
         0x1: Changing； <br>
         0x2: Change succeeded； <br>
         0x3: Change Failed； <p>
     */
        public static final int ECC_AFU_CHANNELCHGSTS_4FC = 557848686;

    /**
     * ECC_AFU_CH1STS_4FC <p>
     * <br>
     * Function Describe: 香型检测卡槽1 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Please Add <br>
         0x1: Type 1 <br>
         0x2: Type 2 <br>
         0x3: Type 3 <br>
         0x4: Type 4 <br>
         0x5: Type 5 <br>
         0x6: Type 6 <br>
         0x7: Type 7 <br>
         0x8: Type 8 <br>
         0x9: Type 9 <br>
         0xA: Type 10 <br>
         0xB: Type 11 <br>
         0xC: Type 12 <br>
         0xD: Type 13 <br>
         0xE: Type 14 <br>
         0xF: Invalid <p>
     */
        public static final int ECC_AFU_CH1STS_4FC = 557848687;

    /**
     * ECC_AFU_CH2STS_4FC <p>
     * <br>
     * Function Describe: 香型检测卡槽2 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Please Add <br>
         0x1: Type 1 <br>
         0x2: Type 2 <br>
         0x3: Type 3 <br>
         0x4: Type 4 <br>
         0x5: Type 5 <br>
         0x6: Type 6 <br>
         0x7: Type 7 <br>
         0x8: Type 8 <br>
         0x9: Type 9 <br>
         0xA: Type 10 <br>
         0xB: Type 11 <br>
         0xC: Type 12 <br>
         0xD: Type 13 <br>
         0xE: Type 14 <br>
         0xF: Invalid <p>
     */
        public static final int ECC_AFU_CH2STS_4FC = 557848688;

    /**
     * ECC_AFU_CH3STS_4FC <p>
     * <br>
     * Function Describe: 香型检测卡槽3 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Please Add <br>
         0x1: Type 1 <br>
         0x2: Type 2 <br>
         0x3: Type 3 <br>
         0x4: Type 4 <br>
         0x5: Type 5 <br>
         0x6: Type 6 <br>
         0x7: Type 7 <br>
         0x8: Type 8 <br>
         0x9: Type 9 <br>
         0xA: Type 10 <br>
         0xB: Type 11 <br>
         0xC: Type 12 <br>
         0xD: Type 13 <br>
         0xE: Type 14 <br>
         0xF: Invalid <p>
     */
        public static final int ECC_AFU_CH3STS_4FC = 557848689;

    /**
     * ECC_AFU_CH1LEVSTS_4FC <p>
     * <br>
     * Function Describe: 香氛1余量显示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Please exchange <br>
         0x1: 10%(Running Low) <br>
         0x2: 20% <br>
         0x3: 30% <br>
         0x4: 40% <br>
         0x5: 50% <br>
         0x6: 60% <br>
         0x7: 70% <br>
         0x8: 80% <br>
         0x9: 90% <br>
         0xA: 100% <br>
         0xB~0xF: Reserved <p>
     */
        public static final int ECC_AFU_CH1LEVSTS_4FC = 557848690;

    /**
     * ECC_AFU_CH2LEVSTS_4FC <p>
     * <br>
     * Function Describe: 香氛2余量显示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Please exchange <br>
         0x1: 10%(Running Low) <br>
         0x2: 20% <br>
         0x3: 30% <br>
         0x4: 40% <br>
         0x5: 50% <br>
         0x6: 60% <br>
         0x7: 70% <br>
         0x8: 80% <br>
         0x9: 90% <br>
         0xA: 100% <br>
         0xB~0xF: Reserved <p>
     */
        public static final int ECC_AFU_CH2LEVSTS_4FC = 557848691;

    /**
     * ECC_AFU_CH3LEVSTS_4FC <p>
     * <br>
     * Function Describe: 香氛3余量显示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Please exchange <br>
         0x1: 10%(Running Low) <br>
         0x2: 20% <br>
         0x3: 30% <br>
         0x4: 40% <br>
         0x5: 50% <br>
         0x6: 60% <br>
         0x7: 70% <br>
         0x8: 80% <br>
         0x9: 90% <br>
         0xA: 100% <br>
         0xB~0xF: Reserved <p>
     */
        public static final int ECC_AFU_CH3LEVSTS_4FC = 557848692;

    /**
     * ECC_AFU_CH1EXPIRATIONREMINDER_4FC <p>
     * <br>
     * Function Describe: 香氛1过期提醒 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Normal； <br>
         0x1: Will Expire； <br>
         0x2: Expired； <br>
         0x3: Reserved； <p>
     */
        public static final int ECC_AFU_CH1EXPIRATIONREMINDER_4FC = 557848693;

    /**
     * ECC_AFU_CH2EXPIRATIONREMINDER_4FC <p>
     * <br>
     * Function Describe: 香氛2过期提醒 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Normal； <br>
         0x1: Will Expire； <br>
         0x2: Expired； <br>
         0x3: Reserved <p>
     */
        public static final int ECC_AFU_CH2EXPIRATIONREMINDER_4FC = 557848694;

    /**
     * ECC_AFU_CH3EXPIRATIONREMINDER_4FC <p>
     * <br>
     * Function Describe: 香氛3过期提醒 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Normal； <br>
         0x1: Will Expire； <br>
         0x2: Expired； <br>
         0x3: Reserved； <p>
     */
        public static final int ECC_AFU_CH3EXPIRATIONREMINDER_4FC = 557848695;

    /**
     * ICC_CSTSWTSIG_51A <p>
     * <br>
     * Function Describe: CST开关信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No Pressed <br>
         0x1: Pressed <p>
     */
        public static final int ICC_CSTSWTSIG_51A = 557848699;

    /**
     * ICC_PWROFFREQ_51A <p>
     * <br>
     * Function Describe: 大屏下电请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 有请求 <br>
         0x2~0x3: Reserved <p>
     */
        public static final int ICC_PWROFFREQ_51A = 557848705;

    /**
     * ICC_PREHEATREQ_51A <p>
     * <br>
     * Function Describe: 中控预热功能请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 开启 <br>
         0x2: 关闭 <br>
         0x3: Reserved <p>
     */
        public static final int ICC_PREHEATREQ_51A = 557848706;

    /**
     * VCU_SOKTSPLYINTERACTIVESTS_4DC <p>
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
        public static final int VCU_SOKTSPLYINTERACTIVESTS_4DC = 557848707;

    /**
     * VCU_SOKTFUNOPERPROMT_EHU_4DC <p>
     * <br>
     * Function Describe: 车载插座功能操作提示(中控) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 车辆未解防，请解防后重试 <br>
         0x2: 车内温度过高，请降温后使用 <br>
         0x3: 电源系统故障，请联系服务商 <br>
         0x4: 电量低/功率不足，请充电后重试 <br>
         0x5: 动力电池功率不足，请稍后重试 <br>
         0x6: 订单未授权，请确认订单状态 <br>
         0x7: 充电桩功率过小，请拔枪后使用 <br>
         0x8: 充电功率已降低，若需满功率充电请关闭车载插座 <br>
         0x9: 检测到充放电枪，开启充放电后可正常使用 <br>
         0xA: 检测到您长时间未使用电源，建议关闭插座避免能耗浪费 <br>
         0xB: 检测到充电口盖已开启，请关闭口盖或插枪后使用插座 <br>
         0xC: 充电功率严重不足，请关闭插座避免充电失败 <br>
         0xD~0xF: Reserved <p>
     */
        public static final int VCU_SOKTFUNOPERPROMT_EHU_4DC = 557848709;

    /**
     * VCU_EXHIBCARMODSIG_219 <p>
     * <br>
     * Function Describe: 展车模式信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 展车模式开启 <br>
         0x2: 展车模式关闭 <br>
         0x3: 预留 <p>
     */
        public static final int VCU_EXHIBCARMODSIG_219 = 557848712;

    /**
     * ICC_SETACCHRGCURTLIMIT_37C <p>
     * <br>
     * Function Describe: 中控设置交流充电电流限值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_SETACCHRGCURTLIMIT_37C = 557848713;

    /**
     * TBOX_OTAMOD_548 <p>
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
        public static final int TBOX_OTAMOD_548 = 557848718;

    /**
     * EHU_CTRLSTS_PWC_4E2 <p>
     * <br>
     * Function Describe: 无线充状态开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: No Request <br>
         0x1: Closed <br>
         0x2: Open <br>
         0x3: Reserved <p>
     */
        public static final int EHU_CTRLSTS_PWC_4E2 = 557848725;

    /**
     * BCM_BACKGNDBRILVL_3A3 <p>
     * <br>
     * Function Describe: 背景光亮度等级反馈Light intensity level <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Level 1 <br>
         0x1: Level 2 <br>
         0x2: Level 3 <br>
         0x3: Level 4 <br>
         0x4: Level 5 <br>
         0x5: Level 6 <br>
         0x6: Level 7 <br>
         0x7: Level 8 <br>
         0x8: Level 9 <br>
         0x9: Level 10 <br>
         0xA~0xF: Reserved <p>
     */
        public static final int BCM_BACKGNDBRILVL_3A3 = 557848734;

    /**
     * VCU_PETSMODREQFLG_3EE <p>
     * <br>
     * Function Describe: 宠物模式标志位 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 关闭 <br>
         0x1: 开启 <p>
     */
        public static final int VCU_PETSMODREQFLG_3EE = 557848742;

    /**
     * VCU_PWRANTITHEFT_3EE <p>
     * <br>
     * Function Describe: 动力防盗失败提示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: NO information <br>
         0x2: XCU authentication Failure <br>
         0x3: reserved <p>
     */
        public static final int VCU_PWRANTITHEFT_3EE = 557848743;

    /**
     * ICC_LOCKSOUNDPROMPTSWT_91 <p>
     * <br>
     * Function Describe: 解闭锁声音提示开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Invalid <br>
         0x1: closed <br>
         0x2: open <br>
         0x3: reserved <p>
     */
        public static final int ICC_LOCKSOUNDPROMPTSWT_91 = 557848745;

    /**
     * ICC_LFWINCRL_91 <p>
     * <br>
     * Function Describe: 左前车窗中控控制命令（语音+中控屏） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive； <br>
         0x1: AutoUp； <br>
         0x2: AutoDown； <br>
         0x3: Breathable（10%）； <br>
         0x4: Up a little；（10%开度，APM收到信号后判断升到具体位置） <br>
         0x5: Down a little；(10%开度，APM收到信号后判断降到具体位置） <br>
         0x6: ExactPosition； (0-100,精度为5%) <br>
         0x7: 0% ； <br>
         0x8: 5%； <br>
         0x9: 10%； <br>
         0xA: 15%； <br>
         0xB: 20%； <br>
         0xC: 25%； <br>
         0xD: 30%； <br>
         0xE: 35%； <br>
         0xF: 40%； <br>
         0x10: 45%； <br>
         0x11: 50%； <br>
         0x12: 55%； <br>
         0x13: 60%； <br>
         0x14: 65%； <br>
         0x15: 70%； <br>
         0x16: 75%； <br>
         0x17: 80%； <br>
         0x18: 85%； <br>
         0x19: 90%； <br>
         0x1A: 95%； <br>
         0x1B: 100% <br>
         0x1C~0xFF: Reserved <p>
     */
        public static final int ICC_LFWINCRL_91 = 557848746;

    /**
     * ICC_RFWINCRL_91 <p>
     * <br>
     * Function Describe: 右前车窗中控控制命令（语音+中控屏） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive； <br>
         0x1: AutoUp； <br>
         0x2: AutoDown； <br>
         0x3: Breathable（10%）； <br>
         0x4: Up a little；（10%开度，APM收到信号后判断升到具体位置） <br>
         0x5: Down a little；(10%开度，APM收到信号后判断降到具体位置） <br>
         0x6: ExactPosition； (0-100,精度为5%) <br>
         0x7: 0% ； <br>
         0x8: 5%； <br>
         0x9: 10%； <br>
         0xA: 15%； <br>
         0xB: 20%； <br>
         0xC: 25%； <br>
         0xD: 30%； <br>
         0xE: 35%； <br>
         0xF: 40%； <br>
         0x10: 45%； <br>
         0x11: 50%； <br>
         0x12: 55%； <br>
         0x13: 60%； <br>
         0x14: 65%； <br>
         0x15: 70%； <br>
         0x16: 75%； <br>
         0x17: 80%； <br>
         0x18: 85%； <br>
         0x19: 90%； <br>
         0x1A: 95%； <br>
         0x1B: 100% <br>
         0x1C~0xFF: Reserved <p>
     */
        public static final int ICC_RFWINCRL_91 = 557848747;

    /**
     * ICC_LRWINCRL_91 <p>
     * <br>
     * Function Describe: 左后车窗中控控制命令（语音+中控屏） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive； <br>
         0x1: AutoUp； <br>
         0x2: AutoDown； <br>
         0x3: Breathable（10%）； <br>
         0x4: Up a little；（10%开度，APM收到信号后判断升到具体位置） <br>
         0x5: Down a little；(10%开度，APM收到信号后判断降到具体位置） <br>
         0x6: ExactPosition； (0-100,精度为5%) <br>
         0x7: 0% ； <br>
         0x8: 5%； <br>
         0x9: 10%； <br>
         0xA: 15%； <br>
         0xB: 20%； <br>
         0xC: 25%； <br>
         0xD: 30%； <br>
         0xE: 35%； <br>
         0xF: 40%； <br>
         0x10: 45%； <br>
         0x11: 50%； <br>
         0x12: 55%； <br>
         0x13: 60%； <br>
         0x14: 65%； <br>
         0x15: 70%； <br>
         0x16: 75%； <br>
         0x17: 80%； <br>
         0x18: 85%； <br>
         0x19: 90%； <br>
         0x1A: 95%； <br>
         0x1B: 100% <br>
         0x1C~0xFF: Reserved <p>
     */
        public static final int ICC_LRWINCRL_91 = 557848748;

    /**
     * ICC_RRWINCRL_91 <p>
     * <br>
     * Function Describe: 右后车窗中控控制命令（语音+中控屏） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive； <br>
         0x1: AutoUp； <br>
         0x2: AutoDown； <br>
         0x3: Breathable（10%）； <br>
         0x4: Up a little；（10%开度，APM收到信号后判断升到具体位置） <br>
         0x5: Down a little；(10%开度，APM收到信号后判断降到具体位置） <br>
         0x6: ExactPosition； (0-100,精度为5%) <br>
         0x7: 0% ； <br>
         0x8: 5%； <br>
         0x9: 10%； <br>
         0xA: 15%； <br>
         0xB: 20%； <br>
         0xC: 25%； <br>
         0xD: 30%； <br>
         0xE: 35%； <br>
         0xF: 40%； <br>
         0x10: 45%； <br>
         0x11: 50%； <br>
         0x12: 55%； <br>
         0x13: 60%； <br>
         0x14: 65%； <br>
         0x15: 70%； <br>
         0x16: 75%； <br>
         0x17: 80%； <br>
         0x18: 85%； <br>
         0x19: 90%； <br>
         0x1A: 95%； <br>
         0x1B: 100% <br>
         0x1C~0xFF: Reserved <p>
     */
        public static final int ICC_RRWINCRL_91 = 557848749;

    /**
     * ICC_OPENDOORLAMPLANGUAGE_91 <p>
     * <br>
     * Function Describe: ICC开门灯语开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Invalid <br>
         0x1: Open <br>
         0x2: Close <br>
         0x3: Reserved <p>
     */
        public static final int ICC_OPENDOORLAMPLANGUAGE_91 = 557848751;

    /**
     * ICC_LECHILDLOCKSTS_91 <p>
     * <br>
     * Function Describe: 左侧儿童锁状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Invalid <br>
         0x1: Lock <br>
         0x2: Unlock <br>
         0x3: reseverd <p>
     */
        public static final int ICC_LECHILDLOCKSTS_91 = 557848752;

    /**
     * ICC_RICHILDLOCKSTS_91 <p>
     * <br>
     * Function Describe: 右侧儿童锁状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Invalid <br>
         0x1: Lock <br>
         0x2: Unlock <br>
         0x3: reseverd <p>
     */
        public static final int ICC_RICHILDLOCKSTS_91 = 557848753;

    /**
     * ICC_SMARTOPENTRUNK_91 <p>
     * <br>
     * Function Describe: 智能开启后背门开关设置状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: invalid <br>
         0x1: close <br>
         0x2: open <br>
         0x3: 预留 <p>
     */
        public static final int ICC_SMARTOPENTRUNK_91 = 557848754;

    /**
     * VCU_CHRGMODFUNSTS_3BD <p>
     * <br>
     * Function Describe: 充电模式功能状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 自定义模式 <br>
         0x1: 智能模式 <br>
         0x2: 远途模式 <br>
         0x3: 长期健康存放 <br>
         0x4~0x7: 预留 <p>
     */
        public static final int VCU_CHRGMODFUNSTS_3BD = 557848755;

    /**
     * APM_LRLOCKWINSTS_3E0 <p>
     * <br>
     * Function Describe: 左后门锁窗命令反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive； <br>
         0x1: Lock rear left window <br>
         0x2: Unlock rear left window <br>
         0x3: Reserved <p>
     */
        public static final int APM_LRLOCKWINSTS_3E0 = 557848756;

    /**
     * APM_RRLOCKWINSTS_3E0 <p>
     * <br>
     * Function Describe: 右后门锁窗命令反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive； <br>
         0x1: Lock rear right window <br>
         0x2: Unlock rear right window <br>
         0x3: Reserved <p>
     */
        public static final int APM_RRLOCKWINSTS_3E0 = 557848757;

    /**
     * APM_LFWINPOSFB_3E0 <p>
     * <br>
     * Function Describe: 左前车窗位置反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive； <br>
         0x1~0x65: 0%(全关)~100%(全开)； <br>
         0x66~0xFF: Reserved <p>
     */
        public static final int APM_LFWINPOSFB_3E0 = 557848758;

    /**
     * APM_RFWINPOSFB_3E0 <p>
     * <br>
     * Function Describe: 右前车窗位置反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive； <br>
         0x1~0x65: 0%(全关)~100%(全开)； <br>
         0x66~0xFF: Reserved <p>
     */
        public static final int APM_RFWINPOSFB_3E0 = 557848759;

    /**
     * APM_LRWINPOSFB_3E0 <p>
     * <br>
     * Function Describe: 左后车窗位置反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive； <br>
         0x1~0x65: 0%(全关)~100%(全开)； <br>
         0x66~0xFF: Reserved <p>
     */
        public static final int APM_LRWINPOSFB_3E0 = 557848760;

    /**
     * APM_RRWINPOSFB_3E0 <p>
     * <br>
     * Function Describe: 右后车窗位置反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive； <br>
         0x1~0x65: 0%(全关)~100%(全开)； <br>
         0x66~0xFF: Reserved <p>
     */
        public static final int APM_RRWINPOSFB_3E0 = 557848761;

    /**
     * VCU_CHRGSTOPSOCPLANVAL_51C <p>
     * <br>
     * Function Describe: 充电截止SOC规划值_VCU <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_CHRGSTOPSOCPLANVAL_51C = 557848767;

    /**
     * AVAP_SENTISNVTYSETSTS_4E7 <p>
     * <br>
     * Function Describe: 二级震动报警灵敏度状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 低 <br>
         0x2: 中 <br>
         0x3: 高 <p>
     */
        public static final int AVAP_SENTISNVTYSETSTS_4E7 = 557848809;

    /**
     * ICC_ALCCLRCSTMSET_BA <p>
     * <br>
     * Function Describe: 氛围灯自定义颜色设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_ALCCLRCSTMSET_BA = 557848939;

    /**
     * ICC_ALCADJ_COLOR1SET_69 <p>
     * <br>
     * Function Describe: 氛围灯色彩调节颜色1设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_ALCADJ_COLOR1SET_69 = 557848941;

    /**
     * ICC_ALCADJ_COLOR2SET_69 <p>
     * <br>
     * Function Describe: 氛围灯色彩调节颜色2设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_ALCADJ_COLOR2SET_69 = 557848942;

    /**
     * SLC_ALCSTS_510 <p>
     * <br>
     * Function Describe: 氛围灯总开关状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: off <br>
         0x1: on <br>
         0x2: Invalid <br>
         0x3: Reserved <p>
     */
        public static final int SLC_ALCSTS_510 = 557848943;

    /**
     * SLC_SCRNBRIAUTOSTS_510 <p>
     * <br>
     * Function Describe: 亮度自动调节开关状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: off <br>
         0x1: on <br>
         0x2: Invalid <br>
         0x3: Reserved <p>
     */
        public static final int SLC_SCRNBRIAUTOSTS_510 = 557848944;

    /**
     * SLC_COLORCSTMSTS_510 <p>
     * <br>
     * Function Describe: 氛围灯自定义颜色状态反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int SLC_COLORCSTMSTS_510 = 557848945;

    /**
     * SLC_ALCCRTADJ_COLOR1_510 <p>
     * <br>
     * Function Describe: 氛围灯当前色彩调节颜色1 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int SLC_ALCCRTADJ_COLOR1_510 = 557848948;

    /**
     * SLC_ALCCRTADJ_COLOR2_510 <p>
     * <br>
     * Function Describe: 氛围灯当前色彩调节颜色2 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int SLC_ALCCRTADJ_COLOR2_510 = 557848949;

    /**
     * SLC_AIRVETN_AL_STS_510 <p>
     * <br>
     * Function Describe: 出风口氛围灯开关状态反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: off <br>
         0x1: on <br>
         0x2: Invalid <br>
         0x3: Reserved <p>
     */
        public static final int SLC_AIRVETN_AL_STS_510 = 557848950;

    /**
     * SLC_ALCDUALAREAMODSTS_510 <p>
     * <br>
     * Function Describe: 双色模式开关状态反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: off <br>
         0x1: on <br>
         0x2: Invalid <br>
         0x3: Reserved <p>
     */
        public static final int SLC_ALCDUALAREAMODSTS_510 = 557848951;

    /**
     * SLC_TURNLAMPMODSTS_510 <p>
     * <br>
     * Function Describe: 氛围灯转向联动开关状态(精灵灯光) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: off <br>
         0x1: on <br>
         0x2: Invalid <br>
         0x3: Reserved <p>
     */
        public static final int SLC_TURNLAMPMODSTS_510 = 557848953;

    /**
     * ECC_UVCSTS_3F7 <p>
     * <br>
     * Function Describe: UVC状态(鼓风机) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 待机 <br>
         0x1: 工作 <br>
         0x2: 条件不满足 <br>
         0x3: 故障 <p>
     */
        public static final int ECC_UVCSTS_3F7 = 557848955;

    /**
     * HUD_ENTEREOLMOD_49E <p>
     * <br>
     * Function Describe: HUD进入下线检测模式 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 不进入检测模式 <br>
         0x1: 进入检测模式 <p>
     */
        public static final int HUD_ENTEREOLMOD_49E = 557848957;

    /**
     * HUD_TESTPICTUREDEBUG_49E <p>
     * <br>
     * Function Describe: HUD测试图片调用 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: OFF <br>
         0x1: 畸变测试图片 <br>
         0x2: 中视点测试图片 <br>
         0x3: 预留 <p>
     */
        public static final int HUD_TESTPICTUREDEBUG_49E = 557848958;

    /**
     * HUD_ARPARA1FB1_6B <p>
     * <br>
     * Function Describe: HUD AR参数1反馈信号1 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA1FB1_6B = 557848959;

    /**
     * HUD_ARPARA1FB2_6B <p>
     * <br>
     * Function Describe: HUD AR参数1反馈信号2 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA1FB2_6B = 557848960;

    /**
     * HUD_ARPARA1FB3_6B <p>
     * <br>
     * Function Describe: HUD AR参数1反馈信号3 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA1FB3_6B = 557848961;

    /**
     * HUD_ARPARA1FB4_6B <p>
     * <br>
     * Function Describe: HUD AR参数1反馈信号4 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA1FB4_6B = 557848962;

    /**
     * HUD_ARPARA1FB5_6B <p>
     * <br>
     * Function Describe: HUD AR参数1反馈信号5 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA1FB5_6B = 557848963;

    /**
     * HUD_ARPARA1FB6_6B <p>
     * <br>
     * Function Describe: HUD AR参数1反馈信号6 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA1FB6_6B = 557848964;

    /**
     * HUD_ARPARA1FB7_6B <p>
     * <br>
     * Function Describe: HUD AR参数1反馈信号7 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA1FB7_6B = 557848965;

    /**
     * HUD_ARPARA1FB8_6B <p>
     * <br>
     * Function Describe: HUD AR参数1反馈信号8 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA1FB8_6B = 557848966;

    /**
     * HUD_ARPARA1FB9_6B <p>
     * <br>
     * Function Describe: HUD AR参数1反馈信号9 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA1FB9_6B = 557848967;

    /**
     * HUD_ARPARA1FB10_6B <p>
     * <br>
     * Function Describe: HUD AR参数1反馈信号10 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA1FB10_6B = 557848968;

    /**
     * HUD_ARPARA1FB11_6B <p>
     * <br>
     * Function Describe: HUD AR参数1反馈信号11 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA1FB11_6B = 557848969;

    /**
     * HUD_ARPARA1FB12_6B <p>
     * <br>
     * Function Describe: HUD AR参数1反馈信号12 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA1FB12_6B = 557848970;

    /**
     * HUD_ARPARA1FB13_6B <p>
     * <br>
     * Function Describe: HUD AR参数1反馈信号13 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA1FB13_6B = 557848971;

    /**
     * HUD_ARPARA1FB14_6B <p>
     * <br>
     * Function Describe: HUD AR参数1反馈信号14 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA1FB14_6B = 557848972;

    /**
     * HUD_ARPARA1FB15_6B <p>
     * <br>
     * Function Describe: HUD AR参数1反馈信号15 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA1FB15_6B = 557848973;

    /**
     * HUD_ARPARA1FB16_6B <p>
     * <br>
     * Function Describe: HUD AR参数1反馈信号16 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA1FB16_6B = 557848974;

    /**
     * HUD_ARPARA2FB1_6B <p>
     * <br>
     * Function Describe: HUD AR参数2反馈信号1 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA2FB1_6B = 557848975;

    /**
     * HUD_ARPARA2FB2_6B <p>
     * <br>
     * Function Describe: HUD AR参数2反馈信号2 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA2FB2_6B = 557848976;

    /**
     * HUD_ARPARA2FB3_6B <p>
     * <br>
     * Function Describe: HUD AR参数2反馈信号3 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA2FB3_6B = 557848977;

    /**
     * HUD_ARPARA2FB4_6B <p>
     * <br>
     * Function Describe: HUD AR参数2反馈信号4 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA2FB4_6B = 557848978;

    /**
     * HUD_ARPARA2FB5_6B <p>
     * <br>
     * Function Describe: HUD AR参数2反馈信号5 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA2FB5_6B = 557848979;

    /**
     * HUD_ARPARA2FB6_6B <p>
     * <br>
     * Function Describe: HUD AR参数2反馈信号6 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA2FB6_6B = 557848980;

    /**
     * HUD_ARPARA2FB7_6B <p>
     * <br>
     * Function Describe: HUD AR参数2反馈信号7 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA2FB7_6B = 557848981;

    /**
     * HUD_ARPARA2FB8_6B <p>
     * <br>
     * Function Describe: HUD AR参数2反馈信号8 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA2FB8_6B = 557848982;

    /**
     * HUD_ARPARA2FB9_6B <p>
     * <br>
     * Function Describe: HUD AR参数2反馈信号9 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA2FB9_6B = 557848983;

    /**
     * HUD_ARPARA2FB10_6B <p>
     * <br>
     * Function Describe: HUD AR参数2反馈信号10 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA2FB10_6B = 557848984;

    /**
     * HUD_ARPARA2FB11_6B <p>
     * <br>
     * Function Describe: HUD AR参数2反馈信号11 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA2FB11_6B = 557848985;

    /**
     * HUD_ARPARA2FB12_6B <p>
     * <br>
     * Function Describe: HUD AR参数2反馈信号12 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA2FB12_6B = 557848986;

    /**
     * HUD_ARPARA2FB13_6B <p>
     * <br>
     * Function Describe: HUD AR参数2反馈信号13 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA2FB13_6B = 557848987;

    /**
     * HUD_ARPARA2FB14_6B <p>
     * <br>
     * Function Describe: HUD AR参数2反馈信号14 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA2FB14_6B = 557848988;

    /**
     * HUD_ARPARA2FB15_6B <p>
     * <br>
     * Function Describe: HUD AR参数2反馈信号15 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA2FB15_6B = 557848989;

    /**
     * HUD_ARPARA2FB16_6B <p>
     * <br>
     * Function Describe: HUD AR参数2反馈信号16 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA2FB16_6B = 557848990;

    /**
     * HUD_ARPARA3FB1_6C <p>
     * <br>
     * Function Describe: HUD AR参数3反馈信号1 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA3FB1_6C = 557848991;

    /**
     * HUD_ARPARA3FB2_6C <p>
     * <br>
     * Function Describe: HUD AR参数3反馈信号2 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA3FB2_6C = 557848992;

    /**
     * HUD_ARPARA3FB3_6C <p>
     * <br>
     * Function Describe: HUD AR参数3反馈信号3 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA3FB3_6C = 557848993;

    /**
     * HUD_ARPARA3FB4_6C <p>
     * <br>
     * Function Describe: HUD AR参数3反馈信号4 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA3FB4_6C = 557848994;

    /**
     * HUD_ARPARA3FB5_6C <p>
     * <br>
     * Function Describe: HUD AR参数3反馈信号5 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA3FB5_6C = 557848995;

    /**
     * HUD_ARPARA3FB6_6C <p>
     * <br>
     * Function Describe: HUD AR参数3反馈信号6 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA3FB6_6C = 557848996;

    /**
     * HUD_ARPARA3FB7_6C <p>
     * <br>
     * Function Describe: HUD AR参数3反馈信号7 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA3FB7_6C = 557848997;

    /**
     * HUD_ARPARA3FB8_6C <p>
     * <br>
     * Function Describe: HUD AR参数3反馈信号8 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA3FB8_6C = 557848998;

    /**
     * HUD_ARPARA3FB9_6C <p>
     * <br>
     * Function Describe: HUD AR参数3反馈信号9 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA3FB9_6C = 557848999;

    /**
     * HUD_ARPARA3FB10_6C <p>
     * <br>
     * Function Describe: HUD AR参数3反馈信号10 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA3FB10_6C = 557849000;

    /**
     * HUD_ARPARA3FB11_6C <p>
     * <br>
     * Function Describe: HUD AR参数3反馈信号11 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA3FB11_6C = 557849001;

    /**
     * HUD_ARPARA3FB12_6C <p>
     * <br>
     * Function Describe: HUD AR参数3反馈信号12 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA3FB12_6C = 557849002;

    /**
     * HUD_ARPARA3FB13_6C <p>
     * <br>
     * Function Describe: HUD AR参数3反馈信号13 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA3FB13_6C = 557849003;

    /**
     * HUD_ARPARA3FB14_6C <p>
     * <br>
     * Function Describe: HUD AR参数3反馈信号14 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA3FB14_6C = 557849004;

    /**
     * HUD_ARPARA3FB15_6C <p>
     * <br>
     * Function Describe: HUD AR参数3反馈信号15 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA3FB15_6C = 557849005;

    /**
     * HUD_ARPARA3FB16_6C <p>
     * <br>
     * Function Describe: HUD AR参数3反馈信号16 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA3FB16_6C = 557849006;

    /**
     * HUD_ARPARA4FB1_6C <p>
     * <br>
     * Function Describe: HUD AR参数4反馈信号1 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA4FB1_6C = 557849007;

    /**
     * HUD_ARPARA4FB2_6C <p>
     * <br>
     * Function Describe: HUD AR参数4反馈信号2 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA4FB2_6C = 557849008;

    /**
     * HUD_ARPARA4FB3_6C <p>
     * <br>
     * Function Describe: HUD AR参数4反馈信号3 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA4FB3_6C = 557849009;

    /**
     * HUD_ARPARA4FB4_6C <p>
     * <br>
     * Function Describe: HUD AR参数4反馈信号4 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA4FB4_6C = 557849010;

    /**
     * HUD_ARPARA4FB5_6C <p>
     * <br>
     * Function Describe: HUD AR参数4反馈信号5 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA4FB5_6C = 557849011;

    /**
     * HUD_ARPARA4FB6_6C <p>
     * <br>
     * Function Describe: HUD AR参数4反馈信号6 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA4FB6_6C = 557849012;

    /**
     * HUD_ARPARA4FB7_6C <p>
     * <br>
     * Function Describe: HUD AR参数4反馈信号7 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA4FB7_6C = 557849013;

    /**
     * HUD_ARPARA4FB8_6C <p>
     * <br>
     * Function Describe: HUD AR参数4反馈信号8 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int HUD_ARPARA4FB8_6C = 557849014;

    /**
     * ICC_ARPARAFB1_49A <p>
     * <br>
     * Function Describe: ICC AR参数调用信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_ARPARAFB1_49A = 557849015;

    /**
     * ICC_ARPARAFB2_49A <p>
     * <br>
     * Function Describe: ICC AR参数调用信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_ARPARAFB2_49A = 557849016;

    /**
     * ICC_ARPARAFB3_49A <p>
     * <br>
     * Function Describe: ICC AR参数调用信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_ARPARAFB3_49A = 557849017;

    /**
     * ICC_ARPARAFB4_49A <p>
     * <br>
     * Function Describe: ICC AR参数调用信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_ARPARAFB4_49A = 557849018;

    /**
     * ICC_LOGOLIGSWT_49A <p>
     * <br>
     * Function Describe: LOGO灯开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICC_LOGOLIGSWT_49A = 557849019;

    /**
     * ICC_CONTRASTCOLORSWT1_49A <p>
     * <br>
     * Function Describe: 氛围灯撞色开关1-虚拟霓虹 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICC_CONTRASTCOLORSWT1_49A = 557849020;

    /**
     * ICC_CONTRASTCOLORSWT2_49A <p>
     * <br>
     * Function Describe: 氛围灯撞色开关2-极速电拧 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICC_CONTRASTCOLORSWT2_49A = 557849021;

    /**
     * ICC_CONTRASTCOLORSWT3_49A <p>
     * <br>
     * Function Describe: 氛围灯撞色开关3-星际引擎 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
         0x1: ON <br>
         0x2: OFF <br>
         0x3: Invalid <p>
     */
        public static final int ICC_CONTRASTCOLORSWT3_49A = 557849022;

    /**
     * BMS_MAXLOADPWR_5BF <p>
     * <br>
     * Function Describe: 电池最大负载电量 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int BMS_MAXLOADPWR_5BF = 557849023;

    /**
     * VCU_BATTHEATGMNGBSDMAP_616 <p>
     * <br>
     * Function Describe: 导航到桩电池热管理状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 未工作 <br>
         0x1: 工作中 <br>
         0x2~0x3: Reserved <p>
     */
        public static final int VCU_BATTHEATGMNGBSDMAP_616 = 557849024;

    /**
     * VCU_VEHWEIGHT_5BC <p>
     * <br>
     * Function Describe: 车辆重量 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_VEHWEIGHT_5BC = 557849025;

    /**
     * VCU_EGYCOSTMODEL_5BC <p>
     * <br>
     * Function Describe: 能耗代价模型 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_EGYCOSTMODEL_5BC = 557849026;

    /**
     * VCU_VEHSPD1EGYCONSUME_5BC <p>
     * <br>
     * Function Describe: 车速1对应能耗值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_VEHSPD1EGYCONSUME_5BC = 557849027;

    /**
     * VCU_VEHSPD2EGYCONSUME_5BC <p>
     * <br>
     * Function Describe: 车速2对应能耗值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_VEHSPD2EGYCONSUME_5BC = 557849028;

    /**
     * VCU_VEHSPD3EGYCONSUME_5BC <p>
     * <br>
     * Function Describe: 车速3对应能耗值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_VEHSPD3EGYCONSUME_5BC = 557849029;

    /**
     * VCU_VEHSPD4EGYCONSUME_5BC <p>
     * <br>
     * Function Describe: 车速4对应能耗值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_VEHSPD4EGYCONSUME_5BC = 557849030;

    /**
     * VCU_VEHSPD5EGYCONSUME_5BC <p>
     * <br>
     * Function Describe: 车速5对应能耗值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_VEHSPD5EGYCONSUME_5BC = 557849031;

    /**
     * VCU_VEHSPD6EGYCONSUME_5BC <p>
     * <br>
     * Function Describe: 车速6对应能耗值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_VEHSPD6EGYCONSUME_5BC = 557849032;

    /**
     * VCU_VEHSPD7EGYCONSUME_5BC <p>
     * <br>
     * Function Describe: 车速7对应能耗值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_VEHSPD7EGYCONSUME_5BC = 557849033;

    /**
     * VCU_VEHSPD8EGYCONSUME_5BC <p>
     * <br>
     * Function Describe: 车速8对应能耗值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_VEHSPD8EGYCONSUME_5BC = 557849034;

    /**
     * VCU_VEHSPD9EGYCONSUME_5BC <p>
     * <br>
     * Function Describe: 车速9对应能耗值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_VEHSPD9EGYCONSUME_5BC = 557849035;

    /**
     * VCU_VEHSPD10EGYCONSUME_5BC <p>
     * <br>
     * Function Describe: 车速10对应能耗值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_VEHSPD10EGYCONSUME_5BC = 557849036;

    /**
     * VCU_VEHSPD11EGYCONSUME_5BC <p>
     * <br>
     * Function Describe: 车速11对应能耗值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_VEHSPD11EGYCONSUME_5BC = 557849037;

    /**
     * VCU_VEHSPD12EGYCONSUME_5BC <p>
     * <br>
     * Function Describe: 车速12对应能耗值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_VEHSPD12EGYCONSUME_5BC = 557849038;

    /**
     * VCU_VEHSPD13EGYCONSUME_5BC <p>
     * <br>
     * Function Describe: 车速13对应能耗值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_VEHSPD13EGYCONSUME_5BC = 557849039;

    /**
     * VCU_VEHSPD14EGYCONSUME_5BC <p>
     * <br>
     * Function Describe: 车速14对应能耗值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_VEHSPD14EGYCONSUME_5BC = 557849040;

    /**
     * VCU_VEHSPD15EGYCONSUME_5BC <p>
     * <br>
     * Function Describe: 车速15对应能耗值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_VEHSPD15EGYCONSUME_5BC = 557849041;

    /**
     * VCU_SLOPEDECLINECONSUMECOEF_5BC <p>
     * <br>
     * Function Describe: 坡度下降的消耗系数 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_SLOPEDECLINECONSUMECOEF_5BC = 557849042;

    /**
     * VCU_ATTACHCONSUMEPWR_5BC <p>
     * <br>
     * Function Describe: 附件消耗功率 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_ATTACHCONSUMEPWR_5BC = 557849043;

    /**
     * VCU_FERRYCONSUME_5BC <p>
     * <br>
     * Function Describe: 轮渡消耗 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_FERRYCONSUME_5BC = 557849044;

    /**
     * VCU_SLOPERISECONSUMECOEF_5BC <p>
     * <br>
     * Function Describe: 坡度上升的消耗系数 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_SLOPERISECONSUMECOEF_5BC = 557849045;

    /**
     * BCM_OPENDOORLAMPLANGUAGESWTSTS_311 <p>
     * <br>
     * Function Describe: 开门灯语开关状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Closed <br>
         0x1: Open <p>
     */
        public static final int BCM_OPENDOORLAMPLANGUAGESWTSTS_311 = 557849050;

    /**
     * BCM_LOCKSOUNDPROMPTSWT_311 <p>
     * <br>
     * Function Describe: 解闭锁声音提示开关状态反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Closed <br>
         0x1: Open <p>
     */
        public static final int BCM_LOCKSOUNDPROMPTSWT_311 = 557849051;

    /**
     * BCM_SMARTOPENTRUNK_311 <p>
     * <br>
     * Function Describe: 智能开启后背门开关设置状态反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: close <br>
         0x1: open <p>
     */
        public static final int BCM_SMARTOPENTRUNK_311 = 557849052;

    /**
     * RSM_SSMOVEMENT_311 <p>
     * <br>
     * Function Describe: 遮阳帘运行状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Initialized <br>
         0x1: Initializing <br>
         0x2: Opening <br>
         0x3: Closing <br>
         0x4: Reversing防夹反转 <br>
         0x5: stopped <br>
         0x6: Reserved <br>
         0x7: Uninitialized <p>
     */
        public static final int RSM_SSMOVEMENT_311 = 557849053;

    /**
     * RSM_SSPOSPECR_311 <p>
     * <br>
     * Function Describe: 遮阳帘开度反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x1~0x65: 0%~100% <br>
         0x66: stop <br>
         0x67~0x69: reserved <br>
         0x70~0x7E: reserved <br>
         0x0: Unknown <p>
     */
        public static final int RSM_SSPOSPECR_311 = 557849054;

    /**
     * BCM_LOCKAUTOCLSSUNSSWTFB_311 <p>
     * <br>
     * Function Describe: 锁车自动关闭遮阳帘开关反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: off <br>
         0x1: on <p>
     */
        public static final int BCM_LOCKAUTOCLSSUNSSWTFB_311 = 557849055;

    /**
     * VCU_DRVGMILGDISPPERC_3B6 <p>
     * <br>
     * Function Describe: 续驶里程显示百分比 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_DRVGMILGDISPPERC_3B6 = 557849193;

    /**
     * VCU_DRRANGDISPERCENT_HIGPRECDISPLAYREQUIRE_3B6 <p>
     * <br>
     * Function Describe: 续驶里程显示百分比（高精度）显示需求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值； <br>
         0x1: 有需求； <br>
         0x2: Reserved <br>
         0x3: invalid <p>
     */
        public static final int VCU_DRRANGDISPERCENT_HIGPRECDISPLAYREQUIRE_3B6 = 557849195;

    /**
     * VCU_DRRANGDISPERCENT_HIGPREC_3B6 <p>
     * <br>
     * Function Describe: 续驶里程显示百分比（高精度） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_DRRANGDISPERCENT_HIGPREC_3B6 = 557849196;

    /**
     * VCU_RAMPMODENABLETIP_50E <p>
     * <br>
     * Function Describe: 暴走模式不启用提醒 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
        0x1: 动力电池剩余电量较低，无法启用赛道模式 <br>
        0x2: 请关闭所有车门后启用暴走模式 <br>
        0x3: 请系好安全带后启用暴走模式 <br>
        0x4: 请挂入P挡后启用暴走模式 <br>
        0x5: 整车故障 <br>
        0x6~0xF: Reserved <p>
     */
        public static final int VCU_RAMPMODENABLETIP_50E = 557849200;

    /**
     * VCU_EHUPWROFFENA_50E <p>
     * <br>
     * Function Describe: 大屏下电开关使能信号_S000016_E00 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 未使能 <br>
         0x1: 已使能 <p>
     */
        public static final int VCU_EHUPWROFFENA_50E = 557849201;

    /**
     * CPD_CHILDCALLASWTSTS_3B2 <p>
     * <br>
     * Function Describe: 生命体征监测开关状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
         0x1: On <p>
     */
        public static final int CPD_CHILDCALLASWTSTS_3B2 = 557849302;

    /**
     * ICC_IMULGTACCE_2F3 <p>
     * <br>
     * Function Describe: Longitudinal Acceleration纵向加速度(向前为正,向后为负) <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_IMULGTACCE_2F3 = 557849341;

    /**
     * PDCU_EXHIBCARMODNOTICE_509 <p>
     * <br>
     * Function Describe: 展车模式弹屏 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 不显示 <br>
         0x1: 显示开启弹屏 <br>
         0x2: 显示关闭弹屏 <br>
         0x3: Reserved <p>
     */
        public static final int PDCU_EXHIBCARMODNOTICE_509 = 557849378;

    /**
     * PDCU_EXHIBCARMODTEXT_509 <p>
     * <br>
     * Function Describe: 展车模式指令请求（文字显示状态） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 不显示 <br>
         0x1: 闪烁（完成1次请求） <br>
         0x2~0x3: Reserved <p>
     */
        public static final int PDCU_EXHIBCARMODTEXT_509 = 557849379;

    /**
     * VCU_EXHIBCARMODDISABLENOTICE_509 <p>
     * <br>
     * Function Describe: 展车模式状态下VCU部分功能不可用 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 不显示 <br>
         0x1: 显示通用提示 <br>
         0x2~0x3: Reserved <p>
     */
        public static final int VCU_EXHIBCARMODDISABLENOTICE_509 = 557849380;

    /**
     * BCM_EXHIBCARMODDISABLENOTICE_3DE <p>
     * <br>
     * Function Describe: 展车模式状态下BCM部分功能不可用 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 不显示 <br>
         0x1: 显示通用提示 <br>
         0x2~0x3: Reserved <p>
     */
        public static final int BCM_EXHIBCARMODDISABLENOTICE_3DE = 557849382;

    /**
     * TBOX_EXHIBCARMODDISABLENOTICE_3FF <p>
     * <br>
     * Function Describe: 展车模式状态下TBOX部分功能不可用 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 不显示 <br>
         0x1: 显示通用提示 <br>
         0x2~0x3: Reserved <p>
     */
        public static final int TBOX_EXHIBCARMODDISABLENOTICE_3FF = 557849383;

    /**
     * AVAP_SENTRYMODTI1VLD_547 <p>
     * <br>
     * Function Describe: AVAP哨兵模式时间段1有效标志位反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: valid <br>
         0x2: invalid <br>
         0x3: reserved <p>
     */
        public static final int AVAP_SENTRYMODTI1VLD_547 = 557849384;

    /**
     * AVAP_SENTRYMODTI2VLD_547 <p>
     * <br>
     * Function Describe: AVAP哨兵模式时间段2有效标志位反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: valid <br>
         0x2: invalid <br>
         0x3: reserved <p>
     */
        public static final int AVAP_SENTRYMODTI2VLD_547 = 557849385;

    /**
     * AVAP_SENTRYMODSTRTTI1_547 <p>
     * <br>
     * Function Describe: AVAP哨兵模式开始时间段1开始时间 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int AVAP_SENTRYMODSTRTTI1_547 = 557849386;

    /**
     * AVAP_SENTRYMODDATE_547 <p>
     * <br>
     * Function Describe: AVAP哨兵模式预约开启日期 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: Day1 <br>
         0x2: Day2 <br>
         0x3: Day3 <br>
         0x4: Day4 <br>
         0x5: Day5 <br>
         0x6: Day6 <br>
         0x7: Day7 <br>
         0x8: Day8 <br>
         0x9: Day9 <br>
         0xA: Day10 <br>
         0xB: Day11 <br>
         0xC: Day12 <br>
         0xD: Day13 <br>
         0xE: Day14 <br>
         0xF: Day15 <br>
         0x10: Day16 <br>
         0x11: Day17 <br>
         0x12: Day18 <br>
         0x13: Day19 <br>
         0x14: Day20 <br>
         0x15: Day21 <br>
         0x16: Day22 <br>
         0x17: Day23 <br>
         0x18: Day24 <br>
         0x19: Day25 <br>
         0x1A: Day26 <br>
         0x1B: Day27 <br>
         0x1C: Day28 <br>
         0x1D: Day29 <br>
         0x1E: Day30 <br>
         0x1F: Day31 <p>
     */
        public static final int AVAP_SENTRYMODDATE_547 = 557849387;

    /**
     * AVAP_SENTRYMODSTRTTI2_547 <p>
     * <br>
     * Function Describe: AVAP哨兵模式开始时间段2开始时间 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int AVAP_SENTRYMODSTRTTI2_547 = 557849388;

    /**
     * AVAP_SENTRYMODENDTI1_547 <p>
     * <br>
     * Function Describe: AVAP哨兵模式结束时间段1结束时间 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int AVAP_SENTRYMODENDTI1_547 = 557849389;

    /**
     * AVAP_SENTRYMODENDTI2_547 <p>
     * <br>
     * Function Describe: AVAP哨兵模式结束时间段2结束时间 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int AVAP_SENTRYMODENDTI2_547 = 557849390;

    /**
     * AVAP_SENTRYMODSTSFB_549 <p>
     * <br>
     * Function Describe: AVAP哨兵模式状态反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 哨兵模式状态开启 <br>
         0x2: 哨兵模式状态关闭 <br>
         0x3: reserved <p>
     */
        public static final int AVAP_SENTRYMODSTSFB_549 = 557849391;

    /**
     * AVAP_SENTRYMODALRM_549 <p>
     * <br>
     * Function Describe: 哨兵模式报警信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值； <br>
         0x1: 报警级别1（光报警） <br>
         0x2: 报警级别2（声+光报警） <br>
         0x3~0xF: reserved <p>
     */
        public static final int AVAP_SENTRYMODALRM_549 = 557849395;

    /**
     * ICC_SENTRYMODTI1VLD_61 <p>
     * <br>
     * Function Describe: ICC哨兵模式时间段1有效标志位反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: valid <br>
         0x2: invalid <br>
         0x3: Reserved <p>
     */
        public static final int ICC_SENTRYMODTI1VLD_61 = 557849398;

    /**
     * ICC_SENTRYMODTI2VLD_61 <p>
     * <br>
     * Function Describe: ICC哨兵模式时间段2有效标志位反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: valid <br>
         0x2: invalid <br>
         0x3: Reserved <p>
     */
        public static final int ICC_SENTRYMODTI2VLD_61 = 557849399;

    /**
     * ICC_SENTRYMODSTRTTI1_61 <p>
     * <br>
     * Function Describe: ICC哨兵模式开始时间段1开始时间 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_SENTRYMODSTRTTI1_61 = 557849400;

    /**
     * ICC_SENTRYMODDATE_61 <p>
     * <br>
     * Function Describe: ICC哨兵模式预约开启日期 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: Day1 <br>
         0x2: Day2 <br>
         0x3: Day3 <br>
         0x4: Day4 <br>
         0x5: Day5 <br>
         0x6: Day6 <br>
         0x7: Day7 <br>
         0x8: Day8 <br>
         0x9: Day9 <br>
         0xA: Day10 <br>
         0xB: Day11 <br>
         0xC: Day12 <br>
         0xD: Day13 <br>
         0xE: Day14 <br>
         0xF: Day15 <br>
         0x10: Day16 <br>
         0x11: Day17 <br>
         0x12: Day18 <br>
         0x13: Day19 <br>
         0x14: Day20 <br>
         0x15: Day21 <br>
         0x16: Day22 <br>
         0x17: Day23 <br>
         0x18: Day24 <br>
         0x19: Day25 <br>
         0x1A: Day26 <br>
         0x1B: Day27 <br>
         0x1C: Day28 <br>
         0x1D: Day29 <br>
         0x1E: Day30 <br>
         0x1F: Day31 <p>
     */
        public static final int ICC_SENTRYMODDATE_61 = 557849401;

    /**
     * ICC_SENTRYMODSTRTTI2_61 <p>
     * <br>
     * Function Describe: ICC哨兵模式开始时间段2开始时间 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_SENTRYMODSTRTTI2_61 = 557849402;

    /**
     * ICC_SENTRYMODENDTI1_61 <p>
     * <br>
     * Function Describe: ICC哨兵模式结束时间段1结束时间 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_SENTRYMODENDTI1_61 = 557849403;

    /**
     * ICC_SENTRYMODENDTI2_61 <p>
     * <br>
     * Function Describe: ICC哨兵模式结束时间段2结束时间 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int ICC_SENTRYMODENDTI2_61 = 557849404;

    /**
     * ICC_SENTRYMODSW_63 <p>
     * <br>
     * Function Describe: ICC哨兵模式开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 哨兵模式请求开启 <br>
         0x2: 哨兵模式请求关闭 <br>
         0x3: reserved <p>
     */
        public static final int ICC_SENTRYMODSW_63 = 557849405;

    /**
     * ICC_SENTRYALRMVIDEORXCFM_63 <p>
     * <br>
     * Function Describe: 哨兵报警视频文件接收确认 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 文件传输完成OK <br>
         0x2: 文件传输中断NOK <br>
         0x3: 文件校验失败 <br>
         0x4~0x7: reserved <p>
     */
        public static final int ICC_SENTRYALRMVIDEORXCFM_63 = 557849409;

    /**
     * ICC_SENTISNVTYSET_63 <p>
     * <br>
     * Function Describe: 二级震动报警灵敏度设置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 低 <br>
         0x2: 中 <br>
         0x3: 高 <p>
     */
        public static final int ICC_SENTISNVTYSET_63 = 557849410;

    /**
     * TBOX_SENTRYMODSTRTTI1_B6 <p>
     * <br>
     * Function Describe: TBOX哨兵模式开始时间段1开始时间 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int TBOX_SENTRYMODSTRTTI1_B6 = 557849413;

    /**
     * TBOX_SENTRYMODDATE_B6 <p>
     * <br>
     * Function Describe: TBOX哨兵模式预约开启日期 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: Day1 <br>
         0x2: Day2 <br>
         0x3: Day3 <br>
         0x4: Day4 <br>
         0x5: Day5 <br>
         0x6: Day6 <br>
         0x7: Day7 <br>
         0x8: Day8 <br>
         0x9: Day9 <br>
         0xA: Day10 <br>
         0xB: Day11 <br>
         0xC: Day12 <br>
         0xD: Day13 <br>
         0xE: Day14 <br>
         0xF: Day15 <br>
         0x10: Day16 <br>
         0x11: Day17 <br>
         0x12: Day18 <br>
         0x13: Day19 <br>
         0x14: Day20 <br>
         0x15: Day21 <br>
         0x16: Day22 <br>
         0x17: Day23 <br>
         0x18: Day24 <br>
         0x19: Day25 <br>
         0x1A: Day26 <br>
         0x1B: Day27 <br>
         0x1C: Day28 <br>
         0x1D: Day29 <br>
         0x1E: Day30 <br>
         0x1F: Day31 <p>
     */
        public static final int TBOX_SENTRYMODDATE_B6 = 557849414;

    /**
     * TBOX_SENTRYMODSTRTTI2_B6 <p>
     * <br>
     * Function Describe: TBOX哨兵模式开始时间段2开始时间 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int TBOX_SENTRYMODSTRTTI2_B6 = 557849415;

    /**
     * TBOX_SENTRYMODENDTI1_B6 <p>
     * <br>
     * Function Describe: TBOX哨兵模式结束时间段1结束时间 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int TBOX_SENTRYMODENDTI1_B6 = 557849416;

    /**
     * TBOX_SENTRYMODENDTI2_B6 <p>
     * <br>
     * Function Describe: TBOX哨兵模式结束时间段2结束时间 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int TBOX_SENTRYMODENDTI2_B6 = 557849417;

    /**
     * TBOX_SENTRYMODSW_B7 <p>
     * <br>
     * Function Describe: TBOX哨兵模式开关 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
         0x1: 哨兵模式请求开启 <br>
         0x2: 哨兵模式请求关闭 <br>
         0x3: 哨兵模式请求远程开启 <p>
     */
        public static final int TBOX_SENTRYMODSW_B7 = 557849418;

    /**
     * VCU_FSTEXTTIP_5A9 <p>
     * <br>
     * Function Describe: VCU功能安全文字提示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 灯灭 <br>
        0x1: 报亮 <p>
     */
        public static final int VCU_FSTEXTTIP_5A9 = 557849419;

    /**
     * PDCUFUELLEVELDISP_5A9 <p>
     * <br>
     * Function Describe: 剩余油量百分比 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int PDCUFUELLEVELDISP_5A9 = 557849420;

    /**
     * PDCUFUMILGVLD_5A9 <p>
     * <br>
     * Function Describe: 燃油续航里程有效位  <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 无效 <br>
        0x1: 有效 <p>
     */
        public static final int PDCUFUMILGVLD_5A9 = 557849421;

    /**
     * PDCUFUMILGE_5A9 <p>
     * <br>
     * Function Describe: 当前状态下燃油续航里程 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int PDCUFUMILGE_5A9 = 557849422;

    /**
     * BCM_DRLSWTSTS_51F <p>
     * <br>
     * Function Describe: 日间行车灯控制开关状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: on <br>
         0x1: off <p>
     */
        public static final int BCM_DRLSWTSTS_51F = 557849423;

    /**
     * PDCUCHKENGLAMP_31F <p>
     * <br>
     * Function Describe: 发动机故障灯 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Normal <br>
        0x1: “check engine”lamp <p>
     */
        public static final int PDCUCHKENGLAMP_31F = 557849424;

    /**
     * PDCURNGLIM_31F <p>
     * <br>
     * Function Describe: 整车行驶功能受影响提示信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 无提示 <br>
        0x1: 发动机系统异常，整车行驶功能受影响 <br>
        0x2: 动力电池系统异常，整车行驶功能受影响 <br>
        0x3: 前驱动电机系统异常，整车行驶功能受影响 <br>
        0x4: 发电机系统异常，整车行驶功能受影响 <br>
        0x5: DCDC系统异常，整车行驶功能受影响 <br>
        0x6: OBC系统异常 <br>
        0x7: 热管理系统异常，整车功能受影响 <br>
        0x8: 换挡系统异常，整车行驶功能受影响 <br>
        0x9: 动力系统级异常，整车行驶功能受影响 <br>
        0xA: 后驱动电机系统异常，整车行驶功能受影响 <br>
        0xB~0xF: 预留 <p>
     */
        public static final int PDCURNGLIM_31F = 557849425;

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
        public static final int PDCUENRGMOD_3D0 = 557849426;

    /**
     * EMSOIL_PFAULT_3D0 <p>
     * <br>
     * Function Describe: 发动机机油压力低故障 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: no warn <br>
        0x1: warn <p>
     */
        public static final int EMSOIL_PFAULT_3D0 = 557849427;

    /**
     * INDMODEGYFBDIS_3D0 <p>
     * <br>
     * Function Describe: 个性化模式能量回收显示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int INDMODEGYFBDIS_3D0 = 557849428;

    /**
     * INDMODACCMODDIS_3D0 <p>
     * <br>
     * Function Describe: 个性化模式加速模式显示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int INDMODACCMODDIS_3D0 = 557849429;

    /**
     * INDMODSTEEMODDIS_3D0 <p>
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
        public static final int INDMODSTEEMODDIS_3D0 = 557849430;

    /**
     * INDMODCREMODDIS_3D0 <p>
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
        public static final int INDMODCREMODDIS_3D0 = 557849431;

    /**
     * WORMSPEEDSTA_3D0 <p>
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
        public static final int WORMSPEEDSTA_3D0 = 557849432;

    /**
     * PDCUPARKCHARGEST_3D0 <p>
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
        public static final int PDCUPARKCHARGEST_3D0 = 557849433;

    /**
     * PDCUBMSTEMPLOWDRVLIMITHINT_3D0 <p>
     * <br>
     * Function Describe: 动力电池温度低行驶受限提示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 无限制 <br>
        0x1: 电池温度过低，车辆动力受限，请平稳驾驶 <br>
        0x2: 电池温度过低，驻车加热已开启，车辆暂时无法行驶 <br>
        0x3: 温度过低，车辆无法行驶 <br>
        0x4~0x7: 预留 <p>
     */
        public static final int PDCUBMSTEMPLOWDRVLIMITHINT_3D0 = 557849434;

    /**
     * VCU_OBC_REMIND_LAMP_54B <p>
     * <br>
     * Function Describe: 充电提醒及充电状态指示灯 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 灯灭 <br>
        0x1: 灯亮 <p>
     */
        public static final int VCU_OBC_REMIND_LAMP_54B = 557849441;

    /**
     * ICC_IHMSWT_534 <p>
     * <br>
     * Function Describe: 红外加热装置开关信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
        0x1: On <br>
        0x2: Off <br>
        0x3: Reserved <p>
     */
        public static final int ICC_IHMSWT_534 = 557849442;

    /**
     * ICC_IHMHEATSWT_534 <p>
     * <br>
     * Function Describe: 红外加热装置档位信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
        0x1: Low <br>
        0x2: Mid <br>
        0x3: High <br>
        0x4: Reserved <p>
     */
        public static final int ICC_IHMHEATSWT_534 = 557849443;

    /**
     * EHU_CONTEXTUALMODE_59C <p>
     * <br>
     * Function Describe: 情景模式 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0:Normalmode <br>
        0x1:mode1——小憩模式 <br>
        0x2:mode2——冥想模式 <br>
        0x3:mode3——露营模式 <br>
        0x4:mode4——通风模式 <br>
        0x5:mode5——宝宝模式 <br>
        0x6:mode6——观影模式 <br>
        0x7:mode7——一键升温 <br>
        0x8:mode8——一键降温 <br>
        0x9:mode9——极享模式 <br>
        0x10……3F:mode63 <p>
     */
        public static final int EHU_CONTEXTUALMODE_59C = 557849444;

    /**
     * IHM_IHMSTS_539 <p>
     * <br>
     * Function Describe: 红外加热装置开关状态反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
        0x1: ON <br>
        0x2: OFF <br>
        0x3: Not Available <br>
        0x4: Cooling <br>
        0x5: Error <br>
        0x6: Reserved <p>
     */
        public static final int IHM_IHMSTS_539 = 557849447;

    /**
     * IHM_IHMHEATSTS_539 <p>
     * <br>
     * Function Describe: 红外加热装置档位状态反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
        0x1: Low <br>
        0x2: Mid <br>
        0x3: High <br>
        0x4: Reserved <p>
     */
        public static final int IHM_IHMHEATSTS_539 = 557849448;

    /**
     * BCM_LRSEATHEATSTS_311 <p>
     * <br>
     * Function Describe: 左后座椅加热状态_BCM <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
        0x1: High <br>
        0x2: Med <br>
        0x3: Low <br>
        0x4: Off <br>
        0x5: OpenCnct <br>
        0x6: OverLoad <br>
        0x7: Unsatisfied <p>
     */
        public static final int BCM_LRSEATHEATSTS_311 = 557849451;

    /**
     * BCM_RRSEATHEATSTS_311 <p>
     * <br>
     * Function Describe: 右后座椅加热状态__BCM <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Reserved <br>
        0x1: High <br>
        0x2: Med <br>
        0x3: Low <br>
        0x4: Off <br>
        0x5: OpenCnct <br>
        0x6: OverLoad <br>
        0x7: Unsatisfied <p>
     */
        public static final int BCM_RRSEATHEATSTS_311 = 557849452;

    /**
     * TBOXSENTISNVTYSET_B6 <p>
     * <br>
     * Function Describe: TBOX灵敏度设置信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
        0x1: 低 <br>
        0x2: 中 <br>
        0x3: 高 <p>
     */
        public static final int TBOXSENTISNVTYSET_B6 = 557849455;

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
        public static final int ISGSYSTFLTDISP_21C = 557849456;

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
        public static final int ISGMTRTTEMPFLTDISP_21C = 557849457;

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
        public static final int ISGINVTEMPFLTDISP_21C = 557849458;

    /**
     * EHU_DRVRSEATBEDMODSWT_172 <p>
     * <br>
     * Function Describe: 主驾一键放平调用请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 无请求 <br>
        0x1: 预开启 <br>
        0x2: 开启 <br>
        0x3: 暂停 <br>
        0x4: 继续 <br>
        0x5: 预关闭 <br>
        0x6~0x7: 预留 <p>
     */
        public static final int EHU_DRVRSEATBEDMODSWT_172 = 557849460;

    /**
     * EHU_DRVRSEATBEDMEMCMD_172 <p>
     * <br>
     * Function Describe: 主驾一键放平位置保存请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 无请求 <br>
        0x1: 位置保存 <p>
     */
        public static final int EHU_DRVRSEATBEDMEMCMD_172 = 557849461;

    /**
     * EHU_PASSSEATBEDMODSWT_172 <p>
     * <br>
     * Function Describe: 副驾一键放平调用请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 无请求 <br>
        0x1: 预开启 <br>
        0x2: 开启 <br>
        0x3: 暂停 <br>
        0x4: 继续 <br>
        0x5: 预关闭 <br>
        0x6~0x7: 预留 <p>
     */
        public static final int EHU_PASSSEATBEDMODSWT_172 = 557849462;

    /**
     * EHU_PASSSEATBEDMEMCMD_172 <p>
     * <br>
     * Function Describe: 副驾一键放平位置保存请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 无请求 <br>
        0x1: 位置保存 <p>
     */
        public static final int EHU_PASSSEATBEDMEMCMD_172 = 557849463;

    /**
     * VCU_ABNORCHARGPORTALERT_3BC <p>
     * <br>
     * Function Describe: 充电口异常告警 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
        0x1: 整车系统自检异常，充电功能受限，请保持充电口盖关闭并进店维修。 <br>
        0x2~0x7: Reserved <p>
     */
        public static final int VCU_ABNORCHARGPORTALERT_3BC = 557849465;

    /**
     * VCULASTCHRGTRIPAVRGPWRCNSPTN_AS_3B8 <p>
     * <br>
     * Function Describe: 自上次充电后行程平均电耗 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCULASTCHRGTRIPAVRGPWRCNSPTN_AS_3B8 = 557849470;

    /**
     * VCU_TRIPAAVRGPWRCNSPTN_AS_3B8 <p>
     * <br>
     * Function Describe: Trip A行程平均电耗 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_TRIPAAVRGPWRCNSPTN_AS_3B8 = 557849471;

    /**
     * VCU_TRIPBAVRGPWRCNSPTN_AS_3B8 <p>
     * <br>
     * Function Describe: Trip B行程平均电耗 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_TRIPBAVRGPWRCNSPTN_AS_3B8 = 557849472;

    /**
     * VCU_100KMREMDRVGRNG_AB_3B8 <p>
     * <br>
     * Function Describe: 近100km剩余续驶里程 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_100KMREMDRVGRNG_AB_3B8 = 557849475;

    /**
     * VCU_PWRCNSPTNDIAG_AS_3B8 <p>
     * <br>
     * Function Describe: 电耗诊断信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
        0x1: 平稳驾驶可显著提升续航里程。 <br>
        0x2: 电耗表现堪称顶级，继续与爱车一起为节能减排贡献力量吧！ <br>
        0x3: 电耗表现优异，请继续保持。 <br>
        0x4: 行驶途中空调消耗电量较高时，可开启节能模式，延长续驶里程。 <br>
        0x5: 能量回收占比较低时，推荐试试One_Pedal模式！ <br>
        0x6: 平稳驾驶可降低耗电量。风驰电掣消耗电量较高哦！ <br>
        0x7: 能量回收占比较低时，可尝试轻踩踏板平缓行驶。 <br>
        0x8~0x1F: Reserved <p>
     */
        public static final int VCU_PWRCNSPTNDIAG_AS_3B8 = 557849476;

    /**
     * PDCUENRGMODREJHINT_AS_3B8 <p>
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
        public static final int PDCUENRGMODREJHINT_AS_3B8 = 557849491;

    /**
     * VCU_PARKING_REMIND_PGEAR_AB_AS_3B8 <p>
     * <br>
     * Function Describe: P挡未驻车提醒 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 无提示 <br>
        0x1: 有提示 <br>
        0x2: Reserved <p>
     */
        public static final int VCU_PARKING_REMIND_PGEAR_AB_AS_3B8 = 557849492;

    /**
     * PDCUHYDOPERMOD_AS_3B8 <p>
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
        public static final int PDCUHYDOPERMOD_AS_3B8 = 557849493;

    /**
     * PDCUENRGMODFLTHINT_AS_3B8 <p>
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
        public static final int PDCUENRGMODFLTHINT_AS_3B8 = 557849494;

    /**
     * PDCUIDLEMODST_AS_3B8 <p>
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
        public static final int PDCUIDLEMODST_AS_3B8 = 557849495;

    /**
     * PDCUEMISSTESTMODST_AS_3B8 <p>
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
        public static final int PDCUEMISSTESTMODST_AS_3B8 = 557849498;

    /**
     * PDCUENGSYSTWARN_AS_3B8 <p>
     * <br>
     * Function Describe: 增程器起机提醒 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
        0x1: 已起动增程器，对长期未起动的增程器进行自我养护 <br>
        0x2~0x3: Reserved <p>
     */
        public static final int PDCUENGSYSTWARN_AS_3B8 = 557849499;

    /**
     * PDCUEVST_AS_3B8 <p>
     * <br>
     * Function Describe: 增程器工作状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: EV <br>
        0x1: R-EV <br>
        0x2~0x3: Reserved <p>
     */
        public static final int PDCUEVST_AS_3B8 = 557849500;

    /**
     * PDCUREFSWITCHSTS_AS_3B8 <p>
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
        public static final int PDCUREFSWITCHSTS_AS_3B8 = 557849501;

    /**
     * PDCUREFUNOTALLWD_AS_3B8 <p>
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
        public static final int PDCUREFUNOTALLWD_AS_3B8 = 557849502;

    /**
     * PDCUFUFILRDOORRMN_AS_3B8 <p>
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
        public static final int PDCUFUFILRDOORRMN_AS_3B8 = 557849503;

    /**
     * PDCUFUTANKRELSPROGS_AS_3B8 <p>
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
        public static final int PDCUFUTANKRELSPROGS_AS_3B8 = 557849504;

    /**
     * HDCU_WASHMODPROMPTSIG_AB_AS_3B8 <p>
     * <br>
     * Function Describe: 洗车模式提示信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
        0x1: 传送带洗车EPB释放异常提示 <br>
        0x2: 传送带洗车切P挡提示 <br>
        0x3~0x <p>
     */
        public static final int HDCU_WASHMODPROMPTSIG_AB_AS_3B8 = 557849506;

    /**
     * VCULASTCHRGTRIPAVRGPWRCNSPTN_AB_3B8 <p>
     * <br>
     * Function Describe: 自上次充电后行程平均电耗 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCULASTCHRGTRIPAVRGPWRCNSPTN_AB_3B8 = 557849507;

    /**
     * VCU_TRIPAAVRGPWRCNSPTN_AB_3B8 <p>
     * <br>
     * Function Describe: Trip A行程平均电耗 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_TRIPAAVRGPWRCNSPTN_AB_3B8 = 557849508;

    /**
     * VCU_TRIPBAVRGPWRCNSPTN_AB_3B8 <p>
     * <br>
     * Function Describe: Trip B行程平均电耗 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_TRIPBAVRGPWRCNSPTN_AB_3B8 = 557849509;

    /**
     * VCU_10KMREMDRVGRNG_AB_3B8 <p>
     * <br>
     * Function Describe: 近10km剩余续驶里程 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_10KMREMDRVGRNG_AB_3B8 = 557849510;

    /**
     * VCU_SUBTOLEGYCNSE_AB_3B8 <p>
     * <br>
     * Function Describe: 小计能耗 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_SUBTOLEGYCNSE_AB_3B8 = 557849511;

    /**
     * VCU_ECCCNSEEGY_AS_56B <p>
     * <br>
     * Function Describe: 车辆空调系统消耗能量 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_ECCCNSEEGY_AS_56B = 557849512;

    /**
     * VCU_VEHDRVCNSEEGY_AS_56B <p>
     * <br>
     * Function Describe: 车辆行驶消耗能量  <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_VEHDRVCNSEEGY_AS_56B = 557849513;

    /**
     * VCU_BHMCNSEEGY_AS_56B <p>
     * <br>
     * Function Describe: 电池热管理消耗能量 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_BHMCNSEEGY_AS_56B = 557849514;

    /**
     * VCU_VEHDRVCNSEEGY_AB_56B <p>
     * <br>
     * Function Describe: 车辆行驶消耗能量  <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_VEHDRVCNSEEGY_AB_56B = 557849523;

    /**
     * VCU_ECCCNSEEGY_AB_56B <p>
     * <br>
     * Function Describe: 车辆空调系统消耗能量 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_ECCCNSEEGY_AB_56B = 557849525;

    /**
     * VCU_BHMCNSEEGY_AB_56B <p>
     * <br>
     * Function Describe: 电池热管理消耗能量 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_BHMCNSEEGY_AB_56B = 557849526;

    /**
     * VCU_INDMODACCMODDIS_3E8 <p>
     * <br>
     * Function Describe: 个性化模式加速模式显示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0：初始值； <br>
        0x1~0x65：0~100% <p>
     */
        public static final int VCU_INDMODACCMODDIS_3E8 = 557849528;

    /**
     * VCU_INDMODEGYFBDIS_3E8 <p>
     * <br>
     * Function Describe: 个性化模式能量回收显示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0：初始值； <br>
        0x1~0x65：0~100% <p>
     */
        public static final int VCU_INDMODEGYFBDIS_3E8 = 557849529;

    /**
     * VCU_WORMSPEEDSTA_3E8 <p>
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
        public static final int VCU_WORMSPEEDSTA_3E8 = 557849530;

    /**
     * VCU_INDMODSTEEMODDIS_3E8 <p>
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
        public static final int VCU_INDMODSTEEMODDIS_3E8 = 557849531;

    /**
     * VCU_INDMODCREMODDIS_3E8 <p>
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
        public static final int VCU_INDMODCREMODDIS_3E8 = 557849532;

    /**
     * VCU_AUTPOWOFFFUNSTA_3E8 <p>
     * <br>
     * Function Describe: 自动下电功能状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
        0x1: 正常计时下电 <br>
        0x2: 不正常计时下电 <br>
        0x3: Reserved <p>
     */
        public static final int VCU_AUTPOWOFFFUNSTA_3E8 = 557849533;

    /**
     * ICCLOGINUID_59C <p>
     * <br>
     * Function Describe: ICC车端账户登录UID <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: initial <br>
        0x1: 车主账号 <br>
        0x2: 授权账号1 <br>
        0x3: 授权账号2 <br>
        0x4: 授权账号3 <br>
        0x5: 授权账号4 <br>
        0x6: 授权账号5 <br>
        0x7: 授权账号6 <br>
        0x8: 授权账号7 <br>
        0x9: 授权账号8 <br>
        0xA: 游客账号 <br>
        0xB~0xE: reserved <br>
        0xF: invalid <p>
     */
        public static final int ICCLOGINUID_59C = 557849534;

    /**
     * VCU_SETARRIVESOC_5BC <p>
     * <br>
     * Function Describe: 到达充电站最小电量百分比 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_SETARRIVESOC_5BC = 557849535;

    /**
     * VCU_SETLEFTSOC_5BC <p>
     * <br>
     * Function Describe: 离开充电站最大电量百分比 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_SETLEFTSOC_5BC = 557849536;

    /**
     * VCU_ENGCONSM_USEINMAP_5BC <p>
     * <br>
     * Function Describe: 预估能耗（用于地图） <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_ENGCONSM_USEINMAP_5BC = 557849537;

    /**
     * VCU_DRVMODE_USEINMAP_5BC <p>
     * <br>
     * Function Describe: 导航用驾驶模式 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: COMFORT - 舒适模式 <br>
        0x1: SPORT - 运动模式 <br>
        0x2: SPORTPLUS - 运动Plus模式 <br>
        0x3: ECOPRO - 节能模式 <br>
        0x4: ECOPROPLUS - 节能Plus模式 <br>
        0x5~0x7: reserved <p>
     */
        public static final int VCU_DRVMODE_USEINMAP_5BC = 557849538;

    /**
     * VCU_BATMAXCHGPWR_USEINMAP_5BC <p>
     * <br>
     * Function Describe: 电池最大充电功率 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_BATMAXCHGPWR_USEINMAP_5BC = 557849539;

    /**
     * VCU_NORMALMODAVRGPWRCNSPTN_AB_3B8 <p>
     * <br>
     * Function Describe: 标准工况下的平均电耗 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_NORMALMODAVRGPWRCNSPTN_AB_3B8 = 557849541;

    /**
     * VCU_PWRCNSPTNDIAG_AB_3B8 <p>
     * <br>
     * Function Describe: 电耗诊断信号 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
        0x1: 平稳驾驶可显著提升续航里程。 <br>
        0x2: 电耗表现堪称顶级，继续与爱车一起为节能减排贡献力量吧！ <br>
        0x3: 电耗表现优异，请继续保持。 <br>
        0x4: 行驶途中空调消耗电量较高时，可开启节能模式，延长续驶里程。 <br>
        0x5: 能量回收占比较低时，推荐试试One_Pedal模式！ <br>
        0x6: 平稳驾驶可降低耗电量。风驰电掣消耗电量较高哦！ <br>
        0x7: 能量回收占比较低时，可尝试轻踩踏板平缓行驶。 <br>
        0x8~0x1F: Reserved <p>
     */
        public static final int VCU_PWRCNSPTNDIAG_AB_3B8 = 557849542;

    /**
     * BMS_CHGMAP1_SOC_642 <p>
     * <br>
     * Function Describe: 充电曲线1-SOC <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int BMS_CHGMAP1_SOC_642 = 557849544;

    /**
     * BMS_CHGMAP1_PWR_642 <p>
     * <br>
     * Function Describe: 充电曲线1-充电功率 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int BMS_CHGMAP1_PWR_642 = 557849545;

    /**
     * BMS_CHGMAP2_SOC_642 <p>
     * <br>
     * Function Describe: 充电曲线2-SOC <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int BMS_CHGMAP2_SOC_642 = 557849546;

    /**
     * BMS_CHGMAP2_PWR_642 <p>
     * <br>
     * Function Describe: 充电曲线2-充电功率 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int BMS_CHGMAP2_PWR_642 = 557849547;

    /**
     * BMS_CHGMAP3_SOC_642 <p>
     * <br>
     * Function Describe: 充电曲线3-SOC <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int BMS_CHGMAP3_SOC_642 = 557849548;

    /**
     * BMS_CHGMAP3_PWR_642 <p>
     * <br>
     * Function Describe: 充电曲线3-充电功率 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int BMS_CHGMAP3_PWR_642 = 557849549;

    /**
     * BMS_CHGMAP4_SOC_642 <p>
     * <br>
     * Function Describe: 充电曲线4-SOC <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int BMS_CHGMAP4_SOC_642 = 557849550;

    /**
     * BMS_CHGMAP4_PWR_642 <p>
     * <br>
     * Function Describe: 充电曲线4-充电功率 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int BMS_CHGMAP4_PWR_642 = 557849551;

    /**
     * BMS_CHGMAP5_SOC_642 <p>
     * <br>
     * Function Describe: 充电曲线5-SOC <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int BMS_CHGMAP5_SOC_642 = 557849552;

    /**
     * BMS_CHGMAP5_PWR_642 <p>
     * <br>
     * Function Describe: 充电曲线5-充电功率 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int BMS_CHGMAP5_PWR_642 = 557849553;

    /**
     * BMS_CHGMAP6_SOC_642 <p>
     * <br>
     * Function Describe: 充电曲线6-SOC <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int BMS_CHGMAP6_SOC_642 = 557849554;

    /**
     * BMS_CHGMAP6_PWR_642 <p>
     * <br>
     * Function Describe: 充电曲线6-充电功率 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int BMS_CHGMAP6_PWR_642 = 557849555;

    /**
     * BMS_CHGMAP7_SOC_642 <p>
     * <br>
     * Function Describe: 充电曲线7-SOC <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int BMS_CHGMAP7_SOC_642 = 557849556;

    /**
     * BMS_CHGMAP7_PWR_642 <p>
     * <br>
     * Function Describe: 充电曲线7-充电功率 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int BMS_CHGMAP7_PWR_642 = 557849557;

    /**
     * VCU_CURTACCHRGCURTLIMIT_3BC <p>
     * <br>
     * Function Describe: 车辆当前交流充电电流限值 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_CURTACCHRGCURTLIMIT_3BC = 557849558;

    /**
     * SDM_PASSSECUBLTALRMSTS_319 <p>
     * <br>
     * Function Describe: 副驾安全带报警状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Lamp Off <br>
        0x1: Fault(Reserved) <br>
        0x2: Lamp On <br>
        0x3: Reserved <p>
     */
        public static final int SDM_PASSSECUBLTALRMSTS_319 = 557849563;

    /**
     * CMRR_RR_SDAWARN2_58E <p>
     * <br>
     * Function Describe: SDA报警2 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
        0x1: Active <p>
     */
        public static final int CMRR_RR_SDAWARN2_58E = 557849575;

    /**
     * CMRR_RR_SDASTS2_58E <p>
     * <br>
     * Function Describe: SDA状态2 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Default <br>
        0x1: No Fault <br>
        0x2: Fault <br>
        0x3: Dynamic calibration running <p>
     */
        public static final int CMRR_RR_SDASTS2_58E = 557849576;

    /**
     * CMRR_RL_SDASTS2_57D <p>
     * <br>
     * Function Describe: SDA状态2 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Default <br>
        0x1: No Fault <br>
        0x2: Fault <br>
        0x3: Dynamic calibration running <p>
     */
        public static final int CMRR_RL_SDASTS2_57D = 557849580;

    /**
     * CMRR_RL_SDAWARN2_57D <p>
     * <br>
     * Function Describe: SDA报警2 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Inactive <br>
        0x1: Active <p>
     */
        public static final int CMRR_RL_SDAWARN2_57D = 557849581;

    /**
     * DSMC_DRVRSEATBEDADJSTSFB_328 <p>
     * <br>
     * Function Describe: 主驾一键放平运行状态反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 无反馈 <br>
        0x1: 静止 <br>
        0x2: 运动中 <br>
        0x3: 执行成功 <br>
        0x4: 执行失败 <br>
        0x5~0x7: 预留 <p>
     */
        public static final int DSMC_DRVRSEATBEDADJSTSFB_328 = 557849584;

    /**
     * DSMC_PASSSEATBEDADJSTSFB_328 <p>
     * <br>
     * Function Describe: 副驾一键放平运行状态反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 无反馈 <br>
        0x1: 静止 <br>
        0x2: 运动中 <br>
        0x3: 执行成功 <br>
        0x4: 执行失败 <br>
        0x5~0x7: 预留 <p>
     */
        public static final int DSMC_PASSSEATBEDADJSTSFB_328 = 557849585;

    /**
     * DSMC_DRVRSEATBEDMODSTSFB_328 <p>
     * <br>
     * Function Describe: 主驾一键放平调出反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 无反馈 <br>
        0x1: 预开启 <br>
        0x2: 开启 <br>
        0x3: 预关闭 <br>
        0x4: 关闭 <br>
        0x5~0x7: 预留 <p>
     */
        public static final int DSMC_DRVRSEATBEDMODSTSFB_328 = 557849586;

    /**
     * DSMC_DRVRSEATBEDPOSMEMFB_328 <p>
     * <br>
     * Function Describe: 主驾一键放平位置保存反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 无反馈 <br>
        0x1: 保存成功 <br>
        0x2: 保存失败 <br>
        0x3: 预留 <p>
     */
        public static final int DSMC_DRVRSEATBEDPOSMEMFB_328 = 557849587;

    /**
     * DSMC_PASSSEATBEDMODSTSFB_328 <p>
     * <br>
     * Function Describe: 副驾一键放平调出反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 无反馈 <br>
        0x1: 预开启 <br>
        0x2: 开启 <br>
        0x3: 预关闭 <br>
        0x4: 关闭 <br>
        0x5~0x7: 预留 <p>
     */
        public static final int DSMC_PASSSEATBEDMODSTSFB_328 = 557849588;

    /**
     * DSMC_PASSSEATBEDPOSMEMFB_328 <p>
     * <br>
     * Function Describe: 副驾一键放平位置保存反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 无反馈 <br>
        0x1: 保存成功 <br>
        0x2: 保存失败 <br>
        0x3: 预留 <p>
     */
        public static final int DSMC_PASSSEATBEDPOSMEMFB_328 = 557849589;

    /**
     * ICC_A2BINITSTATUS_320 <p>
     * <br>
     * Function Describe: 车机A2B初始化状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Not Finished <br>
        0x1: Finished <br>
        0x2~0x3: Reserved <p>
     */
        public static final int ICC_A2BINITSTATUS_320 = 557849590;

    /**
     * VCU_POWSYSSELFTESTABNOPROM_57B <p>
     * <br>
     * Function Describe: 动力系统自检异常提示 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 不显示 <br>
        0x1: 显示 <p>
     */
        public static final int VCU_POWSYSSELFTESTABNOPROM_57B = 557849591;

    /**
     * EMSCOOLTT_2F6 <p>
     * <br>
     * Function Describe: Coolant temperature.Engine coolant temperature <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int EMSCOOLTT_2F6 = 557849592;

    /**
     * EMSCOOLTVLD_2F6 <p>
     * <br>
     * Function Describe: Coolant validity.When the  Ems have set a failure code on the signal, a calculated limphome value will be transmitted. <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Initializing <br>
        0x1: Vaild <br>
        0x2: Invalid <br>
        0x3: Reserved <p>
     */
        public static final int EMSCOOLTVLD_2F6 = 557849593;

    /**
     * EMSOIL_PFAULT_SIG_2F6 <p>
     * <br>
     * Function Describe: 机油压力信号异常故障 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: no warning <br>
        0x1: warning <p>
     */
        public static final int EMSOIL_PFAULT_SIG_2F6 = 557849594;

    /**
     * VCU_VEHACSYCNSEEGY_579 <p>
     * <br>
     * Function Describe: 车辆其它消耗能量 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_VEHACSYCNSEEGY_579 = 557849595;

    /**
     * VCU_EGYRECOVEGY_579 <p>
     * <br>
     * Function Describe: 能量回收能量 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int VCU_EGYRECOVEGY_579 = 557849596;

    /**
     * VCU_DRVGMILGDISPTYPCFM_AS_50C <p>
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
        public static final int VCU_DRVGMILGDISPTYPCFM_AS_50C = 557849597;

    /**
     * RESETFLG_TRIPFROMLASTCHARGE_357 <p>
     * <br>
     * Function Describe: 自上次充电后行程重置标志位 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
        0x1: 重置 <p>
     */
        public static final int RESETFLG_TRIPFROMLASTCHARGE_357 = 557849600;

    /**
     * EHU_SELFDRYREQ_59C <p>
     * <br>
     * Function Describe: 自干燥功能开关状态请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Inactive <br>
        0x1: active <p>
     */
        public static final int EHU_SELFDRYREQ_59C = 557849601;

    /**
     * ECC_SELFDRYRESP_4FC <p>
     * <br>
     * Function Describe: 自干燥功能状态反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 自干燥不使能 <br>
        0x1: 自干燥使能 <p>
     */
        public static final int ECC_SELFDRYRESP_4FC = 557849602;

    /**
     * TBOX_SENTRYMODTI1VLD_B6 <p>
     * <br>
     * Function Describe: TBOX哨兵模式时间段1有效标志位反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
        0x1: valid <br>
        0x2: invalid <br>
        0x3: Reserved <p>
     */
        public static final int TBOX_SENTRYMODTI1VLD_B6 = 557849618;

    /**
     * TBOX_SENTRYMODTI2VLD_B6 <p>
     * <br>
     * Function Describe: TBOX哨兵模式时间段2有效标志位反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 初始值 <br>
        0x1: valid <br>
        0x2: invalid <br>
        0x3: Reserved <p>
     */
        public static final int TBOX_SENTRYMODTI2VLD_B6 = 557849619;

    /**
     * EHU_PASSSEATLEGRESTMANREQ_533 <p>
     * <br>
     * Function Describe: 副驾驶座椅腿托调节请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: Off <br>
        0x1: Up <br>
        0x2: Down <br>
        0x3: Reserved <p>
     */
        public static final int EHU_PASSSEATLEGRESTMANREQ_533 = 557849620;

    /**
     * EHU_PASSSEATLEGRESTPERCENTREQ_52 <p>
     * <br>
     * Function Describe: 副驾座椅腿托百分比%调节请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <p>
     */
        public static final int EHU_PASSSEATLEGRESTPERCENTREQ_52 = 557849621;

    /**
     * DSMC_PASSSEATLEGRESTPERCENTADJFB_62 <p>
     * <br>
     * Function Describe: 副驾座椅腿托位置%调节反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Void <br>
        0x1: Successful <br>
        0x2: Failed <br>
        0x3: Reserved <p>
     */
        public static final int DSMC_PASSSEATLEGRESTPERCENTADJFB_62 = 557849622;

    /**
     * ICCLSSYSSTS_320 <p>
     * <br>
     * Function Describe: ICC 扬声器系统状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 扬声器系统正常 <br>
        0x1: 仅车内扬声器系统异常 <br>
        0x2: 仅车外扬声器系统异常 <br>
        0x3: 车内和车外扬声器系统异常 <br>
        0x4~0x6: reserved <br>
        0x7: invalid <p>
     */
        public static final int ICCLSSYSSTS_320 = 557849623;

    /**
     * EHU_PASSSEATZEROGRAVITYREQ_3A8 <p>
     * <br>
     * Function Describe: 一键零重力请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 无请求 <br>
        0x1: 开启 <br>
        0x2: 关闭 <br>
        0x3: 暂停 <p>
     */
        public static final int EHU_PASSSEATZEROGRAVITYREQ_3A8 = 557849624;

    /**
     * EHU_PASSSEATZGRAVITYMEMCMD_3A8 <p>
     * <br>
     * Function Describe: 副驾一键零重力位置保存请求 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:WRITE <p>
     * Signal Value: <br>
        0x0: 无请求 <br>
        0x1: 位置保存 <br>
        0x2: 复位请求 <br>
        0x3: 预留 <p>
     */
        public static final int EHU_PASSSEATZGRAVITYMEMCMD_3A8 = 557849625;

    /**
     * DSMC_PASSEATLEGRESTPOSN_328 <p>
     * <br>
     * Function Describe: 副驾驶座椅腿托位置 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <p>
     */
        public static final int DSMC_PASSEATLEGRESTPOSN_328 = 557849626;

    /**
     * DSMC_PASSSEATLEGRESTSWTSTS_328 <p>
     * <br>
     * Function Describe: 副驾驶座椅腿托开关状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
        0x1: Fwd <br>
        0x2: Rwd <br>
        0x3: Defect <p>
     */
        public static final int DSMC_PASSSEATLEGRESTSWTSTS_328 = 557849627;

    /**
     * DSMC_PASSSEATLEGRESTADJSTS_328 <p>
     * <br>
     * Function Describe: 副驾驶座椅腿托调节状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Off <br>
        0x1: Fwd <br>
        0x2: Rwd <br>
        0x3: Defect <p>
     */
        public static final int DSMC_PASSSEATLEGRESTADJSTS_328 = 557849628;

    /**
     * DSMC_PASSSEATZEROGRAVITYMODSTSFB_328 <p>
     * <br>
     * Function Describe: 副驾一键零重力模式状态反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 无反馈 <br>
        0x1: 开启 <br>
        0x2: 关闭 <br>
        0x3: 暂停 <p>
     */
        public static final int DSMC_PASSSEATZEROGRAVITYMODSTSFB_328 = 557849629;

    /**
     * DSMC_PASSSEATZEROGRAVITYADJSTSFB_328 <p>
     * <br>
     * Function Describe: 副驾一键零重力运行状态反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 无反馈 <br>
        0x1: 静止 <br>
        0x2: 运动中 <br>
        0x3: 执行成功 <br>
        0x4: 执行失败 <br>
        0x5~0x7: 预留 <p>
     */
        public static final int DSMC_PASSSEATZEROGRAVITYADJSTSFB_328 = 557849630;

    /**
     * DSMC_PASSSEATZGRAVITYPOSMEMFB_328 <p>
     * <br>
     * Function Describe: 副驾一键零重力位置保存反馈 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: 无反馈 <br>
        0x1: 保存成功 <br>
        0x2: 保存失败 <br>
        0x3: 复位成功 <br>
        0x4: 复位失败 <br>
        0x5~0x7: 预留 <p>
     */
        public static final int DSMC_PASSSEATZGRAVITYPOSMEMFB_328 = 557849632;

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
        public static final int SELRI_287 = 557849633;

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
        public static final int VOLUP_287 = 557849634;

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
        public static final int VOLDWN_287 = 557849635;

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
        public static final int MOVEPREV_287 = 557849636;

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
        public static final int MOVENEXT_287 = 557849637;

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
        public static final int USRDEFDKEY_287 = 557849638;

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
        public static final int ICCSPEECHRECOGKEY_287 = 557849639;

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
        public static final int VOLMUTE_287 = 557849643;

    /**
     * AMP_GETHUTINFOSTS_1_38B <p>
     * <br>
     * Function Describe: 获取主机初始化信息Get HUT Status_1 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: Not Finished <br>
        0x1: Finished <br>
        0x2: Handshake OK <br>
        0x3: Reserved <p>
     */
        public static final int AMP_GETHUTINFOSTS_1_38B = 557849648;

    /**
     * BCM_INLOOPLAMPOUTP_3A9 <p>
     * <br>
     * Function Describe: 智驾小蓝灯输出状态 <p>
     * VehiclePropertyChangeMode:ON_CHANGE <p>
     * VehiclePropertyAccess:READ <p>
     * Signal Value: <br>
        0x0: off <br>
        0x1: on <p>
     */
        public static final int BCM_INLOOPLAMPOUTP_3A9 = 557849677;


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
    public ALN50VehiclePropertyIds() {
    }

    /**
     * Gets a user-friendly representation of a property.
     */
    @AddedInOrBefore(majorVersion = 33)
    public static String toString(int property) {
        return CarPropertyHelper.toString(property);
    }
}