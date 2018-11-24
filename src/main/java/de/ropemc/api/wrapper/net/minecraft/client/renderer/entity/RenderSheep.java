package de.ropemc.api.wrapper.net.minecraft.client.renderer.entity;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.net.minecraft.entity.passive.EntitySheep;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.entity.RenderSheep")
public interface RenderSheep {

    ResourceLocation getEntityTexture(Entity var0);

    ResourceLocation getEntityTexture(EntitySheep var0);

}
