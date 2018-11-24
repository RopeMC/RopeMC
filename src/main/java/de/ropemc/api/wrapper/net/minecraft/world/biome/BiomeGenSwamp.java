package de.ropemc.api.wrapper.net.minecraft.world.biome;

import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.world.gen.feature.WorldGenAbstractTree;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.world.chunk.ChunkPrimer;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
//import de.ropemc.api.wrapper.net.minecraft.block.BlockFlower$EnumFlowerType;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.biome.BiomeGenSwamp")
public interface BiomeGenSwamp {

    WorldGenAbstractTree genBigTreeChance(Random var0);

    void genTerrainBlocks(World var0, Random var1, ChunkPrimer var2, int var3, int var4, double var5);

    int getFoliageColorAtPos(BlockPos var0);

    int getGrassColorAtPos(BlockPos var0);

    //BlockFlower$EnumFlowerType pickRandomFlower(Random var0, BlockPos var1);

}
