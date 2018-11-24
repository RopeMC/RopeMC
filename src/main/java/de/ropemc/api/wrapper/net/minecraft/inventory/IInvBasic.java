package de.ropemc.api.wrapper.net.minecraft.inventory;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.inventory.IInvBasic")
public interface IInvBasic {

    void onInventoryChanged(InventoryBasic var0);

}
