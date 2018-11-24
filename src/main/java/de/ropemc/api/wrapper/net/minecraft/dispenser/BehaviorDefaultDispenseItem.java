package de.ropemc.api.wrapper.net.minecraft.dispenser;

import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.dispenser.BehaviorDefaultDispenseItem")
public interface BehaviorDefaultDispenseItem {

    ItemStack dispense(IBlockSource var0, ItemStack var1);

    ItemStack dispenseStack(IBlockSource var0, ItemStack var1);

    void doDispense(World var0, ItemStack var1, int var2, EnumFacing var3, IPosition var4);

    int func_82488_a(EnumFacing var0);

    void playDispenseSound(IBlockSource var0);

    void spawnDispenseParticles(IBlockSource var0, EnumFacing var1);

}
