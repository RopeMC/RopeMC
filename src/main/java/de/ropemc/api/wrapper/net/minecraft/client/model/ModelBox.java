package de.ropemc.api.wrapper.net.minecraft.client.model;

import de.ropemc.api.wrapper.net.minecraft.client.renderer.WorldRenderer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.model.ModelBox")
public interface ModelBox {

    void render(WorldRenderer var0, float var1);

    ModelBox setBoxName(String var0);

}
