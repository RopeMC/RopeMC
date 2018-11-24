package de.ropemc.api.wrapper.net.minecraft.pathfinding;

import de.ropemc.api.wrapper.net.minecraft.util.Vec3;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.pathfinding.PathNavigate")
public interface PathNavigate {

    boolean canNavigate();

    void checkForStuck(Vec3 var0);

    void clearPathEntity();

    Vec3 getEntityPosition();

    PathEntity getPath();

    PathFinder getPathFinder();

    float getPathSearchRange();

    PathEntity getPathToEntityLiving(Entity var0);

    PathEntity getPathToPos(BlockPos var0);

    PathEntity getPathToXYZ(double var0, double var1, double var2);

    boolean isDirectPathBetweenPoints(Vec3 var0, Vec3 var1, int var2, int var3, int var4);

    boolean isInLiquid();

    boolean noPath();

    void onUpdateNavigation();

    void pathFollow();

    void removeSunnyPath();

    void setHeightRequirement(float var0);

    boolean setPath(PathEntity var0, double var1);

    void setSpeed(double var0);

    boolean tryMoveToEntityLiving(Entity var0, double var1);

    boolean tryMoveToXYZ(double var0, double var1, double var2, double var3);

}
