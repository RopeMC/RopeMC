package de.ropemc.api.wrapper.net.minecraft.client.renderer.entity;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.entity.RenderEntity")
public interface RenderEntity {

    void doRender(Entity var0, double var1, double var2, double var3, float var4, float var5);

    ResourceLocation getEntityTexture(Entity var0);

}
