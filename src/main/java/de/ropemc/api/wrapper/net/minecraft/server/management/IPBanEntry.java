package de.ropemc.api.wrapper.net.minecraft.server.management;

import com.google.gson.JsonObject;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.server.management.IPBanEntry")
public interface IPBanEntry {

    String getIPFromJson(JsonObject var0);

    void onSerialization(JsonObject var0);

}
