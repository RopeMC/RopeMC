package de.ropemc.api.wrapper.net.minecraft.entity.item;

import de.ropemc.api.wrapper.net.minecraft.util.DamageSource;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.item.EntityItemFrame")
public interface EntityItemFrame {

    boolean attackEntityFrom(DamageSource var0, float var1);

    void dropItemOrSelf(Entity var0, boolean var1);

    void entityInit();

    void func_174865_a(int var0, boolean var1);

    int func_174866_q();

    float getCollisionBorderSize();

    ItemStack getDisplayedItem();

    int getHeightPixels();

    int getRotation();

    int getWidthPixels();

    boolean interactFirst(EntityPlayer var0);

    boolean isInRangeToRenderDist(double var0);

    void onBroken(Entity var0);

    void readEntityFromNBT(NBTTagCompound var0);

    void removeFrameFromMap(ItemStack var0);

    void setDisplayedItem(ItemStack var0);

    void setDisplayedItemWithUpdate(ItemStack var0, boolean var1);

    void setItemRotation(int var0);

    void writeEntityToNBT(NBTTagCompound var0);

}
