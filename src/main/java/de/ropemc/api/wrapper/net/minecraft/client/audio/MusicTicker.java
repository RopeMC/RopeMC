package de.ropemc.api.wrapper.net.minecraft.client.audio;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.audio.MusicTicker")
public interface MusicTicker {

    void func_181557_a();

    //void func_181558_a(MusicTicker$MusicType var0);

    void update();

}
