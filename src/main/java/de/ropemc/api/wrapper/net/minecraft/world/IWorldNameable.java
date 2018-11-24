package de.ropemc.api.wrapper.net.minecraft.world;

import de.ropemc.api.wrapper.net.minecraft.util.IChatComponent;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.IWorldNameable")
public interface IWorldNameable {

    IChatComponent getDisplayName();

    String getName();

    boolean hasCustomName();

}
