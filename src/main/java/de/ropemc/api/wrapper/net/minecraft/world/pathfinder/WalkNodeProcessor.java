package de.ropemc.api.wrapper.net.minecraft.world.pathfinder;

import de.ropemc.api.wrapper.net.minecraft.pathfinding.PathPoint;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.world.IBlockAccess;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.pathfinder.WalkNodeProcessor")
public interface WalkNodeProcessor {

    int findPathOptions(PathPoint[] var0, Entity var1, PathPoint var2, PathPoint var3, float var4);

    int func_176170_a(IBlockAccess var0, Entity var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, boolean var9, boolean var10);

    boolean getAvoidsWater();

    boolean getCanSwim();

    boolean getEnterDoors();

    PathPoint getPathPointTo(Entity var0);

    PathPoint getPathPointToCoords(Entity var0, double var1, double var2, double var3);

    PathPoint getSafePoint(Entity var0, int var1, int var2, int var3, int var4);

    int getVerticalOffset(Entity var0, int var1, int var2, int var3);

    void initProcessor(IBlockAccess var0, Entity var1);

    void postProcess();

    void setAvoidsWater(boolean var0);

    void setBreakDoors(boolean var0);

    void setCanSwim(boolean var0);

    void setEnterDoors(boolean var0);

}
