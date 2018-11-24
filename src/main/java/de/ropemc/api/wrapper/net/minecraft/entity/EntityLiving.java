package de.ropemc.api.wrapper.net.minecraft.entity;

import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.net.minecraft.entity.ai.EntitySenses;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.entity.ai.EntityJumpHelper;
import de.ropemc.api.wrapper.net.minecraft.entity.ai.EntityLookHelper;
import de.ropemc.api.wrapper.net.minecraft.entity.ai.EntityMoveHelper;
import de.ropemc.api.wrapper.net.minecraft.pathfinding.PathNavigate;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.world.DifficultyInstance;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.net.minecraft.entity.item.EntityItem;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.EntityLiving")
public interface EntityLiving {

    boolean allowLeashing();

    void applyEntityAttributes();

    boolean canAttackClass(Class var0);

    boolean canBeSteered();

    boolean canDespawn();

    boolean canPickUpLoot();

    void clearLeashed(boolean var0, boolean var1);

    void despawnEntity();

    void dropEquipment(boolean var0, int var1);

    void dropFewItems(boolean var0, int var1);

    void eatGrassBonus();

    void enablePersistence();

    void entityInit();

    void faceEntity(Entity var0, float var1, float var2);

    float func_110146_f(float var0, float var1);

    boolean func_175448_a(ItemStack var0);

    Item getArmorItemForSlot(int var0, int var1);

    int getArmorPosition(ItemStack var0);

    EntityLivingBase getAttackTarget();

    boolean getCanSpawnHere();

    ItemStack getCurrentArmor(int var0);

    Item getDropItem();

    EntitySenses getEntitySenses();

    ItemStack getEquipmentInSlot(int var0);

    int getExperiencePoints(EntityPlayer var0);

    ItemStack getHeldItem();

    ItemStack[] getInventory();

    EntityJumpHelper getJumpHelper();

    boolean getLeashed();

    Entity getLeashedToEntity();

    String getLivingSound();

    EntityLookHelper getLookHelper();

    int getMaxFallHeight();

    int getMaxSpawnedInChunk();

    EntityMoveHelper getMoveHelper();

    PathNavigate getNavigator();

    PathNavigate getNewNavigator(World var0);

    float getRenderSizeModifier();

    int getTalkInterval();

    int getVerticalFaceSpeed();

    void handleStatusUpdate(byte var0);

    boolean interact(EntityPlayer var0);

    boolean interactFirst(EntityPlayer var0);

    boolean isAIDisabled();

    boolean isNoDespawnRequired();

    boolean isNotColliding();

    boolean isServerWorld();

    void onEntityUpdate();

    IEntityLivingData onInitialSpawn(DifficultyInstance var0, IEntityLivingData var1);

    void onLivingUpdate();

    void onUpdate();

    void playLivingSound();

    void readEntityFromNBT(NBTTagCompound var0);

    void recreateLeash();

    boolean replaceItemInInventory(int var0, ItemStack var1);

    void setAIMoveSpeed(float var0);

    void setAttackTarget(EntityLivingBase var0);

    void setCanPickUpLoot(boolean var0);

    void setCurrentItemOrArmor(int var0, ItemStack var1);

    void setEnchantmentBasedOnDifficulty(DifficultyInstance var0);

    void setEquipmentBasedOnDifficulty(DifficultyInstance var0);

    void setEquipmentDropChance(int var0, float var1);

    void setLeashedToEntity(Entity var0, boolean var1);

    void setMoveForward(float var0);

    void setNoAI(boolean var0);

    void spawnExplosionParticle();

    void updateAITasks();

    void updateEntityActionState();

    void updateEquipmentIfNeeded(EntityItem var0);

    void updateLeashedState();

    float updateRotation(float var0, float var1, float var2);

    void writeEntityToNBT(NBTTagCompound var0);

}
