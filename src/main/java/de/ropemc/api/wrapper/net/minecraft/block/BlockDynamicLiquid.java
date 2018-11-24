package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import java.util.Set;
import java.util.Random;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockDynamicLiquid")
public interface BlockDynamicLiquid {

    boolean canFlowInto(World var0, BlockPos var1, IBlockState var2);

    int checkAdjacentBlock(World var0, BlockPos var1, int var2);

    int func_176374_a(World var0, BlockPos var1, int var2, EnumFacing var3);

    Set getPossibleFlowDirections(World var0, BlockPos var1);

    boolean isBlocked(World var0, BlockPos var1, IBlockState var2);

    void onBlockAdded(World var0, BlockPos var1, IBlockState var2);

    void placeStaticBlock(World var0, BlockPos var1, IBlockState var2);

    void tryFlowInto(World var0, BlockPos var1, IBlockState var2, int var3);

    void updateTick(World var0, BlockPos var1, IBlockState var2, Random var3);

}
