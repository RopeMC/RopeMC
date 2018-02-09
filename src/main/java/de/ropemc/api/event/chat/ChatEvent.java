package de.ropemc.api.event.chat;

import de.ropemc.api.event.Cancellable;
import de.ropemc.api.event.Event;

public class ChatEvent extends Event implements Cancellable
{

    private boolean cancelled = false;
    private String message;

    public ChatEvent(String msg)
    {
        message = msg;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    @Override
    public boolean isCancelled()
    {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled)
    {
        this.cancelled = cancelled;
    }
}
