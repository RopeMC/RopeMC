package de.ropemc.api.wrapper.net.minecraft.pathfinding;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.pathfinding.PathPoint")
public interface PathPoint {

    float distanceTo(PathPoint var0);

    float distanceToSquared(PathPoint var0);

    boolean isAssigned();

    int makeHash(int var0, int var1, int var2);

}
