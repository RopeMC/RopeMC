package de.ropemc.api.wrapper.net.minecraft.client.renderer.culling;

import de.ropemc.api.wrapper.net.minecraft.util.AxisAlignedBB;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.culling.ICamera")
public interface ICamera {

    boolean isBoundingBoxInFrustum(AxisAlignedBB var0);

    void setPosition(double var0, double var1, double var2);

}
