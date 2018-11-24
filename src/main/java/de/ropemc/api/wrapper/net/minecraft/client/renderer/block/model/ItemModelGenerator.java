package de.ropemc.api.wrapper.net.minecraft.client.renderer.block.model;

import de.ropemc.api.wrapper.net.minecraft.client.renderer.texture.TextureAtlasSprite;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.client.renderer.texture.TextureMap;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.block.model.ItemModelGenerator")
public interface ItemModelGenerator {

    boolean func_178391_a(int[] var0, int var1, int var2, int var3, int var4);

    List func_178393_a(TextureAtlasSprite var0);

    List func_178394_a(int var0, String var1, TextureAtlasSprite var2);

    //void func_178395_a(List var0, ItemModelGenerator$SpanFacing var1, int var2, int var3);

    //void func_178396_a(ItemModelGenerator$SpanFacing var0, List var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7);

    List func_178397_a(TextureAtlasSprite var0, String var1, int var2);

    ModelBlock makeItemModel(TextureMap var0, ModelBlock var1);

}
