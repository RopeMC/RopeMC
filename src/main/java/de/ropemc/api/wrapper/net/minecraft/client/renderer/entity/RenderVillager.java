package de.ropemc.api.wrapper.net.minecraft.client.renderer.entity;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.net.minecraft.entity.passive.EntityVillager;
import de.ropemc.api.wrapper.net.minecraft.client.model.ModelBase;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.entity.RenderVillager")
public interface RenderVillager {

    ResourceLocation getEntityTexture(Entity var0);

    ResourceLocation getEntityTexture(EntityVillager var0);

    ModelBase getMainModel();

    void preRenderCallback(EntityLivingBase var0, float var1);

    void preRenderCallback(EntityVillager var0, float var1);

}
