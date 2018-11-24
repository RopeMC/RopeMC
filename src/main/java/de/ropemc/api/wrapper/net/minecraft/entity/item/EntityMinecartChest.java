package de.ropemc.api.wrapper.net.minecraft.entity.item;

import de.ropemc.api.wrapper.net.minecraft.entity.player.InventoryPlayer;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.inventory.Container;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.util.DamageSource;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.item.EntityMinecartChest")
public interface EntityMinecartChest {

    Container createContainer(InventoryPlayer var0, EntityPlayer var1);

    IBlockState getDefaultDisplayTile();

    int getDefaultDisplayTileOffset();

    String getGuiID();

    //EntityMinecart$EnumMinecartType getMinecartType();

    int getSizeInventory();

    void killMinecart(DamageSource var0);

}
