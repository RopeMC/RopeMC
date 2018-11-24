package de.ropemc.api.wrapper.net.minecraft.client.renderer.tileentity;

import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntity;
import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntityBeacon;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.tileentity.TileEntityBeaconRenderer")
public interface TileEntityBeaconRenderer {

    boolean func_181055_a();

    void renderTileEntityAt(TileEntity var0, double var1, double var2, double var3, float var4, int var5);

    void renderTileEntityAt(TileEntityBeacon var0, double var1, double var2, double var3, float var4, int var5);

}
