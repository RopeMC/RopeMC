package de.ropemc.api.wrapper.net.minecraft.entity;

import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
import de.ropemc.api.wrapper.net.minecraft.village.MerchantRecipeList;
import de.ropemc.api.wrapper.net.minecraft.village.MerchantRecipe;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.NpcMerchant")
public interface NpcMerchant {

    EntityPlayer getCustomer();

    IChatComponent getDisplayName();

    MerchantRecipeList getRecipes(EntityPlayer var0);

    void setCustomer(EntityPlayer var0);

    void setRecipes(MerchantRecipeList var0);

    void useRecipe(MerchantRecipe var0);

    void verifySellingItem(ItemStack var0);

}
