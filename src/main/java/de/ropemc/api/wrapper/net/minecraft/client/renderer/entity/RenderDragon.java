package de.ropemc.api.wrapper.net.minecraft.client.renderer.entity;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLiving;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.entity.boss.EntityDragon;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.entity.RenderDragon")
public interface RenderDragon {

    void doRender(Entity var0, double var1, double var2, double var3, float var4, float var5);

    void doRender(EntityLiving var0, double var1, double var2, double var3, float var4, float var5);

    void doRender(EntityLivingBase var0, double var1, double var2, double var3, float var4, float var5);

    void doRender(EntityDragon var0, double var1, double var2, double var3, float var4, float var5);

    void drawRechargeRay(EntityDragon var0, double var1, double var2, double var3, float var4);

    ResourceLocation getEntityTexture(Entity var0);

    ResourceLocation getEntityTexture(EntityDragon var0);

    void renderModel(EntityLivingBase var0, float var1, float var2, float var3, float var4, float var5, float var6);

    void renderModel(EntityDragon var0, float var1, float var2, float var3, float var4, float var5, float var6);

    void rotateCorpse(EntityLivingBase var0, float var1, float var2, float var3);

    void rotateCorpse(EntityDragon var0, float var1, float var2, float var3);

}
