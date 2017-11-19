package de.ropemc;

import de.ropemc.Mappings.MCVersion;
import de.ropemc.event.EventManager;
import de.ropemc.event.instrumentation.InstrumentationEvent;
import de.ropemc.mods.ModManager;
import de.ropemc.utils.VersionFile;

import java.io.File;
import java.lang.instrument.Instrumentation;

public class RopeMC
{
	
	public static final Float ROPE_VERSION = 1.0F;
	public static MCVersion version;
	public static File rope_directory;
	public static File rope_mods_directory;
	public static File rope_config_directory;
	public static File rope_mappings_directory;
	public static VersionFile versions;
	
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
		rope_mappings_directory = new File(rope_directory, "Mappings");
		if(!rope_mappings_directory.exists()) rope_mappings_directory.mkdir();
		versions = new VersionFile(new File(rope_directory,"versions.json"));
		Mappings.load();
		ModManager.loadModules(rope_mods_directory);
		EventManager.callEvent(new InstrumentationEvent(instrumentation));
		instrumentation.addTransformer(new Transformer());
	}
	
}
