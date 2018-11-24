package de.ropemc.api.wrapper.net.minecraft.client.renderer.entity;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.net.minecraft.entity.monster.EntityCaveSpider;
import de.ropemc.api.wrapper.net.minecraft.entity.monster.EntitySpider;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.entity.RenderCaveSpider")
public interface RenderCaveSpider {

    ResourceLocation getEntityTexture(Entity var0);

    ResourceLocation getEntityTexture(EntityCaveSpider var0);

    ResourceLocation getEntityTexture(EntitySpider var0);

    void preRenderCallback(EntityLivingBase var0, float var1);

    void preRenderCallback(EntityCaveSpider var0, float var1);

}
