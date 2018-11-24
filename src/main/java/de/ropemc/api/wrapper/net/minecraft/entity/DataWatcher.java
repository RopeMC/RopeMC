package de.ropemc.api.wrapper.net.minecraft.entity;

import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.util.Rotations;
import de.ropemc.api.wrapper.net.minecraft.network.PacketBuffer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.DataWatcher")
public interface DataWatcher {

    void addObject(int var0, Object var1);

    void addObjectByDataType(int var0, int var1);

    void func_111144_e();

    List getAllWatched();

    List getChanged();

    boolean getIsBlank();

    byte getWatchableObjectByte(int var0);

    float getWatchableObjectFloat(int var0);

    int getWatchableObjectInt(int var0);

    ItemStack getWatchableObjectItemStack(int var0);

    Rotations getWatchableObjectRotations(int var0);

    short getWatchableObjectShort(int var0);

    String getWatchableObjectString(int var0);

    //DataWatcher$WatchableObject getWatchedObject(int var0);

    boolean hasObjectChanged();

    List readWatchedListFromPacketBuffer(PacketBuffer var0);

    void setObjectWatched(int var0);

    void updateObject(int var0, Object var1);

    void updateWatchedObjectsFromList(List var0);

    void writeTo(PacketBuffer var0);

    //void writeWatchableObjectToPacketBuffer(PacketBuffer var0, DataWatcher$WatchableObject var1);

    void writeWatchedListToPacketBuffer(List var0, PacketBuffer var1);

}
