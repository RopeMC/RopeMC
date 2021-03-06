package de.ropemc.api.wrapper.net.minecraft.client.player.inventory;

import de.ropemc.api.wrapper.net.minecraft.entity.player.InventoryPlayer;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.inventory.Container;
import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.player.inventory.LocalBlockIntercommunication")
public interface LocalBlockIntercommunication {

    Container createContainer(InventoryPlayer var0, EntityPlayer var1);

    IChatComponent getDisplayName();

    String getGuiID();

    String getName();

    boolean hasCustomName();

}
