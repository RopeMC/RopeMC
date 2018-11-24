package de.ropemc.api.wrapper.net.minecraft.world.biome;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.world.gen.feature.WorldGenAbstractTree;
//import de.ropemc.api.wrapper.net.minecraft.block.BlockFlower$EnumFlowerType;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.biome.BiomeGenForest")
public interface BiomeGenForest {

    BiomeGenBase createMutatedBiome(int var0);

    void decorate(World var0, Random var1, BlockPos var2);

    BiomeGenBase func_150557_a(int var0, boolean var1);

    WorldGenAbstractTree genBigTreeChance(Random var0);

    int getGrassColorAtPos(BlockPos var0);

    //BlockFlower$EnumFlowerType pickRandomFlower(Random var0, BlockPos var1);

}
