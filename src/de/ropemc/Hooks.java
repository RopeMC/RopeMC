package de.ropemc;

import de.ropemc.event.EventManager;
import de.ropemc.event.window.KeyPressedEvent;
import de.ropemc.event.window.WindowTitleChangeEvent;

public class Hooks {

    public static void titleHook(String title) {
        EventManager.callEvent(new WindowTitleChangeEvent(title));
    }

    public static void keyHooks(int key) {
        EventManager.callEvent(new KeyPressedEvent(key));
    }

}
