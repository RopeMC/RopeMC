package de.ropemc.api.wrapper.net.minecraft.world.gen.feature;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.properties.PropertyBool;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import java.util.Random;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.gen.feature.WorldGenTrees")
public interface WorldGenTrees {

    void func_181650_b(World var0, BlockPos var1, PropertyBool var2);

    void func_181651_a(World var0, BlockPos var1, PropertyBool var2);

    void func_181652_a(World var0, int var1, BlockPos var2, EnumFacing var3);

    boolean generate(World var0, Random var1, BlockPos var2);

}
