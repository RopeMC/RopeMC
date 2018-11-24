package de.ropemc.api.wrapper.net.minecraft.client.renderer.entity;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLiving;
import de.ropemc.api.wrapper.net.minecraft.entity.monster.EntitySkeleton;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.entity.RenderSkeleton")
public interface RenderSkeleton {

    ResourceLocation getEntityTexture(Entity var0);

    ResourceLocation getEntityTexture(EntityLiving var0);

    ResourceLocation getEntityTexture(EntitySkeleton var0);

    void preRenderCallback(EntityLivingBase var0, float var1);

    void preRenderCallback(EntitySkeleton var0, float var1);

    void transformHeldFull3DItemLayer();

}
