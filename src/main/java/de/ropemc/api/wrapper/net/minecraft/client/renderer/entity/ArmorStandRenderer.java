package de.ropemc.api.wrapper.net.minecraft.client.renderer.entity;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.entity.item.EntityArmorStand;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.net.minecraft.client.model.ModelArmorStand;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.entity.ArmorStandRenderer")
public interface ArmorStandRenderer {

    boolean canRenderName(Entity var0);

    boolean canRenderName(EntityLivingBase var0);

    boolean canRenderName(EntityArmorStand var0);

    ResourceLocation getEntityTexture(Entity var0);

    ResourceLocation getEntityTexture(EntityArmorStand var0);

    ModelArmorStand getMainModel();

    void rotateCorpse(EntityLivingBase var0, float var1, float var2, float var3);

    void rotateCorpse(EntityArmorStand var0, float var1, float var2, float var3);

}
