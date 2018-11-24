package de.ropemc.api.wrapper.net.minecraft.util;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.MouseHelper")
public interface MouseHelper {

    void grabMouseCursor();

    void mouseXYChange();

    void ungrabMouseCursor();

}
