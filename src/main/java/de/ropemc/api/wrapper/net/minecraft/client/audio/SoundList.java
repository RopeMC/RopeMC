package de.ropemc.api.wrapper.net.minecraft.client.audio;

import java.util.List;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.audio.SoundList")
public interface SoundList {

    boolean canReplaceExisting();

    SoundCategory getSoundCategory();

    List getSoundList();

    void setReplaceExisting(boolean var0);

    void setSoundCategory(SoundCategory var0);

}
