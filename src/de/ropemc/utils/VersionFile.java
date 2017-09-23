package de.ropemc.utils;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class VersionFile
{
	
	private File file;
	private JsonParser parser;
	private long mappings;
	
	public VersionFile(File file)
	{
		this.file=file;
		mappings=0;
	}
	
	protected JsonObject read()
	{
		try {
			JsonElement e = parser.parse(new FileReader(file));
			if(e!=null)
			{
				if(e.isJsonObject())
				{
					return e.getAsJsonObject();
				}
			}
		}catch(Exception ex){}
		return new JsonObject();
	}
	
	protected void write(JsonObject object)
	{
		try
		{
			FileWriter fr = new FileWriter(file);
			fr.write(object.toString());
			fr.flush();
			fr.close();
		}
		catch(IOException e)
		{
		}
	}
	
}
