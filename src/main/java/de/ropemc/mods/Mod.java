package de.ropemc.mods;

import de.ropemc.RopeMC;

import java.io.File;

public abstract class Mod
{
	private ModDescription description;
	protected void setDescription(ModDescription description)
	{
		this.description=description;
	}
	public ModDescription getDescription()
	{
		return description;
	}
	public String getName()
	{
		return description.getName();
	}
	public String getVersion()
	{
		return description.getVersion();
	}
	public File getDataFolder()
	{
		File f = new File(RopeMC.ropeModDataDirectory, getName());
		if(!f.exists())f.mkdir();
		return f;
	}
	public void onEnable(){}
	public void onDisable(){}
	
}
