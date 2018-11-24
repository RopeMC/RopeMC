package de.ropemc.api.wrapper.net.minecraft.entity.ai;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.EntityMoveHelper")
public interface EntityMoveHelper {

    double getSpeed();

    double getX();

    double getY();

    double getZ();

    boolean isUpdating();

    float limitAngle(float var0, float var1, float var2);

    void onUpdateMoveHelper();

    void setMoveTo(double var0, double var1, double var2, double var3);

}
