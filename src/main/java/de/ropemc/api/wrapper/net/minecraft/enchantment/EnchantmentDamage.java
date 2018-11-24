package de.ropemc.api.wrapper.net.minecraft.enchantment;

import de.ropemc.api.wrapper.net.minecraft.entity.EnumCreatureAttribute;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.enchantment.EnchantmentDamage")
public interface EnchantmentDamage {

    float calcDamageByCreature(int var0, EnumCreatureAttribute var1);

    boolean canApply(ItemStack var0);

    boolean canApplyTogether(Enchantment var0);

    int getMaxEnchantability(int var0);

    int getMaxLevel();

    int getMinEnchantability(int var0);

    String getName();

    void onEntityDamaged(EntityLivingBase var0, Entity var1, int var2);

}
