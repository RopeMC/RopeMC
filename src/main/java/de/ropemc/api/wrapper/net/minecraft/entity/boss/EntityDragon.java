package de.ropemc.api.wrapper.net.minecraft.entity.boss;

import de.ropemc.api.wrapper.net.minecraft.util.DamageSource;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.util.AxisAlignedBB;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.boss.EntityDragon")
public interface EntityDragon {

    void applyEntityAttributes();

    boolean attackDragonFrom(DamageSource var0, float var1);

    void attackEntitiesInList(List var0);

    boolean attackEntityFrom(DamageSource var0, float var1);

    boolean attackEntityFromPart(EntityDragonPart var0, DamageSource var1, float var2);

    boolean canBeCollidedWith();

    void collideWithEntities(List var0);

    void despawnEntity();

    boolean destroyBlocksInAABB(AxisAlignedBB var0);

    void entityInit();

    void generatePortal(BlockPos var0);

    String getHurtSound();

    String getLivingSound();

    double[] getMovementOffsets(int var0, float var1);

    Entity[] getParts();

    float getSoundVolume();

    World getWorld();

    void onDeathUpdate();

    void onKillCommand();

    void onLivingUpdate();

    void setNewTarget();

    float simplifyAngle(double var0);

    void updateDragonEnderCrystal();

}
