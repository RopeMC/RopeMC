package de.ropemc.api.wrapper.net.minecraft.item;

import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.creativetab.CreativeTabs;
import de.ropemc.api.wrapper.net.minecraft.world.World;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.item.ItemPotion")
public interface ItemPotion {

    void addInformation(ItemStack var0, EntityPlayer var1, List var2, boolean var3);

    int getColorFromDamage(int var0);

    int getColorFromItemStack(ItemStack var0, int var1);

    List getEffects(int var0);

    List getEffects(ItemStack var0);

    String getItemStackDisplayName(ItemStack var0);

    EnumAction getItemUseAction(ItemStack var0);

    int getMaxItemUseDuration(ItemStack var0);

    void getSubItems(Item var0, CreativeTabs var1, List var2);

    boolean hasEffect(ItemStack var0);

    boolean isEffectInstant(int var0);

    boolean isSplash(int var0);

    ItemStack onItemRightClick(ItemStack var0, World var1, EntityPlayer var2);

    ItemStack onItemUseFinish(ItemStack var0, World var1, EntityPlayer var2);

}
