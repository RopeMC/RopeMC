package de.ropemc.api.wrapper.net.minecraft.item.crafting;

import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.inventory.InventoryCrafting;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import java.util.List;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.item.crafting.CraftingManager")
public interface CraftingManager {

    ShapedRecipes addRecipe(ItemStack var0, Object[] var1);

    void addRecipe(IRecipe var0);

    void addShapelessRecipe(ItemStack var0, Object[] var1);

    ItemStack findMatchingRecipe(InventoryCrafting var0, World var1);

    ItemStack[] func_180303_b(InventoryCrafting var0, World var1);

    CraftingManager getInstance();

    List getRecipeList();

}
