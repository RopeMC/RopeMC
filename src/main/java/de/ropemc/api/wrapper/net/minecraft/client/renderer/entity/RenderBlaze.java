package de.ropemc.api.wrapper.net.minecraft.client.renderer.entity;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.net.minecraft.entity.monster.EntityBlaze;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.entity.RenderBlaze")
public interface RenderBlaze {

    ResourceLocation getEntityTexture(Entity var0);

    ResourceLocation getEntityTexture(EntityBlaze var0);

}
