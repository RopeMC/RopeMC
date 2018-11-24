package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.block.state.BlockState;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.net.minecraft.creativetab.CreativeTabs;
import java.util.List;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockSapling")
public interface BlockSapling {

    boolean canGrow(World var0, BlockPos var1, IBlockState var2, boolean var3);

    boolean canUseBonemeal(World var0, Random var1, BlockPos var2, IBlockState var3);

    BlockState createBlockState();

    int damageDropped(IBlockState var0);

    //boolean func_181624_a(World var0, BlockPos var1, int var2, int var3, BlockPlanks$EnumType var4);

    void generateTree(World var0, BlockPos var1, IBlockState var2, Random var3);

    String getLocalizedName();

    int getMetaFromState(IBlockState var0);

    IBlockState getStateFromMeta(int var0);

    void getSubBlocks(Item var0, CreativeTabs var1, List var2);

    void grow(World var0, Random var1, BlockPos var2, IBlockState var3);

    void grow(World var0, BlockPos var1, IBlockState var2, Random var3);

    //boolean isTypeAt(World var0, BlockPos var1, BlockPlanks$EnumType var2);

    void updateTick(World var0, BlockPos var1, IBlockState var2, Random var3);

}
