package de.ropemc.event.window;

import de.ropemc.event.Event;

public class KeyPressedEvent extends Event {

    private int key;

    public KeyPressedEvent(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }
}
