package de.ropemc.api.wrapper.net.minecraft.entity.monster;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.net.minecraft.util.EnumParticleTypes;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.world.DifficultyInstance;
import de.ropemc.api.wrapper.net.minecraft.entity.IEntityLivingData;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.monster.EntitySlime")
public interface EntitySlime {

    void alterSquishAmount();

    void applyEntityCollision(Entity var0);

    boolean canDamagePlayer();

    EntitySlime createInstance();

    void entityInit();

    void func_175451_e(EntityLivingBase var0);

    int getAttackStrength();

    boolean getCanSpawnHere();

    String getDeathSound();

    Item getDropItem();

    float getEyeHeight();

    String getHurtSound();

    int getJumpDelay();

    String getJumpSound();

    EnumParticleTypes getParticleType();

    int getSlimeSize();

    float getSoundVolume();

    int getVerticalFaceSpeed();

    void jump();

    boolean makesSoundOnJump();

    boolean makesSoundOnLand();

    void onCollideWithPlayer(EntityPlayer var0);

    void onDataWatcherUpdate(int var0);

    IEntityLivingData onInitialSpawn(DifficultyInstance var0, IEntityLivingData var1);

    void onUpdate();

    void readEntityFromNBT(NBTTagCompound var0);

    void setDead();

    void setSlimeSize(int var0);

    void writeEntityToNBT(NBTTagCompound var0);

}
