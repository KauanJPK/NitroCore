package com.github.kauanjpk.nitrocore.config.categories;

import com.github.kauanjpk.nitrocore.config.core.ConfigCategory;

/**
 * Performance related configuration.
 *
 * @author KauanJPK
 */
public final class PerformanceConfig implements ConfigCategory {

    private boolean enabled;

    private boolean cpuOptimization;

    private boolean memoryOptimization;

    private boolean gcOptimization;

    /**
     * 0 = Disabled
     * 1 = Safe
     * 2 = Balanced
     * 3 = Aggressive
     */
    private int optimizationLevel;

    public PerformanceConfig() {
        resetDefaults();
    }

    @Override
    public void resetDefaults() {

        enabled = true;
        cpuOptimization = true;
        memoryOptimization = true;
        gcOptimization = true;
        optimizationLevel = 2;

    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isCpuOptimization() {
        return cpuOptimization;
    }

    public void setCpuOptimization(boolean cpuOptimization) {
        this.cpuOptimization = cpuOptimization;
    }

    public boolean isMemoryOptimization() {
        return memoryOptimization;
    }

    public void setMemoryOptimization(boolean memoryOptimization) {
        this.memoryOptimization = memoryOptimization;
    }

    public boolean isGcOptimization() {
        return gcOptimization;
    }

    public void setGcOptimization(boolean gcOptimization) {
        this.gcOptimization = gcOptimization;
    }

    public int getOptimizationLevel() {
        return optimizationLevel;
    }

    public void setOptimizationLevel(int optimizationLevel) {

        if (optimizationLevel < 0) {
            optimizationLevel = 0;
        }

        if (optimizationLevel > 3) {
            optimizationLevel = 3;
        }

        this.optimizationLevel = optimizationLevel;

    }

}
