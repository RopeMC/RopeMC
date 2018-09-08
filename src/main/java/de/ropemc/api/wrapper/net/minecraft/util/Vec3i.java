package de.ropemc.api.wrapper.net.minecraft.util;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.Vec3i")
public interface Vec3i {
    /**
     * Get the X coordinate
     */
    int getX();

    /**
     * Get the Y coordinate
     */
    int getY();

    /**
     * Get the Z coordinate
     */
    int getZ();

    /**
     * Calculate squared distance to the given coordinates
     */
    double distanceSq(double toX, double toY, double toZ);

    /**
     * Compute square of distance from point x, y, z to center of this Block
     */
    double distanceSqToCenter(double xIn, double yIn, double zIn);

    String toString();
}
