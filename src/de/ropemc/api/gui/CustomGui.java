package de.ropemc.api.gui;

import de.ropemc.Mappings;

public class CustomGui
{

    private static Class guiScreen;

    private Object instance;

    static
    {
        try
        {
            guiScreen = Class.forName(Mappings.getClassName("net.minecraft.client.gui.GuiScreen"));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public CustomGui()
    {
        try
        {
            instance = guiScreen.newInstance();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
