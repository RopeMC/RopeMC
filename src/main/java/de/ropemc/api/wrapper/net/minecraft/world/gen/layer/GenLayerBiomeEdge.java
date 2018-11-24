package de.ropemc.api.wrapper.net.minecraft.world.gen.layer;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.gen.layer.GenLayerBiomeEdge")
public interface GenLayerBiomeEdge {

    boolean canBiomesBeNeighbors(int var0, int var1);

    int[] getInts(int var0, int var1, int var2, int var3);

    boolean replaceBiomeEdge(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

    boolean replaceBiomeEdgeIfNecessary(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

}
