package de.ropemc.api.wrapper.net.minecraft.server.management;

import com.google.gson.JsonObject;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.server.management.UserListEntry")
public interface UserListEntry {

    Object getValue();

    boolean hasBanExpired();

    void onSerialization(JsonObject var0);

}
