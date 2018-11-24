package de.ropemc.api.wrapper.net.minecraft.world.storage;

import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.storage.IPlayerFileData")
public interface IPlayerFileData {

    String[] getAvailablePlayerDat();

    NBTTagCompound readPlayerData(EntityPlayer var0);

    void writePlayerData(EntityPlayer var0);

}
