package de.ropemc.api.wrapper.net.minecraft.profiler;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.profiler.IPlayerUsage")
public interface IPlayerUsage {

    void addServerStatsToSnooper(PlayerUsageSnooper var0);

    void addServerTypeToSnooper(PlayerUsageSnooper var0);

    boolean isSnooperEnabled();

}
