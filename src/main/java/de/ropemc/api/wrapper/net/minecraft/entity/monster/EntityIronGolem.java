package de.ropemc.api.wrapper.net.minecraft.entity.monster;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.village.Village;
import de.ropemc.api.wrapper.net.minecraft.util.DamageSource;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.monster.EntityIronGolem")
public interface EntityIronGolem {

    void applyEntityAttributes();

    boolean attackEntityAsMob(Entity var0);

    boolean canAttackClass(Class var0);

    void collideWithEntity(Entity var0);

    int decreaseAirSupply(int var0);

    void dropFewItems(boolean var0, int var1);

    void entityInit();

    int getAttackTimer();

    String getDeathSound();

    int getHoldRoseTick();

    String getHurtSound();

    Village getVillage();

    void handleStatusUpdate(byte var0);

    boolean isPlayerCreated();

    void onDeath(DamageSource var0);

    void onLivingUpdate();

    void playStepSound(BlockPos var0, Block var1);

    void readEntityFromNBT(NBTTagCompound var0);

    void setHoldingRose(boolean var0);

    void setPlayerCreated(boolean var0);

    void updateAITasks();

    void writeEntityToNBT(NBTTagCompound var0);

}
