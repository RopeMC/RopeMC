package de.ropemc.api.wrapper.net.minecraft.entity.passive;

import de.ropemc.api.wrapper.net.minecraft.util.DamageSource;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityAgeable;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.inventory.AnimalChest;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.world.DifficultyInstance;
import de.ropemc.api.wrapper.net.minecraft.entity.IEntityLivingData;
import de.ropemc.api.wrapper.net.minecraft.inventory.InventoryBasic;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.passive.EntityHorse")
public interface EntityHorse {

    boolean allowLeashing();

    void applyEntityAttributes();

    boolean attackEntityFrom(DamageSource var0, float var1);

    boolean canBePushed();

    boolean canCarryChest();

    boolean canMate();

    boolean canMateWith(EntityAnimal var0);

    boolean canWearArmor();

    EntityAgeable createChild(EntityAgeable var0);

    void dropChestItems();

    void dropChests();

    void dropItemsInChest(Entity var0, AnimalChest var1);

    void entityInit();

    void fall(float var0, float var1);

    void func_110210_cH();

    boolean func_110239_cn();

    boolean func_110253_bW();

    void func_110266_cB();

    void func_142017_o(float var0);

    boolean func_175507_cI();

    String getAngrySoundName();

    boolean getCanSpawnHere();

    int getChestSize();

    EntityHorse getClosestHorse(Entity var0, double var1);

    String getDeathSound();

    Item getDropItem();

    float getEyeHeight();

    float getGrassEatingAmount(float var0);

    boolean getHasReproduced();

    int getHorseArmorIndex(ItemStack var0);

    int getHorseArmorIndexSynced();

    double getHorseJumpStrength();

    float getHorseSize();

    String getHorseTexture();

    int getHorseType();

    int getHorseVariant();

    boolean getHorseWatchableBoolean(int var0);

    String getHurtSound();

    String getLivingSound();

    int getMaxSpawnedInChunk();

    int getMaxTemper();

    double getModifiedJumpStrength();

    float getModifiedMaxHealth();

    double getModifiedMovementSpeed();

    float getMouthOpennessAngle(float var0);

    String getName();

    String getOwnerId();

    float getRearingAmount(float var0);

    float getSoundVolume();

    int getTalkInterval();

    int getTemper();

    int getTotalArmorValue();

    String[] getVariantTexturePaths();

    void handleStatusUpdate(byte var0);

    int increaseTemper(int var0);

    void initHorseChest();

    boolean interact(EntityPlayer var0);

    boolean isAdultHorse();

    boolean isArmorItem(Item var0);

    boolean isBreeding();

    boolean isBreedingItem(ItemStack var0);

    boolean isChested();

    boolean isEatingHaystack();

    boolean isHorseJumping();

    boolean isHorseSaddled();

    boolean isMovementBlocked();

    boolean isOnLadder();

    boolean isRearing();

    boolean isSterile();

    boolean isTame();

    boolean isUndead();

    void makeHorseRear();

    void makeHorseRearWithSound();

    void mountTo(EntityPlayer var0);

    void moveEntityWithHeading(float var0, float var1);

    void onDeath(DamageSource var0);

    IEntityLivingData onInitialSpawn(DifficultyInstance var0, IEntityLivingData var1);

    void onInventoryChanged(InventoryBasic var0);

    void onLivingUpdate();

    void onUpdate();

    void openGUI(EntityPlayer var0);

    void openHorseMouth();

    void playStepSound(BlockPos var0, Block var1);

    boolean prepareChunkForSpawn();

    void readEntityFromNBT(NBTTagCompound var0);

    boolean replaceItemInInventory(int var0, ItemStack var1);

    void resetTexturePrefix();

    void setBreeding(boolean var0);

    void setChested(boolean var0);

    void setEating(boolean var0);

    void setEatingHaystack(boolean var0);

    void setHasReproduced(boolean var0);

    void setHorseArmorStack(ItemStack var0);

    void setHorseJumping(boolean var0);

    void setHorseSaddled(boolean var0);

    void setHorseTamed(boolean var0);

    void setHorseTexturePaths();

    void setHorseType(int var0);

    void setHorseVariant(int var0);

    void setHorseWatchableBoolean(int var0, boolean var1);

    void setJumpPower(int var0);

    void setOwnerId(String var0);

    void setRearing(boolean var0);

    void setScaleForAge(boolean var0);

    boolean setTamedBy(EntityPlayer var0);

    void setTemper(int var0);

    void spawnHorseParticles(boolean var0);

    void updateHorseSlots();

    void updateRiderPosition();

    void writeEntityToNBT(NBTTagCompound var0);

}
