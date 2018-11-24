package de.ropemc.api.wrapper.net.minecraft.client.renderer.texture;

import de.ropemc.api.wrapper.net.minecraft.client.resources.IResourceManager;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.texture.SimpleTexture")
public interface SimpleTexture {

    void loadTexture(IResourceManager var0);

}
