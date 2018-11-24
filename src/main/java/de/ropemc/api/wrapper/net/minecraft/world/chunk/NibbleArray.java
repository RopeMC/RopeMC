package de.ropemc.api.wrapper.net.minecraft.world.chunk;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.chunk.NibbleArray")
public interface NibbleArray {

    int get(int var0, int var1, int var2);

    int getCoordinateIndex(int var0, int var1, int var2);

    byte[] getData();

    int getFromIndex(int var0);

    int getNibbleIndex(int var0);

    boolean isLowerNibble(int var0);

    void set(int var0, int var1, int var2, int var3);

    void setIndex(int var0, int var1);

}
