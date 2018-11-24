package de.ropemc.api.wrapper.net.minecraft.util;

import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagList;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.Rotations")
public interface Rotations {

    float getX();

    float getY();

    float getZ();

    NBTTagList writeToNBT();

}
