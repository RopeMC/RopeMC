package de.ropemc.api.wrapper.net.minecraft.entity.passive;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.util.DamageSource;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityAgeable;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.world.DifficultyInstance;
import de.ropemc.api.wrapper.net.minecraft.entity.IEntityLivingData;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.passive.EntityOcelot")
public interface EntityOcelot {

    void applyEntityAttributes();

    boolean attackEntityAsMob(Entity var0);

    boolean attackEntityFrom(DamageSource var0, float var1);

    boolean canDespawn();

    boolean canMateWith(EntityAnimal var0);

    EntityAgeable createChild(EntityAgeable var0);

    void dropFewItems(boolean var0, int var1);

    void entityInit();

    void fall(float var0, float var1);

    boolean getCanSpawnHere();

    String getDeathSound();

    Item getDropItem();

    String getHurtSound();

    String getLivingSound();

    String getName();

    float getSoundVolume();

    int getTameSkin();

    boolean interact(EntityPlayer var0);

    boolean isBreedingItem(ItemStack var0);

    boolean isNotColliding();

    IEntityLivingData onInitialSpawn(DifficultyInstance var0, IEntityLivingData var1);

    void readEntityFromNBT(NBTTagCompound var0);

    void setTameSkin(int var0);

    void setTamed(boolean var0);

    void setupTamedAI();

    void updateAITasks();

    void writeEntityToNBT(NBTTagCompound var0);

}
