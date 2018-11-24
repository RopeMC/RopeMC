package de.ropemc.api.wrapper.net.minecraft.server.integrated;

import de.ropemc.api.wrapper.net.minecraft.crash.CrashReport;
import de.ropemc.api.wrapper.net.minecraft.profiler.PlayerUsageSnooper;
import de.ropemc.api.wrapper.net.minecraft.command.ServerCommandManager;
import java.io.File;
import de.ropemc.api.wrapper.net.minecraft.world.EnumDifficulty;
//import de.ropemc.api.wrapper.net.minecraft.world.WorldSettings$GameType;
import de.ropemc.api.wrapper.net.minecraft.world.WorldType;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.server.integrated.IntegratedServer")
public interface IntegratedServer {

    CrashReport addServerInfoToCrashReport(CrashReport var0);

    void addServerStatsToSnooper(PlayerUsageSnooper var0);

    boolean canStructuresSpawn();

    ServerCommandManager createNewCommandManager();

    void finalTick(CrashReport var0);

    File getDataDirectory();

    EnumDifficulty getDifficulty();

    //WorldSettings$GameType getGameType();

    int getOpPermissionLevel();

    boolean getPublic();

    void initiateShutdown();

    boolean isCommandBlockEnabled();

    boolean isDedicatedServer();

    boolean isHardcore();

    boolean isSnooperEnabled();

    void loadAllWorlds(String var0, String var1, long var2, WorldType var3, String var4);

    void setDifficultyForAllWorlds(EnumDifficulty var0);

    //void setGameType(WorldSettings$GameType var0);

    void setStaticInstance();

    //String shareToLAN(WorldSettings$GameType var0, boolean var1);

    boolean shouldBroadcastConsoleToOps();

    boolean shouldBroadcastRconToOps();

    boolean shouldUseNativeTransport();

    boolean startServer();

    void stopServer();

    void tick();

}
