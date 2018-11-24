package de.ropemc.api.wrapper.net.minecraft.world.gen.layer;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.gen.layer.GenLayerRiverMix")
public interface GenLayerRiverMix {

    int[] getInts(int var0, int var1, int var2, int var3);

    void initWorldGenSeed(long var0);

}
