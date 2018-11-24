package de.ropemc.api.wrapper.net.minecraft.item;

import de.ropemc.api.wrapper.net.minecraft.creativetab.CreativeTabs;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.item.ItemSkull")
public interface ItemSkull {

    String getItemStackDisplayName(ItemStack var0);

    int getMetadata(int var0);

    void getSubItems(Item var0, CreativeTabs var1, List var2);

    String getUnlocalizedName(ItemStack var0);

    boolean onItemUse(ItemStack var0, EntityPlayer var1, World var2, BlockPos var3, EnumFacing var4, float var5, float var6, float var7);

    boolean updateItemStackNBT(NBTTagCompound var0);

}
