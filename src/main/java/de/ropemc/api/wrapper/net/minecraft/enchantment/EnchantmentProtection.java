package de.ropemc.api.wrapper.net.minecraft.enchantment;

import de.ropemc.api.wrapper.net.minecraft.util.DamageSource;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.enchantment.EnchantmentProtection")
public interface EnchantmentProtection {

    int calcModifierDamage(int var0, DamageSource var1);

    boolean canApplyTogether(Enchantment var0);

    double func_92092_a(Entity var0, double var1);

    int getFireTimeForEntity(Entity var0, int var1);

    int getMaxEnchantability(int var0);

    int getMaxLevel();

    int getMinEnchantability(int var0);

    String getName();

}
