package de.ropemc.api.wrapper.net.minecraft.entity.monster;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.util.DamageSource;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.world.DifficultyInstance;
import de.ropemc.api.wrapper.net.minecraft.entity.IEntityLivingData;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.monster.EntityPigZombie")
public interface EntityPigZombie {

    //void access$000(EntityPigZombie var0, Entity var1);

    void addRandomDrop();

    void applyEntityAI();

    void applyEntityAttributes();

    boolean attackEntityFrom(DamageSource var0, float var1);

    void becomeAngryAt(Entity var0);

    void dropFewItems(boolean var0, int var1);

    boolean getCanSpawnHere();

    String getDeathSound();

    String getHurtSound();

    String getLivingSound();

    boolean interact(EntityPlayer var0);

    boolean isAngry();

    boolean isNotColliding();

    IEntityLivingData onInitialSpawn(DifficultyInstance var0, IEntityLivingData var1);

    void onUpdate();

    void readEntityFromNBT(NBTTagCompound var0);

    void setEquipmentBasedOnDifficulty(DifficultyInstance var0);

    void setRevengeTarget(EntityLivingBase var0);

    void updateAITasks();

    void writeEntityToNBT(NBTTagCompound var0);

}
