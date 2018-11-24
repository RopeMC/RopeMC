package de.ropemc.api.wrapper.net.minecraft.server.dedicated;

//import com.mojang.authlib.GameProfile;
//import de.ropemc.api.wrapper.net.minecraft.server.MinecraftServer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.server.dedicated.DedicatedPlayerList")
public interface DedicatedPlayerList {

    //void addOp(GameProfile var0);

    //void addWhitelistedPlayer(GameProfile var0);

    //boolean canJoin(GameProfile var0);

    //boolean func_183023_f(GameProfile var0);

    //MinecraftServer getServerInstance();

    void loadIpBanList();

    void loadOpsList();

    void loadUserBansList();

    void loadWhiteList();

    void readWhiteList();

    //void removeOp(GameProfile var0);

    //void removePlayerFromWhitelist(GameProfile var0);

    void saveIpBanList();

    void saveOpsList();

    void saveUserBanList();

    void saveWhiteList();

    void setWhiteListEnabled(boolean var0);

}
