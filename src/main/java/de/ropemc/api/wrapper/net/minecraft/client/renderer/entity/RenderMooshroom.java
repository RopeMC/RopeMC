package de.ropemc.api.wrapper.net.minecraft.client.renderer.entity;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.net.minecraft.entity.passive.EntityMooshroom;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.entity.RenderMooshroom")
public interface RenderMooshroom {

    ResourceLocation getEntityTexture(Entity var0);

    ResourceLocation getEntityTexture(EntityMooshroom var0);

}
