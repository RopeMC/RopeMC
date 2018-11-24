package de.ropemc.api.wrapper.net.minecraft.client.renderer.tileentity;

import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.net.minecraft.client.gui.FontRenderer;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntity;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer")
public interface TileEntitySpecialRenderer {

    void bindTexture(ResourceLocation var0);

    boolean func_181055_a();

    FontRenderer getFontRenderer();

    World getWorld();

    void renderTileEntityAt(TileEntity var0, double var1, double var2, double var3, float var4, int var5);

    void setRendererDispatcher(TileEntityRendererDispatcher var0);

}
