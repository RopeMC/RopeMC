package de.ropemc.api.wrapper.net.minecraft.client.network;

import de.ropemc.api.wrapper.net.minecraft.network.NetworkManager;
//import com.mojang.authlib.minecraft.MinecraftSessionService;
import de.ropemc.api.wrapper.net.minecraft.network.login.server.S00PacketDisconnect;
import de.ropemc.api.wrapper.net.minecraft.network.login.server.S03PacketEnableCompression;
import de.ropemc.api.wrapper.net.minecraft.network.login.server.S01PacketEncryptionRequest;
import de.ropemc.api.wrapper.net.minecraft.network.login.server.S02PacketLoginSuccess;
import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.network.NetHandlerLoginClient")
public interface NetHandlerLoginClient {

    //NetworkManager access$000(NetHandlerLoginClient var0);

    //MinecraftSessionService getSessionService();

    void handleDisconnect(S00PacketDisconnect var0);

    void handleEnableCompression(S03PacketEnableCompression var0);

    void handleEncryptionRequest(S01PacketEncryptionRequest var0);

    void handleLoginSuccess(S02PacketLoginSuccess var0);

    void onDisconnect(IChatComponent var0);

}
