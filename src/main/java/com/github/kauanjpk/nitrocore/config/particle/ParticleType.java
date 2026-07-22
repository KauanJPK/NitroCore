package com.github.kauanjpk.nitrocore.config.particle;

import com.github.kauanjpk.nitrocore.config.core.ConfigFeature;

/**
 * Every configurable particle optimization.
 *
 * @author KauanJPK
 */
public enum ParticleType implements ConfigFeature {

    /**
     * Vanilla smoke particles.
     */
    SMOKE("smoke", true),

    /**
     * Vanilla flame particles.
     */
    FLAME("flame", true),

    /**
     * Lava particles.
     */
    LAVA("lava", true),

    /**
     * Explosion particles.
     */
    EXPLOSION("explosion", true),

    /**
     * Portal particles.
     */
    PORTAL("portal", true),

    /**
     * Redstone particles.
     */
    REDSTONE("redstone", true),

    /**
     * Critical hit particles.
     */
    CRIT("crit", true),

    /**
     * Magic critical particles.
     */
    MAGIC_CRIT("magicCrit", true),

    /**
     * Water splash particles.
     */
    SPLASH("splash", true),

    /**
     * Water bubble particles.
     */
    BUBBLE("bubble", true),

    /**
     * Rain particles.
     */
    RAIN("rain", true),

    /**
     * Snow particles.
     */
    SNOW("snow", true),

    /**
     * Cloud particles.
     */
    CLOUD("cloud", true),

    /**
     * Enchantment particles.
     */
    ENCHANTMENT("enchantment", true),

    /**
     * Heart particles.
     */
    HEART("heart", true),

    /**
     * Villager particles.
     */
    VILLAGER("villager", true),

    /**
     * Note particles.
     */
    NOTE("note", true),

    /**
     * Huge explosion emitter.
     */
    HUGE_EXPLOSION("hugeExplosion", true),

    /**
     * Firework particles.
     */
    FIREWORK("firework", true),

    /**
     * Disable particles from other mods.
     */
    MOD_PARTICLES("modParticles", true);

    private final String key;

    private final boolean defaultValue;

    ParticleType(String key, boolean defaultValue) {

        this.key = key;
        this.defaultValue = defaultValue;

    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public boolean getDefaultValue() {
        return defaultValue;
    }

}
