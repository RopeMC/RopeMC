package de.ropemc.api.wrapper.net.minecraft.world.gen.layer;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.gen.layer.GenLayerEdge")
public interface GenLayerEdge {

    int[] getInts(int var0, int var1, int var2, int var3);

    int[] getIntsCoolWarm(int var0, int var1, int var2, int var3);

    int[] getIntsHeatIce(int var0, int var1, int var2, int var3);

    int[] getIntsSpecial(int var0, int var1, int var2, int var3);

}
