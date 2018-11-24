package de.ropemc.api.wrapper.net.minecraft.client.renderer.entity;

import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.entity.monster.EntitySilverfish;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.entity.RenderSilverfish")
public interface RenderSilverfish {

    float getDeathMaxRotation(EntityLivingBase var0);

    float getDeathMaxRotation(EntitySilverfish var0);

    ResourceLocation getEntityTexture(Entity var0);

    ResourceLocation getEntityTexture(EntitySilverfish var0);

}
