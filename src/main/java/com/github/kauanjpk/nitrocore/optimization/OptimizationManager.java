package com.github.kauanjpk.nitrocore.optimization;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

import com.github.kauanjpk.nitrocore.logging.NitroLog;

/**
 * Central optimization manager.
 *
 * <p>
 * This class is responsible for registering, storing and exposing every
 * optimization module used by NitroCore.
 * </p>
 *
 * <p>
 * Mixins should communicate only with this class.
 * </p>
 *
 * @author KauanJPK
 */
public final class OptimizationManager {

    /**
     * Registered optimization modules.
     */
    private static final Map<OptimizationType, OptimizationModule> MODULES = new EnumMap<OptimizationType, OptimizationModule>(
        OptimizationType.class);

    /**
     * Current optimization profile.
     */
    private static OptimizationProfile profile = OptimizationProfile.BALANCED;

    private OptimizationManager() {
        throw new UnsupportedOperationException("Utility class");
    }

    /**
     * Registers an optimization module.
     *
     * @param module Module instance.
     */
    public static void register(OptimizationModule module) {

        if (module == null) {
            throw new IllegalArgumentException("Module cannot be null.");
        }

        module.initialize();

        MODULES.put(module.getType(), module);

        NitroLog.info("Registered optimization: " + module.getName());

    }

    /**
     * Returns a module by its type.
     *
     * @param type Module type.
     * @return Registered module or null.
     */
    public static OptimizationModule get(OptimizationType type) {
        return MODULES.get(type);
    }

    /**
     * Returns every registered module.
     *
     * @return Immutable module map.
     */
    public static Map<OptimizationType, OptimizationModule> getModules() {
        return Collections.unmodifiableMap(MODULES);
    }

    /**
     * Checks whether a module is enabled.
     *
     * @param type Module type.
     * @return true if enabled.
     */
    public static boolean isEnabled(OptimizationType type) {

        OptimizationModule module = MODULES.get(type);

        return module != null && module.isEnabled();

    }

    /**
     * Returns the active optimization profile.
     */
    public static OptimizationProfile getProfile() {
        return profile;
    }

    /**
     * Changes the active optimization profile.
     *
     * @param profile New optimization profile.
     */
    public static void setProfile(OptimizationProfile profile) {

        if (profile == null) {
            throw new IllegalArgumentException("Profile cannot be null.");
        }

        OptimizationManager.profile = profile;

        NitroLog.info("Optimization profile changed to: " + profile.name());

    }
}
