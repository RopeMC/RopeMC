package de.ropemc.api.wrapper.net.minecraft.util;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.AxisAlignedBB")
public interface AxisAlignedBB {

    AxisAlignedBB addCoord(double var0, double var1, double var2);

    MovingObjectPosition calculateIntercept(Vec3 var0, Vec3 var1);

    double calculateXOffset(AxisAlignedBB var0, double var1);

    double calculateYOffset(AxisAlignedBB var0, double var1);

    double calculateZOffset(AxisAlignedBB var0, double var1);

    AxisAlignedBB contract(double var0, double var1, double var2);

    AxisAlignedBB expand(double var0, double var1, double var2);

    AxisAlignedBB fromBounds(double var0, double var1, double var2, double var3, double var4, double var5);

    boolean func_181656_b();

    double getAverageEdgeLength();

    boolean intersectsWith(AxisAlignedBB var0);

    boolean isVecInXY(Vec3 var0);

    boolean isVecInXZ(Vec3 var0);

    boolean isVecInYZ(Vec3 var0);

    boolean isVecInside(Vec3 var0);

    AxisAlignedBB offset(double var0, double var1, double var2);

    AxisAlignedBB union(AxisAlignedBB var0);

}
