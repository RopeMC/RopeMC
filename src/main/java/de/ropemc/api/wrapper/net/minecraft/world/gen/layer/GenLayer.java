package de.ropemc.api.wrapper.net.minecraft.world.gen.layer;

import de.ropemc.api.wrapper.net.minecraft.world.WorldType;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.gen.layer.GenLayer")
public interface GenLayer {

    boolean biomesEqualOrMesaPlateau(int var0, int var1);

    int[] getInts(int var0, int var1, int var2, int var3);

    void initChunkSeed(long var0, long var1);

    void initWorldGenSeed(long var0);

    GenLayer[] initializeAllBiomeGenerators(long var0, WorldType var1, String var2);

    boolean isBiomeOceanic(int var0);

    int nextInt(int var0);

    int selectModeOrRandom(int var0, int var1, int var2, int var3);

    int selectRandom(int[] var0);

}
