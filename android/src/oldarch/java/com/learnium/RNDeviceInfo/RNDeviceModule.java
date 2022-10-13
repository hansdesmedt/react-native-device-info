package com.learnium.RNDeviceInfo;

import android.annotation.SuppressLint;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;

import java.util.Map;

public class RNDeviceModule extends ReactContextBaseJavaModule {

    private RNDeviceModuleImpl rnDeviceModuleImpl;
    
    RNDeviceModule(ReactApplicationContext context) {
        super(context);
        rnDeviceModuleImpl = new RNDeviceModuleImpl(context);
    }

    @Override
    public void initialize() {
        rnDeviceModuleImpl.initialize();
    }

    @Override
    public void onCatalystInstanceDestroy() {
        rnDeviceModuleImpl.onCatalystInstanceDestroy();
    }

    @Override
    public String getName() {
        return rnDeviceModuleImpl.NAME;
    }

    @Override
    public Map<String, Object> getConstants() {
        return rnDeviceModuleImpl.getConstants();
    }

    @ReactMethod
    public void addListener(String eventName) {
        // Keep: Required for RN built in Event Emitter Calls.
    }

    @ReactMethod
    public void removeListeners(Integer count) {
        // Keep: Required for RN built in Event Emitter Calls.
    }

    @ReactMethod
    public void isEmulator(Promise p) {
        rnDeviceModuleImpl.isEmulator(p);
    }

    @SuppressLint("HardwareIds")
    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isEmulatorSync() {
        return rnDeviceModuleImpl.isEmulatorSync();
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public float getFontScaleSync() { return rnDeviceModuleImpl.getFontScaleSync(); }
    @ReactMethod
    public void getFontScale(Promise p) { rnDeviceModuleImpl.getFontScale(p); }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isPinOrFingerprintSetSync() {
        return rnDeviceModuleImpl.isPinOrFingerprintSetSync();
    }
    @ReactMethod
    public void isPinOrFingerprintSet(Promise p) { rnDeviceModuleImpl.isPinOrFingerprintSet(p); }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @SuppressWarnings("ConstantConditions")
    public String getIpAddressSync() {
        return rnDeviceModuleImpl.getIpAddressSync();
    }

    @ReactMethod
    public void getIpAddress(Promise p) { rnDeviceModuleImpl.getIpAddress(p); }

    @SuppressWarnings("deprecation")
    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isCameraPresentSync() {
        return rnDeviceModuleImpl.isCameraPresentSync();
    }
    @ReactMethod
    public void isCameraPresent(Promise p) { rnDeviceModuleImpl.isCameraPresent(p); }

    @SuppressLint("HardwareIds")
    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getMacAddressSync() {
        return rnDeviceModuleImpl.getMacAddressSync();
    }

    @ReactMethod
    public void getMacAddress(Promise p) { rnDeviceModuleImpl.getMacAddress(p); }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getCarrierSync() {
        return rnDeviceModuleImpl.getCarrierSync();
    }
    @ReactMethod
    public void getCarrier(Promise p) { rnDeviceModuleImpl.getCarrier(p); }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public double getTotalDiskCapacitySync() {
        return rnDeviceModuleImpl.getTotalDiskCapacitySync();
    }
    @ReactMethod
    public void getTotalDiskCapacity(Promise p) { rnDeviceModuleImpl.getTotalDiskCapacity(p); }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public double getFreeDiskStorageSync() {
        return rnDeviceModuleImpl.getFreeDiskStorageSync();
    }
    @ReactMethod
    public void getFreeDiskStorage(Promise p) { rnDeviceModuleImpl.getFreeDiskStorage(p); }

    @Deprecated
    @ReactMethod(isBlockingSynchronousMethod = true)
    public double getTotalDiskCapacityOldSync() {
        return rnDeviceModuleImpl.getTotalDiskCapacityOldSync();
    }
    @ReactMethod
    public void getTotalDiskCapacityOld(Promise p) { rnDeviceModuleImpl.getTotalDiskCapacityOld(p); }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public double getFreeDiskStorageOldSync() {
        return rnDeviceModuleImpl.getFreeDiskStorageSync();
    }
    @ReactMethod
    public void getFreeDiskStorageOld(Promise p) { rnDeviceModuleImpl.getFreeDiskStorage(p); }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isBatteryChargingSync(){
        return rnDeviceModuleImpl.isBatteryChargingSync();
    }
    @ReactMethod
    public void isBatteryCharging(Promise p) { rnDeviceModuleImpl.isBatteryCharging(p); }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public double getUsedMemorySync() {
        return rnDeviceModuleImpl.getUsedMemorySync();
    }

    @ReactMethod
    public void getUsedMemory(Promise p) { rnDeviceModuleImpl.getUsedMemory(p); }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getPowerStateSync() {
        return rnDeviceModuleImpl.getPowerStateSync();
    }

    @ReactMethod
    public void getPowerState(Promise p) { rnDeviceModuleImpl.getPowerState(p); }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public double getBatteryLevelSync() {
        return rnDeviceModuleImpl.getBatteryLevelSync();
    }

    @ReactMethod
    public void getBatteryLevel(Promise p) { rnDeviceModuleImpl.getBatteryLevel(p); }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isAirplaneModeSync() {
        return rnDeviceModuleImpl.isAirplaneModeSync();
    }
    @ReactMethod
    public void isAirplaneMode(Promise p) { rnDeviceModuleImpl.isAirplaneMode(p); }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean hasGmsSync() {
        return rnDeviceModuleImpl.hasGmsSync();
    }
    @ReactMethod
    public void hasGms(Promise p) { rnDeviceModuleImpl.hasGms(p); }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean hasHmsSync() {
        return rnDeviceModuleImpl.hasHmsSync();
    }
    @ReactMethod
    public void hasHms(Promise p) { rnDeviceModuleImpl.hasHms(p); }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean hasSystemFeatureSync(String feature) {
        return rnDeviceModuleImpl.hasSystemFeatureSync(feature);
    }
    @ReactMethod
    public void hasSystemFeature(String feature, Promise p) { rnDeviceModuleImpl.hasSystemFeature(feature, p); }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableArray getSystemAvailableFeaturesSync() {
        return rnDeviceModuleImpl.getSystemAvailableFeaturesSync();
    }
    @ReactMethod
    public void getSystemAvailableFeatures(Promise p) { rnDeviceModuleImpl.getSystemAvailableFeatures(p); }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isLocationEnabledSync() {
        return rnDeviceModuleImpl.isLocationEnabledSync();
    }
    @ReactMethod
    public void isLocationEnabled(Promise p) { rnDeviceModuleImpl.isLocationEnabled(p); }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isHeadphonesConnectedSync() {
        return rnDeviceModuleImpl.isHeadphonesConnectedSync();
    }
    @ReactMethod
    public void isHeadphonesConnected(Promise p) { rnDeviceModuleImpl.isHeadphonesConnected(p); }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getAvailableLocationProvidersSync() {
        return rnDeviceModuleImpl.getAvailableLocationProvidersSync();
    }
    @ReactMethod
    public void getAvailableLocationProviders(Promise p) { rnDeviceModuleImpl.getAvailableLocationProviders(p); }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getInstallReferrerSync() {
        return rnDeviceModuleImpl.getInstallReferrerSync();
    }
    @ReactMethod
    public void getInstallReferrer(Promise p) { rnDeviceModuleImpl.getInstallReferrer(p); }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getInstallerPackageNameSync() {
        return rnDeviceModuleImpl.getInstallerPackageNameSync();
    }

    @ReactMethod
    public void getInstallerPackageName(Promise p) { rnDeviceModuleImpl.getInstallerPackageName(p); }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public double getFirstInstallTimeSync() {
        return rnDeviceModuleImpl.getFirstInstallTimeSync();
    }
    @ReactMethod
    public void getFirstInstallTime(Promise p) { rnDeviceModuleImpl.getFirstInstallTime(p); }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public double getLastUpdateTimeSync() {
        return rnDeviceModuleImpl.getLastUpdateTimeSync();
    }
    @ReactMethod
    public void getLastUpdateTime(Promise p) { rnDeviceModuleImpl.getLastUpdateTime(p); }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getDeviceNameSync() {
        return rnDeviceModuleImpl.getDeviceNameSync();
    }
    @ReactMethod
    public void getDeviceName(Promise p) { rnDeviceModuleImpl.getDeviceName(p); }

    @SuppressLint({"HardwareIds", "MissingPermission"})
    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getSerialNumberSync() {
        return rnDeviceModuleImpl.getSerialNumberSync();
    }
    @ReactMethod
    public void getSerialNumber(Promise p) { rnDeviceModuleImpl.getSerialNumber(p); }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getDeviceSync() {  return rnDeviceModuleImpl.getDeviceSync(); }
    @ReactMethod
    public void getDevice(Promise p) { rnDeviceModuleImpl.getDevice(p); }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getBuildIdSync() { return rnDeviceModuleImpl.getBuildIdSync(); }
    @ReactMethod
    public void getBuildId(Promise p) { rnDeviceModuleImpl.getBuildId(p); }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public int getApiLevelSync() { return rnDeviceModuleImpl.getApiLevelSync(); }
    @ReactMethod
    public void getApiLevel(Promise p) { rnDeviceModuleImpl.getApiLevel(p); }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getBootloaderSync() { return rnDeviceModuleImpl.getBootloaderSync(); }
    @ReactMethod
    public void getBootloader(Promise p) { rnDeviceModuleImpl.getBootloader(p); }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getDisplaySync() { return rnDeviceModuleImpl.getDisplaySync(); }
    @ReactMethod
    public void getDisplay(Promise p) { rnDeviceModuleImpl.getDisplay(p); }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getFingerprintSync() { return rnDeviceModuleImpl.getFingerprintSync(); }
    @ReactMethod
    public void getFingerprint(Promise p) { rnDeviceModuleImpl.getFingerprint(p); }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getHardwareSync() { return rnDeviceModuleImpl.getHardwareSync(); }
    @ReactMethod
    public void getHardware(Promise p) { rnDeviceModuleImpl.getHardware(p); }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getHostSync() { return rnDeviceModuleImpl.getHostSync(); }
    @ReactMethod
    public void getHost(Promise p) { rnDeviceModuleImpl.getHost(p); }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getProductSync() { return rnDeviceModuleImpl.getProductSync(); }
    @ReactMethod
    public void getProduct(Promise p) { rnDeviceModuleImpl.getProduct(p); }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getTagsSync() { return rnDeviceModuleImpl.getTagsSync(); }
    @ReactMethod
    public void getTags(Promise p) { rnDeviceModuleImpl.getTags(p); }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getTypeSync() { return rnDeviceModuleImpl.getTypeSync(); }
    @ReactMethod
    public void getType(Promise p) { rnDeviceModuleImpl.getType(p); }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getSystemManufacturerSync() { return rnDeviceModuleImpl.getSystemManufacturerSync(); }
    @ReactMethod
    public void getSystemManufacturer(Promise p) { rnDeviceModuleImpl.getSystemManufacturer(p); }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getCodenameSync() { return rnDeviceModuleImpl.getCodenameSync(); }
    @ReactMethod
    public void getCodename(Promise p) { rnDeviceModuleImpl.getCodename(p); }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getIncrementalSync() { return rnDeviceModuleImpl.getIncrementalSync(); }
    @ReactMethod
    public void getIncremental(Promise p) { rnDeviceModuleImpl.getIncremental(p); }

    @SuppressLint("HardwareIds")
    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getUniqueIdSync() { return rnDeviceModuleImpl.getUniqueIdSync(); }
    @ReactMethod
    public void getUniqueId(Promise p) {
        rnDeviceModuleImpl.getUniqueId(p);
    }

    @SuppressLint("HardwareIds")
    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getAndroidIdSync() { return rnDeviceModuleImpl.getAndroidIdSync(); }
    @ReactMethod
    public void getAndroidId(Promise p) { rnDeviceModuleImpl.getAndroidId(p); }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public double getMaxMemorySync() { return rnDeviceModuleImpl.getMaxMemorySync(); }
    @ReactMethod
    public void getMaxMemory(Promise p) { rnDeviceModuleImpl.getMaxMemory(p); }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public double getTotalMemorySync() {
        return rnDeviceModuleImpl.getTotalMemorySync();
    }
    @ReactMethod
    public void getTotalMemory(Promise p) { rnDeviceModuleImpl.getTotalMemory(p); }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @SuppressWarnings({"ConstantConditions", "deprecation"})
    public String getInstanceIdSync() {
        return rnDeviceModuleImpl.getInstanceIdSync();
    }
    @ReactMethod
    public void getInstanceId(Promise p) { rnDeviceModuleImpl.getInstanceId(p); }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getBaseOsSync() {
        return rnDeviceModuleImpl.getBaseOsSync();
    }
    @ReactMethod
    public void getBaseOs(Promise p) { rnDeviceModuleImpl.getBaseOs(p); }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getPreviewSdkIntSync() {
        return rnDeviceModuleImpl.getPreviewSdkIntSync();
    }
    @ReactMethod
    public void getPreviewSdkInt(Promise p) { rnDeviceModuleImpl.getPreviewSdkInt(p); }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getSecurityPatchSync() {
        return rnDeviceModuleImpl.getSecurityPatchSync();
    }
    @ReactMethod
    public void getSecurityPatch(Promise p) { rnDeviceModuleImpl.getSecurityPatch(p); }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getUserAgentSync() {
        return rnDeviceModuleImpl.getUserAgentSync();
    }
    @ReactMethod
    public void getUserAgent(Promise p) { rnDeviceModuleImpl.getUserAgent(p); }

    @SuppressLint({"HardwareIds", "MissingPermission"})
    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getPhoneNumberSync() {
        return rnDeviceModuleImpl.getPhoneNumberSync();
    }
    @ReactMethod
    public void getPhoneNumber(Promise p) { rnDeviceModuleImpl.getPhoneNumber(p); }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableArray getSupportedAbisSync() {
        return rnDeviceModuleImpl.getSupportedAbisSync();
    }
    @ReactMethod
    public void getSupportedAbis(Promise p) { rnDeviceModuleImpl.getSupportedAbis(p); }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableArray getSupported32BitAbisSync() {
        return rnDeviceModuleImpl.getSupported32BitAbisSync();
    }
    @ReactMethod
    public void getSupported32BitAbis(Promise p) { rnDeviceModuleImpl.getSupported32BitAbis(p); }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableArray getSupported64BitAbisSync() {
        return rnDeviceModuleImpl.getSupported64BitAbisSync();
    }
    @ReactMethod
    public void getSupported64BitAbis(Promise p) { rnDeviceModuleImpl.getSupported64BitAbis(p); }
}