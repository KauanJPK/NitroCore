package com.github.kauanjpk.nitrocore.config.animation;

import com.github.kauanjpk.nitrocore.config.core.ConfigFeature;

/**
 * Every configurable animation optimization.
 *
 * @author KauanJPK
 */
public enum AnimationType implements ConfigFeature {

    /**
     * Item animation in first person.
     */
    ITEM("item", true),

    /**
     * GUI animations.
     */
    GUI("gui", true),

    /**
     * Inventory slot animations.
     */
    INVENTORY("inventory", true),

    /**
     * Container opening animations.
     */
    CONTAINER("container", true),

    /**
     * Experience orb animation.
     */
    EXPERIENCE_ORB("experienceOrb", true),

    /**
     * Entity hurt animation.
     */
    HURT("hurt", true),

    /**
     * Fire animation.
     */
    FIRE("fire", true),

    /**
     * Water animation.
     */
    WATER("water", true),

    /**
     * Lava animation.
     */
    LAVA("lava", true),

    /**
     * Portal animation.
     */
    PORTAL("portal", true),

    /**
     * Beacon animation.
     */
    BEACON("beacon", true),

    /**
     * Enchantment table animation.
     */
    ENCHANTMENT_TABLE("enchantmentTable", true),

    /**
     * Chest lid animation.
     */
    CHEST("chest", true),

    /**
     * Piston animation.
     */
    PISTON("piston", true),

    /**
     * Block breaking animation.
     */
    BLOCK_BREAKING("blockBreaking", true),

    /**
     * Breaking particles.
     */
    BREAKING_PARTICLES("breakingParticles", true),

    /**
     * Rain animation.
     */
    RAIN("rain", true),

    /**
     * Snow animation.
     */
    SNOW("snow", true),

    /**
     * Texture animation.
     */
    ANIMATED_TEXTURES("animatedTextures", true),

    /**
     * Mod animations.
     */
    MOD_ANIMATIONS("modAnimations", true);

    private final String key;

    private final boolean defaultValue;

    AnimationType(String key, boolean defaultValue) {

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
