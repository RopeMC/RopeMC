package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import java.util.Random;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.IGrowable")
public interface IGrowable {

    boolean canGrow(World var0, BlockPos var1, IBlockState var2, boolean var3);

    boolean canUseBonemeal(World var0, Random var1, BlockPos var2, IBlockState var3);

    void grow(World var0, Random var1, BlockPos var2, IBlockState var3);

}
