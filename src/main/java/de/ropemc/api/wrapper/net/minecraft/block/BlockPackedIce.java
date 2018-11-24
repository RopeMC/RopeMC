package de.ropemc.api.wrapper.net.minecraft.block;

import java.util.Random;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockPackedIce")
public interface BlockPackedIce {

    int quantityDropped(Random var0);

}
