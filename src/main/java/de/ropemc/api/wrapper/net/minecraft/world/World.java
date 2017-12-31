package de.ropemc.api.wrapper.net.minecraft.world;

import de.ropemc.Mappings;
import de.ropemc.api.wrapper.net.minecraft.client.multiplayer.WorldClient;

import java.lang.reflect.Method;
import java.util.List;

public class World {

    public static final String CLASSNAME = "net.minecraft.world.World";

    private static Class thisClass;
    private static Method getLoadedEntityListMethod;

    static {
        try {
            thisClass = Class.forName(Mappings.getClassName(CLASSNAME));
            getLoadedEntityListMethod = thisClass.getDeclaredMethod(Mappings.getMethodName(CLASSNAME,"getLoadedEntityList"));
            getLoadedEntityListMethod.setAccessible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static World castFrom(WorldClient from)
    {
        return new World(thisClass.cast(from.getHandle()));
    }

    private Object handle;

    public Object getHandle() {
        return handle;
    }

    public World(Object handle)
    {
        this.handle=handle;
    }

    public List getLoadedEntityList()
    {
        try {
            return (List)getLoadedEntityListMethod.invoke(getHandle());
        }catch(Exception ex){ex.printStackTrace();}
        return null;
    }

}
