package de.ropemc.api.wrapper.net.minecraft.client.renderer;

import java.nio.FloatBuffer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.GlStateManager")
public interface GlStateManager {

    void alphaFunc(int var0, float var1);

    void bindTexture(int var0);

    void blendFunc(int var0, int var1);

    void callList(int var0);

    void clear(int var0);

    void clearColor(float var0, float var1, float var2, float var3);

    void clearDepth(double var0);

    void color(float var0, float var1, float var2);

    void color(float var0, float var1, float var2, float var3);

    void colorLogicOp(int var0);

    void colorMask(boolean var0, boolean var1, boolean var2, boolean var3);

    void colorMaterial(int var0, int var1);

    void cullFace(int var0);

    void deleteTexture(int var0);

    void depthFunc(int var0);

    void depthMask(boolean var0);

    void disableAlpha();

    void disableBlend();

    void disableColorLogic();

    void disableColorMaterial();

    void disableCull();

    void disableDepth();

    void disableFog();

    void disableLight(int var0);

    void disableLighting();

    void disableNormalize();

    void disablePolygonOffset();

    void disableRescaleNormal();

    //void disableTexGenCoord(GlStateManager$TexGen var0);

    void disableTexture2D();

    void doPolygonOffset(float var0, float var1);

    void enableAlpha();

    void enableBlend();

    void enableColorLogic();

    void enableColorMaterial();

    void enableCull();

    void enableDepth();

    void enableFog();

    void enableLight(int var0);

    void enableLighting();

    void enableNormalize();

    void enablePolygonOffset();

    void enableRescaleNormal();

    //void enableTexGenCoord(GlStateManager$TexGen var0);

    void enableTexture2D();

    //void func_179105_a(GlStateManager$TexGen var0, int var1, FloatBuffer var2);

    int generateTexture();

    void getFloat(int var0, FloatBuffer var1);

    void loadIdentity();

    void matrixMode(int var0);

    void multMatrix(FloatBuffer var0);

    void ortho(double var0, double var1, double var2, double var3, double var4, double var5);

    void popAttrib();

    void popMatrix();

    void pushAttrib();

    void pushMatrix();

    void resetColor();

    void rotate(float var0, float var1, float var2, float var3);

    void scale(double var0, double var1, double var2);

    void scale(float var0, float var1, float var2);

    void setActiveTexture(int var0);

    void setFog(int var0);

    void setFogDensity(float var0);

    void setFogEnd(float var0);

    void setFogStart(float var0);

    void shadeModel(int var0);

    //void texGen(GlStateManager$TexGen var0, int var1);

    //GlStateManager$TexGenCoord texGenCoord(GlStateManager$TexGen var0);

    void translate(double var0, double var1, double var2);

    void translate(float var0, float var1, float var2);

    void tryBlendFuncSeparate(int var0, int var1, int var2, int var3);

    void viewport(int var0, int var1, int var2, int var3);

}
