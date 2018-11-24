package de.ropemc.api.wrapper.net.minecraft.pathfinding;

import de.ropemc.api.wrapper.net.minecraft.util.Vec3;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.pathfinding.PathNavigateSwimmer")
public interface PathNavigateSwimmer {

    boolean canNavigate();

    Vec3 getEntityPosition();

    PathFinder getPathFinder();

    boolean isDirectPathBetweenPoints(Vec3 var0, Vec3 var1, int var2, int var3, int var4);

    void pathFollow();

    void removeSunnyPath();

}
