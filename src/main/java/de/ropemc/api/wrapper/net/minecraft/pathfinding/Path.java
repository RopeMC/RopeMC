package de.ropemc.api.wrapper.net.minecraft.pathfinding;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.pathfinding.Path")
public interface Path {

    PathPoint addPoint(PathPoint var0);

    void changeDistance(PathPoint var0, float var1);

    void clearPath();

    PathPoint dequeue();

    boolean isPathEmpty();

    void sortBack(int var0);

    void sortForward(int var0);

}
