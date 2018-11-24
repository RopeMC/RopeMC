package de.ropemc.api.wrapper.net.minecraft.client.renderer.entity;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.entity.item.EntityPainting;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.entity.RenderPainting")
public interface RenderPainting {

    void doRender(Entity var0, double var1, double var2, double var3, float var4, float var5);

    void doRender(EntityPainting var0, double var1, double var2, double var3, float var4, float var5);

    ResourceLocation getEntityTexture(Entity var0);

    ResourceLocation getEntityTexture(EntityPainting var0);

    void renderPainting(EntityPainting var0, int var1, int var2, int var3, int var4);

    void setLightmap(EntityPainting var0, float var1, float var2);

}
