package de.ropemc.api.wrapper.net.minecraft.util;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.Session")
public interface Session {
    String getSessionID();

    String getPlayerID();

    String getUsername();

    String getToken();
}
