package de.ropemc.api.wrapper.net.minecraft.enchantment;

import de.ropemc.api.wrapper.net.minecraft.entity.EnumCreatureAttribute;
import de.ropemc.api.wrapper.net.minecraft.util.DamageSource;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import java.util.Set;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.enchantment.Enchantment")
public interface Enchantment {

    float calcDamageByCreature(int var0, EnumCreatureAttribute var1);

    int calcModifierDamage(int var0, DamageSource var1);

    boolean canApply(ItemStack var0);

    boolean canApplyTogether(Enchantment var0);

    Set func_181077_c();

    Enchantment getEnchantmentById(int var0);

    Enchantment getEnchantmentByLocation(String var0);

    int getMaxEnchantability(int var0);

    int getMaxLevel();

    int getMinEnchantability(int var0);

    int getMinLevel();

    String getName();

    String getTranslatedName(int var0);

    int getWeight();

    void onEntityDamaged(EntityLivingBase var0, Entity var1, int var2);

    void onUserHurt(EntityLivingBase var0, Entity var1, int var2);

    Enchantment setName(String var0);

}
