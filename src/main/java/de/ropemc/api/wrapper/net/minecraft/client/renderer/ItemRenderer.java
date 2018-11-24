package de.ropemc.api.wrapper.net.minecraft.client.renderer;

import de.ropemc.api.wrapper.net.minecraft.client.entity.AbstractClientPlayer;
import de.ropemc.api.wrapper.net.minecraft.client.renderer.texture.TextureAtlasSprite;
import de.ropemc.api.wrapper.net.minecraft.client.entity.EntityPlayerSP;
import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
//import de.ropemc.api.wrapper.net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType;
import de.ropemc.api.wrapper.net.minecraft.client.renderer.entity.RenderPlayer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.ItemRenderer")
public interface ItemRenderer {

    void func_178095_a(AbstractClientPlayer var0, float var1, float var2);

    void func_178098_a(float var0, AbstractClientPlayer var1);

    float func_178100_c(float var0);

    void func_178101_a(float var0, float var1);

    void func_178103_d();

    void func_178104_a(AbstractClientPlayer var0, float var1);

    void func_178105_d(float var0);

    void func_178108_a(float var0, TextureAtlasSprite var1);

    void func_178109_a(AbstractClientPlayer var0);

    void func_178110_a(EntityPlayerSP var0, float var1);

    boolean isBlockTranslucent(Block var0);

    void renderFireInFirstPerson(float var0);

    //void renderItem(EntityLivingBase var0, ItemStack var1, ItemCameraTransforms$TransformType var2);

    void renderItemInFirstPerson(float var0);

    void renderItemMap(AbstractClientPlayer var0, float var1, float var2, float var3);

    void renderLeftArm(RenderPlayer var0);

    void renderOverlays(float var0);

    void renderPlayerArms(AbstractClientPlayer var0);

    void renderRightArm(RenderPlayer var0);

    void renderWaterOverlayTexture(float var0);

    void resetEquippedProgress();

    void resetEquippedProgress2();

    void transformFirstPersonItem(float var0, float var1);

    void updateEquippedItem();

}
