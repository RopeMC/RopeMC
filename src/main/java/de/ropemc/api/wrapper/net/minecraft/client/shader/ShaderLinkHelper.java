package de.ropemc.api.wrapper.net.minecraft.client.shader;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.shader.ShaderLinkHelper")
public interface ShaderLinkHelper {

    int createProgram();

    void deleteShader(ShaderManager var0);

    ShaderLinkHelper getStaticShaderLinkHelper();

    void linkProgram(ShaderManager var0);

    void setNewStaticShaderLinkHelper();

}
