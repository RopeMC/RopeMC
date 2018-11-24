package de.ropemc.api.wrapper.net.minecraft.client.renderer.entity;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLiving;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.entity.RenderBiped")
public interface RenderBiped {

    ResourceLocation getEntityTexture(Entity var0);

    ResourceLocation getEntityTexture(EntityLiving var0);

    void transformHeldFull3DItemLayer();

}
