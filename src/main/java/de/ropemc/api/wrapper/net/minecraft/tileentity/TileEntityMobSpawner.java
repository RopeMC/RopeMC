package de.ropemc.api.wrapper.net.minecraft.tileentity;

import de.ropemc.api.wrapper.net.minecraft.network.Packet;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.tileentity.TileEntityMobSpawner")
public interface TileEntityMobSpawner {

    boolean func_183000_F();

    Packet getDescriptionPacket();

    MobSpawnerBaseLogic getSpawnerBaseLogic();

    void readFromNBT(NBTTagCompound var0);

    boolean receiveClientEvent(int var0, int var1);

    void update();

    void writeToNBT(NBTTagCompound var0);

}
