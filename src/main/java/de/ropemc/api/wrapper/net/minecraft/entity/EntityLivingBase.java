package de.ropemc.api.wrapper.net.minecraft.entity;

public class EntityLivingBase {

    public static final String CLASSNAME = "net.minecraft.entity.EntityLivingBase";

    private Object handle;

    public Object getHandle() {
        return handle;
    }

    public EntityLivingBase(Object handle)
    {
        this.handle=handle;
    }
}
