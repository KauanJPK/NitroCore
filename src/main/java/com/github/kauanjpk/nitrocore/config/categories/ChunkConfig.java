package com.github.kauanjpk.nitrocore.config.categories;

import com.github.kauanjpk.nitrocore.config.core.ConfigCategory;

/**
 * Chunk optimization configuration.
 *
 * @author KauanJPK
 */
public final class ChunkConfig implements ConfigCategory {

    private boolean enabled;

    private boolean chunkCache;

    private boolean smartUpdates;

    private boolean skipUnchangedChunks;

    private boolean lazyChunkLoading;

    private boolean unloadFarChunks;

    public ChunkConfig() {
        resetDefaults();
    }

    @Override
    public void resetDefaults() {

        enabled = true;
        chunkCache = true;
        smartUpdates = true;
        skipUnchangedChunks = true;
        lazyChunkLoading = true;
        unloadFarChunks = false;

    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isChunkCache() {
        return chunkCache;
    }

    public void setChunkCache(boolean chunkCache) {
        this.chunkCache = chunkCache;
    }

    public boolean isSmartUpdates() {
        return smartUpdates;
    }

    public void setSmartUpdates(boolean smartUpdates) {
        this.smartUpdates = smartUpdates;
    }

    public boolean isSkipUnchangedChunks() {
        return skipUnchangedChunks;
    }

    public void setSkipUnchangedChunks(boolean skipUnchangedChunks) {
        this.skipUnchangedChunks = skipUnchangedChunks;
    }

    public boolean isLazyChunkLoading() {
        return lazyChunkLoading;
    }

    public void setLazyChunkLoading(boolean lazyChunkLoading) {
        this.lazyChunkLoading = lazyChunkLoading;
    }

    public boolean isUnloadFarChunks() {
        return unloadFarChunks;
    }

    public void setUnloadFarChunks(boolean unloadFarChunks) {
        this.unloadFarChunks = unloadFarChunks;
    }

}
