package de.ropemc.api.wrapper.net.minecraft.inventory;

import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.village.MerchantRecipe;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.inventory.SlotMerchantResult")
public interface SlotMerchantResult {

    ItemStack decrStackSize(int var0);

    boolean doTrade(MerchantRecipe var0, ItemStack var1, ItemStack var2);

    boolean isItemValid(ItemStack var0);

    void onCrafting(ItemStack var0);

    void onCrafting(ItemStack var0, int var1);

    void onPickupFromSlot(EntityPlayer var0, ItemStack var1);

}
