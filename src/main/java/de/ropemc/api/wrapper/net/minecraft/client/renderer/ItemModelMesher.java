package de.ropemc.api.wrapper.net.minecraft.client.renderer;

import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.net.minecraft.client.resources.model.IBakedModel;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.client.resources.model.ModelManager;
import de.ropemc.api.wrapper.net.minecraft.client.renderer.texture.TextureAtlasSprite;
import de.ropemc.api.wrapper.net.minecraft.client.resources.model.ModelResourceLocation;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.ItemModelMesher")
public interface ItemModelMesher {

    int getIndex(Item var0, int var1);

    IBakedModel getItemModel(Item var0, int var1);

    IBakedModel getItemModel(ItemStack var0);

    int getMetadata(ItemStack var0);

    ModelManager getModelManager();

    TextureAtlasSprite getParticleIcon(Item var0);

    TextureAtlasSprite getParticleIcon(Item var0, int var1);

    void rebuildCache();

    void register(Item var0, int var1, ModelResourceLocation var2);

    void register(Item var0, ItemMeshDefinition var1);

}
