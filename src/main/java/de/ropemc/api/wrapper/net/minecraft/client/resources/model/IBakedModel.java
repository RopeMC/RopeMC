package de.ropemc.api.wrapper.net.minecraft.client.resources.model;

import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import de.ropemc.api.wrapper.net.minecraft.client.renderer.texture.TextureAtlasSprite;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.resources.model.IBakedModel")
public interface IBakedModel {

    List getFaceQuads(EnumFacing var0);

    List getGeneralQuads();

    ItemCameraTransforms getItemCameraTransforms();

    TextureAtlasSprite getParticleTexture();

    boolean isAmbientOcclusion();

    boolean isBuiltInRenderer();

    boolean isGui3d();

}
