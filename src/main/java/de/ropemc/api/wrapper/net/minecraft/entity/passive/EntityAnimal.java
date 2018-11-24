package de.ropemc.api.wrapper.net.minecraft.entity.passive;

import de.ropemc.api.wrapper.net.minecraft.util.DamageSource;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.passive.EntityAnimal")
public interface EntityAnimal {

    boolean attackEntityFrom(DamageSource var0, float var1);

    boolean canDespawn();

    boolean canMateWith(EntityAnimal var0);

    void consumeItemFromStack(EntityPlayer var0, ItemStack var1);

    float getBlockPathWeight(BlockPos var0);

    boolean getCanSpawnHere();

    int getExperiencePoints(EntityPlayer var0);

    EntityPlayer getPlayerInLove();

    int getTalkInterval();

    void handleStatusUpdate(byte var0);

    boolean interact(EntityPlayer var0);

    boolean isBreedingItem(ItemStack var0);

    boolean isInLove();

    void onLivingUpdate();

    void readEntityFromNBT(NBTTagCompound var0);

    void resetInLove();

    void setInLove(EntityPlayer var0);

    void updateAITasks();

    void writeEntityToNBT(NBTTagCompound var0);

}
