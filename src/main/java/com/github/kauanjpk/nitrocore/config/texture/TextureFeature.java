package com.github.kauanjpk.nitrocore.config.texture;

import com.github.kauanjpk.nitrocore.config.core.ConfigFeature;

/**
 * Every configurable texture optimization.
 *
 * @author KauanJPK
 */
public enum TextureFeature implements ConfigFeature {

    /**
     * Animated textures.
     */
    ANIMATED_TEXTURES("animatedTextures", true),

    /**
     * Animated water textures.
     */
    WATER("water", true),

    /**
     * Animated lava textures.
     */
    LAVA("lava", true),

    /**
     * Animated fire textures.
     */
    FIRE("fire", true),

    /**
     * Portal textures.
     */
    PORTAL("portal", true),

    /**
     * Compass animation.
     */
    COMPASS("compass", true),

    /**
     * Clock animation.
     */
    CLOCK("clock", true),

    /**
     * Enchantment glint texture.
     */
    ENCHANTMENT_GLINT("enchantmentGlint", true),

    /**
     * Beacon beam texture.
     */
    BEACON("beacon", true),

    /**
     * Connected textures.
     */
    CONNECTED_TEXTURES("connectedTextures", true),

    /**
     * Mipmap generation.
     */
    MIPMAPS("mipmaps", true),

    /**
     * HD textures.
     */
    HD_TEXTURES("hdTextures", true),

    /**
     * Resource pack animations.
     */
    RESOURCE_PACK_ANIMATIONS("resourcePackAnimations", true),

    /**
     * Mod animated textures.
     */
    MOD_TEXTURES("modTextures", true);

    private final String key;

    private final boolean defaultValue;

    TextureFeature(String key, boolean defaultValue) {

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
