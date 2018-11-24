package de.ropemc.api.wrapper.net.minecraft.client.renderer.entity;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.net.minecraft.entity.passive.EntitySquid;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.entity.RenderSquid")
public interface RenderSquid {

    ResourceLocation getEntityTexture(Entity var0);

    ResourceLocation getEntityTexture(EntitySquid var0);

    float handleRotationFloat(EntityLivingBase var0, float var1);

    float handleRotationFloat(EntitySquid var0, float var1);

    void rotateCorpse(EntityLivingBase var0, float var1, float var2, float var3);

    void rotateCorpse(EntitySquid var0, float var1, float var2, float var3);

}
