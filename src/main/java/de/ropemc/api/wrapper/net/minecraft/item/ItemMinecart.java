package de.ropemc.api.wrapper.net.minecraft.item;

//import de.ropemc.api.wrapper.net.minecraft.entity.item.EntityMinecart$EnumMinecartType;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.item.ItemMinecart")
public interface ItemMinecart {

    //EntityMinecart$EnumMinecartType access$000(ItemMinecart var0);

    boolean onItemUse(ItemStack var0, EntityPlayer var1, World var2, BlockPos var3, EnumFacing var4, float var5, float var6, float var7);

}
