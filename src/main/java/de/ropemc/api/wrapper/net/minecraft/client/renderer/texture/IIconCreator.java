package de.ropemc.api.wrapper.net.minecraft.client.renderer.texture;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.texture.IIconCreator")
public interface IIconCreator {

    void registerSprites(TextureMap var0);

}
