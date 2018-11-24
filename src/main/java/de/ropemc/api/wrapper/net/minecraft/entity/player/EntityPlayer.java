package de.ropemc.api.wrapper.net.minecraft.entity.player;

import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
import de.ropemc.api.wrapper.net.minecraft.stats.StatBase;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.util.DamageSource;
import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.net.minecraft.world.LockCode;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.inventory.IInventory;
import de.ropemc.api.wrapper.net.minecraft.entity.passive.EntityHorse;
import de.ropemc.api.wrapper.net.minecraft.world.IInteractionObject;
import de.ropemc.api.wrapper.net.minecraft.entity.IMerchant;
import de.ropemc.api.wrapper.net.minecraft.entity.item.EntityItem;
import java.util.Collection;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.FoodStats;
//import com.mojang.authlib.GameProfile;
import de.ropemc.api.wrapper.net.minecraft.inventory.InventoryEnderChest;
import java.util.UUID;
import de.ropemc.api.wrapper.net.minecraft.scoreboard.Team;
import de.ropemc.api.wrapper.net.minecraft.scoreboard.Scoreboard;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.command.server.CommandBlockLogic;
import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntitySign;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
//import de.ropemc.api.wrapper.net.minecraft.world.WorldSettings$GameType;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.player.EntityPlayer")
public interface EntityPlayer extends EntityLivingBase {

    void addChatComponentMessage(IChatComponent var0);

    void addExhaustion(float var0);

    void addExperience(int var0);

    void addExperienceLevel(int var0);

    void addMountedMovementStat(double var0, double var1, double var2);

    void addMovementStat(double var0, double var1, double var2);

    void addScore(int var0);

    void addStat(StatBase var0, int var1);

    void addToPlayerScore(Entity var0, int var1);

    void applyEntityAttributes();

    boolean attackEntityFrom(DamageSource var0, float var1);

    void attackTargetEntityWithCurrentItem(Entity var0);

    boolean canAttackPlayer(EntityPlayer var0);

    boolean canEat(boolean var0);

    boolean canHarvestBlock(Block var0);

    boolean canOpen(LockCode var0);

    boolean canPlayerEdit(BlockPos var0, EnumFacing var1, ItemStack var2);

    boolean canTriggerWalking();

    void clearItemInUse();

    void clonePlayer(EntityPlayer var0, boolean var1);

    void closeScreen();

    void collideWithPlayer(Entity var0);

    void damageArmor(float var0);

    void damageEntity(DamageSource var0, float var1);

    void destroyCurrentEquippedItem();

    void displayGUIBook(ItemStack var0);

    void displayGUIChest(IInventory var0);

    void displayGUIHorse(EntityHorse var0, IInventory var1);

    void displayGui(IInteractionObject var0);

    void displayVillagerTradeGui(IMerchant var0);

    EntityItem dropItem(ItemStack var0, boolean var1, boolean var2);

    EntityItem dropOneItem(boolean var0);

    EntityItem dropPlayerItemWithRandomChoice(ItemStack var0, boolean var1);

    void entityInit();

    void fall(float var0, float var1);

    Collection func_175137_e(Entity var0);

    void func_175139_a(EnumFacing var0);

    void func_175145_a(StatBase var0);

    float getAIMoveSpeed();

    float getAbsorptionAmount();

    boolean getAlwaysRenderNameTagForRender();

    float getArmorVisibility();

    BlockPos getBedLocation();

    float getBedOrientationInDegrees();

    BlockPos getBedSpawnLocation(World var0, BlockPos var1, boolean var2);

    ItemStack getCurrentArmor(int var0);

    ItemStack getCurrentEquippedItem();

    String getDeathSound();

    IChatComponent getDisplayName();

    ItemStack getEquipmentInSlot(int var0);

    int getExperiencePoints(EntityPlayer var0);

    float getEyeHeight();

    String getFallSoundString(int var0);

    FoodStats getFoodStats();

    //GameProfile getGameProfile();

    ItemStack getHeldItem();

    String getHurtSound();

    ItemStack[] getInventory();

    InventoryEnderChest getInventoryEnderChest();

    ItemStack getItemInUse();

    int getItemInUseCount();

    int getItemInUseDuration();

    int getMaxInPortalTime();

    String getName();

    UUID getOfflineUUID(String var0);

    int getPortalCooldown();

    int getScore();

    int getSleepTimer();

    String getSplashSound();

    String getSwimSound();

    Team getTeam();

    float getToolDigEfficiency(Block var0);

    int getTotalArmorValue();

    //UUID getUUID(GameProfile var0);

    Scoreboard getWorldScoreboard();

    int getXPSeed();

    double getYOffset();

    void handleStatusUpdate(byte var0);

    boolean hasReducedDebug();

    boolean interactWith(Entity var0);

    boolean isAllowEdit();

    boolean isBlocking();

    boolean isEntityInsideOpaqueBlock();

    boolean isInBed();

    boolean isInvisibleToPlayer(EntityPlayer var0);

    boolean isMovementBlocked();

    boolean isPlayer();

    boolean isPlayerFullyAsleep();

    boolean isPlayerSleeping();

    boolean isPushedByWater();

    boolean isSpawnForced();

    boolean isSpectator();

    boolean isUser();

    boolean isUsingItem();

    boolean isWearing(EnumPlayerModelParts var0);

    void joinEntityItemWithWorld(EntityItem var0);

    void jump();

    void moveEntityWithHeading(float var0, float var1);

    void onCriticalHit(Entity var0);

    void onDeath(DamageSource var0);

    void onEnchantmentCritical(Entity var0);

    void onItemUseFinish();

    void onKillEntity(EntityLivingBase var0);

    void onLivingUpdate();

    void onUpdate();

    void openEditCommandBlock(CommandBlockLogic var0);

    void openEditSign(TileEntitySign var0);

    void playSound(String var0, float var1, float var2);

    void preparePlayerToSpawn();

    void readEntityFromNBT(NBTTagCompound var0);

    void removeExperienceLevel(int var0);

    boolean replaceItemInInventory(int var0, ItemStack var1);

    void resetHeight();

    void respawnPlayer();

    boolean sendCommandFeedback();

    void sendPlayerAbilities();

    void setAbsorptionAmount(float var0);

    void setCurrentItemOrArmor(int var0, ItemStack var1);

    void setDead();

    //void setGameType(WorldSettings$GameType var0);

    void setInWeb();

    void setItemInUse(ItemStack var0, int var1);

    void setReducedDebug(boolean var0);

    void setScore(int var0);

    void setSpawnPoint(BlockPos var0, boolean var1);

    boolean shouldHeal();

    void stopUsingItem();

    void triggerAchievement(StatBase var0);

    //EntityPlayer$EnumStatus trySleep(BlockPos var0);

    void updateEntityActionState();

    void updateItemUse(ItemStack var0, int var1);

    void updateRidden();

    void wakeUpPlayer(boolean var0, boolean var1, boolean var2);

    void writeEntityToNBT(NBTTagCompound var0);

    int xpBarCap();

}
