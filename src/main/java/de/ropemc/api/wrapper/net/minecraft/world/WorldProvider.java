package de.ropemc.api.wrapper.net.minecraft.world;

import de.ropemc.api.wrapper.net.minecraft.world.chunk.IChunkProvider;
import de.ropemc.api.wrapper.net.minecraft.util.Vec3;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.world.border.WorldBorder;
import de.ropemc.api.wrapper.net.minecraft.world.biome.WorldChunkManager;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.WorldProvider")
public interface WorldProvider {

    float[] calcSunriseSunsetColors(float var0, float var1);

    float calculateCelestialAngle(long var0, float var1);

    boolean canCoordinateBeSpawn(int var0, int var1);

    boolean canRespawnHere();

    IChunkProvider createChunkGenerator();

    boolean doesWaterVaporize();

    boolean doesXZShowFog(int var0, int var1);

    void generateLightBrightnessTable();

    int getAverageGroundLevel();

    float getCloudHeight();

    int getDimensionId();

    String getDimensionName();

    Vec3 getFogColor(float var0, float var1);

    boolean getHasNoSky();

    String getInternalNameSuffix();

    float[] getLightBrightnessTable();

    int getMoonPhase(long var0);

    WorldProvider getProviderForDimension(int var0);

    BlockPos getSpawnCoordinate();

    double getVoidFogYFactor();

    WorldBorder getWorldBorder();

    WorldChunkManager getWorldChunkManager();

    boolean isSkyColored();

    boolean isSurfaceWorld();

    void registerWorld(World var0);

    void registerWorldChunkManager();

}
