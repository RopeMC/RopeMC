package de.ropemc.api.wrapper.net.minecraft.client.multiplayer;

import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.multiplayer.ServerData")
public interface ServerData {

    void copyFrom(ServerData var0);

    boolean func_181041_d();

    String getBase64EncodedIconData();

    NBTTagCompound getNBTCompound();

    //ServerData$ServerResourceMode getResourceMode();

    ServerData getServerDataFromNBTCompound(NBTTagCompound var0);

    void setBase64EncodedIconData(String var0);

    //void setResourceMode(ServerData$ServerResourceMode var0);

}
