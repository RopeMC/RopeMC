package de.ropemc.api.wrapper.net.minecraft.server.management;

//import com.mojang.authlib.GameProfile;
import java.util.Date;
import java.util.UUID;
import java.util.List;
//import de.ropemc.api.wrapper.net.minecraft.server.MinecraftServer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.server.management.PlayerProfileCache")
public interface PlayerProfileCache {

    //void addEntry(GameProfile var0);

    //void addEntry(GameProfile var0, Date var1);

    //PlayerProfileCache$ProfileEntry getByUUID(UUID var0);

    List getEntriesWithLimit(int var0);

    //GameProfile getGameProfile(MinecraftServer var0, String var1);

    //GameProfile getGameProfileForUsername(String var0);

    //GameProfile getProfileByUUID(UUID var0);

    String[] getUsernames();

    void load();

    void save();

}
