package de.ropemc.api.wrapper.net.minecraft.client.renderer.culling;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.culling.ClippingHelper")
public interface ClippingHelper {

    double dot(float[] var0, double var1, double var2, double var3);

    boolean isBoxInFrustum(double var0, double var1, double var2, double var3, double var4, double var5);

}
