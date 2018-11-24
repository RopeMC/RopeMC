package de.ropemc.api.wrapper.net.minecraft.client.renderer.texture;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.texture.AbstractTexture")
public interface AbstractTexture {

    void deleteGlTexture();

    int getGlTextureId();

    void restoreLastBlurMipmap();

    void setBlurMipmap(boolean var0, boolean var1);

    void setBlurMipmapDirect(boolean var0, boolean var1);

}
