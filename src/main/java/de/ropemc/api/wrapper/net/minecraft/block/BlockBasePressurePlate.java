package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.util.AxisAlignedBB;
import de.ropemc.api.wrapper.net.minecraft.world.IBlockAccess;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import java.util.Random;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockBasePressurePlate")
public interface BlockBasePressurePlate {

    void breakBlock(World var0, BlockPos var1, IBlockState var2);

    boolean canBePlacedOn(World var0, BlockPos var1);

    boolean canPlaceBlockAt(World var0, BlockPos var1);

    boolean canProvidePower();

    int computeRedstoneStrength(World var0, BlockPos var1);

    boolean func_181623_g();

    AxisAlignedBB getCollisionBoundingBox(World var0, BlockPos var1, IBlockState var2);

    int getMobilityFlag();

    int getRedstoneStrength(IBlockState var0);

    AxisAlignedBB getSensitiveAABB(BlockPos var0);

    int getStrongPower(IBlockAccess var0, BlockPos var1, IBlockState var2, EnumFacing var3);

    int getWeakPower(IBlockAccess var0, BlockPos var1, IBlockState var2, EnumFacing var3);

    boolean isFullCube();

    boolean isOpaqueCube();

    boolean isPassable(IBlockAccess var0, BlockPos var1);

    void onEntityCollidedWithBlock(World var0, BlockPos var1, IBlockState var2, Entity var3);

    void onNeighborBlockChange(World var0, BlockPos var1, IBlockState var2, Block var3);

    void randomTick(World var0, BlockPos var1, IBlockState var2, Random var3);

    void setBlockBoundsBasedOnState(IBlockAccess var0, BlockPos var1);

    void setBlockBoundsBasedOnState0(IBlockState var0);

    void setBlockBoundsForItemRender();

    IBlockState setRedstoneStrength(IBlockState var0, int var1);

    int tickRate(World var0);

    void updateNeighbors(World var0, BlockPos var1);

    void updateState(World var0, BlockPos var1, IBlockState var2, int var3);

    void updateTick(World var0, BlockPos var1, IBlockState var2, Random var3);

}
