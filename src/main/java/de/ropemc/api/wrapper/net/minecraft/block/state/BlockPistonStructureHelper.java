package de.ropemc.api.wrapper.net.minecraft.block.state;

import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import java.util.List;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.state.BlockPistonStructureHelper")
public interface BlockPistonStructureHelper {

    boolean canMove();

    boolean func_177250_b(BlockPos var0);

    boolean func_177251_a(BlockPos var0);

    void func_177255_a(int var0, int var1);

    List getBlocksToDestroy();

    List getBlocksToMove();

}
