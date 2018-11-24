package de.ropemc.api.wrapper.net.minecraft.world.gen.layer;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.gen.layer.IntCache")
public interface IntCache {

    String getCacheSizes();

    int[] getIntCache(int var0);

    void resetIntCache();

}
