package de.ropemc.api.wrapper.net.minecraft.entity.passive;

import de.ropemc.api.wrapper.net.minecraft.entity.ai.EntityAISit;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.scoreboard.Team;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.util.DamageSource;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.passive.EntityTameable")
public interface EntityTameable {

    void entityInit();

    EntityAISit getAISit();

    Entity getOwner();

    String getOwnerId();

    Team getTeam();

    void handleStatusUpdate(byte var0);

    boolean isOnSameTeam(EntityLivingBase var0);

    boolean isOwner(EntityLivingBase var0);

    boolean isSitting();

    boolean isTamed();

    void onDeath(DamageSource var0);

    void playTameEffect(boolean var0);

    void readEntityFromNBT(NBTTagCompound var0);

    void setOwnerId(String var0);

    void setSitting(boolean var0);

    void setTamed(boolean var0);

    void setupTamedAI();

    boolean shouldAttackEntity(EntityLivingBase var0, EntityLivingBase var1);

    void writeEntityToNBT(NBTTagCompound var0);

}
