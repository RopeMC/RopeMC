package de.ropemc.api.wrapper.net.minecraft.util;

import de.ropemc.api.wrapper.net.minecraft.item.ItemFood;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.FoodStats")
public interface FoodStats {

    void addExhaustion(float var0);

    void addStats(int var0, float var1);

    void addStats(ItemFood var0, ItemStack var1);

    int getFoodLevel();

    int getPrevFoodLevel();

    float getSaturationLevel();

    boolean needFood();

    void onUpdate(EntityPlayer var0);

    void readNBT(NBTTagCompound var0);

    void setFoodLevel(int var0);

    void setFoodSaturationLevel(float var0);

    void writeNBT(NBTTagCompound var0);

}
