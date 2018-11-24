package de.ropemc.api.wrapper.net.minecraft.entity;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import java.util.List;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.EntityList")
public interface EntityList {

    void addMapping(Class var0, String var1, int var2);

    void addMapping(Class var0, String var1, int var2, int var3, int var4);

    Entity createEntityByID(int var0, World var1);

    Entity createEntityByName(String var0, World var1);

    Entity createEntityFromNBT(NBTTagCompound var0, World var1);

    void func_151514_a();

    Class getClassFromID(int var0);

    int getEntityID(Entity var0);

    List getEntityNameList();

    String getEntityString(Entity var0);

    int getIDFromString(String var0);

    String getStringFromID(int var0);

    boolean isStringEntityName(Entity var0, String var1);

    boolean isStringValidEntityName(String var0);

}
