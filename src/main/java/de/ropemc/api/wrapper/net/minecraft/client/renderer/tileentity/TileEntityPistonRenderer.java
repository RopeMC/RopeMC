package de.ropemc.api.wrapper.net.minecraft.client.renderer.tileentity;

import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntity;
import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntityPiston;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.tileentity.TileEntityPistonRenderer")
public interface TileEntityPistonRenderer {

    void renderTileEntityAt(TileEntity var0, double var1, double var2, double var3, float var4, int var5);

    void renderTileEntityAt(TileEntityPiston var0, double var1, double var2, double var3, float var4, int var5);

}
