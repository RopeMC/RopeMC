package de.ropemc.api.wrapper.net.minecraft.client.renderer.entity;

import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.entity.monster.EntityEndermite;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.entity.RenderEndermite")
public interface RenderEndermite {

    float getDeathMaxRotation(EntityLivingBase var0);

    float getDeathMaxRotation(EntityEndermite var0);

    ResourceLocation getEntityTexture(Entity var0);

    ResourceLocation getEntityTexture(EntityEndermite var0);

}
