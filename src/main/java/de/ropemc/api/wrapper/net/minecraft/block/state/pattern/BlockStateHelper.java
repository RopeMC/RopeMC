package de.ropemc.api.wrapper.net.minecraft.block.state.pattern;

import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.net.minecraft.block.properties.IProperty;
//import com.google.common.base.Predicate;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.state.pattern.BlockStateHelper")
public interface BlockStateHelper {

    boolean apply(IBlockState var0);

    BlockStateHelper forBlock(Block var0);

    //BlockStateHelper where(IProperty var0, Predicate var1);

}
