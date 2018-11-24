package de.ropemc.api.wrapper.net.minecraft.client.resources.data;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.resources.data.AnimationFrame")
public interface AnimationFrame {

    int getFrameIndex();

    int getFrameTime();

    boolean hasNoTime();

}
