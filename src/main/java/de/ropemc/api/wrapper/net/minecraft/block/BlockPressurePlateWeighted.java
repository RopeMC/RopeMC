package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.BlockState;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockPressurePlateWeighted")
public interface BlockPressurePlateWeighted {

    int computeRedstoneStrength(World var0, BlockPos var1);

    BlockState createBlockState();

    int getMetaFromState(IBlockState var0);

    int getRedstoneStrength(IBlockState var0);

    IBlockState getStateFromMeta(int var0);

    IBlockState setRedstoneStrength(IBlockState var0, int var1);

    int tickRate(World var0);

}
