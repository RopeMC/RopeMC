package de.ropemc.api.wrapper.net.minecraft.client.renderer.chunk;

import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import java.util.Set;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.renderer.chunk.VisGraph")
public interface VisGraph {

    SetVisibility computeVisibility();

    int func_178603_a(int var0, EnumFacing var1);

    Set func_178604_a(int var0);

    void func_178606_a(BlockPos var0);

    Set func_178609_b(BlockPos var0);

    void func_178610_a(int var0, Set var1);

    int getIndex(int var0, int var1, int var2);

    int getIndex(BlockPos var0);

}
