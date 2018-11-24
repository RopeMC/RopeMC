package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.util.Vec3;
import de.ropemc.api.wrapper.net.minecraft.util.MovingObjectPosition;
import de.ropemc.api.wrapper.net.minecraft.world.IBlockAccess;
import de.ropemc.api.wrapper.net.minecraft.block.state.BlockState;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.util.EnumWorldBlockLayer;
import de.ropemc.api.wrapper.net.minecraft.util.AxisAlignedBB;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockDoor")
public interface BlockDoor {

    boolean canPlaceBlockAt(World var0, BlockPos var1);

    MovingObjectPosition collisionRayTrace(World var0, BlockPos var1, Vec3 var2, Vec3 var3);

    int combineMetadata(IBlockAccess var0, BlockPos var1);

    BlockState createBlockState();

    IBlockState getActualState(IBlockState var0, IBlockAccess var1, BlockPos var2);

    EnumWorldBlockLayer getBlockLayer();

    AxisAlignedBB getCollisionBoundingBox(World var0, BlockPos var1, IBlockState var2);

    EnumFacing getFacing(int var0);

    EnumFacing getFacing(IBlockAccess var0, BlockPos var1);

    Item getItem();

    Item getItem(World var0, BlockPos var1);

    Item getItemDropped(IBlockState var0, Random var1, int var2);

    String getLocalizedName();

    int getMetaFromState(IBlockState var0);

    int getMobilityFlag();

    AxisAlignedBB getSelectedBoundingBox(World var0, BlockPos var1);

    IBlockState getStateFromMeta(int var0);

    boolean isFullCube();

    boolean isHingeLeft(int var0);

    boolean isOpaqueCube();

    boolean isOpen(int var0);

    boolean isOpen(IBlockAccess var0, BlockPos var1);

    boolean isPassable(IBlockAccess var0, BlockPos var1);

    boolean isTop(int var0);

    boolean onBlockActivated(World var0, BlockPos var1, IBlockState var2, EntityPlayer var3, EnumFacing var4, float var5, float var6, float var7);

    void onBlockHarvested(World var0, BlockPos var1, IBlockState var2, EntityPlayer var3);

    void onNeighborBlockChange(World var0, BlockPos var1, IBlockState var2, Block var3);

    int removeHalfBit(int var0);

    void setBlockBoundsBasedOnState(IBlockAccess var0, BlockPos var1);

    void setBoundBasedOnMeta(int var0);

    void toggleDoor(World var0, BlockPos var1, boolean var2);

}
