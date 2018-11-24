package de.ropemc.api.wrapper.net.minecraft.entity.passive;

import de.ropemc.api.wrapper.net.minecraft.entity.EntityAgeable;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.entity.passive.EntityMooshroom")
public interface EntityMooshroom {

    EntityAgeable createChild(EntityAgeable var0);

    boolean interact(EntityPlayer var0);

}
