package de.ropemc.api.wrapper.net.minecraft.entity.projectile;

import de.ropemc.api.wrapper.net.minecraft.util.DamageSource;
import de.ropemc.api.wrapper.net.minecraft.world.Explosion;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.util.MovingObjectPosition;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.projectile.EntityWitherSkull")
public interface EntityWitherSkull {

    boolean attackEntityFrom(DamageSource var0, float var1);

    boolean canBeCollidedWith();

    void entityInit();

    float getExplosionResistance(Explosion var0, World var1, BlockPos var2, IBlockState var3);

    float getMotionFactor();

    boolean isBurning();

    boolean isInvulnerable();

    void onImpact(MovingObjectPosition var0);

    void setInvulnerable(boolean var0);

}
