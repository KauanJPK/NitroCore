package com.github.kauanjpk.nitrocore.optimization;

/**
 * Base interface for every NitroCore optimization.
 *
 * <p>
 * Every optimization module must implement this interface.
 * </p>
 *
 * @author KauanJPK
 */
public interface OptimizationModule {

    /**
     * Returns the optimization display name.
     *
     * @return optimization name
     */
    String getName();

    /**
     * Returns the optimization category.
     *
     * @return optimization type
     */
    OptimizationType getType();

    /**
     * Called when the optimization is registered.
     */
    default void initialize() {}

    /**
     * Returns whether this optimization is enabled.
     *
     * @return true if enabled
     */
    boolean isEnabled();

    /**
     * Enables this optimization.
     */
    void enable();

    /**
     * Disables this optimization.
     */
    void disable();

    /**
     * Reloads this optimization.
     */
    default void reload() {}

}
