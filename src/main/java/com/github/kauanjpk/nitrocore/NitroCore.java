package com.github.kauanjpk.nitrocore;

import com.github.kauanjpk.nitrocore.config.ConfigManager;
import com.github.kauanjpk.nitrocore.logging.NitroLog;
import com.github.kauanjpk.nitrocore.optimization.OptimizationRegistry;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = "nitrocore", name = "NitroCore", version = Tags.VERSION)
public final class NitroCore {

    private static NitroCore instance;

    private ConfigManager configManager;

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        instance = this;

        NitroLog.banner();

        configManager = new ConfigManager();
        configManager.init();

        OptimizationRegistry.initialize();

        NitroLog.info("NitroCore initialized.");

    }

    public static NitroCore getInstance() {
        return instance;
    }

    public ConfigManager getConfigManager() {
        return configManager;
    }

}
