package de.ropemc.api.wrapper.net.minecraft.client.renderer.texture;

import de.ropemc.api.wrapper.net.minecraft.client.resources.IResourceManager;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.texture.ITextureObject")
public interface ITextureObject {

    int getGlTextureId();

    void loadTexture(IResourceManager var0);

    void restoreLastBlurMipmap();

    void setBlurMipmap(boolean var0, boolean var1);

}
