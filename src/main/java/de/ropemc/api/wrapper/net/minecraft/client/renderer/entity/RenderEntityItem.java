package de.ropemc.api.wrapper.net.minecraft.client.renderer.entity;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.entity.item.EntityItem;
import de.ropemc.api.wrapper.net.minecraft.client.resources.model.IBakedModel;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.entity.RenderEntityItem")
public interface RenderEntityItem {

    void doRender(Entity var0, double var1, double var2, double var3, float var4, float var5);

    void doRender(EntityItem var0, double var1, double var2, double var3, float var4, float var5);

    int func_177077_a(EntityItem var0, double var1, double var2, double var3, float var4, IBakedModel var5);

    int func_177078_a(ItemStack var0);

    ResourceLocation getEntityTexture(Entity var0);

    ResourceLocation getEntityTexture(EntityItem var0);

}
