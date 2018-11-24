package de.ropemc.api.wrapper.net.minecraft.client.audio;

import java.util.Map;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.audio.SoundRegistry")
public interface SoundRegistry {

    void clearMap();

    Map createUnderlyingMap();

    void registerSound(SoundEventAccessorComposite var0);

}
