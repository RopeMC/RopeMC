package de.ropemc.api.wrapper.net.minecraft.init;

import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.init.Blocks")
public interface Blocks {

    Block getRegisteredBlock(String var0);

}
