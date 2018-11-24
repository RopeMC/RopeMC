package de.ropemc.api.wrapper.net.minecraft.server.integrated;

import java.net.SocketAddress;
//import com.mojang.authlib.GameProfile;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
//import de.ropemc.api.wrapper.net.minecraft.server.MinecraftServer;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayerMP;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.server.integrated.IntegratedPlayerList")
public interface IntegratedPlayerList {

    //String allowUserToConnect(SocketAddress var0, GameProfile var1);

    NBTTagCompound getHostPlayerData();

    //MinecraftServer getServerInstance();

    void writePlayerData(EntityPlayerMP var0);

}
