package de.ropemc.api.wrapper.net.minecraft.block.state;

import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.block.Block;
import java.util.Collection;
//import com.google.common.collect.ImmutableList;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.state.BlockState")
public interface BlockState {

    List getAllowedValues();

    IBlockState getBaseState();

    Block getBlock();

    Collection getProperties();

    //ImmutableList getValidStates();

}
