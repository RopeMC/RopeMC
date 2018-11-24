package de.ropemc.api.wrapper.net.minecraft.pathfinding;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.util.Vec3;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.pathfinding.PathEntity")
public interface PathEntity {

    int getCurrentPathIndex();

    int getCurrentPathLength();

    PathPoint getFinalPathPoint();

    PathPoint getPathPointFromIndex(int var0);

    Vec3 getPosition(Entity var0);

    Vec3 getVectorFromIndex(Entity var0, int var1);

    void incrementPathIndex();

    boolean isDestinationSame(Vec3 var0);

    boolean isFinished();

    boolean isSamePath(PathEntity var0);

    void setCurrentPathIndex(int var0);

    void setCurrentPathLength(int var0);

}
