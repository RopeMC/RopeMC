package de.ropemc.api.wrapper.net.minecraft.entity.passive;

import de.ropemc.api.wrapper.net.minecraft.entity.EntityAgeable;
import de.ropemc.api.wrapper.net.minecraft.item.EnumDyeColor;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.world.DifficultyInstance;
import de.ropemc.api.wrapper.net.minecraft.entity.IEntityLivingData;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.passive.EntitySheep")
public interface EntitySheep {

    void applyEntityAttributes();

    EntityAgeable createChild(EntityAgeable var0);

    void dropFewItems(boolean var0, int var1);

    void eatGrassBonus();

    void entityInit();

    float[] func_175513_a(EnumDyeColor var0);

    String getDeathSound();

    Item getDropItem();

    EnumDyeColor getDyeColorMixFromParents(EntityAnimal var0, EntityAnimal var1);

    float getEyeHeight();

    EnumDyeColor getFleeceColor();

    float getHeadRotationAngleX(float var0);

    float getHeadRotationPointY(float var0);

    String getHurtSound();

    String getLivingSound();

    EnumDyeColor getRandomSheepColor(Random var0);

    boolean getSheared();

    void handleStatusUpdate(byte var0);

    boolean interact(EntityPlayer var0);

    IEntityLivingData onInitialSpawn(DifficultyInstance var0, IEntityLivingData var1);

    void onLivingUpdate();

    void playStepSound(BlockPos var0, Block var1);

    void readEntityFromNBT(NBTTagCompound var0);

    void setFleeceColor(EnumDyeColor var0);

    void setSheared(boolean var0);

    void updateAITasks();

    void writeEntityToNBT(NBTTagCompound var0);

}
