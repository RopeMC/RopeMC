package de.ropemc.api.wrapper.net.minecraft.entity.passive;

import de.ropemc.api.wrapper.net.minecraft.entity.EntityAgeable;
import de.ropemc.api.wrapper.net.minecraft.entity.ai.EntityAIControlledByPlayer;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.entity.effect.EntityLightningBolt;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.passive.EntityPig")
public interface EntityPig {

    void applyEntityAttributes();

    boolean canBeSteered();

    EntityAgeable createChild(EntityAgeable var0);

    void dropFewItems(boolean var0, int var1);

    void entityInit();

    void fall(float var0, float var1);

    EntityAIControlledByPlayer getAIControlledByPlayer();

    String getDeathSound();

    Item getDropItem();

    String getHurtSound();

    String getLivingSound();

    boolean getSaddled();

    boolean interact(EntityPlayer var0);

    boolean isBreedingItem(ItemStack var0);

    void onStruckByLightning(EntityLightningBolt var0);

    void playStepSound(BlockPos var0, Block var1);

    void readEntityFromNBT(NBTTagCompound var0);

    void setSaddled(boolean var0);

    void writeEntityToNBT(NBTTagCompound var0);

}
