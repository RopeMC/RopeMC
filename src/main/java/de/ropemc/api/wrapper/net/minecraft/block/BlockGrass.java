package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.world.IBlockAccess;
import de.ropemc.api.wrapper.net.minecraft.block.state.BlockState;
import de.ropemc.api.wrapper.net.minecraft.util.EnumWorldBlockLayer;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockGrass")
public interface BlockGrass {

    boolean canGrow(World var0, BlockPos var1, IBlockState var2, boolean var3);

    boolean canUseBonemeal(World var0, Random var1, BlockPos var2, IBlockState var3);

    int colorMultiplier(IBlockAccess var0, BlockPos var1, int var2);

    BlockState createBlockState();

    IBlockState getActualState(IBlockState var0, IBlockAccess var1, BlockPos var2);

    int getBlockColor();

    EnumWorldBlockLayer getBlockLayer();

    Item getItemDropped(IBlockState var0, Random var1, int var2);

    int getMetaFromState(IBlockState var0);

    int getRenderColor(IBlockState var0);

    void grow(World var0, Random var1, BlockPos var2, IBlockState var3);

    void updateTick(World var0, BlockPos var1, IBlockState var2, Random var3);

}
