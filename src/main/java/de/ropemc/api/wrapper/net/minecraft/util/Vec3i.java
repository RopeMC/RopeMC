package de.ropemc.api.wrapper.net.minecraft.util;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.Vec3i")
public interface Vec3i {

    int compareTo(Vec3i var0);

    Vec3i crossProduct(Vec3i var0);

    double distanceSq(double var0, double var1, double var2);

    double distanceSq(Vec3i var0);

    double distanceSqToCenter(double var0, double var1, double var2);

    int getX();

    int getY();

    int getZ();

}
