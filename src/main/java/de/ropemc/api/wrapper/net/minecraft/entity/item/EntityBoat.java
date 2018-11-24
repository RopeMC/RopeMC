package de.ropemc.api.wrapper.net.minecraft.entity.item;

import de.ropemc.api.wrapper.net.minecraft.util.DamageSource;
import de.ropemc.api.wrapper.net.minecraft.util.AxisAlignedBB;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.item.EntityBoat")
public interface EntityBoat {

    boolean attackEntityFrom(DamageSource var0, float var1);

    boolean canBeCollidedWith();

    boolean canBePushed();

    boolean canTriggerWalking();

    void entityInit();

    AxisAlignedBB getCollisionBoundingBox();

    AxisAlignedBB getCollisionBox(Entity var0);

    float getDamageTaken();

    int getForwardDirection();

    double getMountedYOffset();

    int getTimeSinceHit();

    boolean interactFirst(EntityPlayer var0);

    void onUpdate();

    void performHurtAnimation();

    void readEntityFromNBT(NBTTagCompound var0);

    void setDamageTaken(float var0);

    void setForwardDirection(int var0);

    void setIsBoatEmpty(boolean var0);

    void setPositionAndRotation2(double var0, double var1, double var2, float var3, float var4, int var5, boolean var6);

    void setTimeSinceHit(int var0);

    void setVelocity(double var0, double var1, double var2);

    void updateFallState(double var0, boolean var1, Block var2, BlockPos var3);

    void updateRiderPosition();

    void writeEntityToNBT(NBTTagCompound var0);

}
