package de.ropemc.api.wrapper.net.minecraft.world.gen;

import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.world.chunk.ChunkPrimer;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.gen.MapGenCaves")
public interface MapGenCaves {

    boolean func_175793_a(IBlockState var0, IBlockState var1);

    void func_180702_a(long var0, int var1, int var2, ChunkPrimer var3, double var4, double var5, double var6, float var7, float var8, float var9, int var10, int var11, double var12);

    void func_180703_a(long var0, int var1, int var2, ChunkPrimer var3, double var4, double var5, double var6);

    void recursiveGenerate(World var0, int var1, int var2, int var3, int var4, ChunkPrimer var5);

}
