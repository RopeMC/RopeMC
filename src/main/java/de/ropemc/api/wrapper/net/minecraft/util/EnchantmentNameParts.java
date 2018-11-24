package de.ropemc.api.wrapper.net.minecraft.util;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.EnchantmentNameParts")
public interface EnchantmentNameParts {

    String generateNewRandomName();

    EnchantmentNameParts getInstance();

    void reseedRandomGenerator(long var0);

}
