package de.ropemc.api.wrapper.net.minecraft.inventory;

import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntity;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import java.util.Set;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.entity.player.InventoryPlayer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.inventory.Container")
public interface Container {

    Slot addSlotToContainer(Slot var0);

    int calcRedstone(TileEntity var0);

    int calcRedstoneFromInventory(IInventory var0);

    boolean canAddItemToSlot(Slot var0, ItemStack var1, boolean var2);

    boolean canDragIntoSlot(Slot var0);

    boolean canInteractWith(EntityPlayer var0);

    boolean canMergeSlot(ItemStack var0, Slot var1);

    void computeStackSize(Set var0, int var1, ItemStack var2, int var3);

    void detectAndSendChanges();

    boolean enchantItem(EntityPlayer var0, int var1);

    int extractDragMode(int var0);

    int func_94534_d(int var0, int var1);

    boolean getCanCraft(EntityPlayer var0);

    int getDragEvent(int var0);

    List getInventory();

    short getNextTransactionID(InventoryPlayer var0);

    Slot getSlot(int var0);

    Slot getSlotFromInventory(IInventory var0, int var1);

    boolean isValidDragMode(int var0, EntityPlayer var1);

    boolean mergeItemStack(ItemStack var0, int var1, int var2, boolean var3);

    void onContainerClosed(EntityPlayer var0);

    void onCraftGuiOpened(ICrafting var0);

    void onCraftMatrixChanged(IInventory var0);

    void putStackInSlot(int var0, ItemStack var1);

    void putStacksInSlots(ItemStack[] var0);

    void removeCraftingFromCrafters(ICrafting var0);

    void resetDrag();

    void retrySlotClick(int var0, int var1, boolean var2, EntityPlayer var3);

    void setCanCraft(EntityPlayer var0, boolean var1);

    ItemStack slotClick(int var0, int var1, int var2, EntityPlayer var3);

    ItemStack transferStackInSlot(EntityPlayer var0, int var1);

    void updateProgressBar(int var0, int var1);

}
