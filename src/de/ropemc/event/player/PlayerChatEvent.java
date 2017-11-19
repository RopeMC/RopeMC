package de.ropemc.event.player;

import de.ropemc.event.Cancellable;
import de.ropemc.event.Event;

public class PlayerChatEvent extends Event implements Cancellable{

    private boolean cancelled = false;
    private String message;

    public PlayerChatEvent(String msg) {
        message = msg;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
}
