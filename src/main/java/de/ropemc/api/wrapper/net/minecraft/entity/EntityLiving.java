package de.ropemc.api.wrapper.net.minecraft.entity;

public class EntityLiving
{

    public static final String CLASSNAME = "net.minecraft.entity.EntityLiving";

    private Object handle;

    public Object getHandle()
    {
        return handle;
    }

    public EntityLiving(Object handle)
    {
        this.handle = handle;
    }
}
