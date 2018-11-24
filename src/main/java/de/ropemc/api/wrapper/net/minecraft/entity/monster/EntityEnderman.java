package de.ropemc.api.wrapper.net.minecraft.entity.monster;

import de.ropemc.api.wrapper.net.minecraft.entity.ai.attributes.AttributeModifier;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import java.util.Set;
import de.ropemc.api.wrapper.net.minecraft.util.DamageSource;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.monster.EntityEnderman")
public interface EntityEnderman {

    //AttributeModifier access$000();

    //boolean access$100(EntityEnderman var0, EntityPlayer var1);

    //boolean access$202(EntityEnderman var0, boolean var1);

    //Set access$300();

    void applyEntityAttributes();

    boolean attackEntityFrom(DamageSource var0, float var1);

    void dropFewItems(boolean var0, int var1);

    void entityInit();

    String getDeathSound();

    Item getDropItem();

    float getEyeHeight();

    IBlockState getHeldBlockState();

    String getHurtSound();

    String getLivingSound();

    boolean isScreaming();

    void onLivingUpdate();

    void readEntityFromNBT(NBTTagCompound var0);

    void setHeldBlockState(IBlockState var0);

    void setScreaming(boolean var0);

    boolean shouldAttackPlayer(EntityPlayer var0);

    boolean teleportRandomly();

    boolean teleportTo(double var0, double var1, double var2);

    boolean teleportToEntity(Entity var0);

    void updateAITasks();

    void writeEntityToNBT(NBTTagCompound var0);

}
