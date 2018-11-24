package de.ropemc.api.wrapper.net.minecraft.item;

import de.ropemc.api.wrapper.net.minecraft.creativetab.CreativeTabs;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.item.ItemFishFood")
public interface ItemFishFood {

    int getHealAmount(ItemStack var0);

    String getPotionEffect(ItemStack var0);

    float getSaturationModifier(ItemStack var0);

    void getSubItems(Item var0, CreativeTabs var1, List var2);

    String getUnlocalizedName(ItemStack var0);

    void onFoodEaten(ItemStack var0, World var1, EntityPlayer var2);

}
