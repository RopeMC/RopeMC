package de.ropemc.api.wrapper.net.minecraft.world;

import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.WorldSavedData")
public interface WorldSavedData {

    boolean isDirty();

    void markDirty();

    void readFromNBT(NBTTagCompound var0);

    void setDirty(boolean var0);

    void writeToNBT(NBTTagCompound var0);

}
