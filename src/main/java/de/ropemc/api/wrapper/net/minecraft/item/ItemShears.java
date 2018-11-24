package de.ropemc.api.wrapper.net.minecraft.item;

import de.ropemc.api.wrapper.net.minecraft.block.Block;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.item.ItemShears")
public interface ItemShears {

    boolean canHarvestBlock(Block var0);

    float getStrVsBlock(ItemStack var0, Block var1);

    boolean onBlockDestroyed(ItemStack var0, World var1, Block var2, BlockPos var3, EntityLivingBase var4);

}
