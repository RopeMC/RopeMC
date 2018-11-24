package de.ropemc.api.wrapper.net.minecraft.nbt;

import java.io.DataInput;
import java.io.DataOutput;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.nbt.NBTTagDouble")
public interface NBTTagDouble {

    NBTBase copy();

    byte getByte();

    double getDouble();

    float getFloat();

    byte getId();

    int getInt();

    long getLong();

    short getShort();

    void read(DataInput var0, int var1, NBTSizeTracker var2);

    void write(DataOutput var0);

}
