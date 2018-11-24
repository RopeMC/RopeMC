package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.block.state.BlockState;
import de.ropemc.api.wrapper.net.minecraft.world.IBlockAccess;
import de.ropemc.api.wrapper.net.minecraft.util.EnumWorldBlockLayer;
import de.ropemc.api.wrapper.net.minecraft.util.AxisAlignedBB;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import java.util.Random;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockTripWireHook")
public interface BlockTripWireHook {

    void breakBlock(World var0, BlockPos var1, IBlockState var2);

    boolean canPlaceBlockAt(World var0, BlockPos var1);

    boolean canPlaceBlockOnSide(World var0, BlockPos var1, EnumFacing var2);

    boolean canProvidePower();

    boolean checkForDrop(World var0, BlockPos var1, IBlockState var2);

    BlockState createBlockState();

    void func_176260_a(World var0, BlockPos var1, IBlockState var2, boolean var3, boolean var4, int var5, IBlockState var6);

    void func_176262_b(World var0, BlockPos var1, EnumFacing var2);

    void func_180694_a(World var0, BlockPos var1, boolean var2, boolean var3, boolean var4, boolean var5);

    IBlockState getActualState(IBlockState var0, IBlockAccess var1, BlockPos var2);

    EnumWorldBlockLayer getBlockLayer();

    AxisAlignedBB getCollisionBoundingBox(World var0, BlockPos var1, IBlockState var2);

    int getMetaFromState(IBlockState var0);

    IBlockState getStateFromMeta(int var0);

    int getStrongPower(IBlockAccess var0, BlockPos var1, IBlockState var2, EnumFacing var3);

    int getWeakPower(IBlockAccess var0, BlockPos var1, IBlockState var2, EnumFacing var3);

    boolean isFullCube();

    boolean isOpaqueCube();

    IBlockState onBlockPlaced(World var0, BlockPos var1, EnumFacing var2, float var3, float var4, float var5, int var6, EntityLivingBase var7);

    void onBlockPlacedBy(World var0, BlockPos var1, IBlockState var2, EntityLivingBase var3, ItemStack var4);

    void onNeighborBlockChange(World var0, BlockPos var1, IBlockState var2, Block var3);

    void randomTick(World var0, BlockPos var1, IBlockState var2, Random var3);

    void setBlockBoundsBasedOnState(IBlockAccess var0, BlockPos var1);

    void updateTick(World var0, BlockPos var1, IBlockState var2, Random var3);

}
