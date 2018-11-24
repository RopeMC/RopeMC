package de.ropemc.api.wrapper.net.minecraft.client.renderer.entity;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.net.minecraft.entity.passive.EntityChicken;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.entity.RenderChicken")
public interface RenderChicken {

    ResourceLocation getEntityTexture(Entity var0);

    ResourceLocation getEntityTexture(EntityChicken var0);

    float handleRotationFloat(EntityLivingBase var0, float var1);

    float handleRotationFloat(EntityChicken var0, float var1);

}
