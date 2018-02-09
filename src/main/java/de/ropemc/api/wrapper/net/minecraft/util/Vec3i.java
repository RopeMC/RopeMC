package de.ropemc.api.wrapper.net.minecraft.util;

import de.ropemc.Mappings;

import java.lang.reflect.Method;

public class Vec3i
{

    public static final String CLASSNAME = "net.minecraft.util.Vec3i";

    private static Class thisClass;

    private static Method getXMethod;
    private static Method getYMethod;
    private static Method getZMethod;

    static
    {
        try
        {
            thisClass = Class.forName(Mappings.getClassName(CLASSNAME));
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    static
    {
        try
        {
            Class thisClass = Class.forName(CLASSNAME);
            getXMethod = thisClass.getDeclaredMethod(Mappings.getMethodName(CLASSNAME, "getX"));
            getXMethod.setAccessible(true);
            getYMethod = thisClass.getDeclaredMethod(Mappings.getMethodName(CLASSNAME, "getY"));
            getYMethod.setAccessible(true);
            getZMethod = thisClass.getDeclaredMethod(Mappings.getMethodName(CLASSNAME, "getZ"));
            getZMethod.setAccessible(true);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public static Vec3i castFrom(BlockPos from)
    {
        return new Vec3i(thisClass.cast(from.getHandle()));
    }

    private Object handle;

    public Object getHandle()
    {
        return handle;
    }

    public Vec3i(Object handle)
    {
        this.handle = handle;
    }

    public int getX()
    {
        try
        {
            return (int) getXMethod.invoke(getHandle());
        }
        catch (Exception ex)
        {
        }
        return 0;
    }

    public int getY()
    {
        try
        {
            return (int) getYMethod.invoke(getHandle());
        }
        catch (Exception ex)
        {
        }
        return 0;
    }

    public int getZ()
    {
        try
        {
            return (int) getZMethod.invoke(getHandle());
        }
        catch (Exception ex)
        {
        }
        return 0;
    }

}
