package de.ropemc.api.wrapper.net.minecraft.world.gen.feature;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.block.properties.PropertyBool;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.gen.feature.WorldGenMegaJungle")
public interface WorldGenMegaJungle {

    void func_175930_c(World var0, BlockPos var1, int var2);

    void func_181632_a(World var0, Random var1, BlockPos var2, PropertyBool var3);

    boolean generate(World var0, Random var1, BlockPos var2);

}
