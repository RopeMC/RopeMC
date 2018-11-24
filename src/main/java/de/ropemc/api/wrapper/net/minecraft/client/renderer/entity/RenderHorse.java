package de.ropemc.api.wrapper.net.minecraft.client.renderer.entity;

import de.ropemc.api.wrapper.net.minecraft.entity.passive.EntityHorse;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.entity.RenderHorse")
public interface RenderHorse {

    ResourceLocation func_110848_b(EntityHorse var0);

    ResourceLocation getEntityTexture(Entity var0);

    ResourceLocation getEntityTexture(EntityHorse var0);

    void preRenderCallback(EntityLivingBase var0, float var1);

    void preRenderCallback(EntityHorse var0, float var1);

}
