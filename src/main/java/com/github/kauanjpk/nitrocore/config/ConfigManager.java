package com.github.kauanjpk.nitrocore.config;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import com.github.kauanjpk.nitrocore.Tags;
import com.github.kauanjpk.nitrocore.config.categories.GeneralConfig;
import com.github.kauanjpk.nitrocore.config.categories.PerformanceConfig;
import com.github.kauanjpk.nitrocore.config.core.ConfigFeature;
import com.github.kauanjpk.nitrocore.config.core.EnumConfigCategory;

/**
 * Handles the NitroCore configuration.
 *
 * @author KauanJPK
 */
public final class ConfigManager {

    private static final String FILE_NAME = "nitrocore.properties";

    private final File file;

    private final NitroConfig config;

    public ConfigManager() {

        this.file = new File(FILE_NAME);

        this.config = new NitroConfig();

    }

    public NitroConfig getConfig() {
        return config;
    }

    public void init() {

        try {

            if (!file.exists()) {

                save();

                return;

            }

            load();

            save();

        } catch (IOException exception) {

            throw new RuntimeException("Failed to initialize NitroCore configuration.", exception);

        }

    }

    public void reload() {

        try {

            load();

        } catch (IOException exception) {

            throw new RuntimeException("Failed to reload NitroCore configuration.", exception);

        }

    }

    public void save() throws IOException {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {

            writeHeader(writer);

            writeGeneral(writer);

            writePerformance(writer);

            writeCategory(writer, "particles", config.getParticles());

            writeCategory(writer, "render", config.getRender());

            writeCategory(writer, "animation", config.getAnimation());

            writeCategory(writer, "texture", config.getTextures());

        }

    }

    private void load() throws IOException {

        Properties properties = new Properties();

        try (FileInputStream stream = new FileInputStream(file)) {

            properties.load(stream);

        }

        loadGeneral(properties);

        loadPerformance(properties);

        loadCategory(properties, "particles", config.getParticles());

        loadCategory(properties, "render", config.getRender());

        loadCategory(properties, "animation", config.getAnimation());

        loadCategory(properties, "texture", config.getTextures());

    }

    private void writeHeader(BufferedWriter writer) throws IOException {

        line(writer, "# ========================================");
        line(writer, "# NitroCore Configuration");
        line(writer, "# Version: " + Tags.VERSION);
        line(writer, "# ========================================");
        line(writer, "");

    }

    private void writeGeneral(BufferedWriter writer) throws IOException {

        GeneralConfig general = config.getGeneral();

        line(writer, "# General");

        line(writer, "general.enabled=" + general.isEnabled());
        line(writer, "general.debug=" + general.isDebug());
        line(writer, "general.startupBanner=" + general.isStartupBanner());
        line(writer, "general.updateNotifications=" + general.isUpdateNotifications());

        line(writer, "");

    }

    private void writePerformance(BufferedWriter writer) throws IOException {

        PerformanceConfig performance = config.getPerformance();

        line(writer, "# Performance");

        line(writer, "performance.enabled=" + performance.isEnabled());
        line(writer, "performance.cpuOptimization=" + performance.isCpuOptimization());
        line(writer, "performance.memoryOptimization=" + performance.isMemoryOptimization());
        line(writer, "performance.gcOptimization=" + performance.isGcOptimization());
        line(writer, "performance.optimizationLevel=" + performance.getOptimizationLevel());

        line(writer, "");

    }

    private <E extends Enum<E> & ConfigFeature> void writeCategory(BufferedWriter writer, String category,
        EnumConfigCategory<E> config) throws IOException {

        line(writer, "# " + capitalize(category));

        for (E feature : config.values()) {

            line(writer, category + "." + feature.getKey() + "=" + config.isEnabled(feature));

        }

        line(writer, "");

    }

    private void loadGeneral(Properties properties) {

        GeneralConfig general = config.getGeneral();

        general.setEnabled(getBoolean(properties, "general.enabled", general.isEnabled()));

        general.setDebug(getBoolean(properties, "general.debug", general.isDebug()));

        general.setStartupBanner(getBoolean(properties, "general.startupBanner", general.isStartupBanner()));

        general.setUpdateNotifications(
            getBoolean(properties, "general.updateNotifications", general.isUpdateNotifications()));

    }

    private void loadPerformance(Properties properties) {

        PerformanceConfig performance = config.getPerformance();

        performance.setEnabled(getBoolean(properties, "performance.enabled", performance.isEnabled()));

        performance
            .setCpuOptimization(getBoolean(properties, "performance.cpuOptimization", performance.isCpuOptimization()));

        performance.setMemoryOptimization(
            getBoolean(properties, "performance.memoryOptimization", performance.isMemoryOptimization()));

        performance
            .setGcOptimization(getBoolean(properties, "performance.gcOptimization", performance.isGcOptimization()));

        performance.setOptimizationLevel(
            getInt(properties, "performance.optimizationLevel", performance.getOptimizationLevel()));

    }

    private <E extends Enum<E> & ConfigFeature> void loadCategory(Properties properties, String category,
        EnumConfigCategory<E> config) {

        for (E feature : config.values()) {

            config.setEnabled(
                feature,
                getBoolean(properties, category + "." + feature.getKey(), feature.getDefaultValue()));

        }

    }

    private boolean getBoolean(Properties properties, String key, boolean defaultValue) {

        String value = properties.getProperty(key);

        if (value == null) {
            return defaultValue;
        }

        return Boolean.parseBoolean(value);

    }

    private int getInt(Properties properties, String key, int defaultValue) {

        String value = properties.getProperty(key);

        if (value == null) {
            return defaultValue;
        }

        try {

            return Integer.parseInt(value);

        } catch (NumberFormatException ignored) {

            return defaultValue;

        }

    }

    private void line(BufferedWriter writer, String line) throws IOException {

        writer.write(line);
        writer.newLine();

    }

    private String capitalize(String text) {

        if (text == null || text.isEmpty()) {
            return text;
        }

        return Character.toUpperCase(text.charAt(0)) + text.substring(1);

    }

}
