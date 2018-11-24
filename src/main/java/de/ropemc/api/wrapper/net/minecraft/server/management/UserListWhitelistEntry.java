package de.ropemc.api.wrapper.net.minecraft.server.management;

import com.google.gson.JsonObject;
//import com.mojang.authlib.GameProfile;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.server.management.UserListWhitelistEntry")
public interface UserListWhitelistEntry {

    //GameProfile gameProfileFromJsonObject(JsonObject var0);

    void onSerialization(JsonObject var0);

}
