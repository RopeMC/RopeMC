package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.block.state.BlockState;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
//import com.google.common.base.Predicate;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.util.AxisAlignedBB;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.block.properties.IProperty;
import de.ropemc.api.wrapper.net.minecraft.world.IBlockAccess;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import java.util.Random;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockRailDetector")
public interface BlockRailDetector {

    boolean canProvidePower();

    BlockState createBlockState();

    //List findMinecarts(World var0, BlockPos var1, Class var2, Predicate[] var3);

    int getComparatorInputOverride(World var0, BlockPos var1);

    AxisAlignedBB getDectectionBox(BlockPos var0);

    int getMetaFromState(IBlockState var0);

    IProperty getShapeProperty();

    IBlockState getStateFromMeta(int var0);

    int getStrongPower(IBlockAccess var0, BlockPos var1, IBlockState var2, EnumFacing var3);

    int getWeakPower(IBlockAccess var0, BlockPos var1, IBlockState var2, EnumFacing var3);

    boolean hasComparatorInputOverride();

    void onBlockAdded(World var0, BlockPos var1, IBlockState var2);

    void onEntityCollidedWithBlock(World var0, BlockPos var1, IBlockState var2, Entity var3);

    void randomTick(World var0, BlockPos var1, IBlockState var2, Random var3);

    int tickRate(World var0);

    void updatePoweredState(World var0, BlockPos var1, IBlockState var2);

    void updateTick(World var0, BlockPos var1, IBlockState var2, Random var3);

}
