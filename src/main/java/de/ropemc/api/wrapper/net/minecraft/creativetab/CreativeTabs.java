package de.ropemc.api.wrapper.net.minecraft.creativetab;

import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.enchantment.EnumEnchantmentType;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.net.minecraft.item.Item;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.creativetab.CreativeTabs")
public interface CreativeTabs {

    void addEnchantmentBooksToList(List var0, EnumEnchantmentType[] var1);

    void displayAllReleventItems(List var0);

    boolean drawInForegroundOfTab();

    String getBackgroundImageName();

    int getIconItemDamage();

    ItemStack getIconItemStack();

    EnumEnchantmentType[] getRelevantEnchantmentTypes();

    int getTabColumn();

    Item getTabIconItem();

    int getTabIndex();

    String getTabLabel();

    String getTranslatedTabLabel();

    boolean hasRelevantEnchantmentType(EnumEnchantmentType var0);

    boolean isTabInFirstRow();

    CreativeTabs setBackgroundImageName(String var0);

    CreativeTabs setNoScrollbar();

    CreativeTabs setNoTitle();

    CreativeTabs setRelevantEnchantmentTypes(EnumEnchantmentType[] var0);

    boolean shouldHidePlayerInventory();

}
