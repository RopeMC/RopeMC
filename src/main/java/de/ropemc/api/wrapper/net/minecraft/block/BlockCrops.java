package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.block.state.BlockState;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockCrops")
public interface BlockCrops {

    boolean canBlockStay(World var0, BlockPos var1, IBlockState var2);

    boolean canGrow(World var0, BlockPos var1, IBlockState var2, boolean var3);

    boolean canPlaceBlockOn(Block var0);

    boolean canUseBonemeal(World var0, Random var1, BlockPos var2, IBlockState var3);

    BlockState createBlockState();

    void dropBlockAsItemWithChance(World var0, BlockPos var1, IBlockState var2, float var3, int var4);

    Item getCrop();

    float getGrowthChance(Block var0, World var1, BlockPos var2);

    Item getItem(World var0, BlockPos var1);

    Item getItemDropped(IBlockState var0, Random var1, int var2);

    int getMetaFromState(IBlockState var0);

    Item getSeed();

    IBlockState getStateFromMeta(int var0);

    void grow(World var0, Random var1, BlockPos var2, IBlockState var3);

    void grow(World var0, BlockPos var1, IBlockState var2);

    void updateTick(World var0, BlockPos var1, IBlockState var2, Random var3);

}
