package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.IBlockAccess;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.BlockState;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.net.minecraft.creativetab.CreativeTabs;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.tileentity.TileEntity;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockOldLeaf")
public interface BlockOldLeaf {

    int colorMultiplier(IBlockAccess var0, BlockPos var1, int var2);

    BlockState createBlockState();

    ItemStack createStackedBlock(IBlockState var0);

    int damageDropped(IBlockState var0);

    void dropApple(World var0, BlockPos var1, IBlockState var2, int var3);

    int getMetaFromState(IBlockState var0);

    int getRenderColor(IBlockState var0);

    int getSaplingDropChance(IBlockState var0);

    IBlockState getStateFromMeta(int var0);

    void getSubBlocks(Item var0, CreativeTabs var1, List var2);

    //BlockPlanks$EnumType getWoodType(int var0);

    void harvestBlock(World var0, EntityPlayer var1, BlockPos var2, IBlockState var3, TileEntity var4);

}
