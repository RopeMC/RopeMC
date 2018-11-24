package de.ropemc.api.wrapper.net.minecraft.enchantment;

import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.enchantment.EnchantmentThorns")
public interface EnchantmentThorns {

    boolean canApply(ItemStack var0);

    boolean func_92094_a(int var0, Random var1);

    int func_92095_b(int var0, Random var1);

    int getMaxEnchantability(int var0);

    int getMaxLevel();

    int getMinEnchantability(int var0);

    void onUserHurt(EntityLivingBase var0, Entity var1, int var2);

}
