package de.ropemc.api.wrapper.net.minecraft.client.network;

//import org.apache.logging.log4j.Logger;
import de.ropemc.api.wrapper.net.minecraft.client.multiplayer.ServerData;
//import com.google.common.base.Splitter;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.network.OldServerPinger")
public interface OldServerPinger {

    //Logger access$000();

    //void access$100(OldServerPinger var0, ServerData var1);

    //Splitter access$200();

    void clearPendingNetworks();

    void ping(ServerData var0);

    void pingPendingNetworks();

    void tryCompatibilityPing(ServerData var0);

}
