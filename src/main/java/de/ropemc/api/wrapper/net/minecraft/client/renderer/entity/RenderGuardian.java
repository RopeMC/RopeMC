package de.ropemc.api.wrapper.net.minecraft.client.renderer.entity;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLiving;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.entity.monster.EntityGuardian;
import de.ropemc.api.wrapper.net.minecraft.util.Vec3;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.net.minecraft.client.renderer.culling.ICamera;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.entity.RenderGuardian")
public interface RenderGuardian {

    void doRender(Entity var0, double var1, double var2, double var3, float var4, float var5);

    void doRender(EntityLiving var0, double var1, double var2, double var3, float var4, float var5);

    void doRender(EntityLivingBase var0, double var1, double var2, double var3, float var4, float var5);

    void doRender(EntityGuardian var0, double var1, double var2, double var3, float var4, float var5);

    Vec3 func_177110_a(EntityLivingBase var0, double var1, float var2);

    ResourceLocation getEntityTexture(Entity var0);

    ResourceLocation getEntityTexture(EntityGuardian var0);

    void preRenderCallback(EntityLivingBase var0, float var1);

    void preRenderCallback(EntityGuardian var0, float var1);

    boolean shouldRender(Entity var0, ICamera var1, double var2, double var3, double var4);

    boolean shouldRender(EntityLiving var0, ICamera var1, double var2, double var3, double var4);

    boolean shouldRender(EntityGuardian var0, ICamera var1, double var2, double var3, double var4);

}
