package de.ropemc.api.wrapper.net.minecraft.client.model;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.model.ModelHorse")
public interface ModelHorse {

    void render(Entity var0, float var1, float var2, float var3, float var4, float var5, float var6);

    void setBoxRotation(ModelRenderer var0, float var1, float var2, float var3);

    void setLivingAnimations(EntityLivingBase var0, float var1, float var2, float var3);

    float updateHorseRotation(float var0, float var1, float var2);

}
