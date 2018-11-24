package de.ropemc.api.wrapper.net.minecraft.client.renderer.tileentity;

import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
//import com.mojang.authlib.GameProfile;
import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntity;
import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntitySkull;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.tileentity.TileEntitySkullRenderer")
public interface TileEntitySkullRenderer {

    //void renderSkull(float var0, float var1, float var2, EnumFacing var3, float var4, int var5, GameProfile var6, int var7);

    void renderTileEntityAt(TileEntity var0, double var1, double var2, double var3, float var4, int var5);

    void renderTileEntityAt(TileEntitySkull var0, double var1, double var2, double var3, float var4, int var5);

    void setRendererDispatcher(TileEntityRendererDispatcher var0);

}
