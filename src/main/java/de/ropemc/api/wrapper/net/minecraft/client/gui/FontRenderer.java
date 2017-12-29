package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.Mappings;
import java.lang.reflect.Method;

public class FontRenderer {

    public static final String CLASSNAME = "net.minecraft.client.gui.FontRenderer";

    private static Method drawString;
    private static Method drawStringWithShadow;

    static
    {
        try
        {
            Class fontRendererClass = Class.forName(Mappings.getClassName(CLASSNAME));
            drawString = fontRendererClass.getDeclaredMethod(Mappings.getMethodName(CLASSNAME, "drawString"), String.class, float.class, float.class, int.class);
            drawString.setAccessible(true);
            drawStringWithShadow = fontRendererClass.getDeclaredMethod(Mappings.getMethodName(CLASSNAME, "drawStringWithShadow"), String.class, float.class, float.class, int.class);
            drawStringWithShadow.setAccessible(true);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private Object handle;

    public Object getHandle()
    {
        return handle;
    }

    public FontRenderer(Object handle)
    {
        this.handle=handle;
    }

    public void drawString(String text, float x, float y, int color)
    {
        try
        {
            drawString.invoke(getHandle(), text, x, y, color);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void drawStringWithShadow(String text, float x, float y, int color)
    {
        try
        {
            drawStringWithShadow.invoke(getHandle(), text, x, y, color);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
