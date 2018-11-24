package de.ropemc.api.wrapper.net.minecraft.entity.item;

import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.util.DamageSource;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.item.EntityMinecartFurnace")
public interface EntityMinecartFurnace {

    void applyDrag();

    void entityInit();

    void func_180460_a(BlockPos var0, IBlockState var1);

    IBlockState getDefaultDisplayTile();

    double getMaximumSpeed();

    //EntityMinecart$EnumMinecartType getMinecartType();

    boolean interactFirst(EntityPlayer var0);

    boolean isMinecartPowered();

    void killMinecart(DamageSource var0);

    void onUpdate();

    void readEntityFromNBT(NBTTagCompound var0);

    void setMinecartPowered(boolean var0);

    void writeEntityToNBT(NBTTagCompound var0);

}
