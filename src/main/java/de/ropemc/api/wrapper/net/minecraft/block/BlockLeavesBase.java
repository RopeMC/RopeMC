package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.IBlockAccess;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockLeavesBase")
public interface BlockLeavesBase {

    boolean isOpaqueCube();

    boolean shouldSideBeRendered(IBlockAccess var0, BlockPos var1, EnumFacing var2);

}
