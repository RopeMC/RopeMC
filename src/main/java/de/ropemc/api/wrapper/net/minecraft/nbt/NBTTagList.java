package de.ropemc.api.wrapper.net.minecraft.nbt;

import java.io.DataInput;
import java.io.DataOutput;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.nbt.NBTTagList")
public interface NBTTagList {

    void appendTag(NBTBase var0);

    NBTBase copy();

    NBTBase get(int var0);

    NBTTagCompound getCompoundTagAt(int var0);

    double getDoubleAt(int var0);

    float getFloatAt(int var0);

    byte getId();

    int[] getIntArrayAt(int var0);

    String getStringTagAt(int var0);

    int getTagType();

    boolean hasNoTags();

    void read(DataInput var0, int var1, NBTSizeTracker var2);

    NBTBase removeTag(int var0);

    void set(int var0, NBTBase var1);

    int tagCount();

    void write(DataOutput var0);

}
