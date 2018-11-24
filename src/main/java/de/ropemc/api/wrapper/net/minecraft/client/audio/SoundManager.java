package de.ropemc.api.wrapper.net.minecraft.client.audio;

//import org.apache.logging.log4j.Logger;
import de.ropemc.api.wrapper.net.minecraft.client.settings.GameSettings;
//import org.apache.logging.log4j.Marker;
import de.ropemc.api.wrapper.net.minecraft.util.ResourceLocation;
import java.net.URL;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.audio.SoundManager")
public interface SoundManager {

    //Logger access$000();

    //SoundManager$SoundSystemStarterThread access$100(SoundManager var0);

    //SoundManager$SoundSystemStarterThread access$102(SoundManager var0, SoundManager$SoundSystemStarterThread var1);

    //boolean access$302(SoundManager var0, boolean var1);

    //GameSettings access$400(SoundManager var0);

    //Marker access$500();

    float getNormalizedPitch(ISound var0, SoundPoolEntry var1);

    float getNormalizedVolume(ISound var0, SoundPoolEntry var1, SoundCategory var2);

    float getSoundCategoryVolume(SoundCategory var0);

    URL getURLForSoundResource(ResourceLocation var0);

    boolean isSoundPlaying(ISound var0);

    void loadSoundSystem();

    void pauseAllSounds();

    void playDelayedSound(ISound var0, int var1);

    void playSound(ISound var0);

    void reloadSoundSystem();

    void resumeAllSounds();

    void setListener(EntityPlayer var0, float var1);

    void setSoundCategoryVolume(SoundCategory var0, float var1);

    void stopAllSounds();

    void stopSound(ISound var0);

    void unloadSoundSystem();

    void updateAllSounds();

}
