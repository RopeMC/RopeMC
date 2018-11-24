package de.ropemc.api.wrapper.net.minecraft.entity.passive;

import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityAgeable;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
import de.ropemc.api.wrapper.net.minecraft.village.MerchantRecipeList;
import de.ropemc.api.wrapper.net.minecraft.inventory.InventoryBasic;
import de.ropemc.api.wrapper.net.minecraft.util.DamageSource;
import de.ropemc.api.wrapper.net.minecraft.world.DifficultyInstance;
import de.ropemc.api.wrapper.net.minecraft.entity.IEntityLivingData;
import de.ropemc.api.wrapper.net.minecraft.entity.effect.EntityLightningBolt;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.util.EnumParticleTypes;
import de.ropemc.api.wrapper.net.minecraft.entity.item.EntityItem;
import de.ropemc.api.wrapper.net.minecraft.village.MerchantRecipe;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.passive.EntityVillager")
public interface EntityVillager {

    boolean allowLeashing();

    void applyEntityAttributes();

    boolean canAbondonItems();

    boolean canDespawn();

    boolean canVillagerPickupItem(Item var0);

    EntityAgeable createChild(EntityAgeable var0);

    void entityInit();

    boolean func_175553_cp();

    boolean func_175557_cr();

    EntityPlayer getCustomer();

    String getDeathSound();

    IChatComponent getDisplayName();

    float getEyeHeight();

    String getHurtSound();

    boolean getIsWillingToMate(boolean var0);

    String getLivingSound();

    int getProfession();

    MerchantRecipeList getRecipes(EntityPlayer var0);

    InventoryBasic getVillagerInventory();

    void handleStatusUpdate(byte var0);

    boolean hasEnoughItems(int var0);

    boolean interact(EntityPlayer var0);

    boolean isFarmItemInInventory();

    boolean isMating();

    boolean isPlaying();

    boolean isTrading();

    void onDeath(DamageSource var0);

    void onGrowingAdult();

    IEntityLivingData onInitialSpawn(DifficultyInstance var0, IEntityLivingData var1);

    void onStruckByLightning(EntityLightningBolt var0);

    void populateBuyingList();

    void readEntityFromNBT(NBTTagCompound var0);

    boolean replaceItemInInventory(int var0, ItemStack var1);

    void setAdditionalAItasks();

    void setCustomer(EntityPlayer var0);

    void setIsWillingToMate(boolean var0);

    void setLookingForHome();

    void setMating(boolean var0);

    void setPlaying(boolean var0);

    void setProfession(int var0);

    void setRecipes(MerchantRecipeList var0);

    void setRevengeTarget(EntityLivingBase var0);

    void spawnParticles(EnumParticleTypes var0);

    void updateAITasks();

    void updateEquipmentIfNeeded(EntityItem var0);

    void useRecipe(MerchantRecipe var0);

    void verifySellingItem(ItemStack var0);

    void writeEntityToNBT(NBTTagCompound var0);

}
