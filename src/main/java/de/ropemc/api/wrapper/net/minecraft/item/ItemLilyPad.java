package de.ropemc.api.wrapper.net.minecraft.item;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.item.ItemLilyPad")
public interface ItemLilyPad {

    int getColorFromItemStack(ItemStack var0, int var1);

    ItemStack onItemRightClick(ItemStack var0, World var1, EntityPlayer var2);

}
