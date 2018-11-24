package de.ropemc.api.wrapper.net.minecraft.entity;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.EntityBodyHelper")
public interface EntityBodyHelper {

    float computeAngleWithBound(float var0, float var1, float var2);

    void updateRenderAngles();

}
