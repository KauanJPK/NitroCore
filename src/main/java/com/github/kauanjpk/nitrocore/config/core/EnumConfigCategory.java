package com.github.kauanjpk.nitrocore.config.core;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/**
 * Base implementation for every enum based configuration category.
 * <p>
 * This class stores every configurable feature using an {@link EnumMap},
 * providing extremely fast lookups while keeping memory usage low.
 *
 * @param <E> enum type
 *
 * @author KauanJPK
 */
public abstract class EnumConfigCategory<E extends Enum<E> & ConfigFeature> {

    /**
     * Enum class.
     */
    private final Class<E> enumClass;

    /**
     * Feature values.
     */
    private final EnumMap<E, Boolean> values;

    /**
     * Creates a new configuration category.
     *
     * @param enumClass enum class
     */
    protected EnumConfigCategory(Class<E> enumClass) {

        this.enumClass = enumClass;
        this.values = new EnumMap<>(enumClass);

        resetDefaults();

    }

    /**
     * Returns whether a feature is enabled.
     *
     * @param feature feature
     *
     * @return enabled state
     */
    public final boolean isEnabled(E feature) {
        return values.get(feature);
    }

    /**
     * Changes a feature state.
     *
     * @param feature feature
     * @param enabled new state
     */
    public final void setEnabled(E feature, boolean enabled) {
        values.put(feature, enabled);
    }

    /**
     * Returns an immutable view of every configured value.
     *
     * @return configuration values
     */
    public final Map<E, Boolean> getValues() {
        return Collections.unmodifiableMap(values);
    }

    /**
     * Returns every enum constant.
     *
     * @return enum constants
     */
    public final E[] values() {
        return enumClass.getEnumConstants();
    }

    /**
     * Finds a feature by its configuration key.
     *
     * @param key configuration key
     *
     * @return feature or null if not found
     */
    public final E find(String key) {

        for (E feature : values()) {

            if (feature.getKey()
                .equalsIgnoreCase(key)) {
                return feature;
            }

        }

        return null;

    }

    /**
     * Restores every feature to its default value.
     */
    public final void resetDefaults() {

        values.clear();

        for (E feature : values()) {
            values.put(feature, feature.getDefaultValue());
        }

    }

}
