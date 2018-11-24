package de.ropemc.api.wrapper.net.minecraft.client.audio;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.audio.SoundEventAccessor")
public interface SoundEventAccessor {

    Object cloneEntry();

    int getWeight();

}
