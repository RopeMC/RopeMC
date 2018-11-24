package de.ropemc.api.wrapper.net.minecraft.item;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.net.minecraft.creativetab.CreativeTabs;
import java.util.List;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.item.ItemBlock")
public interface ItemBlock {

    boolean canPlaceBlockOnSide(World var0, BlockPos var1, EnumFacing var2, EntityPlayer var3, ItemStack var4);

    Block getBlock();

    CreativeTabs getCreativeTab();

    void getSubItems(Item var0, CreativeTabs var1, List var2);

    String getUnlocalizedName();

    String getUnlocalizedName(ItemStack var0);

    boolean onItemUse(ItemStack var0, EntityPlayer var1, World var2, BlockPos var3, EnumFacing var4, float var5, float var6, float var7);

    boolean setTileEntityNBT(World var0, EntityPlayer var1, BlockPos var2, ItemStack var3);

    Item setUnlocalizedName(String var0);

}
