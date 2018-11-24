package de.ropemc.api.wrapper.net.minecraft.entity.item;

import de.ropemc.api.wrapper.net.minecraft.util.DamageSource;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.world.Explosion;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.item.EntityMinecartTNT")
public interface EntityMinecartTNT {

    boolean attackEntityFrom(DamageSource var0, float var1);

    void explodeCart(double var0);

    void fall(float var0, float var1);

    IBlockState getDefaultDisplayTile();

    float getExplosionResistance(Explosion var0, World var1, BlockPos var2, IBlockState var3);

    int getFuseTicks();

    //EntityMinecart$EnumMinecartType getMinecartType();

    void handleStatusUpdate(byte var0);

    void ignite();

    boolean isIgnited();

    void killMinecart(DamageSource var0);

    void onActivatorRailPass(int var0, int var1, int var2, boolean var3);

    void onUpdate();

    void readEntityFromNBT(NBTTagCompound var0);

    boolean verifyExplosion(Explosion var0, World var1, BlockPos var2, IBlockState var3, float var4);

    void writeEntityToNBT(NBTTagCompound var0);

}
