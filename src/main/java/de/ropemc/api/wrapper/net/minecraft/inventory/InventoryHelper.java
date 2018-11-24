package de.ropemc.api.wrapper.net.minecraft.inventory;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.inventory.InventoryHelper")
public interface InventoryHelper {

    void dropInventoryItems(World var0, BlockPos var1, IInventory var2);

    void func_180174_a(World var0, double var1, double var2, double var3, IInventory var4);

    void func_180176_a(World var0, Entity var1, IInventory var2);

    void spawnItemStack(World var0, double var1, double var2, double var3, ItemStack var4);

}
