package de.ropemc.api.wrapper.net.minecraft.client.renderer.culling;

import de.ropemc.api.wrapper.net.minecraft.util.AxisAlignedBB;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.culling.Frustum")
public interface Frustum {

    boolean isBoundingBoxInFrustum(AxisAlignedBB var0);

    boolean isBoxInFrustum(double var0, double var1, double var2, double var3, double var4, double var5);

    void setPosition(double var0, double var1, double var2);

}
