package com.github.kauanjpk.nitrocore.config.particle;

import com.github.kauanjpk.nitrocore.config.core.EnumConfigCategory;

/**
 * Particle configuration.
 *
 * Stores every particle optimization state.
 *
 * @author KauanJPK
 */
public final class ParticleConfig extends EnumConfigCategory<ParticleType> {

    public ParticleConfig() {
        super(ParticleType.class);
    }

}
