package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.net.minecraft.client.renderer.texture.TextureManager;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.net.minecraft.world.storage.MapData;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.MapItemRenderer")
public interface MapItemRenderer {

    //TextureManager access$400(MapItemRenderer var0);

    //ResourceLocation access$500();

    void clearLoadedMaps();

    //MapItemRenderer$Instance getMapRendererInstance(MapData var0);

    void renderMap(MapData var0, boolean var1);

    void updateMapTexture(MapData var0);

}
