package de.ropemc.api.wrapper.net.minecraft.client.renderer.entity;

import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
//import de.ropemc.api.wrapper.net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType;
import de.ropemc.api.wrapper.net.minecraft.client.renderer.WorldRenderer;
import de.ropemc.api.wrapper.net.minecraft.client.renderer.block.model.ItemTransformVec3f;
import de.ropemc.api.wrapper.net.minecraft.client.renderer.ItemModelMesher;
import de.ropemc.api.wrapper.net.minecraft.client.resources.IResourceManager;
import de.ropemc.api.wrapper.net.minecraft.client.renderer.block.model.BakedQuad;
import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.net.minecraft.client.resources.model.IBakedModel;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.client.gui.FontRenderer;
import java.util.List;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.entity.RenderItem")
public interface RenderItem {

    void func_175039_a(boolean var0);

    //void func_181564_a(ItemStack var0, ItemCameraTransforms$TransformType var1);

    void func_181565_a(WorldRenderer var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8);

    boolean func_183005_a(ItemTransformVec3f var0);

    ItemModelMesher getItemModelMesher();

    void onResourceManagerReload(IResourceManager var0);

    void preTransform(ItemStack var0);

    void putQuadNormal(WorldRenderer var0, BakedQuad var1);

    void registerBlock(Block var0, int var1, String var2);

    void registerBlock(Block var0, String var1);

    void registerItem(Item var0, int var1, String var2);

    void registerItem(Item var0, String var1);

    void registerItems();

    void renderEffect(IBakedModel var0);

    void renderItem(ItemStack var0, IBakedModel var1);

    void renderItemAndEffectIntoGUI(ItemStack var0, int var1, int var2);

    void renderItemIntoGUI(ItemStack var0, int var1, int var2);

    //void renderItemModelForEntity(ItemStack var0, EntityLivingBase var1, ItemCameraTransforms$TransformType var2);

    //void renderItemModelTransform(ItemStack var0, IBakedModel var1, ItemCameraTransforms$TransformType var2);

    void renderItemOverlayIntoGUI(FontRenderer var0, ItemStack var1, int var2, int var3, String var4);

    void renderItemOverlays(FontRenderer var0, ItemStack var1, int var2, int var3);

    void renderModel(IBakedModel var0, int var1);

    void renderModel(IBakedModel var0, int var1, ItemStack var2);

    void renderModel(IBakedModel var0, ItemStack var1);

    void renderQuad(WorldRenderer var0, BakedQuad var1, int var2);

    void renderQuads(WorldRenderer var0, List var1, int var2, ItemStack var3);

    void setupGuiTransform(int var0, int var1, boolean var2);

    boolean shouldRenderItemIn3D(ItemStack var0);

}
