package de.ropemc.api.wrapper.net.minecraft.network.play.client;

//import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer$EnumChatVisibility;
import de.ropemc.api.wrapper.net.minecraft.network.INetHandler;
import de.ropemc.api.wrapper.net.minecraft.network.play.INetHandlerPlayServer;
import de.ropemc.api.wrapper.net.minecraft.network.PacketBuffer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.network.play.client.C15PacketClientSettings")
public interface C15PacketClientSettings {

    //EntityPlayer$EnumChatVisibility getChatVisibility();

    String getLang();

    int getModelPartFlags();

    boolean isColorsEnabled();

    void processPacket(INetHandler var0);

    void processPacket(INetHandlerPlayServer var0);

    void readPacketData(PacketBuffer var0);

    void writePacketData(PacketBuffer var0);

}
