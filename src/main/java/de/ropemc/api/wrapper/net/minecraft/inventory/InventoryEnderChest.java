package de.ropemc.api.wrapper.net.minecraft.inventory;

import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagList;
import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntityEnderChest;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.inventory.InventoryEnderChest")
public interface InventoryEnderChest {

    void closeInventory(EntityPlayer var0);

    boolean isUseableByPlayer(EntityPlayer var0);

    void loadInventoryFromNBT(NBTTagList var0);

    void openInventory(EntityPlayer var0);

    NBTTagList saveInventoryToNBT();

    void setChestTileEntity(TileEntityEnderChest var0);

}
