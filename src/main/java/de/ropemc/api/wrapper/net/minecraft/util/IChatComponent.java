package de.ropemc.api.wrapper.net.minecraft.util;

public class IChatComponent {

    public static final String CLASSNAME = "net.minecraft.util.IChatComponent";

    private Object handle;

    public Object getHandle() {
        return handle;
    }

    public IChatComponent(Object handle)
    {
        this.handle=handle;
    }
}
