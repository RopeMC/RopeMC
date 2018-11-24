package de.ropemc.api.wrapper.net.minecraft.world.storage;

import de.ropemc.api.wrapper.net.minecraft.world.WorldSavedData;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.storage.SaveDataMemoryStorage")
public interface SaveDataMemoryStorage {

    int getUniqueDataId(String var0);

    WorldSavedData loadData(Class var0, String var1);

    void saveAllData();

    void setData(String var0, WorldSavedData var1);

}
