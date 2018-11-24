package de.ropemc.api.wrapper.net.minecraft.client.model;

import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.model.ModelBase")
public interface ModelBase {

    void copyModelAngles(ModelRenderer var0, ModelRenderer var1);

    ModelRenderer getRandomModelBox(Random var0);

    TextureOffset getTextureOffset(String var0);

    void render(Entity var0, float var1, float var2, float var3, float var4, float var5, float var6);

    void setLivingAnimations(EntityLivingBase var0, float var1, float var2, float var3);

    void setModelAttributes(ModelBase var0);

    void setRotationAngles(float var0, float var1, float var2, float var3, float var4, float var5, Entity var6);

    void setTextureOffset(String var0, int var1, int var2);

}
