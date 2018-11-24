package de.ropemc.api.wrapper.net.minecraft.item;

import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.creativetab.CreativeTabs;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.item.ItemDye")
public interface ItemDye {

    boolean applyBonemeal(ItemStack var0, World var1, BlockPos var2);

    void getSubItems(Item var0, CreativeTabs var1, List var2);

    String getUnlocalizedName(ItemStack var0);

    boolean itemInteractionForEntity(ItemStack var0, EntityPlayer var1, EntityLivingBase var2);

    boolean onItemUse(ItemStack var0, EntityPlayer var1, World var2, BlockPos var3, EnumFacing var4, float var5, float var6, float var7);

    void spawnBonemealParticles(World var0, BlockPos var1, int var2);

}
