package de.ropemc.api.wrapper.net.minecraft.world;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.WorldServerMulti")
public interface WorldServerMulti {

    World init();

    void saveLevel();

}
