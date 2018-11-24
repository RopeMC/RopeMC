package de.ropemc.api.wrapper.net.minecraft.client.shader;

import com.google.gson.JsonElement;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.shader.ShaderManager")
public interface ShaderManager {

    void addSamplerTexture(String var0, Object var1);

    void deleteShader();

    void endShader();

    ShaderLoader getFragmentShaderLoader();

    int getProgram();

    ShaderUniform getShaderUniform(String var0);

    ShaderUniform getShaderUniformOrDefault(String var0);

    ShaderLoader getVertexShaderLoader();

    void markDirty();

    void parseSampler(JsonElement var0);

    void parseUniform(JsonElement var0);

    void setupUniforms();

    void useShader();

}
