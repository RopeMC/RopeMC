package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.block.state.BlockState;
import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntity;
import de.ropemc.api.wrapper.net.minecraft.world.ILockableContainer;
import de.ropemc.api.wrapper.net.minecraft.world.IBlockAccess;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockChest")
public interface BlockChest {

    void breakBlock(World var0, BlockPos var1, IBlockState var2);

    boolean canPlaceBlockAt(World var0, BlockPos var1);

    boolean canProvidePower();

    IBlockState checkForSurroundingChests(World var0, BlockPos var1, IBlockState var2);

    IBlockState correctFacing(World var0, BlockPos var1, IBlockState var2);

    BlockState createBlockState();

    TileEntity createNewTileEntity(World var0, int var1);

    int getComparatorInputOverride(World var0, BlockPos var1);

    ILockableContainer getLockableContainer(World var0, BlockPos var1);

    int getMetaFromState(IBlockState var0);

    int getRenderType();

    IBlockState getStateFromMeta(int var0);

    int getStrongPower(IBlockAccess var0, BlockPos var1, IBlockState var2, EnumFacing var3);

    int getWeakPower(IBlockAccess var0, BlockPos var1, IBlockState var2, EnumFacing var3);

    boolean hasComparatorInputOverride();

    boolean isBelowSolidBlock(World var0, BlockPos var1);

    boolean isBlocked(World var0, BlockPos var1);

    boolean isDoubleChest(World var0, BlockPos var1);

    boolean isFullCube();

    boolean isOcelotSittingOnChest(World var0, BlockPos var1);

    boolean isOpaqueCube();

    boolean onBlockActivated(World var0, BlockPos var1, IBlockState var2, EntityPlayer var3, EnumFacing var4, float var5, float var6, float var7);

    void onBlockAdded(World var0, BlockPos var1, IBlockState var2);

    IBlockState onBlockPlaced(World var0, BlockPos var1, EnumFacing var2, float var3, float var4, float var5, int var6, EntityLivingBase var7);

    void onBlockPlacedBy(World var0, BlockPos var1, IBlockState var2, EntityLivingBase var3, ItemStack var4);

    void onNeighborBlockChange(World var0, BlockPos var1, IBlockState var2, Block var3);

    void setBlockBoundsBasedOnState(IBlockAccess var0, BlockPos var1);

}
