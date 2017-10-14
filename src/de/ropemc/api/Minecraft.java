package de.ropemc.api;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

import de.ropemc.Mappings;
import de.ropemc.utils.Utils;

public class Minecraft
{

    private static Field minecraft;
    private static Field launchedVersion;

    private static Class<?> chatComponentText;
    private static Field ingameGui;
    private static Method getChatGui;
    private static Method printChatMessage;
    private static Object chatGui;

    static {
        try {
            minecraft = Class.forName(Mappings.getClassName("net.minecraft.client.Minecraft")).getDeclaredField(Mappings.getFieldName("net.minecraft.client.Minecraft","theMinecraft"));
            minecraft.setAccessible(true);

            launchedVersion = Class.forName(Mappings.getClassName("net.minecraft.client.Minecraft")).getDeclaredField(Mappings.getFieldName("net.minecraft.client.Minecraft","launchedVersion"));
            launchedVersion.setAccessible(true);

            chatComponentText = Class.forName(Mappings.getClassName("net.minecraft.util.ChatComponentText"));

            ingameGui = getMinecraft().getClass().getDeclaredField(Mappings.getFieldName("net.minecraft.client.Minecraft", "ingameGUI"));
            ingameGui.setAccessible(true);

            getChatGui = ingameGui.getType().getDeclaredMethod(Mappings.getMethodName("net.minecraft.client.gui.GuiIngame", "getChatGUI"));
            getChatGui.setAccessible(true);

            chatGui = getChatGui.invoke(ingameGui.get(getMinecraft()));

            printChatMessage = chatGui.getClass().getDeclaredMethod(Mappings.getMethodName("net.minecraft.client.gui.GuiNewChat", "printChatMessage"), Class.forName(Mappings.getClassName("net.minecraft.util.IChatComponent")));
            printChatMessage.setAccessible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	public static void setWindowTitle(String title)
	{
		try
		{
			Field f1 = Class.forName("org.lwjgl.opengl.Display").getDeclaredField("display_impl");
			f1.setAccessible(true);
			Method m = f1.getType().getDeclaredMethod("setTitle", String.class);
			m.setAccessible(true);
			m.invoke(f1.get(null), title);
			Field f2 = Class.forName("org.lwjgl.opengl.Display").getDeclaredField("title");
			f2.setAccessible(true);
			f2.set(null, title);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static String getWindowTitle() {
		try {
			Field f = Class.forName("org.lwjgl.opengl.Display").getDeclaredField("title");
			f.setAccessible(true);
			return f.get(null).toString();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public static void setWindowIcon(InputStream icon1, InputStream icon2) {
		try {
			ByteBuffer[] bb = new ByteBuffer[] { Utils.readImageToBuffer(icon1), Utils.readImageToBuffer(icon2)};
			Method m = Class.forName("org.lwjgl.opengl.Display").getDeclaredMethod("setIcon", ByteBuffer.class);
			m.invoke(null, bb);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Object getMinecraft()
	{
		try {
            return minecraft.get(null);
        } catch (Exception e) {
		    e.printStackTrace();
        }
        return null;
	}
	
	public static String getMinecraftVersion() {
		try {
            return launchedVersion.get(getMinecraft()).toString();
        } catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void printChatMessage(String msg)
	{
		try {
			Object cc = Class.forName(Mappings.getClassName("net.minecraft.util.ChatComponentText")).getConstructor(String.class).newInstance(msg);
			Object mc = getMinecraft();
			Field f = mc.getClass().getDeclaredField(Mappings.getFieldName("net.minecraft.client.Minecraft", "ingameGUI"));
			f.setAccessible(true);
			Method m1 = f.getType().getDeclaredMethod(Mappings.getMethodName("net.minecraft.client.gui.GuiIngame", "getChatGUI"));
			Object chatgui = m1.invoke(f.get(mc));
			Method m2 = chatgui.getClass().getDeclaredMethod(Mappings.getMethodName("net.minecraft.client.gui.GuiNewChat", "printChatMessage"), Class.forName(Mappings.getClassName("net.minecraft.util.IChatComponent")));
			m2.invoke(chatgui, cc);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
