package de.ropemc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.File;

import de.ropemc.utils.Mapping;

public class Mappings {
	
	private static Mapping mapping;
	
	static {
		mapping = new Mapping(new File(RopeMC.rope_mappings_directory.toPath() + "/MC1_8_8.srg"));
	}
	
	public static String getClassName(String clazz)
	{
		return mapping.getClassName(clazz);
	}
	
	public static String getFieldName(String clazz,String field)
	{
		return mapping.getFieldName(clazz, field);
	}
	
	public static String getMethodName(String clazz,String method)
	{
		return mapping.getMethodName(clazz, method);
	}
	
    public static enum MCVersion {
        MC1_8_8
    }

}
