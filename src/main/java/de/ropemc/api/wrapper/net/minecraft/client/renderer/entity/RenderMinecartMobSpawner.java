package de.ropemc.api.wrapper.net.minecraft.client.renderer.entity;

import de.ropemc.api.wrapper.net.minecraft.entity.ai.EntityMinecartMobSpawner;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.entity.item.EntityMinecart;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.entity.RenderMinecartMobSpawner")
public interface RenderMinecartMobSpawner {

    void func_180560_a(EntityMinecartMobSpawner var0, float var1, IBlockState var2);

    void func_180560_a(EntityMinecart var0, float var1, IBlockState var2);

}
