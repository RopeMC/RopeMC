package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import java.util.Random;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockMushroom")
public interface BlockMushroom {

    boolean canBlockStay(World var0, BlockPos var1, IBlockState var2);

    boolean canGrow(World var0, BlockPos var1, IBlockState var2, boolean var3);

    boolean canPlaceBlockAt(World var0, BlockPos var1);

    boolean canPlaceBlockOn(Block var0);

    boolean canUseBonemeal(World var0, Random var1, BlockPos var2, IBlockState var3);

    boolean generateBigMushroom(World var0, BlockPos var1, IBlockState var2, Random var3);

    void grow(World var0, Random var1, BlockPos var2, IBlockState var3);

    void updateTick(World var0, BlockPos var1, IBlockState var2, Random var3);

}
