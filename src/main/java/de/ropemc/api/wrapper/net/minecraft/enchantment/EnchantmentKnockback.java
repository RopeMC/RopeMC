package de.ropemc.api.wrapper.net.minecraft.enchantment;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.enchantment.EnchantmentKnockback")
public interface EnchantmentKnockback {

    int getMaxEnchantability(int var0);

    int getMaxLevel();

    int getMinEnchantability(int var0);

}
