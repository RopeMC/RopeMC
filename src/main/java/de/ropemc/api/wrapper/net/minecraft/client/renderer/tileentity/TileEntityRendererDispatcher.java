package de.ropemc.api.wrapper.net.minecraft.client.renderer.tileentity;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.client.renderer.texture.TextureManager;
import de.ropemc.api.wrapper.net.minecraft.client.gui.FontRenderer;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntity;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher")
public interface TileEntityRendererDispatcher {

    void cacheActiveRenderInfo(World var0, TextureManager var1, FontRenderer var2, Entity var3, float var4);

    FontRenderer getFontRenderer();

    TileEntitySpecialRenderer getSpecialRenderer(TileEntity var0);

    TileEntitySpecialRenderer getSpecialRendererByClass(Class var0);

    void renderTileEntity(TileEntity var0, float var1, int var2);

    void renderTileEntityAt(TileEntity var0, double var1, double var2, double var3, float var4);

    void renderTileEntityAt(TileEntity var0, double var1, double var2, double var3, float var4, int var5);

    void setWorld(World var0);

}
