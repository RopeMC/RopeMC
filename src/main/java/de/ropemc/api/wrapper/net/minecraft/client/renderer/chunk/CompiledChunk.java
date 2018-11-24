package de.ropemc.api.wrapper.net.minecraft.client.renderer.chunk;

import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntity;
//import de.ropemc.api.wrapper.net.minecraft.client.renderer.WorldRenderer$State;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.util.EnumWorldBlockLayer;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.chunk.CompiledChunk")
public interface CompiledChunk {

    void addTileEntity(TileEntity var0);

    //WorldRenderer$State getState();

    List getTileEntities();

    boolean isEmpty();

    boolean isLayerEmpty(EnumWorldBlockLayer var0);

    boolean isLayerStarted(EnumWorldBlockLayer var0);

    boolean isVisible(EnumFacing var0, EnumFacing var1);

    void setLayerStarted(EnumWorldBlockLayer var0);

    void setLayerUsed(EnumWorldBlockLayer var0);

    //void setState(WorldRenderer$State var0);

    void setVisibility(SetVisibility var0);

}
