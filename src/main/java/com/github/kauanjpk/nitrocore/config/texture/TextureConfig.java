package com.github.kauanjpk.nitrocore.config.texture;

import com.github.kauanjpk.nitrocore.config.core.EnumConfigCategory;

/**
 * Texture configuration.
 *
 * Stores every texture optimization.
 *
 * @author KauanJPK
 */
public final class TextureConfig extends EnumConfigCategory<TextureFeature> {

    public TextureConfig() {
        super(TextureFeature.class);
    }

}
