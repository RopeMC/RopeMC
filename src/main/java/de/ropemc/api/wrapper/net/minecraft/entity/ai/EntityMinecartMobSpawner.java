package de.ropemc.api.wrapper.net.minecraft.entity.ai;

import de.ropemc.api.wrapper.net.minecraft.tileentity.MobSpawnerBaseLogic;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
//import de.ropemc.api.wrapper.net.minecraft.entity.item.EntityMinecart$EnumMinecartType;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.ai.EntityMinecartMobSpawner")
public interface EntityMinecartMobSpawner {

    MobSpawnerBaseLogic func_98039_d();

    IBlockState getDefaultDisplayTile();

    //EntityMinecart$EnumMinecartType getMinecartType();

    void handleStatusUpdate(byte var0);

    void onUpdate();

    void readEntityFromNBT(NBTTagCompound var0);

    void writeEntityToNBT(NBTTagCompound var0);

}
