package de.ropemc.api.wrapper.net.minecraft.world.gen.feature;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.properties.PropertyBool;
import java.util.Random;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.gen.feature.WorldGenSwamp")
public interface WorldGenSwamp {

    void func_181647_a(World var0, BlockPos var1, PropertyBool var2);

    boolean generate(World var0, Random var1, BlockPos var2);

}
