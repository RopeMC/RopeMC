package de.ropemc.api.wrapper.net.minecraft.entity.ai;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.EntityLookHelper")
public interface EntityLookHelper {

    boolean getIsLooking();

    double getLookPosX();

    double getLookPosY();

    double getLookPosZ();

    void onUpdateLook();

    void setLookPosition(double var0, double var1, double var2, float var3, float var4);

    void setLookPositionWithEntity(Entity var0, float var1, float var2);

    float updateRotation(float var0, float var1, float var2);

}
