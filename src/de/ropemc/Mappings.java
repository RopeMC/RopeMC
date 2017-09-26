package de.ropemc;

import java.io.File;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

import de.ropemc.utils.Mapping;
import de.ropemc.utils.UpdateGUI;
import de.ropemc.utils.Utils;

public class Mappings {
	
	private static Mapping mapping = null;

	public static void load()
	{
		long github_version = Utils.convertGitHubTimestamp(Utils.getGitHubPushedAt("RopeMC","MinecraftMappings"));
		if(github_version>RopeMC.versions.getMappings())
		{
			update();
			RopeMC.versions.setMappings(github_version);
		}
		File file = new File(RopeMC.rope_mappings_directory,RopeMC.version+".srg");
		mapping = new Mapping(file);
	}

	public static void update() {
		try {
			for(MCVersion version : MCVersion.values()) {
				File file = new File(RopeMC.rope_mappings_directory,version+".srg");
				if (file.exists())
				{
					file.delete();
				}
				URL github = new URL("https://raw.githubusercontent.com/RopeMC/MinecraftMappings/master/" + version.toString().substring(2).replace("_", ".") + "/mcp2obf.srg");
				ReadableByteChannel rbc = Channels.newChannel(github.openStream());
				UpdateGUI.createGUI();
				FileOutputStream fos = new FileOutputStream(file);
				fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
				UpdateGUI.frame.setVisible(false);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
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
	
    public enum MCVersion {
        MC1_8_8
    }

}
