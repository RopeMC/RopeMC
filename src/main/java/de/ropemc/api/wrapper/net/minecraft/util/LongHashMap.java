package de.ropemc.api.wrapper.net.minecraft.util;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.LongHashMap")
public interface LongHashMap {

    //int access$000(long var0);

    void add(long var0, Object var1);

    boolean containsItem(long var0);

    //void copyHashTableTo(LongHashMap$Entry[] var0);

    void createKey(int var0, long var1, Object var2, int var3);

    //LongHashMap$Entry getEntry(long var0);

    int getHashIndex(int var0, int var1);

    int getHashedKey(long var0);

    int getNumHashElements();

    Object getValueByKey(long var0);

    int hash(int var0);

    Object remove(long var0);

    //LongHashMap$Entry removeKey(long var0);

    void resizeTable(int var0);

}
