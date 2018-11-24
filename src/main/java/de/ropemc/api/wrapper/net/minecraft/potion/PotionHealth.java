package de.ropemc.api.wrapper.net.minecraft.potion;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.potion.PotionHealth")
public interface PotionHealth {

    boolean isInstant();

    boolean isReady(int var0, int var1);

}
