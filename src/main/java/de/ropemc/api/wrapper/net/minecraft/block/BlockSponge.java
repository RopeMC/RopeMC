package de.ropemc.api.wrapper.net.minecraft.block;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.block.state.BlockState;
import de.ropemc.api.wrapper.net.minecraft.block.state.IBlockState;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.net.minecraft.creativetab.CreativeTabs;
import java.util.List;
import java.util.Random;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.block.BlockSponge")
public interface BlockSponge {

    boolean absorb(World var0, BlockPos var1);

    BlockState createBlockState();

    int damageDropped(IBlockState var0);

    String getLocalizedName();

    int getMetaFromState(IBlockState var0);

    IBlockState getStateFromMeta(int var0);

    void getSubBlocks(Item var0, CreativeTabs var1, List var2);

    void onBlockAdded(World var0, BlockPos var1, IBlockState var2);

    void onNeighborBlockChange(World var0, BlockPos var1, IBlockState var2, Block var3);

    void randomDisplayTick(World var0, BlockPos var1, IBlockState var2, Random var3);

    void tryAbsorb(World var0, BlockPos var1, IBlockState var2);

}
