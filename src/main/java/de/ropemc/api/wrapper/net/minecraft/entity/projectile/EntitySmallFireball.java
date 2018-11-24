package de.ropemc.api.wrapper.net.minecraft.entity.projectile;

import de.ropemc.api.wrapper.net.minecraft.util.DamageSource;
import de.ropemc.api.wrapper.net.minecraft.util.MovingObjectPosition;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.projectile.EntitySmallFireball")
public interface EntitySmallFireball {

    boolean attackEntityFrom(DamageSource var0, float var1);

    boolean canBeCollidedWith();

    void onImpact(MovingObjectPosition var0);

}
