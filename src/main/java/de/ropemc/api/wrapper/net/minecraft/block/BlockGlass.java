package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.util.EnumWorldBlockLayer;
import java.util.Random;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockGlass")
public interface BlockGlass {

    boolean canSilkHarvest();

    EnumWorldBlockLayer getBlockLayer();

    boolean isFullCube();

    int quantityDropped(Random var0);

}
