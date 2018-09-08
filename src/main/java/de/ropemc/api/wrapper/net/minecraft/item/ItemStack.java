package de.ropemc.api.wrapper.net.minecraft.item;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.item.ItemStack")
public interface ItemStack {
    /**
     * Returns maximum size of the stack.
     */
    int getMaxStackSize();

    /**
     * Returns true if the ItemStack can hold 2 or more units of the item.
     */
    boolean isStackable();

    Item getItem();
}
