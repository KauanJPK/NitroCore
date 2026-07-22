package com.github.kauanjpk.nitrocore.config.render;

import com.github.kauanjpk.nitrocore.config.core.EnumConfigCategory;

/**
 * Render configuration.
 *
 * Stores every render optimization.
 *
 * @author KauanJPK
 */
public final class RenderConfig extends EnumConfigCategory<RenderFeature> {

    public RenderConfig() {
        super(RenderFeature.class);
    }

}
