package de.ropemc.api.wrapper.net.minecraft.client.audio;

import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.audio.SoundPoolEntry")
public interface SoundPoolEntry {

    double getPitch();

    ResourceLocation getSoundPoolEntryLocation();

    double getVolume();

    boolean isStreamingSound();

    void setPitch(double var0);

    void setVolume(double var0);

}
