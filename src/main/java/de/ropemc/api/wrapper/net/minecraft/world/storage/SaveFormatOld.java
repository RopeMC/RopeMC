package de.ropemc.api.wrapper.net.minecraft.world.storage;

import de.ropemc.api.wrapper.net.minecraft.util.IProgressUpdate;
import java.io.File;
import java.util.List;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.storage.SaveFormatOld")
public interface SaveFormatOld {

    boolean canLoadWorld(String var0);

    boolean convertMapFormat(String var0, IProgressUpdate var1);

    boolean deleteFiles(File[] var0);

    boolean deleteWorldDirectory(String var0);

    void flushCache();

    boolean func_154334_a(String var0);

    boolean func_154335_d(String var0);

    String getName();

    List getSaveList();

    ISaveHandler getSaveLoader(String var0, boolean var1);

    WorldInfo getWorldInfo(String var0);

    boolean isOldMapFormat(String var0);

    void renameWorld(String var0, String var1);

}
