package de.ropemc.api.wrapper.net.minecraft.pathfinding;

import de.ropemc.api.wrapper.net.minecraft.util.Vec3;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.pathfinding.PathNavigateGround")
public interface PathNavigateGround {

    boolean canNavigate();

    boolean getAvoidsWater();

    boolean getCanSwim();

    boolean getEnterDoors();

    Vec3 getEntityPosition();

    PathFinder getPathFinder();

    int getPathablePosY();

    boolean isDirectPathBetweenPoints(Vec3 var0, Vec3 var1, int var2, int var3, int var4);

    boolean isPositionClear(int var0, int var1, int var2, int var3, int var4, int var5, Vec3 var6, double var7, double var8);

    boolean isSafeToStandAt(int var0, int var1, int var2, int var3, int var4, int var5, Vec3 var6, double var7, double var8);

    void removeSunnyPath();

    void setAvoidSun(boolean var0);

    void setAvoidsWater(boolean var0);

    void setBreakDoors(boolean var0);

    void setCanSwim(boolean var0);

    void setEnterDoors(boolean var0);

}
