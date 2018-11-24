package de.ropemc.api.wrapper.net.minecraft.server.management;

import com.google.gson.JsonObject;
import java.io.File;
import java.util.Map;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.server.management.UserList")
public interface UserList {

    void addEntry(UserListEntry var0);

    UserListEntry createEntry(JsonObject var0);

    UserListEntry getEntry(Object var0);

    String[] getKeys();

    String getObjectKey(Object var0);

    File getSaveFile();

    Map getValues();

    boolean hasEntry(Object var0);

    boolean isEmpty();

    boolean isLanServer();

    void readSavedFile();

    void removeEntry(Object var0);

    void removeExpired();

    void setLanServer(boolean var0);

    void writeChanges();

}
