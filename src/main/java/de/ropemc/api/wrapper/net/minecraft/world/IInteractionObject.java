package de.ropemc.api.wrapper.net.minecraft.world;

import de.ropemc.api.wrapper.net.minecraft.entity.player.InventoryPlayer;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.inventory.Container;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.IInteractionObject")
public interface IInteractionObject {

    Container createContainer(InventoryPlayer var0, EntityPlayer var1);

    String getGuiID();

}
