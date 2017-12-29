package de.ropemc.api.wrapper.net.minecraft.client.gui;

import de.ropemc.Mappings;

import java.lang.reflect.Method;

public class GuiIngame {

    private static Method getChatGUIMethod;

    static {
        try {
            Class thisClass = Class.forName(Mappings.getClassName("net.minecraft.client.gui.GuiIngame"));
            getChatGUIMethod = thisClass.getDeclaredMethod(Mappings.getMethodName("net.minecraft.client.gui.GuiIngame", "getChatGUI"));
            getChatGUIMethod.setAccessible(true);
        }catch(Exception ex){ex.printStackTrace();}
    }

    private Object handle;

    public Object getHandle() {
        return handle;
    }

    public GuiIngame(Object handle)
    {
        this.handle=handle;
    }

    public GuiNewChat getChatGUI() {
        try
        {
            Object guiHandle = getChatGUIMethod.invoke(getHandle());
            return new GuiNewChat(guiHandle);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
