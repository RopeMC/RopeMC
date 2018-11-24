package de.ropemc.api.wrapper.net.minecraft.server.management;

import com.google.gson.JsonObject;
//import com.mojang.authlib.GameProfile;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.server.management.UserListOps")
public interface UserListOps {

    UserListEntry createEntry(JsonObject var0);

    //boolean func_183026_b(GameProfile var0);

    //GameProfile getGameProfileFromName(String var0);

    String[] getKeys();

    //String getObjectKey(GameProfile var0);

    String getObjectKey(Object var0);

}
