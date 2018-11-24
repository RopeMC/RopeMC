package de.ropemc.api.wrapper.net.minecraft.client.gui.inventory;

import de.ropemc.api.wrapper.net.minecraft.inventory.Container;
import de.ropemc.api.wrapper.net.minecraft.inventory.IInventory;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import java.util.List;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.inventory.CreativeCrafting")
public interface CreativeCrafting {

    void func_175173_a(Container var0, IInventory var1);

    void sendProgressBarUpdate(Container var0, int var1, int var2);

    void sendSlotContents(Container var0, int var1, ItemStack var2);

    void updateCraftingInventory(Container var0, List var1);

}
