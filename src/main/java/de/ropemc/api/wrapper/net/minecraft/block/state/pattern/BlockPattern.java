package de.ropemc.api.wrapper.net.minecraft.block.state.pattern;

import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
//import com.google.common.cache.LoadingCache;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.state.pattern.BlockPattern")
public interface BlockPattern {

    //BlockPattern$PatternHelper checkPatternAt(BlockPos var0, EnumFacing var1, EnumFacing var2, LoadingCache var3);

    //LoadingCache func_181627_a(World var0, boolean var1);

    int getPalmLength();

    int getThumbLength();

    //BlockPattern$PatternHelper match(World var0, BlockPos var1);

    BlockPos translateOffset(BlockPos var0, EnumFacing var1, EnumFacing var2, int var3, int var4, int var5);

}
