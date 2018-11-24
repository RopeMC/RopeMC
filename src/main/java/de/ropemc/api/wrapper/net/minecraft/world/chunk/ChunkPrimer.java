package de.ropemc.api.wrapper.net.minecraft.world.chunk;

import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.chunk.ChunkPrimer")
public interface ChunkPrimer {

    IBlockState getBlockState(int var0);

    IBlockState getBlockState(int var0, int var1, int var2);

    void setBlockState(int var0, int var1, int var2, IBlockState var3);

    void setBlockState(int var0, IBlockState var1);

}
