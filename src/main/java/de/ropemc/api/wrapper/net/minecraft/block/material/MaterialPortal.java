package de.ropemc.api.wrapper.net.minecraft.block.material;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.material.MaterialPortal")
public interface MaterialPortal {

    boolean blocksLight();

    boolean blocksMovement();

    boolean isSolid();

}
