package de.ropemc.api.wrapper.net.minecraft.client.shader;

import de.ropemc.api.wrapper.net.minecraft.client.resources.IResourceManager;
import java.io.BufferedInputStream;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.shader.ShaderLoader")
public interface ShaderLoader {

    void attachShader(ShaderManager var0);

    void deleteShader(ShaderManager var0);

    String getShaderFilename();

    //ShaderLoader loadShader(IResourceManager var0, ShaderLoader$ShaderType var1, String var2);

    byte[] toByteArray(BufferedInputStream var0);

}
