package de.ropemc.api.wrapper.net.minecraft.block.state;

import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntity;
//import com.google.common.base.Predicate;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.state.BlockWorldState")
public interface BlockWorldState {

    IBlockState getBlockState();

    BlockPos getPos();

    TileEntity getTileEntity();

    //Predicate hasState(Predicate var0);

}
