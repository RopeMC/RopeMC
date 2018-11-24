package de.ropemc.api.wrapper.net.minecraft.util;

//import com.mojang.authlib.GameProfile;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.Session")
public interface Session {

    String getPlayerID();

    //GameProfile getProfile();

    String getSessionID();

    //Session$Type getSessionType();

    String getToken();

    String getUsername();

}
