package de.ropemc.api.wrapper.net.minecraft.world.gen.structure;

import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.gen.structure.MapGenStructureData")
public interface MapGenStructureData {

    String formatChunkCoords(int var0, int var1);

    NBTTagCompound getTagCompound();

    void readFromNBT(NBTTagCompound var0);

    void writeInstance(NBTTagCompound var0, int var1, int var2);

    void writeToNBT(NBTTagCompound var0);

}
