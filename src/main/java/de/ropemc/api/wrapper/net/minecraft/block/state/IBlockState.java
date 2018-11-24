package de.ropemc.api.wrapper.net.minecraft.block.state;

import de.ropemc.api.wrapper.net.minecraft.block.properties.IProperty;
import de.ropemc.api.wrapper.net.minecraft.block.Block;
//import com.google.common.collect.ImmutableMap;
import java.util.Collection;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.state.IBlockState")
public interface IBlockState {

    IBlockState cycleProperty(IProperty var0);

    Block getBlock();

    //ImmutableMap getProperties();

    Collection getPropertyNames();

    Comparable getValue(IProperty var0);

    IBlockState withProperty(IProperty var0, Comparable var1);

}
