package de.ropemc.api.wrapper.net.minecraft.item;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.item.ItemArmor")
public interface ItemArmor {

    //int[] access$000();

    //ItemArmor$ArmorMaterial getArmorMaterial();

    int getColor(ItemStack var0);

    int getColorFromItemStack(ItemStack var0, int var1);

    boolean getIsRepairable(ItemStack var0, ItemStack var1);

    int getItemEnchantability();

    boolean hasColor(ItemStack var0);

    ItemStack onItemRightClick(ItemStack var0, World var1, EntityPlayer var2);

    void removeColor(ItemStack var0);

    void setColor(ItemStack var0, int var1);

}
