package de.ropemc.api.wrapper.net.minecraft.client.renderer.entity;

import de.ropemc.api.wrapper.net.minecraft.client.entity.AbstractClientPlayer;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.net.minecraft.client.model.ModelBase;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.entity.RenderPlayer")
public interface RenderPlayer {

    void doRender(AbstractClientPlayer var0, double var1, double var2, double var3, float var4, float var5);

    void doRender(Entity var0, double var1, double var2, double var3, float var4, float var5);

    void doRender(EntityLivingBase var0, double var1, double var2, double var3, float var4, float var5);

    ResourceLocation getEntityTexture(AbstractClientPlayer var0);

    ResourceLocation getEntityTexture(Entity var0);

    ModelBase getMainModel();

    void preRenderCallback(AbstractClientPlayer var0, float var1);

    void preRenderCallback(EntityLivingBase var0, float var1);

    void renderLeftArm(AbstractClientPlayer var0);

    void renderLivingAt(AbstractClientPlayer var0, double var1, double var2, double var3);

    void renderLivingAt(EntityLivingBase var0, double var1, double var2, double var3);

    void renderOffsetLivingLabel(AbstractClientPlayer var0, double var1, double var2, double var3, String var4, float var5, double var6);

    void renderOffsetLivingLabel(Entity var0, double var1, double var2, double var3, String var4, float var5, double var6);

    void renderRightArm(AbstractClientPlayer var0);

    void rotateCorpse(AbstractClientPlayer var0, float var1, float var2, float var3);

    void rotateCorpse(EntityLivingBase var0, float var1, float var2, float var3);

    void setModelVisibilities(AbstractClientPlayer var0);

    void transformHeldFull3DItemLayer();

}
