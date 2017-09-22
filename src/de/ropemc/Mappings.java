package de.ropemc;

import java.io.InputStream;

import de.ropemc.utils.Mapping;

public class Mappings {
	
	private static Mapping mapping;
	
	static {
		InputStream in = Mappings.class.getResourceAsStream("188.srg");
		mapping = new Mapping(in);
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
