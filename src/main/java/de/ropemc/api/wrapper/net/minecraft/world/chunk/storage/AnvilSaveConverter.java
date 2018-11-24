package de.ropemc.api.wrapper.net.minecraft.world.chunk.storage;

import java.io.File;
import java.util.Collection;
import de.ropemc.api.wrapper.net.minecraft.world.biome.WorldChunkManager;
import de.ropemc.api.wrapper.net.minecraft.util.IProgressUpdate;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.world.storage.ISaveHandler;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.chunk.storage.AnvilSaveConverter")
public interface AnvilSaveConverter {

    void addRegionFilesToCollection(File var0, Collection var1);

    void convertChunks(File var0, File var1, WorldChunkManager var2, int var3, int var4, IProgressUpdate var5);

    void convertFile(File var0, Iterable var1, WorldChunkManager var2, int var3, int var4, IProgressUpdate var5);

    boolean convertMapFormat(String var0, IProgressUpdate var1);

    void createFile(String var0);

    void flushCache();

    boolean func_154334_a(String var0);

    String getName();

    List getSaveList();

    ISaveHandler getSaveLoader(String var0, boolean var1);

    int getSaveVersion();

    boolean isOldMapFormat(String var0);

}
