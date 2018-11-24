package de.ropemc.api.wrapper.net.minecraft.client.renderer;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.Tessellator")
public interface Tessellator {

    void draw();

    Tessellator getInstance();

    WorldRenderer getWorldRenderer();

}
