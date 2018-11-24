package de.ropemc.api.wrapper.net.minecraft.entity.item;

import de.ropemc.api.wrapper.net.minecraft.util.DamageSource;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.util.Rotations;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.util.Vec3;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.item.EntityArmorStand")
public interface EntityArmorStand {

    boolean attackEntityFrom(DamageSource var0, float var1);

    boolean canBeCollidedWith();

    boolean canBePushed();

    void collideWithEntity(Entity var0);

    void collideWithNearbyEntities();

    void damageArmorStand(float var0);

    void dropBlock();

    void dropContents();

    void entityInit();

    float func_110146_f(float var0, float var1);

    void func_175422_a(EntityPlayer var0, int var1);

    boolean func_181026_s();

    void func_181027_m(boolean var0);

    void func_181550_a(boolean var0);

    Rotations getBodyRotation();

    ItemStack getCurrentArmor(int var0);

    ItemStack getEquipmentInSlot(int var0);

    float getEyeHeight();

    Rotations getHeadRotation();

    ItemStack getHeldItem();

    ItemStack[] getInventory();

    Rotations getLeftArmRotation();

    Rotations getLeftLegRotation();

    Rotations getRightArmRotation();

    Rotations getRightLegRotation();

    boolean getShowArms();

    boolean hasNoBasePlate();

    boolean hasNoGravity();

    boolean interactAt(EntityPlayer var0, Vec3 var1);

    boolean isChild();

    boolean isImmuneToExplosions();

    boolean isInRangeToRenderDist(double var0);

    boolean isServerWorld();

    boolean isSmall();

    void moveEntityWithHeading(float var0, float var1);

    void onKillCommand();

    void onUpdate();

    void playParticles();

    void readEntityFromNBT(NBTTagCompound var0);

    NBTTagCompound readPoseFromNBT();

    boolean replaceItemInInventory(int var0, ItemStack var1);

    void setBodyRotation(Rotations var0);

    void setCurrentItemOrArmor(int var0, ItemStack var1);

    void setHeadRotation(Rotations var0);

    void setInvisible(boolean var0);

    void setLeftArmRotation(Rotations var0);

    void setLeftLegRotation(Rotations var0);

    void setNoBasePlate(boolean var0);

    void setNoGravity(boolean var0);

    void setRightArmRotation(Rotations var0);

    void setRightLegRotation(Rotations var0);

    void setShowArms(boolean var0);

    void setSmall(boolean var0);

    void updatePotionMetadata();

    void writeEntityToNBT(NBTTagCompound var0);

    void writePoseToNBT(NBTTagCompound var0);

}
