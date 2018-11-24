package de.ropemc.api.wrapper.net.minecraft.item;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.item.ItemSlab")
public interface ItemSlab {

    boolean canPlaceBlockOnSide(World var0, BlockPos var1, EnumFacing var2, EntityPlayer var3, ItemStack var4);

    int getMetadata(int var0);

    String getUnlocalizedName(ItemStack var0);

    boolean onItemUse(ItemStack var0, EntityPlayer var1, World var2, BlockPos var3, EnumFacing var4, float var5, float var6, float var7);

    boolean tryPlace(ItemStack var0, World var1, BlockPos var2, Object var3);

}
