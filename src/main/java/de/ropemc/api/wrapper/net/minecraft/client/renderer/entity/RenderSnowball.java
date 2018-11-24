package de.ropemc.api.wrapper.net.minecraft.client.renderer.entity;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.entity.RenderSnowball")
public interface RenderSnowball {

    void doRender(Entity var0, double var1, double var2, double var3, float var4, float var5);

    ItemStack func_177082_d(Entity var0);

    ResourceLocation getEntityTexture(Entity var0);

}
