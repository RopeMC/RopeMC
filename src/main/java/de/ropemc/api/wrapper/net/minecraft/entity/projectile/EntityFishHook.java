package de.ropemc.api.wrapper.net.minecraft.entity.projectile;

import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.projectile.EntityFishHook")
public interface EntityFishHook {

    void entityInit();

    List func_174855_j();

    ItemStack getFishingResult();

    void handleHookCasting(double var0, double var1, double var2, float var3, float var4);

    int handleHookRetraction();

    boolean isInRangeToRenderDist(double var0);

    void onUpdate();

    void readEntityFromNBT(NBTTagCompound var0);

    void setDead();

    void setPositionAndRotation2(double var0, double var1, double var2, float var3, float var4, int var5, boolean var6);

    void setVelocity(double var0, double var1, double var2);

    void writeEntityToNBT(NBTTagCompound var0);

}
