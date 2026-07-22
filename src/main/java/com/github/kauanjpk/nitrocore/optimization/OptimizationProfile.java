package com.github.kauanjpk.nitrocore.optimization;

/**
 * Defines the optimization profiles available in NitroCore.
 *
 * Each profile controls how aggressively the engine reduces
 * rendering and visual effects in favor of performance.
 *
 * @author KauanJPK
 */
public enum OptimizationProfile {

    /**
     * Disables every optimization.
     */
    OFF,

    /**
     * Keeps visual quality while applying safe optimizations.
     */
    BALANCED,

    /**
     * Reduces visual effects for higher performance.
     */
    AGGRESSIVE,

    /**
     * Maximizes performance by disabling nearly every visual effect.
     */
    EXTREME,

    /**
     * User-defined configuration.
     */
    CUSTOM

}
