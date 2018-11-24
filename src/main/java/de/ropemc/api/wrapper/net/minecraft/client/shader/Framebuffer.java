package de.ropemc.api.wrapper.net.minecraft.client.shader;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.shader.Framebuffer")
public interface Framebuffer {

    void bindFramebuffer(boolean var0);

    void bindFramebufferTexture();

    void checkFramebufferComplete();

    void createBindFramebuffer(int var0, int var1);

    void createFramebuffer(int var0, int var1);

    void deleteFramebuffer();

    void framebufferClear();

    void framebufferRender(int var0, int var1);

    void framebufferRenderExt(int var0, int var1, boolean var2);

    void setFramebufferColor(float var0, float var1, float var2, float var3);

    void setFramebufferFilter(int var0);

    void unbindFramebuffer();

    void unbindFramebufferTexture();

}
