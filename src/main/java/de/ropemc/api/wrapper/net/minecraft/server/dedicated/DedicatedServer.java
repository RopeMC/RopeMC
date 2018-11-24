package de.ropemc.api.wrapper.net.minecraft.server.dedicated;

//import org.apache.logging.log4j.Logger;
import de.ropemc.api.wrapper.net.minecraft.command.ICommandSender;
import de.ropemc.api.wrapper.net.minecraft.crash.CrashReport;
import de.ropemc.api.wrapper.net.minecraft.profiler.PlayerUsageSnooper;
import de.ropemc.api.wrapper.net.minecraft.world.EnumDifficulty;
//import de.ropemc.api.wrapper.net.minecraft.world.WorldSettings$GameType;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.server.dedicated.DedicatedServer")
public interface DedicatedServer {

    //Logger access$000();

    void addPendingCommand(String var0, ICommandSender var1);

    CrashReport addServerInfoToCrashReport(CrashReport var0);

    void addServerStatsToSnooper(PlayerUsageSnooper var0);

    boolean allowSpawnMonsters();

    boolean canStructuresSpawn();

    boolean convertFiles();

    void executePendingCommands();

    void finalTick(CrashReport var0);

    boolean getAllowNether();

    boolean getBooleanProperty(String var0, boolean var1);

    DedicatedPlayerList getConfigurationManager();

    EnumDifficulty getDifficulty();

    //WorldSettings$GameType getGameType();

    boolean getGuiEnabled();

    int getIntProperty(String var0, int var1);

    long getMaxTickTime();

    int getMaxWorldSize();

    int getNetworkCompressionTreshold();

    int getOpPermissionLevel();

    String getPlugins();

    String getSettingsFilename();

    int getSpawnProtectionSize();

    String getStringProperty(String var0, String var1);

    String handleRConCommand(String var0);

    boolean isAnnouncingPlayerAchievements();

    boolean isBlockProtected(World var0, BlockPos var1, EntityPlayer var2);

    boolean isCommandBlockEnabled();

    boolean isDedicatedServer();

    boolean isHardcore();

    boolean isSnooperEnabled();

    void saveProperties();

    //void setGameType(WorldSettings$GameType var0);

    void setGuiEnabled();

    void setPlayerIdleTimeout(int var0);

    void setProperty(String var0, Object var1);

    //String shareToLAN(WorldSettings$GameType var0, boolean var1);

    boolean shouldBroadcastConsoleToOps();

    boolean shouldBroadcastRconToOps();

    boolean shouldUseNativeTransport();

    void sleepFiveSeconds();

    boolean startServer();

    void systemExitNow();

    void updateTimeLightAndEntities();

}
