package de.ropemc.api.wrapper.net.minecraft.server.management;

import java.net.SocketAddress;
import com.google.gson.JsonObject;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.server.management.BanList")
public interface BanList {

    String addressToString(SocketAddress var0);

    UserListEntry createEntry(JsonObject var0);

    IPBanEntry getBanEntry(SocketAddress var0);

    boolean isBanned(SocketAddress var0);

}
