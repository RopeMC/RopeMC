package de.ropemc.api.wrapper.net.minecraft.item;

import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.creativetab.CreativeTabs;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.item.ItemBanner")
public interface ItemBanner {

    void addInformation(ItemStack var0, EntityPlayer var1, List var2, boolean var3);

    EnumDyeColor getBaseColor(ItemStack var0);

    int getColorFromItemStack(ItemStack var0, int var1);

    CreativeTabs getCreativeTab();

    String getItemStackDisplayName(ItemStack var0);

    void getSubItems(Item var0, CreativeTabs var1, List var2);

    boolean onItemUse(ItemStack var0, EntityPlayer var1, World var2, BlockPos var3, EnumFacing var4, float var5, float var6, float var7);

}
