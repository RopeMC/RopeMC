package de.ropemc.api.wrapper.net.minecraft.dispenser;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.dispenser.IPosition")
public interface IPosition {

    double getX();

    double getY();

    double getZ();

}
