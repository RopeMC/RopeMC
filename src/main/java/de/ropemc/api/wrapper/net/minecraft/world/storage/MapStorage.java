package de.ropemc.api.wrapper.net.minecraft.world.storage;

import de.ropemc.api.wrapper.net.minecraft.world.WorldSavedData;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.storage.MapStorage")
public interface MapStorage {

    int getUniqueDataId(String var0);

    WorldSavedData loadData(Class var0, String var1);

    void loadIdCounts();

    void saveAllData();

    void saveData(WorldSavedData var0);

    void setData(String var0, WorldSavedData var1);

}
