package com.github.kauanjpk.nitrocore.config.categories;

import com.github.kauanjpk.nitrocore.config.core.ConfigCategory;

/**
 * General NitroCore configuration.
 *
 * @author KauanJPK
 */
public final class GeneralConfig implements ConfigCategory {

    private boolean enabled;

    private boolean debug;

    private boolean startupBanner;

    private boolean updateNotifications;

    public GeneralConfig() {
        resetDefaults();
    }

    @Override
    public void resetDefaults() {

        enabled = true;
        debug = false;
        startupBanner = true;
        updateNotifications = true;

    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isDebug() {
        return debug;
    }

    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    public boolean isStartupBanner() {
        return startupBanner;
    }

    public void setStartupBanner(boolean startupBanner) {
        this.startupBanner = startupBanner;
    }

    public boolean isUpdateNotifications() {
        return updateNotifications;
    }

    public void setUpdateNotifications(boolean updateNotifications) {
        this.updateNotifications = updateNotifications;
    }

}
