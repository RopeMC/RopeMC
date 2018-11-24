package de.ropemc.api.wrapper.net.minecraft.client.renderer;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.OpenGlHelper")
public interface OpenGlHelper {

    boolean areShadersSupported();

    String func_183029_j();

    String getLogText();

    void glAttachShader(int var0, int var1);

    void glBindBuffer(int var0, int var1);

    void glBindFramebuffer(int var0, int var1);

    void glBindRenderbuffer(int var0, int var1);

    void glBlendFunc(int var0, int var1, int var2, int var3);

    void glBufferData(int var0, ByteBuffer var1, int var2);

    int glCheckFramebufferStatus(int var0);

    void glCompileShader(int var0);

    int glCreateProgram();

    int glCreateShader(int var0);

    void glDeleteBuffers(int var0);

    void glDeleteFramebuffers(int var0);

    void glDeleteProgram(int var0);

    void glDeleteRenderbuffers(int var0);

    void glDeleteShader(int var0);

    void glFramebufferRenderbuffer(int var0, int var1, int var2, int var3);

    void glFramebufferTexture2D(int var0, int var1, int var2, int var3, int var4);

    int glGenBuffers();

    int glGenFramebuffers();

    int glGenRenderbuffers();

    int glGetAttribLocation(int var0, CharSequence var1);

    String glGetProgramInfoLog(int var0, int var1);

    int glGetProgrami(int var0, int var1);

    String glGetShaderInfoLog(int var0, int var1);

    int glGetShaderi(int var0, int var1);

    int glGetUniformLocation(int var0, CharSequence var1);

    void glLinkProgram(int var0);

    void glRenderbufferStorage(int var0, int var1, int var2, int var3);

    void glShaderSource(int var0, ByteBuffer var1);

    void glUniform1(int var0, FloatBuffer var1);

    void glUniform1(int var0, IntBuffer var1);

    void glUniform1i(int var0, int var1);

    void glUniform2(int var0, FloatBuffer var1);

    void glUniform2(int var0, IntBuffer var1);

    void glUniform3(int var0, FloatBuffer var1);

    void glUniform3(int var0, IntBuffer var1);

    void glUniform4(int var0, FloatBuffer var1);

    void glUniform4(int var0, IntBuffer var1);

    void glUniformMatrix2(int var0, boolean var1, FloatBuffer var2);

    void glUniformMatrix3(int var0, boolean var1, FloatBuffer var2);

    void glUniformMatrix4(int var0, boolean var1, FloatBuffer var2);

    void glUseProgram(int var0);

    void initializeTextures();

    boolean isFramebufferEnabled();

    void setActiveTexture(int var0);

    void setClientActiveTexture(int var0);

    void setLightmapTextureCoords(int var0, float var1, float var2);

    boolean useVbo();

}
