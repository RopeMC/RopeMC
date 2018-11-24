package de.ropemc.api.wrapper.net.minecraft.entity.item;

import de.ropemc.api.wrapper.net.minecraft.util.DamageSource;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.item.EntityXPOrb")
public interface EntityXPOrb {

    boolean attackEntityFrom(DamageSource var0, float var1);

    boolean canAttackWithItem();

    boolean canTriggerWalking();

    void dealFireDamage(int var0);

    void entityInit();

    int getBrightnessForRender(float var0);

    int getTextureByXP();

    int getXPSplit(int var0);

    int getXpValue();

    boolean handleWaterMovement();

    void onCollideWithPlayer(EntityPlayer var0);

    void onUpdate();

    void readEntityFromNBT(NBTTagCompound var0);

    void writeEntityToNBT(NBTTagCompound var0);

}
