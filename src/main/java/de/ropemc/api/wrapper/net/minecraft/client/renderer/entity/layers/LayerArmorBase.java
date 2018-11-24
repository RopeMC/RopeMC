package de.ropemc.api.wrapper.net.minecraft.client.renderer.entity.layers;

import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.client.model.ModelBase;
import de.ropemc.api.wrapper.net.minecraft.item.ItemArmor;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.entity.layers.LayerArmorBase")
public interface LayerArmorBase {

    void doRenderLayer(EntityLivingBase var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7);

    ModelBase func_177175_a(int var0);

    void func_177179_a(ModelBase var0, int var1);

    void func_177183_a(EntityLivingBase var0, ModelBase var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8);

    ResourceLocation getArmorResource(ItemArmor var0, boolean var1);

    ResourceLocation getArmorResource(ItemArmor var0, boolean var1, String var2);

    ItemStack getCurrentArmor(EntityLivingBase var0, int var1);

    void initArmor();

    boolean isSlotForLeggings(int var0);

    void renderLayer(EntityLivingBase var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, int var8);

    boolean shouldCombineTextures();

}
