package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.util.EnumWorldBlockLayer;
import de.ropemc.api.wrapper.net.minecraft.util.AxisAlignedBB;
import java.util.Random;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockBush")
public interface BlockBush {

    boolean canBlockStay(World var0, BlockPos var1, IBlockState var2);

    boolean canPlaceBlockAt(World var0, BlockPos var1);

    boolean canPlaceBlockOn(Block var0);

    void checkAndDropBlock(World var0, BlockPos var1, IBlockState var2);

    EnumWorldBlockLayer getBlockLayer();

    AxisAlignedBB getCollisionBoundingBox(World var0, BlockPos var1, IBlockState var2);

    boolean isFullCube();

    boolean isOpaqueCube();

    void onNeighborBlockChange(World var0, BlockPos var1, IBlockState var2, Block var3);

    void updateTick(World var0, BlockPos var1, IBlockState var2, Random var3);

}
