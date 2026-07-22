package com.github.kauanjpk.nitrocore.config;

import com.github.kauanjpk.nitrocore.config.animation.AnimationConfig;
import com.github.kauanjpk.nitrocore.config.categories.ChunkConfig;
import com.github.kauanjpk.nitrocore.config.categories.EntityConfig;
import com.github.kauanjpk.nitrocore.config.categories.GeneralConfig;
import com.github.kauanjpk.nitrocore.config.categories.PerformanceConfig;
import com.github.kauanjpk.nitrocore.config.particle.ParticleConfig;
import com.github.kauanjpk.nitrocore.config.render.RenderConfig;
import com.github.kauanjpk.nitrocore.config.texture.TextureConfig;

/**
 * Root configuration object used by NitroCore.
 * <p>
 * Every configuration category is instantiated once and shared by the entire
 * mod during runtime.
 *
 * @author KauanJPK
 */
public final class NitroConfig {

    private final GeneralConfig general;

    private final PerformanceConfig performance;

    private final ParticleConfig particles;

    private final RenderConfig render;

    private final AnimationConfig animation;

    private final TextureConfig textures;

    private final EntityConfig entities;

    private final ChunkConfig chunks;

    /**
     * Creates a new configuration instance.
     */
    public NitroConfig() {

        this.general = new GeneralConfig();
        this.performance = new PerformanceConfig();

        this.particles = new ParticleConfig();
        this.render = new RenderConfig();
        this.animation = new AnimationConfig();
        this.textures = new TextureConfig();

        this.entities = new EntityConfig();
        this.chunks = new ChunkConfig();

    }

    public GeneralConfig getGeneral() {
        return general;
    }

    public PerformanceConfig getPerformance() {
        return performance;
    }

    public ParticleConfig getParticles() {
        return particles;
    }

    public RenderConfig getRender() {
        return render;
    }

    public AnimationConfig getAnimation() {
        return animation;
    }

    public TextureConfig getTextures() {
        return textures;
    }

    public EntityConfig getEntities() {
        return entities;
    }

    public ChunkConfig getChunks() {
        return chunks;
    }

}
