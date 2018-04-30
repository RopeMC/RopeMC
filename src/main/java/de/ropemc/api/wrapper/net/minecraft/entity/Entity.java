package de.ropemc.api.wrapper.net.minecraft.entity;

import de.ropemc.Mappings;
import de.ropemc.api.wrapper.net.minecraft.client.entity.EntityPlayerSP;
import de.ropemc.api.wrapper.net.minecraft.entity.player.EntityPlayer;

public class Entity
{

    public static final String CLASSNAME = "net.minecraft.entity.Entity";

    private Object handle;

    public Object getHandle()
    {
        return handle;
    }

    public Entity(Object handle)
    {
        this.handle = handle;
    }

//    public static Entity castFrom(EntityPlayerSP from)
//    {
//        Class thisClass = null;
//        try
//        {
//            thisClass = Class.forName(Mappings.getClassName(CLASSNAME));
//        }
//        catch (ClassNotFoundException e)
//        {
//            e.printStackTrace();
//        }
//        return new Entity(thisClass.cast(from.getHandle()));
//    }

    public static Entity castFrom(EntityPlayer from)
    {
        Class thisClass = null;
        try
        {
            thisClass = Class.forName(Mappings.getClassName(CLASSNAME));
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return new Entity(thisClass.cast(from.getHandle()));
    }
}
