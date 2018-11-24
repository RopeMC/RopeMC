package de.ropemc.api.wrapper.net.minecraft.dispenser;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.dispenser.ILocation")
public interface ILocation {

    World getWorld();

}
