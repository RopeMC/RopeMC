package de.ropemc.api.wrapper.net.minecraft.client.renderer.entity;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.net.minecraft.entity.monster.EntitySnowman;
import de.ropemc.api.wrapper.net.minecraft.client.model.ModelBase;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.entity.RenderSnowMan")
public interface RenderSnowMan {

    ResourceLocation getEntityTexture(Entity var0);

    ResourceLocation getEntityTexture(EntitySnowman var0);

    ModelBase getMainModel();

}
