package de.ropemc.api.wrapper.net.minecraft.util;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.Vec3i")
public interface Vec3i
{
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
}
