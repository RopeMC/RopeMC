package de.ropemc.api;

import de.ropemc.Mappings;
import de.ropemc.utils.Utils;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

public class DeprecatedMinecraft
{

    private static Field minecraft;

    static
    {
        try
        {
            Class<?> mcClass = Class.forName(Mappings.getClassName("net.minecraft.client.Minecraft"));
            minecraft = mcClass.getDeclaredField(Mappings.getFieldName("net.minecraft.client.Minecraft", "theMinecraft"));
            minecraft.setAccessible(true);
        }
        catch (Exception e)
        {
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
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static String getWindowTitle()
    {
        try
        {
            Field f = Class.forName("org.lwjgl.opengl.Display").getDeclaredField("title");
            f.setAccessible(true);
            return f.get(null).toString();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public static void setWindowIcon(InputStream icon1, InputStream icon2)
    {
        try
        {
            ByteBuffer[] bb = new ByteBuffer[]{Utils.readImageToBuffer(icon1), Utils.readImageToBuffer(icon2)};
            Method m = Class.forName("org.lwjgl.opengl.Display").getDeclaredMethod("setIcon", ByteBuffer.class);
            m.invoke(null, bb);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static Object getMinecraft()
    {
        try
        {
            return minecraft.get(null);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

}
