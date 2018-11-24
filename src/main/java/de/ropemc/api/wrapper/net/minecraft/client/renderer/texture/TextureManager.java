package de.ropemc.api.wrapper.net.minecraft.client.renderer.texture;

import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.net.minecraft.client.resources.IResourceManager;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.texture.TextureManager")
public interface TextureManager {

    void bindTexture(ResourceLocation var0);

    void deleteTexture(ResourceLocation var0);

    ResourceLocation getDynamicTextureLocation(String var0, DynamicTexture var1);

    ITextureObject getTexture(ResourceLocation var0);

    boolean loadTexture(ResourceLocation var0, ITextureObject var1);

    boolean loadTickableTexture(ResourceLocation var0, ITickableTextureObject var1);

    void onResourceManagerReload(IResourceManager var0);

    void tick();

}
