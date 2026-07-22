package com.github.kauanjpk.nitrocore.config.categories;

import com.github.kauanjpk.nitrocore.config.core.ConfigCategory;

/**
 * Entity optimization configuration.
 *
 * @author KauanJPK
 */
public final class EntityConfig implements ConfigCategory {

    private boolean enabled;

    private boolean distanceCulling;

    private boolean invisibleEntityCulling;

    private boolean smartTicking;

    private boolean disableArmorStandRendering;

    private boolean disableDroppedItemAnimations;

    public EntityConfig() {
        resetDefaults();
    }

    @Override
    public void resetDefaults() {

        enabled = true;
        distanceCulling = true;
        invisibleEntityCulling = true;
        smartTicking = true;
        disableArmorStandRendering = false;
        disableDroppedItemAnimations = false;

    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isDistanceCulling() {
        return distanceCulling;
    }

    public void setDistanceCulling(boolean distanceCulling) {
        this.distanceCulling = distanceCulling;
    }

    public boolean isInvisibleEntityCulling() {
        return invisibleEntityCulling;
    }

    public void setInvisibleEntityCulling(boolean invisibleEntityCulling) {
        this.invisibleEntityCulling = invisibleEntityCulling;
    }

    public boolean isSmartTicking() {
        return smartTicking;
    }

    public void setSmartTicking(boolean smartTicking) {
        this.smartTicking = smartTicking;
    }

    public boolean isDisableArmorStandRendering() {
        return disableArmorStandRendering;
    }

    public void setDisableArmorStandRendering(boolean disableArmorStandRendering) {
        this.disableArmorStandRendering = disableArmorStandRendering;
    }

    public boolean isDisableDroppedItemAnimations() {
        return disableDroppedItemAnimations;
    }

    public void setDisableDroppedItemAnimations(boolean disableDroppedItemAnimations) {
        this.disableDroppedItemAnimations = disableDroppedItemAnimations;
    }

}
