package de.ropemc.api.wrapper.net.minecraft.village;

import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.net.minecraft.network.PacketBuffer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.village.MerchantRecipeList")
public interface MerchantRecipeList {

    MerchantRecipe canRecipeBeUsed(ItemStack var0, ItemStack var1, int var2);

    boolean func_181078_a(ItemStack var0, ItemStack var1);

    NBTTagCompound getRecipiesAsTags();

    MerchantRecipeList readFromBuf(PacketBuffer var0);

    void readRecipiesFromTags(NBTTagCompound var0);

    void writeToBuf(PacketBuffer var0);

}
