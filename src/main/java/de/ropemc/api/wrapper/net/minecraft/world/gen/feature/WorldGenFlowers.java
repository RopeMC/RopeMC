package de.ropemc.api.wrapper.net.minecraft.world.gen.feature;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.BlockFlower;
//import de.ropemc.api.wrapper.net.minecraft.block.BlockFlower$EnumFlowerType;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.gen.feature.WorldGenFlowers")
public interface WorldGenFlowers {

    boolean generate(World var0, Random var1, BlockPos var2);

    //void setGeneratedBlock(BlockFlower var0, BlockFlower$EnumFlowerType var1);

}
