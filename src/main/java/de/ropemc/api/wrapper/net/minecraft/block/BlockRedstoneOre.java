package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockRedstoneOre")
public interface BlockRedstoneOre {

    void activate(World var0, BlockPos var1);

    ItemStack createStackedBlock(IBlockState var0);

    void dropBlockAsItemWithChance(World var0, BlockPos var1, IBlockState var2, float var3, int var4);

    Item getItemDropped(IBlockState var0, Random var1, int var2);

    boolean onBlockActivated(World var0, BlockPos var1, IBlockState var2, EntityPlayer var3, EnumFacing var4, float var5, float var6, float var7);

    void onBlockClicked(World var0, BlockPos var1, EntityPlayer var2);

    void onEntityCollidedWithBlock(World var0, BlockPos var1, Entity var2);

    int quantityDropped(Random var0);

    int quantityDroppedWithBonus(int var0, Random var1);

    void randomDisplayTick(World var0, BlockPos var1, IBlockState var2, Random var3);

    void spawnParticles(World var0, BlockPos var1);

    int tickRate(World var0);

    void updateTick(World var0, BlockPos var1, IBlockState var2, Random var3);

}
