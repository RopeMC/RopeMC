package de.ropemc.api.wrapper.net.minecraft.server.network;

//import de.ropemc.api.wrapper.net.minecraft.server.MinecraftServer;
//import com.mojang.authlib.GameProfile;
import javax.crypto.SecretKey;
//import org.apache.logging.log4j.Logger;
import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
import de.ropemc.api.wrapper.net.minecraft.network.login.client.C01PacketEncryptionResponse;
import de.ropemc.api.wrapper.net.minecraft.network.login.client.C00PacketLoginStart;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.server.network.NetHandlerLoginServer")
public interface NetHandlerLoginServer {

    //MinecraftServer access$000(NetHandlerLoginServer var0);

    //GameProfile access$100(NetHandlerLoginServer var0);

    //GameProfile access$102(NetHandlerLoginServer var0, GameProfile var1);

    //String access$200(NetHandlerLoginServer var0);

    //SecretKey access$300(NetHandlerLoginServer var0);

    //Logger access$400();

    //NetHandlerLoginServer$LoginState access$502(NetHandlerLoginServer var0, NetHandlerLoginServer$LoginState var1);

    void closeConnection(String var0);

    String getConnectionInfo();

    //GameProfile getOfflineProfile(GameProfile var0);

    void onDisconnect(IChatComponent var0);

    void processEncryptionResponse(C01PacketEncryptionResponse var0);

    void processLoginStart(C00PacketLoginStart var0);

    void tryAcceptPlayer();

    void update();

}
