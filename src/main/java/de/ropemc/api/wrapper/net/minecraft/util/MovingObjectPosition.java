package de.ropemc.api.wrapper.net.minecraft.util;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.MovingObjectPosition")
public interface MovingObjectPosition {

    BlockPos getBlockPos();

}
