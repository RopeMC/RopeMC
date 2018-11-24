package de.ropemc.api.wrapper.net.minecraft.item;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.item.ItemBow")
public interface ItemBow {

    int getItemEnchantability();

    EnumAction getItemUseAction(ItemStack var0);

    int getMaxItemUseDuration(ItemStack var0);

    ItemStack onItemRightClick(ItemStack var0, World var1, EntityPlayer var2);

    ItemStack onItemUseFinish(ItemStack var0, World var1, EntityPlayer var2);

    void onPlayerStoppedUsing(ItemStack var0, World var1, EntityPlayer var2, int var3);

}
