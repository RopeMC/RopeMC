package de.ropemc.api.wrapper.net.minecraft.enchantment;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.enchantment.EnchantmentArrowDamage")
public interface EnchantmentArrowDamage {

    int getMaxEnchantability(int var0);

    int getMaxLevel();

    int getMinEnchantability(int var0);

}
