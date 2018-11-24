package de.ropemc.api.wrapper.net.minecraft.util;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.IntHashMap")
public interface IntHashMap {

    //int access$000(int var0);

    void addKey(int var0, Object var1);

    void clearMap();

    int computeHash(int var0);

    boolean containsItem(int var0);

    //void copyTo(IntHashMap$Entry[] var0);

    int getSlotIndex(int var0, int var1);

    void grow(int var0);

    void insert(int var0, int var1, Object var2, int var3);

    Object lookup(int var0);

    //IntHashMap$Entry lookupEntry(int var0);

    //IntHashMap$Entry removeEntry(int var0);

    Object removeObject(int var0);

}
