package de.ropemc.api.wrapper.net.minecraft.item.crafting;

import de.ropemc.api.wrapper.net.minecraft.inventory.InventoryCrafting;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.item.crafting.RecipeBookCloning")
public interface RecipeBookCloning {

    ItemStack getCraftingResult(InventoryCrafting var0);

    ItemStack getRecipeOutput();

    int getRecipeSize();

    ItemStack[] getRemainingItems(InventoryCrafting var0);

    boolean matches(InventoryCrafting var0, World var1);

}
