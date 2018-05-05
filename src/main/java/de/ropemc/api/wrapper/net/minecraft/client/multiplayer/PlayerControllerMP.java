package de.ropemc.api.wrapper.net.minecraft.client.multiplayer;

import de.ropemc.Mappings;
import de.ropemc.api.wrapper.net.minecraft.entity.Entity;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;

import java.lang.reflect.Method;

public class PlayerControllerMP
{

    public static final String CLASSNAME = "net.minecraft.client.multiplayer.PlayerControllerMP";

    private static Method attackEntityMethod;

    static
    {
        try
        {
            Class thisClass = Class.forName(Mappings.getClassName(CLASSNAME));
            Class entityClass = Class.forName(Mappings.getClassName(Entity.CLASSNAME));
            Class entityPlayerClass = Class.forName(Mappings.getClassName(EntityPlayer.CLASSNAME));
            attackEntityMethod = thisClass.getDeclaredMethod(Mappings.getMethodName(CLASSNAME, "attackEntity"), entityPlayerClass, entityClass);
            attackEntityMethod.setAccessible(true);
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

    public PlayerControllerMP(Object handle)
    {
        this.handle = handle;
    }
}
