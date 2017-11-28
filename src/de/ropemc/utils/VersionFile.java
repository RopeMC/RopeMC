package de.ropemc.utils;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.*;

public class VersionFile
{
	
	private File file;
	private JsonParser parser;
	private Gson gson;
	private long mappings;
	
	public VersionFile(File file)
	{
		parser = new JsonParser();
		gson = new GsonBuilder().setPrettyPrinting().create();
		this.file=file;
		mappings=0;
		if(!file.exists())
		{
			try
			{
				file.createNewFile();
			}
			catch(Exception ex){}
			save();
		}
		load();
	}

	public void setMappings(long mappings)
	{
		this.mappings=mappings;
		save();
	}

	public long getMappings()
	{
		return this.mappings;
	}

	public void save()
	{
		JsonObject root = new JsonObject();
		root.addProperty("mappings",mappings);
		write(root);
	}

	public void load()
	{
		JsonObject root = read();
		if(root!=null)
		{
			if(root.has("mappings"))mappings=root.get("mappings").getAsLong();
		}
	}

	protected JsonObject read()
	{
		try
		{
			JsonElement e = parser.parse(new FileReader(file));
			if(e!=null)
			{
				if(e.isJsonObject())
				{
					return e.getAsJsonObject();
				}
			}
		}
		catch(Exception ex){}
		return new JsonObject();
	}
	
	protected void write(JsonObject object)
	{
		try
		{
			FileWriter fr = new FileWriter(file);
			fr.write(gson.toJson(object));
			fr.flush();
			fr.close();
		}
		catch(IOException e) {}
	}
}
