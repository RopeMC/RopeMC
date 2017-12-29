package de.ropemc.api.event;

public interface Cancellable
{
	
	public boolean isCancelled();
	public void setCancelled(boolean cancelled);
	
}
