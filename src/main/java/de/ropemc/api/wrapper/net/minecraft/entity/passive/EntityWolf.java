package de.ropemc.api.wrapper.net.minecraft.entity.passive;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.util.DamageSource;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityAgeable;
import de.ropemc.api.wrapper.net.minecraft.item.EnumDyeColor;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.passive.EntityWolf")
public interface EntityWolf {

    boolean allowLeashing();

    void applyEntityAttributes();

    boolean attackEntityAsMob(Entity var0);

    boolean attackEntityFrom(DamageSource var0, float var1);

    boolean canDespawn();

    boolean canMateWith(EntityAnimal var0);

    EntityAgeable createChild(EntityAgeable var0);

    void entityInit();

    EnumDyeColor getCollarColor();

    String getDeathSound();

    Item getDropItem();

    float getEyeHeight();

    String getHurtSound();

    float getInterestedAngle(float var0);

    String getLivingSound();

    int getMaxSpawnedInChunk();

    float getShadingWhileWet(float var0);

    float getShakeAngle(float var0, float var1);

    float getSoundVolume();

    float getTailRotation();

    int getVerticalFaceSpeed();

    void handleStatusUpdate(byte var0);

    boolean interact(EntityPlayer var0);

    boolean isAngry();

    boolean isBegging();

    boolean isBreedingItem(ItemStack var0);

    boolean isWolfWet();

    void onLivingUpdate();

    void onUpdate();

    void playStepSound(BlockPos var0, Block var1);

    void readEntityFromNBT(NBTTagCompound var0);

    void setAngry(boolean var0);

    void setAttackTarget(EntityLivingBase var0);

    void setBegging(boolean var0);

    void setCollarColor(EnumDyeColor var0);

    void setTamed(boolean var0);

    boolean shouldAttackEntity(EntityLivingBase var0, EntityLivingBase var1);

    void updateAITasks();

    void writeEntityToNBT(NBTTagCompound var0);

}
