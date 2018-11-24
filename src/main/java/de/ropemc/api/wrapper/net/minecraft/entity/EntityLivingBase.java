package de.ropemc.api.wrapper.net.minecraft.entity;

import de.ropemc.api.wrapper.net.minecraft.potion.PotionEffect;
import de.ropemc.api.wrapper.net.minecraft.util.DamageSource;
import de.ropemc.api.wrapper.net.minecraft.potion.Potion;
import java.util.Collection;
import de.ropemc.api.wrapper.net.minecraft.entity.ai.attributes.BaseAttributeMap;
import de.ropemc.api.wrapper.net.minecraft.util.CombatTracker;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.entity.ai.attributes.IAttribute;
import de.ropemc.api.wrapper.net.minecraft.entity.ai.attributes.IAttributeInstance;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.util.Vec3;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.scoreboard.Team;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.EntityLivingBase")
public interface EntityLivingBase extends Entity {

    void addPotionEffect(PotionEffect var0);

    void addRandomDrop();

    float applyArmorCalculations(DamageSource var0, float var1);

    void applyEntityAttributes();

    float applyPotionDamageCalculations(DamageSource var0, float var1);

    boolean attackEntityAsMob(Entity var0);

    boolean attackEntityFrom(DamageSource var0, float var1);

    boolean canBeCollidedWith();

    boolean canBePushed();

    boolean canBreatheUnderwater();

    boolean canDropLoot();

    boolean canEntityBeSeen(Entity var0);

    void clearActivePotions();

    void collideWithEntity(Entity var0);

    void collideWithNearbyEntities();

    void damageArmor(float var0);

    void damageEntity(DamageSource var0, float var1);

    int decreaseAirSupply(int var0);

    void dismountEntity(Entity var0);

    void dropEquipment(boolean var0, int var1);

    void dropFewItems(boolean var0, int var1);

    void entityInit();

    void fall(float var0, float var1);

    float func_110146_f(float var0, float var1);

    void func_181013_g(float var0);

    EntityLivingBase func_94060_bK();

    float getAIMoveSpeed();

    EntityLivingBase getAITarget();

    float getAbsorptionAmount();

    PotionEffect getActivePotionEffect(Potion var0);

    Collection getActivePotionEffects();

    int getAge();

    boolean getAlwaysRenderNameTagForRender();

    int getArmSwingAnimationEnd();

    int getArrowCountInEntity();

    BaseAttributeMap getAttributeMap();

    CombatTracker getCombatTracker();

    EnumCreatureAttribute getCreatureAttribute();

    ItemStack getCurrentArmor(int var0);

    String getDeathSound();

    IAttributeInstance getEntityAttribute(IAttribute var0);

    ItemStack getEquipmentInSlot(int var0);

    int getExperiencePoints(EntityPlayer var0);

    String getFallSoundString(int var0);

    float getHealth();

    ItemStack getHeldItem();

    String getHurtSound();

    ItemStack[] getInventory();

    float getJumpUpwardsMotion();

    EntityLivingBase getLastAttacker();

    int getLastAttackerTime();

    Vec3 getLook(float var0);

    Vec3 getLookVec();

    float getMaxHealth();

    Random getRNG();

    int getRevengeTimer();

    float getRotationYawHead();

    float getSoundPitch();

    float getSoundVolume();

    float getSwingProgress(float var0);

    Team getTeam();

    int getTotalArmorValue();

    void handleJumpLava();

    void handleStatusUpdate(byte var0);

    void heal(float var0);

    boolean isChild();

    boolean isEntityAlive();

    boolean isEntityUndead();

    boolean isMovementBlocked();

    boolean isOnLadder();

    boolean isOnSameTeam(EntityLivingBase var0);

    boolean isOnTeam(Team var0);

    boolean isPlayer();

    boolean isPlayerSleeping();

    boolean isPotionActive(int var0);

    boolean isPotionActive(Potion var0);

    boolean isPotionApplicable(PotionEffect var0);

    boolean isServerWorld();

    void jump();

    void kill();

    void knockBack(Entity var0, float var1, double var2, double var3);

    void markPotionsDirty();

    void mountEntity(Entity var0);

    void moveEntityWithHeading(float var0, float var1);

    void onChangedPotionEffect(PotionEffect var0, boolean var1);

    void onDeath(DamageSource var0);

    void onDeathUpdate();

    void onEntityUpdate();

    void onFinishedPotionEffect(PotionEffect var0);

    void onItemPickup(Entity var0, int var1);

    void onKillCommand();

    void onLivingUpdate();

    void onNewPotionEffect(PotionEffect var0);

    void onUpdate();

    void performHurtAnimation();

    void readEntityFromNBT(NBTTagCompound var0);

    void removePotionEffect(int var0);

    void removePotionEffectClient(int var0);

    void renderBrokenItemStack(ItemStack var0);

    void resetPotionEffectMetadata();

    void sendEndCombat();

    void sendEnterCombat();

    void setAIMoveSpeed(float var0);

    void setAbsorptionAmount(float var0);

    void setArrowCountInEntity(int var0);

    void setBeenAttacked();

    void setCurrentItemOrArmor(int var0, ItemStack var1);

    void setHealth(float var0);

    void setJumping(boolean var0);

    void setLastAttacker(Entity var0);

    void setPositionAndRotation2(double var0, double var1, double var2, float var3, float var4, int var5, boolean var6);

    void setRevengeTarget(EntityLivingBase var0);

    void setRotationYawHead(float var0);

    void setSprinting(boolean var0);

    void swingItem();

    void updateAITick();

    void updateArmSwingProgress();

    void updateEntityActionState();

    void updateFallState(double var0, boolean var1, Block var2, BlockPos var3);

    void updatePotionEffects();

    void updatePotionMetadata();

    void updateRidden();

    void writeEntityToNBT(NBTTagCompound var0);

}
