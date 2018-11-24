package de.ropemc.api.wrapper.net.minecraft.world.gen;

import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.gen.FlatLayerInfo")
public interface FlatLayerInfo {

    Block func_151536_b();

    IBlockState func_175900_c();

    int getFillBlockMeta();

    int getLayerCount();

    int getMinY();

    void setMinY(int var0);

}
