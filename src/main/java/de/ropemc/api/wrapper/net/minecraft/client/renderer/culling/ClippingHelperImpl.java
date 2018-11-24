package de.ropemc.api.wrapper.net.minecraft.client.renderer.culling;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.culling.ClippingHelperImpl")
public interface ClippingHelperImpl {

    ClippingHelper getInstance();

    void init();

    void normalize(float[] var0);

}
