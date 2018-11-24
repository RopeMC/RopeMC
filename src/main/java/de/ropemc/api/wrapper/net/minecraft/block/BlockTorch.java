package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.util.Vec3;
import de.ropemc.api.wrapper.net.minecraft.util.MovingObjectPosition;
import de.ropemc.api.wrapper.net.minecraft.block.state.BlockState;
import de.ropemc.api.wrapper.net.minecraft.util.EnumWorldBlockLayer;
import de.ropemc.api.wrapper.net.minecraft.util.AxisAlignedBB;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import java.util.Random;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockTorch")
public interface BlockTorch {

    boolean canPlaceAt(World var0, BlockPos var1, EnumFacing var2);

    boolean canPlaceBlockAt(World var0, BlockPos var1);

    boolean canPlaceOn(World var0, BlockPos var1);

    boolean checkForDrop(World var0, BlockPos var1, IBlockState var2);

    MovingObjectPosition collisionRayTrace(World var0, BlockPos var1, Vec3 var2, Vec3 var3);

    BlockState createBlockState();

    EnumWorldBlockLayer getBlockLayer();

    AxisAlignedBB getCollisionBoundingBox(World var0, BlockPos var1, IBlockState var2);

    int getMetaFromState(IBlockState var0);

    IBlockState getStateFromMeta(int var0);

    boolean isFullCube();

    boolean isOpaqueCube();

    void onBlockAdded(World var0, BlockPos var1, IBlockState var2);

    IBlockState onBlockPlaced(World var0, BlockPos var1, EnumFacing var2, float var3, float var4, float var5, int var6, EntityLivingBase var7);

    void onNeighborBlockChange(World var0, BlockPos var1, IBlockState var2, Block var3);

    boolean onNeighborChangeInternal(World var0, BlockPos var1, IBlockState var2);

    void randomDisplayTick(World var0, BlockPos var1, IBlockState var2, Random var3);

}
