package de.ropemc.api.wrapper.net.minecraft.tileentity;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.tileentity.TileEntityDropper")
public interface TileEntityDropper {

    String getGuiID();

    String getName();

}
