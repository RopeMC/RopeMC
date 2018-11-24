package de.ropemc.api.wrapper.net.minecraft.entity.player;

import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagList;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.player.InventoryPlayer")
public interface InventoryPlayer {

    boolean addItemStackToInventory(ItemStack var0);

    ItemStack armorItemInSlot(int var0);

    boolean canHeldItemHarvest(Block var0);

    void changeCurrentItem(int var0);

    void clear();

    int clearMatchingItems(Item var0, int var1, int var2, NBTTagCompound var3);

    void closeInventory(EntityPlayer var0);

    boolean consumeInventoryItem(Item var0);

    void copyInventory(InventoryPlayer var0);

    void damageArmor(float var0);

    ItemStack decrStackSize(int var0, int var1);

    void decrementAnimations();

    void dropAllItems();

    ItemStack getCurrentItem();

    IChatComponent getDisplayName();

    int getField(int var0);

    int getFieldCount();

    int getFirstEmptyStack();

    int getHotbarSize();

    int getInventorySlotContainItem(Item var0);

    int getInventorySlotContainItemAndDamage(Item var0, int var1);

    int getInventoryStackLimit();

    ItemStack getItemStack();

    String getName();

    int getSizeInventory();

    ItemStack getStackInSlot(int var0);

    float getStrVsBlock(Block var0);

    int getTotalArmorValue();

    boolean hasCustomName();

    boolean hasItem(Item var0);

    boolean hasItemStack(ItemStack var0);

    boolean isItemValidForSlot(int var0, ItemStack var1);

    boolean isUseableByPlayer(EntityPlayer var0);

    void markDirty();

    void openInventory(EntityPlayer var0);

    void readFromNBT(NBTTagList var0);

    ItemStack removeStackFromSlot(int var0);

    void setCurrentItem(Item var0, int var1, boolean var2, boolean var3);

    void setField(int var0, int var1);

    void setInventorySlotContents(int var0, ItemStack var1);

    void setItemStack(ItemStack var0);

    int storeItemStack(ItemStack var0);

    int storePartialItemStack(ItemStack var0);

    NBTTagList writeToNBT(NBTTagList var0);

}
