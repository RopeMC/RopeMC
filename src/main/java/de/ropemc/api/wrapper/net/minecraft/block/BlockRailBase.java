package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.util.Vec3;
import de.ropemc.api.wrapper.net.minecraft.util.MovingObjectPosition;
import de.ropemc.api.wrapper.net.minecraft.util.EnumWorldBlockLayer;
import de.ropemc.api.wrapper.net.minecraft.util.AxisAlignedBB;
import de.ropemc.api.wrapper.net.minecraft.block.properties.IProperty;
import de.ropemc.api.wrapper.net.minecraft.world.IBlockAccess;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockRailBase")
public interface BlockRailBase {

    void breakBlock(World var0, BlockPos var1, IBlockState var2);

    boolean canPlaceBlockAt(World var0, BlockPos var1);

    MovingObjectPosition collisionRayTrace(World var0, BlockPos var1, Vec3 var2, Vec3 var3);

    IBlockState func_176564_a(World var0, BlockPos var1, IBlockState var2, boolean var3);

    EnumWorldBlockLayer getBlockLayer();

    AxisAlignedBB getCollisionBoundingBox(World var0, BlockPos var1, IBlockState var2);

    int getMobilityFlag();

    IProperty getShapeProperty();

    boolean isFullCube();

    boolean isOpaqueCube();

    boolean isRailBlock(IBlockState var0);

    boolean isRailBlock(World var0, BlockPos var1);

    void onBlockAdded(World var0, BlockPos var1, IBlockState var2);

    void onNeighborBlockChange(World var0, BlockPos var1, IBlockState var2, Block var3);

    void onNeighborChangedInternal(World var0, BlockPos var1, IBlockState var2, Block var3);

    void setBlockBoundsBasedOnState(IBlockAccess var0, BlockPos var1);

}
