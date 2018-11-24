package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.world.IBlockAccess;
import de.ropemc.api.wrapper.net.minecraft.util.EnumWorldBlockLayer;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import java.util.Random;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockRedstoneDiode")
public interface BlockRedstoneDiode {

    int calculateInputStrength(World var0, BlockPos var1, IBlockState var2);

    boolean canBlockStay(World var0, BlockPos var1);

    boolean canPlaceBlockAt(World var0, BlockPos var1);

    boolean canPowerSide(Block var0);

    boolean canProvidePower();

    int getActiveSignal(IBlockAccess var0, BlockPos var1, IBlockState var2);

    EnumWorldBlockLayer getBlockLayer();

    int getDelay(IBlockState var0);

    int getPowerOnSide(IBlockAccess var0, BlockPos var1, EnumFacing var2);

    int getPowerOnSides(IBlockAccess var0, BlockPos var1, IBlockState var2);

    IBlockState getPoweredState(IBlockState var0);

    int getStrongPower(IBlockAccess var0, BlockPos var1, IBlockState var2, EnumFacing var3);

    int getTickDelay(IBlockState var0);

    IBlockState getUnpoweredState(IBlockState var0);

    int getWeakPower(IBlockAccess var0, BlockPos var1, IBlockState var2, EnumFacing var3);

    boolean isAssociated(Block var0);

    boolean isAssociatedBlock(Block var0);

    boolean isFacingTowardsRepeater(World var0, BlockPos var1, IBlockState var2);

    boolean isFullCube();

    boolean isLocked(IBlockAccess var0, BlockPos var1, IBlockState var2);

    boolean isOpaqueCube();

    boolean isPowered(IBlockState var0);

    boolean isRedstoneRepeaterBlockID(Block var0);

    void notifyNeighbors(World var0, BlockPos var1, IBlockState var2);

    void onBlockAdded(World var0, BlockPos var1, IBlockState var2);

    void onBlockDestroyedByPlayer(World var0, BlockPos var1, IBlockState var2);

    IBlockState onBlockPlaced(World var0, BlockPos var1, EnumFacing var2, float var3, float var4, float var5, int var6, EntityLivingBase var7);

    void onBlockPlacedBy(World var0, BlockPos var1, IBlockState var2, EntityLivingBase var3, ItemStack var4);

    void onNeighborBlockChange(World var0, BlockPos var1, IBlockState var2, Block var3);

    void randomTick(World var0, BlockPos var1, IBlockState var2, Random var3);

    boolean shouldBePowered(World var0, BlockPos var1, IBlockState var2);

    boolean shouldSideBeRendered(IBlockAccess var0, BlockPos var1, EnumFacing var2);

    void updateState(World var0, BlockPos var1, IBlockState var2);

    void updateTick(World var0, BlockPos var1, IBlockState var2, Random var3);

}
