package de.ropemc.api.wrapper.net.minecraft.util;

import de.ropemc.Mappings;

public class BlockPos
{

    public static final String CLASSNAME = "net.minecraft.util.BlockPos";

    static
    {
        try
        {
            Class thisClass = Class.forName(Mappings.getClassName(CLASSNAME));

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

    public BlockPos(Object handle)
    {
        this.handle = handle;
    }

    public int getX()
    {
        return Vec3i.castFrom(this).getX();
    }

    public int getY()
    {
        return Vec3i.castFrom(this).getY();
    }

    public int getZ()
    {
        return Vec3i.castFrom(this).getZ();
    }

}
