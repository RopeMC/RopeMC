package de.ropemc.api.wrapper.net.minecraft.client.audio;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.audio.ISoundEventAccessor")
public interface ISoundEventAccessor {

    Object cloneEntry();

    int getWeight();

}
