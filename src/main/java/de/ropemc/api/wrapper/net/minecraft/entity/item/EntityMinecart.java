package de.ropemc.api.wrapper.net.minecraft.entity.item;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.util.DamageSource;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.util.Vec3;
import de.ropemc.api.wrapper.net.minecraft.util.AxisAlignedBB;
import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.item.EntityMinecart")
public interface EntityMinecart {

    void applyDrag();

    void applyEntityCollision(Entity var0);

    boolean attackEntityFrom(DamageSource var0, float var1);

    boolean canBeCollidedWith();

    boolean canBePushed();

    boolean canTriggerWalking();

    void entityInit();

    void func_174899_a(IBlockState var0);

    //EntityMinecart func_180458_a(World var0, double var1, double var2, double var3, EntityMinecart$EnumMinecartType var4);

    void func_180460_a(BlockPos var0, IBlockState var1);

    Vec3 func_70489_a(double var0, double var1, double var2);

    Vec3 func_70495_a(double var0, double var1, double var2, double var3);

    AxisAlignedBB getCollisionBoundingBox();

    AxisAlignedBB getCollisionBox(Entity var0);

    String getCustomNameTag();

    float getDamage();

    IBlockState getDefaultDisplayTile();

    int getDefaultDisplayTileOffset();

    IChatComponent getDisplayName();

    IBlockState getDisplayTile();

    int getDisplayTileOffset();

    double getMaximumSpeed();

    //EntityMinecart$EnumMinecartType getMinecartType();

    double getMountedYOffset();

    String getName();

    int getRollingAmplitude();

    int getRollingDirection();

    boolean hasCustomName();

    boolean hasDisplayTile();

    void killMinecart(DamageSource var0);

    void moveDerailedMinecart();

    void onActivatorRailPass(int var0, int var1, int var2, boolean var3);

    void onUpdate();

    void performHurtAnimation();

    void readEntityFromNBT(NBTTagCompound var0);

    void setCustomNameTag(String var0);

    void setDamage(float var0);

    void setDead();

    void setDisplayTileOffset(int var0);

    void setHasDisplayTile(boolean var0);

    void setPosition(double var0, double var1, double var2);

    void setPositionAndRotation2(double var0, double var1, double var2, float var3, float var4, int var5, boolean var6);

    void setRollingAmplitude(int var0);

    void setRollingDirection(int var0);

    void setVelocity(double var0, double var1, double var2);

    void writeEntityToNBT(NBTTagCompound var0);

}
