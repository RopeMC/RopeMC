package de.ropemc.api.wrapper.net.minecraft.client.renderer.tileentity;

import de.ropemc.api.wrapper.net.minecraft.tileentity.MobSpawnerBaseLogic;
import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntity;
import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntityMobSpawner;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.tileentity.TileEntityMobSpawnerRenderer")
public interface TileEntityMobSpawnerRenderer {

    void renderMob(MobSpawnerBaseLogic var0, double var1, double var2, double var3, float var4);

    void renderTileEntityAt(TileEntity var0, double var1, double var2, double var3, float var4, int var5);

    void renderTileEntityAt(TileEntityMobSpawner var0, double var1, double var2, double var3, float var4, int var5);

}
