package de.ropemc.api.wrapper.net.minecraft.client.audio;

import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.audio.PositionedSound")
public interface PositionedSound {

    boolean canRepeat();

    //ISound$AttenuationType getAttenuationType();

    float getPitch();

    int getRepeatDelay();

    ResourceLocation getSoundLocation();

    float getVolume();

    float getXPosF();

    float getYPosF();

    float getZPosF();

}
