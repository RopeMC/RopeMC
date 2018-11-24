package de.ropemc.api.wrapper.net.minecraft.world.chunk.storage;

import de.ropemc.api.wrapper.net.minecraft.world.WorldProvider;
import de.ropemc.api.wrapper.net.minecraft.world.storage.WorldInfo;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.chunk.storage.AnvilSaveHandler")
public interface AnvilSaveHandler {

    void flush();

    IChunkLoader getChunkLoader(WorldProvider var0);

    void saveWorldInfoWithPlayer(WorldInfo var0, NBTTagCompound var1);

}
