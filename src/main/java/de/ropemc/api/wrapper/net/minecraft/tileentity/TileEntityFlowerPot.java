package de.ropemc.api.wrapper.net.minecraft.tileentity;

import de.ropemc.api.wrapper.net.minecraft.network.Packet;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.tileentity.TileEntityFlowerPot")
public interface TileEntityFlowerPot {

    Packet getDescriptionPacket();

    int getFlowerPotData();

    Item getFlowerPotItem();

    void readFromNBT(NBTTagCompound var0);

    void setFlowerPotData(Item var0, int var1);

    void writeToNBT(NBTTagCompound var0);

}
