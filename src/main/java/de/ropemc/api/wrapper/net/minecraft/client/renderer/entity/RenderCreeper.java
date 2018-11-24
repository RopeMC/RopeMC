package de.ropemc.api.wrapper.net.minecraft.client.renderer.entity;

import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.entity.monster.EntityCreeper;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.entity.RenderCreeper")
public interface RenderCreeper {

    int getColorMultiplier(EntityLivingBase var0, float var1, float var2);

    int getColorMultiplier(EntityCreeper var0, float var1, float var2);

    ResourceLocation getEntityTexture(Entity var0);

    ResourceLocation getEntityTexture(EntityCreeper var0);

    void preRenderCallback(EntityLivingBase var0, float var1);

    void preRenderCallback(EntityCreeper var0, float var1);

}
