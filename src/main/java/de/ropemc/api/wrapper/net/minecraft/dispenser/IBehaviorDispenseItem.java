package de.ropemc.api.wrapper.net.minecraft.dispenser;

import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.dispenser.IBehaviorDispenseItem")
public interface IBehaviorDispenseItem {

    ItemStack dispense(IBlockSource var0, ItemStack var1);

}
