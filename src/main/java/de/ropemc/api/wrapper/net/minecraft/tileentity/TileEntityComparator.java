package de.ropemc.api.wrapper.net.minecraft.tileentity;

import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.tileentity.TileEntityComparator")
public interface TileEntityComparator {

    int getOutputSignal();

    void readFromNBT(NBTTagCompound var0);

    void setOutputSignal(int var0);

    void writeToNBT(NBTTagCompound var0);

}
