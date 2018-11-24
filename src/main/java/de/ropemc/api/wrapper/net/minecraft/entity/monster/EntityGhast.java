package de.ropemc.api.wrapper.net.minecraft.entity.monster;

import de.ropemc.api.wrapper.net.minecraft.util.DamageSource;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.monster.EntityGhast")
public interface EntityGhast {

    void applyEntityAttributes();

    boolean attackEntityFrom(DamageSource var0, float var1);

    void dropFewItems(boolean var0, int var1);

    void entityInit();

    boolean getCanSpawnHere();

    String getDeathSound();

    Item getDropItem();

    float getEyeHeight();

    int getFireballStrength();

    String getHurtSound();

    String getLivingSound();

    int getMaxSpawnedInChunk();

    float getSoundVolume();

    boolean isAttacking();

    void onUpdate();

    void readEntityFromNBT(NBTTagCompound var0);

    void setAttacking(boolean var0);

    void writeEntityToNBT(NBTTagCompound var0);

}
