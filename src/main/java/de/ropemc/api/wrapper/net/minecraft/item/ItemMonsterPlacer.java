package de.ropemc.api.wrapper.net.minecraft.item;

import de.ropemc.api.wrapper.net.minecraft.creativetab.CreativeTabs;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.item.ItemMonsterPlacer")
public interface ItemMonsterPlacer {

    int getColorFromItemStack(ItemStack var0, int var1);

    String getItemStackDisplayName(ItemStack var0);

    void getSubItems(Item var0, CreativeTabs var1, List var2);

    ItemStack onItemRightClick(ItemStack var0, World var1, EntityPlayer var2);

    boolean onItemUse(ItemStack var0, EntityPlayer var1, World var2, BlockPos var3, EnumFacing var4, float var5, float var6, float var7);

    Entity spawnCreature(World var0, int var1, double var2, double var3, double var4);

}
