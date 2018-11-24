package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.block.state.BlockState;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
//import de.ropemc.api.wrapper.net.minecraft.block.state.pattern.BlockPattern$PatternHelper;
import de.ropemc.api.wrapper.net.minecraft.util.EnumWorldBlockLayer;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.util.AxisAlignedBB;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
//import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing$Axis;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.world.IBlockAccess;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockPortal")
public interface BlockPortal {

    BlockState createBlockState();

    boolean func_176548_d(World var0, BlockPos var1);

    //BlockPattern$PatternHelper func_181089_f(World var0, BlockPos var1);

    EnumWorldBlockLayer getBlockLayer();

    AxisAlignedBB getCollisionBoundingBox(World var0, BlockPos var1, IBlockState var2);

    Item getItem(World var0, BlockPos var1);

    //int getMetaForAxis(EnumFacing$Axis var0);

    int getMetaFromState(IBlockState var0);

    IBlockState getStateFromMeta(int var0);

    boolean isFullCube();

    void onEntityCollidedWithBlock(World var0, BlockPos var1, IBlockState var2, Entity var3);

    void onNeighborBlockChange(World var0, BlockPos var1, IBlockState var2, Block var3);

    int quantityDropped(Random var0);

    void randomDisplayTick(World var0, BlockPos var1, IBlockState var2, Random var3);

    void setBlockBoundsBasedOnState(IBlockAccess var0, BlockPos var1);

    boolean shouldSideBeRendered(IBlockAccess var0, BlockPos var1, EnumFacing var2);

    void updateTick(World var0, BlockPos var1, IBlockState var2, Random var3);

}
