package de.ropemc.api.wrapper.net.minecraft.client.renderer.entity;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.entity.item.EntityMinecart;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.entity.RenderMinecart")
public interface RenderMinecart {

    void doRender(Entity var0, double var1, double var2, double var3, float var4, float var5);

    void doRender(EntityMinecart var0, double var1, double var2, double var3, float var4, float var5);

    void func_180560_a(EntityMinecart var0, float var1, IBlockState var2);

    ResourceLocation getEntityTexture(Entity var0);

    ResourceLocation getEntityTexture(EntityMinecart var0);

}
