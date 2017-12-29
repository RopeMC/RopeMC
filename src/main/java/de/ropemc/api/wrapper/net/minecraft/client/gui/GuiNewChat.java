package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.Mappings;
import de.ropemc.api.wrapper.net.minecraft.util.ChatComponentText;

import java.lang.reflect.Method;

public class GuiNewChat {

    private static Method printChatMessageMethod;

    static
    {
        try
        {
            Class thisClass = Class.forName(Mappings.getClassName("net.minecraft.client.gui.GuiNewChat"));
            Class chatComponentClass = Class.forName(Mappings.getClassName("net.minecraft.util.IChatComponent"));
            printChatMessageMethod = thisClass.getMethod(Mappings.getMethodName("net.minecraft.client.gui.GuiNewChat", "printChatMessage"),chatComponentClass);
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
