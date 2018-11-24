package de.ropemc.api.wrapper.net.minecraft.item;

import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.item.ItemBucket")
public interface ItemBucket {

    ItemStack fillBucket(ItemStack var0, EntityPlayer var1, Item var2);

    ItemStack onItemRightClick(ItemStack var0, World var1, EntityPlayer var2);

    boolean tryPlaceContainedLiquid(World var0, BlockPos var1);

}
