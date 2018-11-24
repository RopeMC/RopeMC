package de.ropemc.api.wrapper.net.minecraft.world.gen.feature;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
//import de.ropemc.api.wrapper.net.minecraft.block.BlockDoublePlant$EnumPlantType;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.gen.feature.WorldGenDoublePlant")
public interface WorldGenDoublePlant {

    boolean generate(World var0, Random var1, BlockPos var2);

    //void setPlantType(BlockDoublePlant$EnumPlantType var0);

}
