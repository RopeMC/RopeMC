package de.ropemc.api.wrapper.net.minecraft.client.multiplayer;

import de.ropemc.api.wrapper.net.minecraft.world.World;

import java.util.List;

public class WorldClient {

    public static final String CLASSNAME = "net.minecraft.client.multiplayer";

    private Object handle;

    public Object getHandle() {
        return handle;
    }

    public WorldClient(Object handle)
    {
        this.handle=handle;
    }

    public List getLoadedEntityList()
    {
        return World.castFrom(this).getLoadedEntityList();
    }

}
