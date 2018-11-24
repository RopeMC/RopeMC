package de.ropemc.api.wrapper.net.minecraft.entity.monster;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.util.DamageSource;
import de.ropemc.api.wrapper.net.minecraft.entity.effect.EntityLightningBolt;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.monster.EntityCreeper")
public interface EntityCreeper {

    void applyEntityAttributes();

    boolean attackEntityAsMob(Entity var0);

    void entityInit();

    void explode();

    void fall(float var0, float var1);

    void func_175493_co();

    float getCreeperFlashIntensity(float var0);

    int getCreeperState();

    String getDeathSound();

    Item getDropItem();

    String getHurtSound();

    int getMaxFallHeight();

    boolean getPowered();

    boolean hasIgnited();

    void ignite();

    boolean interact(EntityPlayer var0);

    boolean isAIEnabled();

    void onDeath(DamageSource var0);

    void onStruckByLightning(EntityLightningBolt var0);

    void onUpdate();

    void readEntityFromNBT(NBTTagCompound var0);

    void setCreeperState(int var0);

    void writeEntityToNBT(NBTTagCompound var0);

}
