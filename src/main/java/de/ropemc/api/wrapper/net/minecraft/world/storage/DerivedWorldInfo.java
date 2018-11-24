package de.ropemc.api.wrapper.net.minecraft.world.storage;

import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.net.minecraft.world.EnumDifficulty;
import de.ropemc.api.wrapper.net.minecraft.world.GameRules;
//import de.ropemc.api.wrapper.net.minecraft.world.WorldSettings$GameType;
import de.ropemc.api.wrapper.net.minecraft.world.WorldType;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.storage.DerivedWorldInfo")
public interface DerivedWorldInfo {

    boolean areCommandsAllowed();

    NBTTagCompound cloneNBTCompound(NBTTagCompound var0);

    EnumDifficulty getDifficulty();

    GameRules getGameRulesInstance();

    //WorldSettings$GameType getGameType();

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

    void setAllowCommands(boolean var0);

    void setDifficulty(EnumDifficulty var0);

    void setDifficultyLocked(boolean var0);

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

}
