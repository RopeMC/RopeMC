package de.ropemc.api.wrapper.net.minecraft.client.renderer;

import de.ropemc.api.wrapper.net.minecraft.util.EnumWorldBlockLayer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.VboRenderList")
public interface VboRenderList {

    void renderChunkLayer(EnumWorldBlockLayer var0);

    void setupArrayPointers();

}
