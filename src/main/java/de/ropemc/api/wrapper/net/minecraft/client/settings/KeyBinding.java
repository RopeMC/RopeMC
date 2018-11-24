package de.ropemc.api.wrapper.net.minecraft.client.settings;

import java.util.Set;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.client.settings.KeyBinding")
public interface KeyBinding {

    int compareTo(KeyBinding var0);

    String getKeyCategory();

    int getKeyCode();

    int getKeyCodeDefault();

    String getKeyDescription();

    Set getKeybinds();

    boolean isKeyDown();

    boolean isPressed();

    void onTick(int var0);

    void resetKeyBindingArrayAndHash();

    void setKeyBindState(int var0, boolean var1);

    void setKeyCode(int var0);

    void unPressAllKeys();

    void unpressKey();

}
