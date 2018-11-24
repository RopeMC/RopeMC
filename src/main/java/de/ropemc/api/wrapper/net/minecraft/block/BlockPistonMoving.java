package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.util.Vec3;
import de.ropemc.api.wrapper.net.minecraft.util.MovingObjectPosition;
import de.ropemc.api.wrapper.net.minecraft.block.state.BlockState;
import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntity;
import de.ropemc.api.wrapper.net.minecraft.util.AxisAlignedBB;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.world.IBlockAccess;
import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntityPiston;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockPistonMoving")
public interface BlockPistonMoving {

    void breakBlock(World var0, BlockPos var1, IBlockState var2);

    boolean canPlaceBlockAt(World var0, BlockPos var1);

    boolean canPlaceBlockOnSide(World var0, BlockPos var1, EnumFacing var2);

    MovingObjectPosition collisionRayTrace(World var0, BlockPos var1, Vec3 var2, Vec3 var3);

    BlockState createBlockState();

    TileEntity createNewTileEntity(World var0, int var1);

    void dropBlockAsItemWithChance(World var0, BlockPos var1, IBlockState var2, float var3, int var4);

    AxisAlignedBB getBoundingBox(World var0, BlockPos var1, IBlockState var2, float var3, EnumFacing var4);

    AxisAlignedBB getCollisionBoundingBox(World var0, BlockPos var1, IBlockState var2);

    Item getItem(World var0, BlockPos var1);

    Item getItemDropped(IBlockState var0, Random var1, int var2);

    int getMetaFromState(IBlockState var0);

    IBlockState getStateFromMeta(int var0);

    TileEntityPiston getTileEntity(IBlockAccess var0, BlockPos var1);

    boolean isFullCube();

    boolean isOpaqueCube();

    TileEntity newTileEntity(IBlockState var0, EnumFacing var1, boolean var2, boolean var3);

    boolean onBlockActivated(World var0, BlockPos var1, IBlockState var2, EntityPlayer var3, EnumFacing var4, float var5, float var6, float var7);

    void onBlockDestroyedByPlayer(World var0, BlockPos var1, IBlockState var2);

    void onNeighborBlockChange(World var0, BlockPos var1, IBlockState var2, Block var3);

    void setBlockBoundsBasedOnState(IBlockAccess var0, BlockPos var1);

}
