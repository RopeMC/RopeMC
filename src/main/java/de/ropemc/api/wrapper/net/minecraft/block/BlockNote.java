package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntity;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockNote")
public interface BlockNote {

    TileEntity createNewTileEntity(World var0, int var1);

    String getInstrument(int var0);

    int getRenderType();

    boolean onBlockActivated(World var0, BlockPos var1, IBlockState var2, EntityPlayer var3, EnumFacing var4, float var5, float var6, float var7);

    void onBlockClicked(World var0, BlockPos var1, EntityPlayer var2);

    boolean onBlockEventReceived(World var0, BlockPos var1, IBlockState var2, int var3, int var4);

    void onNeighborBlockChange(World var0, BlockPos var1, IBlockState var2, Block var3);

}
