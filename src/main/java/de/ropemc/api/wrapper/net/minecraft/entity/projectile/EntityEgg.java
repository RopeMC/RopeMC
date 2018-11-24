package de.ropemc.api.wrapper.net.minecraft.entity.projectile;

import de.ropemc.api.wrapper.net.minecraft.util.MovingObjectPosition;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.projectile.EntityEgg")
public interface EntityEgg {

    void onImpact(MovingObjectPosition var0);

}
