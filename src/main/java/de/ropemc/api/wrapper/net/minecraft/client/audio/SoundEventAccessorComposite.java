package de.ropemc.api.wrapper.net.minecraft.client.audio;

import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.audio.SoundEventAccessorComposite")
public interface SoundEventAccessorComposite {

    void addSoundToEventPool(ISoundEventAccessor var0);

    Object cloneEntry();

    SoundCategory getSoundCategory();

    ResourceLocation getSoundEventLocation();

    int getWeight();

}
