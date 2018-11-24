package de.ropemc.api.wrapper.net.minecraft.enchantment;

import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.entity.EnumCreatureAttribute;
import de.ropemc.api.wrapper.net.minecraft.util.DamageSource;
import java.util.Map;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.enchantment.EnchantmentHelper")
public interface EnchantmentHelper {

    ItemStack addRandomEnchantment(Random var0, ItemStack var1, int var2);

    void applyArthropodEnchantments(EntityLivingBase var0, Entity var1);

    //void applyEnchantmentModifier(EnchantmentHelper$IModifier var0, ItemStack var1);

    //void applyEnchantmentModifierArray(EnchantmentHelper$IModifier var0, ItemStack[] var1);

    void applyThornEnchantments(EntityLivingBase var0, Entity var1);

    List buildEnchantmentList(Random var0, ItemStack var1, int var2);

    int calcItemStackEnchantability(Random var0, int var1, int var2, ItemStack var3);

    float func_152377_a(ItemStack var0, EnumCreatureAttribute var1);

    boolean getAquaAffinityModifier(EntityLivingBase var0);

    int getDepthStriderModifier(Entity var0);

    int getEfficiencyModifier(EntityLivingBase var0);

    ItemStack getEnchantedItem(Enchantment var0, EntityLivingBase var1);

    int getEnchantmentLevel(int var0, ItemStack var1);

    int getEnchantmentModifierDamage(ItemStack[] var0, DamageSource var1);

    Map getEnchantments(ItemStack var0);

    int getFireAspectModifier(EntityLivingBase var0);

    int getFortuneModifier(EntityLivingBase var0);

    int getKnockbackModifier(EntityLivingBase var0);

    int getLootingModifier(EntityLivingBase var0);

    int getLuckOfSeaModifier(EntityLivingBase var0);

    int getLureModifier(EntityLivingBase var0);

    int getMaxEnchantmentLevel(int var0, ItemStack[] var1);

    int getRespiration(Entity var0);

    boolean getSilkTouchModifier(EntityLivingBase var0);

    Map mapEnchantmentData(int var0, ItemStack var1);

    void setEnchantments(Map var0, ItemStack var1);

}
