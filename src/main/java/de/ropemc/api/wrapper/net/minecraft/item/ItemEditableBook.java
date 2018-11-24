package de.ropemc.api.wrapper.net.minecraft.item;

import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.item.ItemEditableBook")
public interface ItemEditableBook {

    void addInformation(ItemStack var0, EntityPlayer var1, List var2, boolean var3);

    int getGeneration(ItemStack var0);

    String getItemStackDisplayName(ItemStack var0);

    boolean hasEffect(ItemStack var0);

    ItemStack onItemRightClick(ItemStack var0, World var1, EntityPlayer var2);

    void resolveContents(ItemStack var0, EntityPlayer var1);

    boolean validBookTagContents(NBTTagCompound var0);

}
