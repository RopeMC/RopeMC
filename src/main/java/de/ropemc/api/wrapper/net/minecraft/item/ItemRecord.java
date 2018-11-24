package de.ropemc.api.wrapper.net.minecraft.item;

import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.net.minecraft.util.BlockPos;
import de.ropemc.api.wrapper.net.minecraft.util.EnumFacing;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.item.ItemRecord")
public interface ItemRecord {

    void addInformation(ItemStack var0, EntityPlayer var1, List var2, boolean var3);

    EnumRarity getRarity(ItemStack var0);

    ItemRecord getRecord(String var0);

    String getRecordNameLocal();

    boolean onItemUse(ItemStack var0, EntityPlayer var1, World var2, BlockPos var3, EnumFacing var4, float var5, float var6, float var7);

}
