package de.ropemc.api.wrapper.net.minecraft.tileentity;

import de.ropemc.api.wrapper.net.minecraft.network.Packet;
//import com.mojang.authlib.GameProfile;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.tileentity.TileEntitySkull")
public interface TileEntitySkull {

    Packet getDescriptionPacket();

    //GameProfile getPlayerProfile();

    int getSkullRotation();

    int getSkullType();

    void readFromNBT(NBTTagCompound var0);

    //void setPlayerProfile(GameProfile var0);

    void setSkullRotation(int var0);

    void setType(int var0);

    //GameProfile updateGameprofile(GameProfile var0);

    void updatePlayerProfile();

    void writeToNBT(NBTTagCompound var0);

}
