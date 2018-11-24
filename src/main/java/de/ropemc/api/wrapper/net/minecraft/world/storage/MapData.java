package de.ropemc.api.wrapper.net.minecraft.world.storage;

import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.network.Packet;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.storage.MapData")
public interface MapData {

    void calculateMapCenter(double var0, double var1, int var2);

    //MapData$MapInfo getMapInfo(EntityPlayer var0);

    Packet getMapPacket(ItemStack var0, World var1, EntityPlayer var2);

    void readFromNBT(NBTTagCompound var0);

    void updateDecorations(int var0, World var1, String var2, double var3, double var4, double var5);

    void updateMapData(int var0, int var1);

    void updateVisiblePlayers(EntityPlayer var0, ItemStack var1);

    void writeToNBT(NBTTagCompound var0);

}
