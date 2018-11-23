package de.ropemc.api.wrapper.net.minecraft.util;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.BlockPos")
public interface BlockPos extends Vec3i {
    /**
     * Serialize this BlockPos into a long value
     */
    long toLong();

    /**
     * Offset this BlockPos 1 block up
     */
    BlockPos up();
}
