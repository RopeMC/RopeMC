package de.ropemc.api.wrapper.net.minecraft.enchantment;

import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.enchantment.EnchantmentDigging")
public interface EnchantmentDigging {

    boolean canApply(ItemStack var0);

    int getMaxEnchantability(int var0);

    int getMaxLevel();

    int getMinEnchantability(int var0);

}
