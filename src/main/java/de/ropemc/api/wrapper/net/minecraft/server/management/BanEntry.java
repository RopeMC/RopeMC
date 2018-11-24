package de.ropemc.api.wrapper.net.minecraft.server.management;

import java.util.Date;
import com.google.gson.JsonObject;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.server.management.BanEntry")
public interface BanEntry {

    Date getBanEndDate();

    String getBanReason();

    boolean hasBanExpired();

    void onSerialization(JsonObject var0);

}
