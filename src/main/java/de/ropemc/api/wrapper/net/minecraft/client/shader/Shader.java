package de.ropemc.api.wrapper.net.minecraft.client.shader;

//import org.lwjgl.util.vector.Matrix4f;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.shader.Shader")
public interface Shader {

    void addAuxFramebuffer(String var0, Object var1, int var2, int var3);

    void deleteShader();

    ShaderManager getShaderManager();

    void loadShader(float var0);

    void preLoadShader();

    //void setProjectionMatrix(Matrix4f var0);

}
