package de.ropemc.api.wrapper.net.minecraft.item;

import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTBase;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.item.ItemFireworkCharge")
public interface ItemFireworkCharge {

    void addExplosionInfo(NBTTagCompound var0, List var1);

    void addInformation(ItemStack var0, EntityPlayer var1, List var2, boolean var3);

    int getColorFromItemStack(ItemStack var0, int var1);

    NBTBase getExplosionTag(ItemStack var0, String var1);

}
