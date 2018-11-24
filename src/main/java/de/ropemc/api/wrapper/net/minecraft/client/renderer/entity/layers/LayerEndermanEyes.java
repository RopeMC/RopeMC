package de.ropemc.api.wrapper.net.minecraft.client.renderer.entity.layers;

import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.entity.monster.EntityEnderman;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.entity.layers.LayerEndermanEyes")
public interface LayerEndermanEyes {

    void doRenderLayer(EntityLivingBase var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7);

    void doRenderLayer(EntityEnderman var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7);

    boolean shouldCombineTextures();

}
