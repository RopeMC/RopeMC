package de.ropemc.api.wrapper.net.minecraft.client.renderer.entity;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLiving;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.entity.passive.EntityWolf;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.entity.RenderWolf")
public interface RenderWolf {

    void doRender(Entity var0, double var1, double var2, double var3, float var4, float var5);

    void doRender(EntityLiving var0, double var1, double var2, double var3, float var4, float var5);

    void doRender(EntityLivingBase var0, double var1, double var2, double var3, float var4, float var5);

    void doRender(EntityWolf var0, double var1, double var2, double var3, float var4, float var5);

    ResourceLocation getEntityTexture(Entity var0);

    ResourceLocation getEntityTexture(EntityWolf var0);

    float handleRotationFloat(EntityLivingBase var0, float var1);

    float handleRotationFloat(EntityWolf var0, float var1);

}
