package de.ropemc.api.wrapper.net.minecraft.server.management;

import com.google.gson.JsonObject;
//import com.mojang.authlib.GameProfile;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.server.management.UserListBansEntry")
public interface UserListBansEntry {

    void onSerialization(JsonObject var0);

    //GameProfile toGameProfile(JsonObject var0);

}
