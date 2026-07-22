package com.github.kauanjpk.nitrocore.config.render;

import com.github.kauanjpk.nitrocore.config.core.ConfigFeature;

/**
 * Render optimizations.
 *
 * Every value represents an independent render optimization
 * that can be enabled or disabled by the user.
 *
 * @author KauanJPK
 */
public enum RenderFeature implements ConfigFeature {

    /*
     * World
     */

    SKY("sky", true),

    CLOUDS("clouds", true),

    STARS("stars", true),

    SUN_MOON("sunMoon", true),

    FOG("fog", true),

    RAIN("rain", true),

    SNOW("snow", true),

    WEATHER("weather", true),

    /*
     * Lighting
     */

    LIGHT_UPDATES("lightUpdates", true),

    DYNAMIC_LIGHTS("dynamicLights", true),

    SHADOWS("shadows", true),

    /*
     * Blocks
     */

    BLOCK_ANIMATIONS("blockAnimations", true),

    TESR("tesr", true),

    BEACON_BEAM("beaconBeam", true),

    ENCHANTMENT_GLINT("enchantmentGlint", true),

    /*
     * Fluids
     */

    WATER_ANIMATION("waterAnimation", true),

    LAVA_ANIMATION("lavaAnimation", true),

    FLOWING_TEXTURES("flowingTextures", true),

    /*
     * Vegetation
     */

    LEAVES_ANIMATION("leavesAnimation", true),

    TALL_GRASS("tallGrass", true),

    FLOWERS("flowers", true),

    /*
     * GUI
     */

    GUI_BLUR("guiBlur", true),

    TOOLTIP_SHADOW("tooltipShadow", true),

    /*
     * Misc
     */

    ITEM_BOBBING("itemBobbing", true),

    ITEM_ROTATION("itemRotation", true),

    ENTITY_SHADOWS("entityShadows", true),

    DEBUG_RENDER("debugRender", false);

    private final String key;

    private final boolean defaultValue;

    RenderFeature(String key, boolean defaultValue) {

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
