package de.ropemc.api.wrapper.net.minecraft.util;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.Vec3")
public interface Vec3 {

    Vec3 add(Vec3 var0);

    Vec3 addVector(double var0, double var1, double var2);

    Vec3 crossProduct(Vec3 var0);

    double distanceTo(Vec3 var0);

    double dotProduct(Vec3 var0);

    Vec3 getIntermediateWithXValue(Vec3 var0, double var1);

    Vec3 getIntermediateWithYValue(Vec3 var0, double var1);

    Vec3 getIntermediateWithZValue(Vec3 var0, double var1);

    double lengthVector();

    Vec3 normalize();

    Vec3 rotatePitch(float var0);

    Vec3 rotateYaw(float var0);

    double squareDistanceTo(Vec3 var0);

    Vec3 subtract(double var0, double var1, double var2);

    Vec3 subtract(Vec3 var0);

    Vec3 subtractReverse(Vec3 var0);

}
