package de.ropemc.api.wrapper.net.minecraft.world.chunk.storage;

import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.net.minecraft.world.chunk.NibbleArray;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.chunk.storage.ExtendedBlockStorage")
public interface ExtendedBlockStorage {

    IBlockState get(int var0, int var1, int var2);

    Block getBlockByExtId(int var0, int var1, int var2);

    NibbleArray getBlocklightArray();

    char[] getData();

    int getExtBlockMetadata(int var0, int var1, int var2);

    int getExtBlocklightValue(int var0, int var1, int var2);

    int getExtSkylightValue(int var0, int var1, int var2);

    boolean getNeedsRandomTick();

    NibbleArray getSkylightArray();

    int getYLocation();

    boolean isEmpty();

    void removeInvalidBlocks();

    void set(int var0, int var1, int var2, IBlockState var3);

    void setBlocklightArray(NibbleArray var0);

    void setData(char[] var0);

    void setExtBlocklightValue(int var0, int var1, int var2, int var3);

    void setExtSkylightValue(int var0, int var1, int var2, int var3);

    void setSkylightArray(NibbleArray var0);

}
