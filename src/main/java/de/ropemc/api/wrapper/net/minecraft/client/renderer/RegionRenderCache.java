package de.ropemc.api.wrapper.net.minecraft.client.renderer;

import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntity;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.RegionRenderCache")
public interface RegionRenderCache {

    IBlockState getBlockState(BlockPos var0);

    IBlockState getBlockStateRaw(BlockPos var0);

    int getCombinedLight(BlockPos var0, int var1);

    int getPositionIndex(BlockPos var0);

    TileEntity getTileEntity(BlockPos var0);

}
