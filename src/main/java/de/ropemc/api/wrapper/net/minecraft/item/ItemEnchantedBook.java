package de.ropemc.api.wrapper.net.minecraft.item;

import de.ropemc.api.wrapper.net.minecraft.enchantment.EnchantmentData;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.enchantment.Enchantment;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagList;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.util.WeightedRandomChestContent;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.item.ItemEnchantedBook")
public interface ItemEnchantedBook {

    void addEnchantment(ItemStack var0, EnchantmentData var1);

    void addInformation(ItemStack var0, EntityPlayer var1, List var2, boolean var3);

    void getAll(Enchantment var0, List var1);

    ItemStack getEnchantedItemStack(EnchantmentData var0);

    NBTTagList getEnchantments(ItemStack var0);

    WeightedRandomChestContent getRandom(Random var0);

    WeightedRandomChestContent getRandom(Random var0, int var1, int var2, int var3);

    EnumRarity getRarity(ItemStack var0);

    boolean hasEffect(ItemStack var0);

    boolean isItemTool(ItemStack var0);

}
