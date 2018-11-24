package de.ropemc.api.wrapper.net.minecraft.client.renderer.entity;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.entity.item.EntityXPOrb;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.entity.RenderXPOrb")
public interface RenderXPOrb {

    void doRender(Entity var0, double var1, double var2, double var3, float var4, float var5);

    void doRender(EntityXPOrb var0, double var1, double var2, double var3, float var4, float var5);

    ResourceLocation getEntityTexture(Entity var0);

    ResourceLocation getEntityTexture(EntityXPOrb var0);

}
