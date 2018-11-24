package de.ropemc.api.wrapper.net.minecraft.util;

import java.util.Random;
import de.ropemc.api.wrapper.net.minecraft.item.ItemStack;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.WeightedRandomFishable")
public interface WeightedRandomFishable {

    ItemStack getItemStack(Random var0);

    WeightedRandomFishable setEnchantable();

    WeightedRandomFishable setMaxDamagePercent(float var0);

}
