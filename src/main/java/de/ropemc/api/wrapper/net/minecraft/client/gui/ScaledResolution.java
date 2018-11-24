package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.gui.ScaledResolution")
public interface ScaledResolution {

    int getScaleFactor();

    int getScaledHeight();

    double getScaledHeight_double();

    int getScaledWidth();

    double getScaledWidth_double();

}
