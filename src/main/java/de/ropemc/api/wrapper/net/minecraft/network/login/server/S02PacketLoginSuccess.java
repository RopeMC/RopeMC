package de.ropemc.api.wrapper.net.minecraft.network.login.server;

//import com.mojang.authlib.GameProfile;
import de.ropemc.api.wrapper.net.minecraft.network.INetHandler;
import de.ropemc.api.wrapper.net.minecraft.network.login.INetHandlerLoginClient;
import de.ropemc.api.wrapper.net.minecraft.network.PacketBuffer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.network.login.server.S02PacketLoginSuccess")
public interface S02PacketLoginSuccess {

    //GameProfile getProfile();

    void processPacket(INetHandler var0);

    void processPacket(INetHandlerLoginClient var0);

    void readPacketData(PacketBuffer var0);

    void writePacketData(PacketBuffer var0);

}
