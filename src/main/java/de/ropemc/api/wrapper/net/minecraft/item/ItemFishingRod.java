package de.ropemc.api.wrapper.net.minecraft.item;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.item.ItemFishingRod")
public interface ItemFishingRod {

    int getItemEnchantability();

    boolean isFull3D();

    boolean isItemTool(ItemStack var0);

    ItemStack onItemRightClick(ItemStack var0, World var1, EntityPlayer var2);

    boolean shouldRotateAroundWhenRendering();

}
