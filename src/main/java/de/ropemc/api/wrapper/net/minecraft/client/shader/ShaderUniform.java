package de.ropemc.api.wrapper.net.minecraft.client.shader;

//import org.lwjgl.util.vector.Matrix4f;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.shader.ShaderUniform")
public interface ShaderUniform {

    void func_148092_b(float var0, float var1, float var2, float var3);

    String getShaderName();

    void markDirty();

    int parseType(String var0);

    void set(float var0);

    void set(float var0, float var1);

    void set(float var0, float var1, float var2);

    void set(float var0, float var1, float var2, float var3);

    void set(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15);

    void set(int var0, int var1, int var2, int var3);

    //void set(Matrix4f var0);

    void set(float[] var0);

    void setUniformLocation(int var0);

    void upload();

    void uploadFloat();

    void uploadFloatMatrix();

    void uploadInt();

}
