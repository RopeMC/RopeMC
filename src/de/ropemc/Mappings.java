package de.ropemc;

public class Mappings
{
	
	public static String getClassName(MCVersion version,String name)
	{
		switch(name)
		{
			case "net.minecraft.client.Minecraft":
				switch(version)
				{
					case MC1_8_8: return "ave";
				}
				break;
			case "net.minecraft.util.ChatComponentText":
				switch(version)
				{
					case MC1_8_8: return "fa";
				}
				break;
			case "net.minecraft.util.IChatComponent":
				switch(version)
				{
					case MC1_8_8: return "eu";
				}
				break;
		}
		return null;
	}
	
	public static String getFieldName(MCVersion version,String c,String f)
	{
		switch(c)
		{
			case "net.minecraft.client.Minecraft":
				switch(f)
				{
					case "launchedVersion":
						switch(version)
						{
							case MC1_8_8: return "al";
						}
					case "ingameGUI":
						switch(version)
						{
							case MC1_8_8: return "q";
						}
					case "theMinecraft":
						switch(version)
						{
							case MC1_8_8: return "S";
						}
				}
				break;
		}
		return null;
	}
	
	public static String getMethodName(MCVersion version,String c,String f)
	{
		switch(c)
		{
			case "net.minecraft.client.gui.GuiIngame":
				switch(f)
				{
					case "getChatGUI":
						switch(version)
						{
							case MC1_8_8: return "d";
						}
				}
				break;
			case "net.minecraft.client.gui.GuiNewChat":
				switch(f)
				{
					case "printChatMessage":
						switch(version)
						{
							case MC1_8_8: return "a";
						}
				}
				break;
		}
		return null;
	}
	
	public static enum MCVersion {
		MC1_8_8
	}
	
}