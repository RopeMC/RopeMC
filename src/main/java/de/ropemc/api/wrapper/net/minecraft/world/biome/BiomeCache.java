package de.ropemc.api.wrapper.net.minecraft.world.biome;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.biome.BiomeCache")
public interface BiomeCache {

    //WorldChunkManager access$000(BiomeCache var0);

    void cleanupCache();

    BiomeGenBase func_180284_a(int var0, int var1, BiomeGenBase var2);

    //BiomeCache$Block getBiomeCacheBlock(int var0, int var1);

    BiomeGenBase[] getCachedBiomes(int var0, int var1);

}
