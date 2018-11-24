package de.ropemc.api.wrapper.net.minecraft.world.gen.feature;

import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.Block;
//import de.ropemc.api.wrapper.net.minecraft.block.BlockLog$EnumAxis;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import java.util.Random;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.gen.feature.WorldGenBigTree")
public interface WorldGenBigTree {

    int checkBlockLine(BlockPos var0, BlockPos var1);

    void func_175904_e();

    void func_175937_a(BlockPos var0, BlockPos var1, Block var2);

    //BlockLog$EnumAxis func_175938_b(BlockPos var0, BlockPos var1);

    void func_181631_a(BlockPos var0, float var1, IBlockState var2);

    boolean generate(World var0, Random var1, BlockPos var2);

    void generateLeafNode(BlockPos var0);

    void generateLeafNodeBases();

    void generateLeafNodeList();

    void generateLeaves();

    void generateTrunk();

    int getGreatestDistance(BlockPos var0);

    float layerSize(int var0);

    boolean leafNodeNeedsBase(int var0);

    float leafSize(int var0);

    boolean validTreeLocation();

}
