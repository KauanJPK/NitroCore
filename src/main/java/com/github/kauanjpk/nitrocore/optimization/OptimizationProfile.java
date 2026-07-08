package com.github.kauanjpk.nitrocore.optimization;

/**
 * Defines how aggressive NitroCore should optimize the game.
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
