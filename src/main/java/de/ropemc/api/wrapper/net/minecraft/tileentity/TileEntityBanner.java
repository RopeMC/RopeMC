package de.ropemc.api.wrapper.net.minecraft.tileentity;

import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagCompound;
import de.ropemc.api.wrapper.net.minecraft.nbt.NBTTagList;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import java.util.List;
import de.ropemc.api.wrapper.net.minecraft.network.Packet;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.tileentity.TileEntityBanner")
public interface TileEntityBanner {

    String func_175116_e();

    void func_181020_a(NBTTagCompound var0, int var1, NBTTagList var2);

    NBTTagList func_181021_d();

    int getBaseColor();

    int getBaseColor(ItemStack var0);

    List getColorList();

    Packet getDescriptionPacket();

    List getPatternList();

    int getPatterns(ItemStack var0);

    void initializeBannerData();

    void readFromNBT(NBTTagCompound var0);

    void removeBannerData(ItemStack var0);

    void setItemValues(ItemStack var0);

    void writeToNBT(NBTTagCompound var0);

}
