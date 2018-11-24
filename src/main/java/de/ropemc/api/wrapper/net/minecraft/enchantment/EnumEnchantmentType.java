package de.ropemc.api.wrapper.net.minecraft.enchantment;

import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.enchantment.EnumEnchantmentType")
public interface EnumEnchantmentType {

    boolean canEnchantItem(Item var0);

}
