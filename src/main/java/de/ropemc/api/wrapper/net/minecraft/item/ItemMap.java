package de.ropemc.api.wrapper.net.minecraft.item;

import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.network.Packet;
import de.ropemc.api.wrapper.net.minecraft.world.storage.MapData;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.item.ItemMap")
public interface ItemMap {

    void addInformation(ItemStack var0, EntityPlayer var1, List var2, boolean var3);

    Packet createMapDataPacket(ItemStack var0, World var1, EntityPlayer var2);

    MapData getMapData(ItemStack var0, World var1);

    MapData loadMapData(int var0, World var1);

    void onCreated(ItemStack var0, World var1, EntityPlayer var2);

    void onUpdate(ItemStack var0, World var1, Entity var2, int var3, boolean var4);

    void updateMapData(World var0, Entity var1, MapData var2);

}
