package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.util.Vec3;
import de.ropemc.api.wrapper.net.minecraft.util.MovingObjectPosition;
import de.ropemc.api.wrapper.net.minecraft.block.state.BlockState;
import de.ropemc.api.wrapper.net.minecraft.util.EnumWorldBlockLayer;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.util.AxisAlignedBB;
import de.ropemc.api.wrapper.net.minecraft.world.IBlockAccess;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockTrapDoor")
public interface BlockTrapDoor {

    boolean canPlaceBlockOnSide(World var0, BlockPos var1, EnumFacing var2);

    MovingObjectPosition collisionRayTrace(World var0, BlockPos var1, Vec3 var2, Vec3 var3);

    BlockState createBlockState();

    EnumWorldBlockLayer getBlockLayer();

    AxisAlignedBB getCollisionBoundingBox(World var0, BlockPos var1, IBlockState var2);

    EnumFacing getFacing(int var0);

    int getMetaForFacing(EnumFacing var0);

    int getMetaFromState(IBlockState var0);

    AxisAlignedBB getSelectedBoundingBox(World var0, BlockPos var1);

    IBlockState getStateFromMeta(int var0);

    boolean isFullCube();

    boolean isOpaqueCube();

    boolean isPassable(IBlockAccess var0, BlockPos var1);

    boolean isValidSupportBlock(Block var0);

    boolean onBlockActivated(World var0, BlockPos var1, IBlockState var2, EntityPlayer var3, EnumFacing var4, float var5, float var6, float var7);

    IBlockState onBlockPlaced(World var0, BlockPos var1, EnumFacing var2, float var3, float var4, float var5, int var6, EntityLivingBase var7);

    void onNeighborBlockChange(World var0, BlockPos var1, IBlockState var2, Block var3);

    void setBlockBoundsBasedOnState(IBlockAccess var0, BlockPos var1);

    void setBlockBoundsForItemRender();

    void setBounds(IBlockState var0);

}
