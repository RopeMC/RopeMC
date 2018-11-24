package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.util.AxisAlignedBB;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.block.state.BlockState;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.world.IBlockAccess;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockPistonBase")
public interface BlockPistonBase {

    void addCollisionBoxesToList(World var0, BlockPos var1, IBlockState var2, AxisAlignedBB var3, List var4, Entity var5);

    boolean canPush(Block var0, World var1, BlockPos var2, EnumFacing var3, boolean var4);

    void checkForMove(World var0, BlockPos var1, IBlockState var2);

    BlockState createBlockState();

    boolean doMove(World var0, BlockPos var1, EnumFacing var2, boolean var3);

    AxisAlignedBB getCollisionBoundingBox(World var0, BlockPos var1, IBlockState var2);

    EnumFacing getFacing(int var0);

    EnumFacing getFacingFromEntity(World var0, BlockPos var1, EntityLivingBase var2);

    int getMetaFromState(IBlockState var0);

    IBlockState getStateForEntityRender(IBlockState var0);

    IBlockState getStateFromMeta(int var0);

    boolean isFullCube();

    boolean isOpaqueCube();

    void onBlockAdded(World var0, BlockPos var1, IBlockState var2);

    boolean onBlockEventReceived(World var0, BlockPos var1, IBlockState var2, int var3, int var4);

    IBlockState onBlockPlaced(World var0, BlockPos var1, EnumFacing var2, float var3, float var4, float var5, int var6, EntityLivingBase var7);

    void onBlockPlacedBy(World var0, BlockPos var1, IBlockState var2, EntityLivingBase var3, ItemStack var4);

    void onNeighborBlockChange(World var0, BlockPos var1, IBlockState var2, Block var3);

    void setBlockBoundsBasedOnState(IBlockAccess var0, BlockPos var1);

    void setBlockBoundsForItemRender();

    boolean shouldBeExtended(World var0, BlockPos var1, EnumFacing var2);

}
