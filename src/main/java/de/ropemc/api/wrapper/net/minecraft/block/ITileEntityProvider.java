package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntity;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.ITileEntityProvider")
public interface ITileEntityProvider {

    TileEntity createNewTileEntity(World var0, int var1);

}
