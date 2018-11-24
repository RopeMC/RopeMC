package de.ropemc.api.wrapper.net.minecraft.client.renderer;

import de.ropemc.api.wrapper.net.minecraft.client.renderer.vertex.VertexFormat;
import java.nio.FloatBuffer;
import java.nio.ByteBuffer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.WorldRenderer")
public interface WorldRenderer {

    void addVertexData(int[] var0);

    void begin(int var0, VertexFormat var1);

    WorldRenderer color(float var0, float var1, float var2, float var3);

    WorldRenderer color(int var0, int var1, int var2, int var3);

    void endVertex();

    void finishDrawing();

    int func_181664_j();

    float func_181665_a(FloatBuffer var0, float var1, float var2, float var3, int var4, int var5);

    void func_181667_k();

    void func_181670_b(int var0);

    //WorldRenderer$State func_181672_a();

    ByteBuffer getByteBuffer();

    int getColorIndex(int var0);

    int getDrawMode();

    int getVertexCount();

    VertexFormat getVertexFormat();

    WorldRenderer lightmap(int var0, int var1);

    void markDirty();

    WorldRenderer normal(float var0, float var1, float var2);

    WorldRenderer pos(double var0, double var1, double var2);

    void putBrightness4(int var0, int var1, int var2, int var3);

    void putColor(int var0, int var1);

    void putColor4(int var0);

    void putColorMultiplier(float var0, float var1, float var2, int var3);

    void putColorRGBA(int var0, int var1, int var2, int var3, int var4);

    void putColorRGB_F(float var0, float var1, float var2, int var3);

    void putColorRGB_F4(float var0, float var1, float var2);

    void putNormal(float var0, float var1, float var2);

    void putPosition(double var0, double var1, double var2);

    void reset();

    void setTranslation(double var0, double var1, double var2);

    //void setVertexState(WorldRenderer$State var0);

    void sortVertexData(float var0, float var1, float var2);

    WorldRenderer tex(double var0, double var1);

}
