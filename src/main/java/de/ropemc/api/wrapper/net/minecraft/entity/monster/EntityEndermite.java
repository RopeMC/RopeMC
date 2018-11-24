package de.ropemc.api.wrapper.net.minecraft.entity.monster;

import de.ropemc.api.wrapper.net.minecraft.entity.EnumCreatureAttribute;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.monster.EntityEndermite")
public interface EntityEndermite {

    void applyEntityAttributes();

    boolean canTriggerWalking();

    boolean getCanSpawnHere();

    EnumCreatureAttribute getCreatureAttribute();

    String getDeathSound();

    Item getDropItem();

    float getEyeHeight();

    String getHurtSound();

    String getLivingSound();

    boolean isSpawnedByPlayer();

    boolean isValidLightLevel();

    void onLivingUpdate();

    void onUpdate();

    void playStepSound(BlockPos var0, Block var1);

    void readEntityFromNBT(NBTTagCompound var0);

    void setSpawnedByPlayer(boolean var0);

    void writeEntityToNBT(NBTTagCompound var0);

}
