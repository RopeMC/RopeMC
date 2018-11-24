package de.ropemc.api.wrapper.net.minecraft.client.renderer.entity;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.net.minecraft.entity.monster.EntityGiantZombie;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.entity.RenderGiantZombie")
public interface RenderGiantZombie {

    ResourceLocation getEntityTexture(Entity var0);

    ResourceLocation getEntityTexture(EntityGiantZombie var0);

    void preRenderCallback(EntityLivingBase var0, float var1);

    void preRenderCallback(EntityGiantZombie var0, float var1);

    void transformHeldFull3DItemLayer();

}
