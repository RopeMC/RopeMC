package de.ropemc.api.wrapper.net.minecraft.entity.passive;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.util.DamageSource;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityAgeable;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.net.minecraft.world.DifficultyInstance;
import de.ropemc.api.wrapper.net.minecraft.entity.IEntityLivingData;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.passive.EntityRabbit")
public interface EntityRabbit {

    //boolean access$000(EntityRabbit var0);

    void addRandomDrop();

    void applyEntityAttributes();

    boolean attackEntityAsMob(Entity var0);

    boolean attackEntityFrom(DamageSource var0, float var1);

    void calculateRotationYaw(double var0, double var1);

    EntityAgeable createChild(EntityAgeable var0);

    void createEatingParticles();

    //void doMovementAction(EntityRabbit$EnumMoveType var0);

    void dropFewItems(boolean var0, int var1);

    void entityInit();

    void func_175517_cu();

    void func_175518_cr();

    void func_175520_cs();

    float func_175521_o(float var0);

    boolean func_175523_cj();

    String getDeathSound();

    String getHurtSound();

    float getJumpUpwardsMotion();

    String getJumpingSound();

    String getLivingSound();

    int getMoveTypeDuration();

    int getRabbitType();

    int getTotalArmorValue();

    void handleStatusUpdate(byte var0);

    boolean isBreedingItem(ItemStack var0);

    boolean isCarrotEaten();

    boolean isRabbitBreedingItem(Item var0);

    IEntityLivingData onInitialSpawn(DifficultyInstance var0, IEntityLivingData var1);

    void onLivingUpdate();

    void readEntityFromNBT(NBTTagCompound var0);

    //void setJumping(boolean var0, EntityRabbit$EnumMoveType var1);

    //void setMoveType(EntityRabbit$EnumMoveType var0);

    void setMovementSpeed(double var0);

    void setRabbitType(int var0);

    void spawnRunningParticles();

    void updateAITasks();

    void updateMoveTypeDuration();

    void writeEntityToNBT(NBTTagCompound var0);

}
