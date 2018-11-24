package de.ropemc.api.wrapper.net.minecraft.entity.item;

import de.ropemc.api.wrapper.net.minecraft.entity.player.InventoryPlayer;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.inventory.Container;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.DamageSource;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.item.EntityMinecartHopper")
public interface EntityMinecartHopper {

    boolean canTransfer();

    Container createContainer(InventoryPlayer var0, EntityPlayer var1);

    boolean func_96112_aD();

    boolean getBlocked();

    IBlockState getDefaultDisplayTile();

    int getDefaultDisplayTileOffset();

    String getGuiID();

    //EntityMinecart$EnumMinecartType getMinecartType();

    int getSizeInventory();

    World getWorld();

    double getXPos();

    double getYPos();

    double getZPos();

    boolean interactFirst(EntityPlayer var0);

    void killMinecart(DamageSource var0);

    void onActivatorRailPass(int var0, int var1, int var2, boolean var3);

    void onUpdate();

    void readEntityFromNBT(NBTTagCompound var0);

    void setBlocked(boolean var0);

    void setTransferTicker(int var0);

    void writeEntityToNBT(NBTTagCompound var0);

}
