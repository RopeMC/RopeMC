package de.ropemc.api.wrapper.net.minecraft.util;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.BlockPos")
public interface BlockPos extends Vec3i
{
    /**
     * Add the given coordinates to the coordinates of this BlockPos
     */
    BlockPos add(double x, double y, double z);

    /**
     * Add the given coordinates to the coordinates of this BlockPos
     */
    BlockPos add(int x, int y, int z);

    /**
     * Offset this BlockPos 1 block up
     */
    BlockPos up();

    /**
     * Offset this BlockPos n blocks up
     */
    BlockPos up(int n);

    /**
     * Offset this BlockPos 1 block down
     */
    BlockPos down();

    /**
     * Offset this BlockPos n blocks down
     */
    BlockPos down(int n);

    /**
     * Offset this BlockPos 1 block in northern direction
     */
    BlockPos north();

    /**
     * Offset this BlockPos n blocks in northern direction
     */
    BlockPos north(int n);

    /**
     * Offset this BlockPos 1 block in southern direction
     */
    BlockPos south();

    /**
     * Offset this BlockPos n blocks in southern direction
     */
    BlockPos south(int n);

    /**
     * Offset this BlockPos 1 block in western direction
     */
    BlockPos west();

    /**
     * Offset this BlockPos n blocks in western direction
     */
    BlockPos west(int n);

    /**
     * Offset this BlockPos 1 block in eastern direction
     */
    BlockPos east();

    /**
     * Offset this BlockPos n blocks in eastern direction
     */
    BlockPos east(int n);

    /**
     * Serialize this BlockPos into a long value
     */
    long toLong();

    /**
     * Create a BlockPos from a serialized long value (created by toLong)
     */
    BlockPos fromLong(long serialized);
}
