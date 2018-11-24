package de.ropemc.api.wrapper.net.minecraft.world.gen.layer;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.gen.layer.GenLayerZoom")
public interface GenLayerZoom {

    int[] getInts(int var0, int var1, int var2, int var3);

    GenLayer magnify(long var0, GenLayer var1, int var2);

}
