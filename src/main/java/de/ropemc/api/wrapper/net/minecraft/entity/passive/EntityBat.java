package de.ropemc.api.wrapper.net.minecraft.entity.passive;

import de.ropemc.api.wrapper.net.minecraft.util.DamageSource;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import java.util.Calendar;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.passive.EntityBat")
public interface EntityBat {

    void applyEntityAttributes();

    boolean attackEntityFrom(DamageSource var0, float var1);

    boolean canBePushed();

    boolean canTriggerWalking();

    void collideWithEntity(Entity var0);

    void collideWithNearbyEntities();

    boolean doesEntityNotTriggerPressurePlate();

    void entityInit();

    void fall(float var0, float var1);

    boolean getCanSpawnHere();

    String getDeathSound();

    float getEyeHeight();

    String getHurtSound();

    boolean getIsBatHanging();

    String getLivingSound();

    float getSoundPitch();

    float getSoundVolume();

    boolean isDateAroundHalloween(Calendar var0);

    void onUpdate();

    void readEntityFromNBT(NBTTagCompound var0);

    void setIsBatHanging(boolean var0);

    void updateAITasks();

    void updateFallState(double var0, boolean var1, Block var2, BlockPos var3);

    void writeEntityToNBT(NBTTagCompound var0);

}
