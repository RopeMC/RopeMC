package de.ropemc.api.wrapper.net.minecraft.client.renderer.entity;

import de.ropemc.api.wrapper.net.minecraft.client.renderer.entity.layers.LayerRenderer;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.client.model.ModelBase;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.entity.RendererLivingEntity")
public interface RendererLivingEntity {

    boolean addLayer(LayerRenderer var0);

    boolean canRenderName(Entity var0);

    boolean canRenderName(EntityLivingBase var0);

    void doRender(Entity var0, double var1, double var2, double var3, float var4, float var5);

    void doRender(EntityLivingBase var0, double var1, double var2, double var3, float var4, float var5);

    int getColorMultiplier(EntityLivingBase var0, float var1, float var2);

    float getDeathMaxRotation(EntityLivingBase var0);

    ModelBase getMainModel();

    float getSwingProgress(EntityLivingBase var0, float var1);

    float handleRotationFloat(EntityLivingBase var0, float var1);

    float interpolateRotation(float var0, float var1, float var2);

    void preRenderCallback(EntityLivingBase var0, float var1);

    boolean removeLayer(LayerRenderer var0);

    void renderLayers(EntityLivingBase var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7);

    void renderLivingAt(EntityLivingBase var0, double var1, double var2, double var3);

    void renderModel(EntityLivingBase var0, float var1, float var2, float var3, float var4, float var5, float var6);

    void renderName(Entity var0, double var1, double var2, double var3);

    void renderName(EntityLivingBase var0, double var1, double var2, double var3);

    void rotateCorpse(EntityLivingBase var0, float var1, float var2, float var3);

    boolean setBrightness(EntityLivingBase var0, float var1, boolean var2);

    boolean setDoRenderBrightness(EntityLivingBase var0, float var1);

    void setRenderOutlines(boolean var0);

    boolean setScoreTeamColor(EntityLivingBase var0);

    void transformHeldFull3DItemLayer();

    void unsetBrightness();

    void unsetScoreTeamColor();

}
