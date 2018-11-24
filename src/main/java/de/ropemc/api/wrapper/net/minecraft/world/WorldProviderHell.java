package de.ropemc.api.wrapper.net.minecraft.world;

import de.ropemc.api.wrapper.net.minecraft.world.chunk.IChunkProvider;
import de.ropemc.api.wrapper.net.minecraft.util.Vec3;
import de.ropemc.api.wrapper.net.minecraft.world.border.WorldBorder;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.WorldProviderHell")
public interface WorldProviderHell {

    float calculateCelestialAngle(long var0, float var1);

    boolean canCoordinateBeSpawn(int var0, int var1);

    boolean canRespawnHere();

    IChunkProvider createChunkGenerator();

    boolean doesXZShowFog(int var0, int var1);

    void generateLightBrightnessTable();

    String getDimensionName();

    Vec3 getFogColor(float var0, float var1);

    String getInternalNameSuffix();

    WorldBorder getWorldBorder();

    boolean isSurfaceWorld();

    void registerWorldChunkManager();

}
