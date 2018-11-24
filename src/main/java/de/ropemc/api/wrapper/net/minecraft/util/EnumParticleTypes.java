package de.ropemc.api.wrapper.net.minecraft.util;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.EnumParticleTypes")
public interface EnumParticleTypes {

    int getArgumentCount();

    EnumParticleTypes getParticleFromId(int var0);

    int getParticleID();

    String getParticleName();

    String[] getParticleNames();

    boolean getShouldIgnoreRange();

    boolean hasArguments();

}
