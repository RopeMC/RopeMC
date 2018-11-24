package de.ropemc.api.wrapper.net.minecraft.world.border;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.world.border.IBorderListener")
public interface IBorderListener {

    void onCenterChanged(WorldBorder var0, double var1, double var2);

    void onDamageAmountChanged(WorldBorder var0, double var1);

    void onDamageBufferChanged(WorldBorder var0, double var1);

    void onSizeChanged(WorldBorder var0, double var1);

    void onTransitionStarted(WorldBorder var0, double var1, double var2, long var3);

    void onWarningDistanceChanged(WorldBorder var0, int var1);

    void onWarningTimeChanged(WorldBorder var0, int var1);

}
