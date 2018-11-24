package de.ropemc.api.wrapper.net.minecraft.entity.passive;

import de.ropemc.api.wrapper.net.minecraft.entity.EntityAgeable;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.passive.EntityChicken")
public interface EntityChicken {

    void applyEntityAttributes();

    boolean canDespawn();

    EntityAgeable createChild(EntityAgeable var0);

    void dropFewItems(boolean var0, int var1);

    void fall(float var0, float var1);

    String getDeathSound();

    Item getDropItem();

    int getExperiencePoints(EntityPlayer var0);

    float getEyeHeight();

    String getHurtSound();

    String getLivingSound();

    boolean isBreedingItem(ItemStack var0);

    boolean isChickenJockey();

    void onLivingUpdate();

    void playStepSound(BlockPos var0, Block var1);

    void readEntityFromNBT(NBTTagCompound var0);

    void setChickenJockey(boolean var0);

    void updateRiderPosition();

    void writeEntityToNBT(NBTTagCompound var0);

}
