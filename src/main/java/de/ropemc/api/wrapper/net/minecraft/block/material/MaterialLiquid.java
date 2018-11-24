package de.ropemc.api.wrapper.net.minecraft.block.material;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.material.MaterialLiquid")
public interface MaterialLiquid {

    boolean blocksMovement();

    boolean isLiquid();

    boolean isSolid();

}
