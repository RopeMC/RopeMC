package de.ropemc.api.wrapper.net.minecraft.client.renderer.entity;

import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.entity.monster.EntitySpider;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.entity.RenderSpider")
public interface RenderSpider {

    float getDeathMaxRotation(EntityLivingBase var0);

    float getDeathMaxRotation(EntitySpider var0);

    ResourceLocation getEntityTexture(Entity var0);

    ResourceLocation getEntityTexture(EntitySpider var0);

}
