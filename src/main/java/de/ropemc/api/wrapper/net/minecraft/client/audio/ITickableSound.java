package de.ropemc.api.wrapper.net.minecraft.client.audio;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.audio.ITickableSound")
public interface ITickableSound {

    boolean isDonePlaying();

}
