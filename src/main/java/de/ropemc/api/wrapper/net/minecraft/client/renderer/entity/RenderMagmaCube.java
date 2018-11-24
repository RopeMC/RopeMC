package de.ropemc.api.wrapper.net.minecraft.client.renderer.entity;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.net.minecraft.entity.monster.EntityMagmaCube;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.entity.RenderMagmaCube")
public interface RenderMagmaCube {

    ResourceLocation getEntityTexture(Entity var0);

    ResourceLocation getEntityTexture(EntityMagmaCube var0);

    void preRenderCallback(EntityLivingBase var0, float var1);

    void preRenderCallback(EntityMagmaCube var0, float var1);

}
