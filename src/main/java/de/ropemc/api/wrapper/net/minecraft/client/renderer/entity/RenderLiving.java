package de.ropemc.api.wrapper.net.minecraft.client.renderer.entity;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLiving;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.client.renderer.culling.ICamera;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.entity.RenderLiving")
public interface RenderLiving {

    boolean canRenderName(Entity var0);

    boolean canRenderName(EntityLiving var0);

    boolean canRenderName(EntityLivingBase var0);

    void doRender(Entity var0, double var1, double var2, double var3, float var4, float var5);

    void doRender(EntityLiving var0, double var1, double var2, double var3, float var4, float var5);

    void doRender(EntityLivingBase var0, double var1, double var2, double var3, float var4, float var5);

    void func_177105_a(EntityLiving var0, float var1);

    double interpolateValue(double var0, double var1, double var2);

    void renderLeash(EntityLiving var0, double var1, double var2, double var3, float var4, float var5);

    boolean shouldRender(Entity var0, ICamera var1, double var2, double var3, double var4);

    boolean shouldRender(EntityLiving var0, ICamera var1, double var2, double var3, double var4);

}
