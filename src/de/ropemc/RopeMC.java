package de.ropemc;

import java.io.File;
import java.lang.instrument.Instrumentation;

import de.ropemc.api.Minecraft;
import de.ropemc.Mappings.MCVersion;
import de.ropemc.mods.ModManager;
import de.ropemc.utils.Mapping;

public class RopeMC
{
	
	public static final Float ROPE_VERSION = 1.0F;
	public static MCVersion version;
	public static File rope_directory;
	public static File rope_mods_directory;
	public static File rope_config_directory;
	public static File rope_Mappings_directory;
	
	public static void premain(String args, Instrumentation instrumentation)
	{

		version = MCVersion.MC1_8_8;
		//creating folders
		rope_directory = new File("RopeMC");
		if(!rope_directory.exists()) rope_directory.mkdir();
		rope_mods_directory = new File(rope_directory,"Mods");
		if(!rope_mods_directory.exists()) rope_mods_directory.mkdir();
		rope_config_directory = new File(rope_directory,"Config");
		if(!rope_config_directory.exists()) rope_config_directory.mkdir();
		rope_Mappings_directory = new File(rope_directory, "Mappings");
		if(!rope_Mappings_directory.exists()) rope_Mappings_directory.mkdir();

		System.out.println("Downloading Mappings...");
		Mapping.download();
		System.out.println("Downloading Completed !");

		ModManager.loadModules(rope_mods_directory);
		instrumentation.addTransformer(new Transformer());
	}
	
}
