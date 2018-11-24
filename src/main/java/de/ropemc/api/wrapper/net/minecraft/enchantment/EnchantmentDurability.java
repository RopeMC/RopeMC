package de.ropemc.api.wrapper.net.minecraft.enchantment;

import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import java.util.Random;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.enchantment.EnchantmentDurability")
public interface EnchantmentDurability {

    boolean canApply(ItemStack var0);

    int getMaxEnchantability(int var0);

    int getMaxLevel();

    int getMinEnchantability(int var0);

    boolean negateDamage(ItemStack var0, int var1, Random var2);

}
