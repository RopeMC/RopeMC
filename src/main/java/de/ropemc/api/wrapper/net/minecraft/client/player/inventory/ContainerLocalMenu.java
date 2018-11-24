package de.ropemc.api.wrapper.net.minecraft.client.player.inventory;

import de.ropemc.api.wrapper.net.minecraft.entity.player.InventoryPlayer;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.inventory.Container;
import de.ropemc.api.wrapper.net.minecraft.world.LockCode;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.player.inventory.ContainerLocalMenu")
public interface ContainerLocalMenu {

    Container createContainer(InventoryPlayer var0, EntityPlayer var1);

    int getField(int var0);

    int getFieldCount();

    String getGuiID();

    LockCode getLockCode();

    boolean isLocked();

    void setField(int var0, int var1);

    void setLockCode(LockCode var0);

}
