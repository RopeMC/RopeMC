package de.ropemc.api.wrapper.net.minecraft.client.renderer.entity;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.entity.projectile.EntityArrow;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.entity.RenderArrow")
public interface RenderArrow {

    void doRender(Entity var0, double var1, double var2, double var3, float var4, float var5);

    void doRender(EntityArrow var0, double var1, double var2, double var3, float var4, float var5);

    ResourceLocation getEntityTexture(Entity var0);

    ResourceLocation getEntityTexture(EntityArrow var0);

}
