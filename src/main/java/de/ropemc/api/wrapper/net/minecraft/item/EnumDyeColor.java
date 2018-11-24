package de.ropemc.api.wrapper.net.minecraft.item;

import de.ropemc.api.wrapper.net.minecraft.block.material.MapColor;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.item.EnumDyeColor")
public interface EnumDyeColor {

    EnumDyeColor byDyeDamage(int var0);

    EnumDyeColor byMetadata(int var0);

    int getDyeDamage();

    MapColor getMapColor();

    int getMetadata();

    String getName();

    String getUnlocalizedName();

}
