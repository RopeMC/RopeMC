package de.ropemc.api.wrapper.net.minecraft.client.audio;

import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.audio.SoundCategory")
public interface SoundCategory {

    SoundCategory getCategory(String var0);

    int getCategoryId();

    String getCategoryName();

}
