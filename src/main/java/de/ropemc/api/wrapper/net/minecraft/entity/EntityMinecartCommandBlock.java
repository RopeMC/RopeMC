package de.ropemc.api.wrapper.net.minecraft.entity;

import de.ropemc.api.wrapper.net.minecraft.command.server.CommandBlockLogic;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
//import de.ropemc.api.wrapper.net.minecraft.entity.item.EntityMinecart$EnumMinecartType;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.EntityMinecartCommandBlock")
public interface EntityMinecartCommandBlock {

    void entityInit();

    CommandBlockLogic getCommandBlockLogic();

    IBlockState getDefaultDisplayTile();

    //EntityMinecart$EnumMinecartType getMinecartType();

    boolean interactFirst(EntityPlayer var0);

    void onActivatorRailPass(int var0, int var1, int var2, boolean var3);

    void onDataWatcherUpdate(int var0);

    void readEntityFromNBT(NBTTagCompound var0);

    void writeEntityToNBT(NBTTagCompound var0);

}
