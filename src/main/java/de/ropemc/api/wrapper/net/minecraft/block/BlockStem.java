package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.world.IBlockAccess;
import de.ropemc.api.wrapper.net.minecraft.block.state.BlockState;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockStem")
public interface BlockStem {

    boolean canGrow(World var0, BlockPos var1, IBlockState var2, boolean var3);

    boolean canPlaceBlockOn(Block var0);

    boolean canUseBonemeal(World var0, Random var1, BlockPos var2, IBlockState var3);

    int colorMultiplier(IBlockAccess var0, BlockPos var1, int var2);

    BlockState createBlockState();

    void dropBlockAsItemWithChance(World var0, BlockPos var1, IBlockState var2, float var3, int var4);

    IBlockState getActualState(IBlockState var0, IBlockAccess var1, BlockPos var2);

    Item getItem(World var0, BlockPos var1);

    Item getItemDropped(IBlockState var0, Random var1, int var2);

    int getMetaFromState(IBlockState var0);

    int getRenderColor(IBlockState var0);

    Item getSeedItem();

    IBlockState getStateFromMeta(int var0);

    void grow(World var0, Random var1, BlockPos var2, IBlockState var3);

    void growStem(World var0, BlockPos var1, IBlockState var2);

    void setBlockBoundsBasedOnState(IBlockAccess var0, BlockPos var1);

    void setBlockBoundsForItemRender();

    void updateTick(World var0, BlockPos var1, IBlockState var2, Random var3);

}
