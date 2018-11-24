package de.ropemc.api.wrapper.net.minecraft.entity.monster;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.entity.EnumCreatureAttribute;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.net.minecraft.util.DamageSource;
import de.ropemc.api.wrapper.net.minecraft.world.DifficultyInstance;
import de.ropemc.api.wrapper.net.minecraft.entity.IEntityLivingData;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.monster.EntitySkeleton")
public interface EntitySkeleton {

    void addRandomDrop();

    void applyEntityAttributes();

    boolean attackEntityAsMob(Entity var0);

    void attackEntityWithRangedAttack(EntityLivingBase var0, float var1);

    void dropFewItems(boolean var0, int var1);

    void entityInit();

    EnumCreatureAttribute getCreatureAttribute();

    String getDeathSound();

    Item getDropItem();

    float getEyeHeight();

    String getHurtSound();

    String getLivingSound();

    int getSkeletonType();

    double getYOffset();

    void onDeath(DamageSource var0);

    IEntityLivingData onInitialSpawn(DifficultyInstance var0, IEntityLivingData var1);

    void onLivingUpdate();

    void playStepSound(BlockPos var0, Block var1);

    void readEntityFromNBT(NBTTagCompound var0);

    void setCombatTask();

    void setCurrentItemOrArmor(int var0, ItemStack var1);

    void setEquipmentBasedOnDifficulty(DifficultyInstance var0);

    void setSkeletonType(int var0);

    void updateRidden();

    void writeEntityToNBT(NBTTagCompound var0);

}
