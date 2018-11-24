package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.BlockState;
import de.ropemc.api.wrapper.net.minecraft.util.EnumWorldBlockLayer;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.util.AxisAlignedBB;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import java.util.Random;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockCactus")
public interface BlockCactus {

    boolean canBlockStay(World var0, BlockPos var1);

    boolean canPlaceBlockAt(World var0, BlockPos var1);

    BlockState createBlockState();

    EnumWorldBlockLayer getBlockLayer();

    AxisAlignedBB getCollisionBoundingBox(World var0, BlockPos var1, IBlockState var2);

    int getMetaFromState(IBlockState var0);

    AxisAlignedBB getSelectedBoundingBox(World var0, BlockPos var1);

    IBlockState getStateFromMeta(int var0);

    boolean isFullCube();

    boolean isOpaqueCube();

    void onEntityCollidedWithBlock(World var0, BlockPos var1, IBlockState var2, Entity var3);

    void onNeighborBlockChange(World var0, BlockPos var1, IBlockState var2, Block var3);

    void updateTick(World var0, BlockPos var1, IBlockState var2, Random var3);

}
