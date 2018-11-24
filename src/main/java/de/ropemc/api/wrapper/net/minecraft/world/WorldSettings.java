package de.ropemc.api.wrapper.net.minecraft.world;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.WorldSettings")
public interface WorldSettings {

    boolean areCommandsAllowed();

    WorldSettings enableBonusChest();

    WorldSettings enableCommands();

    //WorldSettings$GameType getGameType();

    //WorldSettings$GameType getGameTypeById(int var0);

    boolean getHardcoreEnabled();

    long getSeed();

    WorldType getTerrainType();

    String getWorldName();

    boolean isBonusChestEnabled();

    boolean isMapFeaturesEnabled();

    WorldSettings setWorldName(String var0);

}
