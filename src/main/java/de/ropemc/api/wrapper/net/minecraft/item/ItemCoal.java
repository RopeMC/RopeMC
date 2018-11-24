package de.ropemc.api.wrapper.net.minecraft.item;

import de.ropemc.api.wrapper.net.minecraft.creativetab.CreativeTabs;
import java.util.List;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.item.ItemCoal")
public interface ItemCoal {

    void getSubItems(Item var0, CreativeTabs var1, List var2);

    String getUnlocalizedName(ItemStack var0);

}
