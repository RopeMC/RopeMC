package de.ropemc.api.wrapper.net.minecraft.block.state.pattern;

import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.state.pattern.BlockHelper")
public interface BlockHelper {

    boolean apply(IBlockState var0);

    BlockHelper forBlock(Block var0);

}
