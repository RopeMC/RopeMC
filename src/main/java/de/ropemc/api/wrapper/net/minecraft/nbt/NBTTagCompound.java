package de.ropemc.api.wrapper.net.minecraft.nbt;

import java.util.Map;
import de.ropemc.api.wrapper.net.minecraft.crash.CrashReport;
import java.util.Set;
import java.io.DataInput;
import java.io.DataOutput;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.nbt.NBTTagCompound")
public interface NBTTagCompound {

    //Map access$000(NBTTagCompound var0);

    NBTBase copy();

    CrashReport createCrashReport(String var0, int var1, ClassCastException var2);

    boolean getBoolean(String var0);

    byte getByte(String var0);

    byte[] getByteArray(String var0);

    NBTTagCompound getCompoundTag(String var0);

    double getDouble(String var0);

    float getFloat(String var0);

    byte getId();

    int[] getIntArray(String var0);

    int getInteger(String var0);

    Set getKeySet();

    long getLong(String var0);

    short getShort(String var0);

    String getString(String var0);

    NBTBase getTag(String var0);

    byte getTagId(String var0);

    NBTTagList getTagList(String var0, int var1);

    boolean hasKey(String var0);

    boolean hasKey(String var0, int var1);

    boolean hasNoTags();

    void merge(NBTTagCompound var0);

    void read(DataInput var0, int var1, NBTSizeTracker var2);

    String readKey(DataInput var0, NBTSizeTracker var1);

    NBTBase readNBT(byte var0, String var1, DataInput var2, int var3, NBTSizeTracker var4);

    byte readType(DataInput var0, NBTSizeTracker var1);

    void removeTag(String var0);

    void setBoolean(String var0, boolean var1);

    void setByte(String var0, byte var1);

    void setByteArray(String var0, byte[] var1);

    void setDouble(String var0, double var1);

    void setFloat(String var0, float var1);

    void setIntArray(String var0, int[] var1);

    void setInteger(String var0, int var1);

    void setLong(String var0, long var1);

    void setShort(String var0, short var1);

    void setString(String var0, String var1);

    void setTag(String var0, NBTBase var1);

    void write(DataOutput var0);

    void writeEntry(String var0, NBTBase var1, DataOutput var2);

}
