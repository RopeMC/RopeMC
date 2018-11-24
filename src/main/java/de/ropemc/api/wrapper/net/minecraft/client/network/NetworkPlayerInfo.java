package de.ropemc.api.wrapper.net.minecraft.client.network;

import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
//import com.mojang.authlib.GameProfile;
//import de.ropemc.api.wrapper.net.minecraft.world.WorldSettings$GameType;
import de.ropemc.api.wrapper.net.minecraft.scoreboard.ScorePlayerTeam;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.network.NetworkPlayerInfo")
public interface NetworkPlayerInfo {

    //ResourceLocation access$002(NetworkPlayerInfo var0, ResourceLocation var1);

    //String access$100(NetworkPlayerInfo var0);

    //String access$102(NetworkPlayerInfo var0, String var1);

    //ResourceLocation access$202(NetworkPlayerInfo var0, ResourceLocation var1);

    int func_178835_l();

    void func_178836_b(int var0);

    void func_178843_c(long var0);

    void func_178844_b(long var0);

    void func_178846_a(long var0);

    long func_178847_n();

    long func_178855_p();

    void func_178857_c(int var0);

    long func_178858_o();

    int func_178860_m();

    IChatComponent getDisplayName();

    //GameProfile getGameProfile();

    //WorldSettings$GameType getGameType();

    ResourceLocation getLocationCape();

    ResourceLocation getLocationSkin();

    ScorePlayerTeam getPlayerTeam();

    int getResponseTime();

    String getSkinType();

    boolean hasLocationSkin();

    void loadPlayerTextures();

    void setDisplayName(IChatComponent var0);

    //void setGameType(WorldSettings$GameType var0);

    void setResponseTime(int var0);

}
