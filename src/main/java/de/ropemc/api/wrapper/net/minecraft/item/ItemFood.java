package de.ropemc.api.wrapper.net.minecraft.item;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.item.ItemFood")
public interface ItemFood {

    int getHealAmount(ItemStack var0);

    EnumAction getItemUseAction(ItemStack var0);

    int getMaxItemUseDuration(ItemStack var0);

    float getSaturationModifier(ItemStack var0);

    boolean isWolfsFavoriteMeat();

    void onFoodEaten(ItemStack var0, World var1, EntityPlayer var2);

    ItemStack onItemRightClick(ItemStack var0, World var1, EntityPlayer var2);

    ItemStack onItemUseFinish(ItemStack var0, World var1, EntityPlayer var2);

    ItemFood setAlwaysEdible();

    ItemFood setPotionEffect(int var0, int var1, int var2, float var3);

}
