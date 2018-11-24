package de.ropemc.api.wrapper.net.minecraft.client.resources.model;

import de.ropemc.api.wrapper.net.minecraft.client.renderer.BlockModelShapes;
import de.ropemc.api.wrapper.net.minecraft.client.renderer.texture.TextureMap;
import de.ropemc.api.wrapper.net.minecraft.client.resources.IResourceManager;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.resources.model.ModelManager")
public interface ModelManager {

    BlockModelShapes getBlockModelShapes();

    IBakedModel getMissingModel();

    IBakedModel getModel(ModelResourceLocation var0);

    TextureMap getTextureMap();

    void onResourceManagerReload(IResourceManager var0);

}
