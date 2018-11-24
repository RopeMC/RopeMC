package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.util.AxisAlignedBB;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockAir")
public interface BlockAir {

    boolean canCollideCheck(IBlockState var0, boolean var1);

    void dropBlockAsItemWithChance(World var0, BlockPos var1, IBlockState var2, float var3, int var4);

    AxisAlignedBB getCollisionBoundingBox(World var0, BlockPos var1, IBlockState var2);

    int getRenderType();

    boolean isOpaqueCube();

    boolean isReplaceable(World var0, BlockPos var1);

}
