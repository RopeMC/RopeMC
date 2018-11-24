package de.ropemc.api.wrapper.net.minecraft.client.renderer;

import de.ropemc.api.wrapper.net.minecraft.client.Minecraft;
import de.ropemc.api.wrapper.net.minecraft.client.gui.MapItemRenderer;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.client.shader.ShaderGroup;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.net.minecraft.client.resources.IResourceManager;
import java.nio.FloatBuffer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.EntityRenderer")
public interface EntityRenderer {

    //Minecraft access$000(EntityRenderer var0);

    void activateNextShader();

    void addRainParticles();

    void disableLightmap();

    void enableLightmap();

    void func_181022_b();

    void func_181560_a(float var0, long var1);

    float getFOVModifier(float var0, boolean var1);

    MapItemRenderer getMapItemRenderer();

    void getMouseOver(float var0);

    float getNightVisionBrightness(EntityLivingBase var0, float var1);

    ShaderGroup getShaderGroup();

    void hurtCameraEffect(float var0);

    boolean isDrawBlockOutline();

    boolean isShaderActive();

    void loadEntityShader(Entity var0);

    void loadShader(ResourceLocation var0);

    void onResourceManagerReload(IResourceManager var0);

    void orientCamera(float var0);

    void renderCloudsCheck(RenderGlobal var0, float var1, int var2);

    void renderHand(float var0, int var1);

    void renderRainSnow(float var0);

    void renderStreamIndicator(float var0);

    void renderWorld(float var0, long var1);

    void renderWorldDirections(float var0);

    void renderWorldPass(int var0, float var1, long var2);

    FloatBuffer setFogColorBuffer(float var0, float var1, float var2, float var3);

    void setupCameraTransform(float var0, int var1);

    void setupFog(int var0, float var1);

    void setupOverlayRendering();

    void setupViewBobbing(float var0);

    void switchUseShader();

    void updateFogColor(float var0);

    void updateFovModifierHand();

    void updateLightmap(float var0);

    void updateRenderer();

    void updateShaderGroupSize(int var0, int var1);

    void updateTorchFlicker();

}
