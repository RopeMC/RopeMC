package de.ropemc.api.wrapper.net.minecraft.item;

import de.ropemc.api.wrapper.net.minecraft.entity.EntityLivingBase;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.item.ItemSaddle")
public interface ItemSaddle {

    boolean hitEntity(ItemStack var0, EntityLivingBase var1, EntityLivingBase var2);

    boolean itemInteractionForEntity(ItemStack var0, EntityPlayer var1, EntityLivingBase var2);

}
