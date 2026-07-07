package com.github.kauanjpk.nitrocore;

import com.github.kauanjpk.nitrocore.logging.NitroLog;
import com.github.kauanjpk.nitrocore.optimization.OptimizationRegistry;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = "nitrocore", name = "NitroCore", version = Tags.VERSION)
public final class NitroCore {

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        NitroLog.banner();

        OptimizationRegistry.initialize();

        NitroLog.info("NitroCore initialized.");

    }

}
