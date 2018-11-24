package de.ropemc.api.wrapper.net.minecraft.client.model;

import de.ropemc.api.wrapper.net.minecraft.client.renderer.WorldRenderer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.model.TexturedQuad")
public interface TexturedQuad {

    void draw(WorldRenderer var0, float var1);

    void flipFace();

}
