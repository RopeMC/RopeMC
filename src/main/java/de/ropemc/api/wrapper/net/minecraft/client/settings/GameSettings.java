package de.ropemc.api.wrapper.net.minecraft.client.settings;

import java.util.Set;
import de.ropemc.api.wrapper.net.minecraft.client.audio.SoundCategory;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EnumPlayerModelParts;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.settings.GameSettings")
public interface GameSettings {

    int func_181147_e();

    boolean func_181148_f();

    //String getKeyBinding(GameSettings$Options var0);

    String getKeyDisplayString(int var0);

    Set getModelParts();

    //float getOptionFloatValue(GameSettings$Options var0);

    //boolean getOptionOrdinalValue(GameSettings$Options var0);

    float getSoundLevel(SoundCategory var0);

    String getTranslation(String[] var0, int var1);

    boolean isKeyDown(KeyBinding var0);

    void loadOptions();

    float parseFloat(String var0);

    void saveOptions();

    void sendSettingsToServer();

    void setModelPartEnabled(EnumPlayerModelParts var0, boolean var1);

    //void setOptionFloatValue(GameSettings$Options var0, float var1);

    void setOptionKeyBinding(KeyBinding var0, int var1);

    //void setOptionValue(GameSettings$Options var0, int var1);

    void setSoundLevel(SoundCategory var0, float var1);

    void switchModelPartEnabled(EnumPlayerModelParts var0);

}
