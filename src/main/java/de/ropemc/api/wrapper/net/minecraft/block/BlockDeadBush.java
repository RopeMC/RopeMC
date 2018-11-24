package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.net.minecraft.block.material.MapColor;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntity;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockDeadBush")
public interface BlockDeadBush {

    boolean canPlaceBlockOn(Block var0);

    Item getItemDropped(IBlockState var0, Random var1, int var2);

    MapColor getMapColor(IBlockState var0);

    void harvestBlock(World var0, EntityPlayer var1, BlockPos var2, IBlockState var3, TileEntity var4);

    boolean isReplaceable(World var0, BlockPos var1);

}
