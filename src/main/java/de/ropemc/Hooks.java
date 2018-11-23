package de.ropemc;

import de.ropemc.api.Keyboard;
import de.ropemc.api.event.EventManager;
import de.ropemc.api.event.game.GameStartEvent;
import de.ropemc.api.event.gui.Render2DEvent;
import de.ropemc.api.event.input.KeyPressedEvent;

import java.util.ArrayList;
import java.util.List;

public class Hooks {
    private static List<Integer> lastkeys = new ArrayList<Integer>();

    /**
     * Triggers a KeyPressedEvent
     *
     * @param key
     */
    @Deprecated
    public static void keyHook(int key) {

    }

    public static void runTickHook() {
        for (int i = 1; i < 255; i++) {
            if (Keyboard.isKeyDown(i)) {
                if (!lastkeys.contains(new Integer(i))) {
                    lastkeys.add(i);
                    EventManager.callEvent(new KeyPressedEvent(i));
                }
            } else {
                if (lastkeys.contains(new Integer(i)))
                    lastkeys.remove(new Integer(i));
            }
        }
    }

    public static void onGameStartHook() {
        EventManager.callEvent(new GameStartEvent());
    }

    /**
     * Triggers a Draw2DEvent
     */
    public static void draw2DHook() {
        EventManager.callEvent(new Render2DEvent());
    }
}
