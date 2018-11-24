package de.ropemc.api.wrapper.net.minecraft.world;

import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.GameRules")
public interface GameRules {

    //void addGameRule(String var0, String var1, GameRules$ValueType var2);

    //boolean areSameType(String var0, GameRules$ValueType var1);

    boolean getBoolean(String var0);

    int getInt(String var0);

    String[] getRules();

    String getString(String var0);

    boolean hasRule(String var0);

    void readFromNBT(NBTTagCompound var0);

    void setOrCreateGameRule(String var0, String var1);

    NBTTagCompound writeToNBT();

}
