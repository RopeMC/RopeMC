package de.ropemc.event.player;

import de.ropemc.event.Cancellable;
import de.ropemc.event.Event;

public class ChatReceiveEvent extends Event implements Cancellable
{

    private boolean cancelled = false;
    private String message;

    public ChatReceiveEvent(String message)
    {
        this.message = message;
        System.out.println("Event Nachricht: " + message);
    }

    public String getMessage()
    {
        return message;
    }

    @Deprecated
    public void setMessage(String message)
    {
        this.message=message;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled=cancelled;
    }
}
