package de.ropemc.api.wrapper.net.minecraft.entity.item;

import de.ropemc.api.wrapper.net.minecraft.util.MovingObjectPosition;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.item.EntityExpBottle")
public interface EntityExpBottle {

    float getGravityVelocity();

    float getInaccuracy();

    float getVelocity();

    void onImpact(MovingObjectPosition var0);

}
