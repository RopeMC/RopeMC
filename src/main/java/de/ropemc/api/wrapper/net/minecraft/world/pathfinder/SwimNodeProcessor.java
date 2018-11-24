package de.ropemc.api.wrapper.net.minecraft.world.pathfinder;

import de.ropemc.api.wrapper.net.minecraft.pathfinding.PathPoint;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.world.IBlockAccess;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.pathfinder.SwimNodeProcessor")
public interface SwimNodeProcessor {

    int findPathOptions(PathPoint[] var0, Entity var1, PathPoint var2, PathPoint var3, float var4);

    int func_176186_b(Entity var0, int var1, int var2, int var3);

    PathPoint getPathPointTo(Entity var0);

    PathPoint getPathPointToCoords(Entity var0, double var1, double var2, double var3);

    PathPoint getSafePoint(Entity var0, int var1, int var2, int var3);

    void initProcessor(IBlockAccess var0, Entity var1);

    void postProcess();

}
