package de.ropemc.api.wrapper.net.minecraft.network.login.client;

//import com.mojang.authlib.GameProfile;
import de.ropemc.api.wrapper.net.minecraft.network.INetHandler;
import de.ropemc.api.wrapper.net.minecraft.network.login.INetHandlerLoginServer;
import de.ropemc.api.wrapper.net.minecraft.network.PacketBuffer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.network.login.client.C00PacketLoginStart")
public interface C00PacketLoginStart {

    //GameProfile getProfile();

    void processPacket(INetHandler var0);

    void processPacket(INetHandlerLoginServer var0);

    void readPacketData(PacketBuffer var0);

    void writePacketData(PacketBuffer var0);

}
