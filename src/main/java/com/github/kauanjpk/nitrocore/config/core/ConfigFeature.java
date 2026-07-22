package com.github.kauanjpk.nitrocore.config.core;

/**
 * Represents a configurable feature inside a configuration category.
 * <p>
 * Every enum used by NitroCore's configuration system must implement this
 * interface so the configuration manager can automatically serialize and
 * deserialize values without requiring custom logic.
 *
 * @author KauanJPK
 */
public interface ConfigFeature {

    /**
     * Returns the key used inside the configuration file.
     *
     * @return configuration key
     */
    String getKey();

    /**
     * Returns the default state of this feature.
     *
     * @return true if enabled by default
     */
    boolean getDefaultValue();

}
