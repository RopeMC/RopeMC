package de.ropemc.api.wrapper.net.minecraft.world.biome;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.world.chunk.ChunkPrimer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.biome.BiomeGenOcean")
public interface BiomeGenOcean {

    void genTerrainBlocks(World var0, Random var1, ChunkPrimer var2, int var3, int var4, double var5);

    //BiomeGenBase$TempCategory getTempCategory();

}
