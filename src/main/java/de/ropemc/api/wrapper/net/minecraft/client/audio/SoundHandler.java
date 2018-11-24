package de.ropemc.api.wrapper.net.minecraft.client.audio;

import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import java.io.InputStream;
import java.util.Map;
import de.ropemc.api.wrapper.net.minecraft.client.resources.IResourceManager;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.audio.SoundHandler")
public interface SoundHandler {

    //SoundRegistry access$000(SoundHandler var0);

    SoundEventAccessorComposite getRandomSoundFromCategories(SoundCategory[] var0);

    SoundEventAccessorComposite getSound(ResourceLocation var0);

    Map getSoundMap(InputStream var0);

    boolean isSoundPlaying(ISound var0);

    void loadSoundResource(ResourceLocation var0, SoundList var1);

    void onResourceManagerReload(IResourceManager var0);

    void pauseSounds();

    void playDelayedSound(ISound var0, int var1);

    void playSound(ISound var0);

    void resumeSounds();

    void setListener(EntityPlayer var0, float var1);

    void setSoundLevel(SoundCategory var0, float var1);

    void stopSound(ISound var0);

    void stopSounds();

    void unloadSounds();

    void update();

}
