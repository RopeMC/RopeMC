package de.ropemc.api.wrapper.net.minecraft.network;

import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.network.ServerStatusResponse")
public interface ServerStatusResponse {

    String getFavicon();

    //ServerStatusResponse$PlayerCountData getPlayerCountData();

    //ServerStatusResponse$MinecraftProtocolVersionIdentifier getProtocolVersionInfo();

    IChatComponent getServerDescription();

    void setFavicon(String var0);

    //void setPlayerCountData(ServerStatusResponse$PlayerCountData var0);

    //void setProtocolVersionInfo(ServerStatusResponse$MinecraftProtocolVersionIdentifier var0);

    void setServerDescription(IChatComponent var0);

}
