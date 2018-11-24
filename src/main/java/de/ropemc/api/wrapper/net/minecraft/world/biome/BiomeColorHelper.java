package de.ropemc.api.wrapper.net.minecraft.world.biome;

import de.ropemc.api.wrapper.net.minecraft.world.IBlockAccess;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.biome.BiomeColorHelper")
public interface BiomeColorHelper {

    //int func_180285_a(IBlockAccess var0, BlockPos var1, BiomeColorHelper$ColorResolver var2);

    int getFoliageColorAtPos(IBlockAccess var0, BlockPos var1);

    int getGrassColorAtPos(IBlockAccess var0, BlockPos var1);

    int getWaterColorAtPos(IBlockAccess var0, BlockPos var1);

}
