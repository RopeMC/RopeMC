package de.ropemc.event.window;

import de.ropemc.api.Minecraft;
import de.ropemc.api.Player;
import de.ropemc.event.Event;

public class KeyPressedEvent extends Event {

    private int key;

    public KeyPressedEvent(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public boolean isIngame() {
        return Player.getPlayer() != null;
    }
}
