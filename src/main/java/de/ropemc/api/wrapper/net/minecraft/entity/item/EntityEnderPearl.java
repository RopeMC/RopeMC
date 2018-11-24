package de.ropemc.api.wrapper.net.minecraft.entity.item;

import de.ropemc.api.wrapper.net.minecraft.util.MovingObjectPosition;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.item.EntityEnderPearl")
public interface EntityEnderPearl {

    void onImpact(MovingObjectPosition var0);

    void onUpdate();

}
