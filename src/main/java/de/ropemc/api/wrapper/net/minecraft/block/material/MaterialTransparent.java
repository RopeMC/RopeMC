package de.ropemc.api.wrapper.net.minecraft.block.material;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.material.MaterialTransparent")
public interface MaterialTransparent {

    boolean blocksLight();

    boolean blocksMovement();

    boolean isSolid();

}
