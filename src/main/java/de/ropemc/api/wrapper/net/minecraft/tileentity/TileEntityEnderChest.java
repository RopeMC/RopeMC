package de.ropemc.api.wrapper.net.minecraft.tileentity;

import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.tileentity.TileEntityEnderChest")
public interface TileEntityEnderChest {

    boolean canBeUsed(EntityPlayer var0);

    void closeChest();

    void invalidate();

    void openChest();

    boolean receiveClientEvent(int var0, int var1);

    void update();

}
