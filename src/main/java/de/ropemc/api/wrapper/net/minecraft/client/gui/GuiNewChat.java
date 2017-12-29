package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.Mappings;
import de.ropemc.api.wrapper.net.minecraft.util.ChatComponentText;

import java.lang.reflect.Method;

public class GuiNewChat {

    public static final String CLASSNAME = "net.minecraft.client.gui.GuiNewChat";

    private static Method printChatMessageMethod;

    static
    {
        try
        {
            Class thisClass = Class.forName(Mappings.getClassName(CLASSNAME));
            Class chatComponentClass = Class.forName(Mappings.getClassName("net.minecraft.util.IChatComponent"));
            printChatMessageMethod = thisClass.getMethod(Mappings.getMethodName(CLASSNAME, "printChatMessage"),chatComponentClass);
            printChatMessageMethod.setAccessible(true);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private Object handle;

    public Object getHandle() {
        return handle;
    }

    public GuiNewChat(Object handle)
    {
        this.handle=handle;
    }

    public void printChatMessage(ChatComponentText message)
    {
        try
        {
            printChatMessageMethod.invoke(getHandle(),message.getHandle());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
