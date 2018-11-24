package de.ropemc.api.wrapper.net.minecraft.item.crafting;

import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.block.Block;
import java.util.Map;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.item.crafting.FurnaceRecipes")
public interface FurnaceRecipes {

    void addSmelting(Item var0, ItemStack var1, float var2);

    void addSmeltingRecipe(ItemStack var0, ItemStack var1, float var2);

    void addSmeltingRecipeForBlock(Block var0, ItemStack var1, float var2);

    boolean compareItemStacks(ItemStack var0, ItemStack var1);

    float getSmeltingExperience(ItemStack var0);

    Map getSmeltingList();

    ItemStack getSmeltingResult(ItemStack var0);

    FurnaceRecipes instance();

}
