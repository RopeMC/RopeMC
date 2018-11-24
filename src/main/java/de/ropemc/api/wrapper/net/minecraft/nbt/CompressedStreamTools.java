package de.ropemc.api.wrapper.net.minecraft.nbt;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.DataOutput;
import java.io.OutputStream;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.nbt.CompressedStreamTools")
public interface CompressedStreamTools {

    NBTBase func_152455_a(DataInput var0, int var1, NBTSizeTracker var2);

    NBTTagCompound read(DataInput var0, NBTSizeTracker var1);

    NBTTagCompound read(DataInputStream var0);

    NBTTagCompound read(File var0);

    NBTTagCompound readCompressed(InputStream var0);

    void safeWrite(NBTTagCompound var0, File var1);

    void write(NBTTagCompound var0, DataOutput var1);

    void write(NBTTagCompound var0, File var1);

    void writeCompressed(NBTTagCompound var0, OutputStream var1);

    void writeTag(NBTBase var0, DataOutput var1);

}
