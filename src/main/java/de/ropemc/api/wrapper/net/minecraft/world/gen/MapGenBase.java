package de.ropemc.api.wrapper.net.minecraft.world.gen;

import de.ropemc.api.wrapper.net.minecraft.world.chunk.IChunkProvider;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.world.chunk.ChunkPrimer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.gen.MapGenBase")
public interface MapGenBase {

    void generate(IChunkProvider var0, World var1, int var2, int var3, ChunkPrimer var4);

    void recursiveGenerate(World var0, int var1, int var2, int var3, int var4, ChunkPrimer var5);

}
