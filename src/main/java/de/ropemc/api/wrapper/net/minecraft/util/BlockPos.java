package de.ropemc.api.wrapper.net.minecraft.util;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.BlockPos")
public interface BlockPos {

    BlockPos add(double var0, double var1, double var2);

    BlockPos add(int var0, int var1, int var2);

    BlockPos add(Vec3i var0);

    BlockPos crossProduct(Vec3i var0);

    BlockPos down();

    BlockPos down(int var0);

    BlockPos east();

    BlockPos east(int var0);

    BlockPos fromLong(long var0);

    Iterable getAllInBox(BlockPos var0, BlockPos var1);

    Iterable getAllInBoxMutable(BlockPos var0, BlockPos var1);

    BlockPos north();

    BlockPos north(int var0);

    BlockPos offset(EnumFacing var0);

    BlockPos offset(EnumFacing var0, int var1);

    BlockPos south();

    BlockPos south(int var0);

    BlockPos subtract(Vec3i var0);

    long toLong();

    BlockPos up();

    BlockPos up(int var0);

    BlockPos west();

    BlockPos west(int var0);

}
