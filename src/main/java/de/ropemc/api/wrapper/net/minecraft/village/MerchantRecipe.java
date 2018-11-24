package de.ropemc.api.wrapper.net.minecraft.village;

import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.village.MerchantRecipe")
public interface MerchantRecipe {

    void compensateToolUses();

    ItemStack getItemToBuy();

    ItemStack getItemToSell();

    int getMaxTradeUses();

    boolean getRewardsExp();

    ItemStack getSecondItemToBuy();

    int getToolUses();

    boolean hasSecondItemToBuy();

    void increaseMaxTradeUses(int var0);

    void incrementToolUses();

    boolean isRecipeDisabled();

    void readFromTags(NBTTagCompound var0);

    NBTTagCompound writeToTags();

}
