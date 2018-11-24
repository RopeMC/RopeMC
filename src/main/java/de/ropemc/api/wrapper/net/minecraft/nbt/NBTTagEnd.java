package de.ropemc.api.wrapper.net.minecraft.nbt;

import java.io.DataInput;
import java.io.DataOutput;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.nbt.NBTTagEnd")
public interface NBTTagEnd {

    NBTBase copy();

    byte getId();

    void read(DataInput var0, int var1, NBTSizeTracker var2);

    void write(DataOutput var0);

}
