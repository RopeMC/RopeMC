package de.ropemc.api.wrapper.net.minecraft.world;

import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.Teleporter")
public interface Teleporter {

    boolean makePortal(Entity var0);

    boolean placeInExistingPortal(Entity var0, float var1);

    void placeInPortal(Entity var0, float var1);

    void removeStalePortalLocations(long var0);

}
