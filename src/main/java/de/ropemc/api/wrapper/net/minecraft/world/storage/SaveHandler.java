package de.ropemc.api.wrapper.net.minecraft.world.storage;

import de.ropemc.api.wrapper.net.minecraft.world.WorldProvider;
import de.ropemc.api.wrapper.net.minecraft.world.chunk.storage.IChunkLoader;
import java.io.File;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.storage.SaveHandler")
public interface SaveHandler {

    void checkSessionLock();

    void flush();

    String[] getAvailablePlayerDat();

    IChunkLoader getChunkLoader(WorldProvider var0);

    File getMapFileFromName(String var0);

    IPlayerFileData getPlayerNBTManager();

    File getWorldDirectory();

    String getWorldDirectoryName();

    WorldInfo loadWorldInfo();

    NBTTagCompound readPlayerData(EntityPlayer var0);

    void saveWorldInfo(WorldInfo var0);

    void saveWorldInfoWithPlayer(WorldInfo var0, NBTTagCompound var1);

    void setSessionLock();

    void writePlayerData(EntityPlayer var0);

}
