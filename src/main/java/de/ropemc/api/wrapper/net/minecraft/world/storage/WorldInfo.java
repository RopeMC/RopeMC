package de.ropemc.api.wrapper.net.minecraft.world.storage;

import de.ropemc.api.wrapper.net.minecraft.world.WorldType;
//import de.ropemc.api.wrapper.net.minecraft.world.WorldSettings$GameType;
import de.ropemc.api.wrapper.net.minecraft.crash.CrashReportCategory;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.net.minecraft.world.EnumDifficulty;
import de.ropemc.api.wrapper.net.minecraft.world.GameRules;
import de.ropemc.api.wrapper.net.minecraft.world.WorldSettings;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.storage.WorldInfo")
public interface WorldInfo {

    //WorldType access$000(WorldInfo var0);

    //boolean access$100(WorldInfo var0);

    //int access$1000(WorldInfo var0);

    //boolean access$1100(WorldInfo var0);

    //int access$1200(WorldInfo var0);

    //boolean access$1300(WorldInfo var0);

    //WorldSettings$GameType access$1400(WorldInfo var0);

    //boolean access$1500(WorldInfo var0);

    //boolean access$1600(WorldInfo var0);

    //String access$200(WorldInfo var0);

    //int access$300(WorldInfo var0);

    //int access$400(WorldInfo var0);

    //int access$500(WorldInfo var0);

    //long access$600(WorldInfo var0);

    //long access$700(WorldInfo var0);

    //int access$800(WorldInfo var0);

    //int access$900(WorldInfo var0);

    void addToCrashReport(CrashReportCategory var0);

    boolean areCommandsAllowed();

    NBTTagCompound cloneNBTCompound(NBTTagCompound var0);

    double getBorderCenterX();

    void getBorderCenterX(double var0);

    double getBorderCenterZ();

    void getBorderCenterZ(double var0);

    double getBorderDamagePerBlock();

    double getBorderLerpTarget();

    long getBorderLerpTime();

    double getBorderSafeZone();

    double getBorderSize();

    int getBorderWarningDistance();

    int getBorderWarningTime();

    int getCleanWeatherTime();

    EnumDifficulty getDifficulty();

    GameRules getGameRulesInstance();

    //WorldSettings$GameType getGameType();

    String getGeneratorOptions();

    long getLastTimePlayed();

    NBTTagCompound getNBTTagCompound();

    NBTTagCompound getPlayerNBTTagCompound();

    int getRainTime();

    int getSaveVersion();

    long getSeed();

    long getSizeOnDisk();

    int getSpawnX();

    int getSpawnY();

    int getSpawnZ();

    WorldType getTerrainType();

    int getThunderTime();

    String getWorldName();

    long getWorldTime();

    long getWorldTotalTime();

    boolean isDifficultyLocked();

    boolean isHardcoreModeEnabled();

    boolean isInitialized();

    boolean isMapFeaturesEnabled();

    boolean isRaining();

    boolean isThundering();

    void populateFromWorldSettings(WorldSettings var0);

    void setAllowCommands(boolean var0);

    void setBorderDamagePerBlock(double var0);

    void setBorderLerpTarget(double var0);

    void setBorderLerpTime(long var0);

    void setBorderSafeZone(double var0);

    void setBorderSize(double var0);

    void setBorderWarningDistance(int var0);

    void setBorderWarningTime(int var0);

    void setCleanWeatherTime(int var0);

    void setDifficulty(EnumDifficulty var0);

    void setDifficultyLocked(boolean var0);

    //void setGameType(WorldSettings$GameType var0);

    void setHardcore(boolean var0);

    void setMapFeaturesEnabled(boolean var0);

    void setRainTime(int var0);

    void setRaining(boolean var0);

    void setSaveVersion(int var0);

    void setServerInitialized(boolean var0);

    void setSpawn(BlockPos var0);

    void setSpawnX(int var0);

    void setSpawnY(int var0);

    void setSpawnZ(int var0);

    void setTerrainType(WorldType var0);

    void setThunderTime(int var0);

    void setThundering(boolean var0);

    void setWorldName(String var0);

    void setWorldTime(long var0);

    void setWorldTotalTime(long var0);

    void updateTagCompound(NBTTagCompound var0, NBTTagCompound var1);

}
