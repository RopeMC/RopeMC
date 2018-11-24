package de.ropemc.api.wrapper.net.minecraft.server.management;

import com.google.gson.JsonObject;
//import com.mojang.authlib.GameProfile;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.server.management.UserListOpsEntry")
public interface UserListOpsEntry {

    //GameProfile func_152643_b(JsonObject var0);

    boolean func_183024_b();

    int getPermissionLevel();

    void onSerialization(JsonObject var0);

}
