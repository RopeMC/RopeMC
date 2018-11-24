package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.block.state.BlockState;
import de.ropemc.api.wrapper.net.minecraft.util.EnumWorldBlockLayer;
import de.ropemc.api.wrapper.net.minecraft.util.AxisAlignedBB;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.world.IBlockAccess;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockCocoa")
public interface BlockCocoa {

    boolean canBlockStay(World var0, BlockPos var1, IBlockState var2);

    boolean canGrow(World var0, BlockPos var1, IBlockState var2, boolean var3);

    boolean canUseBonemeal(World var0, Random var1, BlockPos var2, IBlockState var3);

    BlockState createBlockState();

    void dropBlock(World var0, BlockPos var1, IBlockState var2);

    void dropBlockAsItemWithChance(World var0, BlockPos var1, IBlockState var2, float var3, int var4);

    EnumWorldBlockLayer getBlockLayer();

    AxisAlignedBB getCollisionBoundingBox(World var0, BlockPos var1, IBlockState var2);

    int getDamageValue(World var0, BlockPos var1);

    Item getItem(World var0, BlockPos var1);

    int getMetaFromState(IBlockState var0);

    AxisAlignedBB getSelectedBoundingBox(World var0, BlockPos var1);

    IBlockState getStateFromMeta(int var0);

    void grow(World var0, Random var1, BlockPos var2, IBlockState var3);

    boolean isFullCube();

    boolean isOpaqueCube();

    IBlockState onBlockPlaced(World var0, BlockPos var1, EnumFacing var2, float var3, float var4, float var5, int var6, EntityLivingBase var7);

    void onBlockPlacedBy(World var0, BlockPos var1, IBlockState var2, EntityLivingBase var3, ItemStack var4);

    void onNeighborBlockChange(World var0, BlockPos var1, IBlockState var2, Block var3);

    void setBlockBoundsBasedOnState(IBlockAccess var0, BlockPos var1);

    void updateTick(World var0, BlockPos var1, IBlockState var2, Random var3);

}
