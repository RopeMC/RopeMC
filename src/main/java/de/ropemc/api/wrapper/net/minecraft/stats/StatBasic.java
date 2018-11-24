package de.ropemc.api.wrapper.net.minecraft.stats;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.stats.StatBasic")
public interface StatBasic {

    StatBase registerStat();

}
