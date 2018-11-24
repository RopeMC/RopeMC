package de.ropemc.api.wrapper.net.minecraft.client.renderer.texture;

import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.net.minecraft.client.resources.IResourceManager;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.texture.TextureMap")
public interface TextureMap {

    ResourceLocation completeResourceLocation(ResourceLocation var0, int var1);

    TextureAtlasSprite getAtlasSprite(String var0);

    TextureAtlasSprite getMissingSprite();

    void initMissingImage();

    void loadSprites(IResourceManager var0, IIconCreator var1);

    void loadTexture(IResourceManager var0);

    void loadTextureAtlas(IResourceManager var0);

    TextureAtlasSprite registerSprite(ResourceLocation var0);

    void setMipmapLevels(int var0);

    void tick();

    void updateAnimations();

}
