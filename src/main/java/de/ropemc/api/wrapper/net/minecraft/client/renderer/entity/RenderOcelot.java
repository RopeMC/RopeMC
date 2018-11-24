package de.ropemc.api.wrapper.net.minecraft.client.renderer.entity;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.net.minecraft.entity.passive.EntityOcelot;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.entity.RenderOcelot")
public interface RenderOcelot {

    ResourceLocation getEntityTexture(Entity var0);

    ResourceLocation getEntityTexture(EntityOcelot var0);

    void preRenderCallback(EntityLivingBase var0, float var1);

    void preRenderCallback(EntityOcelot var0, float var1);

}
