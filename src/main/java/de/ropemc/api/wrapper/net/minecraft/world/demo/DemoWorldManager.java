package de.ropemc.api.wrapper.net.minecraft.world.demo;

import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.demo.DemoWorldManager")
public interface DemoWorldManager {

    boolean activateBlockOrUseItem(EntityPlayer var0, World var1, ItemStack var2, BlockPos var3, EnumFacing var4, float var5, float var6, float var7);

    void blockRemoving(BlockPos var0);

    void onBlockClicked(BlockPos var0, EnumFacing var1);

    void sendDemoReminder();

    boolean tryHarvestBlock(BlockPos var0);

    boolean tryUseItem(EntityPlayer var0, World var1, ItemStack var2);

    void updateBlockRemoving();

}
