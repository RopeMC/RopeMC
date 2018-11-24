package de.ropemc.api.wrapper.net.minecraft.stats;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.stats.IStatType")
public interface IStatType {

    String format(int var0);

}
