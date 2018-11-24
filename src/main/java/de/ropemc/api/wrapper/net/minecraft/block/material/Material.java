package de.ropemc.api.wrapper.net.minecraft.block.material;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.material.Material")
public interface Material {

    boolean blocksLight();

    boolean blocksMovement();

    boolean getCanBurn();

    MapColor getMaterialMapColor();

    int getMaterialMobility();

    boolean isLiquid();

    boolean isOpaque();

    boolean isReplaceable();

    boolean isSolid();

    boolean isToolNotRequired();

    Material setAdventureModeExempt();

    Material setBurning();

    Material setImmovableMobility();

    Material setNoPushMobility();

    Material setReplaceable();

    Material setRequiresTool();

    Material setTranslucent();

}
