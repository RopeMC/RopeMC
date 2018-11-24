package de.ropemc.api.wrapper.net.minecraft.entity.boss;

import de.ropemc.api.wrapper.net.minecraft.potion.PotionEffect;
import de.ropemc.api.wrapper.net.minecraft.util.DamageSource;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.net.minecraft.entity.EnumCreatureAttribute;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.boss.EntityWither")
public interface EntityWither {

    void addPotionEffect(PotionEffect var0);

    void applyEntityAttributes();

    boolean attackEntityFrom(DamageSource var0, float var1);

    void attackEntityWithRangedAttack(EntityLivingBase var0, float var1);

    void despawnEntity();

    void dropFewItems(boolean var0, int var1);

    void entityInit();

    void fall(float var0, float var1);

    boolean func_181033_a(Block var0);

    float func_82204_b(float var0, float var1, float var2);

    void func_82206_m();

    float func_82207_a(int var0);

    double func_82208_v(int var0);

    float func_82210_r(int var0);

    double func_82213_w(int var0);

    double func_82214_u(int var0);

    int getBrightnessForRender(float var0);

    EnumCreatureAttribute getCreatureAttribute();

    String getDeathSound();

    String getHurtSound();

    int getInvulTime();

    String getLivingSound();

    int getTotalArmorValue();

    int getWatchedTargetId(int var0);

    boolean isArmored();

    void launchWitherSkullToCoords(int var0, double var1, double var2, double var3, boolean var4);

    void launchWitherSkullToEntity(int var0, EntityLivingBase var1);

    void mountEntity(Entity var0);

    void onLivingUpdate();

    void readEntityFromNBT(NBTTagCompound var0);

    void setInWeb();

    void setInvulTime(int var0);

    void updateAITasks();

    void updateWatchedTargetId(int var0, int var1);

    void writeEntityToNBT(NBTTagCompound var0);

}
