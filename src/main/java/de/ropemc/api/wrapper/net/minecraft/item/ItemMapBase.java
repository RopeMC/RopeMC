package de.ropemc.api.wrapper.net.minecraft.item;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.network.Packet;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.item.ItemMapBase")
public interface ItemMapBase {

    Packet createMapDataPacket(ItemStack var0, World var1, EntityPlayer var2);

    boolean isMap();

}
