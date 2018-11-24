package de.ropemc.api.wrapper.net.minecraft.server.management;

import com.google.gson.JsonObject;
//import com.mojang.authlib.GameProfile;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.server.management.UserListWhitelist")
public interface UserListWhitelist {

    UserListEntry createEntry(JsonObject var0);

    //GameProfile getBannedProfile(String var0);

    String[] getKeys();

    //String getObjectKey(GameProfile var0);

    String getObjectKey(Object var0);

    //boolean isWhitelisted(GameProfile var0);

}
