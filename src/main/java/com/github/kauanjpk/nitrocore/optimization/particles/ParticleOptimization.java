package com.github.kauanjpk.nitrocore.optimization.particles;

import com.github.kauanjpk.nitrocore.optimization.OptimizationModule;
import com.github.kauanjpk.nitrocore.optimization.OptimizationType;

/**
 * Handles every particle-related optimization.
 *
 * @author KauanJPK
 */
public final class ParticleOptimization implements OptimizationModule {

    /**
     * Whether the optimization is enabled.
     */
    private boolean enabled = true;

    @Override
    public String getName() {
        return "Particle Optimization";
    }

    @Override
    public OptimizationType getType() {
        return OptimizationType.PARTICLES;
    }

    @Override
    public void initialize() {
        enabled = true;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void enable() {
        enabled = true;
    }

    @Override
    public void disable() {
        enabled = false;
    }

    /**
     * Returns whether particles should be rendered.
     */
    public boolean shouldRenderParticles() {
        return enabled;
    }

}
