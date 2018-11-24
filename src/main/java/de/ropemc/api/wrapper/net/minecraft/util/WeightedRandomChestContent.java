package de.ropemc.api.wrapper.net.minecraft.util;

import java.util.List;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.inventory.IInventory;
import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntityDispenser;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.WeightedRandomChestContent")
public interface WeightedRandomChestContent {

    List func_177629_a(List var0, WeightedRandomChestContent[] var1);

    void generateChestContents(Random var0, List var1, IInventory var2, int var3);

    void generateDispenserContents(Random var0, List var1, TileEntityDispenser var2, int var3);

}
