package de.ropemc.api.wrapper.net.minecraft.tileentity;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.tileentity.IHopper")
public interface IHopper {

    World getWorld();

    double getXPos();

    double getYPos();

    double getZPos();

}
