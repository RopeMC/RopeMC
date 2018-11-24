package de.ropemc.api.wrapper.net.minecraft.world;

import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.world.biome.BiomeGenBase;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntity;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.IBlockAccess")
public interface IBlockAccess {

    boolean extendedLevelsInChunkCache();

    BiomeGenBase getBiomeGenForCoords(BlockPos var0);

    IBlockState getBlockState(BlockPos var0);

    int getCombinedLight(BlockPos var0, int var1);

    int getStrongPower(BlockPos var0, EnumFacing var1);

    TileEntity getTileEntity(BlockPos var0);

    WorldType getWorldType();

    boolean isAirBlock(BlockPos var0);

}
