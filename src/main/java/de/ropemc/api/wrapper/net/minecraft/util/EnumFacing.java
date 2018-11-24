package de.ropemc.api.wrapper.net.minecraft.util;

import java.util.Random;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.EnumFacing")
public interface EnumFacing {

    EnumFacing byName(String var0);

    EnumFacing fromAngle(double var0);

    //EnumFacing func_181076_a(EnumFacing$AxisDirection var0, EnumFacing$Axis var1);

    //EnumFacing$Axis getAxis();

    //EnumFacing$AxisDirection getAxisDirection();

    Vec3i getDirectionVec();

    EnumFacing getFacingFromVector(float var0, float var1, float var2);

    EnumFacing getFront(int var0);

    int getFrontOffsetX();

    int getFrontOffsetY();

    int getFrontOffsetZ();

    EnumFacing getHorizontal(int var0);

    int getHorizontalIndex();

    int getIndex();

    String getName();

    String getName2();

    EnumFacing getOpposite();

    EnumFacing random(Random var0);

    //EnumFacing rotateAround(EnumFacing$Axis var0);

    EnumFacing rotateX();

    EnumFacing rotateY();

    EnumFacing rotateYCCW();

    EnumFacing rotateZ();

}
