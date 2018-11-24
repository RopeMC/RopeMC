package de.ropemc.api.wrapper.net.minecraft.client.renderer.entity;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLiving;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.entity.monster.EntitySlime;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.entity.RenderSlime")
public interface RenderSlime {

    void doRender(Entity var0, double var1, double var2, double var3, float var4, float var5);

    void doRender(EntityLiving var0, double var1, double var2, double var3, float var4, float var5);

    void doRender(EntityLivingBase var0, double var1, double var2, double var3, float var4, float var5);

    void doRender(EntitySlime var0, double var1, double var2, double var3, float var4, float var5);

    ResourceLocation getEntityTexture(Entity var0);

    ResourceLocation getEntityTexture(EntitySlime var0);

    void preRenderCallback(EntityLivingBase var0, float var1);

    void preRenderCallback(EntitySlime var0, float var1);

}
