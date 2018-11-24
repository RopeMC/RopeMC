package de.ropemc.api.wrapper.net.minecraft.world.chunk.storage;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.chunk.storage.NibbleArrayReader")
public interface NibbleArrayReader {

    int get(int var0, int var1, int var2);

}
