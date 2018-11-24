package de.ropemc.api.wrapper.net.minecraft.client.renderer.texture;

import de.ropemc.api.wrapper.net.minecraft.client.resources.IResourceManager;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.texture.LayeredColorMaskTexture")
public interface LayeredColorMaskTexture {

    void loadTexture(IResourceManager var0);

}
