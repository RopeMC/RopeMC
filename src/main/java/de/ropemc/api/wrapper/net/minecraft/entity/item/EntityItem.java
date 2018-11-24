package de.ropemc.api.wrapper.net.minecraft.entity.item;

import de.ropemc.api.wrapper.net.minecraft.util.DamageSource;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.item.EntityItem")
public interface EntityItem {

    boolean attackEntityFrom(DamageSource var0, float var1);

    boolean canAttackWithItem();

    boolean canTriggerWalking();

    boolean cannotPickup();

    boolean combineItems(EntityItem var0);

    void dealFireDamage(int var0);

    void entityInit();

    void func_174870_v();

    int getAge();

    ItemStack getEntityItem();

    String getName();

    String getOwner();

    String getThrower();

    boolean handleWaterMovement();

    void onCollideWithPlayer(EntityPlayer var0);

    void onUpdate();

    void readEntityFromNBT(NBTTagCompound var0);

    void searchForOtherItemsNearby();

    void setAgeToCreativeDespawnTime();

    void setDefaultPickupDelay();

    void setEntityItemStack(ItemStack var0);

    void setInfinitePickupDelay();

    void setNoDespawn();

    void setNoPickupDelay();

    void setOwner(String var0);

    void setPickupDelay(int var0);

    void setThrower(String var0);

    void travelToDimension(int var0);

    void writeEntityToNBT(NBTTagCompound var0);

}
