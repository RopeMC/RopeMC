package de.ropemc.api.wrapper.net.minecraft.client.shader;

import com.google.gson.JsonElement;
import de.ropemc.api.wrapper.net.minecraft.client.renderer.texture.TextureManager;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.shader.ShaderGroup")
public interface ShaderGroup {

    void addFramebuffer(String var0, int var1, int var2);

    Shader addShader(String var0, Framebuffer var1, Framebuffer var2);

    void createBindFramebuffers(int var0, int var1);

    void deleteShaderGroup();

    Framebuffer getFramebuffer(String var0);

    Framebuffer getFramebufferRaw(String var0);

    String getShaderGroupName();

    void initTarget(JsonElement var0);

    void initUniform(JsonElement var0);

    void loadShaderGroup(float var0);

    void parseGroup(TextureManager var0, ResourceLocation var1);

    void parsePass(TextureManager var0, JsonElement var1);

    void resetProjectionMatrix();

}
