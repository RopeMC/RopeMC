package de.ropemc.api.wrapper.net.minecraft.enchantment;

import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.enchantment.EnchantmentUntouching")
public interface EnchantmentUntouching {

    boolean canApply(ItemStack var0);

    boolean canApplyTogether(Enchantment var0);

    int getMaxEnchantability(int var0);

    int getMaxLevel();

    int getMinEnchantability(int var0);

}
