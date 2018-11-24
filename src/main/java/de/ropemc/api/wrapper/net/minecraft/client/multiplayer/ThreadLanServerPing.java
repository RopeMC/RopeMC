package de.ropemc.api.wrapper.net.minecraft.client.multiplayer;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.multiplayer.ThreadLanServerPing")
public interface ThreadLanServerPing {

    String getAdFromPingResponse(String var0);

    String getMotdFromPingResponse(String var0);

    String getPingResponse(String var0, String var1);

}
