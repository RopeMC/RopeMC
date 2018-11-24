package de.ropemc.api.wrapper.net.minecraft.world.chunk.storage;

import java.io.File;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.chunk.storage.RegionFileCache")
public interface RegionFileCache {

    void clearRegionFileReferences();

    RegionFile createOrLoadRegionFile(File var0, int var1, int var2);

    DataInputStream getChunkInputStream(File var0, int var1, int var2);

    DataOutputStream getChunkOutputStream(File var0, int var1, int var2);

}
