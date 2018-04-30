package de.ropemc.api.wrapper.net.minecraft.entity.player;

import de.ropemc.Mappings;
import de.ropemc.api.wrapper.net.minecraft.client.entity.EntityPlayerSP;

public class EntityPlayer
{

    public static final String CLASSNAME = "net.minecraft.entity.player.EntityPlayer";

    private Object handle;

    public Object getHandle()
    {
        return handle;
    }

    public EntityPlayer(Object handle)
    {
        this.handle = handle;
    }

//    public static EntityPlayer castFrom(EntityPlayerSP from)
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
//        return new EntityPlayer(thisClass.cast(from.getHandle()));
//    }

}
