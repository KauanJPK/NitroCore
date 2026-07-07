package com.github.kauanjpk.nitrocore.optimization;

import com.github.kauanjpk.nitrocore.logging.NitroLog;
import com.github.kauanjpk.nitrocore.optimization.particles.ParticleOptimization;

/**
 * Registers every NitroCore optimization.
 *
 * This is the single entry point responsible for loading
 * all optimization modules.
 *
 * @author PowerKup
 */
public final class OptimizationRegistry {

    private OptimizationRegistry() {
        throw new UnsupportedOperationException("Utility class");
    }

    /**
     * Loads every optimization.
     */
    public static void initialize() {

        NitroLog.info("Loading optimization modules...");

        OptimizationManager.register(new ParticleOptimization());

        NitroLog.info("Optimization modules loaded.");

    }

}
