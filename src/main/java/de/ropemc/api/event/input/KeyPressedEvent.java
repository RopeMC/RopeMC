package de.ropemc.api.event.input;

import de.ropemc.api.event.Event;

public class KeyPressedEvent extends Event {

    private int key;

    public KeyPressedEvent(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }
}
