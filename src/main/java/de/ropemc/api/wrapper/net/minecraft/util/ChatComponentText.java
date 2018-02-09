package de.ropemc.api.wrapper.net.minecraft.util;

import de.ropemc.Mappings;

import java.lang.reflect.Constructor;

public class ChatComponentText
{

    public static final String CLASSNAME = "net.minecraft.util.ChatComponentText";
    private static Constructor stringConstructor;

    static
    {
        try
        {
            Class thisClass = Class.forName(Mappings.getClassName(CLASSNAME));
            stringConstructor = thisClass.getDeclaredConstructor(String.class);
            stringConstructor.setAccessible(true);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    private Object handle;

    public Object getHandle()
    {
        return handle;
    }

    public ChatComponentText(Object handle)
    {
        this.handle = handle;
    }

    public ChatComponentText(String text)
    {
        try
        {
            this.handle = stringConstructor.newInstance(text);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

}
