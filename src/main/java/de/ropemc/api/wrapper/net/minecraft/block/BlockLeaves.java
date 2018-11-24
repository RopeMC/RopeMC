package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.world.IBlockAccess;
import de.ropemc.api.wrapper.net.minecraft.util.EnumWorldBlockLayer;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockLeaves")
public interface BlockLeaves {

    void breakBlock(World var0, BlockPos var1, IBlockState var2);

    int colorMultiplier(IBlockAccess var0, BlockPos var1, int var2);

    void destroy(World var0, BlockPos var1);

    void dropApple(World var0, BlockPos var1, IBlockState var2, int var3);

    void dropBlockAsItemWithChance(World var0, BlockPos var1, IBlockState var2, float var3, int var4);

    int getBlockColor();

    EnumWorldBlockLayer getBlockLayer();

    Item getItemDropped(IBlockState var0, Random var1, int var2);

    int getRenderColor(IBlockState var0);

    int getSaplingDropChance(IBlockState var0);

    //BlockPlanks$EnumType getWoodType(int var0);

    boolean isOpaqueCube();

    boolean isVisuallyOpaque();

    int quantityDropped(Random var0);

    void randomDisplayTick(World var0, BlockPos var1, IBlockState var2, Random var3);

    void setGraphicsLevel(boolean var0);

    void updateTick(World var0, BlockPos var1, IBlockState var2, Random var3);

}
