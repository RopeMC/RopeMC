package de.ropemc.api.wrapper.net.minecraft.world.biome;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.world.gen.feature.WorldGenAbstractTree;
import de.ropemc.api.wrapper.net.minecraft.world.chunk.ChunkPrimer;
import de.ropemc.api.wrapper.net.minecraft.world.gen.feature.WorldGenerator;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.biome.BiomeGenTaiga")
public interface BiomeGenTaiga {

    BiomeGenBase createMutatedBiome(int var0);

    void decorate(World var0, Random var1, BlockPos var2);

    WorldGenAbstractTree genBigTreeChance(Random var0);

    void genTerrainBlocks(World var0, Random var1, ChunkPrimer var2, int var3, int var4, double var5);

    WorldGenerator getRandomWorldGenForGrass(Random var0);

}
