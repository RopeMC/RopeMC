package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.world.IBlockAccess;
import de.ropemc.api.wrapper.net.minecraft.block.state.BlockState;
import de.ropemc.api.wrapper.net.minecraft.util.EnumWorldBlockLayer;
import de.ropemc.api.wrapper.net.minecraft.util.AxisAlignedBB;
import de.ropemc.api.wrapper.net.minecraft.block.material.Material;
import de.ropemc.api.wrapper.net.minecraft.util.Vec3;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockLiquid")
public interface BlockLiquid {

    boolean canCollideCheck(IBlockState var0, boolean var1);

    boolean checkForMixing(World var0, BlockPos var1, IBlockState var2);

    int colorMultiplier(IBlockAccess var0, BlockPos var1, int var2);

    BlockState createBlockState();

    boolean func_176364_g(IBlockAccess var0, BlockPos var1);

    EnumWorldBlockLayer getBlockLayer();

    AxisAlignedBB getCollisionBoundingBox(World var0, BlockPos var1, IBlockState var2);

    int getEffectiveFlowDecay(IBlockAccess var0, BlockPos var1);

    double getFlowDirection(IBlockAccess var0, BlockPos var1, Material var2);

    Vec3 getFlowVector(IBlockAccess var0, BlockPos var1);

    BlockDynamicLiquid getFlowingBlock(Material var0);

    Item getItemDropped(IBlockState var0, Random var1, int var2);

    int getLevel(IBlockAccess var0, BlockPos var1);

    float getLiquidHeightPercent(int var0);

    int getMetaFromState(IBlockState var0);

    int getMixedBrightnessForBlock(IBlockAccess var0, BlockPos var1);

    int getRenderType();

    IBlockState getStateFromMeta(int var0);

    BlockStaticLiquid getStaticBlock(Material var0);

    boolean isBlockSolid(IBlockAccess var0, BlockPos var1, EnumFacing var2);

    boolean isFullCube();

    boolean isOpaqueCube();

    boolean isPassable(IBlockAccess var0, BlockPos var1);

    Vec3 modifyAcceleration(World var0, BlockPos var1, Entity var2, Vec3 var3);

    void onBlockAdded(World var0, BlockPos var1, IBlockState var2);

    void onNeighborBlockChange(World var0, BlockPos var1, IBlockState var2, Block var3);

    int quantityDropped(Random var0);

    void randomDisplayTick(World var0, BlockPos var1, IBlockState var2, Random var3);

    boolean shouldSideBeRendered(IBlockAccess var0, BlockPos var1, EnumFacing var2);

    int tickRate(World var0);

    void triggerMixEffects(World var0, BlockPos var1);

}
