package com.github.kauanjpk.nitrocore.config.core;

/**
 * Represents a NitroCore configuration category.
 *
 * Every configuration category must be able to restore
 * its default values.
 *
 * @author KauanJPK
 */
public interface ConfigCategory {

    /**
     * Restores every configuration value
     * to its default state.
     */
    void resetDefaults();

}
