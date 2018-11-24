package de.ropemc.api.wrapper.net.minecraft.entity.monster;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.util.DamageSource;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.entity.EnumCreatureAttribute;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.world.DifficultyInstance;
import de.ropemc.api.wrapper.net.minecraft.entity.IEntityLivingData;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.monster.EntityZombie")
public interface EntityZombie {

    void addRandomDrop();

    void applyEntityAI();

    void applyEntityAttributes();

    boolean attackEntityAsMob(Entity var0);

    boolean attackEntityFrom(DamageSource var0, float var1);

    boolean canDespawn();

    void convertToVillager();

    void entityInit();

    boolean func_175448_a(ItemStack var0);

    int getConversionTimeBoost();

    EnumCreatureAttribute getCreatureAttribute();

    String getDeathSound();

    Item getDropItem();

    int getExperiencePoints(EntityPlayer var0);

    float getEyeHeight();

    String getHurtSound();

    String getLivingSound();

    int getTotalArmorValue();

    double getYOffset();

    void handleStatusUpdate(byte var0);

    boolean interact(EntityPlayer var0);

    boolean isBreakDoorsTaskSet();

    boolean isChild();

    boolean isConverting();

    boolean isVillager();

    void multiplySize(float var0);

    void onDeath(DamageSource var0);

    IEntityLivingData onInitialSpawn(DifficultyInstance var0, IEntityLivingData var1);

    void onKillEntity(EntityLivingBase var0);

    void onLivingUpdate();

    void onUpdate();

    void playStepSound(BlockPos var0, Block var1);

    void readEntityFromNBT(NBTTagCompound var0);

    void setBreakDoorsAItask(boolean var0);

    void setChild(boolean var0);

    void setChildSize(boolean var0);

    void setEquipmentBasedOnDifficulty(DifficultyInstance var0);

    void setSize(float var0, float var1);

    void setVillager(boolean var0);

    void startConversion(int var0);

    void writeEntityToNBT(NBTTagCompound var0);

}
