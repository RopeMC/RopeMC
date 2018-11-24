package de.ropemc.api.wrapper.net.minecraft.client.renderer.tileentity;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.entity.projectile.EntityWitherSkull;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.tileentity.RenderWitherSkull")
public interface RenderWitherSkull {

    void doRender(Entity var0, double var1, double var2, double var3, float var4, float var5);

    void doRender(EntityWitherSkull var0, double var1, double var2, double var3, float var4, float var5);

    float func_82400_a(float var0, float var1, float var2);

    ResourceLocation getEntityTexture(Entity var0);

    ResourceLocation getEntityTexture(EntityWitherSkull var0);

}
