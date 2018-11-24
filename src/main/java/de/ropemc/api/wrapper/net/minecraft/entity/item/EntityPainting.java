package de.ropemc.api.wrapper.net.minecraft.entity.item;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.item.EntityPainting")
public interface EntityPainting {

    int getHeightPixels();

    int getWidthPixels();

    void onBroken(Entity var0);

    void readEntityFromNBT(NBTTagCompound var0);

    void setLocationAndAngles(double var0, double var1, double var2, float var3, float var4);

    void setPositionAndRotation2(double var0, double var1, double var2, float var3, float var4, int var5, boolean var6);

    void writeEntityToNBT(NBTTagCompound var0);

}
