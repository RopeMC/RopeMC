package de.ropemc.api.wrapper.net.minecraft.client.renderer.tileentity;

import java.nio.FloatBuffer;
import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntity;
import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntityEndPortal;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.tileentity.TileEntityEndPortalRenderer")
public interface TileEntityEndPortalRenderer {

    FloatBuffer func_147525_a(float var0, float var1, float var2, float var3);

    void renderTileEntityAt(TileEntity var0, double var1, double var2, double var3, float var4, int var5);

    void renderTileEntityAt(TileEntityEndPortal var0, double var1, double var2, double var3, float var4, int var5);

}
