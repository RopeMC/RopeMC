package de.ropemc.api.wrapper.net.minecraft.client.renderer.entity;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.net.minecraft.entity.passive.EntityBat;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.entity.RenderBat")
public interface RenderBat {

    ResourceLocation getEntityTexture(Entity var0);

    ResourceLocation getEntityTexture(EntityBat var0);

    void preRenderCallback(EntityLivingBase var0, float var1);

    void preRenderCallback(EntityBat var0, float var1);

    void rotateCorpse(EntityLivingBase var0, float var1, float var2, float var3);

    void rotateCorpse(EntityBat var0, float var1, float var2, float var3);

}
