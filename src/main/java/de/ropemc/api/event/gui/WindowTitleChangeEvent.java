package de.ropemc.api.event.gui;

import de.ropemc.api.event.Cancellable;
import de.ropemc.api.event.Event;

public class WindowTitleChangeEvent extends Event implements Cancellable
{
	
	private String title;
	private boolean cancelled = false;
	
	public WindowTitleChangeEvent(String title)
	{
		this.title=title;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setTitle(String title)
	{
		this.title=title;
	}
	
	public boolean isCancelled()
	{
		return cancelled;
	}
	
	public void setCancelled(boolean cancelled)
	{
		this.cancelled=cancelled;
	}
	
}
