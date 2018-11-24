package de.ropemc.api.wrapper.net.minecraft.world.chunk.storage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.chunk.storage.RegionFile")
public interface RegionFile {

    void close();

    DataInputStream getChunkDataInputStream(int var0, int var1);

    DataOutputStream getChunkDataOutputStream(int var0, int var1);

    int getOffset(int var0, int var1);

    boolean isChunkSaved(int var0, int var1);

    boolean outOfBounds(int var0, int var1);

    void setChunkTimestamp(int var0, int var1, int var2);

    void setOffset(int var0, int var1, int var2);

    void write(int var0, int var1, byte[] var2, int var3);

    void write(int var0, byte[] var1, int var2);

}
