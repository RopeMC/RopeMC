package de.ropemc.api.wrapper.net.minecraft.world.pathfinder;

import de.ropemc.api.wrapper.net.minecraft.pathfinding.PathPoint;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.world.IBlockAccess;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.pathfinder.NodeProcessor")
public interface NodeProcessor {

    int findPathOptions(PathPoint[] var0, Entity var1, PathPoint var2, PathPoint var3, float var4);

    PathPoint getPathPointTo(Entity var0);

    PathPoint getPathPointToCoords(Entity var0, double var1, double var2, double var3);

    void initProcessor(IBlockAccess var0, Entity var1);

    PathPoint openPoint(int var0, int var1, int var2);

    void postProcess();

}
