package de.ropemc.api.wrapper.net.minecraft.tileentity;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.tileentity.MobSpawnerBaseLogic")
public interface MobSpawnerBaseLogic {

    Entity func_180612_a(World var0);

    void func_98267_a(int var0);

    String getEntityNameToSpawn();

    double getMobRotation();

    double getPrevMobRotation();

    //MobSpawnerBaseLogic$WeightedRandomMinecart getRandomEntity();

    BlockPos getSpawnerPosition();

    World getSpawnerWorld();

    boolean isActivated();

    void readFromNBT(NBTTagCompound var0);

    void resetTimer();

    boolean setDelayToMin(int var0);

    void setEntityName(String var0);

    //void setRandomEntity(MobSpawnerBaseLogic$WeightedRandomMinecart var0);

    Entity spawnNewEntity(Entity var0, boolean var1);

    void updateSpawner();

    void writeToNBT(NBTTagCompound var0);

}
