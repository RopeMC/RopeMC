package de.ropemc.api.wrapper.net.minecraft.item;

import de.ropemc.api.wrapper.net.minecraft.block.Block;
//import com.google.common.collect.Multimap;
import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.item.ItemSword")
public interface ItemSword {

    boolean canHarvestBlock(Block var0);

    float getDamageVsEntity();

    boolean getIsRepairable(ItemStack var0, ItemStack var1);

    //Multimap getItemAttributeModifiers();

    int getItemEnchantability();

    EnumAction getItemUseAction(ItemStack var0);

    int getMaxItemUseDuration(ItemStack var0);

    float getStrVsBlock(ItemStack var0, Block var1);

    String getToolMaterialName();

    boolean hitEntity(ItemStack var0, EntityLivingBase var1, EntityLivingBase var2);

    boolean isFull3D();

    boolean onBlockDestroyed(ItemStack var0, World var1, Block var2, BlockPos var3, EntityLivingBase var4);

    ItemStack onItemRightClick(ItemStack var0, World var1, EntityPlayer var2);

}
