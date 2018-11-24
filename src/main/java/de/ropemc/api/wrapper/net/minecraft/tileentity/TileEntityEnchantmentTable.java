package de.ropemc.api.wrapper.net.minecraft.tileentity;

import de.ropemc.api.wrapper.net.minecraft.entity.player.InventoryPlayer;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.inventory.Container;
import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.tileentity.TileEntityEnchantmentTable")
public interface TileEntityEnchantmentTable {

    Container createContainer(InventoryPlayer var0, EntityPlayer var1);

    IChatComponent getDisplayName();

    String getGuiID();

    String getName();

    boolean hasCustomName();

    void readFromNBT(NBTTagCompound var0);

    void setCustomName(String var0);

    void update();

    void writeToNBT(NBTTagCompound var0);

}
