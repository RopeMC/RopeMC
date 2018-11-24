package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.world.IBlockAccess;
import de.ropemc.api.wrapper.net.minecraft.block.state.BlockState;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.net.minecraft.creativetab.CreativeTabs;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntity;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockTallGrass")
public interface BlockTallGrass {

    boolean canBlockStay(World var0, BlockPos var1, IBlockState var2);

    boolean canGrow(World var0, BlockPos var1, IBlockState var2, boolean var3);

    boolean canUseBonemeal(World var0, Random var1, BlockPos var2, IBlockState var3);

    int colorMultiplier(IBlockAccess var0, BlockPos var1, int var2);

    BlockState createBlockState();

    int getBlockColor();

    int getDamageValue(World var0, BlockPos var1);

    Item getItemDropped(IBlockState var0, Random var1, int var2);

    int getMetaFromState(IBlockState var0);

    //Block$EnumOffsetType getOffsetType();

    int getRenderColor(IBlockState var0);

    IBlockState getStateFromMeta(int var0);

    void getSubBlocks(Item var0, CreativeTabs var1, List var2);

    void grow(World var0, Random var1, BlockPos var2, IBlockState var3);

    void harvestBlock(World var0, EntityPlayer var1, BlockPos var2, IBlockState var3, TileEntity var4);

    boolean isReplaceable(World var0, BlockPos var1);

    int quantityDroppedWithBonus(int var0, Random var1);

}
