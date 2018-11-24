package de.ropemc.api.wrapper.net.minecraft.entity.item;

import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.item.EntityMinecartEmpty")
public interface EntityMinecartEmpty {

    //EntityMinecart$EnumMinecartType getMinecartType();

    boolean interactFirst(EntityPlayer var0);

    void onActivatorRailPass(int var0, int var1, int var2, boolean var3);

}
